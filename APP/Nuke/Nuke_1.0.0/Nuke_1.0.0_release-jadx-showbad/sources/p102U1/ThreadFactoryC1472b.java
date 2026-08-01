package p102U1;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: U1.b */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC1472b implements ThreadFactory {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C1471a(runnable);
    }
}
