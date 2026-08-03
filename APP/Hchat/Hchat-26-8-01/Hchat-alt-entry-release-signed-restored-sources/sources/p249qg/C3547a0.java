package p249qg;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p080fb.AbstractC1184v0;
import p136j8.C2104o;
import vg.AbstractC4552a;
import vg.C4567p;

/* JADX INFO: renamed from: qg.a0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3547a0 extends C4567p {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f11549k = AtomicIntegerFieldUpdater.newUpdater(C3547a0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // vg.C4567p, p249qg.C3610y0
    /* JADX INFO: renamed from: r */
    public final void mo7474r(Object obj) {
        mo7475u(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // vg.C4567p, p249qg.C3610y0
    /* JADX INFO: renamed from: u */
    public final void mo7475u(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f11549k;
            int i9 = atomicIntegerFieldUpdater.get(this);
            if (i9 != 0) {
                if (i9 != 1) {
                    C2104o.m5276A("Already resumed");
                    return;
                } else {
                    AbstractC4552a.m8989h(AbstractC3603v.m7564r(obj), AbstractC1184v0.m3214x(this.f15051j));
                    return;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
