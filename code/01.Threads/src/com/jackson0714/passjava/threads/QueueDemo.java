package com.jackson0714.passjava.threads;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TransferQueue;

/**
 * @Author: 悟空聊架构| PassJava666
 * @Date: 2020/9/5 13:32
 * @Site: www.jayh.club
 * @Github: https://github.com/Jackson0714
 */
public class QueueDemo {

    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(2);
        queue.add(100);
        queue.add(200);
        int a = queue.poll();

    }
}
