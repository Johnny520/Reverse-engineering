package p016b1;

import androidx.compose.runtime.AbstractC0464b3;
import java.util.Arrays;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p041d1.AbstractC1851a;
import p041d1.C1852b;
import p041d1.C1855e;
import p080f9.AbstractC2368o;
import p080f9.C2361h;

/* JADX INFO: renamed from: b1.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0924t {

    /* JADX INFO: renamed from: e */
    public static final a f2881e = new a(null);

    /* JADX INFO: renamed from: f */
    public static final int f2882f = 8;

    /* JADX INFO: renamed from: g */
    public static final C0924t f2883g = new C0924t(0, 0, new Object[0]);

    /* JADX INFO: renamed from: a */
    public int f2884a;

    /* JADX INFO: renamed from: b */
    public int f2885b;

    /* JADX INFO: renamed from: c */
    public final C1855e f2886c;

    /* JADX INFO: renamed from: d */
    public Object[] f2887d;

    /* JADX INFO: renamed from: b1.t$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public C0924t f2888a;

        /* JADX INFO: renamed from: b */
        public final int f2889b;

        public b(C0924t c0924t, int i10) {
            this.f2888a = c0924t;
            this.f2889b = i10;
        }

        /* JADX INFO: renamed from: a */
        public final C0924t m3404a() {
            return this.f2888a;
        }

        /* JADX INFO: renamed from: b */
        public final int m3405b() {
            return this.f2889b;
        }

        /* JADX INFO: renamed from: c */
        public final void m3406c(C0924t c0924t) {
            this.f2888a = c0924t;
        }
    }

    public C0924t(int i10, int i11, Object[] objArr, C1855e c1855e) {
        this.f2884a = i10;
        this.f2885b = i11;
        this.f2886c = c1855e;
        this.f2887d = objArr;
    }

    /* JADX INFO: renamed from: A */
    public final C0924t m3355A(int i10, C0910f c0910f) {
        c0910f.m3345r(c0910f.size() - 1);
        c0910f.m3343p(m3377W(i10));
        if (this.f2887d.length == 2) {
            return null;
        }
        C1855e c1855e = this.f2886c;
        C1855e c1855eM3341n = c0910f.m3341n();
        Object[] objArr = this.f2887d;
        if (c1855e != c1855eM3341n) {
            return new C0924t(0, 0, AbstractC0928x.m3426h(objArr, i10), c0910f.m3341n());
        }
        this.f2887d = AbstractC0928x.m3426h(objArr, i10);
        return this;
    }

    /* JADX INFO: renamed from: B */
    public final C0924t m3356B(int i10, Object obj, Object obj2, C1855e c1855e) {
        int iM3390n = m3390n(i10);
        C1855e c1855e2 = this.f2886c;
        Object[] objArr = this.f2887d;
        if (c1855e2 != c1855e) {
            return new C0924t(i10 | this.f2884a, this.f2885b, AbstractC0928x.m3425g(objArr, iM3390n, obj, obj2), c1855e);
        }
        this.f2887d = AbstractC0928x.m3425g(objArr, iM3390n, obj, obj2);
        this.f2884a = i10 | this.f2884a;
        return this;
    }

    /* JADX INFO: renamed from: C */
    public final C0924t m3357C(int i10, int i11, int i12, Object obj, Object obj2, int i13, C1855e c1855e) {
        if (this.f2886c != c1855e) {
            return new C0924t(this.f2884a ^ i11, i11 | this.f2885b, m3380d(i10, i11, i12, obj, obj2, i13, c1855e), c1855e);
        }
        this.f2887d = m3380d(i10, i11, i12, obj, obj2, i13, c1855e);
        this.f2884a ^= i11;
        this.f2885b |= i11;
        return this;
    }

    /* JADX INFO: renamed from: D */
    public final C0924t m3358D(int i10, Object obj, Object obj2, int i11, C0910f c0910f) {
        C0910f c0910f2;
        C0924t c0924tM3358D;
        int iM3424f = 1 << AbstractC0928x.m3424f(i10, i11);
        if (m3393q(iM3424f)) {
            int iM3390n = m3390n(iM3424f);
            if (AbstractC1061t.m3842c(obj, m3396t(iM3390n))) {
                c0910f.m3343p(m3377W(iM3390n));
                return m3377W(iM3390n) == obj2 ? this : m3367M(iM3390n, obj2, c0910f);
            }
            c0910f.m3345r(c0910f.size() + 1);
            return m3357C(iM3390n, iM3424f, i10, obj, obj2, i11, c0910f.m3341n());
        }
        if (!m3394r(iM3424f)) {
            c0910f.m3345r(c0910f.size() + 1);
            return m3356B(iM3424f, obj, obj2, c0910f.m3341n());
        }
        int iM3369O = m3369O(iM3424f);
        C0924t c0924tM3368N = m3368N(iM3369O);
        if (i11 == 30) {
            c0924tM3358D = c0924tM3368N.m3399w(obj, obj2, c0910f);
            c0910f2 = c0910f;
        } else {
            c0910f2 = c0910f;
            c0924tM3358D = c0924tM3368N.m3358D(i10, obj, obj2, i11 + 5, c0910f2);
        }
        return c0924tM3368N == c0924tM3358D ? this : m3366L(iM3369O, c0924tM3358D, c0910f2.m3341n());
    }

    /* JADX INFO: renamed from: E */
    public final C0924t m3359E(C0924t c0924t, int i10, C1852b c1852b, C0910f c0910f) {
        if (this == c0924t) {
            c1852b.m6550b(m3381e());
            return this;
        }
        int i11 = i10;
        if (i11 > 30) {
            return m3400x(c0924t, c1852b, c0910f.m3341n());
        }
        int i12 = this.f2885b | c0924t.f2885b;
        int i13 = this.f2884a;
        int i14 = c0924t.f2884a;
        int i15 = (i13 ^ i14) & (~i12);
        int i16 = i13 & i14;
        while (i16 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i16);
            if (AbstractC1061t.m3842c(m3396t(m3390n(iLowestOneBit)), c0924t.m3396t(c0924t.m3390n(iLowestOneBit)))) {
                i15 |= iLowestOneBit;
            } else {
                i12 |= iLowestOneBit;
            }
            i16 ^= iLowestOneBit;
        }
        int i17 = 0;
        if (!((i12 & i15) == 0)) {
            AbstractC0464b3.m1536b("Check failed.");
        }
        C0924t c0924t2 = (AbstractC1061t.m3842c(this.f2886c, c0910f.m3341n()) && this.f2884a == i15 && this.f2885b == i12) ? this : new C0924t(i15, i12, new Object[(Integer.bitCount(i15) * 2) + Integer.bitCount(i12)]);
        int i18 = i12;
        int i19 = 0;
        while (i18 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i18);
            Object[] objArr = c0924t2.f2887d;
            objArr[(objArr.length - 1) - i19] = m3360F(c0924t, iLowestOneBit2, i11, c1852b, c0910f);
            i19++;
            i18 ^= iLowestOneBit2;
            i11 = i10;
        }
        while (i15 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i15);
            int i20 = i17 * 2;
            if (c0924t.m3393q(iLowestOneBit3)) {
                int iM3390n = c0924t.m3390n(iLowestOneBit3);
                c0924t2.f2887d[i20] = c0924t.m3396t(iM3390n);
                c0924t2.f2887d[i20 + 1] = c0924t.m3377W(iM3390n);
                if (m3393q(iLowestOneBit3)) {
                    c1852b.m6551c(c1852b.m6549a() + 1);
                }
            } else {
                int iM3390n2 = m3390n(iLowestOneBit3);
                c0924t2.f2887d[i20] = m3396t(iM3390n2);
                c0924t2.f2887d[i20 + 1] = m3377W(iM3390n2);
            }
            i17++;
            i15 ^= iLowestOneBit3;
        }
        return m3388l(c0924t2) ? this : c0924t.m3388l(c0924t2) ? c0924t : c0924t2;
    }

    /* JADX INFO: renamed from: F */
    public final C0924t m3360F(C0924t c0924t, int i10, int i11, C1852b c1852b, C0910f c0910f) {
        if (m3394r(i10)) {
            C0924t c0924tM3368N = m3368N(m3369O(i10));
            if (c0924t.m3394r(i10)) {
                return c0924tM3368N.m3359E(c0924t.m3368N(c0924t.m3369O(i10)), i11 + 5, c1852b, c0910f);
            }
            if (!c0924t.m3393q(i10)) {
                return c0924tM3368N;
            }
            int iM3390n = c0924t.m3390n(i10);
            Object objM3396t = c0924t.m3396t(iM3390n);
            Object objM3377W = c0924t.m3377W(iM3390n);
            int size = c0910f.size();
            C0924t c0924tM3358D = c0924tM3368N.m3358D(objM3396t != null ? objM3396t.hashCode() : 0, objM3396t, objM3377W, i11 + 5, c0910f);
            if (c0910f.size() == size) {
                c1852b.m6551c(c1852b.m6549a() + 1);
            }
            return c0924tM3358D;
        }
        if (!c0924t.m3394r(i10)) {
            int iM3390n2 = m3390n(i10);
            Object objM3396t2 = m3396t(iM3390n2);
            Object objM3377W2 = m3377W(iM3390n2);
            int iM3390n3 = c0924t.m3390n(i10);
            Object objM3396t3 = c0924t.m3396t(iM3390n3);
            return m3397u(objM3396t2 != null ? objM3396t2.hashCode() : 0, objM3396t2, objM3377W2, objM3396t3 != null ? objM3396t3.hashCode() : 0, objM3396t3, c0924t.m3377W(iM3390n3), i11 + 5, c0910f.m3341n());
        }
        C0924t c0924tM3368N2 = c0924t.m3368N(c0924t.m3369O(i10));
        if (!m3393q(i10)) {
            return c0924tM3368N2;
        }
        int iM3390n4 = m3390n(i10);
        Object objM3396t4 = m3396t(iM3390n4);
        int i12 = i11 + 5;
        if (!c0924tM3368N2.m3387k(objM3396t4 != null ? objM3396t4.hashCode() : 0, objM3396t4, i12)) {
            return c0924tM3368N2.m3358D(objM3396t4 != null ? objM3396t4.hashCode() : 0, objM3396t4, m3377W(iM3390n4), i12, c0910f);
        }
        c1852b.m6551c(c1852b.m6549a() + 1);
        return c0924tM3368N2;
    }

    /* JADX INFO: renamed from: G */
    public final C0924t m3361G(int i10, Object obj, int i11, C0910f c0910f) {
        int iM3424f = 1 << AbstractC0928x.m3424f(i10, i11);
        if (m3393q(iM3424f)) {
            int iM3390n = m3390n(iM3424f);
            if (AbstractC1061t.m3842c(obj, m3396t(iM3390n))) {
                return m3363I(iM3390n, iM3424f, c0910f);
            }
        } else if (m3394r(iM3424f)) {
            int iM3369O = m3369O(iM3424f);
            C0924t c0924tM3368N = m3368N(iM3369O);
            return m3365K(c0924tM3368N, i11 == 30 ? c0924tM3368N.m3401y(obj, c0910f) : c0924tM3368N.m3361G(i10, obj, i11 + 5, c0910f), iM3369O, iM3424f, c0910f.m3341n());
        }
        return this;
    }

    /* JADX INFO: renamed from: H */
    public final C0924t m3362H(int i10, Object obj, Object obj2, int i11, C0910f c0910f) {
        int iM3424f = 1 << AbstractC0928x.m3424f(i10, i11);
        if (m3393q(iM3424f)) {
            int iM3390n = m3390n(iM3424f);
            if (AbstractC1061t.m3842c(obj, m3396t(iM3390n)) && AbstractC1061t.m3842c(obj2, m3377W(iM3390n))) {
                return m3363I(iM3390n, iM3424f, c0910f);
            }
        } else if (m3394r(iM3424f)) {
            int iM3369O = m3369O(iM3424f);
            C0924t c0924tM3368N = m3368N(iM3369O);
            return m3365K(c0924tM3368N, i11 == 30 ? c0924tM3368N.m3402z(obj, obj2, c0910f) : c0924tM3368N.m3362H(i10, obj, obj2, i11 + 5, c0910f), iM3369O, iM3424f, c0910f.m3341n());
        }
        return this;
    }

    /* JADX INFO: renamed from: I */
    public final C0924t m3363I(int i10, int i11, C0910f c0910f) {
        c0910f.m3345r(c0910f.size() - 1);
        c0910f.m3343p(m3377W(i10));
        if (this.f2887d.length == 2) {
            return null;
        }
        C1855e c1855e = this.f2886c;
        C1855e c1855eM3341n = c0910f.m3341n();
        Object[] objArr = this.f2887d;
        if (c1855e != c1855eM3341n) {
            return new C0924t(i11 ^ this.f2884a, this.f2885b, AbstractC0928x.m3426h(objArr, i10), c0910f.m3341n());
        }
        this.f2887d = AbstractC0928x.m3426h(objArr, i10);
        this.f2884a ^= i11;
        return this;
    }

    /* JADX INFO: renamed from: J */
    public final C0924t m3364J(int i10, int i11, C1855e c1855e) {
        Object[] objArr = this.f2887d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.f2886c != c1855e) {
            return new C0924t(this.f2884a, i11 ^ this.f2885b, AbstractC0928x.m3427i(objArr, i10), c1855e);
        }
        this.f2887d = AbstractC0928x.m3427i(objArr, i10);
        this.f2885b ^= i11;
        return this;
    }

    /* JADX INFO: renamed from: K */
    public final C0924t m3365K(C0924t c0924t, C0924t c0924t2, int i10, int i11, C1855e c1855e) {
        return c0924t2 == null ? m3364J(i10, i11, c1855e) : (this.f2886c == c1855e || c0924t != c0924t2) ? m3366L(i10, c0924t2, c1855e) : this;
    }

    /* JADX INFO: renamed from: L */
    public final C0924t m3366L(int i10, C0924t c0924t, C1855e c1855e) {
        Object[] objArr = this.f2887d;
        if (objArr.length == 1 && c0924t.f2887d.length == 2 && c0924t.f2885b == 0) {
            c0924t.f2884a = this.f2885b;
            return c0924t;
        }
        if (this.f2886c == c1855e) {
            objArr[i10] = c0924t;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i10] = c0924t;
        return new C0924t(this.f2884a, this.f2885b, objArrCopyOf, c1855e);
    }

    /* JADX INFO: renamed from: M */
    public final C0924t m3367M(int i10, Object obj, C0910f c0910f) {
        if (this.f2886c == c0910f.m3341n()) {
            this.f2887d[i10 + 1] = obj;
            return this;
        }
        c0910f.m3342o(c0910f.m3339l() + 1);
        Object[] objArr = this.f2887d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i10 + 1] = obj;
        return new C0924t(this.f2884a, this.f2885b, objArrCopyOf, c0910f.m3341n());
    }

    /* JADX INFO: renamed from: N */
    public final C0924t m3368N(int i10) {
        Object obj = this.f2887d[i10];
        obj.getClass();
        return (C0924t) obj;
    }

    /* JADX INFO: renamed from: O */
    public final int m3369O(int i10) {
        return (this.f2887d.length - 1) - Integer.bitCount((i10 - 1) & this.f2885b);
    }

    /* JADX INFO: renamed from: P */
    public final b m3370P(int i10, Object obj, Object obj2, int i11) {
        b bVarM3370P;
        int iM3424f = 1 << AbstractC0928x.m3424f(i10, i11);
        if (m3393q(iM3424f)) {
            int iM3390n = m3390n(iM3424f);
            if (!AbstractC1061t.m3842c(obj, m3396t(iM3390n))) {
                return m3398v(iM3390n, iM3424f, i10, obj, obj2, i11).m3378b();
            }
            if (m3377W(iM3390n) == obj2) {
                return null;
            }
            return m3376V(iM3390n, obj2).m3379c();
        }
        if (!m3394r(iM3424f)) {
            return m3395s(iM3424f, obj, obj2).m3378b();
        }
        int iM3369O = m3369O(iM3424f);
        C0924t c0924tM3368N = m3368N(iM3369O);
        if (i11 == 30) {
            bVarM3370P = c0924tM3368N.m3384h(obj, obj2);
            if (bVarM3370P == null) {
                return null;
            }
        } else {
            bVarM3370P = c0924tM3368N.m3370P(i10, obj, obj2, i11 + 5);
            if (bVarM3370P == null) {
                return null;
            }
        }
        bVarM3370P.m3406c(m3375U(iM3369O, iM3424f, bVarM3370P.m3404a()));
        return bVarM3370P;
    }

    /* JADX INFO: renamed from: Q */
    public final C0924t m3371Q(int i10, Object obj, int i11) {
        int iM3424f = 1 << AbstractC0928x.m3424f(i10, i11);
        if (m3393q(iM3424f)) {
            int iM3390n = m3390n(iM3424f);
            if (AbstractC1061t.m3842c(obj, m3396t(iM3390n))) {
                return m3372R(iM3390n, iM3424f);
            }
        } else if (m3394r(iM3424f)) {
            int iM3369O = m3369O(iM3424f);
            C0924t c0924tM3368N = m3368N(iM3369O);
            return m3374T(c0924tM3368N, i11 == 30 ? c0924tM3368N.m3385i(obj) : c0924tM3368N.m3371Q(i10, obj, i11 + 5), iM3369O, iM3424f);
        }
        return this;
    }

    /* JADX INFO: renamed from: R */
    public final C0924t m3372R(int i10, int i11) {
        Object[] objArr = this.f2887d;
        if (objArr.length == 2) {
            return null;
        }
        return new C0924t(i11 ^ this.f2884a, this.f2885b, AbstractC0928x.m3426h(objArr, i10));
    }

    /* JADX INFO: renamed from: S */
    public final C0924t m3373S(int i10, int i11) {
        Object[] objArr = this.f2887d;
        if (objArr.length == 1) {
            return null;
        }
        return new C0924t(this.f2884a, i11 ^ this.f2885b, AbstractC0928x.m3427i(objArr, i10));
    }

    /* JADX INFO: renamed from: T */
    public final C0924t m3374T(C0924t c0924t, C0924t c0924t2, int i10, int i11) {
        return c0924t2 == null ? m3373S(i10, i11) : c0924t != c0924t2 ? m3375U(i10, i11, c0924t2) : this;
    }

    /* JADX INFO: renamed from: U */
    public final C0924t m3375U(int i10, int i11, C0924t c0924t) {
        Object[] objArr = c0924t.f2887d;
        if (objArr.length != 2 || c0924t.f2885b != 0) {
            Object[] objArr2 = this.f2887d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            objArrCopyOf[i10] = c0924t;
            return new C0924t(this.f2884a, this.f2885b, objArrCopyOf);
        }
        if (this.f2887d.length == 1) {
            c0924t.f2884a = this.f2885b;
            return c0924t;
        }
        return new C0924t(this.f2884a ^ i11, i11 ^ this.f2885b, AbstractC0928x.m3429k(this.f2887d, i10, m3390n(i11), objArr[0], objArr[1]));
    }

    /* JADX INFO: renamed from: V */
    public final C0924t m3376V(int i10, Object obj) {
        Object[] objArr = this.f2887d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i10 + 1] = obj;
        return new C0924t(this.f2884a, this.f2885b, objArrCopyOf);
    }

    /* JADX INFO: renamed from: W */
    public final Object m3377W(int i10) {
        return this.f2887d[i10 + 1];
    }

    /* JADX INFO: renamed from: b */
    public final b m3378b() {
        return new b(this, 1);
    }

    /* JADX INFO: renamed from: c */
    public final b m3379c() {
        return new b(this, 0);
    }

    /* JADX INFO: renamed from: d */
    public final Object[] m3380d(int i10, int i11, int i12, Object obj, Object obj2, int i13, C1855e c1855e) {
        Object objM3396t = m3396t(i10);
        return AbstractC0928x.m3428j(this.f2887d, i10, m3369O(i11) + 1, m3397u(objM3396t != null ? objM3396t.hashCode() : 0, objM3396t, m3377W(i10), i12, obj, obj2, i13 + 5, c1855e));
    }

    /* JADX INFO: renamed from: e */
    public final int m3381e() {
        if (this.f2885b == 0) {
            return this.f2887d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f2884a);
        int length = this.f2887d.length;
        for (int i10 = iBitCount * 2; i10 < length; i10++) {
            iBitCount += m3368N(i10).m3381e();
        }
        return iBitCount;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m3382f(Object obj) {
        C2361h c2361hM8591r = AbstractC2368o.m8591r(AbstractC2368o.m8592s(0, this.f2887d.length), 2);
        int iM8560o = c2361hM8591r.m8560o();
        int iM8561p = c2361hM8591r.m8561p();
        int iM8562q = c2361hM8591r.m8562q();
        if ((iM8562q > 0 && iM8560o <= iM8561p) || (iM8562q < 0 && iM8561p <= iM8560o)) {
            while (!AbstractC1061t.m3842c(obj, this.f2887d[iM8560o])) {
                if (iM8560o != iM8561p) {
                    iM8560o += iM8562q;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final Object m3383g(Object obj) {
        C2361h c2361hM8591r = AbstractC2368o.m8591r(AbstractC2368o.m8592s(0, this.f2887d.length), 2);
        int iM8560o = c2361hM8591r.m8560o();
        int iM8561p = c2361hM8591r.m8561p();
        int iM8562q = c2361hM8591r.m8562q();
        if ((iM8562q <= 0 || iM8560o > iM8561p) && (iM8562q >= 0 || iM8561p > iM8560o)) {
            return null;
        }
        while (!AbstractC1061t.m3842c(obj, m3396t(iM8560o))) {
            if (iM8560o == iM8561p) {
                return null;
            }
            iM8560o += iM8562q;
        }
        return m3377W(iM8560o);
    }

    /* JADX INFO: renamed from: h */
    public final b m3384h(Object obj, Object obj2) {
        C2361h c2361hM8591r = AbstractC2368o.m8591r(AbstractC2368o.m8592s(0, this.f2887d.length), 2);
        int iM8560o = c2361hM8591r.m8560o();
        int iM8561p = c2361hM8591r.m8561p();
        int iM8562q = c2361hM8591r.m8562q();
        if ((iM8562q > 0 && iM8560o <= iM8561p) || (iM8562q < 0 && iM8561p <= iM8560o)) {
            while (!AbstractC1061t.m3842c(obj, m3396t(iM8560o))) {
                if (iM8560o != iM8561p) {
                    iM8560o += iM8562q;
                }
            }
            if (obj2 == m3377W(iM8560o)) {
                return null;
            }
            Object[] objArr = this.f2887d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iM8560o + 1] = obj2;
            return new C0924t(0, 0, objArrCopyOf).m3379c();
        }
        return new C0924t(0, 0, AbstractC0928x.m3425g(this.f2887d, 0, obj, obj2)).m3378b();
    }

    /* JADX INFO: renamed from: i */
    public final C0924t m3385i(Object obj) {
        C2361h c2361hM8591r = AbstractC2368o.m8591r(AbstractC2368o.m8592s(0, this.f2887d.length), 2);
        int iM8560o = c2361hM8591r.m8560o();
        int iM8561p = c2361hM8591r.m8561p();
        int iM8562q = c2361hM8591r.m8562q();
        if ((iM8562q > 0 && iM8560o <= iM8561p) || (iM8562q < 0 && iM8561p <= iM8560o)) {
            while (!AbstractC1061t.m3842c(obj, m3396t(iM8560o))) {
                if (iM8560o != iM8561p) {
                    iM8560o += iM8562q;
                }
            }
            return m3386j(iM8560o);
        }
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final C0924t m3386j(int i10) {
        Object[] objArr = this.f2887d;
        if (objArr.length == 2) {
            return null;
        }
        return new C0924t(0, 0, AbstractC0928x.m3426h(objArr, i10));
    }

    /* JADX INFO: renamed from: k */
    public final boolean m3387k(int i10, Object obj, int i11) {
        int iM3424f = 1 << AbstractC0928x.m3424f(i10, i11);
        if (m3393q(iM3424f)) {
            return AbstractC1061t.m3842c(obj, m3396t(m3390n(iM3424f)));
        }
        if (!m3394r(iM3424f)) {
            return false;
        }
        C0924t c0924tM3368N = m3368N(m3369O(iM3424f));
        return i11 == 30 ? c0924tM3368N.m3382f(obj) : c0924tM3368N.m3387k(i10, obj, i11 + 5);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m3388l(C0924t c0924t) {
        if (this == c0924t) {
            return true;
        }
        if (this.f2885b != c0924t.f2885b || this.f2884a != c0924t.f2884a) {
            return false;
        }
        int length = this.f2887d.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f2887d[i10] != c0924t.f2887d[i10]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final int m3389m() {
        return Integer.bitCount(this.f2884a);
    }

    /* JADX INFO: renamed from: n */
    public final int m3390n(int i10) {
        return Integer.bitCount((i10 - 1) & this.f2884a) * 2;
    }

    /* JADX INFO: renamed from: o */
    public final Object m3391o(int i10, Object obj, int i11) {
        int iM3424f = 1 << AbstractC0928x.m3424f(i10, i11);
        if (m3393q(iM3424f)) {
            int iM3390n = m3390n(iM3424f);
            if (AbstractC1061t.m3842c(obj, m3396t(iM3390n))) {
                return m3377W(iM3390n);
            }
            return null;
        }
        if (!m3394r(iM3424f)) {
            return null;
        }
        C0924t c0924tM3368N = m3368N(m3369O(iM3424f));
        return i11 == 30 ? c0924tM3368N.m3383g(obj) : c0924tM3368N.m3391o(i10, obj, i11 + 5);
    }

    /* JADX INFO: renamed from: p */
    public final Object[] m3392p() {
        return this.f2887d;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m3393q(int i10) {
        return (i10 & this.f2884a) != 0;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m3394r(int i10) {
        return (i10 & this.f2885b) != 0;
    }

    /* JADX INFO: renamed from: s */
    public final C0924t m3395s(int i10, Object obj, Object obj2) {
        return new C0924t(i10 | this.f2884a, this.f2885b, AbstractC0928x.m3425g(this.f2887d, m3390n(i10), obj, obj2));
    }

    /* JADX INFO: renamed from: t */
    public final Object m3396t(int i10) {
        return this.f2887d[i10];
    }

    /* JADX INFO: renamed from: u */
    public final C0924t m3397u(int i10, Object obj, Object obj2, int i11, Object obj3, Object obj4, int i12, C1855e c1855e) {
        if (i12 > 30) {
            return new C0924t(0, 0, new Object[]{obj, obj2, obj3, obj4}, c1855e);
        }
        int iM3424f = AbstractC0928x.m3424f(i10, i12);
        int iM3424f2 = AbstractC0928x.m3424f(i11, i12);
        if (iM3424f != iM3424f2) {
            return new C0924t((1 << iM3424f) | (1 << iM3424f2), 0, iM3424f < iM3424f2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, c1855e);
        }
        return new C0924t(0, 1 << iM3424f, new Object[]{m3397u(i10, obj, obj2, i11, obj3, obj4, i12 + 5, c1855e)}, c1855e);
    }

    /* JADX INFO: renamed from: v */
    public final C0924t m3398v(int i10, int i11, int i12, Object obj, Object obj2, int i13) {
        return new C0924t(this.f2884a ^ i11, this.f2885b | i11, m3380d(i10, i11, i12, obj, obj2, i13, null));
    }

    /* JADX INFO: renamed from: w */
    public final C0924t m3399w(Object obj, Object obj2, C0910f c0910f) {
        C2361h c2361hM8591r = AbstractC2368o.m8591r(AbstractC2368o.m8592s(0, this.f2887d.length), 2);
        int iM8560o = c2361hM8591r.m8560o();
        int iM8561p = c2361hM8591r.m8561p();
        int iM8562q = c2361hM8591r.m8562q();
        if ((iM8562q > 0 && iM8560o <= iM8561p) || (iM8562q < 0 && iM8561p <= iM8560o)) {
            while (!AbstractC1061t.m3842c(obj, m3396t(iM8560o))) {
                if (iM8560o != iM8561p) {
                    iM8560o += iM8562q;
                }
            }
            c0910f.m3343p(m3377W(iM8560o));
            if (this.f2886c == c0910f.m3341n()) {
                this.f2887d[iM8560o + 1] = obj2;
                return this;
            }
            c0910f.m3342o(c0910f.m3339l() + 1);
            Object[] objArr = this.f2887d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iM8560o + 1] = obj2;
            return new C0924t(0, 0, objArrCopyOf, c0910f.m3341n());
        }
        c0910f.m3345r(c0910f.size() + 1);
        return new C0924t(0, 0, AbstractC0928x.m3425g(this.f2887d, 0, obj, obj2), c0910f.m3341n());
    }

    /* JADX INFO: renamed from: x */
    public final C0924t m3400x(C0924t c0924t, C1852b c1852b, C1855e c1855e) {
        AbstractC1851a.m6548a(this.f2885b == 0);
        AbstractC1851a.m6548a(this.f2884a == 0);
        AbstractC1851a.m6548a(c0924t.f2885b == 0);
        AbstractC1851a.m6548a(c0924t.f2884a == 0);
        Object[] objArr = this.f2887d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + c0924t.f2887d.length);
        int length = this.f2887d.length;
        C2361h c2361hM8591r = AbstractC2368o.m8591r(AbstractC2368o.m8592s(0, c0924t.f2887d.length), 2);
        int iM8560o = c2361hM8591r.m8560o();
        int iM8561p = c2361hM8591r.m8561p();
        int iM8562q = c2361hM8591r.m8562q();
        if ((iM8562q > 0 && iM8560o <= iM8561p) || (iM8562q < 0 && iM8561p <= iM8560o)) {
            while (true) {
                if (m3382f(c0924t.f2887d[iM8560o])) {
                    c1852b.m6551c(c1852b.m6549a() + 1);
                } else {
                    Object[] objArr2 = c0924t.f2887d;
                    objArrCopyOf[length] = objArr2[iM8560o];
                    objArrCopyOf[length + 1] = objArr2[iM8560o + 1];
                    length += 2;
                }
                if (iM8560o == iM8561p) {
                    break;
                }
                iM8560o += iM8562q;
            }
        }
        return length == this.f2887d.length ? this : length == c0924t.f2887d.length ? c0924t : length == objArrCopyOf.length ? new C0924t(0, 0, objArrCopyOf, c1855e) : new C0924t(0, 0, Arrays.copyOf(objArrCopyOf, length), c1855e);
    }

    /* JADX INFO: renamed from: y */
    public final C0924t m3401y(Object obj, C0910f c0910f) {
        C2361h c2361hM8591r = AbstractC2368o.m8591r(AbstractC2368o.m8592s(0, this.f2887d.length), 2);
        int iM8560o = c2361hM8591r.m8560o();
        int iM8561p = c2361hM8591r.m8561p();
        int iM8562q = c2361hM8591r.m8562q();
        if ((iM8562q > 0 && iM8560o <= iM8561p) || (iM8562q < 0 && iM8561p <= iM8560o)) {
            while (!AbstractC1061t.m3842c(obj, m3396t(iM8560o))) {
                if (iM8560o != iM8561p) {
                    iM8560o += iM8562q;
                }
            }
            return m3355A(iM8560o, c0910f);
        }
        return this;
    }

    /* JADX INFO: renamed from: z */
    public final C0924t m3402z(Object obj, Object obj2, C0910f c0910f) {
        C2361h c2361hM8591r = AbstractC2368o.m8591r(AbstractC2368o.m8592s(0, this.f2887d.length), 2);
        int iM8560o = c2361hM8591r.m8560o();
        int iM8561p = c2361hM8591r.m8561p();
        int iM8562q = c2361hM8591r.m8562q();
        if ((iM8562q > 0 && iM8560o <= iM8561p) || (iM8562q < 0 && iM8561p <= iM8560o)) {
            while (true) {
                if (!AbstractC1061t.m3842c(obj, m3396t(iM8560o)) || !AbstractC1061t.m3842c(obj2, m3377W(iM8560o))) {
                    if (iM8560o == iM8561p) {
                        break;
                    }
                    iM8560o += iM8562q;
                } else {
                    return m3355A(iM8560o, c0910f);
                }
            }
        }
        return this;
    }

    /* JADX INFO: renamed from: b1.t$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C0924t m3403a() {
            return C0924t.f2883g;
        }

        public a() {
        }
    }

    public C0924t(int i10, int i11, Object[] objArr) {
        this(i10, i11, objArr, null);
    }
}
