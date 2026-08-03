package io.sentry;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: io.sentry.J */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC1594J implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5753a;

    /* JADX INFO: renamed from: b */
    public int f5754b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f5753a) {
            case 0:
                StringBuilder sb = new StringBuilder("SentryHostnameCache-");
                int i = this.f5754b;
                this.f5754b = i + 1;
                sb.append(i);
                Thread thread = new Thread(runnable, sb.toString());
                thread.setDaemon(true);
                return thread;
            case 1:
                StringBuilder sb2 = new StringBuilder("SentryExecutorServiceThreadFactory-");
                int i2 = this.f5754b;
                this.f5754b = i2 + 1;
                sb2.append(i2);
                Thread thread2 = new Thread(runnable, sb2.toString());
                thread2.setDaemon(true);
                return thread2;
            case 2:
                StringBuilder sb3 = new StringBuilder("SentryReplayIntegration-");
                int i3 = this.f5754b;
                this.f5754b = i3 + 1;
                sb3.append(i3);
                Thread thread3 = new Thread(runnable, sb3.toString());
                thread3.setDaemon(true);
                return thread3;
            case 3:
                StringBuilder sb4 = new StringBuilder("SentryReplayPersister-");
                int i4 = this.f5754b;
                this.f5754b = i4 + 1;
                sb4.append(i4);
                Thread thread4 = new Thread(runnable, sb4.toString());
                thread4.setDaemon(true);
                return thread4;
            default:
                StringBuilder sb5 = new StringBuilder("SentryAsyncConnection-");
                int i5 = this.f5754b;
                this.f5754b = i5 + 1;
                sb5.append(i5);
                Thread thread5 = new Thread(runnable, sb5.toString());
                thread5.setDaemon(true);
                return thread5;
        }
    }
}
