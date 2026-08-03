package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public final class w {
    public static final java.util.concurrent.ThreadPoolExecutor a = null;
    private static final int b = 0;
    private static final int c = 0;
    private static final int d = 0;
    private static final int e = 30;
    private static final java.util.concurrent.ThreadFactory f = null;
    private static final java.util.concurrent.BlockingQueue<java.lang.Runnable> g = null;


    static {
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            com.tendcloud.tenddata.w.b = r0
            int r1 = r0 + (-1)
            r2 = 4
            int r1 = java.lang.Math.min(r1, r2)
            r2 = 2
            int r4 = java.lang.Math.max(r2, r1)
            com.tendcloud.tenddata.w.c = r4
            int r0 = r0 * r2
            r1 = 1
            int r5 = r0 + 1
            com.tendcloud.tenddata.w.d = r5
            com.tendcloud.tenddata.w$1 r10 = new com.tendcloud.tenddata.w$1
            r10.<init>()
            com.tendcloud.tenddata.w.f = r10
            java.util.concurrent.LinkedBlockingQueue r9 = new java.util.concurrent.LinkedBlockingQueue
            r0 = 128(0x80, float:1.8E-43)
            r9.<init>(r0)
            com.tendcloud.tenddata.w.g = r9
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
            r6 = 30
            r3 = r0
            r3.<init>(r4, r5, r6, r8, r9, r10)
            r0.allowCoreThreadTimeOut(r1)
            com.tendcloud.tenddata.w.a = r0
            return
    }

    public w() {
            r0 = this;
            r0.<init>()
            return
    }
}
