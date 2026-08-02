package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zp0 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final ThreadFactoryC0949z4 f14002a;

    /* JADX INFO: renamed from: b */
    public final String f14003b;

    /* JADX INFO: renamed from: c */
    public final gd3 f14004c;

    /* JADX INFO: renamed from: d */
    public final boolean f14005d;

    /* JADX INFO: renamed from: e */
    public final AtomicInteger f14006e;

    public zp0(ThreadFactoryC0949z4 threadFactoryC0949z4, String str, boolean z) {
        gd3 gd3Var = gd3.f3446x;
        this.f14006e = new AtomicInteger();
        this.f14002a = threadFactoryC0949z4;
        this.f14003b = str;
        this.f14004c = gd3Var;
        this.f14005d = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        yp0 yp0Var = new yp0(this, runnable, 0);
        this.f14002a.getClass();
        C0809vg c0809vg = new C0809vg(yp0Var);
        c0809vg.setName("glide-" + this.f14003b + "-thread-" + this.f14006e.getAndIncrement());
        return c0809vg;
    }
}
