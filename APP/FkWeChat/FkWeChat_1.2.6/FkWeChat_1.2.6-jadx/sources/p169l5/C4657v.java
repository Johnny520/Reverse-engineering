package p169l5;

import java.util.BitSet;
import okhttp3.internal.url._UrlKt;
import p154k5.AbstractC3976j;
import p154k5.AbstractC3982p;
import p154k5.C3974h;
import p239q5.C6267r;
import p239q5.C6268s;
import p254r5.AbstractC6487a;
import p254r5.C6496e0;
import p254r5.C6503i;
import p254r5.C6520y;
import p269s5.C7188c;
import p309v5.InterfaceC8819a;

/* JADX INFO: renamed from: l5.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4657v extends AbstractC3982p {

    /* JADX INFO: renamed from: a */
    public static final AbstractC3982p f13826a = new C4657v();

    /* JADX INFO: renamed from: G */
    public static C6268s m18629G(C6268s c6268s) {
        int iM18630H = m18630H(c6268s);
        int size = c6268s.size();
        if (iM18630H == size) {
            return c6268s;
        }
        C6268s c6268s2 = new C6268s(iM18630H);
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
    public static int m18630H(C6268s c6268s) {
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
        int iM15751B = ((C3974h) abstractC3976j).m15751B();
        C6268s c6268sM18629G = m18629G(abstractC3976j.m15778n());
        int size = c6268sM18629G.size();
        AbstractC3982p.m15806C(interfaceC8819a, AbstractC3982p.m15817p(abstractC3976j, AbstractC3982p.m15816o(size > 4 ? c6268sM18629G.m24769G(4).m24754t() : 0, size)), (short) iM15751B, AbstractC3982p.m15812f(size > 0 ? c6268sM18629G.m24769G(0).m24754t() : 0, size > 1 ? c6268sM18629G.m24769G(1).m24754t() : 0, size > 2 ? c6268sM18629G.m24769G(2).m24754t() : 0, size > 3 ? c6268sM18629G.m24769G(3).m24754t() : 0));
    }

    @Override // p154k5.AbstractC3982p
    /* JADX INFO: renamed from: d */
    public int mo15830d() {
        return 3;
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
        return AbstractC3982p.m15818q(m18629G(abstractC3976j.m15778n())) + ", " + abstractC3976j.mo15756d();
    }

    @Override // p154k5.AbstractC3982p
    /* JADX INFO: renamed from: i */
    public String mo15833i(AbstractC3976j abstractC3976j, boolean z10) {
        return z10 ? abstractC3976j.mo15755c() : _UrlKt.FRAGMENT_ENCODE_SET;
    }

    @Override // p154k5.AbstractC3982p
    /* JADX INFO: renamed from: j */
    public boolean mo15834j(AbstractC3976j abstractC3976j) {
        if (!(abstractC3976j instanceof C3974h)) {
            return false;
        }
        C3974h c3974h = (C3974h) abstractC3976j;
        if (!AbstractC3982p.m15825x(c3974h.m15751B())) {
            return false;
        }
        AbstractC6487a abstractC6487aM15750A = c3974h.m15750A();
        return ((abstractC6487aM15750A instanceof C6520y) || (abstractC6487aM15750A instanceof C6496e0) || (abstractC6487aM15750A instanceof C6503i)) && m18630H(c3974h.m15778n()) >= 0;
    }
}
