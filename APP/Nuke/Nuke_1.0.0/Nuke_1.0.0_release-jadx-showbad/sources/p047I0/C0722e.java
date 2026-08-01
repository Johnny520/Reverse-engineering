package p047I0;

import p077P0.C1128o;
import p092S0.C1257J;
import p117X2.AbstractC1665j;
import p147d1.EnumC1960j;
import p204n0.C2684c;

/* JADX INFO: renamed from: I0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0722e extends AbstractC0716c {

    /* JADX INFO: renamed from: h */
    public static C0722e f2280h;

    /* JADX INFO: renamed from: i */
    public static final EnumC1960j f2281i = EnumC1960j.f6637e;

    /* JADX INFO: renamed from: j */
    public static final EnumC1960j f2282j = EnumC1960j.f6636d;

    /* JADX INFO: renamed from: f */
    public C1257J f2283f;

    /* JADX INFO: renamed from: g */
    public C1128o f2284g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p047I0.AbstractC0716c
    /* JADX INFO: renamed from: a */
    public final int[] mo1217a(int i5) {
        int iM2364e;
        if (m1219c().length() <= 0 || i5 >= m1219c().length()) {
            return null;
        }
        try {
            C1128o c1128o = this.f2284g;
            if (c1128o == null) {
                AbstractC1665j.m2991k("node");
                throw null;
            }
            C2684c c2684cM2170g = c1128o.m2170g();
            int iRound = Math.round(c2684cM2170g.f8561d - c2684cM2170g.f8559b);
            if (i5 <= 0) {
                i5 = 0;
            }
            C1257J c1257j = this.f2283f;
            if (c1257j == null) {
                AbstractC1665j.m2991k("layoutResult");
                throw null;
            }
            int iM2363d = c1257j.f4527b.m2363d(i5);
            C1257J c1257j2 = this.f2283f;
            if (c1257j2 == null) {
                AbstractC1665j.m2991k("layoutResult");
                throw null;
            }
            float fM2365f = c1257j2.f4527b.m2365f(iM2363d) + iRound;
            C1257J c1257j3 = this.f2283f;
            if (c1257j3 == null) {
                AbstractC1665j.m2991k("layoutResult");
                throw null;
            }
            if (c1257j3 == null) {
                AbstractC1665j.m2991k("layoutResult");
                throw null;
            }
            if (fM2365f < c1257j3.f4527b.m2365f(r0.f4590f - 1)) {
                C1257J c1257j4 = this.f2283f;
                if (c1257j4 == null) {
                    AbstractC1665j.m2991k("layoutResult");
                    throw null;
                }
                iM2364e = c1257j4.f4527b.m2364e(fM2365f);
            } else {
                C1257J c1257j5 = this.f2283f;
                if (c1257j5 == null) {
                    AbstractC1665j.m2991k("layoutResult");
                    throw null;
                }
                iM2364e = c1257j5.f4527b.f4590f;
            }
            return m1218b(i5, m1225e(iM2364e - 1, f2282j) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p047I0.AbstractC0716c
    /* JADX INFO: renamed from: d */
    public final int[] mo1220d(int i5) {
        int iM2364e;
        if (m1219c().length() <= 0 || i5 <= 0) {
            return null;
        }
        try {
            C1128o c1128o = this.f2284g;
            if (c1128o == null) {
                AbstractC1665j.m2991k("node");
                throw null;
            }
            C2684c c2684cM2170g = c1128o.m2170g();
            int iRound = Math.round(c2684cM2170g.f8561d - c2684cM2170g.f8559b);
            int length = m1219c().length();
            if (length <= i5) {
                i5 = length;
            }
            C1257J c1257j = this.f2283f;
            if (c1257j == null) {
                AbstractC1665j.m2991k("layoutResult");
                throw null;
            }
            int iM2363d = c1257j.f4527b.m2363d(i5);
            C1257J c1257j2 = this.f2283f;
            if (c1257j2 == null) {
                AbstractC1665j.m2991k("layoutResult");
                throw null;
            }
            float fM2365f = c1257j2.f4527b.m2365f(iM2363d) - iRound;
            if (fM2365f > 0.0f) {
                C1257J c1257j3 = this.f2283f;
                if (c1257j3 == null) {
                    AbstractC1665j.m2991k("layoutResult");
                    throw null;
                }
                iM2364e = c1257j3.f4527b.m2364e(fM2365f);
            } else {
                iM2364e = 0;
            }
            if (i5 == m1219c().length() && iM2364e < iM2363d) {
                iM2364e++;
            }
            return m1218b(m1225e(iM2364e, f2281i), i5);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final int m1225e(int i5, EnumC1960j enumC1960j) {
        C1257J c1257j = this.f2283f;
        if (c1257j == null) {
            AbstractC1665j.m2991k("layoutResult");
            throw null;
        }
        int iM2329f = c1257j.m2329f(i5);
        C1257J c1257j2 = this.f2283f;
        if (c1257j2 == null) {
            AbstractC1665j.m2991k("layoutResult");
            throw null;
        }
        if (enumC1960j != c1257j2.m2330g(iM2329f)) {
            C1257J c1257j3 = this.f2283f;
            if (c1257j3 != null) {
                return c1257j3.m2329f(i5);
            }
            AbstractC1665j.m2991k("layoutResult");
            throw null;
        }
        if (this.f2283f != null) {
            return r6.f4527b.m2362c(i5, false) - 1;
        }
        AbstractC1665j.m2991k("layoutResult");
        throw null;
    }
}
