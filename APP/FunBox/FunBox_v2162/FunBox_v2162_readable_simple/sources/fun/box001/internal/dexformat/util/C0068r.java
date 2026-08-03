package fun.box001.internal.dexformat.util;

import fun.box001.internal.dexformat.AbstractC0033j;
import fun.box001.internal.dexformat.AbstractC0039p;
import fun.box001.internal.dexformat.C0030g;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.C0162m;
import fun.box001.internal.dexformat.writer.C0164o;
import fun.box001.internal.dexformat.writer.code.AbstractC0171a;
import fun.box001.internal.dexformat.writer.code.C0190t;
import fun.box001.internal.dexformat.writer.code.C0191u;
import java.util.BitSet;

/* JADX INFO: renamed from: f.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0068r extends AbstractC0039p {

    /* JADX INFO: renamed from: a */
    public static final C0068r f297a = null;

    static {
        f297a = new C0068r();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: d */
    public final int mo176d() {
        return 3;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: f */
    public final BitSet mo177f(AbstractC0033j r6) {
        C0164o r62 = r6.m140m();
        int r0 = r62.m504B();
        BitSet r1 = new BitSet(r0);
        boolean r3 = AbstractC0039p.m170p(r62.m513p(0).m384i());
        if (r0 != 1) goto L6;
        r1.set(0, r3);
    L8:
        return r1;
    L6:
        if (r62.m513p(0).m384i() != r62.m513p(1).m384i()) goto L8;
        r1.set(0, r3);
        r1.set(1, r3);
        goto L8
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: g */
    public final String mo178g(AbstractC0033j r4) {
        return r4.m140m().m513p(0).m388o() + ", " + r4.mo116d();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: h */
    public final String mo179h(AbstractC0033j r1) {
        return r1.mo115c();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: i */
    public final boolean mo180i(AbstractC0033j r6) {
        if ((r6 instanceof C0030g) == true) goto L5;
        return false;
    L5:
        C0164o r0 = r6.m140m();
        int r2 = r0.m504B();
        if (r2 != 1) goto L8;
        C0162m r22 = r0.m513p(0);
    L15:
        if (AbstractC0039p.m170p(r22.m384i()) == true) goto L17;
        return false;
    L17:
        AbstractC0171a r62 = ((C0030g) r6).m117y();
        if ((r62 instanceof C0191u) == true) goto L22;
        if ((r62 instanceof C0190t) == true) goto L22;
        return false;
    L22:
        return true;
    L8:
        if (r2 == 2) goto L10;
        return false;
    L10:
        r22 = r0.m513p(0);
        if (r22.m384i() == r0.m513p(1).m384i()) goto L15;
        return false;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: u */
    public final void mo181u(C0202d r4, AbstractC0033j r5) {
        C0164o r0 = r5.m140m();
        int r1 = ((C0030g) r5).m118z();
        AbstractC0039p.m174t(r4, AbstractC0039p.m167m(r0.m513p(0).m384i(), r5), r1);
    }
}
