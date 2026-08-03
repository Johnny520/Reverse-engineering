package fun.box001.internal.dexformat.util;

import fun.box001.internal.dexformat.AbstractC0033j;
import fun.box001.internal.dexformat.AbstractC0039p;
import fun.box001.internal.dexformat.C0021E;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.C0162m;
import fun.box001.internal.dexformat.writer.C0164o;
import java.util.BitSet;

/* JADX INFO: renamed from: f.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0055e extends AbstractC0039p {

    /* JADX INFO: renamed from: a */
    public static final C0055e f284a = null;

    static {
        f284a = new C0055e();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: d */
    public final int mo176d() {
        return 1;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: f */
    public final BitSet mo177f(AbstractC0033j r9) {
        C0164o r92 = r9.m140m();
        BitSet r0 = new BitSet(2);
        int r3 = r92.m513p(0).m384i();
        int r5 = r92.m513p(1).m384i();
        int r6 = r92.m504B();
        if (r6 != 2) goto L5;
        r0.set(0, AbstractC0039p.m171q(r3));
        r0.set(1, AbstractC0039p.m171q(r5));
    L13:
        return r0;
    L5:
        if (r6 != 3) goto L11;
        if (r3 == r5) goto L8;
        r0.set(0, false);
        r0.set(1, false);
    L9:
        r0.set(2, AbstractC0039p.m171q(r92.m513p(2).m384i()));
        goto L13
    L8:
        boolean r32 = AbstractC0039p.m171q(r5);
        r0.set(0, r32);
        r0.set(1, r32);
        goto L9
    L11:
        throw new AssertionError();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: g */
    public final String mo178g(AbstractC0033j r4) {
        C0164o r42 = r4.m140m();
        int r0 = r42.m504B();
        return r42.m513p(r0 - 2).m388o() + ", " + r42.m513p(r0 - 1).m388o();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: h */
    public final String mo179h(AbstractC0033j r1) {
        return "";
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: i */
    public final boolean mo180i(AbstractC0033j r6) {
        if ((r6 instanceof C0021E) == true) goto L5;
        return false;
    L5:
        C0164o r62 = r6.m140m();
        int r0 = r62.m504B();
        if (r0 != 2) goto L8;
        C0162m r02 = r62.m513p(0);
        C0162m r2 = r62.m513p(1);
    L15:
        if (AbstractC0039p.m171q(r02.m384i()) == true) goto L17;
        return false;
    L17:
        if (AbstractC0039p.m171q(r2.m384i()) == true) goto L19;
        return false;
    L19:
        return true;
    L8:
        if (r0 == 3) goto L10;
        return false;
    L10:
        r02 = r62.m513p(1);
        r2 = r62.m513p(2);
        if (r02.m384i() == r62.m513p(0).m384i()) goto L15;
        return false;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: u */
    public final void mo181u(C0202d r4, AbstractC0033j r5) {
        C0164o r0 = r5.m140m();
        int r1 = r0.m504B();
        r4.m498r(AbstractC0039p.m167m(AbstractC0039p.m166l(r0.m513p(r1 - 2).m384i(), r0.m513p(r1 - 1).m384i()), r5));
    }
}
