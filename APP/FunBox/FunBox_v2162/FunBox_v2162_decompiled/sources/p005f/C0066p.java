package p005f;

import java.util.BitSet;
import p004e.AbstractC0033j;
import p004e.AbstractC0039p;
import p004e.C0021E;
import p009j.C0164o;
import p013n.C0202d;

/* JADX INFO: renamed from: f.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0066p extends AbstractC0039p {

    /* JADX INFO: renamed from: a */
    public static final C0066p f295a = new C0066p();

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: d */
    public final int mo176d() {
        return 2;
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: f */
    public final BitSet mo177f(AbstractC0033j abstractC0033j) {
        C0164o c0164oM140m = abstractC0033j.m140m();
        BitSet bitSet = new BitSet(3);
        bitSet.set(0, AbstractC0039p.m170p(c0164oM140m.m513p(0).m384i()));
        bitSet.set(1, AbstractC0039p.m170p(c0164oM140m.m513p(1).m384i()));
        bitSet.set(2, AbstractC0039p.m170p(c0164oM140m.m513p(2).m384i()));
        return bitSet;
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: g */
    public final String mo178g(AbstractC0033j abstractC0033j) {
        C0164o c0164oM140m = abstractC0033j.m140m();
        return c0164oM140m.m513p(0).m388o() + ", " + c0164oM140m.m513p(1).m388o() + ", " + c0164oM140m.m513p(2).m388o();
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: h */
    public final String mo179h(AbstractC0033j abstractC0033j) {
        return "";
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: i */
    public final boolean mo180i(AbstractC0033j abstractC0033j) {
        C0164o c0164oM140m = abstractC0033j.m140m();
        return (abstractC0033j instanceof C0021E) && c0164oM140m.m504B() == 3 && AbstractC0039p.m170p(c0164oM140m.m513p(0).m384i()) && AbstractC0039p.m170p(c0164oM140m.m513p(1).m384i()) && AbstractC0039p.m170p(c0164oM140m.m513p(2).m384i());
    }

    @Override // p004e.AbstractC0039p
    /* JADX INFO: renamed from: u */
    public final void mo181u(C0202d c0202d, AbstractC0033j abstractC0033j) {
        C0164o c0164oM140m = abstractC0033j.m140m();
        AbstractC0039p.m173s(c0202d, AbstractC0039p.m167m(c0164oM140m.m513p(0).m384i(), abstractC0033j), AbstractC0039p.m163e(c0164oM140m.m513p(1).m384i(), c0164oM140m.m513p(2).m384i()));
    }
}
