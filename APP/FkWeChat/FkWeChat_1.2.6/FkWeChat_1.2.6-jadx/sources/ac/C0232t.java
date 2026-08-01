package ac;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p052dc.AbstractC1943a;
import p052dc.C1944b;
import p052dc.C1948f;
import p080f9.AbstractC2368o;
import p080f9.C2361h;
import p185m8.AbstractC5101q0;
import p376zd.C10010p0;

/* JADX INFO: renamed from: ac.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0232t {

    /* JADX INFO: renamed from: e */
    public static final a f580e = new a(null);

    /* JADX INFO: renamed from: f */
    public static final C0232t f581f = new C0232t(0, 0, new Object[0]);

    /* JADX INFO: renamed from: a */
    public int f582a;

    /* JADX INFO: renamed from: b */
    public int f583b;

    /* JADX INFO: renamed from: c */
    public final C1948f f584c;

    /* JADX INFO: renamed from: d */
    public Object[] f585d;

    /* JADX INFO: renamed from: ac.t$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public C0232t f586a;

        /* JADX INFO: renamed from: b */
        public final int f587b;

        public b(C0232t c0232t, int i10) {
            c0232t.getClass();
            this.f586a = c0232t;
            this.f587b = i10;
        }

        /* JADX INFO: renamed from: a */
        public final C0232t m558a() {
            return this.f586a;
        }

        /* JADX INFO: renamed from: b */
        public final int m559b() {
            return this.f587b;
        }

        /* JADX INFO: renamed from: c */
        public final void m560c(C0232t c0232t) {
            c0232t.getClass();
            this.f586a = c0232t;
        }
    }

    public C0232t(int i10, int i11, Object[] objArr, C1948f c1948f) {
        objArr.getClass();
        this.f582a = i10;
        this.f583b = i11;
        this.f584c = c1948f;
        this.f585d = objArr;
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ C0232t m506W(C0232t c0232t, int i10, int i11, C0232t c0232t2, C1948f c1948f, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            c1948f = null;
        }
        return c0232t.m529V(i10, i11, c0232t2, c1948f);
    }

    /* JADX INFO: renamed from: A */
    public final C0232t m508A(Object obj, C0218f c0218f) {
        int iM538h = m538h(obj);
        return iM538h != -1 ? m510C(iM538h, c0218f) : this;
    }

    /* JADX INFO: renamed from: B */
    public final C0232t m509B(Object obj, Object obj2, C0218f c0218f) {
        int iM538h = m538h(obj);
        return (iM538h == -1 || !AbstractC1061t.m3842c(obj2, m531Y(iM538h))) ? this : m510C(iM538h, c0218f);
    }

    /* JADX INFO: renamed from: C */
    public final C0232t m510C(int i10, C0218f c0218f) {
        c0218f.m490s(c0218f.size() - 1);
        c0218f.m489r(m531Y(i10));
        if (this.f585d.length == 2) {
            return null;
        }
        C1948f c1948f = this.f584c;
        C1948f c1948fM486o = c0218f.m486o();
        Object[] objArr = this.f585d;
        if (c1948f != c1948fM486o) {
            return new C0232t(0, 0, AbstractC0236x.m580h(objArr, i10), c0218f.m486o());
        }
        this.f585d = AbstractC0236x.m580h(objArr, i10);
        return this;
    }

    /* JADX INFO: renamed from: D */
    public final C0232t m511D(int i10, Object obj, Object obj2, C1948f c1948f) {
        int iM545o = m545o(i10);
        C1948f c1948f2 = this.f584c;
        Object[] objArr = this.f585d;
        if (c1948f2 != c1948f) {
            return new C0232t(i10 | this.f582a, this.f583b, AbstractC0236x.m579g(objArr, iM545o, obj, obj2), c1948f);
        }
        this.f585d = AbstractC0236x.m579g(objArr, iM545o, obj, obj2);
        this.f582a = i10 | this.f582a;
        return this;
    }

    /* JADX INFO: renamed from: E */
    public final C0232t m512E(int i10, int i11, int i12, Object obj, Object obj2, int i13, C1948f c1948f) {
        if (this.f584c != c1948f) {
            return new C0232t(this.f582a ^ i11, i11 | this.f583b, m534d(i10, i11, i12, obj, obj2, i13, c1948f), c1948f);
        }
        this.f585d = m534d(i10, i11, i12, obj, obj2, i13, c1948f);
        this.f582a ^= i11;
        this.f583b |= i11;
        return this;
    }

    /* JADX INFO: renamed from: F */
    public final C0232t m513F(int i10, Object obj, Object obj2, int i11, C0218f c0218f) {
        C0218f c0218f2;
        C0232t c0232tM513F;
        c0218f.getClass();
        int iM578f = 1 << AbstractC0236x.m578f(i10, i11);
        if (m549s(iM578f)) {
            int iM545o = m545o(iM578f);
            if (AbstractC1061t.m3842c(obj, m552v(iM545o))) {
                c0218f.m489r(m531Y(iM545o));
                return m531Y(iM545o) == obj2 ? this : m521N(iM545o, obj2, c0218f);
            }
            c0218f.m490s(c0218f.size() + 1);
            return m512E(iM545o, iM578f, i10, obj, obj2, i11, c0218f.m486o());
        }
        if (!m550t(iM578f)) {
            c0218f.m490s(c0218f.size() + 1);
            return m511D(iM578f, obj, obj2, c0218f.m486o());
        }
        int iM523P = m523P(iM578f);
        C0232t c0232tM522O = m522O(iM523P);
        if (i11 == 30) {
            c0232tM513F = c0232tM522O.m555y(obj, obj2, c0218f);
            c0218f2 = c0218f;
        } else {
            c0218f2 = c0218f;
            c0232tM513F = c0232tM522O.m513F(i10, obj, obj2, i11 + 5, c0218f2);
        }
        return c0232tM522O == c0232tM513F ? this : m529V(iM523P, iM578f, c0232tM513F, c0218f2.m486o());
    }

    /* JADX INFO: renamed from: G */
    public final C0232t m514G(C0232t c0232t, int i10, C1944b c1944b, C0218f c0218f) {
        c0232t.getClass();
        c1944b.getClass();
        c0218f.getClass();
        if (this == c0232t) {
            c1944b.m7051b(m535e());
            return this;
        }
        int i11 = i10;
        if (i11 > 30) {
            return m556z(c0232t, c1944b, c0218f.m486o());
        }
        int i12 = this.f583b | c0232t.f583b;
        int i13 = this.f582a;
        int i14 = c0232t.f582a;
        int i15 = (i13 ^ i14) & (~i12);
        int i16 = i13 & i14;
        int i17 = i15;
        while (i16 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i16);
            if (AbstractC1061t.m3842c(m552v(m545o(iLowestOneBit)), c0232t.m552v(c0232t.m545o(iLowestOneBit)))) {
                i17 |= iLowestOneBit;
            } else {
                i12 |= iLowestOneBit;
            }
            i16 ^= iLowestOneBit;
        }
        if ((i12 & i17) != 0) {
            C10010p0.m38820a("Check failed.");
            return null;
        }
        C0232t c0232t2 = (AbstractC1061t.m3842c(this.f584c, c0218f.m486o()) && this.f582a == i17 && this.f583b == i12) ? this : new C0232t(i17, i12, new Object[(Integer.bitCount(i17) * 2) + Integer.bitCount(i12)]);
        int i18 = 0;
        int i19 = i12;
        int i20 = 0;
        while (i19 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i19);
            c0232t2.f585d[(r11.length - 1) - i20] = m515H(c0232t, iLowestOneBit2, i11, c1944b, c0218f);
            i20++;
            i19 ^= iLowestOneBit2;
            i11 = i10;
        }
        while (i17 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i17);
            int i21 = i18 * 2;
            if (c0232t.m549s(iLowestOneBit3)) {
                int iM545o = c0232t.m545o(iLowestOneBit3);
                c0232t2.f585d[i21] = c0232t.m552v(iM545o);
                c0232t2.f585d[i21 + 1] = c0232t.m531Y(iM545o);
                if (m549s(iLowestOneBit3)) {
                    c1944b.m7052c(c1944b.m7050a() + 1);
                }
            } else {
                int iM545o2 = m545o(iLowestOneBit3);
                c0232t2.f585d[i21] = m552v(iM545o2);
                c0232t2.f585d[i21 + 1] = m531Y(iM545o2);
            }
            i18++;
            i17 ^= iLowestOneBit3;
        }
        return m543m(c0232t2) ? this : c0232t.m543m(c0232t2) ? c0232t : c0232t2;
    }

    /* JADX INFO: renamed from: H */
    public final C0232t m515H(C0232t c0232t, int i10, int i11, C1944b c1944b, C0218f c0218f) {
        if (m550t(i10)) {
            C0232t c0232tM522O = m522O(m523P(i10));
            if (c0232t.m550t(i10)) {
                return c0232tM522O.m514G(c0232t.m522O(c0232t.m523P(i10)), i11 + 5, c1944b, c0218f);
            }
            if (!c0232t.m549s(i10)) {
                return c0232tM522O;
            }
            int iM545o = c0232t.m545o(i10);
            Object objM552v = c0232t.m552v(iM545o);
            Object objM531Y = c0232t.m531Y(iM545o);
            int size = c0218f.size();
            C0232t c0232tM513F = c0232tM522O.m513F(objM552v != null ? objM552v.hashCode() : 0, objM552v, objM531Y, i11 + 5, c0218f);
            if (c0218f.size() == size) {
                c1944b.m7052c(c1944b.m7050a() + 1);
            }
            return c0232tM513F;
        }
        if (!c0232t.m550t(i10)) {
            int iM545o2 = m545o(i10);
            Object objM552v2 = m552v(iM545o2);
            Object objM531Y2 = m531Y(iM545o2);
            int iM545o3 = c0232t.m545o(i10);
            Object objM552v3 = c0232t.m552v(iM545o3);
            return m553w(objM552v2 != null ? objM552v2.hashCode() : 0, objM552v2, objM531Y2, objM552v3 != null ? objM552v3.hashCode() : 0, objM552v3, c0232t.m531Y(iM545o3), i11 + 5, c0218f.m486o());
        }
        C0232t c0232tM522O2 = c0232t.m522O(c0232t.m523P(i10));
        if (!m549s(i10)) {
            return c0232tM522O2;
        }
        int iM545o4 = m545o(i10);
        Object objM552v4 = m552v(iM545o4);
        int i12 = i11 + 5;
        if (!c0232tM522O2.m542l(objM552v4 != null ? objM552v4.hashCode() : 0, objM552v4, i12)) {
            return c0232tM522O2.m513F(objM552v4 != null ? objM552v4.hashCode() : 0, objM552v4, m531Y(iM545o4), i12, c0218f);
        }
        c1944b.m7052c(c1944b.m7050a() + 1);
        return c0232tM522O2;
    }

    /* JADX INFO: renamed from: I */
    public final C0232t m516I(int i10, Object obj, int i11, C0218f c0218f) {
        c0218f.getClass();
        int iM578f = 1 << AbstractC0236x.m578f(i10, i11);
        if (m549s(iM578f)) {
            int iM545o = m545o(iM578f);
            if (AbstractC1061t.m3842c(obj, m552v(iM545o))) {
                return m518K(iM545o, iM578f, c0218f);
            }
        } else if (m550t(iM578f)) {
            int iM523P = m523P(iM578f);
            C0232t c0232tM522O = m522O(iM523P);
            return m520M(i11 == 30 ? c0232tM522O.m508A(obj, c0218f) : c0232tM522O.m516I(i10, obj, i11 + 5, c0218f), iM523P, iM578f, c0218f.m486o());
        }
        return this;
    }

    /* JADX INFO: renamed from: J */
    public final C0232t m517J(int i10, Object obj, Object obj2, int i11, C0218f c0218f) {
        C0218f c0218f2;
        C0232t c0232tM517J;
        c0218f.getClass();
        int iM578f = 1 << AbstractC0236x.m578f(i10, i11);
        if (m549s(iM578f)) {
            int iM545o = m545o(iM578f);
            if (AbstractC1061t.m3842c(obj, m552v(iM545o)) && AbstractC1061t.m3842c(obj2, m531Y(iM545o))) {
                return m518K(iM545o, iM578f, c0218f);
            }
        } else if (m550t(iM578f)) {
            int iM523P = m523P(iM578f);
            C0232t c0232tM522O = m522O(iM523P);
            if (i11 == 30) {
                c0232tM517J = c0232tM522O.m509B(obj, obj2, c0218f);
                c0218f2 = c0218f;
            } else {
                c0218f2 = c0218f;
                c0232tM517J = c0232tM522O.m517J(i10, obj, obj2, i11 + 5, c0218f2);
            }
            return m520M(c0232tM517J, iM523P, iM578f, c0218f2.m486o());
        }
        return this;
    }

    /* JADX INFO: renamed from: K */
    public final C0232t m518K(int i10, int i11, C0218f c0218f) {
        c0218f.m490s(c0218f.size() - 1);
        c0218f.m489r(m531Y(i10));
        if (this.f585d.length == 2) {
            return null;
        }
        C1948f c1948f = this.f584c;
        C1948f c1948fM486o = c0218f.m486o();
        Object[] objArr = this.f585d;
        if (c1948f != c1948fM486o) {
            return new C0232t(i11 ^ this.f582a, this.f583b, AbstractC0236x.m580h(objArr, i10), c0218f.m486o());
        }
        this.f585d = AbstractC0236x.m580h(objArr, i10);
        this.f582a ^= i11;
        return this;
    }

    /* JADX INFO: renamed from: L */
    public final C0232t m519L(int i10, int i11, C1948f c1948f) {
        Object[] objArr = this.f585d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.f584c != c1948f) {
            return new C0232t(this.f582a, i11 ^ this.f583b, AbstractC0236x.m581i(objArr, i10), c1948f);
        }
        this.f585d = AbstractC0236x.m581i(objArr, i10);
        this.f583b ^= i11;
        return this;
    }

    /* JADX INFO: renamed from: M */
    public final C0232t m520M(C0232t c0232t, int i10, int i11, C1948f c1948f) {
        return c0232t == null ? m519L(i10, i11, c1948f) : m529V(i10, i11, c0232t, c1948f);
    }

    /* JADX INFO: renamed from: N */
    public final C0232t m521N(int i10, Object obj, C0218f c0218f) {
        if (this.f584c == c0218f.m486o()) {
            this.f585d[i10 + 1] = obj;
            return this;
        }
        c0218f.m487p(c0218f.m484m() + 1);
        Object[] objArr = this.f585d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i10 + 1] = obj;
        return new C0232t(this.f582a, this.f583b, objArrCopyOf, c0218f.m486o());
    }

    /* JADX INFO: renamed from: O */
    public final C0232t m522O(int i10) {
        Object obj = this.f585d[i10];
        obj.getClass();
        return (C0232t) obj;
    }

    /* JADX INFO: renamed from: P */
    public final int m523P(int i10) {
        return (this.f585d.length - 1) - Integer.bitCount((i10 - 1) & this.f583b);
    }

    /* JADX INFO: renamed from: Q */
    public final b m524Q(int i10, Object obj, Object obj2, int i11) {
        b bVarM524Q;
        int iM578f = 1 << AbstractC0236x.m578f(i10, i11);
        if (m549s(iM578f)) {
            int iM545o = m545o(iM578f);
            if (!AbstractC1061t.m3842c(obj, m552v(iM545o))) {
                return m554x(iM545o, iM578f, i10, obj, obj2, i11).m532b();
            }
            if (m531Y(iM545o) == obj2) {
                return null;
            }
            return m530X(iM545o, obj2).m533c();
        }
        if (!m550t(iM578f)) {
            return m551u(iM578f, obj, obj2).m532b();
        }
        int iM523P = m523P(iM578f);
        C0232t c0232tM522O = m522O(iM523P);
        if (i11 == 30) {
            bVarM524Q = c0232tM522O.m539i(obj, obj2);
            if (bVarM524Q == null) {
                return null;
            }
        } else {
            bVarM524Q = c0232tM522O.m524Q(i10, obj, obj2, i11 + 5);
            if (bVarM524Q == null) {
                return null;
            }
        }
        bVarM524Q.m560c(m506W(this, iM523P, iM578f, bVarM524Q.m558a(), null, 8, null));
        return bVarM524Q;
    }

    /* JADX INFO: renamed from: R */
    public final C0232t m525R(int i10, Object obj, int i11) {
        int iM578f = 1 << AbstractC0236x.m578f(i10, i11);
        if (m549s(iM578f)) {
            int iM545o = m545o(iM578f);
            if (AbstractC1061t.m3842c(obj, m552v(iM545o))) {
                return m526S(iM545o, iM578f);
            }
        } else if (m550t(iM578f)) {
            int iM523P = m523P(iM578f);
            C0232t c0232tM522O = m522O(iM523P);
            return m528U(c0232tM522O, i11 == 30 ? c0232tM522O.m540j(obj) : c0232tM522O.m525R(i10, obj, i11 + 5), iM523P, iM578f);
        }
        return this;
    }

    /* JADX INFO: renamed from: S */
    public final C0232t m526S(int i10, int i11) {
        Object[] objArr = this.f585d;
        if (objArr.length == 2) {
            return null;
        }
        return new C0232t(i11 ^ this.f582a, this.f583b, AbstractC0236x.m580h(objArr, i10));
    }

    /* JADX INFO: renamed from: T */
    public final C0232t m527T(int i10, int i11) {
        Object[] objArr = this.f585d;
        if (objArr.length == 1) {
            return null;
        }
        return new C0232t(this.f582a, i11 ^ this.f583b, AbstractC0236x.m581i(objArr, i10));
    }

    /* JADX INFO: renamed from: U */
    public final C0232t m528U(C0232t c0232t, C0232t c0232t2, int i10, int i11) {
        return c0232t2 == null ? m527T(i10, i11) : c0232t != c0232t2 ? m506W(this, i10, i11, c0232t2, null, 8, null) : this;
    }

    /* JADX INFO: renamed from: V */
    public final C0232t m529V(int i10, int i11, C0232t c0232t, C1948f c1948f) {
        Object[] objArr = c0232t.f585d;
        if (objArr.length == 2 && c0232t.f583b == 0) {
            if (this.f585d.length == 1) {
                c0232t.f582a = this.f583b;
                return c0232t;
            }
            return new C0232t(this.f582a ^ i11, i11 ^ this.f583b, AbstractC0236x.m583k(this.f585d, i10, m545o(i11), objArr[0], objArr[1]), c1948f);
        }
        if (c1948f != null && this.f584c == c1948f) {
            this.f585d[i10] = c0232t;
            return this;
        }
        Object[] objArr2 = this.f585d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        objArrCopyOf[i10] = c0232t;
        return new C0232t(this.f582a, this.f583b, objArrCopyOf, c1948f);
    }

    /* JADX INFO: renamed from: X */
    public final C0232t m530X(int i10, Object obj) {
        Object[] objArr = this.f585d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i10 + 1] = obj;
        return new C0232t(this.f582a, this.f583b, objArrCopyOf);
    }

    /* JADX INFO: renamed from: Y */
    public final Object m531Y(int i10) {
        return this.f585d[i10 + 1];
    }

    /* JADX INFO: renamed from: b */
    public final b m532b() {
        return new b(this, 1);
    }

    /* JADX INFO: renamed from: c */
    public final b m533c() {
        return new b(this, 0);
    }

    /* JADX INFO: renamed from: d */
    public final Object[] m534d(int i10, int i11, int i12, Object obj, Object obj2, int i13, C1948f c1948f) {
        Object objM552v = m552v(i10);
        return AbstractC0236x.m582j(this.f585d, i10, m523P(i11) + 1, m553w(objM552v != null ? objM552v.hashCode() : 0, objM552v, m531Y(i10), i12, obj, obj2, i13 + 5, c1948f));
    }

    /* JADX INFO: renamed from: e */
    public final int m535e() {
        if (this.f583b == 0) {
            return this.f585d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f582a);
        int length = this.f585d.length;
        for (int i10 = iBitCount * 2; i10 < length; i10++) {
            iBitCount += m522O(i10).m535e();
        }
        return iBitCount;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m536f(Object obj) {
        return m538h(obj) != -1;
    }

    /* JADX INFO: renamed from: g */
    public final Object m537g(Object obj) {
        int iM538h = m538h(obj);
        if (iM538h != -1) {
            return m531Y(iM538h);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final int m538h(Object obj) {
        C2361h c2361hM8591r = AbstractC2368o.m8591r(AbstractC2368o.m8592s(0, this.f585d.length), 2);
        int iM8560o = c2361hM8591r.m8560o();
        int iM8561p = c2361hM8591r.m8561p();
        int iM8562q = c2361hM8591r.m8562q();
        if ((iM8562q <= 0 || iM8560o > iM8561p) && (iM8562q >= 0 || iM8561p > iM8560o)) {
            return -1;
        }
        while (!AbstractC1061t.m3842c(obj, m552v(iM8560o))) {
            if (iM8560o == iM8561p) {
                return -1;
            }
            iM8560o += iM8562q;
        }
        return iM8560o;
    }

    /* JADX INFO: renamed from: i */
    public final b m539i(Object obj, Object obj2) {
        int iM538h = m538h(obj);
        if (iM538h == -1) {
            return new C0232t(0, 0, AbstractC0236x.m579g(this.f585d, 0, obj, obj2)).m532b();
        }
        if (obj2 == m531Y(iM538h)) {
            return null;
        }
        Object[] objArr = this.f585d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[iM538h + 1] = obj2;
        return new C0232t(0, 0, objArrCopyOf).m533c();
    }

    /* JADX INFO: renamed from: j */
    public final C0232t m540j(Object obj) {
        int iM538h = m538h(obj);
        return iM538h != -1 ? m541k(iM538h) : this;
    }

    /* JADX INFO: renamed from: k */
    public final C0232t m541k(int i10) {
        Object[] objArr = this.f585d;
        if (objArr.length == 2) {
            return null;
        }
        return new C0232t(0, 0, AbstractC0236x.m580h(objArr, i10));
    }

    /* JADX INFO: renamed from: l */
    public final boolean m542l(int i10, Object obj, int i11) {
        int iM578f = 1 << AbstractC0236x.m578f(i10, i11);
        if (m549s(iM578f)) {
            return AbstractC1061t.m3842c(obj, m552v(m545o(iM578f)));
        }
        if (!m550t(iM578f)) {
            return false;
        }
        C0232t c0232tM522O = m522O(m523P(iM578f));
        return i11 == 30 ? c0232tM522O.m536f(obj) : c0232tM522O.m542l(i10, obj, i11 + 5);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m543m(C0232t c0232t) {
        if (this == c0232t) {
            return true;
        }
        if (this.f583b != c0232t.f583b || this.f582a != c0232t.f582a) {
            return false;
        }
        int length = this.f585d.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.f585d[i10] != c0232t.f585d[i10]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final int m544n() {
        return Integer.bitCount(this.f582a);
    }

    /* JADX INFO: renamed from: o */
    public final int m545o(int i10) {
        return Integer.bitCount((i10 - 1) & this.f582a) * 2;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m546p(C0232t c0232t, InterfaceC0188p interfaceC0188p) {
        int i10;
        c0232t.getClass();
        interfaceC0188p.getClass();
        if (this == c0232t) {
            return true;
        }
        int i11 = this.f582a;
        if (i11 != c0232t.f582a || (i10 = this.f583b) != c0232t.f583b) {
            return false;
        }
        if (i11 == 0 && i10 == 0) {
            Object[] objArr = this.f585d;
            if (objArr.length != c0232t.f585d.length) {
                return false;
            }
            Iterable iterableM8591r = AbstractC2368o.m8591r(AbstractC2368o.m8592s(0, objArr.length), 2);
            if ((iterableM8591r instanceof Collection) && ((Collection) iterableM8591r).isEmpty()) {
                return true;
            }
            Iterator it = iterableM8591r.iterator();
            while (it.hasNext()) {
                int iNextInt = ((AbstractC5101q0) it).nextInt();
                Object objM552v = c0232t.m552v(iNextInt);
                Object objM531Y = c0232t.m531Y(iNextInt);
                int iM538h = m538h(objM552v);
                if (!(iM538h != -1 ? ((Boolean) interfaceC0188p.invoke(m531Y(iM538h), objM531Y)).booleanValue() : false)) {
                    return false;
                }
            }
            return true;
        }
        int iBitCount = Integer.bitCount(i11) * 2;
        C2361h c2361hM8591r = AbstractC2368o.m8591r(AbstractC2368o.m8592s(0, iBitCount), 2);
        int iM8560o = c2361hM8591r.m8560o();
        int iM8561p = c2361hM8591r.m8561p();
        int iM8562q = c2361hM8591r.m8562q();
        if ((iM8562q > 0 && iM8560o <= iM8561p) || (iM8562q < 0 && iM8561p <= iM8560o)) {
            while (AbstractC1061t.m3842c(m552v(iM8560o), c0232t.m552v(iM8560o)) && ((Boolean) interfaceC0188p.invoke(m531Y(iM8560o), c0232t.m531Y(iM8560o))).booleanValue()) {
                if (iM8560o != iM8561p) {
                    iM8560o += iM8562q;
                }
            }
            return false;
        }
        int length = this.f585d.length;
        while (iBitCount < length) {
            if (!m522O(iBitCount).m546p(c0232t.m522O(iBitCount), interfaceC0188p)) {
                return false;
            }
            iBitCount++;
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final Object m547q(int i10, Object obj, int i11) {
        int iM578f = 1 << AbstractC0236x.m578f(i10, i11);
        if (m549s(iM578f)) {
            int iM545o = m545o(iM578f);
            if (AbstractC1061t.m3842c(obj, m552v(iM545o))) {
                return m531Y(iM545o);
            }
            return null;
        }
        if (!m550t(iM578f)) {
            return null;
        }
        C0232t c0232tM522O = m522O(m523P(iM578f));
        return i11 == 30 ? c0232tM522O.m537g(obj) : c0232tM522O.m547q(i10, obj, i11 + 5);
    }

    /* JADX INFO: renamed from: r */
    public final Object[] m548r() {
        return this.f585d;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m549s(int i10) {
        return (i10 & this.f582a) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m550t(int i10) {
        return (i10 & this.f583b) != 0;
    }

    /* JADX INFO: renamed from: u */
    public final C0232t m551u(int i10, Object obj, Object obj2) {
        return new C0232t(i10 | this.f582a, this.f583b, AbstractC0236x.m579g(this.f585d, m545o(i10), obj, obj2));
    }

    /* JADX INFO: renamed from: v */
    public final Object m552v(int i10) {
        return this.f585d[i10];
    }

    /* JADX INFO: renamed from: w */
    public final C0232t m553w(int i10, Object obj, Object obj2, int i11, Object obj3, Object obj4, int i12, C1948f c1948f) {
        if (i12 > 30) {
            return new C0232t(0, 0, new Object[]{obj, obj2, obj3, obj4}, c1948f);
        }
        int iM578f = AbstractC0236x.m578f(i10, i12);
        int iM578f2 = AbstractC0236x.m578f(i11, i12);
        if (iM578f != iM578f2) {
            return new C0232t((1 << iM578f) | (1 << iM578f2), 0, iM578f < iM578f2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, c1948f);
        }
        return new C0232t(0, 1 << iM578f, new Object[]{m553w(i10, obj, obj2, i11, obj3, obj4, i12 + 5, c1948f)}, c1948f);
    }

    /* JADX INFO: renamed from: x */
    public final C0232t m554x(int i10, int i11, int i12, Object obj, Object obj2, int i13) {
        return new C0232t(this.f582a ^ i11, this.f583b | i11, m534d(i10, i11, i12, obj, obj2, i13, null));
    }

    /* JADX INFO: renamed from: y */
    public final C0232t m555y(Object obj, Object obj2, C0218f c0218f) {
        int iM538h = m538h(obj);
        if (iM538h == -1) {
            c0218f.m490s(c0218f.size() + 1);
            return new C0232t(0, 0, AbstractC0236x.m579g(this.f585d, 0, obj, obj2), c0218f.m486o());
        }
        c0218f.m489r(m531Y(iM538h));
        if (this.f584c == c0218f.m486o()) {
            this.f585d[iM538h + 1] = obj2;
            return this;
        }
        c0218f.m487p(c0218f.m484m() + 1);
        Object[] objArr = this.f585d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[iM538h + 1] = obj2;
        return new C0232t(0, 0, objArrCopyOf, c0218f.m486o());
    }

    /* JADX INFO: renamed from: z */
    public final C0232t m556z(C0232t c0232t, C1944b c1944b, C1948f c1948f) {
        AbstractC1943a.m7049a(this.f583b == 0);
        AbstractC1943a.m7049a(this.f582a == 0);
        AbstractC1943a.m7049a(c0232t.f583b == 0);
        AbstractC1943a.m7049a(c0232t.f582a == 0);
        Object[] objArr = this.f585d;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + c0232t.f585d.length);
        int length = this.f585d.length;
        C2361h c2361hM8591r = AbstractC2368o.m8591r(AbstractC2368o.m8592s(0, c0232t.f585d.length), 2);
        int iM8560o = c2361hM8591r.m8560o();
        int iM8561p = c2361hM8591r.m8561p();
        int iM8562q = c2361hM8591r.m8562q();
        if ((iM8562q > 0 && iM8560o <= iM8561p) || (iM8562q < 0 && iM8561p <= iM8560o)) {
            while (true) {
                if (m536f(c0232t.f585d[iM8560o])) {
                    c1944b.m7052c(c1944b.m7050a() + 1);
                } else {
                    Object[] objArr2 = c0232t.f585d;
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
        return length == this.f585d.length ? this : length == c0232t.f585d.length ? c0232t : length == objArrCopyOf.length ? new C0232t(0, 0, objArrCopyOf, c1948f) : new C0232t(0, 0, Arrays.copyOf(objArrCopyOf, length), c1948f);
    }

    /* JADX INFO: renamed from: ac.t$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C0232t m557a() {
            return C0232t.f581f;
        }

        public a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0232t(int i10, int i11, Object[] objArr) {
        this(i10, i11, objArr, null);
        objArr.getClass();
    }
}
