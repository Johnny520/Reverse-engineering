package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: Vj */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0928Vj implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final ThreadFactoryC0474L0 f2890a;

    /* JADX INFO: renamed from: b */
    public final String f2891b;

    /* JADX INFO: renamed from: c */
    public final C1456gf f2892c;

    /* JADX INFO: renamed from: d */
    public final boolean f2893d;

    /* JADX INFO: renamed from: e */
    public final AtomicInteger f2894e;

    public ThreadFactoryC0928Vj(ThreadFactoryC0474L0 threadFactoryC0474L0, String str, boolean z) {
        C1456gf c1456gf = C1456gf.f5161e;
        this.f2894e = new AtomicInteger();
        this.f2890a = threadFactoryC0474L0;
        this.f2891b = str;
        this.f2892c = c1456gf;
        this.f2893d = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        RunnableC0044B0 runnableC0044B0 = new RunnableC0044B0(3, this, runnable);
        this.f2890a.getClass();
        C0885Uj c0885Uj = new C0885Uj(runnableC0044B0);
        c0885Uj.setName("glide-" + this.f2891b + "-thread-" + this.f2894e.getAndIncrement());
        return c0885Uj;
    }
}
