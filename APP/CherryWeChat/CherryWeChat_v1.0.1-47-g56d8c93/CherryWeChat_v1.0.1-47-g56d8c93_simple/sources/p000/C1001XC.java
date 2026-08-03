package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: XC */
/* JADX INFO: loaded from: classes.dex */
public final class C1001XC {

    /* JADX INFO: renamed from: f */
    public static final C1001XC f3195f = null;

    /* JADX INFO: renamed from: a */
    public int f3196a;

    /* JADX INFO: renamed from: b */
    public int[] f3197b;

    /* JADX INFO: renamed from: c */
    public Object[] f3198c;

    /* JADX INFO: renamed from: d */
    public int f3199d;

    /* JADX INFO: renamed from: e */
    public boolean f3200e;

    static {
        f3195f = new C1001XC(0, new int[0], new Object[0], false);
    }

    public C1001XC(int r2, int[] r3, Object[] r4, boolean r5) {
        this.f3199d = -1;
        this.f3196a = r2;
        this.f3197b = r3;
        this.f3198c = r4;
        this.f3200e = r5;
    }

    /* JADX INFO: renamed from: c */
    public static C1001XC m1891c() {
        return new C1001XC(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: a */
    public final void m1892a(int r4) {
        int[] r0 = this.f3197b;
        if (r4 <= r0.length) goto L13;
        int r1 = this.f3196a;
        int r2 = (r1 / 2) + r1;
        if (r2 < r4) goto L9;
        r4 = r2;
    L9:
        if (r4 >= 8) goto L11;
        r4 = 8;
    L11:
        this.f3197b = Arrays.copyOf(r0, r4);
        this.f3198c = Arrays.copyOf(this.f3198c, r4);
        return;
    }

    /* JADX INFO: renamed from: b */
    public final int m1893b() {
        int r0 = this.f3199d;
        if (r0 == (-1)) goto L5;
        return r0;
    L5:
        int r02 = 0;
        int r1 = 0;
    L7:
        if (r02 >= this.f3196a) goto L28;
        int r2 = this.f3197b[r02];
        int r3 = r2 >>> 3;
        int r22 = r2 & 7;
        if (r22 != 0) goto L11;
        long r4 = ((Long) this.f3198c[r02]).longValue();
        int r23 = C2230ma.m4524Q(r3);
        int r32 = C2230ma.m4526S(r4);
    L23:
        r1 = (r32 + r23) + r1;
    L27:
        r02 = r02 + 1;
        goto L7
    L11:
        if (r22 != 1) goto L13;
        ((Long) this.f3198c[r02]).getClass();
        int r24 = C2230ma.m4520M(r3);
    L19:
        r1 = r24 + r1;
        goto L27
    L13:
        if (r22 != 2) goto L15;
        r24 = C2230ma.m4517J(r3, (AbstractC2744y6) this.f3198c[r02]);
        goto L19
    L15:
        if (r22 != 3) goto L17;
        r23 = C2230ma.m4524Q(r3) * 2;
        r32 = ((C1001XC) this.f3198c[r02]).m1893b();
        goto L23
    L17:
        if (r22 != 5) goto L21;
        ((Integer) this.f3198c[r02]).getClass();
        r24 = C2230ma.m4519L(r3);
        goto L19
    L21:
        throw new IllegalStateException(C0673Pl.m1366c());
    L28:
        this.f3199d = r1;
        return r1;
    }

    /* JADX INFO: renamed from: d */
    public final void m1894d(int r3, Object r4) {
        if (this.f3200e == false) goto L7;
        m1892a(this.f3196a + 1);
        int[] r0 = this.f3197b;
        int r1 = this.f3196a;
        r0[r1] = r3;
        this.f3198c[r1] = r4;
        this.f3196a = r1 + 1;
        return;
    L7:
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: e */
    public final void m1895e(C0132D2 r7) {
        if (this.f3196a == 0) goto L26;
        r7.getClass();
        C2230ma r0 = (C2230ma) r7.f328b;
        int r1 = 0;
    L7:
        if (r1 >= this.f3196a) goto L34;
        int r2 = this.f3197b[r1];
        Object r3 = this.f3198c[r1];
        int r4 = r2 >>> 3;
        int r22 = r2 & 7;
        if (r22 != 0) goto L11;
        r0.m4536c0(r4, ((Long) r3).longValue());
    L25:
        r1 = r1 + 1;
        goto L7
    L11:
        if (r22 != 1) goto L13;
        r0.m4531X(r4, ((Long) r3).longValue());
        goto L25
    L13:
        if (r22 != 2) goto L15;
        r7.m250y(r4, (AbstractC2744y6) r3);
        goto L25
    L15:
        if (r22 != 3) goto L17;
        r0.m4534a0(r4, 3);
        ((C1001XC) r3).m1895e(r7);
        r0.m4534a0(r4, 4);
        goto L25
    L17:
        if (r22 != 5) goto L20;
        r0.m4529V(r4, ((Integer) r3).intValue());
        goto L25
    L20:
        throw new RuntimeException(C0673Pl.m1366c());
    L34:
        return;
    }

    public final boolean equals(Object r9) {
        if (this != r9) goto L6;
        return true;
    L6:
        if (r9 != null) goto L9;
        return false;
    L9:
        if ((r9 instanceof C1001XC) == true) goto L11;
        return false;
    L11:
        C1001XC r92 = (C1001XC) r9;
        int r2 = this.f3196a;
        if (r2 != r92.f3196a) goto L26;
        int[] r3 = this.f3197b;
        int[] r4 = r92.f3197b;
        int r5 = 0;
    L14:
        if (r5 >= r2) goto L19;
        if (r3[r5] != r4[r5]) goto L26;
        r5 = r5 + 1;
        goto L14
    L19:
        Object[] r22 = this.f3198c;
        Object[] r93 = r92.f3198c;
        int r32 = this.f3196a;
        int r42 = 0;
    L20:
        if (r42 >= r32) goto L25;
        if (r22[r42].equals(r93[r42]) == false) goto L26;
        r42 = r42 + 1;
        goto L20
    L25:
        return true;
    L26:
        return false;
    }

    public final int hashCode() {
        int r0 = this.f3196a;
        int r1 = (527 + r0) * 31;
        int[] r2 = this.f3197b;
        int r3 = 17;
        int r4 = 0;
        int r6 = 17;
        int r5 = 0;
    L3:
        if (r5 >= r0) goto L5;
        r6 = (r6 * 31) + r2[r5];
        r5 = r5 + 1;
        goto L3
    L5:
        int r12 = (r1 + r6) * 31;
        Object[] r02 = this.f3198c;
        int r22 = this.f3196a;
    L6:
        if (r4 >= r22) goto L9;
        r3 = (r3 * 31) + r02[r4].hashCode();
        r4 = r4 + 1;
        goto L6
    L9:
        return r12 + r3;
    }
}
