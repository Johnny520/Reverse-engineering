package p113hc;

import ec.C2164o;
import java.util.concurrent.atomic.AtomicReference;
import p130ic.AbstractC3385c;
import p130ic.AbstractC3386d;
import p145jc.AbstractC3798c;
import p145jc.C3801d0;
import p163l.AbstractC4284d1;
import p172l8.C4700i0;
import p172l8.C4712s;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6324b;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6539h;

/* JADX INFO: renamed from: hc.i0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2985i0 extends AbstractC3386d {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f7876a = new AtomicReference(null);

    @Override // p130ic.AbstractC3386d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo11022a(C2981g0 c2981g0) {
        if (AbstractC3798c.m15147a(this.f7876a) != null) {
            return false;
        }
        AbstractC3798c.m15148b(this.f7876a, AbstractC2983h0.f7874a);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final Object m11025e(InterfaceC5976f interfaceC5976f) {
        C2164o c2164o = new C2164o(AbstractC6324b.m24989d(interfaceC5976f), 1);
        c2164o.m7851E();
        if (!AbstractC4284d1.m16830a(this.f7876a, AbstractC2983h0.f7874a, c2164o)) {
            C4712s.a aVar = C4712s.f13928r;
            c2164o.resumeWith(C4712s.m18798b(C4700i0.f13910a));
        }
        Object objM7875w = c2164o.m7875w();
        if (objM7875w == AbstractC6325c.m24992g()) {
            AbstractC6539h.m25860c(interfaceC5976f);
        }
        return objM7875w == AbstractC6325c.m24992g() ? objM7875w : C4700i0.f13910a;
    }

    @Override // p130ic.AbstractC3386d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public InterfaceC5976f[] mo11023b(C2981g0 c2981g0) {
        AbstractC3798c.m15148b(this.f7876a, null);
        return AbstractC3385c.f9340a;
    }

    /* JADX INFO: renamed from: g */
    public final void m11027g() {
        AtomicReference atomicReference = this.f7876a;
        while (true) {
            Object objM15147a = AbstractC3798c.m15147a(atomicReference);
            if (objM15147a == null || objM15147a == AbstractC2983h0.f7875b) {
                return;
            }
            C3801d0 c3801d0 = AbstractC2983h0.f7874a;
            AtomicReference atomicReference2 = this.f7876a;
            if (objM15147a == c3801d0) {
                if (AbstractC4284d1.m16830a(atomicReference2, objM15147a, AbstractC2983h0.f7875b)) {
                    return;
                }
            } else if (AbstractC4284d1.m16830a(atomicReference2, objM15147a, AbstractC2983h0.f7874a)) {
                C4712s.a aVar = C4712s.f13928r;
                ((C2164o) objM15147a).resumeWith(C4712s.m18798b(C4700i0.f13910a));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m11028h() {
        Object andSet = this.f7876a.getAndSet(AbstractC2983h0.f7874a);
        andSet.getClass();
        return andSet == AbstractC2983h0.f7875b;
    }
}
