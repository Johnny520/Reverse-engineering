package p000;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: gj */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC0248gj implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f2000a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f2000a);
        thread.setPriority(10);
        return thread;
    }
}
