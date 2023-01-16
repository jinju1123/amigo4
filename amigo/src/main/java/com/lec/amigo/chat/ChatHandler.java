package com.lec.amigo.chat;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Qualifier;
import javax.websocket.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.lec.amigo.chat.JDBCUtility.JDBCUtility;
import com.lec.amigo.dao.ChatDAO;
import com.lec.amigo.vo.ChatRoom;
import com.lec.amigo.vo.UserVO;

public class ChatHandler extends TextWebSocketHandler{
	
	private static List<WebSocketSession> sessions = new ArrayList();
	
	//세션구별용
	
//	private Map<String, WebSocketSession> userSessions = new HashMap();
	
	//private Map<ChatRoom, WebSocketSession> indexSessions = new HashMap();
	

	ChatDAO chatDao = new ChatDAO();
	
	//private static final Logger logger = LoggerFactory.getLogger(ChatServer.class);
	//ChatDAO chatDao = new ChatDAO();
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		System.out.println("서버연결");	
		//세션리스트에 세션저장
		sessions.add(session);
		//유저-세션 저장
		chatDao.setRoom(session, getSessionIndex(session));
		
		JDBCUtility.getDDD();
		
	}
	
	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		System.out.println("메세지");
		System.out.println(message);
		
		String senderId = getSesID(session);
		String msg = message.getPayload();
		
		
		String no=null;
		int roomIndex=0;
		String sendUser=null;
		String text=null;
		
		
		String[] strs = msg.split("#");
		
		if(strs!=null && strs.length==3) {
				no = strs[0];
				sendUser =strs[1];
				roomIndex = Integer.parseInt(strs[2]);
		}else if(strs!=null && strs.length==4) {
				no = strs[0];
				sendUser =strs[1];
				text = strs[2];
				roomIndex = Integer.parseInt(strs[3]);
				
		}		
		
		System.out.println(no+"노값!");
		
		
		
		//String id = chatDao.getSessionId(roomIndex);
		 
		
	
		int index=getSessionIndex(session);
		
		System.out.println("인덱스입니다"+index);
		
		if (no.equals("1")) {
			// 누군가 접속 > 1#아무개
			
			//for(String id:idList) {
				for (WebSocketSession s : sessions) {
					
					System.out.println("세션의 아이디 확인용"+s.getId());
			//		if(s.getId().equals(id)) {
						if (s != session) { // 현재 접속자가 아닌 나머지 사람들				
							try {
								
								int index2 = chatDao.getRoomIndex(s.getId());
								
								if(index==index2) {
								
								s.sendMessage(new TextMessage("1#" + sendUser + "#"));
								}
								
								
										
								//s.getBasicRemote().sendText();
							} catch (IOException e) {
								e.printStackTrace();
							}
					
					}
				}
				//}
			//}
			
				
			
		} else if (no.equals("2")) {
			chatDao.insertChat(roomIndex, sendUser, text);
		//	for(String id:idList) {			
			// 누군가 메세지를 전송
			for (WebSocketSession s : sessions) {
				

					if (s != session) { // 현재 접속자가 아닌 나머지 사람들							
						try {
							System.out.println("2#" + senderId + ":" + text);
							
							//세션아이디로 인덱스를 구하고,
							//해당인덱스와 일치하면 문자를 보내면됨
							
							int index2 = chatDao.getRoomIndex(s.getId());
							
							System.out.println("인덱스1:"+index+"인덱스2:"+index2);
							
							if(index==index2) {
								s.sendMessage(new TextMessage("2#" + sendUser +"#" + text));
							}			
							//s.getBasicRemote().sendText("2#" + snderId +"#" + text);
						} catch (IOException e) {
							e.printStackTrace();
						}
			
					//}
				}
				
			//}
			}
		} else if (no.equals("3")) {
			
			System.out.println("호히히히");
			//for(String id:idList) {
			// 누군가 접속 > 3#아무개
				for (WebSocketSession s : sessions) {
					
				//	if(id.equals(s.getId())) {
						if (s != session) { // 현재 접속자가 아닌 나머지 사람들
							try {
								
								int index2 = chatDao.getRoomIndex(s.getId());
								if(index==index2) {
								s.sendMessage(new TextMessage("3#" + sendUser + "#"));
								}
//								s.getBasicRemote().sendText("3#" + user + "#");
							} catch (IOException e) {
								e.printStackTrace();
							}
						}	
					//}
				}
				sessions.remove(session);
			}
		
			
		}


	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		
		System.out.println(status.toString());
		
		
		System.out.println("닫혀용!");
	}
	
	public String getSesID(WebSocketSession session) {
		Map<String, Object> httpSession = session.getAttributes();
		UserVO user = (UserVO)httpSession.get("user");		
		if(user!=null) {
			System.out.println(user.getId()+"유저입니다");
			return user.getId();
		}
		//UserVO loginUser = (UserVO)httpSession.get("한준호");
		
		//if(loginUser!=null) {
			//return session.getId();
		//}else 
		return session.getId();
		
	}
	
	
	public int getSessionIndex(WebSocketSession session) {
		Map<String, Object> httpSession = session.getAttributes();
		ChatRoom index = (ChatRoom)httpSession.get("chatRoom");
	
		if(index.getChat_index()>0) {
		
			return index.getChat_index();
		}else {
			System.out.println("인덱스 조회 실패!");
			return 0;
			
		}
		
		
		
		
	}
}
