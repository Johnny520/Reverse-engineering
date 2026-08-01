package p102U1;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: U1.b */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC1472b implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C1471a(runnable);
    }
}
