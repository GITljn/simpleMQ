1. PrintWriter中write与println方法的区别
- println相比write多一个换行，如果另一端使用readLine接收，由于读不到换行符，则会一直阻塞
2. 客户端和服务端都会使用到Socket，因为需要Socket进行通信
3. 放到try中的所有可以被关闭的都会关闭，因此也会关闭Socket
