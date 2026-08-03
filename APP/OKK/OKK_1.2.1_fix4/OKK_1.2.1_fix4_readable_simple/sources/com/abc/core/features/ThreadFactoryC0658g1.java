package com.abc.core.features;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: c0.g1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0658g1 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2043a;

    public /* synthetic */ ThreadFactoryC0658g1(int r1) {
        this.f2043a = r1;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r3) {
        switch(this.f2043a) {
            case 0: goto L8;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        Thread r02 = new Thread(r3, "achat-vloc-io");
        r02.setDaemon(true);
        return r02;
    L6:
        Thread r03 = new Thread(r3, "achat-config-io");
        r03.setDaemon(true);
        return r03;
    L8:
        Thread r04 = new Thread(r3, "okk-public-cfg");
        r04.setDaemon(true);
        return r04;
    }
}
