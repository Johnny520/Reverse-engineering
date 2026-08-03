package fun.box001.internal.dexformat.util;

import fun.box001.internal.dexformat.AbstractC0033j;
import fun.box001.internal.dexformat.AbstractC0039p;
import fun.box001.internal.dexformat.C0021E;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.C0164o;
import java.util.BitSet;

/* JADX INFO: renamed from: f.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0071u extends AbstractC0039p {

    /* JADX INFO: renamed from: a */
    public static final C0071u f300a = new C0071u();

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: d */
    public final int mo176d() {
        return 3;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: f */
    public final BitSet mo177f(AbstractC0033j abstractC0033j) {
        C0164o c0164oM140m = abstractC0033j.m140m();
        BitSet bitSet = new BitSet(2);
        bitSet.set(0, AbstractC0039p.m172r(c0164oM140m.m513p(0).m384i()));
        bitSet.set(1, AbstractC0039p.m172r(c0164oM140m.m513p(1).m384i()));
        return bitSet;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: g */
    public final String mo178g(AbstractC0033j abstractC0033j) {
        C0164o c0164oM140m = abstractC0033j.m140m();
        return c0164oM140m.m513p(0).m388o() + ", " + c0164oM140m.m513p(1).m388o();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: h */
    public final String mo179h(AbstractC0033j abstractC0033j) {
        return "";
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: i */
    public final boolean mo180i(AbstractC0033j abstractC0033j) {
        C0164o c0164oM140m = abstractC0033j.m140m();
        return (abstractC0033j instanceof C0021E) && c0164oM140m.m504B() == 2 && AbstractC0039p.m172r(c0164oM140m.m513p(0).m384i()) && AbstractC0039p.m172r(c0164oM140m.m513p(1).m384i());
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: u */
    public final void mo181u(C0202d c0202d, AbstractC0033j abstractC0033j) {
        C0164o c0164oM140m = abstractC0033j.m140m();
        short sM167m = AbstractC0039p.m167m(0, abstractC0033j);
        short sM384i = (short) c0164oM140m.m513p(0).m384i();
        short sM384i2 = (short) c0164oM140m.m513p(1).m384i();
        c0202d.m498r(sM167m);
        c0202d.m498r(sM384i);
        c0202d.m498r(sM384i2);
    }
}
