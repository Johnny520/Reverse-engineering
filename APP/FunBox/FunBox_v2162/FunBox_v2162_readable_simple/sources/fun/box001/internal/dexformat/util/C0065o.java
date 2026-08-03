package fun.box001.internal.dexformat.util;

import fun.box001.internal.dexformat.AbstractC0033j;
import fun.box001.internal.dexformat.AbstractC0039p;
import fun.box001.internal.dexformat.C0021E;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.C0164o;
import java.util.BitSet;

/* JADX INFO: renamed from: f.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0065o extends AbstractC0039p {

    /* JADX INFO: renamed from: a */
    public static final C0065o f294a = null;

    static {
        f294a = new C0065o();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: d */
    public final int mo176d() {
        return 2;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: f */
    public final BitSet mo177f(AbstractC0033j r4) {
        C0164o r42 = r4.m140m();
        BitSet r0 = new BitSet(2);
        r0.set(0, AbstractC0039p.m170p(r42.m513p(0).m384i()));
        r0.set(1, AbstractC0039p.m172r(r42.m513p(1).m384i()));
        return r0;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: g */
    public final String mo178g(AbstractC0033j r3) {
        C0164o r32 = r3.m140m();
        return r32.m513p(0).m388o() + ", " + r32.m513p(1).m388o();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: h */
    public final String mo179h(AbstractC0033j r1) {
        return "";
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: i */
    public final boolean mo180i(AbstractC0033j r4) {
        C0164o r0 = r4.m140m();
        if ((r4 instanceof C0021E) == true) goto L5;
        return false;
    L5:
        if (r0.m504B() == 2) goto L7;
        return false;
    L7:
        if (AbstractC0039p.m170p(r0.m513p(0).m384i()) == true) goto L9;
        return false;
    L9:
        if (AbstractC0039p.m172r(r0.m513p(1).m384i()) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: u */
    public final void mo181u(C0202d r3, AbstractC0033j r4) {
        C0164o r0 = r4.m140m();
        AbstractC0039p.m173s(r3, AbstractC0039p.m167m(r0.m513p(0).m384i(), r4), (short) r0.m513p(1).m384i());
    }
}
