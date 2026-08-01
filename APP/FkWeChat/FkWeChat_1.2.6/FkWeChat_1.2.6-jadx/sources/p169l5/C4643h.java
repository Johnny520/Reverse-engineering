package p169l5;

import java.util.BitSet;
import okhttp3.internal.http2.Settings;
import p154k5.AbstractC3976j;
import p154k5.AbstractC3982p;
import p154k5.C3974h;
import p239q5.C6268s;
import p254r5.AbstractC6487a;
import p254r5.AbstractC6516u;
import p309v5.InterfaceC8819a;

/* JADX INFO: renamed from: l5.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4643h extends AbstractC3982p {

    /* JADX INFO: renamed from: a */
    public static final AbstractC3982p f13812a = new C4643h();

    @Override // p154k5.AbstractC3982p
    /* JADX INFO: renamed from: F */
    public void mo15828F(InterfaceC8819a interfaceC8819a, AbstractC3976j abstractC3976j) {
        C6268s c6268sM15778n = abstractC3976j.m15778n();
        AbstractC6516u abstractC6516u = (AbstractC6516u) ((C3974h) abstractC3976j).m15750A();
        AbstractC3982p.m15805B(interfaceC8819a, AbstractC3982p.m15817p(abstractC3976j, c6268sM15778n.m24769G(0).m24754t()), (short) (c6268sM15778n.m24769G(0).m24751n() == 1 ? abstractC6516u.mo25796s() >>> 16 : (int) (abstractC6516u.mo25797t() >>> 48)));
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
        BitSet bitSet = new BitSet(1);
        bitSet.set(0, AbstractC3982p.m15823v(c6268sM15778n.m24769G(0).m24754t()));
        return bitSet;
    }

    @Override // p154k5.AbstractC3982p
    /* JADX INFO: renamed from: h */
    public String mo15832h(AbstractC3976j abstractC3976j) {
        return abstractC3976j.m15778n().m24769G(0).m24741E() + ", " + AbstractC3982p.m15815n((AbstractC6516u) ((C3974h) abstractC3976j).m15750A());
    }

    @Override // p154k5.AbstractC3982p
    /* JADX INFO: renamed from: i */
    public String mo15833i(AbstractC3976j abstractC3976j, boolean z10) {
        return AbstractC3982p.m15814m((AbstractC6516u) ((C3974h) abstractC3976j).m15750A(), abstractC3976j.m15778n().m24769G(0).m24751n() == 1 ? 32 : 64);
    }

    @Override // p154k5.AbstractC3982p
    /* JADX INFO: renamed from: j */
    public boolean mo15834j(AbstractC3976j abstractC3976j) {
        C6268s c6268sM15778n = abstractC3976j.m15778n();
        if ((abstractC3976j instanceof C3974h) && c6268sM15778n.size() == 1 && AbstractC3982p.m15823v(c6268sM15778n.m24769G(0).m24754t())) {
            AbstractC6487a abstractC6487aM15750A = ((C3974h) abstractC3976j).m15750A();
            if (!(abstractC6487aM15750A instanceof AbstractC6516u)) {
                return false;
            }
            AbstractC6516u abstractC6516u = (AbstractC6516u) abstractC6487aM15750A;
            if (c6268sM15778n.m24769G(0).m24751n() == 1) {
                return (abstractC6516u.mo25796s() & Settings.DEFAULT_INITIAL_WINDOW_SIZE) == 0;
            }
            if ((abstractC6516u.mo25797t() & 281474976710655L) == 0) {
                return true;
            }
        }
        return false;
    }
}
