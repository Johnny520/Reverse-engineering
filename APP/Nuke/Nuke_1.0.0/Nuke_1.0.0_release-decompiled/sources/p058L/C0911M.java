package p058L;

import java.text.BreakIterator;
import java.util.List;
import p000A.AbstractC0070k0;
import p000A.C0036S0;
import p000A.C0042V0;
import p061L2.AbstractC0972l;
import p092S0.AbstractC1251D;
import p092S0.C1257J;
import p092S0.C1259L;
import p092S0.C1269g;
import p092S0.C1277o;
import p112W2.InterfaceC1601c;
import p115X0.C1626a;
import p115X0.C1645t;
import p115X0.C1646u;
import p115X0.InterfaceC1632g;
import p117X2.AbstractC1665j;
import p147d1.EnumC1960j;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: L.M */
/* JADX INFO: loaded from: classes.dex */
public final class C0911M {

    /* JADX INFO: renamed from: a */
    public final C1269g f2829a;

    /* JADX INFO: renamed from: b */
    public final long f2830b;

    /* JADX INFO: renamed from: c */
    public final C1257J f2831c;

    /* JADX INFO: renamed from: d */
    public final C0042V0 f2832d;

    /* JADX INFO: renamed from: e */
    public final C0929c0 f2833e;

    /* JADX INFO: renamed from: f */
    public long f2834f;

    /* JADX INFO: renamed from: g */
    public final C1269g f2835g;

    /* JADX INFO: renamed from: h */
    public final C1646u f2836h;

    /* JADX INFO: renamed from: i */
    public final C0036S0 f2837i;

    public C0911M(C1646u c1646u, C0042V0 c0042v0, C0036S0 c0036s0, C0929c0 c0929c0) {
        C1269g c1269g = c1646u.f5650a;
        long j5 = c1646u.f5651b;
        C1257J c1257j = c0036s0 != null ? c0036s0.f161a : null;
        this.f2829a = c1269g;
        this.f2830b = j5;
        this.f2831c = c1257j;
        this.f2832d = c0042v0;
        this.f2833e = c0929c0;
        this.f2834f = j5;
        this.f2835g = c1269g;
        this.f2836h = c1646u;
        this.f2837i = c0036s0;
    }

