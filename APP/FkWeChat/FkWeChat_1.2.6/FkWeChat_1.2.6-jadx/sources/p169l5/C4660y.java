package p169l5;

import okhttp3.internal.url._UrlKt;
import p154k5.AbstractC3976j;
import p154k5.AbstractC3982p;
import p154k5.C3986t;
import p239q5.C6268s;
import p254r5.C6488a0;
import p254r5.C6520y;
import p309v5.InterfaceC8819a;

/* JADX INFO: renamed from: l5.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4660y extends AbstractC3982p {

    /* JADX INFO: renamed from: a */
    public static final AbstractC3982p f13829a = new C4660y();

    @Override // p154k5.AbstractC3982p
    /* JADX INFO: renamed from: F */
    public void mo15828F(InterfaceC8819a interfaceC8819a, AbstractC3976j abstractC3976j) {
        C3986t c3986t = (C3986t) abstractC3976j;
        short sM15865B = (short) c3986t.m15865B(0);
        short sM15865B2 = (short) c3986t.m15865B(1);
        C6268s c6268sM15778n = abstractC3976j.m15778n();
        AbstractC3982p.m15807D(interfaceC8819a, AbstractC3982p.m15817p(abstractC3976j, c6268sM15778n.m24770H()), sM15865B, c6268sM15778n.size() > 0 ? (short) c6268sM15778n.m24769G(0).m24754t() : (short) 0, sM15865B2);
    }

    @Override // p154k5.AbstractC3982p
    /* JADX INFO: renamed from: d */
    public int mo15830d() {
        return 4;
    }

    @Override // p154k5.AbstractC3982p
    /* JADX INFO: renamed from: h */
    public String mo15832h(AbstractC3976j abstractC3976j) {
        return AbstractC3982p.m15819r(abstractC3976j.m15778n()) + ", " + abstractC3976j.mo15756d();
    }

    @Override // p154k5.AbstractC3982p
    /* JADX INFO: renamed from: i */
    public String mo15833i(AbstractC3976j abstractC3976j, boolean z10) {
        return z10 ? abstractC3976j.mo15755c() : _UrlKt.FRAGMENT_ENCODE_SET;
    }

    @Override // p154k5.AbstractC3982p
    /* JADX INFO: renamed from: j */
    public boolean mo15834j(AbstractC3976j abstractC3976j) {
        if (!(abstractC3976j instanceof C3986t)) {
            return false;
        }
        C3986t c3986t = (C3986t) abstractC3976j;
        int iM15865B = c3986t.m15865B(0);
        int iM15865B2 = c3986t.m15865B(1);
        if (!AbstractC3982p.m15825x(iM15865B) || !AbstractC3982p.m15825x(iM15865B2) || !(c3986t.m15864A(0) instanceof C6520y) || !(c3986t.m15864A(1) instanceof C6488a0)) {
            return false;
        }
        C6268s c6268sM15778n = c3986t.m15778n();
        int size = c6268sM15778n.size();
        if (size == 0) {
            return true;
        }
        return AbstractC3982p.m15823v(c6268sM15778n.m24770H()) && AbstractC3982p.m15825x(size) && AbstractC3982p.m15825x(c6268sM15778n.m24769G(0).m24754t()) && AbstractC3982p.m15813k(c6268sM15778n);
    }
}
