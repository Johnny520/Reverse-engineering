package p169l5;

import java.util.BitSet;
import okhttp3.internal.url._UrlKt;
import p154k5.AbstractC3976j;
import p154k5.AbstractC3982p;
import p154k5.C3963b0;
import p239q5.C6268s;
import p309v5.InterfaceC8819a;

/* JADX INFO: renamed from: l5.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4651p extends AbstractC3982p {

    /* JADX INFO: renamed from: a */
    public static final AbstractC3982p f13820a = new C4651p();

    @Override // p154k5.AbstractC3982p
    /* JADX INFO: renamed from: F */
    public void mo15828F(InterfaceC8819a interfaceC8819a, AbstractC3976j abstractC3976j) {
        C6268s c6268sM15778n = abstractC3976j.m15778n();
        AbstractC3982p.m15805B(interfaceC8819a, AbstractC3982p.m15817p(abstractC3976j, c6268sM15778n.m24769G(0).m24754t()), AbstractC3982p.m15811e(c6268sM15778n.m24769G(1).m24754t(), c6268sM15778n.m24769G(2).m24754t()));
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
        BitSet bitSet = new BitSet(3);
        bitSet.set(0, AbstractC3982p.m15823v(c6268sM15778n.m24769G(0).m24754t()));
        bitSet.set(1, AbstractC3982p.m15823v(c6268sM15778n.m24769G(1).m24754t()));
        bitSet.set(2, AbstractC3982p.m15823v(c6268sM15778n.m24769G(2).m24754t()));
        return bitSet;
    }

    @Override // p154k5.AbstractC3982p
    /* JADX INFO: renamed from: h */
    public String mo15832h(AbstractC3976j abstractC3976j) {
        C6268s c6268sM15778n = abstractC3976j.m15778n();
        return c6268sM15778n.m24769G(0).m24741E() + ", " + c6268sM15778n.m24769G(1).m24741E() + ", " + c6268sM15778n.m24769G(2).m24741E();
    }

    @Override // p154k5.AbstractC3982p
    /* JADX INFO: renamed from: i */
    public String mo15833i(AbstractC3976j abstractC3976j, boolean z10) {
        return _UrlKt.FRAGMENT_ENCODE_SET;
    }

    @Override // p154k5.AbstractC3982p
    /* JADX INFO: renamed from: j */
    public boolean mo15834j(AbstractC3976j abstractC3976j) {
        C6268s c6268sM15778n = abstractC3976j.m15778n();
        return (abstractC3976j instanceof C3963b0) && c6268sM15778n.size() == 3 && AbstractC3982p.m15823v(c6268sM15778n.m24769G(0).m24754t()) && AbstractC3982p.m15823v(c6268sM15778n.m24769G(1).m24754t()) && AbstractC3982p.m15823v(c6268sM15778n.m24769G(2).m24754t());
    }
}
