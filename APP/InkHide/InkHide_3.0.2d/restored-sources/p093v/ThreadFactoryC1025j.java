package p093v;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: v.j */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC1025j implements ThreadFactory {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C1024i(runnable);
    }
}
