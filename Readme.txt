  客户端与服务器端通讯过程分为两步：
  1.	客户端向 http://localhost:8080/ 发送 http 请求，请求类型为 GET，
  	Header 中的 Connection 属性为 keep-alive，此过程建立客户端与服务端的链接
  2.	客户端向服务端（地址为"ws://localhost:8080/websocket"）发起 WebSocket 链接，如：
  		 socket = new WebSocket("ws://localhost:8080/websocket");
  	之后每次客户端向服务端发送消息后，即可广播到其他客户端。
  	客户端具体处理代码参见不同平台的 WebSocket 实现


