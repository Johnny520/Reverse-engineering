package com.tendcloud.tenddata;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p001.C0167c4;

/* JADX INFO: renamed from: com.tendcloud.tenddata.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0129w {

    /* JADX INFO: renamed from: a */
    public static final ThreadPoolExecutor f620a;

    /* JADX INFO: renamed from: b */
    private static final int f621b;

    /* JADX INFO: renamed from: c */
    private static final int f622c;

    /* JADX INFO: renamed from: d */
    private static final int f623d;

    /* JADX INFO: renamed from: e */
    private static final int f624e = 30;

    /* JADX INFO: renamed from: f */
    private static final ThreadFactory f625f;

    /* JADX INFO: renamed from: g */
    private static final BlockingQueue<Runnable> f626g;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f621b = iAvailableProcessors;
        int iMax = Math.max(2, Math.min(iAvailableProcessors - 1, 4));
        f622c = iMax;
        int i = (iAvailableProcessors * 2) + 1;
        f623d = i;
        ThreadFactory threadFactory = new ThreadFactory() { // from class: com.tendcloud.tenddata.w.1
            private final AtomicInteger mCount = new AtomicInteger(1);

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                StringBuilder sbM1039 = C0167c4.m1039("ThreadPoolUtils #");
                sbM1039.append(this.mCount.getAndIncrement());
                return new Thread(runnable, sbM1039.toString());
            }
        };
        f625f = threadFactory;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(128);
        f626g = linkedBlockingQueue;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iMax, i, 30L, TimeUnit.SECONDS, linkedBlockingQueue, threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f620a = threadPoolExecutor;
    }
}
