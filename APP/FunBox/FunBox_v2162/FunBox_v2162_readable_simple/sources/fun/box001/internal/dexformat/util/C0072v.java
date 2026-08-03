package fun.box001.internal.dexformat.util;

import fun.box001.internal.dexformat.AbstractC0033j;
import fun.box001.internal.dexformat.AbstractC0039p;
import fun.box001.internal.dexformat.C0030g;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.C0162m;
import fun.box001.internal.dexformat.writer.C0164o;
import fun.box001.internal.dexformat.writer.code.AbstractC0171a;
import fun.box001.internal.dexformat.writer.code.C0187q;
import fun.box001.internal.dexformat.writer.code.C0191u;
import fun.box001.internal.dexformat.writer.data.C0195c;
import java.util.BitSet;

/* JADX INFO: renamed from: f.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0072v extends AbstractC0039p {

    /* JADX INFO: renamed from: a */
    public static final C0072v f301a = null;

    static {
        f301a = new C0072v();
    }

    /* JADX INFO: renamed from: v */
    private static C0164o m216v(C0164o r7) {
        int r0 = m217w(r7);
        int r1 = r7.m504B();
        if (r0 != r1) goto L5;
        return r7;
    L5:
        C0164o r2 = new C0164o(r0);
        int r02 = 0;
        int r3 = 0;
    L6:
        if (r02 >= r1) goto L12;
        C0162m r4 = r7.m513p(r02);
        r2.m521x(r3, r4);
        if (r4.m382g() != 2) goto L10;
        r2.m521x(r3 + 1, C0162m.m377m(r4.m384i() + 1, C0195c.f770o));
        r3 = r3 + 2;
    L11:
        r02 = r02 + 1;
        goto L6
    L10:
        r3 = r3 + 1;
        goto L11
    L12:
        r2.m536g();
        return r2;
    }

    /* JADX INFO: renamed from: w */
    private static int m217w(C0164o r7) {
        int r0 = r7.m504B();
        if (r0 <= 5) goto L5;
        return -1;
    L5:
        int r3 = 0;
        int r4 = 0;
    L6:
        if (r3 >= r0) goto L11;
        C0162m r5 = r7.m513p(r3);
        r4 = r4 + r5.m382g();
        int r6 = r5.m384i();
        if (AbstractC0039p.m171q((r5.m382g() + r6) - 1) == false) goto L9;
        r3 = r3 + 1;
        goto L6
    L9:
        return -1;
    L11:
        if (r4 <= 5) goto L13;
        return -1;
    L13:
        return r4;
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
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        int r4 = r62.m513p(r2).m384i();
        r1.set(r2, AbstractC0039p.m171q((r3.m382g() + r4) - 1));
        r2 = r2 + 1;
        goto L3
    L5:
        return r1;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: g */
    public final String mo178g(AbstractC0033j r3) {
        return AbstractC0039p.m168n(m216v(r3.m140m())) + ", " + r3.mo116d();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: h */
    public final String mo179h(AbstractC0033j r1) {
        return r1.mo115c();
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: i */
    public final boolean mo180i(AbstractC0033j r4) {
        if ((r4 instanceof C0030g) == true) goto L5;
        return false;
    L5:
        C0030g r42 = (C0030g) r4;
        if (AbstractC0039p.m172r(r42.m118z()) == true) goto L8;
        return false;
    L8:
        AbstractC0171a r0 = r42.m117y();
        if ((r0 instanceof C0187q) == true) goto L14;
        if ((r0 instanceof C0191u) == true) goto L14;
        return false;
    L14:
        if (m217w(r42.m140m()) < 0) goto L17;
        return true;
    L17:
        return false;
    }

    @Override // fun.box001.internal.dexformat.AbstractC0039p
    /* JADX INFO: renamed from: u */
    public final void mo181u(C0202d r10, AbstractC0033j r11) {
        int r0 = ((C0030g) r11).m118z();
        C0164o r1 = m216v(r11.m140m());
        int r2 = r1.m504B();
        int r3 = 0;
        if (r2 <= 0) goto L5;
        int r4 = r1.m513p(0).m384i();
    L7:
        if (r2 <= 1) goto L9;
        int r5 = r1.m513p(1).m384i();
    L11:
        if (r2 <= 2) goto L13;
        int r6 = r1.m513p(2).m384i();
    L15:
        if (r2 <= 3) goto L17;
        int r7 = r1.m513p(3).m384i();
    L19:
        if (r2 <= 4) goto L21;
        r3 = r1.m513p(4).m384i();
    L21:
        short r112 = AbstractC0039p.m167m(AbstractC0039p.m166l(r3, r2), r11);
        short r02 = (short) r0;
        if ((r4 & 15) != r4) goto L38;
        if ((r5 & 15) != r5) goto L36;
        if ((r6 & 15) != r6) goto L34;
        if ((r7 & 15) != r7) goto L32;
        r10.m498r(r112);
        r10.m498r(r02);
        r10.m498r((short) ((((r5 << 4) | r4) | (r6 << 8)) | (r7 << 12)));
        return;
    L32:
        throw new IllegalArgumentException("n3 out of range 0..15");
    L34:
        throw new IllegalArgumentException("n2 out of range 0..15");
    L36:
        throw new IllegalArgumentException("n1 out of range 0..15");
    L38:
        throw new IllegalArgumentException("n0 out of range 0..15");
    L17:
        r7 = 0;
        goto L19
    L13:
        r6 = 0;
        goto L15
    L9:
        r5 = 0;
        goto L11
    L5:
        r4 = 0;
        goto L7
    }
}
