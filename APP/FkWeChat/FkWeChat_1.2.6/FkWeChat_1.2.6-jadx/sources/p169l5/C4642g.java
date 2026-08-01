package p169l5;

import java.util.BitSet;
import okhttp3.internal.url._UrlKt;
import p154k5.AbstractC3976j;
import p154k5.AbstractC3982p;
import p154k5.C3974h;
import p239q5.C6267r;
import p239q5.C6268s;
import p254r5.AbstractC6487a;
import p254r5.C6488a0;
import p254r5.C6492c0;
import p254r5.C6496e0;
import p254r5.C6508m;
import p254r5.C6519x;
import p309v5.InterfaceC8819a;

/* JADX INFO: renamed from: l5.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4642g extends AbstractC3982p {

    /* JADX INFO: renamed from: a */
    public static final AbstractC3982p f13811a = new C4642g();

    @Override // p154k5.AbstractC3982p
    /* JADX INFO: renamed from: F */
    public void mo15828F(InterfaceC8819a interfaceC8819a, AbstractC3976j abstractC3976j) {
        AbstractC3982p.m15805B(interfaceC8819a, AbstractC3982p.m15817p(abstractC3976j, abstractC3976j.m15778n().m24769G(0).m24754t()), (short) ((C3974h) abstractC3976j).m15751B());
    }

    @Override // p154k5.AbstractC3982p
    /* JADX INFO: renamed from: d */
    public int mo15830d() {
        return 2;
    }

    @Override // p154k5.AbstractC3982p
    /* JADX INFO: renamed from: g */
    public BitSet mo15831g(AbstractC3976j abstractC3976j) {
        C6268s c6268sM15778n = abstractC3976j.m15778n();
        int size = c6268sM15778n.size();
        BitSet bitSet = new BitSet(size);
        boolean zM15823v = AbstractC3982p.m15823v(c6268sM15778n.m24769G(0).m24754t());
        if (size == 1) {
            bitSet.set(0, zM15823v);
            return bitSet;
        }
        if (c6268sM15778n.m24769G(0).m24754t() == c6268sM15778n.m24769G(1).m24754t()) {
            bitSet.set(0, zM15823v);
            bitSet.set(1, zM15823v);
        }
        return bitSet;
    }

    @Override // p154k5.AbstractC3982p
    /* JADX INFO: renamed from: h */
    public String mo15832h(AbstractC3976j abstractC3976j) {
        return abstractC3976j.m15778n().m24769G(0).m24741E() + ", " + abstractC3976j.mo15756d();
    }

    @Override // p154k5.AbstractC3982p
    /* JADX INFO: renamed from: i */
    public String mo15833i(AbstractC3976j abstractC3976j, boolean z10) {
        return z10 ? abstractC3976j.mo15755c() : _UrlKt.FRAGMENT_ENCODE_SET;
    }

    @Override // p154k5.AbstractC3982p
    /* JADX INFO: renamed from: j */
    public boolean mo15834j(AbstractC3976j abstractC3976j) {
        C6267r c6267rM24769G;
        if (!(abstractC3976j instanceof C3974h)) {
            return false;
        }
        C6268s c6268sM15778n = abstractC3976j.m15778n();
        int size = c6268sM15778n.size();
        if (size == 1) {
            c6267rM24769G = c6268sM15778n.m24769G(0);
        } else {
            if (size != 2) {
                return false;
            }
            c6267rM24769G = c6268sM15778n.m24769G(0);
            if (c6267rM24769G.m24754t() != c6268sM15778n.m24769G(1).m24754t()) {
                return false;
            }
        }
        if (!AbstractC3982p.m15823v(c6267rM24769G.m24754t())) {
            return false;
        }
        C3974h c3974h = (C3974h) abstractC3976j;
        int iM15751B = c3974h.m15751B();
        AbstractC6487a abstractC6487aM15750A = c3974h.m15750A();
        if (AbstractC3982p.m15825x(iM15751B)) {
            return (abstractC6487aM15750A instanceof C6496e0) || (abstractC6487aM15750A instanceof C6508m) || (abstractC6487aM15750A instanceof C6492c0) || (abstractC6487aM15750A instanceof C6519x) || (abstractC6487aM15750A instanceof C6488a0);
        }
        return false;
    }
}
