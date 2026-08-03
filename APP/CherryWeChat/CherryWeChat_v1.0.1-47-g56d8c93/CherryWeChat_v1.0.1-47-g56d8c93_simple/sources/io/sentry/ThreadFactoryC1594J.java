package io.sentry;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: io.sentry.J */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC1594J implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5753a;

    /* JADX INFO: renamed from: b */
    public int f5754b;

    public /* synthetic */ ThreadFactoryC1594J(int r1) {
        this.f5753a = r1;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r5) {
        switch(this.f5753a) {
            case 0: goto L12;
            case 1: goto L10;
            case 2: goto L8;
            case 3: goto L6;
            default: goto L4;
        };
    L4:
        StringBuilder r1 = new StringBuilder("SentryAsyncConnection-");
        int r2 = this.f5754b;
        this.f5754b = r2 + 1;
        r1.append(r2);
        Thread r0 = new Thread(r5, r1.toString());
        r0.setDaemon(true);
        return r0;
    L6:
        StringBuilder r12 = new StringBuilder("SentryReplayPersister-");
        int r22 = this.f5754b;
        this.f5754b = r22 + 1;
        r12.append(r22);
        Thread r02 = new Thread(r5, r12.toString());
        r02.setDaemon(true);
        return r02;
    L8:
        StringBuilder r13 = new StringBuilder("SentryReplayIntegration-");
        int r23 = this.f5754b;
        this.f5754b = r23 + 1;
        r13.append(r23);
        Thread r03 = new Thread(r5, r13.toString());
        r03.setDaemon(true);
        return r03;
    L10:
        StringBuilder r14 = new StringBuilder("SentryExecutorServiceThreadFactory-");
        int r24 = this.f5754b;
        this.f5754b = r24 + 1;
        r14.append(r24);
        Thread r04 = new Thread(r5, r14.toString());
        r04.setDaemon(true);
        return r04;
    L12:
        StringBuilder r15 = new StringBuilder("SentryHostnameCache-");
        int r25 = this.f5754b;
        this.f5754b = r25 + 1;
        r15.append(r25);
        Thread r05 = new Thread(r5, r15.toString());
        r05.setDaemon(true);
        return r05;
    }
}
