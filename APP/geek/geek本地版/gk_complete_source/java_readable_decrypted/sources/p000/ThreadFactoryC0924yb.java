package p000;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: yb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0924yb implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f5304a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f5304a);
        thread.setPriority(10);
        return thread;
    }
}
