package p000a;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: a.dh */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0544dh implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "WXMaskPartInit");
        thread.setDaemon(true);
        return thread;
    }
}
