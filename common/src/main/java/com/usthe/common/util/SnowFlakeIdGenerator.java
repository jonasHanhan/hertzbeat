package com.usthe.common.util;

/**
 * Snowflake Algorithm Generator Tool
 * 雪花算法生成器工具
 *
 *
 *
 */
public class SnowFlakeIdGenerator {

    private final static SnowFlakeIdWorker ID_WORKER;

    static {
        ID_WORKER = new SnowFlakeIdWorker();
    }

    public static long generateId() {
        return ID_WORKER.nextId();
    }
}