    /* JADX INFO: renamed from: a */
    public final List m1907a(InterfaceC1601c interfaceC1601c) {
        if (!C1259L.m2335c(this.f2834f)) {
            return AbstractC0972l.m1987K(new InterfaceC1632g[]{new C1626a("", 0), new C1645t(C1259L.m2338f(this.f2834f), C1259L.m2338f(this.f2834f))});
        }
        InterfaceC1632g interfaceC1632g = (InterfaceC1632g) interfaceC1601c.mo1h(this);
        if (interfaceC1632g != null) {
            return AbstractC2352g.m4211y(interfaceC1632g);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m1908b() {
        C1257J c1257j = this.f2831c;
        if (c1257j == null) {
            return null;
        }
        C1277o c1277o = c1257j.f4527b;
        int iM2337e = C1259L.m2337e(this.f2834f);
        C0042V0 c0042v0 = this.f2832d;
        c0042v0.m57a(iM2337e);
        int iM2362c = c1277o.m2362c(c1277o.m2363d(iM2337e), true);
        c0042v0.m58b(iM2362c);
        return Integer.valueOf(iM2362c);
    }

    /* JADX INFO: renamed from: c */
    public final Integer m1909c() {
        C1257J c1257j = this.f2831c;
        if (c1257j == null) {
            return null;
        }
        int iM2338f = C1259L.m2338f(this.f2834f);
        C0042V0 c0042v0 = this.f2832d;
        c0042v0.m57a(iM2338f);
        int iM2329f = c1257j.m2329f(c1257j.f4527b.m2363d(iM2338f));
        c0042v0.m58b(iM2329f);
        return Integer.valueOf(iM2329f);
    }

    /* JADX INFO: renamed from: d */
    public final Integer m1910d() {
        int length;
        C1257J c1257j = this.f2831c;
        if (c1257j == null) {
            return null;
        }
        int iM1924r = m1924r();
        while (true) {
            C1269g c1269g = this.f2829a;
            if (iM1924r < c1269g.f4563e.length()) {
                int length2 = this.f2835g.f4563e.length() - 1;
                if (iM1924r <= length2) {
                    length2 = iM1924r;
                }
                long jM2332i = c1257j.m2332i(length2);
                int i5 = C1259L.f4537c;
                int i6 = (int) (jM2332i & 4294967295L);
                if (i6 > iM1924r) {
                    this.f2832d.m58b(i6);
                    length = i6;
                    break;
                }
                iM1924r++;
            } else {
                length = c1269g.f4563e.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    /* JADX INFO: renamed from: e */
    public final Integer m1911e() {
        int i5;
        C1257J c1257j = this.f2831c;
        if (c1257j == null) {
            return null;
        }
        int iM1924r = m1924r();
        while (true) {
            if (iM1924r <= 0) {
                i5 = 0;
                break;
            }
            int length = this.f2835g.f4563e.length() - 1;
            if (iM1924r <= length) {
                length = iM1924r;
            }
            long jM2332i = c1257j.m2332i(length);
            int i6 = C1259L.f4537c;
            int i7 = (int) (jM2332i >> 32);
            if (i7 < iM1924r) {
                this.f2832d.m58b(i7);
                i5 = i7;
                break;
            }
            iM1924r--;
        }
        return Integer.valueOf(i5);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1912f() {
        C1257J c1257j = this.f2831c;
        return (c1257j != null ? c1257j.m2330g(m1924r()) : null) != EnumC1960j.f6637e;
    }

    /* JADX INFO: renamed from: g */
    public final int m1913g(C1257J c1257j, int i5) {
        int iM1924r = m1924r();
        C0929c0 c0929c0 = this.f2833e;
        if (c0929c0.f2917a == null) {
            c0929c0.f2917a = Float.valueOf(c1257j.m2326c(iM1924r).f8558a);
        }
        C1277o c1277o = c1257j.f4527b;
        int iM2363d = c1277o.m2363d(iM1924r) + i5;
        if (iM2363d < 0) {
            return 0;
        }
        if (iM2363d >= c1277o.f4590f) {
            return this.f2835g.f4563e.length();
        }
        float fM2361b = c1277o.m2361b(iM2363d) - 1;
        Float f2 = c0929c0.f2917a;
        AbstractC1665j.m2982b(f2);
        float fFloatValue = f2.floatValue();
        if ((m1912f() && fFloatValue >= c1257j.m2328e(iM2363d)) || (!m1912f() && fFloatValue <= c1257j.m2327d(iM2363d))) {
            return c1277o.m2362c(iM2363d, true);
        }
        int iM2366g = c1277o.m2366g((((long) Float.floatToRawIntBits(fM2361b)) & 4294967295L) | (Float.floatToRawIntBits(f2.floatValue()) << 32));
        this.f2832d.m58b(iM2366g);
        return iM2366g;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m1914h(p000A.C0036S0 r9, int r10) {
        /*
            r8 = this;
            F0.v r0 = r9.f162b
            S0.J r1 = r9.f161a
            if (r0 == 0) goto L13
            F0.v r9 = r9.f163c
            if (r9 == 0) goto L10
            r2 = 1
            n0.c r9 = r9.mo634K(r0, r2)
            goto L11
        L10:
            r9 = 0
        L11:
            if (r9 != 0) goto L15
        L13:
            n0.c r9 = p204n0.C2684c.f8557e
        L15:
            X0.u r0 = r8.f2836h
            long r2 = r0.f5651b
            int r0 = p092S0.C1259L.f4537c
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r0 = (int) r2
            A.V0 r2 = r8.f2832d
            r2.m57a(r0)
            n0.c r0 = r1.m2326c(r0)
            float r3 = r0.f8558a
            float r0 = r0.f8559b
            long r6 = r9.m4652c()
            long r6 = r6 & r4
            int r9 = (int) r6
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r10 = (float) r10
            float r9 = r9 * r10
            float r9 = r9 + r0
            int r10 = java.lang.Float.floatToRawIntBits(r3)
            long r6 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r9 = (long) r9
            r0 = 32
            long r6 = r6 << r0
            long r9 = r9 & r4
            long r9 = r9 | r6
            S0.o r0 = r1.f4527b
            int r9 = r0.m2366g(r9)
            r2.m58b(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p058L.C0911M.m1914h(A.S0, int):int");
    }

    /* JADX INFO: renamed from: i */
    public final void m1915i() {
        C0929c0 c0929c0 = this.f2833e;
        c0929c0.f2917a = null;
        C1269g c1269g = this.f2835g;
        if (c1269g.f4563e.length() > 0) {
            if (m1912f()) {
                m1917k();
                return;
            }
            c0929c0.f2917a = null;
            if (c1269g.f4563e.length() > 0) {
                String str = c1269g.f4563e;
                long j5 = this.f2834f;
                int i5 = C1259L.f4537c;
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                characterInstance.setText(str);
                int iFollowing = characterInstance.following((int) (j5 & 4294967295L));
                if (iFollowing != -1) {
                    m1923q(iFollowing, iFollowing);
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m1916j() {
        this.f2833e.f2917a = null;
        C1269g c1269g = this.f2835g;
        String str = c1269g.f4563e;
        String str2 = c1269g.f4563e;
        if (str.length() > 0) {
            int iM86m = AbstractC0070k0.m86m(str2, C1259L.m2337e(this.f2834f));
            if (iM86m == C1259L.m2337e(this.f2834f) && iM86m != str2.length()) {
                iM86m = AbstractC0070k0.m86m(str2, iM86m + 1);
            }
            m1923q(iM86m, iM86m);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m1917k() {
        this.f2833e.f2917a = null;
        C1269g c1269g = this.f2835g;
        if (c1269g.f4563e.length() > 0) {
            String str = c1269g.f4563e;
            long j5 = this.f2834f;
            int i5 = C1259L.f4537c;
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(str);
            int iPreceding = characterInstance.preceding((int) (j5 & 4294967295L));
            if (iPreceding != -1) {
                m1923q(iPreceding, iPreceding);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1918l() {
        this.f2833e.f2917a = null;
        C1269g c1269g = this.f2835g;
        String str = c1269g.f4563e;
        String str2 = c1269g.f4563e;
        if (str.length() > 0) {
            int iM87n = AbstractC0070k0.m87n(str2, C1259L.m2338f(this.f2834f));
            if (iM87n == C1259L.m2338f(this.f2834f) && iM87n != 0) {
                iM87n = AbstractC0070k0.m87n(str2, iM87n - 1);
            }
            m1923q(iM87n, iM87n);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m1919m() {
        C0929c0 c0929c0 = this.f2833e;
        c0929c0.f2917a = null;
        C1269g c1269g = this.f2835g;
        if (c1269g.f4563e.length() > 0) {
            if (!m1912f()) {
                m1917k();
                return;
            }
            c0929c0.f2917a = null;
            if (c1269g.f4563e.length() > 0) {
                String str = c1269g.f4563e;
                long j5 = this.f2834f;
                int i5 = C1259L.f4537c;
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                characterInstance.setText(str);
                int iFollowing = characterInstance.following((int) (j5 & 4294967295L));
                if (iFollowing != -1) {
                    m1923q(iFollowing, iFollowing);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m1920n() {
        Integer numM1908b;
        this.f2833e.f2917a = null;
        if (this.f2835g.f4563e.length() <= 0 || (numM1908b = m1908b()) == null) {
            return;
        }
        int iIntValue = numM1908b.intValue();
        m1923q(iIntValue, iIntValue);
    }

    /* JADX INFO: renamed from: o */
    public final void m1921o() {
        Integer numM1909c;
        this.f2833e.f2917a = null;
        if (this.f2835g.f4563e.length() <= 0 || (numM1909c = m1909c()) == null) {
            return;
        }
        int iIntValue = numM1909c.intValue();
        m1923q(iIntValue, iIntValue);
    }

    /* JADX INFO: renamed from: p */
    public final void m1922p() {
        if (this.f2835g.f4563e.length() > 0) {
            int i5 = C1259L.f4537c;
            this.f2834f = AbstractC1251D.m2313b((int) (this.f2830b >> 32), (int) (this.f2834f & 4294967295L));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m1923q(int i5, int i6) {
        this.f2834f = AbstractC1251D.m2313b(i5, i6);
    }

    /* JADX INFO: renamed from: r */
    public final int m1924r() {
        long j5 = this.f2834f;
        int i5 = C1259L.f4537c;
        int i6 = (int) (j5 & 4294967295L);
        this.f2832d.m57a(i6);
        return i6;
    }
}
