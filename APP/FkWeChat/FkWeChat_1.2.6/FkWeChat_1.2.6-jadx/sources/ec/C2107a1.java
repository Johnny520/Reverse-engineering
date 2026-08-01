package ec;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p145jc.AbstractC3810i;
import p145jc.C3835z;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p242q8.AbstractC6324b;
import p242q8.AbstractC6325c;
import p376zd.C10010p0;

/* JADX INFO: renamed from: ec.a1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2107a1 extends C3835z {

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5911u = AtomicIntegerFieldUpdater.newUpdater(C2107a1.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public C2107a1(InterfaceC5980j interfaceC5980j, InterfaceC5976f interfaceC5976f) {
        super(interfaceC5980j, interfaceC5976f);
    }

    /* JADX INFO: renamed from: n1 */
    private final boolean m7597n1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5911u;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 1) {
                    return false;
                }
                C10010p0.m38820a("Already resumed");
                return false;
            }
        } while (!f5911u.compareAndSet(this, 0, 2));
        return true;
    }

    /* JADX INFO: renamed from: o1 */
    private final boolean m7598o1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5911u;
        do {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2) {
                    return false;
                }
                C10010p0.m38820a("Already suspended");
                return false;
            }
        } while (!f5911u.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // p145jc.C3835z, ec.C2118c2
    /* JADX INFO: renamed from: C */
    public void mo7599C(Object obj) {
        mo7587g1(obj);
    }

    @Override // p145jc.C3835z, ec.AbstractC2105a
    /* JADX INFO: renamed from: g1 */
    public void mo7587g1(Object obj) {
        if (m7597n1()) {
            return;
        }
        AbstractC3810i.m15179b(AbstractC6324b.m24989d(this.f11025t), AbstractC2121d0.m7723a(obj, this.f11025t));
    }

    /* JADX INFO: renamed from: l1 */
    public final Object m7600l1() {
        if (m7598o1()) {
            return AbstractC6325c.m24992g();
        }
        Object objM7737h = AbstractC2123d2.m7737h(m7699p0());
        if (objM7737h instanceof C2111b0) {
            throw ((C2111b0) objM7737h).f5913a;
        }
        return objM7737h;
    }
}
