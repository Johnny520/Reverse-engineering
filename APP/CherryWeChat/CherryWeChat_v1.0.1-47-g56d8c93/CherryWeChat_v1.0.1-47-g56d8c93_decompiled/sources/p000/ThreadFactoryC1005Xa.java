package p000;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: Xa */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC1005Xa implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f3207a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f3207a);
        thread.setPriority(10);
        return thread;
    }
}
