package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ia */
/* JADX INFO: loaded from: classes.dex */
public final class C1539ia extends AbstractC2140ka {

    /* JADX INFO: renamed from: c */
    public final byte[] f5428c;

    /* JADX INFO: renamed from: d */
    public int f5429d;

    /* JADX INFO: renamed from: e */
    public int f5430e;

    /* JADX INFO: renamed from: f */
    public int f5431f;

    /* JADX INFO: renamed from: g */
    public final int f5432g;

    /* JADX INFO: renamed from: h */
    public int f5433h;

    /* JADX INFO: renamed from: i */
    public int f5434i;

    public C1539ia(byte[] r1, int r2, int r3, boolean r4) {
        this.f5434i = Integer.MAX_VALUE;
        this.f5428c = r1;
        this.f5429d = r3 + r2;
        this.f5431f = r2;
        this.f5432g = r2;
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: A */
    public final String mo2926A() {
        int r0 = m2932G();
        if (r0 <= 0) goto L8;
        int r1 = this.f5429d;
        int r2 = this.f5431f;
        if (r0 > (r1 - r2)) goto L8;
        String r12 = AbstractC2536tD.f8842a.mo1360i(this.f5428c, r2, r0);
        this.f5431f += r0;
        return r12;
    L8:
        if (r0 != 0) goto L11;
        return "";
    L11:
        if (r0 > 0) goto L15;
        throw C0673Pl.m1368e();
    L15:
        throw C0673Pl.m1370g();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: B */
    public final int mo2927B() {
        if (mo2938g() == false) goto L6;
        this.f5433h = 0;
        return 0;
    L6:
        int r0 = m2932G();
        this.f5433h = r0;
        if ((r0 >>> 3) == 0) goto L10;
        return r0;
    L10:
        throw C0673Pl.m1364a();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: C */
    public final int mo2928C() {
        return m2932G();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: D */
    public final long mo2929D() {
        return m2933H();
    }

    /* JADX INFO: renamed from: E */
    public final int m2930E() {
        int r0 = this.f5431f;
        if ((this.f5429d - r0) < 4) goto L7;
        this.f5431f = r0 + 4;
        byte[] r1 = this.f5428c;
        int r2 = ((r1[r0] & 255) | ((r1[r0 + 1] & 255) << 8)) | ((r1[r0 + 2] & 255) << 16);
        return ((r1[r0 + 3] & 255) << 24) | r2;
    L7:
        throw C0673Pl.m1370g();
    }

    /* JADX INFO: renamed from: F */
    public final long m2931F() {
        int r0 = this.f5431f;
        if ((this.f5429d - r0) < 8) goto L7;
        this.f5431f = r0 + 8;
        byte[] r1 = this.f5428c;
        long r2 = ((((((((long) r1[r0]) & 255) | ((((long) r1[r0 + 1]) & 255) << 8)) | ((((long) r1[r0 + 2]) & 255) << 16)) | ((((long) r1[r0 + 3]) & 255) << 24)) | ((((long) r1[r0 + 4]) & 255) << 32)) | ((((long) r1[r0 + 5]) & 255) << 40)) | ((((long) r1[r0 + 6]) & 255) << 48);
        return ((((long) r1[r0 + 7]) & 255) << 56) | r2;
    L7:
        throw C0673Pl.m1370g();
    }

    /* JADX INFO: renamed from: G */
    public final int m2932G() {
        int r0 = this.f5431f;
        int r1 = this.f5429d;
        if (r1 == r0) goto L36;
        int r2 = r0 + 1;
        byte[] r3 = this.f5428c;
        byte r4 = r3[r0];
        if (r4 < 0) goto L10;
        this.f5431f = r2;
        return r4;
    L10:
        if ((r1 - r2) < 9) goto L36;
        int r12 = r0 + 2;
        int r22 = (r3[r2] << 7) ^ r4;
        if (r22 >= 0) goto L15;
        int r02 = r22 ^ (-128);
    L40:
        this.f5431f = r12;
        return r02;
    L15:
        int r42 = r0 + 3;
        int r13 = (r3[r12] << 14) ^ r22;
        if (r13 < 0) goto L19;
        r02 = r13 ^ 16256;
    L18:
        r12 = r42;
        goto L40
    L19:
        int r23 = r0 + 4;
        int r14 = r13 ^ (r3[r42] << 21);
        if (r14 >= 0) goto L23;
        r02 = (-2080896) ^ r14;
    L22:
        r12 = r23;
        goto L40
    L23:
        r42 = r0 + 5;
        byte r24 = r3[r23];
        int r15 = (r14 ^ (r24 << 28)) ^ 266354560;
        if (r24 >= 0) goto L38;
        r23 = r0 + 6;
        if (r3[r42] >= 0) goto L39;
        r42 = r0 + 7;
        if (r3[r23] >= 0) goto L38;
        r23 = r0 + 8;
        if (r3[r42] >= 0) goto L39;
        r42 = r0 + 9;
        if (r3[r23] >= 0) goto L38;
        int r03 = r0 + 10;
        if (r3[r42] < 0) goto L36;
        r12 = r03;
        r02 = r15;
    L39:
        r02 = r15;
    L38:
        r02 = r15;
    L36:
        return (int) m2934I();
    }

    /* JADX INFO: renamed from: H */
    public final long m2933H() {
        int r0 = this.f5431f;
        int r1 = this.f5429d;
        if (r1 == r0) goto L41;
        int r2 = r0 + 1;
        byte[] r3 = this.f5428c;
        byte r4 = r3[r0];
        if (r4 < 0) goto L10;
        this.f5431f = r2;
        return r4;
    L10:
        if ((r1 - r2) < 9) goto L41;
        int r12 = r0 + 2;
        int r22 = (r3[r2] << 7) ^ r4;
        if (r22 >= 0) goto L15;
        long r23 = r22 ^ (-128);
    L44:
        this.f5431f = r12;
        return r23;
    L15:
        int r42 = r0 + 3;
        int r13 = (r3[r12] << 14) ^ r22;
        if (r13 < 0) goto L18;
        r23 = r13 ^ 16256;
        r12 = r42;
        goto L44
    L18:
        int r24 = r0 + 4;
        int r14 = r13 ^ (r3[r42] << 21);
        if (r14 >= 0) goto L22;
        long r02 = (-2080896) ^ r14;
    L21:
        r12 = r24;
        r23 = r02;
        goto L44
    L22:
        long r43 = r14;
        r12 = r0 + 5;
        long r44 = r43 ^ (((long) r3[r24]) << 28);
        if (r44 < 0) goto L26;
        long r25 = 266354560;
    L25:
        r23 = r25 ^ r44;
        goto L44
    L26:
        r24 = r0 + 6;
        long r45 = r44 ^ (((long) r3[r12]) << 35);
        if (r45 >= 0) goto L30;
        long r03 = -34093383808L;
    L29:
        r02 = r03 ^ r45;
        goto L21
    L30:
        r12 = r0 + 7;
        r44 = r45 ^ (((long) r3[r24]) << 42);
        if (r44 < 0) goto L33;
        r25 = 4363953127296L;
        goto L25
    L33:
        r24 = r0 + 8;
        r45 = r44 ^ (((long) r3[r12]) << 49);
        if (r45 >= 0) goto L36;
        r03 = -558586000294016L;
        goto L29
    L36:
        r12 = r0 + 9;
        long r46 = (r45 ^ (((long) r3[r24]) << 56)) ^ 71499008037633920L;
        if (r46 >= 0) goto L43;
        int r04 = r0 + 10;
        if (r3[r12] < 0) goto L41;
        r12 = r04;
    L43:
        r23 = r46;
    L41:
        return m2934I();
    }

    /* JADX INFO: renamed from: I */
    public final long m2934I() {
        long r0 = 0;
        int r2 = 0;
    L4:
        if (r2 >= 64) goto L14;
        int r3 = this.f5431f;
        if (r3 == this.f5429d) goto L12;
        this.f5431f = r3 + 1;
        byte r32 = this.f5428c[r3];
        r0 = r0 | (((long) (r32 & 127)) << r2);
        if ((r32 & 128) == 0) goto L9;
        r2 = r2 + 7;
        goto L4
    L9:
        return r0;
    L12:
        throw C0673Pl.m1370g();
    L14:
        throw C0673Pl.m1367d();
    }

    /* JADX INFO: renamed from: J */
    public final void m2935J() {
        int r0 = this.f5429d + this.f5430e;
        this.f5429d = r0;
        int r1 = r0 - this.f5432g;
        int r2 = this.f5434i;
        if (r1 <= r2) goto L6;
        int r12 = r1 - r2;
        this.f5430e = r12;
        this.f5429d = r0 - r12;
        return;
    L6:
        this.f5430e = 0;
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: b */
    public final void mo2936b(int r2) {
        if (this.f5433h != r2) goto L6;
        return;
    L6:
        throw new C0673Pl("Protocol message end-group tag did not match expected tag.");
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: f */
    public final int mo2937f() {
        return this.f5431f - this.f5432g;
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: g */
    public final boolean mo2938g() {
        if (this.f5431f != this.f5429d) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: j */
    public final void mo2939j(int r1) {
        this.f5434i = r1;
        m2935J();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: l */
    public final int mo2940l(int r2) {
        if (r2 < 0) goto L14;
        int r0 = mo2937f() + r2;
        if (r0 < 0) goto L12;
        int r22 = this.f5434i;
        if (r0 > r22) goto L10;
        this.f5434i = r0;
        m2935J();
        return r22;
    L10:
        throw C0673Pl.m1370g();
    L12:
        throw C0673Pl.m1369f();
    L14:
        throw C0673Pl.m1368e();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: m */
    public final boolean mo2941m() {
        if (m2933H() == 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: n */
    public final C2701x6 mo2942n() {
        int r0 = m2932G();
        byte[] r1 = this.f5428c;
        if (r0 <= 0) goto L8;
        int r2 = this.f5429d;
        int r3 = this.f5431f;
        if (r0 > (r2 - r3)) goto L8;
        C2701x6 r12 = AbstractC2744y6.m5328c(r1, r3, r0);
        this.f5431f += r0;
        return r12;
    L8:
        if (r0 == 0) goto L10;
        if (r0 <= 0) goto L15;
        int r22 = this.f5429d;
        int r32 = this.f5431f;
        if (r0 > (r22 - r32)) goto L15;
        int r02 = r0 + r32;
        this.f5431f = r02;
        byte[] r03 = Arrays.copyOfRange(r1, r32, r02);
    L18:
        C2701x6 r13 = AbstractC2744y6.f9369b;
        return new C2701x6(r03);
    L15:
        if (r0 > 0) goto L23;
        if (r0 != 0) goto L21;
        r03 = AbstractC0501Ll.f1638b;
        goto L18
    L21:
        throw C0673Pl.m1368e();
    L23:
        throw C0673Pl.m1370g();
    L10:
        return AbstractC2744y6.f9369b;
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: o */
    public final double mo2943o() {
        return Double.longBitsToDouble(m2931F());
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: p */
    public final int mo2944p() {
        return m2932G();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: q */
    public final int mo2945q() {
        return m2930E();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: r */
    public final long mo2946r() {
        return m2931F();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: s */
    public final float mo2947s() {
        return Float.intBitsToFloat(m2930E());
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: t */
    public final int mo2948t() {
        return m2932G();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: u */
    public final long mo2949u() {
        return m2933H();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: v */
    public final int mo2950v() {
        return m2930E();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: w */
    public final long mo2951w() {
        return m2931F();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: x */
    public final int mo2952x() {
        return AbstractC2140ka.m4321d(m2932G());
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: y */
    public final long mo2953y() {
        return AbstractC2140ka.m4322e(m2933H());
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: z */
    public final String mo2954z() {
        int r0 = m2932G();
        if (r0 <= 0) goto L8;
        int r1 = this.f5429d;
        int r2 = this.f5431f;
        if (r0 > (r1 - r2)) goto L8;
        String r12 = new String(this.f5428c, r2, r0, AbstractC0501Ll.f1637a);
        this.f5431f += r0;
        return r12;
    L8:
        if (r0 != 0) goto L11;
        return "";
    L11:
        if (r0 >= 0) goto L15;
        throw C0673Pl.m1368e();
    L15:
        throw C0673Pl.m1370g();
    }
}
