package p000A;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: A.n */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0013n implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public String f36a;

    /* JADX INFO: renamed from: b */
    public int f37b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new C0012m(runnable, this.f36a, this.f37b);
    }
}
