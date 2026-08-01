package p169l5;

import okhttp3.internal.url._UrlKt;
import p154k5.AbstractC3976j;
import p154k5.AbstractC3982p;
import p154k5.C3974h;
import p239q5.C6268s;
import p254r5.AbstractC6487a;
import p254r5.C6496e0;
import p254r5.C6503i;
import p254r5.C6520y;
import p309v5.InterfaceC8819a;

/* JADX INFO: renamed from: l5.w */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4658w extends AbstractC3982p {

    /* JADX INFO: renamed from: a */
    public static final AbstractC3982p f13827a = new C4658w();

    @Override // p154k5.AbstractC3982p
    /* JADX INFO: renamed from: F */
    public void mo15828F(InterfaceC8819a interfaceC8819a, AbstractC3976j abstractC3976j) {
        C6268s c6268sM15778n = abstractC3976j.m15778n();
        AbstractC3982p.m15806C(interfaceC8819a, AbstractC3982p.m15817p(abstractC3976j, c6268sM15778n.m24770H()), (short) ((C3974h) abstractC3976j).m15751B(), (short) (c6268sM15778n.size() != 0 ? c6268sM15778n.m24769G(0).m24754t() : 0));
    }

    @Override // p154k5.AbstractC3982p
    /* JADX INFO: renamed from: d */
    public int mo15830d() {
        return 3;
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
        if (!(abstractC3976j instanceof C3974h)) {
            return false;
        }
        C3974h c3974h = (C3974h) abstractC3976j;
        int iM15751B = c3974h.m15751B();
        AbstractC6487a abstractC6487aM15750A = c3974h.m15750A();
        if (!AbstractC3982p.m15825x(iM15751B)) {
            return false;
        }
        if (!(abstractC6487aM15750A instanceof C6520y) && !(abstractC6487aM15750A instanceof C6496e0) && !(abstractC6487aM15750A instanceof C6503i)) {
            return false;
        }
        C6268s c6268sM15778n = c3974h.m15778n();
        c6268sM15778n.size();
        if (c6268sM15778n.size() != 0) {
            return AbstractC3982p.m15813k(c6268sM15778n) && AbstractC3982p.m15825x(c6268sM15778n.m24769G(0).m24754t()) && AbstractC3982p.m15823v(c6268sM15778n.m24770H());
        }
        return true;
    }
}
