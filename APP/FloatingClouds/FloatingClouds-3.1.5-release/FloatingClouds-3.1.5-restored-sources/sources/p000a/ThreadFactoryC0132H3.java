package p000a;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: a.H3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0132H3 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f441a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f441a);
        thread.setPriority(10);
        return thread;
    }
}
