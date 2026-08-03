package p223p0;

import be.AbstractC0283h;
import gg.AbstractC1416l;
import java.util.Arrays;
import p005a5.C0016a;
import p117i0.AbstractC1861n1;
import p172lg.C2562b;
import p252r0.C3642a;
import p252r0.C3643b;
import p259r9.AbstractC3754e0;
import p266s0.C3877g;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: p0.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3282j {

    /* JADX INFO: renamed from: e */
    public static final C3282j f10439e = new C3282j(0, 0, new Object[0], null);

    /* JADX INFO: renamed from: a */
    public int f10440a;

    /* JADX INFO: renamed from: b */
    public int f10441b;

    /* JADX INFO: renamed from: c */
    public final C3643b f10442c;

    /* JADX INFO: renamed from: d */
    public Object[] f10443d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3282j(int i9, int i10, Object[] objArr, C3643b c3643b) {
        this.f10440a = i9;
        this.f10441b = i10;
        this.f10442c = c3643b;
        this.f10443d = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static C3282j m6943j(int i9, Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11, C3643b c3643b) {
        if (i11 > 30) {
            return new C3282j(0, 0, new Object[]{obj, obj2, obj3, obj4}, c3643b);
        }
        int iM1122B = AbstractC0283h.m1122B(i9, i11);
        int iM1122B2 = AbstractC0283h.m1122B(i10, i11);
        if (iM1122B != iM1122B2) {
            return new C3282j((1 << iM1122B) | (1 << iM1122B2), 0, iM1122B < iM1122B2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, c3643b);
        }
        return new C3282j(0, 1 << iM1122B, new Object[]{m6943j(i9, obj, obj2, i10, obj3, obj4, i11 + 5, c3643b)}, c3643b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Object[] m6944a(int i9, int i10, int i11, Object obj, Object obj2, int i12, C3643b c3643b) {
        Object obj3 = this.f10443d[i9];
        C3282j c3282jM6943j = m6943j(obj3 != null ? obj3.hashCode() : 0, obj3, m6966x(i9), i11, obj, obj2, i12 + 5, c3643b);
        int iM6962t = m6962t(i10);
        int i13 = iM6962t + 1;
        Object[] objArr = this.f10443d;
        Object[] objArr2 = new Object[objArr.length - 1];
        AbstractC4165l.m8383r0(0, i9, objArr, 6, objArr2);
        AbstractC4165l.m8379n0(i9, i9 + 2, objArr, i13, objArr2);
        objArr2[iM6962t - 1] = c3282jM6943j;
        AbstractC4165l.m8379n0(iM6962t, i13, objArr, objArr.length, objArr2);
        return objArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m6945b() {
        if (this.f10441b == 0) {
            return this.f10443d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f10440a);
        int length = this.f10443d.length;
        for (int i9 = iBitCount * 2; i9 < length; i9++) {
            iBitCount += m6961s(i9).m6945b();
        }
        return iBitCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m6946c(Object obj) {
        C2562b c2562bM7902n0 = AbstractC3754e0.m7902n0(AbstractC3754e0.m7910r0(0, this.f10443d.length), 2);
        int i9 = c2562bM7902n0.f8312g;
        int i10 = c2562bM7902n0.f8313h;
        int i11 = c2562bM7902n0.f8314i;
        if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
            while (!AbstractC1416l.m3825a(obj, this.f10443d[i9])) {
                if (i9 != i10) {
                    i9 += i11;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m6947d(int i9, int i10, Object obj) {
        int iM1122B = 1 << AbstractC0283h.m1122B(i9, i10);
        if (m6951h(iM1122B)) {
            return AbstractC1416l.m3825a(obj, this.f10443d[m6949f(iM1122B)]);
        }
        if (!m6952i(iM1122B)) {
            return false;
        }
        C3282j c3282jM6961s = m6961s(m6962t(iM1122B));
        return i10 == 30 ? c3282jM6961s.m6946c(obj) : c3282jM6961s.m6947d(i9, i10 + 5, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m6948e(C3282j c3282j) {
        if (this == c3282j) {
            return true;
        }
        if (this.f10441b == c3282j.f10441b && this.f10440a == c3282j.f10440a) {
            int length = this.f10443d.length;
            for (int i9 = 0; i9 < length; i9++) {
                if (this.f10443d[i9] == c3282j.f10443d[i9]) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final int m6949f(int i9) {
        return Integer.bitCount((i9 - 1) & this.f10440a) * 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final Object m6950g(int i9, int i10, Object obj) {
        int iM1122B = 1 << AbstractC0283h.m1122B(i9, i10);
        if (m6951h(iM1122B)) {
            int iM6949f = m6949f(iM1122B);
            if (AbstractC1416l.m3825a(obj, this.f10443d[iM6949f])) {
                return m6966x(iM6949f);
            }
            return null;
        }
        if (!m6952i(iM1122B)) {
            return null;
        }
        C3282j c3282jM6961s = m6961s(m6962t(iM1122B));
        if (i10 != 30) {
            return c3282jM6961s.m6950g(i9, i10 + 5, obj);
        }
        C2562b c2562bM7902n0 = AbstractC3754e0.m7902n0(AbstractC3754e0.m7910r0(0, c3282jM6961s.f10443d.length), 2);
        int i11 = c2562bM7902n0.f8312g;
        int i12 = c2562bM7902n0.f8313h;
        int i13 = c2562bM7902n0.f8314i;
        if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
            return null;
        }
        while (!AbstractC1416l.m3825a(obj, c3282jM6961s.f10443d[i11])) {
            if (i11 == i12) {
                return null;
            }
            i11 += i13;
        }
        return c3282jM6961s.m6966x(i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final boolean m6951h(int i9) {
        return (i9 & this.f10440a) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m6952i(int i9) {
        return (i9 & this.f10441b) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final C3282j m6953k(int i9, C3877g c3877g) {
        c3877g.m8065f(c3877g.f12731k - 1);
        c3877g.f12729i = m6966x(i9);
        Object[] objArr = this.f10443d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f10442c != c3877g.f12727g) {
            return new C3282j(0, 0, AbstractC0283h.m1155e(i9, objArr), c3877g.f12727g);
        }
        this.f10443d = AbstractC0283h.m1155e(i9, objArr);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final C3282j m6954l(int i9, Object obj, Object obj2, int i10, C3877g c3877g) {
        C3877g c3877g2;
        C3282j c3282jM6954l;
        int iM1122B = 1 << AbstractC0283h.m1122B(i9, i10);
        boolean zM6951h = m6951h(iM1122B);
        C3643b c3643b = this.f10442c;
        if (zM6951h) {
            int iM6949f = m6949f(iM1122B);
            if (!AbstractC1416l.m3825a(obj, this.f10443d[iM6949f])) {
                c3877g.m8065f(c3877g.f12731k + 1);
                C3643b c3643b2 = c3877g.f12727g;
                if (c3643b != c3643b2) {
                    return new C3282j(this.f10440a ^ iM1122B, this.f10441b | iM1122B, m6944a(iM6949f, iM1122B, i9, obj, obj2, i10, c3643b2), c3643b2);
                }
                this.f10443d = m6944a(iM6949f, iM1122B, i9, obj, obj2, i10, c3643b2);
                this.f10440a ^= iM1122B;
                this.f10441b |= iM1122B;
                return this;
            }
            c3877g.f12729i = m6966x(iM6949f);
            if (m6966x(iM6949f) == obj2) {
                return this;
            }
            if (c3643b == c3877g.f12727g) {
                this.f10443d[iM6949f + 1] = obj2;
                return this;
            }
            c3877g.f12730j++;
            Object[] objArr = this.f10443d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iM6949f + 1] = obj2;
            return new C3282j(this.f10440a, this.f10441b, objArrCopyOf, c3877g.f12727g);
        }
        if (!m6952i(iM1122B)) {
            c3877g.m8065f(c3877g.f12731k + 1);
            C3643b c3643b3 = c3877g.f12727g;
            int iM6949f2 = m6949f(iM1122B);
            Object[] objArr2 = this.f10443d;
            if (c3643b != c3643b3) {
                return new C3282j(this.f10440a | iM1122B, this.f10441b, AbstractC0283h.m1153d(iM6949f2, obj, obj2, objArr2), c3643b3);
            }
            this.f10443d = AbstractC0283h.m1153d(iM6949f2, obj, obj2, objArr2);
            this.f10440a |= iM1122B;
            return this;
        }
        int iM6962t = m6962t(iM1122B);
        C3282j c3282jM6961s = m6961s(iM6962t);
        if (i10 == 30) {
            C2562b c2562bM7902n0 = AbstractC3754e0.m7902n0(AbstractC3754e0.m7910r0(0, c3282jM6961s.f10443d.length), 2);
            int i11 = c2562bM7902n0.f8312g;
            int i12 = c2562bM7902n0.f8313h;
            int i13 = c2562bM7902n0.f8314i;
            if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
                c3877g.m8065f(c3877g.f12731k + 1);
                c3282jM6954l = new C3282j(0, 0, AbstractC0283h.m1153d(0, obj, obj2, c3282jM6961s.f10443d), c3877g.f12727g);
                c3877g2 = c3877g;
            } else {
                while (!AbstractC1416l.m3825a(obj, c3282jM6961s.f10443d[i11])) {
                    if (i11 == i12) {
                        c3877g.m8065f(c3877g.f12731k + 1);
                        c3282jM6954l = new C3282j(0, 0, AbstractC0283h.m1153d(0, obj, obj2, c3282jM6961s.f10443d), c3877g.f12727g);
                        break;
                    }
                    i11 += i13;
                }
                c3877g.f12729i = c3282jM6961s.m6966x(i11);
                if (c3282jM6961s.f10442c == c3877g.f12727g) {
                    c3282jM6961s.f10443d[i11 + 1] = obj2;
                    c3282jM6954l = c3282jM6961s;
                } else {
                    c3877g.f12730j++;
                    Object[] objArr3 = c3282jM6961s.f10443d;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length);
                    objArrCopyOf2[i11 + 1] = obj2;
                    c3282jM6954l = new C3282j(0, 0, objArrCopyOf2, c3877g.f12727g);
                }
                c3877g2 = c3877g;
            }
        } else {
            c3877g2 = c3877g;
            c3282jM6954l = c3282jM6961s.m6954l(i9, obj, obj2, i10 + 5, c3877g2);
        }
        return c3282jM6961s == c3282jM6954l ? this : m6960r(iM6962t, c3282jM6954l, c3877g2.f12727g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final C3282j m6955m(C3282j c3282j, int i9, C3642a c3642a, C3877g c3877g) {
        Object[] objArr;
        C3282j c3282jM6943j;
        if (this == c3282j) {
            c3642a.f11821a += m6945b();
            return this;
        }
        int i10 = 0;
        if (i9 > 30) {
            C3643b c3643b = c3877g.f12727g;
            int i11 = c3282j.f10441b;
            Object[] objArr2 = this.f10443d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + c3282j.f10443d.length);
            int length = this.f10443d.length;
            C2562b c2562bM7902n0 = AbstractC3754e0.m7902n0(AbstractC3754e0.m7910r0(0, c3282j.f10443d.length), 2);
            int i12 = c2562bM7902n0.f8312g;
            int i13 = c2562bM7902n0.f8313h;
            int i14 = c2562bM7902n0.f8314i;
            if ((i14 > 0 && i12 <= i13) || (i14 < 0 && i13 <= i12)) {
                while (true) {
                    if (m6946c(c3282j.f10443d[i12])) {
                        c3642a.f11821a++;
                    } else {
                        Object[] objArr3 = c3282j.f10443d;
                        objArrCopyOf[length] = objArr3[i12];
                        objArrCopyOf[length + 1] = objArr3[i12 + 1];
                        length += 2;
                    }
                    if (i12 == i13) {
                        break;
                    }
                    i12 += i14;
                }
            }
            if (length != this.f10443d.length) {
                return length == c3282j.f10443d.length ? c3282j : length == objArrCopyOf.length ? new C3282j(0, 0, objArrCopyOf, c3643b) : new C3282j(0, 0, Arrays.copyOf(objArrCopyOf, length), c3643b);
            }
        } else {
            int i15 = this.f10441b | c3282j.f10441b;
            int i16 = this.f10440a;
            int i17 = c3282j.f10440a;
            int i18 = (i16 ^ i17) & (~i15);
            int i19 = i16 & i17;
            int i20 = i18;
            while (i19 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i19);
                if (AbstractC1416l.m3825a(this.f10443d[m6949f(iLowestOneBit)], c3282j.f10443d[c3282j.m6949f(iLowestOneBit)])) {
                    i20 |= iLowestOneBit;
                } else {
                    i15 |= iLowestOneBit;
                }
                i19 ^= iLowestOneBit;
            }
            if ((i15 & i20) != 0) {
                AbstractC1861n1.m4584b("Check failed.");
            }
            C3282j c3282j2 = (AbstractC1416l.m3825a(this.f10442c, c3877g.f12727g) && this.f10440a == i20 && this.f10441b == i15) ? this : new C3282j(i20, i15, new Object[Integer.bitCount(i15) + (Integer.bitCount(i20) * 2)], null);
            int i21 = i15;
            int i22 = 0;
            while (i21 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i21);
                Object[] objArr4 = c3282j2.f10443d;
                int length2 = (objArr4.length - 1) - i22;
                if (m6952i(iLowestOneBit2)) {
                    c3282jM6943j = m6961s(m6962t(iLowestOneBit2));
                    if (c3282j.m6952i(iLowestOneBit2)) {
                        c3282jM6943j = c3282jM6943j.m6955m(c3282j.m6961s(c3282j.m6962t(iLowestOneBit2)), i9 + 5, c3642a, c3877g);
                        objArr = objArr4;
                    } else if (c3282j.m6951h(iLowestOneBit2)) {
                        int iM6949f = c3282j.m6949f(iLowestOneBit2);
                        Object obj = c3282j.f10443d[iM6949f];
                        Object objM6966x = c3282j.m6966x(iM6949f);
                        int i23 = c3877g.f12731k;
                        objArr = objArr4;
                        c3282jM6943j = c3282jM6943j.m6954l(obj != null ? obj.hashCode() : i10, obj, objM6966x, i9 + 5, c3877g);
                        if (c3877g.f12731k == i23) {
                            c3642a.f11821a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (c3282j.m6952i(iLowestOneBit2)) {
                        C3282j c3282jM6961s = c3282j.m6961s(c3282j.m6962t(iLowestOneBit2));
                        if (m6951h(iLowestOneBit2)) {
                            int iM6949f2 = m6949f(iLowestOneBit2);
                            Object obj2 = this.f10443d[iM6949f2];
                            int i24 = i9 + 5;
                            if (c3282jM6961s.m6947d(obj2 != null ? obj2.hashCode() : 0, i24, obj2)) {
                                c3642a.f11821a++;
                                c3282jM6943j = c3282jM6961s;
                            } else {
                                c3282jM6943j = c3282jM6961s.m6954l(obj2 != null ? obj2.hashCode() : 0, obj2, m6966x(iM6949f2), i24, c3877g);
                            }
                        } else {
                            c3282jM6943j = c3282jM6961s;
                        }
                    } else {
                        int iM6949f3 = m6949f(iLowestOneBit2);
                        Object obj3 = this.f10443d[iM6949f3];
                        Object objM6966x2 = m6966x(iM6949f3);
                        int iM6949f4 = c3282j.m6949f(iLowestOneBit2);
                        Object obj4 = c3282j.f10443d[iM6949f4];
                        c3282jM6943j = m6943j(obj3 != null ? obj3.hashCode() : 0, obj3, objM6966x2, obj4 != null ? obj4.hashCode() : 0, obj4, c3282j.m6966x(iM6949f4), i9 + 5, c3877g.f12727g);
                    }
                }
                objArr[length2] = c3282jM6943j;
                i22++;
                i21 ^= iLowestOneBit2;
                i10 = 0;
            }
            int i25 = 0;
            while (i20 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i20);
                int i26 = i25 * 2;
                if (c3282j.m6951h(iLowestOneBit3)) {
                    int iM6949f5 = c3282j.m6949f(iLowestOneBit3);
                    Object[] objArr5 = c3282j2.f10443d;
                    objArr5[i26] = c3282j.f10443d[iM6949f5];
                    objArr5[i26 + 1] = c3282j.m6966x(iM6949f5);
                    if (m6951h(iLowestOneBit3)) {
                        c3642a.f11821a++;
                    }
                } else {
                    int iM6949f6 = m6949f(iLowestOneBit3);
                    Object[] objArr6 = c3282j2.f10443d;
                    objArr6[i26] = this.f10443d[iM6949f6];
                    objArr6[i26 + 1] = m6966x(iM6949f6);
                }
                i25++;
                i20 ^= iLowestOneBit3;
            }
            if (!m6948e(c3282j2)) {
                return c3282j.m6948e(c3282j2) ? c3282j : c3282j2;
            }
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final C3282j m6956n(int i9, Object obj, int i10, C3877g c3877g) {
        C3282j c3282jM6956n;
        int iM1122B = 1 << AbstractC0283h.m1122B(i9, i10);
        if (m6951h(iM1122B)) {
            int iM6949f = m6949f(iM1122B);
            if (AbstractC1416l.m3825a(obj, this.f10443d[iM6949f])) {
                return m6958p(iM6949f, iM1122B, c3877g);
            }
        } else if (m6952i(iM1122B)) {
            int iM6962t = m6962t(iM1122B);
            C3282j c3282jM6961s = m6961s(iM6962t);
            if (i10 == 30) {
                C2562b c2562bM7902n0 = AbstractC3754e0.m7902n0(AbstractC3754e0.m7910r0(0, c3282jM6961s.f10443d.length), 2);
                int i11 = c2562bM7902n0.f8312g;
                int i12 = c2562bM7902n0.f8313h;
                int i13 = c2562bM7902n0.f8314i;
                if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
                    c3282jM6956n = c3282jM6961s;
                    break;
                }
                while (!AbstractC1416l.m3825a(obj, c3282jM6961s.f10443d[i11])) {
                    if (i11 == i12) {
                        c3282jM6956n = c3282jM6961s;
                        break;
                    }
                    i11 += i13;
                }
                c3282jM6956n = c3282jM6961s.m6953k(i11, c3877g);
            } else {
                c3282jM6956n = c3282jM6961s.m6956n(i9, obj, i10 + 5, c3877g);
            }
            return m6959q(c3282jM6961s, c3282jM6956n, iM6962t, iM1122B, c3877g.f12727g);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final C3282j m6957o(int i9, Object obj, Object obj2, int i10, C3877g c3877g) {
        C3282j c3282j;
        C3282j c3282jM6957o;
        int iM1122B = 1 << AbstractC0283h.m1122B(i9, i10);
        if (m6951h(iM1122B)) {
            int iM6949f = m6949f(iM1122B);
            if (AbstractC1416l.m3825a(obj, this.f10443d[iM6949f]) && AbstractC1416l.m3825a(obj2, m6966x(iM6949f))) {
                return m6958p(iM6949f, iM1122B, c3877g);
            }
        } else if (m6952i(iM1122B)) {
            int iM6962t = m6962t(iM1122B);
            C3282j c3282jM6961s = m6961s(iM6962t);
            if (i10 == 30) {
                C2562b c2562bM7902n0 = AbstractC3754e0.m7902n0(AbstractC3754e0.m7910r0(0, c3282jM6961s.f10443d.length), 2);
                int i11 = c2562bM7902n0.f8312g;
                int i12 = c2562bM7902n0.f8313h;
                int i13 = c2562bM7902n0.f8314i;
                if ((i13 <= 0 || i11 > i12) && (i13 >= 0 || i12 > i11)) {
                    c3282jM6957o = c3282jM6961s;
                    c3282j = c3282jM6961s;
                } else {
                    while (true) {
                        if (!AbstractC1416l.m3825a(obj, c3282jM6961s.f10443d[i11]) || !AbstractC1416l.m3825a(obj2, c3282jM6961s.m6966x(i11))) {
                            if (i11 == i12) {
                                break;
                            }
                            i11 += i13;
                        } else {
                            c3282jM6957o = c3282jM6961s.m6953k(i11, c3877g);
                            break;
                        }
                    }
                    c3282jM6957o = c3282jM6961s;
                    c3282j = c3282jM6961s;
                }
            } else {
                c3282j = c3282jM6961s;
                c3282jM6957o = c3282j.m6957o(i9, obj, obj2, i10 + 5, c3877g);
            }
            return m6959q(c3282j, c3282jM6957o, iM6962t, iM1122B, c3877g.f12727g);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final C3282j m6958p(int i9, int i10, C3877g c3877g) {
        c3877g.m8065f(c3877g.f12731k - 1);
        c3877g.f12729i = m6966x(i9);
        Object[] objArr = this.f10443d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f10442c != c3877g.f12727g) {
            return new C3282j(i10 ^ this.f10440a, this.f10441b, AbstractC0283h.m1155e(i9, objArr), c3877g.f12727g);
        }
        this.f10443d = AbstractC0283h.m1155e(i9, objArr);
        this.f10440a ^= i10;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final C3282j m6959q(C3282j c3282j, C3282j c3282j2, int i9, int i10, C3643b c3643b) {
        C3643b c3643b2 = this.f10442c;
        if (c3282j2 != null) {
            return (c3643b2 == c3643b || c3282j != c3282j2) ? m6960r(i9, c3282j2, c3643b) : this;
        }
        Object[] objArr = this.f10443d;
        if (objArr.length == 1) {
            return null;
        }
        if (c3643b2 != c3643b) {
            return new C3282j(this.f10440a, i10 ^ this.f10441b, AbstractC0283h.m1157f(i9, objArr), c3643b);
        }
        this.f10443d = AbstractC0283h.m1157f(i9, objArr);
        this.f10441b ^= i10;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final C3282j m6960r(int i9, C3282j c3282j, C3643b c3643b) {
        Object[] objArr = this.f10443d;
        if (objArr.length == 1 && c3282j.f10443d.length == 2 && c3282j.f10441b == 0) {
            c3282j.f10440a = this.f10441b;
            return c3282j;
        }
        if (this.f10442c == c3643b) {
            objArr[i9] = c3282j;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i9] = c3282j;
        return new C3282j(this.f10440a, this.f10441b, objArrCopyOf, c3643b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final C3282j m6961s(int i9) {
        Object obj = this.f10443d[i9];
        obj.getClass();
        return (C3282j) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final int m6962t(int i9) {
        return (this.f10443d.length - 1) - Integer.bitCount((i9 - 1) & this.f10441b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cf, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d8, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00db, code lost:
    
        r14.f56i = m6965w(r12, r4, (p223p0.C3282j) r14.f56i);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e5, code lost:
    
        return r14;
     */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0016a m6963u(int i9, Object obj, Object obj2, int i10) {
        C0016a c0016aM6963u;
        int i11 = 1;
        int iM1122B = 1 << AbstractC0283h.m1122B(i9, i10);
        int i12 = 0;
        if (m6951h(iM1122B)) {
            int iM6949f = m6949f(iM1122B);
            if (!AbstractC1416l.m3825a(obj, this.f10443d[iM6949f])) {
                return new C0016a(i11, 9, new C3282j(this.f10440a ^ iM1122B, this.f10441b | iM1122B, m6944a(iM6949f, iM1122B, i9, obj, obj2, i10, null), null));
            }
            if (m6966x(iM6949f) != obj2) {
                Object[] objArr = this.f10443d;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                objArrCopyOf[iM6949f + 1] = obj2;
                return new C0016a(i12, 9, new C3282j(this.f10440a, this.f10441b, objArrCopyOf, null));
            }
        } else {
            if (!m6952i(iM1122B)) {
                return new C0016a(i11, 9, new C3282j(this.f10440a | iM1122B, this.f10441b, AbstractC0283h.m1153d(m6949f(iM1122B), obj, obj2, this.f10443d), null));
            }
            int iM6962t = m6962t(iM1122B);
            C3282j c3282jM6961s = m6961s(iM6962t);
            if (i10 == 30) {
                C2562b c2562bM7902n0 = AbstractC3754e0.m7902n0(AbstractC3754e0.m7910r0(0, c3282jM6961s.f10443d.length), 2);
                int i13 = c2562bM7902n0.f8312g;
                int i14 = c2562bM7902n0.f8313h;
                int i15 = c2562bM7902n0.f8314i;
                if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
                    while (!AbstractC1416l.m3825a(obj, c3282jM6961s.f10443d[i13])) {
                        if (i13 != i14) {
                            i13 += i15;
                        }
                    }
                    if (obj2 == c3282jM6961s.m6966x(i13)) {
                        c0016aM6963u = null;
                    } else {
                        Object[] objArr2 = c3282jM6961s.f10443d;
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        objArrCopyOf2[i13 + 1] = obj2;
                        c0016aM6963u = new C0016a(i12, 9, new C3282j(0, 0, objArrCopyOf2, null));
                    }
                }
                c0016aM6963u = new C0016a(i11, 9, new C3282j(0, 0, AbstractC0283h.m1153d(0, obj, obj2, c3282jM6961s.f10443d), null));
                break;
            }
            c0016aM6963u = c3282jM6961s.m6963u(i9, obj, obj2, i10 + 5);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final C3282j m6964v(int i9, int i10, Object obj) {
        C3282j c3282jM6964v;
        int iM1122B = 1 << AbstractC0283h.m1122B(i9, i10);
        if (m6951h(iM1122B)) {
            int iM6949f = m6949f(iM1122B);
            if (AbstractC1416l.m3825a(obj, this.f10443d[iM6949f])) {
                Object[] objArr = this.f10443d;
                if (objArr.length != 2) {
                    return new C3282j(this.f10440a ^ iM1122B, this.f10441b, AbstractC0283h.m1155e(iM6949f, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (m6952i(iM1122B)) {
            int iM6962t = m6962t(iM1122B);
            C3282j c3282jM6961s = m6961s(iM6962t);
            if (i10 == 30) {
                C2562b c2562bM7902n0 = AbstractC3754e0.m7902n0(AbstractC3754e0.m7910r0(0, c3282jM6961s.f10443d.length), 2);
                int i11 = c2562bM7902n0.f8312g;
                int i12 = c2562bM7902n0.f8313h;
                int i13 = c2562bM7902n0.f8314i;
                if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                    while (!AbstractC1416l.m3825a(obj, c3282jM6961s.f10443d[i11])) {
                        if (i11 != i12) {
                            i11 += i13;
                        }
                    }
                    Object[] objArr2 = c3282jM6961s.f10443d;
                    c3282jM6964v = objArr2.length == 2 ? null : new C3282j(0, 0, AbstractC0283h.m1155e(i11, objArr2), null);
                }
                c3282jM6964v = c3282jM6961s;
                break;
            }
            c3282jM6964v = c3282jM6961s.m6964v(i9, i10 + 5, obj);
            if (c3282jM6964v == null) {
                Object[] objArr3 = this.f10443d;
                if (objArr3.length != 1) {
                    return new C3282j(this.f10440a, iM1122B ^ this.f10441b, AbstractC0283h.m1157f(iM6962t, objArr3), null);
                }
                return null;
            }
            if (c3282jM6961s != c3282jM6964v) {
                return m6965w(iM6962t, iM1122B, c3282jM6964v);
            }
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final C3282j m6965w(int i9, int i10, C3282j c3282j) {
        Object[] objArr = c3282j.f10443d;
        if (objArr.length != 2 || c3282j.f10441b != 0) {
            Object[] objArr2 = this.f10443d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i9] = c3282j;
            return new C3282j(this.f10440a, this.f10441b, objArrCopyOf, null);
        }
        if (this.f10443d.length == 1) {
            c3282j.f10440a = this.f10441b;
            return c3282j;
        }
        int iM6949f = m6949f(i10);
        Object[] objArr3 = this.f10443d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        AbstractC4165l.m8379n0(i9 + 2, i9 + 1, objArrCopyOf2, objArr3.length, objArrCopyOf2);
        AbstractC4165l.m8379n0(iM6949f + 2, iM6949f, objArrCopyOf2, i9, objArrCopyOf2);
        objArrCopyOf2[iM6949f] = obj;
        objArrCopyOf2[iM6949f + 1] = obj2;
        return new C3282j(this.f10440a ^ i10, i10 ^ this.f10441b, objArrCopyOf2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final Object m6966x(int i9) {
        return this.f10443d[i9 + 1];
    }
}
