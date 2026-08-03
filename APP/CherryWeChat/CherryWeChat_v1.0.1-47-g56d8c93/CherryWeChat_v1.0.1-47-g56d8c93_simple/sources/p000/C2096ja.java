package p000;

import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ja */
/* JADX INFO: loaded from: classes.dex */
public final class C2096ja extends AbstractC2140ka {

    /* JADX INFO: renamed from: c */
    public final ByteArrayInputStream f7372c;

    /* JADX INFO: renamed from: d */
    public final byte[] f7373d;

    /* JADX INFO: renamed from: e */
    public int f7374e;

    /* JADX INFO: renamed from: f */
    public int f7375f;

    /* JADX INFO: renamed from: g */
    public int f7376g;

    /* JADX INFO: renamed from: h */
    public int f7377h;

    /* JADX INFO: renamed from: i */
    public int f7378i;

    /* JADX INFO: renamed from: j */
    public int f7379j;

    public C2096ja(ByteArrayInputStream r2) {
        this.f7379j = Integer.MAX_VALUE;
        Charset r0 = AbstractC0501Ll.f1637a;
        this.f7372c = r2;
        this.f7373d = new byte[4096];
        this.f7374e = 0;
        this.f7376g = 0;
        this.f7378i = 0;
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: A */
    public final String mo2926A() {
        int r0 = m4286J();
        int r1 = this.f7376g;
        int r2 = this.f7374e;
        int r3 = r2 - r1;
        byte[] r4 = this.f7373d;
        if (r0 > r3) goto L6;
        if (r0 <= 0) goto L6;
        this.f7376g = r1 + r0;
    L14:
        return AbstractC2536tD.f8842a.mo1360i(r4, r1, r0);
    L6:
        if (r0 != 0) goto L9;
        return "";
    L9:
        r1 = 0;
        if (r0 > r2) goto L12;
        m4290N(r0);
        this.f7376g = r0;
        goto L14
    L12:
        r4 = m4281E(r0);
        goto L14
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: B */
    public final int mo2927B() {
        if (mo2938g() == false) goto L6;
        this.f7377h = 0;
        return 0;
    L6:
        int r0 = m4286J();
        this.f7377h = r0;
        if ((r0 >>> 3) == 0) goto L10;
        return r0;
    L10:
        throw C0673Pl.m1364a();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: C */
    public final int mo2928C() {
        return m4286J();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: D */
    public final long mo2929D() {
        return m4287K();
    }

    /* JADX INFO: renamed from: E */
    public final byte[] m4281E(int r6) {
        byte[] r0 = m4282F(r6);
        if (r0 == null) goto L5;
        return r0;
    L5:
        int r02 = this.f7376g;
        int r1 = this.f7374e;
        int r2 = r1 - r02;
        this.f7378i += r1;
        this.f7376g = 0;
        this.f7374e = 0;
        ArrayList r3 = m4283G(r6 - r2);
        byte[] r62 = new byte[r6];
        System.arraycopy(this.f7373d, r02, r62, 0, r2);
        Iterator r03 = r3.iterator();
    L7:
        if (r03.hasNext() == false) goto L9;
        byte[] r32 = (byte[]) r03.next();
        System.arraycopy(r32, 0, r62, r2, r32.length);
        r2 = r2 + r32.length;
        goto L7
    L9:
        return r62;
    }

    /* JADX INFO: renamed from: F */
    public final byte[] m4282F(int r8) {
        if (r8 == 0) goto L4;
        if (r8 < 0) goto L38;
        int r0 = this.f7378i;
        int r1 = this.f7376g;
        int r2 = (r0 + r1) + r8;
        if ((r2 - Integer.MAX_VALUE) > 0) goto L36;
        int r3 = this.f7379j;
        if (r2 > r3) goto L33;
        int r02 = this.f7374e - r1;
        int r12 = r8 - r02;
        ByteArrayInputStream r4 = this.f7372c;
        if (r12 >= 4096) goto L41;
    L20:
        byte[] r13 = new byte[r8];
        System.arraycopy(this.f7373d, this.f7376g, r13, 0, r02);
        this.f7378i += this.f7374e;
        this.f7376g = 0;
        this.f7374e = 0;
    L21:
        if (r02 >= r8) goto L32;
        int r22 = r4.read(r13, r02, r8 - r02);     // Catch: C0673Pl -> L29
        if (r22 == (-1)) goto L28;
        this.f7378i += r22;
        r02 = r02 + r22;
        goto L21
    L28:
        throw C0673Pl.m1370g();
    L29:
        e = move-exception;
        e.f2146a = true;
        throw e;
    L32:
        return r13;
    L41:
        if (r12 <= r4.available()) goto L20;
        return null;
    L17:
        e = move-exception;
        e.f2146a = true;
        throw e;
    L33:
        m4291O((r3 - r0) - r1);
        throw C0673Pl.m1370g();
    L36:
        throw new C0673Pl("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    L38:
        throw C0673Pl.m1368e();
    L4:
        return AbstractC0501Ll.f1638b;
    }

    /* JADX INFO: renamed from: G */
    public final ArrayList m4283G(int r7) {
        ArrayList r0 = new ArrayList();
    L3:
        if (r7 <= 0) goto L12;
        int r1 = Math.min(r7, 4096);
        byte[] r2 = new byte[r1];
        int r3 = 0;
    L5:
        if (r3 >= r1) goto L11;
        int r4 = this.f7372c.read(r2, r3, r1 - r3);
        if (r4 == (-1)) goto L10;
        this.f7378i += r4;
        r3 = r3 + r4;
        goto L5
    L10:
        throw C0673Pl.m1370g();
    L11:
        r7 = r7 - r1;
        r0.add(r2);
        goto L3
    L12:
        return r0;
    }

    /* JADX INFO: renamed from: H */
    public final int m4284H() {
        int r0 = this.f7376g;
        if ((this.f7374e - r0) >= 4) goto L5;
        m4290N(4);
        r0 = this.f7376g;
    L5:
        this.f7376g = r0 + 4;
        byte[] r1 = this.f7373d;
        int r2 = ((r1[r0] & 255) | ((r1[r0 + 1] & 255) << 8)) | ((r1[r0 + 2] & 255) << 16);
        return ((r1[r0 + 3] & 255) << 24) | r2;
    }

    /* JADX INFO: renamed from: I */
    public final long m4285I() {
        int r0 = this.f7376g;
        if ((this.f7374e - r0) >= 8) goto L5;
        m4290N(8);
        r0 = this.f7376g;
    L5:
        this.f7376g = r0 + 8;
        byte[] r1 = this.f7373d;
        long r2 = ((((((((long) r1[r0]) & 255) | ((((long) r1[r0 + 1]) & 255) << 8)) | ((((long) r1[r0 + 2]) & 255) << 16)) | ((((long) r1[r0 + 3]) & 255) << 24)) | ((((long) r1[r0 + 4]) & 255) << 32)) | ((((long) r1[r0 + 5]) & 255) << 40)) | ((((long) r1[r0 + 6]) & 255) << 48);
        return ((((long) r1[r0 + 7]) & 255) << 56) | r2;
    }

    /* JADX INFO: renamed from: J */
    public final int m4286J() {
        int r0 = this.f7376g;
        int r1 = this.f7374e;
        if (r1 == r0) goto L36;
        int r2 = r0 + 1;
        byte[] r3 = this.f7373d;
        byte r4 = r3[r0];
        if (r4 < 0) goto L10;
        this.f7376g = r2;
        return r4;
    L10:
        if ((r1 - r2) < 9) goto L36;
        int r12 = r0 + 2;
        int r22 = (r3[r2] << 7) ^ r4;
        if (r22 >= 0) goto L15;
        int r02 = r22 ^ (-128);
    L40:
        this.f7376g = r12;
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
        return (int) m4288L();
    }

    /* JADX INFO: renamed from: K */
    public final long m4287K() {
        int r0 = this.f7376g;
        int r1 = this.f7374e;
        if (r1 == r0) goto L41;
        int r2 = r0 + 1;
        byte[] r3 = this.f7373d;
        byte r4 = r3[r0];
        if (r4 < 0) goto L10;
        this.f7376g = r2;
        return r4;
    L10:
        if ((r1 - r2) < 9) goto L41;
        int r12 = r0 + 2;
        int r22 = (r3[r2] << 7) ^ r4;
        if (r22 >= 0) goto L15;
        long r23 = r22 ^ (-128);
    L44:
        this.f7376g = r12;
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
        return m4288L();
    }

    /* JADX INFO: renamed from: L */
    public final long m4288L() {
        long r0 = 0;
        int r2 = 0;
    L4:
        if (r2 >= 64) goto L13;
        if (this.f7376g != this.f7374e) goto L8;
        m4290N(1);
    L8:
        int r3 = this.f7376g;
        this.f7376g = r3 + 1;
        byte r32 = this.f7373d[r3];
        r0 = r0 | (((long) (r32 & 127)) << r2);
        if ((r32 & 128) == 0) goto L10;
        r2 = r2 + 7;
        goto L4
    L10:
        return r0;
    L13:
        throw C0673Pl.m1367d();
    }

    /* JADX INFO: renamed from: M */
    public final void m4289M() {
        int r0 = this.f7374e + this.f7375f;
        this.f7374e = r0;
        int r1 = this.f7378i + r0;
        int r2 = this.f7379j;
        if (r1 <= r2) goto L6;
        int r12 = r1 - r2;
        this.f7375f = r12;
        this.f7374e = r0 - r12;
        return;
    L6:
        this.f7375f = 0;
    }

    /* JADX INFO: renamed from: N */
    public final void m4290N(int r3) {
        if (m4292P(r3) == false) goto L5;
        return;
    L5:
        if (r3 <= ((Integer.MAX_VALUE - this.f7378i) - this.f7376g)) goto L9;
        throw new C0673Pl("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    L9:
        throw C0673Pl.m1370g();
    }

    /* JADX INFO: renamed from: O */
    public final void m4291O(int r10) {
        int r0 = this.f7374e;
        int r1 = this.f7376g;
        int r02 = r0 - r1;
        if (r10 > r02) goto L7;
        if (r10 < 0) goto L7;
        this.f7376g = r1 + r10;
        return;
    L7:
        ByteArrayInputStream r2 = this.f7372c;
        if (r10 < 0) goto L43;
        int r3 = this.f7378i;
        int r4 = r3 + r1;
        int r5 = r4 + r10;
        int r6 = this.f7379j;
        if (r5 > r6) goto L40;
        this.f7378i = r4;
        this.f7374e = 0;
        this.f7376g = 0;
    L13:
        if (r02 >= r10) goto L32;
        long r32 = r10 - r02;
        long r52 = r2.skip(r32);     // Catch: Throwable -> L25 C0673Pl -> L27
    L17:
        if (r52 < 0) goto L24;
        if (r52 > r32) goto L24;
        if (r52 == 0) goto L32;
        r02 = r02 + ((int) r52);
    L24:
        throw new IllegalStateException(r2.getClass() + "#skip returned invalid result: " + r52 + "\nThe InputStream implementation is buggy.");     // Catch: Throwable -> L25
    L27:
        e = move-exception;
        e.f2146a = true;     // Catch: Throwable -> L25
        throw e;     // Catch: Throwable -> L25
    L25:
        th = move-exception;
        this.f7378i += r02;
        m4289M();
        throw th;
    L32:
        this.f7378i += r02;
        m4289M();
        if (r02 >= r10) goto L51;
        int r03 = this.f7374e;
        int r22 = r03 - this.f7376g;
        this.f7376g = r03;
        m4290N(1);
    L35:
        int r04 = r10 - r22;
        int r33 = this.f7374e;
        if (r04 <= r33) goto L38;
        r22 = r22 + r33;
        this.f7376g = r33;
        m4290N(1);
        goto L35
    L38:
        this.f7376g = r04;
        return;
    L51:
        return;
    L40:
        m4291O((r6 - r3) - r1);
        throw C0673Pl.m1370g();
    L43:
        throw C0673Pl.m1368e();
    }

    /* JADX INFO: renamed from: P */
    public final boolean m4292P(int r8) {
        ByteArrayInputStream r0 = this.f7372c;
        int r1 = this.f7376g;
        int r2 = r1 + r8;
        int r3 = this.f7374e;
        if (r2 <= r3) goto L35;
        int r22 = this.f7378i;
        if (r8 <= ((Integer.MAX_VALUE - r22) - r1)) goto L8;
    L28:
        return false;
    L8:
        if (((r22 + r1) + r8) > this.f7379j) goto L28;
        byte[] r23 = this.f7373d;
        if (r1 <= 0) goto L15;
        if (r3 <= r1) goto L14;
        System.arraycopy(r23, r1, r23, 0, r3 - r1);
    L14:
        this.f7378i += r1;
        this.f7374e -= r1;
        this.f7376g = 0;
    L15:
        int r12 = this.f7374e;
        int r13 = r0.read(r23, r12, Math.min(r23.length - r12, (Integer.MAX_VALUE - this.f7378i) - r12));     // Catch: C0673Pl -> L31
        if (r13 == 0) goto L30;
        if (r13 < (-1)) goto L30;
        if (r13 > r23.length) goto L30;
        if (r13 <= 0) goto L28;
        this.f7374e += r13;
        m4289M();
        if (this.f7374e < r8) goto L27;
        return true;
    L27:
        return m4292P(r8);
    L30:
        throw new IllegalStateException(r0.getClass() + "#read(byte[]) returned invalid result: " + r13 + "\nThe InputStream implementation is buggy.");
    L31:
        e = move-exception;
        e.f2146a = true;
        throw e;
    L35:
        throw new IllegalStateException(AbstractC2374ph.m4813j(r8, "refillBuffer() called when ", " bytes were already available in buffer"));
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: b */
    public final void mo2936b(int r2) {
        if (this.f7377h != r2) goto L6;
        return;
    L6:
        throw new C0673Pl("Protocol message end-group tag did not match expected tag.");
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: f */
    public final int mo2937f() {
        return this.f7378i + this.f7376g;
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: g */
    public final boolean mo2938g() {
        if (this.f7376g == this.f7374e) goto L5;
        return false;
    L5:
        if (m4292P(1) == true) goto L9;
        return true;
    L9:
        return false;
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: j */
    public final void mo2939j(int r1) {
        this.f7379j = r1;
        m4289M();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: l */
    public final int mo2940l(int r3) {
        if (r3 < 0) goto L10;
        int r0 = (this.f7378i + this.f7376g) + r3;
        int r32 = this.f7379j;
        if (r0 > r32) goto L8;
        this.f7379j = r0;
        m4289M();
        return r32;
    L8:
        throw C0673Pl.m1370g();
    L10:
        throw C0673Pl.m1368e();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: m */
    public final boolean mo2941m() {
        if (m4287K() == 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: n */
    public final C2701x6 mo2942n() {
        int r0 = m4286J();
        int r1 = this.f7374e;
        int r2 = this.f7376g;
        int r12 = r1 - r2;
        byte[] r3 = this.f7373d;
        if (r0 > r12) goto L7;
        if (r0 <= 0) goto L7;
        C2701x6 r13 = AbstractC2744y6.m5328c(r3, r2, r0);
        this.f7376g += r0;
        return r13;
    L7:
        if (r0 == 0) goto L9;
        byte[] r14 = m4282F(r0);
        if (r14 != null) goto L13;
        int r15 = this.f7376g;
        int r4 = this.f7374e;
        int r5 = r4 - r15;
        this.f7378i += r4;
        this.f7376g = 0;
        this.f7374e = 0;
        ArrayList r42 = m4283G(r0 - r5);
        byte[] r02 = new byte[r0];
        System.arraycopy(r3, r15, r02, 0, r5);
        Iterator r16 = r42.iterator();
    L16:
        if (r16.hasNext() == false) goto L18;
        byte[] r32 = (byte[]) r16.next();
        System.arraycopy(r32, 0, r02, r5, r32.length);
        r5 = r5 + r32.length;
        goto L16
    L18:
        C2701x6 r17 = AbstractC2744y6.f9369b;
        return new C2701x6(r02);
    L13:
        return AbstractC2744y6.m5328c(r14, 0, r14.length);
    L9:
        return AbstractC2744y6.f9369b;
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: o */
    public final double mo2943o() {
        return Double.longBitsToDouble(m4285I());
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: p */
    public final int mo2944p() {
        return m4286J();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: q */
    public final int mo2945q() {
        return m4284H();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: r */
    public final long mo2946r() {
        return m4285I();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: s */
    public final float mo2947s() {
        return Float.intBitsToFloat(m4284H());
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: t */
    public final int mo2948t() {
        return m4286J();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: u */
    public final long mo2949u() {
        return m4287K();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: v */
    public final int mo2950v() {
        return m4284H();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: w */
    public final long mo2951w() {
        return m4285I();
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: x */
    public final int mo2952x() {
        return AbstractC2140ka.m4321d(m4286J());
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: y */
    public final long mo2953y() {
        return AbstractC2140ka.m4322e(m4287K());
    }

    @Override // p000.AbstractC2140ka
    /* JADX INFO: renamed from: z */
    public final String mo2954z() {
        int r0 = m4286J();
        byte[] r1 = this.f7373d;
        if (r0 <= 0) goto L8;
        int r2 = this.f7374e;
        int r3 = this.f7376g;
        if (r0 > (r2 - r3)) goto L8;
        String r22 = new String(r1, r3, r0, AbstractC0501Ll.f1637a);
        this.f7376g += r0;
        return r22;
    L8:
        if (r0 != 0) goto L12;
        return "";
    L12:
        if (r0 > this.f7374e) goto L16;
        m4290N(r0);
        String r23 = new String(r1, this.f7376g, r0, AbstractC0501Ll.f1637a);
        this.f7376g += r0;
        return r23;
    L16:
        return new String(m4281E(r0), AbstractC0501Ll.f1637a);
    }
}
