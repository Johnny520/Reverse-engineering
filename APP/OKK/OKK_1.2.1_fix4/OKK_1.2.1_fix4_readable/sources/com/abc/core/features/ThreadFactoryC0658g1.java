package com.abc.core.features;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: c0.g1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0658g1 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2043a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f2043a) {
            case 0:
                Thread thread = new Thread(runnable, "okk-public-cfg");
                thread.setDaemon(true);
                return thread;
            case 1:
                Thread thread2 = new Thread(runnable, "achat-config-io");
                thread2.setDaemon(true);
                return thread2;
            default:
                Thread thread3 = new Thread(runnable, "achat-vloc-io");
                thread3.setDaemon(true);
                return thread3;
        }
    }
}
