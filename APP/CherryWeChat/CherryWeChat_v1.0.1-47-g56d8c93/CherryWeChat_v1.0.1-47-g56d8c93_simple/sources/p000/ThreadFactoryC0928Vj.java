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

    public ThreadFactoryC0928Vj(ThreadFactoryC0474L0 r3, String r4, boolean r5) {
        C1456gf r0 = C1456gf.f5161e;
        this.f2894e = new AtomicInteger();
        this.f2890a = r3;
        this.f2891b = r4;
        this.f2892c = r0;
        this.f2893d = r5;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable r3) {
        RunnableC0044B0 r0 = new RunnableC0044B0(3, this, r3);
        this.f2890a.getClass();
        C0885Uj r32 = new C0885Uj(r0);
        r32.setName("glide-" + this.f2891b + "-thread-" + this.f2894e.getAndIncrement());
        return r32;
    }
}
