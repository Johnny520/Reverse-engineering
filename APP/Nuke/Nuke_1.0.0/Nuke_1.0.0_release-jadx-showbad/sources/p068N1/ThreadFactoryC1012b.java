package p068N1;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: N1.b */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC1012b implements ThreadFactory {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.ThreadFactory
    public final synchronized Thread newThread(Runnable runnable) {
        Thread thread;
        thread = new Thread(runnable, "glide-disk-lru-cache-thread");
        thread.setPriority(1);
        return thread;
    }
}
