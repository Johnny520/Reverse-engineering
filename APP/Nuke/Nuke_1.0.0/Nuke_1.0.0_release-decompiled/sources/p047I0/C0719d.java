package p047I0;

import java.text.BreakIterator;
import me.dartcv.nuke.BuildConfig;
import p092S0.C1257J;
import p117X2.AbstractC1665j;
import p147d1.EnumC1960j;

/* JADX INFO: renamed from: I0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0719d extends AbstractC0716c {

    /* JADX INFO: renamed from: h */
    public static C0719d f2269h;

    /* JADX INFO: renamed from: i */
    public static C0719d f2270i;

    /* JADX INFO: renamed from: j */
    public static C0719d f2271j;

    /* JADX INFO: renamed from: k */
    public static final EnumC1960j f2272k = EnumC1960j.f6637e;

    /* JADX INFO: renamed from: l */
    public static final EnumC1960j f2273l = EnumC1960j.f6636d;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f2274f;

    /* JADX INFO: renamed from: g */
    public Object f2275g;

    @Override // p047I0.AbstractC0716c
    /* JADX INFO: renamed from: a */
    public final int[] mo1217a(int i5) {
        int iM2363d;
        switch (this.f2274f) {
            case 0:
                int length = m1219c().length();
                if (length <= 0 || i5 >= length) {
                    return null;
                }
                if (i5 < 0) {
                    i5 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f2275g;
                    if (breakIterator == null) {
                        AbstractC1665j.m2991k("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i5)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f2275g;
                        if (breakIterator2 == null) {
                            AbstractC1665j.m2991k("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i5);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return m1218b(i5, iFollowing);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f2275g;
                    if (breakIterator3 == null) {
                        AbstractC1665j.m2991k("impl");
                        throw null;
                    }
                    i5 = breakIterator3.following(i5);
                } while (i5 != -1);
                return null;
            case BuildConfig.VERSION_CODE /* 1 */:
                if (m1219c().length() <= 0 || i5 >= m1219c().length()) {
                    return null;
                }
                if (i5 < 0) {
                    i5 = 0;
                }
                while (!m1224i(i5) && (!m1224i(i5) || (i5 != 0 && m1224i(i5 - 1)))) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f2275g;
                    if (breakIterator4 == null) {
                        AbstractC1665j.m2991k("impl");
                        throw null;
                    }
                    i5 = breakIterator4.following(i5);
                    if (i5 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f2275g;
                if (breakIterator5 == null) {
                    AbstractC1665j.m2991k("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator5.following(i5);
                if (iFollowing2 == -1 || !m1223h(iFollowing2)) {
                    return null;
                }
                return m1218b(i5, iFollowing2);
            default:
                if (m1219c().length() <= 0 || i5 >= m1219c().length()) {
                    return null;
                }
                EnumC1960j enumC1960j = f2272k;
                if (i5 < 0) {
                    C1257J c1257j = (C1257J) this.f2275g;
                    if (c1257j == null) {
                        AbstractC1665j.m2991k("layoutResult");
                        throw null;
                    }
                    iM2363d = c1257j.f4527b.m2363d(0);
                } else {
                    C1257J c1257j2 = (C1257J) this.f2275g;
                    if (c1257j2 == null) {
                        AbstractC1665j.m2991k("layoutResult");
                        throw null;
                    }
                    int iM2363d2 = c1257j2.f4527b.m2363d(i5);
                    iM2363d = m1221e(iM2363d2, enumC1960j) == i5 ? iM2363d2 : iM2363d2 + 1;
                }
                C1257J c1257j3 = (C1257J) this.f2275g;
                if (c1257j3 == null) {
                    AbstractC1665j.m2991k("layoutResult");
                    throw null;
                }
                if (iM2363d >= c1257j3.f4527b.f4590f) {
                    return null;
                }
                return m1218b(m1221e(iM2363d, enumC1960j), m1221e(iM2363d, f2273l) + 1);
        }
    }

    @Override // p047I0.AbstractC0716c
    /* JADX INFO: renamed from: d */
    public final int[] mo1220d(int i5) {
        int iM2363d;
        switch (this.f2274f) {
            case 0:
                int length = m1219c().length();
                if (length <= 0 || i5 <= 0) {
                    return null;
                }
                if (i5 > length) {
                    i5 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f2275g;
                    if (breakIterator == null) {
                        AbstractC1665j.m2991k("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i5)) {
                        BreakIterator breakIterator2 = (BreakIterator) this.f2275g;
                        if (breakIterator2 == null) {
                            AbstractC1665j.m2991k("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i5);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return m1218b(iPreceding, i5);
                    }
                    BreakIterator breakIterator3 = (BreakIterator) this.f2275g;
                    if (breakIterator3 == null) {
                        AbstractC1665j.m2991k("impl");
                        throw null;
                    }
                    i5 = breakIterator3.preceding(i5);
                } while (i5 != -1);
                return null;
            case BuildConfig.VERSION_CODE /* 1 */:
                int length2 = m1219c().length();
                if (length2 <= 0 || i5 <= 0) {
                    return null;
                }
                if (i5 > length2) {
                    i5 = length2;
                }
                while (i5 > 0 && !m1224i(i5 - 1) && !m1223h(i5)) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f2275g;
                    if (breakIterator4 == null) {
                        AbstractC1665j.m2991k("impl");
                        throw null;
                    }
                    i5 = breakIterator4.preceding(i5);
                    if (i5 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f2275g;
                if (breakIterator5 == null) {
                    AbstractC1665j.m2991k("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator5.preceding(i5);
                if (iPreceding2 == -1 || !m1224i(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !m1224i(iPreceding2 - 1)) {
                    return m1218b(iPreceding2, i5);
                }
                return null;
            default:
                if (m1219c().length() <= 0 || i5 <= 0) {
                    return null;
                }
                int length3 = m1219c().length();
                EnumC1960j enumC1960j = f2273l;
                if (i5 > length3) {
                    C1257J c1257j = (C1257J) this.f2275g;
                    if (c1257j == null) {
                        AbstractC1665j.m2991k("layoutResult");
                        throw null;
                    }
                    iM2363d = c1257j.f4527b.m2363d(m1219c().length());
                } else {
                    C1257J c1257j2 = (C1257J) this.f2275g;
                    if (c1257j2 == null) {
                        AbstractC1665j.m2991k("layoutResult");
                        throw null;
                    }
                    int iM2363d2 = c1257j2.f4527b.m2363d(i5);
                    iM2363d = m1221e(iM2363d2, enumC1960j) + 1 == i5 ? iM2363d2 : iM2363d2 - 1;
                }
                if (iM2363d < 0) {
                    return null;
                }
                return m1218b(m1221e(iM2363d, f2272k), m1221e(iM2363d, enumC1960j) + 1);
        }
    }

    /* JADX INFO: renamed from: e */
    public int m1221e(int i5, EnumC1960j enumC1960j) {
        C1257J c1257j = (C1257J) this.f2275g;
        if (c1257j == null) {
            AbstractC1665j.m2991k("layoutResult");
            throw null;
        }
        int iM2329f = c1257j.m2329f(i5);
        C1257J c1257j2 = (C1257J) this.f2275g;
        if (c1257j2 == null) {
            AbstractC1665j.m2991k("layoutResult");
            throw null;
        }
        if (enumC1960j != c1257j2.m2330g(iM2329f)) {
            C1257J c1257j3 = (C1257J) this.f2275g;
            if (c1257j3 != null) {
                return c1257j3.m2329f(i5);
            }
            AbstractC1665j.m2991k("layoutResult");
            throw null;
        }
        if (((C1257J) this.f2275g) != null) {
            return r6.f4527b.m2362c(i5, false) - 1;
        }
        AbstractC1665j.m2991k("layoutResult");
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public void m1222f(String str) {
        switch (this.f2274f) {
            case 0:
                this.f2265d = str;
                BreakIterator breakIterator = (BreakIterator) this.f2275g;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    AbstractC1665j.m2991k("impl");
                    throw null;
                }
            default:
                this.f2265d = str;
                BreakIterator breakIterator2 = (BreakIterator) this.f2275g;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    AbstractC1665j.m2991k("impl");
                    throw null;
                }
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m1223h(int i5) {
        if (i5 <= 0 || !m1224i(i5 - 1)) {
            return false;
        }
        return i5 == m1219c().length() || !m1224i(i5);
    }

    /* JADX INFO: renamed from: i */
    public boolean m1224i(int i5) {
        if (i5 < 0 || i5 >= m1219c().length()) {
            return false;
        }
        return Character.isLetterOrDigit(m1219c().codePointAt(i5));
    }
}
