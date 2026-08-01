package p119Y;

import com.bumptech.glide.AbstractC1926h;
import java.util.Arrays;
import p061L2.AbstractC0972l;
import p095T.AbstractC1380p0;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;
import p129a0.C1786a;
import p129a0.C1787b;
import p132a3.C1802b;
import p136b0.C1846h;

/* JADX INFO: renamed from: Y.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1728l {

    /* JADX INFO: renamed from: e */
    public static final C1728l f5976e = new C1728l(0, 0, new Object[0], null);

    /* JADX INFO: renamed from: a */
    public int f5977a;

    /* JADX INFO: renamed from: b */
    public int f5978b;

    /* JADX INFO: renamed from: c */
    public final C1787b f5979c;

    /* JADX INFO: renamed from: d */
    public Object[] f5980d;

    public C1728l(int i5, int i6, Object[] objArr, C1787b c1787b) {
        this.f5977a = i5;
        this.f5978b = i6;
        this.f5979c = c1787b;
        this.f5980d = objArr;
    }

    /* JADX INFO: renamed from: j */
    public static C1728l m3060j(int i5, Object obj, Object obj2, int i6, Object obj3, Object obj4, int i7, C1787b c1787b) {
        if (i7 > 30) {
            return new C1728l(0, 0, new Object[]{obj, obj2, obj3, obj4}, c1787b);
        }
        int iM3190D = AbstractC1784a.m3190D(i5, i7);
        int iM3190D2 = AbstractC1784a.m3190D(i6, i7);
        if (iM3190D != iM3190D2) {
            return new C1728l((1 << iM3190D) | (1 << iM3190D2), 0, iM3190D < iM3190D2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, c1787b);
        }
        return new C1728l(0, 1 << iM3190D, new Object[]{m3060j(i5, obj, obj2, i6, obj3, obj4, i7 + 5, c1787b)}, c1787b);
    }

    /* JADX INFO: renamed from: a */
    public final Object[] m3061a(int i5, int i6, int i7, Object obj, Object obj2, int i8, C1787b c1787b) {
        Object obj3 = this.f5980d[i5];
        C1728l c1728lM3060j = m3060j(obj3 != null ? obj3.hashCode() : 0, obj3, m3083x(i5), i7, obj, obj2, i8 + 5, c1787b);
        int iM3079t = m3079t(i6);
        int i9 = iM3079t + 1;
        Object[] objArr = this.f5980d;
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC0972l.m1995S(objArr, objArr2, 0, i5, 6);
        AbstractC0972l.m1993Q(objArr, objArr2, i5, i5 + 2, i9);
        objArr2[iM3079t - 1] = c1728lM3060j;
        AbstractC0972l.m1993Q(objArr, objArr2, iM3079t, i9, objArr.length);
        return objArr2;
    }

    /* JADX INFO: renamed from: b */
    public final int m3062b() {
        if (this.f5978b == 0) {
            return this.f5980d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f5977a);
        int length = this.f5980d.length;
        for (int i5 = iBitCount * 2; i5 < length; i5++) {
            iBitCount += m3078s(i5).m3062b();
        }
        return iBitCount;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3063c(Object obj) {
        C1802b c1802bM3552E = AbstractC1926h.m3552E(AbstractC1926h.m3557J(0, this.f5980d.length), 2);
        int i5 = c1802bM3552E.f6140d;
        int i6 = c1802bM3552E.f6141e;
        int i7 = c1802bM3552E.f6142f;
        if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
            while (!AbstractC1665j.m2981a(obj, this.f5980d[i5])) {
                if (i5 != i6) {
                    i5 += i7;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3064d(int i5, int i6, Object obj) {
        int iM3190D = 1 << AbstractC1784a.m3190D(i5, i6);
        if (m3068h(iM3190D)) {
            return AbstractC1665j.m2981a(obj, this.f5980d[m3066f(iM3190D)]);
        }
        if (!m3069i(iM3190D)) {
            return false;
        }
        C1728l c1728lM3078s = m3078s(m3079t(iM3190D));
        return i6 == 30 ? c1728lM3078s.m3063c(obj) : c1728lM3078s.m3064d(i5, i6 + 5, obj);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3065e(C1728l c1728l) {
        if (this == c1728l) {
            return true;
        }
        if (this.f5978b == c1728l.f5978b && this.f5977a == c1728l.f5977a) {
            int length = this.f5980d.length;
            for (int i5 = 0; i5 < length; i5++) {
                if (this.f5980d[i5] == c1728l.f5980d[i5]) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m3066f(int i5) {
        return Integer.bitCount((i5 - 1) & this.f5977a) * 2;
    }

    /* JADX INFO: renamed from: g */
    public final Object m3067g(int i5, int i6, Object obj) {
        int iM3190D = 1 << AbstractC1784a.m3190D(i5, i6);
        if (m3068h(iM3190D)) {
            int iM3066f = m3066f(iM3190D);
            if (AbstractC1665j.m2981a(obj, this.f5980d[iM3066f])) {
                return m3083x(iM3066f);
            }
            return null;
        }
        if (!m3069i(iM3190D)) {
            return null;
        }
        C1728l c1728lM3078s = m3078s(m3079t(iM3190D));
        if (i6 != 30) {
            return c1728lM3078s.m3067g(i5, i6 + 5, obj);
        }
        C1802b c1802bM3552E = AbstractC1926h.m3552E(AbstractC1926h.m3557J(0, c1728lM3078s.f5980d.length), 2);
        int i7 = c1802bM3552E.f6140d;
        int i8 = c1802bM3552E.f6141e;
        int i9 = c1802bM3552E.f6142f;
        if ((i9 <= 0 || i7 > i8) && (i9 >= 0 || i8 > i7)) {
            return null;
        }
        while (!AbstractC1665j.m2981a(obj, c1728lM3078s.f5980d[i7])) {
            if (i7 == i8) {
                return null;
            }
            i7 += i9;
        }
        return c1728lM3078s.m3083x(i7);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m3068h(int i5) {
        return (i5 & this.f5977a) != 0;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m3069i(int i5) {
        return (i5 & this.f5978b) != 0;
    }

    /* JADX INFO: renamed from: k */
    public final C1728l m3070k(int i5, C1846h c1846h) {
        c1846h.m3310e(c1846h.f6253h - 1);
        c1846h.f6251f = m3083x(i5);
        Object[] objArr = this.f5980d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f5979c != c1846h.f6249d) {
            return new C1728l(0, 0, AbstractC1784a.m3222h(i5, objArr), c1846h.f6249d);
        }
        this.f5980d = AbstractC1784a.m3222h(i5, objArr);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final C1728l m3071l(int i5, Object obj, Object obj2, int i6, C1846h c1846h) {
        C1846h c1846h2;
        C1728l c1728lM3071l;
        int iM3190D = 1 << AbstractC1784a.m3190D(i5, i6);
        boolean zM3068h = m3068h(iM3190D);
        C1787b c1787b = this.f5979c;
        if (zM3068h) {
            int iM3066f = m3066f(iM3190D);
            if (!AbstractC1665j.m2981a(obj, this.f5980d[iM3066f])) {
                c1846h.m3310e(c1846h.f6253h + 1);
                C1787b c1787b2 = c1846h.f6249d;
                if (c1787b != c1787b2) {
                    return new C1728l(this.f5977a ^ iM3190D, this.f5978b | iM3190D, m3061a(iM3066f, iM3190D, i5, obj, obj2, i6, c1787b2), c1787b2);
                }
                this.f5980d = m3061a(iM3066f, iM3190D, i5, obj, obj2, i6, c1787b2);
                this.f5977a ^= iM3190D;
                this.f5978b |= iM3190D;
                return this;
            }
            c1846h.f6251f = m3083x(iM3066f);
            if (m3083x(iM3066f) == obj2) {
                return this;
            }
            if (c1787b == c1846h.f6249d) {
                this.f5980d[iM3066f + 1] = obj2;
                return this;
            }
            c1846h.f6252g++;
            Object[] objArr = this.f5980d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iM3066f + 1] = obj2;
            return new C1728l(this.f5977a, this.f5978b, objArrCopyOf, c1846h.f6249d);
        }
        if (!m3069i(iM3190D)) {
            c1846h.m3310e(c1846h.f6253h + 1);
            C1787b c1787b3 = c1846h.f6249d;
            int iM3066f2 = m3066f(iM3190D);
            if (c1787b != c1787b3) {
                return new C1728l(this.f5977a | iM3190D, this.f5978b, AbstractC1784a.m3221g(this.f5980d, iM3066f2, obj, obj2), c1787b3);
            }
            this.f5980d = AbstractC1784a.m3221g(this.f5980d, iM3066f2, obj, obj2);
            this.f5977a |= iM3190D;
            return this;
        }
        int iM3079t = m3079t(iM3190D);
        C1728l c1728lM3078s = m3078s(iM3079t);
        if (i6 == 30) {
            C1802b c1802bM3552E = AbstractC1926h.m3552E(AbstractC1926h.m3557J(0, c1728lM3078s.f5980d.length), 2);
            int i7 = c1802bM3552E.f6140d;
            int i8 = c1802bM3552E.f6141e;
            int i9 = c1802bM3552E.f6142f;
            if ((i9 <= 0 || i7 > i8) && (i9 >= 0 || i8 > i7)) {
                c1846h.m3310e(c1846h.f6253h + 1);
                c1728lM3071l = new C1728l(0, 0, AbstractC1784a.m3221g(c1728lM3078s.f5980d, 0, obj, obj2), c1846h.f6249d);
                c1846h2 = c1846h;
            } else {
                while (!AbstractC1665j.m2981a(obj, c1728lM3078s.f5980d[i7])) {
                    if (i7 == i8) {
                        c1846h.m3310e(c1846h.f6253h + 1);
                        c1728lM3071l = new C1728l(0, 0, AbstractC1784a.m3221g(c1728lM3078s.f5980d, 0, obj, obj2), c1846h.f6249d);
                        break;
                    }
                    i7 += i9;
                }
                c1846h.f6251f = c1728lM3078s.m3083x(i7);
                if (c1728lM3078s.f5979c == c1846h.f6249d) {
                    c1728lM3078s.f5980d[i7 + 1] = obj2;
                    c1728lM3071l = c1728lM3078s;
                } else {
                    c1846h.f6252g++;
                    Object[] objArr2 = c1728lM3078s.f5980d;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    AbstractC1665j.m2984d(objArrCopyOf2, "copyOf(...)");
                    objArrCopyOf2[i7 + 1] = obj2;
                    c1728lM3071l = new C1728l(0, 0, objArrCopyOf2, c1846h.f6249d);
                }
                c1846h2 = c1846h;
            }
        } else {
            c1846h2 = c1846h;
            c1728lM3071l = c1728lM3078s.m3071l(i5, obj, obj2, i6 + 5, c1846h2);
        }
        return c1728lM3078s == c1728lM3071l ? this : m3077r(iM3079t, c1728lM3071l, c1846h2.f6249d);
    }

    /* JADX INFO: renamed from: m */
    public final C1728l m3072m(C1728l c1728l, int i5, C1786a c1786a, C1846h c1846h) {
        Object[] objArr;
        C1728l c1728lM3060j;
        if (this == c1728l) {
            c1786a.f6102a += m3062b();
            return this;
        }
        int i6 = 0;
        if (i5 > 30) {
            C1787b c1787b = c1846h.f6249d;
            int i7 = c1728l.f5978b;
            Object[] objArr2 = this.f5980d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + c1728l.f5980d.length);
            AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
            int length = this.f5980d.length;
            C1802b c1802bM3552E = AbstractC1926h.m3552E(AbstractC1926h.m3557J(0, c1728l.f5980d.length), 2);
            int i8 = c1802bM3552E.f6140d;
            int i9 = c1802bM3552E.f6141e;
            int i10 = c1802bM3552E.f6142f;
            if ((i10 > 0 && i8 <= i9) || (i10 < 0 && i9 <= i8)) {
                while (true) {
                    if (m3063c(c1728l.f5980d[i8])) {
                        c1786a.f6102a++;
                    } else {
                        Object[] objArr3 = c1728l.f5980d;
                        objArrCopyOf[length] = objArr3[i8];
                        objArrCopyOf[length + 1] = objArr3[i8 + 1];
                        length += 2;
                    }
                    if (i8 == i9) {
                        break;
                    }
                    i8 += i10;
                }
            }
            if (length != this.f5980d.length) {
                if (length == c1728l.f5980d.length) {
                    return c1728l;
                }
                if (length == objArrCopyOf.length) {
                    return new C1728l(0, 0, objArrCopyOf, c1787b);
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
                AbstractC1665j.m2984d(objArrCopyOf2, "copyOf(...)");
                return new C1728l(0, 0, objArrCopyOf2, c1787b);
            }
        } else {
            int i11 = this.f5978b | c1728l.f5978b;
            int i12 = this.f5977a;
            int i13 = c1728l.f5977a;
            int i14 = (i12 ^ i13) & (~i11);
            int i15 = i12 & i13;
            int i16 = i14;
            while (i15 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i15);
                if (AbstractC1665j.m2981a(this.f5980d[m3066f(iLowestOneBit)], c1728l.f5980d[c1728l.m3066f(iLowestOneBit)])) {
                    i16 |= iLowestOneBit;
                } else {
                    i11 |= iLowestOneBit;
                }
                i15 ^= iLowestOneBit;
            }
            if ((i11 & i16) != 0) {
                AbstractC1380p0.m2543b("Check failed.");
            }
            C1728l c1728l2 = (AbstractC1665j.m2981a(this.f5979c, c1846h.f6249d) && this.f5977a == i16 && this.f5978b == i11) ? this : new C1728l(i16, i11, new Object[Integer.bitCount(i11) + (Integer.bitCount(i16) * 2)], null);
            int i17 = i11;
            int i18 = 0;
            while (i17 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i17);
                Object[] objArr4 = c1728l2.f5980d;
                int length2 = (objArr4.length - 1) - i18;
                if (m3069i(iLowestOneBit2)) {
                    c1728lM3060j = m3078s(m3079t(iLowestOneBit2));
                    if (c1728l.m3069i(iLowestOneBit2)) {
                        c1728lM3060j = c1728lM3060j.m3072m(c1728l.m3078s(c1728l.m3079t(iLowestOneBit2)), i5 + 5, c1786a, c1846h);
                        objArr = objArr4;
                    } else if (c1728l.m3068h(iLowestOneBit2)) {
                        int iM3066f = c1728l.m3066f(iLowestOneBit2);
                        Object obj = c1728l.f5980d[iM3066f];
                        Object objM3083x = c1728l.m3083x(iM3066f);
                        int i19 = c1846h.f6253h;
                        objArr = objArr4;
                        c1728lM3060j = c1728lM3060j.m3071l(obj != null ? obj.hashCode() : i6, obj, objM3083x, i5 + 5, c1846h);
                        if (c1846h.f6253h == i19) {
                            c1786a.f6102a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (c1728l.m3069i(iLowestOneBit2)) {
                        C1728l c1728lM3078s = c1728l.m3078s(c1728l.m3079t(iLowestOneBit2));
                        if (m3068h(iLowestOneBit2)) {
                            int iM3066f2 = m3066f(iLowestOneBit2);
                            Object obj2 = this.f5980d[iM3066f2];
                            int i20 = i5 + 5;
                            if (c1728lM3078s.m3064d(obj2 != null ? obj2.hashCode() : 0, i20, obj2)) {
                                c1786a.f6102a++;
                                c1728lM3060j = c1728lM3078s;
                            } else {
                                c1728lM3060j = c1728lM3078s.m3071l(obj2 != null ? obj2.hashCode() : 0, obj2, m3083x(iM3066f2), i20, c1846h);
                            }
                        } else {
                            c1728lM3060j = c1728lM3078s;
                        }
                    } else {
                        int iM3066f3 = m3066f(iLowestOneBit2);
                        Object obj3 = this.f5980d[iM3066f3];
                        Object objM3083x2 = m3083x(iM3066f3);
                        int iM3066f4 = c1728l.m3066f(iLowestOneBit2);
                        Object obj4 = c1728l.f5980d[iM3066f4];
                        c1728lM3060j = m3060j(obj3 != null ? obj3.hashCode() : 0, obj3, objM3083x2, obj4 != null ? obj4.hashCode() : 0, obj4, c1728l.m3083x(iM3066f4), i5 + 5, c1846h.f6249d);
                    }
                }
                objArr[length2] = c1728lM3060j;
                i18++;
                i17 ^= iLowestOneBit2;
                i6 = 0;
            }
            int i21 = 0;
            while (i16 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i16);
                int i22 = i21 * 2;
                if (c1728l.m3068h(iLowestOneBit3)) {
                    int iM3066f5 = c1728l.m3066f(iLowestOneBit3);
                    Object[] objArr5 = c1728l2.f5980d;
                    objArr5[i22] = c1728l.f5980d[iM3066f5];
                    objArr5[i22 + 1] = c1728l.m3083x(iM3066f5);
                    if (m3068h(iLowestOneBit3)) {
                        c1786a.f6102a++;
                    }
                } else {
                    int iM3066f6 = m3066f(iLowestOneBit3);
                    Object[] objArr6 = c1728l2.f5980d;
                    objArr6[i22] = this.f5980d[iM3066f6];
                    objArr6[i22 + 1] = m3083x(iM3066f6);
                }
                i21++;
                i16 ^= iLowestOneBit3;
            }
            if (!m3065e(c1728l2)) {
                return c1728l.m3065e(c1728l2) ? c1728l : c1728l2;
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final C1728l m3073n(int i5, Object obj, int i6, C1846h c1846h) {
        C1728l c1728lM3073n;
        int iM3190D = 1 << AbstractC1784a.m3190D(i5, i6);
        if (m3068h(iM3190D)) {
            int iM3066f = m3066f(iM3190D);
            if (AbstractC1665j.m2981a(obj, this.f5980d[iM3066f])) {
                return m3075p(iM3066f, iM3190D, c1846h);
            }
        } else if (m3069i(iM3190D)) {
            int iM3079t = m3079t(iM3190D);
            C1728l c1728lM3078s = m3078s(iM3079t);
            if (i6 == 30) {
                C1802b c1802bM3552E = AbstractC1926h.m3552E(AbstractC1926h.m3557J(0, c1728lM3078s.f5980d.length), 2);
                int i7 = c1802bM3552E.f6140d;
                int i8 = c1802bM3552E.f6141e;
                int i9 = c1802bM3552E.f6142f;
                if ((i9 <= 0 || i7 > i8) && (i9 >= 0 || i8 > i7)) {
                    c1728lM3073n = c1728lM3078s;
                    break;
                }
                while (!AbstractC1665j.m2981a(obj, c1728lM3078s.f5980d[i7])) {
                    if (i7 == i8) {
                        c1728lM3073n = c1728lM3078s;
                        break;
                    }
                    i7 += i9;
                }
                c1728lM3073n = c1728lM3078s.m3070k(i7, c1846h);
            } else {
                c1728lM3073n = c1728lM3078s.m3073n(i5, obj, i6 + 5, c1846h);
            }
            return m3076q(c1728lM3078s, c1728lM3073n, iM3079t, iM3190D, c1846h.f6249d);
        }
        return this;
    }

    /* JADX INFO: renamed from: o */
    public final C1728l m3074o(int i5, Object obj, Object obj2, int i6, C1846h c1846h) {
        C1728l c1728l;
        C1728l c1728lM3074o;
        int iM3190D = 1 << AbstractC1784a.m3190D(i5, i6);
        if (m3068h(iM3190D)) {
            int iM3066f = m3066f(iM3190D);
            if (AbstractC1665j.m2981a(obj, this.f5980d[iM3066f]) && AbstractC1665j.m2981a(obj2, m3083x(iM3066f))) {
                return m3075p(iM3066f, iM3190D, c1846h);
            }
        } else if (m3069i(iM3190D)) {
            int iM3079t = m3079t(iM3190D);
            C1728l c1728lM3078s = m3078s(iM3079t);
            if (i6 == 30) {
                C1802b c1802bM3552E = AbstractC1926h.m3552E(AbstractC1926h.m3557J(0, c1728lM3078s.f5980d.length), 2);
                int i7 = c1802bM3552E.f6140d;
                int i8 = c1802bM3552E.f6141e;
                int i9 = c1802bM3552E.f6142f;
                if ((i9 <= 0 || i7 > i8) && (i9 >= 0 || i8 > i7)) {
                    c1728lM3074o = c1728lM3078s;
                    c1728l = c1728lM3078s;
                } else {
                    while (true) {
                        if (!AbstractC1665j.m2981a(obj, c1728lM3078s.f5980d[i7]) || !AbstractC1665j.m2981a(obj2, c1728lM3078s.m3083x(i7))) {
                            if (i7 == i8) {
                                break;
                            }
                            i7 += i9;
                        } else {
                            c1728lM3074o = c1728lM3078s.m3070k(i7, c1846h);
                            break;
                        }
                    }
                    c1728lM3074o = c1728lM3078s;
                    c1728l = c1728lM3078s;
                }
            } else {
                c1728l = c1728lM3078s;
                c1728lM3074o = c1728l.m3074o(i5, obj, obj2, i6 + 5, c1846h);
            }
            return m3076q(c1728l, c1728lM3074o, iM3079t, iM3190D, c1846h.f6249d);
        }
        return this;
    }

    /* JADX INFO: renamed from: p */
    public final C1728l m3075p(int i5, int i6, C1846h c1846h) {
        c1846h.m3310e(c1846h.f6253h - 1);
        c1846h.f6251f = m3083x(i5);
        Object[] objArr = this.f5980d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f5979c != c1846h.f6249d) {
            return new C1728l(i6 ^ this.f5977a, this.f5978b, AbstractC1784a.m3222h(i5, objArr), c1846h.f6249d);
        }
        this.f5980d = AbstractC1784a.m3222h(i5, objArr);
        this.f5977a ^= i6;
        return this;
    }

    /* JADX INFO: renamed from: q */
    public final C1728l m3076q(C1728l c1728l, C1728l c1728l2, int i5, int i6, C1787b c1787b) {
        C1787b c1787b2 = this.f5979c;
        if (c1728l2 != null) {
            return (c1787b2 == c1787b || c1728l != c1728l2) ? m3077r(i5, c1728l2, c1787b) : this;
        }
        Object[] objArr = this.f5980d;
        if (objArr.length == 1) {
            return null;
        }
        if (c1787b2 != c1787b) {
            return new C1728l(this.f5977a, i6 ^ this.f5978b, AbstractC1784a.m3223i(i5, objArr), c1787b);
        }
        this.f5980d = AbstractC1784a.m3223i(i5, objArr);
        this.f5978b ^= i6;
        return this;
    }

    /* JADX INFO: renamed from: r */
    public final C1728l m3077r(int i5, C1728l c1728l, C1787b c1787b) {
        Object[] objArr = this.f5980d;
        if (objArr.length == 1 && c1728l.f5980d.length == 2 && c1728l.f5978b == 0) {
            c1728l.f5977a = this.f5978b;
            return c1728l;
        }
        if (this.f5979c == c1787b) {
            objArr[i5] = c1728l;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i5] = c1728l;
        return new C1728l(this.f5977a, this.f5978b, objArrCopyOf, c1787b);
    }

    /* JADX INFO: renamed from: s */
    public final C1728l m3078s(int i5) {
        Object obj = this.f5980d[i5];
        AbstractC1665j.m2983c(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (C1728l) obj;
    }

    /* JADX INFO: renamed from: t */
    public final int m3079t(int i5) {
        return (this.f5980d.length - 1) - Integer.bitCount((i5 - 1) & this.f5978b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d5, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00de, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e1, code lost:
    
        r14.f794f = m3082w(r12, r4, (p119Y.C1728l) r14.f794f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00eb, code lost:
    
        return r14;
     */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p013C0.C0236c m3080u(int r12, int r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p119Y.C1728l.m3080u(int, int, java.lang.Object, java.lang.Object):C0.c");
    }

    /* JADX INFO: renamed from: v */
    public final C1728l m3081v(int i5, int i6, Object obj) {
        C1728l c1728lM3081v;
        int iM3190D = 1 << AbstractC1784a.m3190D(i5, i6);
        if (m3068h(iM3190D)) {
            int iM3066f = m3066f(iM3190D);
            if (AbstractC1665j.m2981a(obj, this.f5980d[iM3066f])) {
                Object[] objArr = this.f5980d;
                if (objArr.length != 2) {
                    return new C1728l(this.f5977a ^ iM3190D, this.f5978b, AbstractC1784a.m3222h(iM3066f, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (m3069i(iM3190D)) {
            int iM3079t = m3079t(iM3190D);
            C1728l c1728lM3078s = m3078s(iM3079t);
            if (i6 == 30) {
                C1802b c1802bM3552E = AbstractC1926h.m3552E(AbstractC1926h.m3557J(0, c1728lM3078s.f5980d.length), 2);
                int i7 = c1802bM3552E.f6140d;
                int i8 = c1802bM3552E.f6141e;
                int i9 = c1802bM3552E.f6142f;
                if ((i9 > 0 && i7 <= i8) || (i9 < 0 && i8 <= i7)) {
                    while (!AbstractC1665j.m2981a(obj, c1728lM3078s.f5980d[i7])) {
                        if (i7 != i8) {
                            i7 += i9;
                        }
                    }
                    Object[] objArr2 = c1728lM3078s.f5980d;
                    c1728lM3081v = objArr2.length == 2 ? null : new C1728l(0, 0, AbstractC1784a.m3222h(i7, objArr2), null);
                }
                c1728lM3081v = c1728lM3078s;
                break;
            }
            c1728lM3081v = c1728lM3078s.m3081v(i5, i6 + 5, obj);
            if (c1728lM3081v == null) {
                Object[] objArr3 = this.f5980d;
                if (objArr3.length != 1) {
                    return new C1728l(this.f5977a, iM3190D ^ this.f5978b, AbstractC1784a.m3223i(iM3079t, objArr3), null);
                }
                return null;
            }
            if (c1728lM3078s != c1728lM3081v) {
                return m3082w(iM3079t, iM3190D, c1728lM3081v);
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: w */
    public final C1728l m3082w(int i5, int i6, C1728l c1728l) {
        Object[] objArr = c1728l.f5980d;
        if (objArr.length != 2 || c1728l.f5978b != 0) {
            Object[] objArr2 = this.f5980d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[i5] = c1728l;
            return new C1728l(this.f5977a, this.f5978b, objArrCopyOf, null);
        }
        if (this.f5980d.length == 1) {
            c1728l.f5977a = this.f5978b;
            return c1728l;
        }
        int iM3066f = m3066f(i6);
        Object[] objArr3 = this.f5980d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        AbstractC1665j.m2984d(objArrCopyOf2, "copyOf(...)");
        AbstractC0972l.m1993Q(objArrCopyOf2, objArrCopyOf2, i5 + 2, i5 + 1, objArr3.length);
        AbstractC0972l.m1993Q(objArrCopyOf2, objArrCopyOf2, iM3066f + 2, iM3066f, i5);
        objArrCopyOf2[iM3066f] = obj;
        objArrCopyOf2[iM3066f + 1] = obj2;
        return new C1728l(this.f5977a ^ i6, i6 ^ this.f5978b, objArrCopyOf2, null);
    }

    /* JADX INFO: renamed from: x */
    public final Object m3083x(int i5) {
        return this.f5980d[i5 + 1];
    }
}
