package yyds;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: yyds.ᛵᛷᛱᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1134 extends AbstractC0974 implements InterfaceC2800 {

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5207 = AtomicIntegerFieldUpdater.newUpdater(C1134.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ long f5208 = AbstractC2112.f10448.objectFieldOffset(C1134.class.getDeclaredField("runningWorkers$volatile"));
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final Object f5209;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final AbstractC0974 f5210;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C0483 f5211;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final int f5212;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC2800 f5213;

    /* JADX WARN: Multi-variable type inference failed */
    public C1134(AbstractC0974 abstractC0974, int i) {
        InterfaceC2800 interfaceC2800 = abstractC0974 instanceof InterfaceC2800 ? (InterfaceC2800) abstractC0974 : null;
        this.f5213 = interfaceC2800 == null ? AbstractC2465.f12170 : interfaceC2800;
        this.f5210 = abstractC0974;
        this.f5212 = i;
        this.f5211 = new C0483();
        this.f5209 = new Object();
    }

    @Override // yyds.AbstractC0974
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5210);
        sb.append(".limitedParallelism(");
        return AbstractC0897.m1999(sb, this.f5212, ')');
    }

    /* JADX INFO: renamed from: ᛱᛸᲁᲇ, reason: contains not printable characters */
    public final Runnable m2326() {
        while (true) {
            Runnable runnable = (Runnable) this.f5211.m1340();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f5209) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5207;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f5211.m1339() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // yyds.InterfaceC2800
    /* JADX INFO: renamed from: ᛳᛸᛴᛶ */
    public final void mo1247(long j, C1853 c1853) {
        this.f5213.mo1247(j, c1853);
    }

    @Override // yyds.AbstractC0974
    /* JADX INFO: renamed from: ᛷᲇᛲᛱ */
    public final void mo1251(InterfaceC2213 interfaceC2213, Runnable runnable) {
        this.f5211.m1337(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5207;
        Unsafe unsafe = AbstractC2112.f10448;
        long j = f5208;
        if (unsafe.getIntVolatile(this, j) < this.f5212) {
            synchronized (this.f5209) {
                if (unsafe.getIntVolatile(this, j) >= this.f5212) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable runnableM2326 = m2326();
                if (runnableM2326 == null) {
                    return;
                }
                this.f5210.mo1251(this, new RunnableC2660(this, 6, runnableM2326));
            }
        }
    }

    @Override // yyds.InterfaceC2800
    /* JADX INFO: renamed from: ᛸᛸᛷᛱ */
    public final InterfaceC0970 mo1253(long j, RunnableC1993 runnableC1993, InterfaceC2213 interfaceC2213) {
        return this.f5213.mo1253(j, runnableC1993, interfaceC2213);
    }
}
