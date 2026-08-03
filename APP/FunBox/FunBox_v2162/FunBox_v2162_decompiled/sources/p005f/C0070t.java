package p005f;

import java.util.BitSet;
import p004e.AbstractC0033j;
import p004e.AbstractC0039p;
import p004e.C0022F;
import p009j.C0164o;
import p013n.C0202d;

/* JADX INFO: renamed from: f.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0070t extends AbstractC0039p {

    /* JADX INFO: renamed from: a */
    public static final C0070t f299a = new C0070t();

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: b */
    public final boolean mo175b(C0022F c0022f) {
        return true;
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: d */
    public final int mo176d() {
        return 3;
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: f */
    public final BitSet mo177f(AbstractC0033j abstractC0033j) {
        C0164o c0164oM140m = abstractC0033j.m140m();
        BitSet bitSet = new BitSet(1);
        bitSet.set(0, AbstractC0039p.m170p(c0164oM140m.m513p(0).m384i()));
        return bitSet;
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: g */
    public final String mo178g(AbstractC0033j abstractC0033j) {
        return abstractC0033j.m140m().m513p(0).m388o() + ", " + AbstractC0039p.m162c(abstractC0033j);
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: h */
    public final String mo179h(AbstractC0033j abstractC0033j) {
        return AbstractC0039p.m161a(abstractC0033j);
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: i */
    public final boolean mo180i(AbstractC0033j abstractC0033j) {
        C0164o c0164oM140m = abstractC0033j.m140m();
        return (abstractC0033j instanceof C0022F) && c0164oM140m.m504B() == 1 && AbstractC0039p.m170p(c0164oM140m.m513p(0).m384i());
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: u */
    public final void mo181u(C0202d c0202d, AbstractC0033j abstractC0033j) {
        C0164o c0164oM140m = abstractC0033j.m140m();
        AbstractC0039p.m174t(c0202d, AbstractC0039p.m167m(c0164oM140m.m513p(0).m384i(), abstractC0033j), ((C0022F) abstractC0033j).m87A());
    }
}
