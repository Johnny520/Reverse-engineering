package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: XC */
/* JADX INFO: loaded from: classes.dex */
public final class C1001XC {

    /* JADX INFO: renamed from: f */
    public static final C1001XC f3195f = new C1001XC(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f3196a;

    /* JADX INFO: renamed from: b */
    public int[] f3197b;

    /* JADX INFO: renamed from: c */
    public Object[] f3198c;

    /* JADX INFO: renamed from: d */
    public int f3199d = -1;

    /* JADX INFO: renamed from: e */
    public boolean f3200e;

    public C1001XC(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f3196a = i;
        this.f3197b = iArr;
        this.f3198c = objArr;
        this.f3200e = z;
    }

    /* JADX INFO: renamed from: c */
    public static C1001XC m1891c() {
        return new C1001XC(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: a */
    public final void m1892a(int i) {
        int[] iArr = this.f3197b;
        if (i > iArr.length) {
            int i2 = this.f3196a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f3197b = Arrays.copyOf(iArr, i);
            this.f3198c = Arrays.copyOf(this.f3198c, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m1893b() {
        int iM4524Q;
        int iM4526S;
        int iM4520M;
        int i = this.f3199d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f3196a; i3++) {
            int i4 = this.f3197b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.f3198c[i3]).getClass();
                    iM4520M = C2230ma.m4520M(i5);
                } else if (i6 == 2) {
                    iM4520M = C2230ma.m4517J(i5, (AbstractC2744y6) this.f3198c[i3]);
                } else if (i6 == 3) {
                    iM4524Q = C2230ma.m4524Q(i5) * 2;
                    iM4526S = ((C1001XC) this.f3198c[i3]).m1893b();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(C0673Pl.m1366c());
                    }
                    ((Integer) this.f3198c[i3]).getClass();
                    iM4520M = C2230ma.m4519L(i5);
                }
                i2 = iM4520M + i2;
            } else {
                long jLongValue = ((Long) this.f3198c[i3]).longValue();
                iM4524Q = C2230ma.m4524Q(i5);
                iM4526S = C2230ma.m4526S(jLongValue);
            }
            i2 = iM4526S + iM4524Q + i2;
        }
        this.f3199d = i2;
        return i2;
    }

    /* JADX INFO: renamed from: d */
    public final void m1894d(int i, Object obj) {
        if (!this.f3200e) {
            throw new UnsupportedOperationException();
        }
        m1892a(this.f3196a + 1);
        int[] iArr = this.f3197b;
        int i2 = this.f3196a;
        iArr[i2] = i;
        this.f3198c[i2] = obj;
        this.f3196a = i2 + 1;
    }

    /* JADX INFO: renamed from: e */
    public final void m1895e(C0132D2 c0132d2) throws C2273na {
        if (this.f3196a == 0) {
            return;
        }
        c0132d2.getClass();
        C2230ma c2230ma = (C2230ma) c0132d2.f328b;
        for (int i = 0; i < this.f3196a; i++) {
            int i2 = this.f3197b[i];
            Object obj = this.f3198c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                c2230ma.m4536c0(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                c2230ma.m4531X(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                c0132d2.m250y(i3, (AbstractC2744y6) obj);
            } else if (i4 == 3) {
                c2230ma.m4534a0(i3, 3);
                ((C1001XC) obj).m1895e(c0132d2);
                c2230ma.m4534a0(i3, 4);
            } else {
                if (i4 != 5) {
                    throw new RuntimeException(C0673Pl.m1366c());
                }
                c2230ma.m4529V(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1001XC)) {
            return false;
        }
        C1001XC c1001xc = (C1001XC) obj;
        int i = this.f3196a;
        if (i == c1001xc.f3196a) {
            int[] iArr = this.f3197b;
            int[] iArr2 = c1001xc.f3197b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f3198c;
                    Object[] objArr2 = c1001xc.f3198c;
                    int i3 = this.f3196a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f3196a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.f3197b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f3198c;
        int i6 = this.f3196a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
