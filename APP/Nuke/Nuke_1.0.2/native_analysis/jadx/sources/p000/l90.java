package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class l90 extends hd2 {

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5990l = AtomicIntegerFieldUpdater.newUpdater(l90.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // p000.hd2, p000.r21
    /* JADX INFO: renamed from: x */
    public final void mo1937x(Object obj) throws j90 {
        mo2146y(obj);
    }

    @Override // p000.hd2, p000.r21
    /* JADX INFO: renamed from: y */
    public final void mo2146y(Object obj) throws j90 {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f5990l;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    p40.m3706Q(gf1.m1908z(this.f3961k), fg1.m1619L(obj));
                    return;
                } else {
                    C0676s.m4653l("Already resumed");
                    return;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
