package p169l5;

import java.util.BitSet;
import okhttp3.internal.url._UrlKt;
import p154k5.AbstractC3976j;
import p154k5.AbstractC3982p;
import p154k5.C3963b0;
import p239q5.C6268s;
import p309v5.InterfaceC8819a;

/* JADX INFO: renamed from: l5.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4639d extends AbstractC3982p {

    /* JADX INFO: renamed from: a */
    public static final AbstractC3982p f13808a = new C4639d();

    @Override // p154k5.AbstractC3982p
    /* JADX INFO: renamed from: F */
    public void mo15828F(InterfaceC8819a interfaceC8819a, AbstractC3976j abstractC3976j) {
        AbstractC3982p.m15826y(interfaceC8819a, AbstractC3982p.m15817p(abstractC3976j, abstractC3976j.m15778n().m24769G(0).m24754t()));
    }

    @Override // p154k5.AbstractC3982p
    /* JADX INFO: renamed from: d */
    public int mo15830d() {
        return 1;
    }

    @Override // p154k5.AbstractC3982p
    /* JADX INFO: renamed from: g */
    public BitSet mo15831g(AbstractC3976j abstractC3976j) {
        C6268s c6268sM15778n = abstractC3976j.m15778n();
        BitSet bitSet = new BitSet(1);
        bitSet.set(0, AbstractC3982p.m15823v(c6268sM15778n.m24769G(0).m24754t()));
        return bitSet;
    }

    @Override // p154k5.AbstractC3982p
    /* JADX INFO: renamed from: h */
    public String mo15832h(AbstractC3976j abstractC3976j) {
        return abstractC3976j.m15778n().m24769G(0).m24741E();
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
        return (abstractC3976j instanceof C3963b0) && c6268sM15778n.size() == 1 && AbstractC3982p.m15823v(c6268sM15778n.m24769G(0).m24754t());
    }
}
