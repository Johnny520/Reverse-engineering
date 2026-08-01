package p169l5;

import java.util.BitSet;
import okhttp3.internal.url._UrlKt;
import p154k5.AbstractC3976j;
import p154k5.AbstractC3982p;
import p154k5.C3986t;
import p239q5.C6267r;
import p239q5.C6268s;
import p254r5.C6488a0;
import p254r5.C6520y;
import p269s5.C7188c;
import p309v5.InterfaceC8819a;

/* JADX INFO: renamed from: l5.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4659x extends AbstractC3982p {

    /* JADX INFO: renamed from: a */
    public static final AbstractC3982p f13828a = new C4659x();

    /* JADX INFO: renamed from: G */
    private static C6268s m18631G(C6268s c6268s) {
        int iM18632H = m18632H(c6268s);
        int size = c6268s.size();
        if (iM18632H == size) {
            return c6268s;
        }
        C6268s c6268s2 = new C6268s(iM18632H);
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            C6267r c6267rM24769G = c6268s.m24769G(i11);
            c6268s2.m24772L(i10, c6267rM24769G);
            if (c6267rM24769G.m24751n() == 2) {
                c6268s2.m24772L(i10 + 1, C6267r.m24732A(c6267rM24769G.m24754t() + 1, C7188c.f23828G));
                i10 += 2;
            } else {
                i10++;
            }
        }
        c6268s2.mo6829t();
        return c6268s2;
    }

    /* JADX INFO: renamed from: H */
    private static int m18632H(C6268s c6268s) {
        int size = c6268s.size();
        if (size > 5) {
            return -1;
        }
        int iM24751n = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iM24751n += c6268s.m24769G(i10).m24751n();
            if (!AbstractC3982p.m15824w((r5.m24754t() + r5.m24751n()) - 1)) {
                return -1;
            }
        }
        if (iM24751n <= 5) {
            return iM24751n;
        }
        return -1;
    }

    @Override // p154k5.AbstractC3982p
    /* JADX INFO: renamed from: F */
    public void mo15828F(InterfaceC8819a interfaceC8819a, AbstractC3976j abstractC3976j) {
        C3986t c3986t = (C3986t) abstractC3976j;
        short sM15865B = (short) c3986t.m15865B(0);
        short sM15865B2 = (short) c3986t.m15865B(1);
        C6268s c6268sM18631G = m18631G(abstractC3976j.m15778n());
        int size = c6268sM18631G.size();
        AbstractC3982p.m15807D(interfaceC8819a, AbstractC3982p.m15817p(abstractC3976j, AbstractC3982p.m15816o(size > 4 ? c6268sM18631G.m24769G(4).m24754t() : 0, size)), sM15865B, AbstractC3982p.m15812f(size > 0 ? c6268sM18631G.m24769G(0).m24754t() : 0, size > 1 ? c6268sM18631G.m24769G(1).m24754t() : 0, size > 2 ? c6268sM18631G.m24769G(2).m24754t() : 0, size > 3 ? c6268sM18631G.m24769G(3).m24754t() : 0), sM15865B2);
    }

    @Override // p154k5.AbstractC3982p
    /* JADX INFO: renamed from: d */
    public int mo15830d() {
        return 4;
    }

    @Override // p154k5.AbstractC3982p
    /* JADX INFO: renamed from: g */
    public BitSet mo15831g(AbstractC3976j abstractC3976j) {
        C6268s c6268sM15778n = abstractC3976j.m15778n();
        int size = c6268sM15778n.size();
        BitSet bitSet = new BitSet(size);
        for (int i10 = 0; i10 < size; i10++) {
            C6267r c6267rM24769G = c6268sM15778n.m24769G(i10);
            bitSet.set(i10, AbstractC3982p.m15824w((c6267rM24769G.m24754t() + c6267rM24769G.m24751n()) - 1));
        }
        return bitSet;
    }

    @Override // p154k5.AbstractC3982p
    /* JADX INFO: renamed from: h */
    public String mo15832h(AbstractC3976j abstractC3976j) {
        return AbstractC3982p.m15818q(m18631G(abstractC3976j.m15778n())) + ", " + abstractC3976j.mo15756d();
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
        if (c3986t.m15866C() != 2) {
            return false;
        }
        return AbstractC3982p.m15825x(c3986t.m15865B(0)) && AbstractC3982p.m15825x(c3986t.m15865B(1)) && (c3986t.m15864A(0) instanceof C6520y) && (c3986t.m15864A(1) instanceof C6488a0) && m18632H(c3986t.m15778n()) >= 0;
    }
}
