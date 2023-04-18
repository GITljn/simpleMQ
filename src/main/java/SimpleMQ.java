import java.util.concurrent.ArrayBlockingQueue;

public class SimpleMQ {
    private static final Integer maxNum = 3;
    private static final ArrayBlockingQueue<String> mq = new ArrayBlockingQueue<>(maxNum);

    public static void produce(String msg) {
        if (mq.offer(msg)) {
            System.out.println("[" + msg + "]" + "放入消息队列成功");
        } else {
            System.out.println("[" + msg + "]" + "放入消息队列失败: 消息队列已满");
        }
        System.out.println("===========================================");
    }

    public static String consume() {
        String msg = mq.poll();
        if (msg == null) {
            System.out.println("获取消息失败: 消息队列已空");
        } else {
            System.out.println("获取消息成功: " + msg);
        }
        System.out.println("===========================================");
        return msg;
    }
}
