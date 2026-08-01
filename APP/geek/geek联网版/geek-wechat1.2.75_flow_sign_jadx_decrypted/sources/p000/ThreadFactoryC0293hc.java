package p000;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: hc */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0293hc implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f2216a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f2216a);
        thread.setPriority(10);
        return thread;
    }
}
