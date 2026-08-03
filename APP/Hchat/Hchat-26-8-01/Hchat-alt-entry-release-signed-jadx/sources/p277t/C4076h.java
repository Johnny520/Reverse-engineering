package p277t;

import p011ab.C0045e;
import p028c1.C0372b;
import p029c2.InterfaceC0389a;
import p057e1.C0808c;
import p174m.C2618k;
import p249qg.AbstractC3603v;
import p276sf.C3967n;
import p308v1.InterfaceC4428t;
import p339x1.AbstractC5614i1;
import p339x1.AbstractC5618k;
import p339x1.InterfaceC5648u;
import p352xf.EnumC5799a;
import p356y0.AbstractC5852n;
import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: t.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4076h extends AbstractC5852n implements InterfaceC0389a, InterfaceC5648u {

    /* JADX INFO: renamed from: u */
    public C2618k f13513u;

    /* JADX INFO: renamed from: v */
    public boolean f13514v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k1 */
    public static final C0808c m8262k1(C4076h c4076h, AbstractC5614i1 abstractC5614i1, C0372b c0372b) {
        C0808c c0808c;
        if (c4076h.f23801t && c4076h.f13514v) {
            AbstractC5614i1 abstractC5614i1M10166v = AbstractC5618k.m10166v(c4076h);
            if (!abstractC5614i1.mo10106r1().f23801t) {
                abstractC5614i1 = null;
            }
            if (abstractC5614i1 != null && (c0808c = (C0808c) c0372b.invoke()) != null) {
                return c0808c.m2053i(abstractC5614i1M10166v.mo8866k0(abstractC5614i1, false).m2048d());
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029c2.InterfaceC0389a
    /* JADX INFO: renamed from: A0 */
    public final Object mo1353A0(AbstractC5614i1 abstractC5614i1, C0372b c0372b, AbstractC6038c abstractC6038c) {
        Object objM7551e = AbstractC3603v.m7551e(new C4075g(this, abstractC5614i1, c0372b, new C0045e(this, abstractC5614i1, c0372b, 13), null, 0), abstractC6038c);
        return objM7551e == EnumC5799a.f23547g ? objM7551e : C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: Z0 */
    public final boolean mo1349Z0() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5648u
    /* JADX INFO: renamed from: p0 */
    public final void mo1802p0(InterfaceC4428t interfaceC4428t) {
        this.f13514v = true;
    }
}
