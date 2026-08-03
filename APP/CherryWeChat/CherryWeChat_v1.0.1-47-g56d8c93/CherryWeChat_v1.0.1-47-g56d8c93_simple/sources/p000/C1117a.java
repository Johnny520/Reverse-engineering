package p000;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: a */
/* JADX INFO: loaded from: classes.dex */
public final class C1117a {

    /* JADX INFO: renamed from: a */
    public int f3525a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f3526b;

    /* JADX INFO: renamed from: c */
    public int f3527c;

    /* JADX INFO: renamed from: d */
    public int f3528d;

    /* JADX INFO: renamed from: e */
    public final C1517hw f3529e;

    public C1117a() {
        if (C1517hw.f5366b != null) goto L5;
        C1517hw.f5366b = new C1517hw(19);
    L5:
        this.f3529e = C1517hw.f5366b;
    }

    /* JADX INFO: renamed from: a */
    public final int m2032a(int r2) {
        return this.f3526b.getInt(r2) + r2;
    }

    /* JADX INFO: renamed from: b */
    public final int m2033b(int r3) {
        if (r3 < this.f3528d) goto L5;
        return 0;
    L5:
        return this.f3526b.getShort(this.f3527c + r3);
    }

    /* JADX INFO: renamed from: c */
    public final void m2034c(int r1, ByteBuffer r2) {
        this.f3526b = r2;
        if (r2 == null) goto L6;
        this.f3525a = r1;
        int r12 = r1 - r2.getInt(r1);
        this.f3527c = r12;
        this.f3528d = this.f3526b.getShort(r12);
        return;
    L6:
        this.f3525a = 0;
        this.f3527c = 0;
        this.f3528d = 0;
    }

    /* JADX INFO: renamed from: d */
    public final String m2035d(int r14) {
        ByteBuffer r0 = this.f3526b;
        int r1 = r0.getInt(r14) + r14;
        int r142 = r0.getInt(r1);
        int r12 = r1 + 4;
        this.f3529e.getClass();
        if (r0.hasArray() == false) goto L42;
        byte[] r2 = r0.array();
        int r02 = r0.arrayOffset() + r12;
        if (((r02 | r142) | ((r2.length - r02) - r142)) < 0) goto L40;
        int r13 = r02 + r142;
        char[] r11 = new char[r142];
        int r143 = 0;
    L7:
        if (r02 >= r13) goto L11;
        byte r7 = r2[r02];
        if (r7 < 0) goto L11;
        r02 = r02 + 1;
        r11[r143] = (char) r7;
        r143 = r143 + 1;
    L11:
        int r122 = r143;
    L12:
        if (r02 >= r13) goto L38;
        int r144 = r02 + 1;
        byte r72 = r2[r02];
        if (r72 >= 0) goto L15;
        if (r72 < (-32)) goto L22;
        if (r72 < (-16)) goto L28;
        if (r144 >= (r13 - 2)) goto L36;
        byte r145 = r2[r144];
        int r9 = r02 + 3;
        byte r8 = r2[r02 + 2];
        r02 = r02 + 4;
        AbstractC0585Nj.m1122A(r72, r145, r8, r2[r9], r11, r122);
        r122 = r122 + 2;
        goto L12
    L36:
        throw new IllegalArgumentException("Invalid UTF-8");
    L28:
        if (r144 >= (r13 - 1)) goto L31;
        int r82 = r02 + 2;
        r02 = r02 + 3;
        AbstractC0585Nj.m1123B(r72, r2[r144], r2[r82], r11, r122);
        r122 = r122 + 1;
        goto L12
    L31:
        throw new IllegalArgumentException("Invalid UTF-8");
    L22:
        if (r144 >= r13) goto L25;
        r02 = r02 + 2;
        AbstractC0585Nj.m1124C(r72, r2[r144], r11, r122);
        r122 = r122 + 1;
        goto L12
    L25:
        throw new IllegalArgumentException("Invalid UTF-8");
    L15:
        int r03 = r122 + 1;
        r11[r122] = (char) r72;
    L16:
        if (r144 >= r13) goto L20;
        byte r73 = r2[r144];
        if (r73 < 0) goto L20;
        r144 = r144 + 1;
        r11[r03] = (char) r73;
        r03 = r03 + 1;
    L20:
        r122 = r03;
        r02 = r144;
        goto L12
    L38:
        return new String(r11, 0, r122);
    L40:
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(r2.length), Integer.valueOf(r02), Integer.valueOf(r142)}));
    L42:
        if (((r12 | r142) | ((r0.limit() - r12) - r142)) < 0) goto L77;
        int r22 = r12 + r142;
        char[] r112 = new char[r142];
        int r146 = 0;
    L44:
        if (r12 >= r22) goto L48;
        byte r74 = r0.get(r12);
        if (r74 < 0) goto L48;
        r12 = r12 + 1;
        r112[r146] = (char) r74;
        r146 = r146 + 1;
    L48:
        int r123 = r146;
    L49:
        if (r12 >= r22) goto L75;
        int r147 = r12 + 1;
        byte r75 = r0.get(r12);
        if (r75 >= 0) goto L52;
        if (r75 < (-32)) goto L59;
        if (r75 < (-16)) goto L65;
        if (r147 >= (r22 - 2)) goto L73;
        byte r148 = r0.get(r147);
        int r92 = r12 + 3;
        byte r83 = r0.get(r12 + 2);
        r12 = r12 + 4;
        AbstractC0585Nj.m1122A(r75, r148, r83, r0.get(r92), r112, r123);
        r123 = r123 + 2;
        goto L49
    L73:
        throw new IllegalArgumentException("Invalid UTF-8");
    L65:
        if (r147 >= (r22 - 1)) goto L68;
        int r84 = r12 + 2;
        r12 = r12 + 3;
        AbstractC0585Nj.m1123B(r75, r0.get(r147), r0.get(r84), r112, r123);
        r123 = r123 + 1;
        goto L49
    L68:
        throw new IllegalArgumentException("Invalid UTF-8");
    L59:
        if (r147 >= r22) goto L62;
        r12 = r12 + 2;
        AbstractC0585Nj.m1124C(r75, r0.get(r147), r112, r123);
        r123 = r123 + 1;
        goto L49
    L62:
        throw new IllegalArgumentException("Invalid UTF-8");
    L52:
        int r15 = r123 + 1;
        r112[r123] = (char) r75;
    L53:
        if (r147 >= r22) goto L57;
        byte r76 = r0.get(r147);
        if (r76 < 0) goto L57;
        r147 = r147 + 1;
        r112[r15] = (char) r76;
        r15 = r15 + 1;
    L57:
        r123 = r15;
        r12 = r147;
        goto L49
    L75:
        return new String(r112, 0, r123);
    L77:
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(r0.limit()), Integer.valueOf(r12), Integer.valueOf(r142)}));
    }

    /* JADX INFO: renamed from: e */
    public final int m2036e(int r2) {
        int r22 = r2 + this.f3525a;
        return (this.f3526b.getInt(r22) + r22) + 4;
    }

    /* JADX INFO: renamed from: f */
    public final int m2037f(int r2) {
        int r22 = r2 + this.f3525a;
        int r0 = this.f3526b.getInt(r22) + r22;
        return this.f3526b.getInt(r0);
    }

    /* JADX INFO: renamed from: g */
    public C1117a m2038g(int r4) {
        C1117a r0 = new C1117a();
        int r2 = m2033b(4);
        if (r2 == 0) goto L6;
        int r42 = r4 * 4;
        r0.m2034c(m2032a(r42 + m2036e(r2)), this.f3526b);
        return r0;
    L6:
        return null;
    }
}
