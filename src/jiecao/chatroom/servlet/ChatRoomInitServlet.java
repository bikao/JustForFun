package jiecao.chatroom.servlet;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import jiecao.chatroom.netty.webcoket.WebSocketServer;

/**
 * web 服务器启动时加载，初始化netty聊天室，开始监听
 * @author bikao
 */
public class ChatRoomInitServlet extends HttpServlet{
	private static final Logger logger = Logger.getLogger(ChatRoomInitServlet.class.getName());
	
	@Override
	public void init() throws ServletException  {
		try {
			WebSocketServer.getInstance();
		} catch(Exception e) {
			logger.log(Level.SEVERE, "Fail to init the chatroom server!");
			throw new ServletException();
		}
	}

}
