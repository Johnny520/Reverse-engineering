package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h43 {
    public static final h43 e = new h43(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final i51 c;
    public Object[] d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public h43(int i, int i2, Object[] objArr, i51 i51Var) {
        this.a = i;
        this.b = i2;
        this.c = i51Var;
        this.d = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static h43 j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, i51 i51Var) {
        if (i3 > 30) {
            return new h43(0, 0, new Object[]{obj, obj2, obj3, obj4}, i51Var);
        }
        int iD = ic3.d(i, i3);
        int iD2 = ic3.d(i2, i3);
        if (iD != iD2) {
            return new h43((1 << iD) | (1 << iD2), 0, iD < iD2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, i51Var);
        }
        return new h43(0, 1 << iD, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, i51Var)}, i51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, i51 i51Var) {
        Object obj3 = this.d[i];
        h43 h43VarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i3, obj, obj2, i4 + 5, i51Var);
        int iT = t(i2);
        int i5 = iT + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        mg.f0(objArr, objArr2, 0, i, 6);
        mg.c0(objArr, objArr2, i, i + 2, i5);
        objArr2[iT - 1] = h43VarJ;
        mg.c0(objArr, objArr2, iT, i5, objArr.length);
        return objArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += s(i).b();
        }
        return iBitCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean c(Object obj) {
        a11 a11VarW = ci0.W(ci0.X(0, this.d.length), 2);
        int i = a11VarW.h;
        int i2 = a11VarW.i;
        int i3 = a11VarW.j;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!t11.l(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean d(int i, int i2, Object obj) {
        int iD = 1 << ic3.d(i, i2);
        if (h(iD)) {
            return t11.l(obj, this.d[f(iD)]);
        }
        if (!i(iD)) {
            return false;
        }
        h43 h43VarS = s(t(iD));
        return i2 == 30 ? h43VarS.c(obj) : h43VarS.d(i, i2 + 5, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean e(h43 h43Var) {
        if (this == h43Var) {
            return true;
        }
        if (this.b == h43Var.b && this.a == h43Var.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == h43Var.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object g(int i, int i2, Object obj) {
        int iD = 1 << ic3.d(i, i2);
        if (h(iD)) {
            int iF = f(iD);
            if (t11.l(obj, this.d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iD)) {
            return null;
        }
        h43 h43VarS = s(t(iD));
        if (i2 != 30) {
            return h43VarS.g(i, i2 + 5, obj);
        }
        a11 a11VarW = ci0.W(ci0.X(0, h43VarS.d.length), 2);
        int i3 = a11VarW.h;
        int i4 = a11VarW.i;
        int i5 = a11VarW.j;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!t11.l(obj, h43VarS.d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return h43VarS.x(i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean h(int i) {
        return (this.a & i) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean i(int i) {
        return (this.b & i) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final h43 k(int i, bz1 bz1Var) {
        bz1Var.c(bz1Var.m - 1);
        bz1Var.k = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != bz1Var.i) {
            return new h43(0, 0, ic3.b(i, objArr), bz1Var.i);
        }
        this.d = ic3.b(i, objArr);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final h43 l(int i, Object obj, Object obj2, int i2, bz1 bz1Var) {
        bz1 bz1Var2;
        h43 h43VarL;
        int iD = 1 << ic3.d(i, i2);
        boolean zH = h(iD);
        i51 i51Var = this.c;
        if (zH) {
            int iF = f(iD);
            if (!t11.l(obj, this.d[iF])) {
                bz1Var.c(bz1Var.m + 1);
                i51 i51Var2 = bz1Var.i;
                if (i51Var != i51Var2) {
                    return new h43(this.a ^ iD, this.b | iD, a(iF, iD, i, obj, obj2, i2, i51Var2), i51Var2);
                }
                this.d = a(iF, iD, i, obj, obj2, i2, i51Var2);
                this.a ^= iD;
                this.b |= iD;
                return this;
            }
            bz1Var.k = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (i51Var == bz1Var.i) {
                this.d[iF + 1] = obj2;
                return this;
            }
            bz1Var.l++;
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iF + 1] = obj2;
            return new h43(this.a, this.b, objArrCopyOf, bz1Var.i);
        }
        if (!i(iD)) {
            bz1Var.c(bz1Var.m + 1);
            i51 i51Var3 = bz1Var.i;
            int iF2 = f(iD);
            Object[] objArr2 = this.d;
            if (i51Var != i51Var3) {
                return new h43(this.a | iD, this.b, ic3.a(objArr2, iF2, obj, obj2), i51Var3);
            }
            this.d = ic3.a(objArr2, iF2, obj, obj2);
            this.a |= iD;
            return this;
        }
        int iT = t(iD);
        h43 h43VarS = s(iT);
        if (i2 == 30) {
            a11 a11VarW = ci0.W(ci0.X(0, h43VarS.d.length), 2);
            int i3 = a11VarW.h;
            int i4 = a11VarW.i;
            int i5 = a11VarW.j;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                bz1Var.c(bz1Var.m + 1);
                h43VarL = new h43(0, 0, ic3.a(h43VarS.d, 0, obj, obj2), bz1Var.i);
                bz1Var2 = bz1Var;
            } else {
                while (!t11.l(obj, h43VarS.d[i3])) {
                    if (i3 == i4) {
                        bz1Var.c(bz1Var.m + 1);
                        h43VarL = new h43(0, 0, ic3.a(h43VarS.d, 0, obj, obj2), bz1Var.i);
                        break;
                    }
                    i3 += i5;
                }
                bz1Var.k = h43VarS.x(i3);
                if (h43VarS.c == bz1Var.i) {
                    h43VarS.d[i3 + 1] = obj2;
                    h43VarL = h43VarS;
                } else {
                    bz1Var.l++;
                    Object[] objArr3 = h43VarS.d;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                    objArrCopyOf2[i3 + 1] = obj2;
                    h43VarL = new h43(0, 0, objArrCopyOf2, bz1Var.i);
                }
                bz1Var2 = bz1Var;
            }
        } else {
            bz1Var2 = bz1Var;
            h43VarL = h43VarS.l(i, obj, obj2, i2 + 5, bz1Var2);
        }
        return h43VarS == h43VarL ? this : r(iT, h43VarL, bz1Var2.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final h43 m(h43 h43Var, int i, d70 d70Var, bz1 bz1Var) {
        Object[] objArr;
        h43 h43VarJ;
        if (this == h43Var) {
            d70Var.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            i51 i51Var = bz1Var.i;
            int i3 = h43Var.b;
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + h43Var.d.length);
            int length = this.d.length;
            a11 a11VarW = ci0.W(ci0.X(0, h43Var.d.length), 2);
            int i4 = a11VarW.h;
            int i5 = a11VarW.i;
            int i6 = a11VarW.j;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (c(h43Var.d[i4])) {
                        d70Var.a++;
                    } else {
                        Object[] objArr3 = h43Var.d;
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
            if (length != this.d.length) {
                return length == h43Var.d.length ? h43Var : length == objArrCopyOf.length ? new h43(0, 0, objArrCopyOf, i51Var) : new h43(0, 0, Arrays.copyOf(objArrCopyOf, length), i51Var);
            }
        } else {
            int i7 = this.b | h43Var.b;
            int i8 = this.a;
            int i9 = h43Var.a;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i11);
                if (t11.l(this.d[f(iLowestOneBit)], h43Var.d[h43Var.f(iLowestOneBit)])) {
                    i12 |= iLowestOneBit;
                } else {
                    i7 |= iLowestOneBit;
                }
                i11 ^= iLowestOneBit;
            }
            if ((i7 & i12) != 0) {
                j22.b("Check failed.");
            }
            h43 h43Var2 = (t11.l(this.c, bz1Var.i) && this.a == i12 && this.b == i7) ? this : new h43(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = h43Var2.d;
                int length2 = (objArr4.length - 1) - i14;
                if (i(iLowestOneBit2)) {
                    h43VarJ = s(t(iLowestOneBit2));
                    if (h43Var.i(iLowestOneBit2)) {
                        h43VarJ = h43VarJ.m(h43Var.s(h43Var.t(iLowestOneBit2)), i + 5, d70Var, bz1Var);
                        objArr = objArr4;
                    } else if (h43Var.h(iLowestOneBit2)) {
                        int iF = h43Var.f(iLowestOneBit2);
                        Object obj = h43Var.d[iF];
                        Object objX = h43Var.x(iF);
                        int i15 = bz1Var.m;
                        objArr = objArr4;
                        h43VarJ = h43VarJ.l(obj != null ? obj.hashCode() : i2, obj, objX, i + 5, bz1Var);
                        if (bz1Var.m == i15) {
                            d70Var.a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (h43Var.i(iLowestOneBit2)) {
                        h43 h43VarS = h43Var.s(h43Var.t(iLowestOneBit2));
                        if (h(iLowestOneBit2)) {
                            int iF2 = f(iLowestOneBit2);
                            Object obj2 = this.d[iF2];
                            int i16 = i + 5;
                            if (h43VarS.d(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                d70Var.a++;
                                h43VarJ = h43VarS;
                            } else {
                                h43VarJ = h43VarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i16, bz1Var);
                            }
                        } else {
                            h43VarJ = h43VarS;
                        }
                    } else {
                        int iF3 = f(iLowestOneBit2);
                        Object obj3 = this.d[iF3];
                        Object objX2 = x(iF3);
                        int iF4 = h43Var.f(iLowestOneBit2);
                        Object obj4 = h43Var.d[iF4];
                        h43VarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, h43Var.x(iF4), i + 5, bz1Var.i);
                    }
                }
                objArr[length2] = h43VarJ;
                i14++;
                i13 ^= iLowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (h43Var.h(iLowestOneBit3)) {
                    int iF5 = h43Var.f(iLowestOneBit3);
                    Object[] objArr5 = h43Var2.d;
                    objArr5[i18] = h43Var.d[iF5];
                    objArr5[i18 + 1] = h43Var.x(iF5);
                    if (h(iLowestOneBit3)) {
                        d70Var.a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    Object[] objArr6 = h43Var2.d;
                    objArr6[i18] = this.d[iF6];
                    objArr6[i18 + 1] = x(iF6);
                }
                i17++;
                i12 ^= iLowestOneBit3;
            }
            if (!e(h43Var2)) {
                return h43Var.e(h43Var2) ? h43Var : h43Var2;
            }
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final h43 n(int i, Object obj, int i2, bz1 bz1Var) {
        h43 h43VarN;
        int iD = 1 << ic3.d(i, i2);
        if (h(iD)) {
            int iF = f(iD);
            if (t11.l(obj, this.d[iF])) {
                return p(iF, iD, bz1Var);
            }
        } else if (i(iD)) {
            int iT = t(iD);
            h43 h43VarS = s(iT);
            if (i2 == 30) {
                a11 a11VarW = ci0.W(ci0.X(0, h43VarS.d.length), 2);
                int i3 = a11VarW.h;
                int i4 = a11VarW.i;
                int i5 = a11VarW.j;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    h43VarN = h43VarS;
                    break;
                }
                while (!t11.l(obj, h43VarS.d[i3])) {
                    if (i3 == i4) {
                        h43VarN = h43VarS;
                        break;
                    }
                    i3 += i5;
                }
                h43VarN = h43VarS.k(i3, bz1Var);
            } else {
                h43VarN = h43VarS.n(i, obj, i2 + 5, bz1Var);
            }
            return q(h43VarS, h43VarN, iT, iD, bz1Var.i);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final h43 o(int i, Object obj, Object obj2, int i2, bz1 bz1Var) {
        bz1 bz1Var2;
        h43 h43VarO;
        int iD = 1 << ic3.d(i, i2);
        if (h(iD)) {
            int iF = f(iD);
            return (t11.l(obj, this.d[iF]) && t11.l(obj2, x(iF))) ? p(iF, iD, bz1Var) : this;
        }
        if (!i(iD)) {
            return this;
        }
        int iT = t(iD);
        h43 h43VarS = s(iT);
        if (i2 == 30) {
            a11 a11VarW = ci0.W(ci0.X(0, h43VarS.d.length), 2);
            int i3 = a11VarW.h;
            int i4 = a11VarW.i;
            int i5 = a11VarW.j;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                h43VarO = h43VarS;
                bz1Var2 = bz1Var;
            } else {
                while (true) {
                    if (!t11.l(obj, h43VarS.d[i3]) || !t11.l(obj2, h43VarS.x(i3))) {
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    } else {
                        h43VarO = h43VarS.k(i3, bz1Var);
                        break;
                    }
                }
                h43VarO = h43VarS;
                bz1Var2 = bz1Var;
            }
        } else {
            bz1Var2 = bz1Var;
            h43VarO = h43VarS.o(i, obj, obj2, i2 + 5, bz1Var2);
        }
        return q(h43VarS, h43VarO, iT, iD, bz1Var2.i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final h43 p(int i, int i2, bz1 bz1Var) {
        bz1Var.c(bz1Var.m - 1);
        bz1Var.k = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != bz1Var.i) {
            return new h43(i2 ^ this.a, this.b, ic3.b(i, objArr), bz1Var.i);
        }
        this.d = ic3.b(i, objArr);
        this.a ^= i2;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final h43 q(h43 h43Var, h43 h43Var2, int i, int i2, i51 i51Var) {
        i51 i51Var2 = this.c;
        if (h43Var2 != null) {
            return (i51Var2 == i51Var || h43Var != h43Var2) ? r(i, h43Var2, i51Var) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (i51Var2 != i51Var) {
            return new h43(this.a, this.b ^ i2, ic3.c(i, objArr), i51Var);
        }
        this.d = ic3.c(i, objArr);
        this.b ^= i2;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final h43 r(int i, h43 h43Var, i51 i51Var) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && h43Var.d.length == 2 && h43Var.b == 0) {
            h43Var.a = this.b;
            return h43Var;
        }
        if (this.c == i51Var) {
            objArr[i] = h43Var;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = h43Var;
        return new h43(this.a, this.b, objArrCopyOf, i51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final h43 s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (h43) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c5, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ce, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d1, code lost:
    
        r14.j = w(r7, r2, (defpackage.h43) r14.j);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00db, code lost:
    
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dk u(int i, int i2, Object obj, Object obj2) {
        dk dkVarU;
        int i3 = 1;
        int iD = 1 << ic3.d(i, i2);
        int i4 = 13;
        int i5 = 0;
        if (h(iD)) {
            int iF = f(iD);
            if (!t11.l(obj, this.d[iF])) {
                return new dk(i3, i4, new h43(this.a ^ iD, this.b | iD, a(iF, iD, i, obj, obj2, i2, null), null));
            }
            if (x(iF) != obj2) {
                Object[] objArr = this.d;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                objArrCopyOf[iF + 1] = obj2;
                return new dk(i5, i4, new h43(this.a, this.b, objArrCopyOf, null));
            }
        } else {
            if (!i(iD)) {
                return new dk(i3, i4, new h43(iD | this.a, this.b, ic3.a(this.d, f(iD), obj, obj2), null));
            }
            int iT = t(iD);
            h43 h43VarS = s(iT);
            if (i2 == 30) {
                a11 a11VarW = ci0.W(ci0.X(0, h43VarS.d.length), 2);
                int i6 = a11VarW.h;
                int i7 = a11VarW.i;
                int i8 = a11VarW.j;
                if ((i8 > 0 && i6 <= i7) || (i8 < 0 && i7 <= i6)) {
                    while (!t11.l(obj, h43VarS.d[i6])) {
                        if (i6 != i7) {
                            i6 += i8;
                        }
                    }
                    if (obj2 == h43VarS.x(i6)) {
                        dkVarU = null;
                    } else {
                        Object[] objArr2 = h43VarS.d;
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        objArrCopyOf2[i6 + 1] = obj2;
                        dkVarU = new dk(i5, i4, new h43(0, 0, objArrCopyOf2, null));
                    }
                }
                dkVarU = new dk(i3, i4, new h43(0, 0, ic3.a(h43VarS.d, 0, obj, obj2), null));
                break;
            }
            dkVarU = h43VarS.u(i, i2 + 5, obj, obj2);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final h43 v(int i, int i2, Object obj) {
        h43 h43VarV;
        int iD = 1 << ic3.d(i, i2);
        if (h(iD)) {
            int iF = f(iD);
            if (!t11.l(obj, this.d[iF])) {
                return this;
            }
            Object[] objArr = this.d;
            if (objArr.length != 2) {
                return new h43(this.a ^ iD, this.b, ic3.b(iF, objArr), null);
            }
        } else {
            if (!i(iD)) {
                return this;
            }
            int iT = t(iD);
            h43 h43VarS = s(iT);
            if (i2 == 30) {
                a11 a11VarW = ci0.W(ci0.X(0, h43VarS.d.length), 2);
                int i3 = a11VarW.h;
                int i4 = a11VarW.i;
                int i5 = a11VarW.j;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    h43VarV = h43VarS;
                    break;
                }
                while (!t11.l(obj, h43VarS.d[i3])) {
                    if (i3 == i4) {
                        h43VarV = h43VarS;
                        break;
                    }
                    i3 += i5;
                }
                Object[] objArr2 = h43VarS.d;
                h43VarV = objArr2.length == 2 ? null : new h43(0, 0, ic3.b(i3, objArr2), null);
            } else {
                h43VarV = h43VarS.v(i, i2 + 5, obj);
            }
            if (h43VarV != null) {
                return h43VarS != h43VarV ? w(iT, iD, h43VarV) : this;
            }
            Object[] objArr3 = this.d;
            if (objArr3.length != 1) {
                return new h43(this.a, this.b ^ iD, ic3.c(iT, objArr3), null);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final h43 w(int i, int i2, h43 h43Var) {
        Object[] objArr = h43Var.d;
        if (objArr.length != 2 || h43Var.b != 0) {
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i] = h43Var;
            return new h43(this.a, this.b, objArrCopyOf, null);
        }
        if (this.d.length == 1) {
            h43Var.a = this.b;
            return h43Var;
        }
        int iF = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        mg.c0(objArrCopyOf2, objArrCopyOf2, i + 2, i + 1, objArr3.length);
        mg.c0(objArrCopyOf2, objArrCopyOf2, iF + 2, iF, i);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new h43(this.a ^ i2, this.b ^ i2, objArrCopyOf2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object x(int i) {
        return this.d[i + 1];
    }
}
