package ec;

import p145jc.AbstractC3815k0;
import p145jc.C3835z;
import p172l8.AbstractC4717x;
import p172l8.C4700i0;
import p172l8.C4711r;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5977g;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: ec.y2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2207y2 extends C3835z {
    private volatile boolean threadLocalIsSet;

    /* JADX INFO: renamed from: u */
    public final ThreadLocal f6034u;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2207y2(InterfaceC5980j interfaceC5980j, InterfaceC5976f interfaceC5976f) {
        C2211z2 c2211z2 = C2211z2.f6036q;
        super(interfaceC5980j.mo1654h(c2211z2) == null ? interfaceC5980j.mo1651c0(c2211z2) : interfaceC5980j, interfaceC5976f);
        this.f6034u = new ThreadLocal();
        if (interfaceC5976f.getContext().mo1654h(InterfaceC5977g.f18915n) instanceof AbstractC2149k0) {
            return;
        }
        Object objM15198f = AbstractC3815k0.m15198f(interfaceC5980j, null);
        AbstractC3815k0.m15196d(interfaceC5980j, objM15198f);
        m7947n1(interfaceC5980j, objM15198f);
    }

    @Override // p145jc.C3835z, ec.AbstractC2105a
    /* JADX INFO: renamed from: g1 */
    public void mo7587g1(Object obj) {
        m7946m1();
        Object objM7723a = AbstractC2121d0.m7723a(obj, this.f11025t);
        InterfaceC5976f interfaceC5976f = this.f11025t;
        InterfaceC5980j context = interfaceC5976f.getContext();
        Object objM15198f = AbstractC3815k0.m15198f(context, null);
        C2207y2 c2207y2M7772j = objM15198f != AbstractC3815k0.f10996a ? AbstractC2141i0.m7772j(interfaceC5976f, context, objM15198f) : null;
        try {
            this.f11025t.resumeWith(objM7723a);
            C4700i0 c4700i0 = C4700i0.f13910a;
            if (c2207y2M7772j == null || c2207y2M7772j.m7945l1()) {
                AbstractC3815k0.m15196d(context, objM15198f);
            }
        } catch (Throwable th) {
            if (c2207y2M7772j == null || c2207y2M7772j.m7945l1()) {
                AbstractC3815k0.m15196d(context, objM15198f);
            }
            throw th;
        }
    }

    @Override // p145jc.C3835z
    /* JADX INFO: renamed from: k1 */
    public void mo7944k1() {
        m7946m1();
    }

    /* JADX INFO: renamed from: l1 */
    public final boolean m7945l1() {
        boolean z10 = this.threadLocalIsSet && this.f6034u.get() == null;
        this.f6034u.remove();
        return !z10;
    }

    /* JADX INFO: renamed from: m1 */
    public final void m7946m1() {
        if (this.threadLocalIsSet) {
            C4711r c4711r = (C4711r) this.f6034u.get();
            if (c4711r != null) {
                AbstractC3815k0.m15196d((InterfaceC5980j) c4711r.m18792a(), c4711r.m18793b());
            }
            this.f6034u.remove();
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final void m7947n1(InterfaceC5980j interfaceC5980j, Object obj) {
        this.threadLocalIsSet = true;
        this.f6034u.set(AbstractC4717x.m18815a(interfaceC5980j, obj));
    }
}
