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
    public static final C0062l f291a = null;

    static {
        f291a = new C0062l();
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
        r0.set(0, AbstractC0039p.m171q(r42.m513p(0).m384i()));
        r0.set(1, AbstractC0039p.m171q(r42.m513p(1).m384i()));
        return r0;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: g */
    public final String mo178g(AbstractC0033j r5) {
        C0164o r0 = r5.m140m();
        return r0.m513p(0).m388o() + ", " + r0.m513p(1).m388o() + ", " + r5.mo116d();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: h */
    public final String mo179h(AbstractC0033j r1) {
        return r1.mo115c();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: i */
    public final boolean mo180i(AbstractC0033j r5) {
        C0164o r0 = r5.m140m();
        if ((r5 instanceof C0030g) == true) goto L5;
        return false;
    L5:
        if (r0.m504B() == 2) goto L7;
        return false;
    L7:
        if (AbstractC0039p.m171q(r0.m513p(0).m384i()) == true) goto L9;
        return false;
    L9:
        if (AbstractC0039p.m171q(r0.m513p(1).m384i()) == false) goto L22;
        C0030g r52 = (C0030g) r5;
        if (AbstractC0039p.m172r(r52.m118z()) == true) goto L15;
        return false;
    L15:
        if ((r52.m117y() instanceof C0191u) == true) goto L18;
        return false;
    L18:
        return true;
    L22:
        return false;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: u */
    public final void mo181u(C0202d r5, AbstractC0033j r6) {
        C0164o r0 = r6.m140m();
        int r1 = ((C0030g) r6).m118z();
        AbstractC0039p.m173s(r5, AbstractC0039p.m167m(AbstractC0039p.m166l(r0.m513p(0).m384i(), r0.m513p(1).m384i()), r6), (short) r1);
    }
}
