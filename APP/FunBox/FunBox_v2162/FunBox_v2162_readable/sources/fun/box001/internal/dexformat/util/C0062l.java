package fun.box001.internal.dexformat.util;

import fun.box001.internal.dexformat.AbstractC0033j;
import fun.box001.internal.dexformat.AbstractC0039p;
import fun.box001.internal.dexformat.C0030g;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.C0164o;
import fun.box001.internal.dexformat.writer.code.C0191u;
import java.util.BitSet;

/* JADX INFO: renamed from: f.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0062l extends AbstractC0039p {

    /* JADX INFO: renamed from: a */
    public static final C0062l f291a = new C0062l();

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: d */
    public final int mo176d() {
        return 2;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: f */
    public final BitSet mo177f(AbstractC0033j abstractC0033j) {
        C0164o c0164oM140m = abstractC0033j.m140m();
        BitSet bitSet = new BitSet(2);
        bitSet.set(0, AbstractC0039p.m171q(c0164oM140m.m513p(0).m384i()));
        bitSet.set(1, AbstractC0039p.m171q(c0164oM140m.m513p(1).m384i()));
        return bitSet;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: g */
    public final String mo178g(AbstractC0033j abstractC0033j) {
        C0164o c0164oM140m = abstractC0033j.m140m();
        return c0164oM140m.m513p(0).m388o() + ", " + c0164oM140m.m513p(1).m388o() + ", " + abstractC0033j.mo116d();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: h */
    public final String mo179h(AbstractC0033j abstractC0033j) {
        return abstractC0033j.mo115c();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: i */
    public final boolean mo180i(AbstractC0033j abstractC0033j) {
        C0164o c0164oM140m = abstractC0033j.m140m();
        if (!(abstractC0033j instanceof C0030g) || c0164oM140m.m504B() != 2 || !AbstractC0039p.m171q(c0164oM140m.m513p(0).m384i()) || !AbstractC0039p.m171q(c0164oM140m.m513p(1).m384i())) {
            return false;
        }
        C0030g c0030g = (C0030g) abstractC0033j;
        return AbstractC0039p.m172r(c0030g.m118z()) && (c0030g.m117y() instanceof C0191u);
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: u */
    public final void mo181u(C0202d c0202d, AbstractC0033j abstractC0033j) {
        C0164o c0164oM140m = abstractC0033j.m140m();
        AbstractC0039p.m173s(c0202d, AbstractC0039p.m167m(AbstractC0039p.m166l(c0164oM140m.m513p(0).m384i(), c0164oM140m.m513p(1).m384i()), abstractC0033j), (short) ((C0030g) abstractC0033j).m118z());
    }
}
