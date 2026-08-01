package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class l91 {

    /* JADX INFO: renamed from: e */
    public static final l91 f3393e = new l91(0, 0, new Object[0], null);

    /* JADX INFO: renamed from: a */
    public int f3394a;

    /* JADX INFO: renamed from: b */
    public int f3395b;

    /* JADX INFO: renamed from: c */
    public final C0675r3 f3396c;

    /* JADX INFO: renamed from: d */
    public Object[] f3397d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public l91(int i, int i2, Object[] objArr, C0675r3 c0675r3) {
        this.f3394a = i;
        this.f3395b = i2;
        this.f3396c = c0675r3;
        this.f3397d = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static l91 m1984j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, C0675r3 c0675r3) {
        if (i3 > 30) {
            return new l91(0, 0, new Object[]{obj, obj2, obj3, obj4}, c0675r3);
        }
        int iM4917x = w60.m4917x(i, i3);
        int iM4917x2 = w60.m4917x(i2, i3);
        if (iM4917x != iM4917x2) {
            return new l91((1 << iM4917x) | (1 << iM4917x2), 0, iM4917x < iM4917x2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, c0675r3);
        }
        return new l91(0, 1 << iM4917x, new Object[]{m1984j(i, obj, obj2, i2, obj3, obj4, i3 + 5, c0675r3)}, c0675r3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Object[] m1985a(int i, int i2, int i3, Object obj, Object obj2, int i4, C0675r3 c0675r3) {
        Object obj3 = this.f3397d[i];
        l91 l91VarM1984j = m1984j(obj3 != null ? obj3.hashCode() : 0, obj3, m2007x(i), i3, obj, obj2, i4 + 5, c0675r3);
        int iM2003t = m2003t(i2);
        int i5 = iM2003t + 1;
        Object[] objArr = this.f3397d;
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC0201f9.m1059e0(objArr, objArr2, 0, i, 6);
        AbstractC0201f9.m1057c0(objArr, objArr2, i, i + 2, i5);
        objArr2[iM2003t - 1] = l91VarM1984j;
        AbstractC0201f9.m1057c0(objArr, objArr2, iM2003t, i5, objArr.length);
        return objArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m1986b() {
        if (this.f3395b == 0) {
            return this.f3397d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f3394a);
        int length = this.f3397d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += m2002s(i).m1986b();
        }
        return iBitCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m1987c(Object obj) {
        x20 x20VarM4890L = w60.m4890L(w60.m4893O(0, this.f3397d.length));
        int i = x20VarM4890L.f7248d;
        int i2 = x20VarM4890L.f7249e;
        int i3 = x20VarM4890L.f7250f;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!p30.m3002l(obj, this.f3397d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m1988d(int i, int i2, Object obj) {
        int iM4917x = 1 << w60.m4917x(i, i2);
        if (m1992h(iM4917x)) {
            return p30.m3002l(obj, this.f3397d[m1990f(iM4917x)]);
        }
        if (!m1993i(iM4917x)) {
            return false;
        }
        l91 l91VarM2002s = m2002s(m2003t(iM4917x));
        return i2 == 30 ? l91VarM2002s.m1987c(obj) : l91VarM2002s.m1988d(i, i2 + 5, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m1989e(l91 l91Var) {
        if (this == l91Var) {
            return true;
        }
        if (this.f3395b == l91Var.f3395b && this.f3394a == l91Var.f3394a) {
            int length = this.f3397d.length;
            for (int i = 0; i < length; i++) {
                if (this.f3397d[i] == l91Var.f3397d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final int m1990f(int i) {
        return Integer.bitCount(this.f3394a & (i - 1)) * 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final Object m1991g(int i, int i2, Object obj) {
        int iM4917x = 1 << w60.m4917x(i, i2);
        if (m1992h(iM4917x)) {
            int iM1990f = m1990f(iM4917x);
            if (p30.m3002l(obj, this.f3397d[iM1990f])) {
                return m2007x(iM1990f);
            }
            return null;
        }
        if (!m1993i(iM4917x)) {
            return null;
        }
        l91 l91VarM2002s = m2002s(m2003t(iM4917x));
        if (i2 != 30) {
            return l91VarM2002s.m1991g(i, i2 + 5, obj);
        }
        x20 x20VarM4890L = w60.m4890L(w60.m4893O(0, l91VarM2002s.f3397d.length));
        int i3 = x20VarM4890L.f7248d;
        int i4 = x20VarM4890L.f7249e;
        int i5 = x20VarM4890L.f7250f;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!p30.m3002l(obj, l91VarM2002s.f3397d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return l91VarM2002s.m2007x(i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final boolean m1992h(int i) {
        return (this.f3394a & i) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m1993i(int i) {
        return (this.f3395b & i) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final l91 m1994k(int i, eq0 eq0Var) {
        eq0Var.m958e(eq0Var.f1508h - 1);
        eq0Var.f1506f = m2007x(i);
        Object[] objArr = this.f3397d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f3396c != eq0Var.f1504d) {
            return new l91(0, 0, w60.m4897d(i, objArr), eq0Var.f1504d);
        }
        this.f3397d = w60.m4897d(i, objArr);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final l91 m1995l(int i, Object obj, Object obj2, int i2, eq0 eq0Var) {
        eq0 eq0Var2;
        l91 l91VarM1995l;
        int iM4917x = 1 << w60.m4917x(i, i2);
        boolean zM1992h = m1992h(iM4917x);
        C0675r3 c0675r3 = this.f3396c;
        if (zM1992h) {
            int iM1990f = m1990f(iM4917x);
            if (!p30.m3002l(obj, this.f3397d[iM1990f])) {
                eq0Var.m958e(eq0Var.f1508h + 1);
                C0675r3 c0675r32 = eq0Var.f1504d;
                if (c0675r3 != c0675r32) {
                    return new l91(this.f3394a ^ iM4917x, this.f3395b | iM4917x, m1985a(iM1990f, iM4917x, i, obj, obj2, i2, c0675r32), c0675r32);
                }
                this.f3397d = m1985a(iM1990f, iM4917x, i, obj, obj2, i2, c0675r32);
                this.f3394a ^= iM4917x;
                this.f3395b |= iM4917x;
                return this;
            }
            eq0Var.f1506f = m2007x(iM1990f);
            if (m2007x(iM1990f) == obj2) {
                return this;
            }
            if (c0675r3 == eq0Var.f1504d) {
                this.f3397d[iM1990f + 1] = obj2;
                return this;
            }
            eq0Var.f1507g++;
            Object[] objArr = this.f3397d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iM1990f + 1] = obj2;
            return new l91(this.f3394a, this.f3395b, objArrCopyOf, eq0Var.f1504d);
        }
        if (!m1993i(iM4917x)) {
            eq0Var.m958e(eq0Var.f1508h + 1);
            C0675r3 c0675r33 = eq0Var.f1504d;
            int iM1990f2 = m1990f(iM4917x);
            Object[] objArr2 = this.f3397d;
            if (c0675r3 != c0675r33) {
                return new l91(this.f3394a | iM4917x, this.f3395b, w60.m4896c(objArr2, iM1990f2, obj, obj2), c0675r33);
            }
            this.f3397d = w60.m4896c(objArr2, iM1990f2, obj, obj2);
            this.f3394a |= iM4917x;
            return this;
        }
        int iM2003t = m2003t(iM4917x);
        l91 l91VarM2002s = m2002s(iM2003t);
        if (i2 == 30) {
            x20 x20VarM4890L = w60.m4890L(w60.m4893O(0, l91VarM2002s.f3397d.length));
            int i3 = x20VarM4890L.f7248d;
            int i4 = x20VarM4890L.f7249e;
            int i5 = x20VarM4890L.f7250f;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                eq0Var.m958e(eq0Var.f1508h + 1);
                l91VarM1995l = new l91(0, 0, w60.m4896c(l91VarM2002s.f3397d, 0, obj, obj2), eq0Var.f1504d);
                eq0Var2 = eq0Var;
            } else {
                while (!p30.m3002l(obj, l91VarM2002s.f3397d[i3])) {
                    if (i3 == i4) {
                        eq0Var.m958e(eq0Var.f1508h + 1);
                        l91VarM1995l = new l91(0, 0, w60.m4896c(l91VarM2002s.f3397d, 0, obj, obj2), eq0Var.f1504d);
                        break;
                    }
                    i3 += i5;
                }
                eq0Var.f1506f = l91VarM2002s.m2007x(i3);
                if (l91VarM2002s.f3396c == eq0Var.f1504d) {
                    l91VarM2002s.f3397d[i3 + 1] = obj2;
                    l91VarM1995l = l91VarM2002s;
                } else {
                    eq0Var.f1507g++;
                    Object[] objArr3 = l91VarM2002s.f3397d;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                    objArrCopyOf2[i3 + 1] = obj2;
                    l91VarM1995l = new l91(0, 0, objArrCopyOf2, eq0Var.f1504d);
                }
                eq0Var2 = eq0Var;
            }
        } else {
            eq0Var2 = eq0Var;
            l91VarM1995l = l91VarM2002s.m1995l(i, obj, obj2, i2 + 5, eq0Var2);
        }
        return l91VarM2002s == l91VarM1995l ? this : m2001r(iM2003t, l91VarM1995l, eq0Var2.f1504d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final l91 m1996m(l91 l91Var, int i, C0931xm c0931xm, eq0 eq0Var) {
        Object[] objArr;
        l91 l91VarM1984j;
        if (this == l91Var) {
            c0931xm.f7374a += m1986b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            C0675r3 c0675r3 = eq0Var.f1504d;
            int i3 = l91Var.f3395b;
            Object[] objArr2 = this.f3397d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + l91Var.f3397d.length);
            int length = this.f3397d.length;
            x20 x20VarM4890L = w60.m4890L(w60.m4893O(0, l91Var.f3397d.length));
            int i4 = x20VarM4890L.f7248d;
            int i5 = x20VarM4890L.f7249e;
            int i6 = x20VarM4890L.f7250f;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (m1987c(l91Var.f3397d[i4])) {
                        c0931xm.f7374a++;
                    } else {
                        Object[] objArr3 = l91Var.f3397d;
                        objArrCopyOf[length] = objArr3[i4];
                        objArrCopyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.f3397d.length) {
                return length == l91Var.f3397d.length ? l91Var : length == objArrCopyOf.length ? new l91(0, 0, objArrCopyOf, c0675r3) : new l91(0, 0, Arrays.copyOf(objArrCopyOf, length), c0675r3);
            }
        } else {
            int i7 = this.f3395b | l91Var.f3395b;
            int i8 = this.f3394a;
            int i9 = l91Var.f3394a;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i11);
                if (p30.m3002l(this.f3397d[m1990f(iLowestOneBit)], l91Var.f3397d[l91Var.m1990f(iLowestOneBit)])) {
                    i12 |= iLowestOneBit;
                } else {
                    i7 |= iLowestOneBit;
                }
                i11 ^= iLowestOneBit;
            }
            if ((i7 & i12) != 0) {
                wr0.m5025b("Check failed.");
            }
            l91 l91Var2 = (p30.m3002l(this.f3396c, eq0Var.f1504d) && this.f3394a == i12 && this.f3395b == i7) ? this : new l91(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = l91Var2.f3397d;
                int length2 = (objArr4.length - 1) - i14;
                if (m1993i(iLowestOneBit2)) {
                    l91VarM1984j = m2002s(m2003t(iLowestOneBit2));
                    if (l91Var.m1993i(iLowestOneBit2)) {
                        l91VarM1984j = l91VarM1984j.m1996m(l91Var.m2002s(l91Var.m2003t(iLowestOneBit2)), i + 5, c0931xm, eq0Var);
                        objArr = objArr4;
                    } else if (l91Var.m1992h(iLowestOneBit2)) {
                        int iM1990f = l91Var.m1990f(iLowestOneBit2);
                        Object obj = l91Var.f3397d[iM1990f];
                        Object objM2007x = l91Var.m2007x(iM1990f);
                        int i15 = eq0Var.f1508h;
                        objArr = objArr4;
                        l91VarM1984j = l91VarM1984j.m1995l(obj != null ? obj.hashCode() : i2, obj, objM2007x, i + 5, eq0Var);
                        if (eq0Var.f1508h == i15) {
                            c0931xm.f7374a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (l91Var.m1993i(iLowestOneBit2)) {
                        l91 l91VarM2002s = l91Var.m2002s(l91Var.m2003t(iLowestOneBit2));
                        if (m1992h(iLowestOneBit2)) {
                            int iM1990f2 = m1990f(iLowestOneBit2);
                            Object obj2 = this.f3397d[iM1990f2];
                            int i16 = i + 5;
                            if (l91VarM2002s.m1988d(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                c0931xm.f7374a++;
                                l91VarM1984j = l91VarM2002s;
                            } else {
                                l91VarM1984j = l91VarM2002s.m1995l(obj2 != null ? obj2.hashCode() : 0, obj2, m2007x(iM1990f2), i16, eq0Var);
                            }
                        } else {
                            l91VarM1984j = l91VarM2002s;
                        }
                    } else {
                        int iM1990f3 = m1990f(iLowestOneBit2);
                        Object obj3 = this.f3397d[iM1990f3];
                        Object objM2007x2 = m2007x(iM1990f3);
                        int iM1990f4 = l91Var.m1990f(iLowestOneBit2);
                        Object obj4 = l91Var.f3397d[iM1990f4];
                        l91VarM1984j = m1984j(obj3 != null ? obj3.hashCode() : 0, obj3, objM2007x2, obj4 != null ? obj4.hashCode() : 0, obj4, l91Var.m2007x(iM1990f4), i + 5, eq0Var.f1504d);
                    }
                }
                objArr[length2] = l91VarM1984j;
                i14++;
                i13 ^= iLowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (l91Var.m1992h(iLowestOneBit3)) {
                    int iM1990f5 = l91Var.m1990f(iLowestOneBit3);
                    Object[] objArr5 = l91Var2.f3397d;
                    objArr5[i18] = l91Var.f3397d[iM1990f5];
                    objArr5[i18 + 1] = l91Var.m2007x(iM1990f5);
                    if (m1992h(iLowestOneBit3)) {
                        c0931xm.f7374a++;
                    }
                } else {
                    int iM1990f6 = m1990f(iLowestOneBit3);
                    Object[] objArr6 = l91Var2.f3397d;
                    objArr6[i18] = this.f3397d[iM1990f6];
                    objArr6[i18 + 1] = m2007x(iM1990f6);
                }
                i17++;
                i12 ^= iLowestOneBit3;
            }
            if (!m1989e(l91Var2)) {
                return l91Var.m1989e(l91Var2) ? l91Var : l91Var2;
            }
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final l91 m1997n(int i, Object obj, int i2, eq0 eq0Var) {
        l91 l91VarM1997n;
        int iM4917x = 1 << w60.m4917x(i, i2);
        if (m1992h(iM4917x)) {
            int iM1990f = m1990f(iM4917x);
            if (p30.m3002l(obj, this.f3397d[iM1990f])) {
                return m1999p(iM1990f, iM4917x, eq0Var);
            }
        } else if (m1993i(iM4917x)) {
            int iM2003t = m2003t(iM4917x);
            l91 l91VarM2002s = m2002s(iM2003t);
            if (i2 == 30) {
                x20 x20VarM4890L = w60.m4890L(w60.m4893O(0, l91VarM2002s.f3397d.length));
                int i3 = x20VarM4890L.f7248d;
                int i4 = x20VarM4890L.f7249e;
                int i5 = x20VarM4890L.f7250f;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    l91VarM1997n = l91VarM2002s;
                    break;
                }
                while (!p30.m3002l(obj, l91VarM2002s.f3397d[i3])) {
                    if (i3 == i4) {
                        l91VarM1997n = l91VarM2002s;
                        break;
                    }
                    i3 += i5;
                }
                l91VarM1997n = l91VarM2002s.m1994k(i3, eq0Var);
            } else {
                l91VarM1997n = l91VarM2002s.m1997n(i, obj, i2 + 5, eq0Var);
            }
            return m2000q(l91VarM2002s, l91VarM1997n, iM2003t, iM4917x, eq0Var.f1504d);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final l91 m1998o(int i, Object obj, Object obj2, int i2, eq0 eq0Var) {
        eq0 eq0Var2;
        l91 l91VarM1998o;
        int iM4917x = 1 << w60.m4917x(i, i2);
        if (m1992h(iM4917x)) {
            int iM1990f = m1990f(iM4917x);
            return (p30.m3002l(obj, this.f3397d[iM1990f]) && p30.m3002l(obj2, m2007x(iM1990f))) ? m1999p(iM1990f, iM4917x, eq0Var) : this;
        }
        if (!m1993i(iM4917x)) {
            return this;
        }
        int iM2003t = m2003t(iM4917x);
        l91 l91VarM2002s = m2002s(iM2003t);
        if (i2 == 30) {
            x20 x20VarM4890L = w60.m4890L(w60.m4893O(0, l91VarM2002s.f3397d.length));
            int i3 = x20VarM4890L.f7248d;
            int i4 = x20VarM4890L.f7249e;
            int i5 = x20VarM4890L.f7250f;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                l91VarM1998o = l91VarM2002s;
                eq0Var2 = eq0Var;
            } else {
                while (true) {
                    if (!p30.m3002l(obj, l91VarM2002s.f3397d[i3]) || !p30.m3002l(obj2, l91VarM2002s.m2007x(i3))) {
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    } else {
                        l91VarM1998o = l91VarM2002s.m1994k(i3, eq0Var);
                        break;
                    }
                }
                l91VarM1998o = l91VarM2002s;
                eq0Var2 = eq0Var;
            }
        } else {
            eq0Var2 = eq0Var;
            l91VarM1998o = l91VarM2002s.m1998o(i, obj, obj2, i2 + 5, eq0Var2);
        }
        return m2000q(l91VarM2002s, l91VarM1998o, iM2003t, iM4917x, eq0Var2.f1504d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final l91 m1999p(int i, int i2, eq0 eq0Var) {
        eq0Var.m958e(eq0Var.f1508h - 1);
        eq0Var.f1506f = m2007x(i);
        Object[] objArr = this.f3397d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f3396c != eq0Var.f1504d) {
            return new l91(i2 ^ this.f3394a, this.f3395b, w60.m4897d(i, objArr), eq0Var.f1504d);
        }
        this.f3397d = w60.m4897d(i, objArr);
        this.f3394a ^= i2;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final l91 m2000q(l91 l91Var, l91 l91Var2, int i, int i2, C0675r3 c0675r3) {
        C0675r3 c0675r32 = this.f3396c;
        if (l91Var2 != null) {
            return (c0675r32 == c0675r3 || l91Var != l91Var2) ? m2001r(i, l91Var2, c0675r3) : this;
        }
        Object[] objArr = this.f3397d;
        if (objArr.length == 1) {
            return null;
        }
        if (c0675r32 != c0675r3) {
            return new l91(this.f3394a, this.f3395b ^ i2, w60.m4898e(i, objArr), c0675r3);
        }
        this.f3397d = w60.m4898e(i, objArr);
        this.f3395b ^= i2;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final l91 m2001r(int i, l91 l91Var, C0675r3 c0675r3) {
        Object[] objArr = this.f3397d;
        if (objArr.length == 1 && l91Var.f3397d.length == 2 && l91Var.f3395b == 0) {
            l91Var.f3394a = this.f3395b;
            return l91Var;
        }
        if (this.f3396c == c0675r3) {
            objArr[i] = l91Var;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = l91Var;
        return new l91(this.f3394a, this.f3395b, objArrCopyOf, c0675r3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final l91 m2002s(int i) {
        Object obj = this.f3397d[i];
        obj.getClass();
        return (l91) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final int m2003t(int i) {
        return (this.f3397d.length - 1) - Integer.bitCount(this.f3395b & (i - 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c5, code lost:
    
        if (r13 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ce, code lost:
    
        if (r13 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d1, code lost:
    
        r13.f595e = m2006w(r11, r4, (p000.l91) r13.f595e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00db, code lost:
    
        return r13;
     */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0070bw m2004u(int i, int i2, Object obj, Object obj2) {
        C0070bw c0070bwM2004u;
        int iM4917x = 1 << w60.m4917x(i, i2);
        if (m1992h(iM4917x)) {
            int iM1990f = m1990f(iM4917x);
            if (!p30.m3002l(obj, this.f3397d[iM1990f])) {
                return new C0070bw(new l91(this.f3394a ^ iM4917x, this.f3395b | iM4917x, m1985a(iM1990f, iM4917x, i, obj, obj2, i2, null), null), 1);
            }
            if (m2007x(iM1990f) != obj2) {
                Object[] objArr = this.f3397d;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                objArrCopyOf[iM1990f + 1] = obj2;
                return new C0070bw(new l91(this.f3394a, this.f3395b, objArrCopyOf, null), 0);
            }
        } else {
            if (!m1993i(iM4917x)) {
                return new C0070bw(new l91(this.f3394a | iM4917x, this.f3395b, w60.m4896c(this.f3397d, m1990f(iM4917x), obj, obj2), null), 1);
            }
            int iM2003t = m2003t(iM4917x);
            l91 l91VarM2002s = m2002s(iM2003t);
            if (i2 == 30) {
                x20 x20VarM4890L = w60.m4890L(w60.m4893O(0, l91VarM2002s.f3397d.length));
                int i3 = x20VarM4890L.f7248d;
                int i4 = x20VarM4890L.f7249e;
                int i5 = x20VarM4890L.f7250f;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!p30.m3002l(obj, l91VarM2002s.f3397d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    if (obj2 == l91VarM2002s.m2007x(i3)) {
                        c0070bwM2004u = null;
                    } else {
                        Object[] objArr2 = l91VarM2002s.f3397d;
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        objArrCopyOf2[i3 + 1] = obj2;
                        c0070bwM2004u = new C0070bw(new l91(0, 0, objArrCopyOf2, null), 0);
                    }
                }
                c0070bwM2004u = new C0070bw(new l91(0, 0, w60.m4896c(l91VarM2002s.f3397d, 0, obj, obj2), null), 1);
                break;
            }
            c0070bwM2004u = l91VarM2002s.m2004u(i, i2 + 5, obj, obj2);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final l91 m2005v(int i, int i2, Object obj) {
        l91 l91VarM2005v;
        int iM4917x = 1 << w60.m4917x(i, i2);
        if (m1992h(iM4917x)) {
            int iM1990f = m1990f(iM4917x);
            if (!p30.m3002l(obj, this.f3397d[iM1990f])) {
                return this;
            }
            Object[] objArr = this.f3397d;
            if (objArr.length != 2) {
                return new l91(this.f3394a ^ iM4917x, this.f3395b, w60.m4897d(iM1990f, objArr), null);
            }
        } else {
            if (!m1993i(iM4917x)) {
                return this;
            }
            int iM2003t = m2003t(iM4917x);
            l91 l91VarM2002s = m2002s(iM2003t);
            if (i2 == 30) {
                x20 x20VarM4890L = w60.m4890L(w60.m4893O(0, l91VarM2002s.f3397d.length));
                int i3 = x20VarM4890L.f7248d;
                int i4 = x20VarM4890L.f7249e;
                int i5 = x20VarM4890L.f7250f;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    l91VarM2005v = l91VarM2002s;
                    break;
                }
                while (!p30.m3002l(obj, l91VarM2002s.f3397d[i3])) {
                    if (i3 == i4) {
                        l91VarM2005v = l91VarM2002s;
                        break;
                    }
                    i3 += i5;
                }
                Object[] objArr2 = l91VarM2002s.f3397d;
                l91VarM2005v = objArr2.length == 2 ? null : new l91(0, 0, w60.m4897d(i3, objArr2), null);
            } else {
                l91VarM2005v = l91VarM2002s.m2005v(i, i2 + 5, obj);
            }
            if (l91VarM2005v != null) {
                return l91VarM2002s != l91VarM2005v ? m2006w(iM2003t, iM4917x, l91VarM2005v) : this;
            }
            Object[] objArr3 = this.f3397d;
            if (objArr3.length != 1) {
                return new l91(this.f3394a, this.f3395b ^ iM4917x, w60.m4898e(iM2003t, objArr3), null);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final l91 m2006w(int i, int i2, l91 l91Var) {
        Object[] objArr = l91Var.f3397d;
        if (objArr.length != 2 || l91Var.f3395b != 0) {
            Object[] objArr2 = this.f3397d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = l91Var;
            return new l91(this.f3394a, this.f3395b, objArrCopyOf, null);
        }
        if (this.f3397d.length == 1) {
            l91Var.f3394a = this.f3395b;
            return l91Var;
        }
        int iM1990f = m1990f(i2);
        Object[] objArr3 = this.f3397d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        AbstractC0201f9.m1057c0(objArrCopyOf2, objArrCopyOf2, i + 2, i + 1, objArr3.length);
        AbstractC0201f9.m1057c0(objArrCopyOf2, objArrCopyOf2, iM1990f + 2, iM1990f, i);
        objArrCopyOf2[iM1990f] = obj;
        objArrCopyOf2[iM1990f + 1] = obj2;
        return new l91(this.f3394a ^ i2, this.f3395b ^ i2, objArrCopyOf2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final Object m2007x(int i) {
        return this.f3397d[i + 1];
    }
}
