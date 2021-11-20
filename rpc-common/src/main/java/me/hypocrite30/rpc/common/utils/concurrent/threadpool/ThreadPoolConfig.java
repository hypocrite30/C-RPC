package me.hypocrite30.rpc.common.utils.concurrent.threadpool;

import lombok.Getter;
import lombok.Setter;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @Description: 创建线程池配置类
 * @Author: Hypocrite30
 * @Date: 2021/11/17 22:38
 */
@Getter
@Setter
public class ThreadPoolConfig {
    /**
     * ThreadPoolExecutor 线程池默认参数
     */
    private static final int DEFAULT_CORE_POOL_SIZE = 10;
    private static final int DEFAULT_MAXIMUM_POOL_SIZE = 100;
    private static final int DEFAULT_KEEP_ALIVE_TIME = 1;
    private static final TimeUnit DEFAULT_TIME_UNIT = TimeUnit.MINUTES;
    private static final int DEFAULT_BLOCKING_QUEUE_CAPACITY = 100;
    private static final int BLOCKING_QUEUE_CAPACITY = 100;

    /**
     * 可配置参数，不配置则使用默认值
     */
    private int corePoolSize = DEFAULT_CORE_POOL_SIZE;
    private int maximumPoolSize = DEFAULT_MAXIMUM_POOL_SIZE;
    private long keepAliveTime = DEFAULT_KEEP_ALIVE_TIME;
    private TimeUnit unit = DEFAULT_TIME_UNIT;

    /**
     * 有界队列
     */
    private BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<>(BLOCKING_QUEUE_CAPACITY);
}
