package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h43 {

    /* JADX INFO: renamed from: e */
    public static final h43 f3816e = new h43(0, 0, new Object[0], null);

    /* JADX INFO: renamed from: a */
    public int f3817a;

    /* JADX INFO: renamed from: b */
    public int f3818b;

    /* JADX INFO: renamed from: c */
    public final i51 f3819c;

    /* JADX INFO: renamed from: d */
    public Object[] f3820d;

    public h43(int i, int i2, Object[] objArr, i51 i51Var) {
        this.f3817a = i;
        this.f3818b = i2;
        this.f3819c = i51Var;
        this.f3820d = objArr;
    }

    /* JADX INFO: renamed from: j */
    public static h43 m2054j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, i51 i51Var) {
        if (i3 > 30) {
            return new h43(0, 0, new Object[]{obj, obj2, obj3, obj4}, i51Var);
        }
        int iM2330d = ic3.m2330d(i, i3);
        int iM2330d2 = ic3.m2330d(i2, i3);
        if (iM2330d != iM2330d2) {
            return new h43((1 << iM2330d) | (1 << iM2330d2), 0, iM2330d < iM2330d2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, i51Var);
        }
        return new h43(0, 1 << iM2330d, new Object[]{m2054j(i, obj, obj2, i2, obj3, obj4, i3 + 5, i51Var)}, i51Var);
    }

    /* JADX INFO: renamed from: a */
    public final Object[] m2055a(int i, int i2, int i3, Object obj, Object obj2, int i4, i51 i51Var) {
        Object obj3 = this.f3820d[i];
        h43 h43VarM2054j = m2054j(obj3 != null ? obj3.hashCode() : 0, obj3, m2077x(i), i3, obj, obj2, i4 + 5, i51Var);
        int iM2073t = m2073t(i2);
        int i5 = iM2073t + 1;
        Object[] objArr = this.f3820d;
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC0460mg.m3091f0(objArr, objArr2, 0, i, 6);
        AbstractC0460mg.m3088c0(objArr, objArr2, i, i + 2, i5);
        objArr2[iM2073t - 1] = h43VarM2054j;
        AbstractC0460mg.m3088c0(objArr, objArr2, iM2073t, i5, objArr.length);
        return objArr2;
    }

    /* JADX INFO: renamed from: b */
    public final int m2056b() {
        if (this.f3818b == 0) {
            return this.f3820d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f3817a);
        int length = this.f3820d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += m2072s(i).m2056b();
        }
        return iBitCount;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2057c(Object obj) {
        a11 a11VarM798W = ci0.m798W(ci0.m799X(0, this.f3820d.length), 2);
        int i = a11VarM798W.f25h;
        int i2 = a11VarM798W.f26i;
        int i3 = a11VarM798W.f27j;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!t11.m5086l(obj, this.f3820d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2058d(int i, int i2, Object obj) {
        int iM2330d = 1 << ic3.m2330d(i, i2);
        if (m2062h(iM2330d)) {
            return t11.m5086l(obj, this.f3820d[m2060f(iM2330d)]);
        }
        if (!m2063i(iM2330d)) {
            return false;
        }
        h43 h43VarM2072s = m2072s(m2073t(iM2330d));
        return i2 == 30 ? h43VarM2072s.m2057c(obj) : h43VarM2072s.m2058d(i, i2 + 5, obj);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2059e(h43 h43Var) {
        if (this == h43Var) {
            return true;
        }
        if (this.f3818b == h43Var.f3818b && this.f3817a == h43Var.f3817a) {
            int length = this.f3820d.length;
            for (int i = 0; i < length; i++) {
                if (this.f3820d[i] == h43Var.f3820d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m2060f(int i) {
        return Integer.bitCount(this.f3817a & (i - 1)) * 2;
    }

    /* JADX INFO: renamed from: g */
    public final Object m2061g(int i, int i2, Object obj) {
        int iM2330d = 1 << ic3.m2330d(i, i2);
        if (m2062h(iM2330d)) {
            int iM2060f = m2060f(iM2330d);
            if (t11.m5086l(obj, this.f3820d[iM2060f])) {
                return m2077x(iM2060f);
            }
            return null;
        }
        if (!m2063i(iM2330d)) {
            return null;
        }
        h43 h43VarM2072s = m2072s(m2073t(iM2330d));
        if (i2 != 30) {
            return h43VarM2072s.m2061g(i, i2 + 5, obj);
        }
        a11 a11VarM798W = ci0.m798W(ci0.m799X(0, h43VarM2072s.f3820d.length), 2);
        int i3 = a11VarM798W.f25h;
        int i4 = a11VarM798W.f26i;
        int i5 = a11VarM798W.f27j;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!t11.m5086l(obj, h43VarM2072s.f3820d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return h43VarM2072s.m2077x(i3);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2062h(int i) {
        return (this.f3817a & i) != 0;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m2063i(int i) {
        return (this.f3818b & i) != 0;
    }

    /* JADX INFO: renamed from: k */
    public final h43 m2064k(int i, bz1 bz1Var) {
        bz1Var.m610c(bz1Var.f1087m - 1);
        bz1Var.f1085k = m2077x(i);
        Object[] objArr = this.f3820d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f3819c != bz1Var.f1083i) {
            return new h43(0, 0, ic3.m2328b(i, objArr), bz1Var.f1083i);
        }
        this.f3820d = ic3.m2328b(i, objArr);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final h43 m2065l(int i, Object obj, Object obj2, int i2, bz1 bz1Var) {
        bz1 bz1Var2;
        h43 h43VarM2065l;
        int iM2330d = 1 << ic3.m2330d(i, i2);
        boolean zM2062h = m2062h(iM2330d);
        i51 i51Var = this.f3819c;
        if (zM2062h) {
            int iM2060f = m2060f(iM2330d);
            if (!t11.m5086l(obj, this.f3820d[iM2060f])) {
                bz1Var.m610c(bz1Var.f1087m + 1);
                i51 i51Var2 = bz1Var.f1083i;
                if (i51Var != i51Var2) {
                    return new h43(this.f3817a ^ iM2330d, this.f3818b | iM2330d, m2055a(iM2060f, iM2330d, i, obj, obj2, i2, i51Var2), i51Var2);
                }
                this.f3820d = m2055a(iM2060f, iM2330d, i, obj, obj2, i2, i51Var2);
                this.f3817a ^= iM2330d;
                this.f3818b |= iM2330d;
                return this;
            }
            bz1Var.f1085k = m2077x(iM2060f);
            if (m2077x(iM2060f) == obj2) {
                return this;
            }
            if (i51Var == bz1Var.f1083i) {
                this.f3820d[iM2060f + 1] = obj2;
                return this;
            }
            bz1Var.f1086l++;
            Object[] objArr = this.f3820d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iM2060f + 1] = obj2;
            return new h43(this.f3817a, this.f3818b, objArrCopyOf, bz1Var.f1083i);
        }
        if (!m2063i(iM2330d)) {
            bz1Var.m610c(bz1Var.f1087m + 1);
            i51 i51Var3 = bz1Var.f1083i;
            int iM2060f2 = m2060f(iM2330d);
            Object[] objArr2 = this.f3820d;
            if (i51Var != i51Var3) {
                return new h43(this.f3817a | iM2330d, this.f3818b, ic3.m2327a(objArr2, iM2060f2, obj, obj2), i51Var3);
            }
            this.f3820d = ic3.m2327a(objArr2, iM2060f2, obj, obj2);
            this.f3817a |= iM2330d;
            return this;
        }
        int iM2073t = m2073t(iM2330d);
        h43 h43VarM2072s = m2072s(iM2073t);
        if (i2 == 30) {
            a11 a11VarM798W = ci0.m798W(ci0.m799X(0, h43VarM2072s.f3820d.length), 2);
            int i3 = a11VarM798W.f25h;
            int i4 = a11VarM798W.f26i;
            int i5 = a11VarM798W.f27j;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                bz1Var.m610c(bz1Var.f1087m + 1);
                h43VarM2065l = new h43(0, 0, ic3.m2327a(h43VarM2072s.f3820d, 0, obj, obj2), bz1Var.f1083i);
                bz1Var2 = bz1Var;
            } else {
                while (!t11.m5086l(obj, h43VarM2072s.f3820d[i3])) {
                    if (i3 == i4) {
                        bz1Var.m610c(bz1Var.f1087m + 1);
                        h43VarM2065l = new h43(0, 0, ic3.m2327a(h43VarM2072s.f3820d, 0, obj, obj2), bz1Var.f1083i);
                        break;
                    }
                    i3 += i5;
                }
                bz1Var.f1085k = h43VarM2072s.m2077x(i3);
                if (h43VarM2072s.f3819c == bz1Var.f1083i) {
                    h43VarM2072s.f3820d[i3 + 1] = obj2;
                    h43VarM2065l = h43VarM2072s;
                } else {
                    bz1Var.f1086l++;
                    Object[] objArr3 = h43VarM2072s.f3820d;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                    objArrCopyOf2[i3 + 1] = obj2;
                    h43VarM2065l = new h43(0, 0, objArrCopyOf2, bz1Var.f1083i);
                }
                bz1Var2 = bz1Var;
            }
        } else {
            bz1Var2 = bz1Var;
            h43VarM2065l = h43VarM2072s.m2065l(i, obj, obj2, i2 + 5, bz1Var2);
        }
        return h43VarM2072s == h43VarM2065l ? this : m2071r(iM2073t, h43VarM2065l, bz1Var2.f1083i);
    }

    /* JADX INFO: renamed from: m */
    public final h43 m2066m(h43 h43Var, int i, d70 d70Var, bz1 bz1Var) {
        Object[] objArr;
        h43 h43VarM2054j;
        if (this == h43Var) {
            d70Var.f1897a += m2056b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            i51 i51Var = bz1Var.f1083i;
            int i3 = h43Var.f3818b;
            Object[] objArr2 = this.f3820d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + h43Var.f3820d.length);
            int length = this.f3820d.length;
            a11 a11VarM798W = ci0.m798W(ci0.m799X(0, h43Var.f3820d.length), 2);
            int i4 = a11VarM798W.f25h;
            int i5 = a11VarM798W.f26i;
            int i6 = a11VarM798W.f27j;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (m2057c(h43Var.f3820d[i4])) {
                        d70Var.f1897a++;
                    } else {
                        Object[] objArr3 = h43Var.f3820d;
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
            if (length != this.f3820d.length) {
                return length == h43Var.f3820d.length ? h43Var : length == objArrCopyOf.length ? new h43(0, 0, objArrCopyOf, i51Var) : new h43(0, 0, Arrays.copyOf(objArrCopyOf, length), i51Var);
            }
        } else {
            int i7 = this.f3818b | h43Var.f3818b;
            int i8 = this.f3817a;
            int i9 = h43Var.f3817a;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i11);
                if (t11.m5086l(this.f3820d[m2060f(iLowestOneBit)], h43Var.f3820d[h43Var.m2060f(iLowestOneBit)])) {
                    i12 |= iLowestOneBit;
                } else {
                    i7 |= iLowestOneBit;
                }
                i11 ^= iLowestOneBit;
            }
            if ((i7 & i12) != 0) {
                j22.m2430b("Check failed.");
            }
            h43 h43Var2 = (t11.m5086l(this.f3819c, bz1Var.f1083i) && this.f3817a == i12 && this.f3818b == i7) ? this : new h43(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = h43Var2.f3820d;
                int length2 = (objArr4.length - 1) - i14;
                if (m2063i(iLowestOneBit2)) {
                    h43VarM2054j = m2072s(m2073t(iLowestOneBit2));
                    if (h43Var.m2063i(iLowestOneBit2)) {
                        h43VarM2054j = h43VarM2054j.m2066m(h43Var.m2072s(h43Var.m2073t(iLowestOneBit2)), i + 5, d70Var, bz1Var);
                        objArr = objArr4;
                    } else if (h43Var.m2062h(iLowestOneBit2)) {
                        int iM2060f = h43Var.m2060f(iLowestOneBit2);
                        Object obj = h43Var.f3820d[iM2060f];
                        Object objM2077x = h43Var.m2077x(iM2060f);
                        int i15 = bz1Var.f1087m;
                        objArr = objArr4;
                        h43VarM2054j = h43VarM2054j.m2065l(obj != null ? obj.hashCode() : i2, obj, objM2077x, i + 5, bz1Var);
                        if (bz1Var.f1087m == i15) {
                            d70Var.f1897a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (h43Var.m2063i(iLowestOneBit2)) {
                        h43 h43VarM2072s = h43Var.m2072s(h43Var.m2073t(iLowestOneBit2));
                        if (m2062h(iLowestOneBit2)) {
                            int iM2060f2 = m2060f(iLowestOneBit2);
                            Object obj2 = this.f3820d[iM2060f2];
                            int i16 = i + 5;
                            if (h43VarM2072s.m2058d(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                d70Var.f1897a++;
                                h43VarM2054j = h43VarM2072s;
                            } else {
                                h43VarM2054j = h43VarM2072s.m2065l(obj2 != null ? obj2.hashCode() : 0, obj2, m2077x(iM2060f2), i16, bz1Var);
                            }
                        } else {
                            h43VarM2054j = h43VarM2072s;
                        }
                    } else {
                        int iM2060f3 = m2060f(iLowestOneBit2);
                        Object obj3 = this.f3820d[iM2060f3];
                        Object objM2077x2 = m2077x(iM2060f3);
                        int iM2060f4 = h43Var.m2060f(iLowestOneBit2);
                        Object obj4 = h43Var.f3820d[iM2060f4];
                        h43VarM2054j = m2054j(obj3 != null ? obj3.hashCode() : 0, obj3, objM2077x2, obj4 != null ? obj4.hashCode() : 0, obj4, h43Var.m2077x(iM2060f4), i + 5, bz1Var.f1083i);
                    }
                }
                objArr[length2] = h43VarM2054j;
                i14++;
                i13 ^= iLowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (h43Var.m2062h(iLowestOneBit3)) {
                    int iM2060f5 = h43Var.m2060f(iLowestOneBit3);
                    Object[] objArr5 = h43Var2.f3820d;
                    objArr5[i18] = h43Var.f3820d[iM2060f5];
                    objArr5[i18 + 1] = h43Var.m2077x(iM2060f5);
                    if (m2062h(iLowestOneBit3)) {
                        d70Var.f1897a++;
                    }
                } else {
                    int iM2060f6 = m2060f(iLowestOneBit3);
                    Object[] objArr6 = h43Var2.f3820d;
                    objArr6[i18] = this.f3820d[iM2060f6];
                    objArr6[i18 + 1] = m2077x(iM2060f6);
                }
                i17++;
                i12 ^= iLowestOneBit3;
            }
            if (!m2059e(h43Var2)) {
                return h43Var.m2059e(h43Var2) ? h43Var : h43Var2;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final h43 m2067n(int i, Object obj, int i2, bz1 bz1Var) {
        h43 h43VarM2067n;
        int iM2330d = 1 << ic3.m2330d(i, i2);
        if (m2062h(iM2330d)) {
            int iM2060f = m2060f(iM2330d);
            if (t11.m5086l(obj, this.f3820d[iM2060f])) {
                return m2069p(iM2060f, iM2330d, bz1Var);
            }
        } else if (m2063i(iM2330d)) {
            int iM2073t = m2073t(iM2330d);
            h43 h43VarM2072s = m2072s(iM2073t);
            if (i2 == 30) {
                a11 a11VarM798W = ci0.m798W(ci0.m799X(0, h43VarM2072s.f3820d.length), 2);
                int i3 = a11VarM798W.f25h;
                int i4 = a11VarM798W.f26i;
                int i5 = a11VarM798W.f27j;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    h43VarM2067n = h43VarM2072s;
                    break;
                }
                while (!t11.m5086l(obj, h43VarM2072s.f3820d[i3])) {
                    if (i3 == i4) {
                        h43VarM2067n = h43VarM2072s;
                        break;
                    }
                    i3 += i5;
                }
                h43VarM2067n = h43VarM2072s.m2064k(i3, bz1Var);
            } else {
                h43VarM2067n = h43VarM2072s.m2067n(i, obj, i2 + 5, bz1Var);
            }
            return m2070q(h43VarM2072s, h43VarM2067n, iM2073t, iM2330d, bz1Var.f1083i);
        }
        return this;
    }

    /* JADX INFO: renamed from: o */
    public final h43 m2068o(int i, Object obj, Object obj2, int i2, bz1 bz1Var) {
        bz1 bz1Var2;
        h43 h43VarM2068o;
        int iM2330d = 1 << ic3.m2330d(i, i2);
        if (m2062h(iM2330d)) {
            int iM2060f = m2060f(iM2330d);
            return (t11.m5086l(obj, this.f3820d[iM2060f]) && t11.m5086l(obj2, m2077x(iM2060f))) ? m2069p(iM2060f, iM2330d, bz1Var) : this;
        }
        if (!m2063i(iM2330d)) {
            return this;
        }
        int iM2073t = m2073t(iM2330d);
        h43 h43VarM2072s = m2072s(iM2073t);
        if (i2 == 30) {
            a11 a11VarM798W = ci0.m798W(ci0.m799X(0, h43VarM2072s.f3820d.length), 2);
            int i3 = a11VarM798W.f25h;
            int i4 = a11VarM798W.f26i;
            int i5 = a11VarM798W.f27j;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                h43VarM2068o = h43VarM2072s;
                bz1Var2 = bz1Var;
            } else {
                while (true) {
                    if (!t11.m5086l(obj, h43VarM2072s.f3820d[i3]) || !t11.m5086l(obj2, h43VarM2072s.m2077x(i3))) {
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    } else {
                        h43VarM2068o = h43VarM2072s.m2064k(i3, bz1Var);
                        break;
                    }
                }
                h43VarM2068o = h43VarM2072s;
                bz1Var2 = bz1Var;
            }
        } else {
            bz1Var2 = bz1Var;
            h43VarM2068o = h43VarM2072s.m2068o(i, obj, obj2, i2 + 5, bz1Var2);
        }
        return m2070q(h43VarM2072s, h43VarM2068o, iM2073t, iM2330d, bz1Var2.f1083i);
    }

    /* JADX INFO: renamed from: p */
    public final h43 m2069p(int i, int i2, bz1 bz1Var) {
        bz1Var.m610c(bz1Var.f1087m - 1);
        bz1Var.f1085k = m2077x(i);
        Object[] objArr = this.f3820d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f3819c != bz1Var.f1083i) {
            return new h43(i2 ^ this.f3817a, this.f3818b, ic3.m2328b(i, objArr), bz1Var.f1083i);
        }
        this.f3820d = ic3.m2328b(i, objArr);
        this.f3817a ^= i2;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public final h43 m2070q(h43 h43Var, h43 h43Var2, int i, int i2, i51 i51Var) {
        i51 i51Var2 = this.f3819c;
        if (h43Var2 != null) {
            return (i51Var2 == i51Var || h43Var != h43Var2) ? m2071r(i, h43Var2, i51Var) : this;
        }
        Object[] objArr = this.f3820d;
        if (objArr.length == 1) {
            return null;
        }
        if (i51Var2 != i51Var) {
            return new h43(this.f3817a, this.f3818b ^ i2, ic3.m2329c(i, objArr), i51Var);
        }
        this.f3820d = ic3.m2329c(i, objArr);
        this.f3818b ^= i2;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public final h43 m2071r(int i, h43 h43Var, i51 i51Var) {
        Object[] objArr = this.f3820d;
        if (objArr.length == 1 && h43Var.f3820d.length == 2 && h43Var.f3818b == 0) {
            h43Var.f3817a = this.f3818b;
            return h43Var;
        }
        if (this.f3819c == i51Var) {
            objArr[i] = h43Var;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = h43Var;
        return new h43(this.f3817a, this.f3818b, objArrCopyOf, i51Var);
    }

    /* JADX INFO: renamed from: s */
    public final h43 m2072s(int i) {
        Object obj = this.f3820d[i];
        obj.getClass();
        return (h43) obj;
    }

    /* JADX INFO: renamed from: t */
    public final int m2073t(int i) {
        return (this.f3820d.length - 1) - Integer.bitCount(this.f3818b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c5, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ce, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d1, code lost:
    
        r14.f2082j = m2076w(r7, r2, (p000.h43) r14.f2082j);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00db, code lost:
    
        return r14;
     */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0133dk m2074u(int i, int i2, Object obj, Object obj2) {
        C0133dk c0133dkM2074u;
        int i3 = 1;
        int iM2330d = 1 << ic3.m2330d(i, i2);
        int i4 = 13;
        int i5 = 0;
        if (m2062h(iM2330d)) {
            int iM2060f = m2060f(iM2330d);
            if (!t11.m5086l(obj, this.f3820d[iM2060f])) {
                return new C0133dk(i3, i4, new h43(this.f3817a ^ iM2330d, this.f3818b | iM2330d, m2055a(iM2060f, iM2330d, i, obj, obj2, i2, null), null));
            }
            if (m2077x(iM2060f) != obj2) {
                Object[] objArr = this.f3820d;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                objArrCopyOf[iM2060f + 1] = obj2;
                return new C0133dk(i5, i4, new h43(this.f3817a, this.f3818b, objArrCopyOf, null));
            }
        } else {
            if (!m2063i(iM2330d)) {
                return new C0133dk(i3, i4, new h43(iM2330d | this.f3817a, this.f3818b, ic3.m2327a(this.f3820d, m2060f(iM2330d), obj, obj2), null));
            }
            int iM2073t = m2073t(iM2330d);
            h43 h43VarM2072s = m2072s(iM2073t);
            if (i2 == 30) {
                a11 a11VarM798W = ci0.m798W(ci0.m799X(0, h43VarM2072s.f3820d.length), 2);
                int i6 = a11VarM798W.f25h;
                int i7 = a11VarM798W.f26i;
                int i8 = a11VarM798W.f27j;
                if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                    while (!t11.m5086l(obj, h43VarM2072s.f3820d[i6])) {
                        if (i6 != i7) {
                            i6 += i8;
                        }
                    }
                    if (obj2 == h43VarM2072s.m2077x(i6)) {
                        c0133dkM2074u = null;
                    } else {
                        Object[] objArr2 = h43VarM2072s.f3820d;
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        objArrCopyOf2[i6 + 1] = obj2;
                        c0133dkM2074u = new C0133dk(i5, i4, new h43(0, 0, objArrCopyOf2, null));
                    }
                }
                c0133dkM2074u = new C0133dk(i3, i4, new h43(0, 0, ic3.m2327a(h43VarM2072s.f3820d, 0, obj, obj2), null));
                break;
            }
            c0133dkM2074u = h43VarM2072s.m2074u(i, i2 + 5, obj, obj2);
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public final h43 m2075v(int i, int i2, Object obj) {
        h43 h43VarM2075v;
        int iM2330d = 1 << ic3.m2330d(i, i2);
        if (m2062h(iM2330d)) {
            int iM2060f = m2060f(iM2330d);
            if (!t11.m5086l(obj, this.f3820d[iM2060f])) {
                return this;
            }
            Object[] objArr = this.f3820d;
            if (objArr.length != 2) {
                return new h43(this.f3817a ^ iM2330d, this.f3818b, ic3.m2328b(iM2060f, objArr), null);
            }
        } else {
            if (!m2063i(iM2330d)) {
                return this;
            }
            int iM2073t = m2073t(iM2330d);
            h43 h43VarM2072s = m2072s(iM2073t);
            if (i2 == 30) {
                a11 a11VarM798W = ci0.m798W(ci0.m799X(0, h43VarM2072s.f3820d.length), 2);
                int i3 = a11VarM798W.f25h;
                int i4 = a11VarM798W.f26i;
                int i5 = a11VarM798W.f27j;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    h43VarM2075v = h43VarM2072s;
                    break;
                }
                while (!t11.m5086l(obj, h43VarM2072s.f3820d[i3])) {
                    if (i3 == i4) {
                        h43VarM2075v = h43VarM2072s;
                        break;
                    }
                    i3 += i5;
                }
                Object[] objArr2 = h43VarM2072s.f3820d;
                h43VarM2075v = objArr2.length == 2 ? null : new h43(0, 0, ic3.m2328b(i3, objArr2), null);
            } else {
                h43VarM2075v = h43VarM2072s.m2075v(i, i2 + 5, obj);
            }
            if (h43VarM2075v != null) {
                return h43VarM2072s != h43VarM2075v ? m2076w(iM2073t, iM2330d, h43VarM2075v) : this;
            }
            Object[] objArr3 = this.f3820d;
            if (objArr3.length != 1) {
                return new h43(this.f3817a, this.f3818b ^ iM2330d, ic3.m2329c(iM2073t, objArr3), null);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public final h43 m2076w(int i, int i2, h43 h43Var) {
        Object[] objArr = h43Var.f3820d;
        if (objArr.length != 2 || h43Var.f3818b != 0) {
            Object[] objArr2 = this.f3820d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = h43Var;
            return new h43(this.f3817a, this.f3818b, objArrCopyOf, null);
        }
        if (this.f3820d.length == 1) {
            h43Var.f3817a = this.f3818b;
            return h43Var;
        }
        int iM2060f = m2060f(i2);
        Object[] objArr3 = this.f3820d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        AbstractC0460mg.m3088c0(objArrCopyOf2, objArrCopyOf2, i + 2, i + 1, objArr3.length);
        AbstractC0460mg.m3088c0(objArrCopyOf2, objArrCopyOf2, iM2060f + 2, iM2060f, i);
        objArrCopyOf2[iM2060f] = obj;
        objArrCopyOf2[iM2060f + 1] = obj2;
        return new h43(this.f3817a ^ i2, this.f3818b ^ i2, objArrCopyOf2, null);
    }

    /* JADX INFO: renamed from: x */
    public final Object m2077x(int i) {
        return this.f3820d[i + 1];
    }
}
