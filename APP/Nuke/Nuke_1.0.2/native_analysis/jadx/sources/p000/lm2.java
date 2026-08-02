package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lm2 extends AbstractC0560oy implements ko1 {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6197d = AtomicIntegerFieldUpdater.newUpdater(lm2.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c */
    public final long f6198c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public lm2(long j, lm2 lm2Var, int i) {
        super(lm2Var);
        this.f6198c = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // p000.AbstractC0560oy
    /* JADX INFO: renamed from: d */
    public final boolean mo2943d() {
        return f6197d.get(this) == mo2006g() && m3667c() != null;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2944f() {
        return f6197d.addAndGet(this, -65536) == mo2006g() && m3667c() != null;
    }

    /* JADX INFO: renamed from: g */
    public abstract int mo2006g();

    /* JADX INFO: renamed from: h */
    public abstract void mo2007h(int i, a20 a20Var);

    /* JADX INFO: renamed from: i */
    public final void m2945i() {
        if (f6197d.incrementAndGet(this) == mo2006g()) {
            m3668e();
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2946j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f6197d;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == mo2006g() && m3667c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
