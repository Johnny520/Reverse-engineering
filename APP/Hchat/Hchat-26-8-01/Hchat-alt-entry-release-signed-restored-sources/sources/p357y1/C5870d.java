package p357y1;

import gg.AbstractC1416l;
import p057e1.C0808c;
import p072f2.C1054q;
import p119i2.C1935k0;
import p280t2.EnumC4094j;

/* JADX INFO: renamed from: y1.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5870d extends AbstractC5862b {

    /* JADX INFO: renamed from: e */
    public static C5870d f23836e;

    /* JADX INFO: renamed from: f */
    public static final EnumC4094j f23837f = EnumC4094j.f13555h;

    /* JADX INFO: renamed from: g */
    public static final EnumC4094j f23838g = EnumC4094j.f13554g;

    /* JADX INFO: renamed from: c */
    public C1935k0 f23839c;

    /* JADX INFO: renamed from: d */
    public C1054q f23840d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p357y1.AbstractC5862b
    /* JADX INFO: renamed from: a */
    public final int[] mo10564a(int i9) {
        int iM4828e;
        if (m10566c().length() > 0 && i9 < m10566c().length()) {
            try {
                C1054q c1054q = this.f23840d;
                if (c1054q == null) {
                    AbstractC1416l.m3831g("node");
                    throw null;
                }
                C0808c c0808cM2656g = c1054q.m2656g();
                int iRound = Math.round(c0808cM2656g.f2419d - c0808cM2656g.f2417b);
                if (i9 <= 0) {
                    i9 = 0;
                }
                C1935k0 c1935k0 = this.f23839c;
                if (c1935k0 == null) {
                    AbstractC1416l.m3831g("layoutResult");
                    throw null;
                }
                int iM4827d = c1935k0.f6562b.m4827d(i9);
                C1935k0 c1935k02 = this.f23839c;
                if (c1935k02 == null) {
                    AbstractC1416l.m3831g("layoutResult");
                    throw null;
                }
                float fM4829f = c1935k02.f6562b.m4829f(iM4827d) + iRound;
                C1935k0 c1935k03 = this.f23839c;
                if (c1935k03 == null) {
                    AbstractC1416l.m3831g("layoutResult");
                    throw null;
                }
                float fM4829f2 = c1935k03.f6562b.m4829f(r0.f6588f - 1);
                C1935k0 c1935k04 = this.f23839c;
                if (fM4829f < fM4829f2) {
                    if (c1935k04 == null) {
                        AbstractC1416l.m3831g("layoutResult");
                        throw null;
                    }
                    iM4828e = c1935k04.f6562b.m4828e(fM4829f);
                } else {
                    if (c1935k04 == null) {
                        AbstractC1416l.m3831g("layoutResult");
                        throw null;
                    }
                    iM4828e = c1935k04.f6562b.f6588f;
                }
                return m10565b(i9, m10573e(iM4828e - 1, f23838g) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p357y1.AbstractC5862b
    /* JADX INFO: renamed from: d */
    public final int[] mo10567d(int i9) {
        int iM4828e;
        if (m10566c().length() > 0 && i9 > 0) {
            try {
                C1054q c1054q = this.f23840d;
                if (c1054q == null) {
                    AbstractC1416l.m3831g("node");
                    throw null;
                }
                C0808c c0808cM2656g = c1054q.m2656g();
                int iRound = Math.round(c0808cM2656g.f2419d - c0808cM2656g.f2417b);
                int length = m10566c().length();
                if (length <= i9) {
                    i9 = length;
                }
                C1935k0 c1935k0 = this.f23839c;
                if (c1935k0 == null) {
                    AbstractC1416l.m3831g("layoutResult");
                    throw null;
                }
                int iM4827d = c1935k0.f6562b.m4827d(i9);
                C1935k0 c1935k02 = this.f23839c;
                if (c1935k02 == null) {
                    AbstractC1416l.m3831g("layoutResult");
                    throw null;
                }
                float fM4829f = c1935k02.f6562b.m4829f(iM4827d) - iRound;
                if (fM4829f > 0.0f) {
                    C1935k0 c1935k03 = this.f23839c;
                    if (c1935k03 == null) {
                        AbstractC1416l.m3831g("layoutResult");
                        throw null;
                    }
                    iM4828e = c1935k03.f6562b.m4828e(fM4829f);
                } else {
                    iM4828e = 0;
                }
                if (i9 == m10566c().length() && iM4828e < iM4827d) {
                    iM4828e++;
                }
                return m10565b(m10573e(iM4828e, f23837f), i9);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final int m10573e(int i9, EnumC4094j enumC4094j) {
        C1935k0 c1935k0 = this.f23839c;
        if (c1935k0 == null) {
            AbstractC1416l.m3831g("layoutResult");
            throw null;
        }
        int iM4807g = c1935k0.m4807g(i9);
        C1935k0 c1935k02 = this.f23839c;
        if (c1935k02 == null) {
            AbstractC1416l.m3831g("layoutResult");
            throw null;
        }
        EnumC4094j enumC4094jM4808h = c1935k02.m4808h(iM4807g);
        C1935k0 c1935k03 = this.f23839c;
        if (enumC4094j != enumC4094jM4808h) {
            if (c1935k03 != null) {
                return c1935k03.m4807g(i9);
            }
            AbstractC1416l.m3831g("layoutResult");
            throw null;
        }
        if (c1935k03 != null) {
            return c1935k03.f6562b.m4826c(i9, false) - 1;
        }
        AbstractC1416l.m3831g("layoutResult");
        throw null;
    }
}
