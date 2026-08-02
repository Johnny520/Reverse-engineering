package p000;

import java.text.BreakIterator;

/* JADX INFO: renamed from: w3 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0833w3 extends AbstractC0796v3 {

    /* JADX INFO: renamed from: l */
    public static C0833w3 f12281l;

    /* JADX INFO: renamed from: m */
    public static C0833w3 f12282m;

    /* JADX INFO: renamed from: n */
    public static C0833w3 f12283n;

    /* JADX INFO: renamed from: o */
    public static final c92 f12284o = c92.f1252i;

    /* JADX INFO: renamed from: p */
    public static final c92 f12285p = c92.f1251h;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f12286j;

    /* JADX INFO: renamed from: k */
    public Object f12287k;

    @Override // p000.AbstractC0796v3
    /* JADX INFO: renamed from: a */
    public final int[] mo5611a(int i) {
        int iM2917d;
        switch (this.f12286j) {
            case 0:
                int length = m5613c().length();
                if (length <= 0 || i >= length) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f12287k;
                    if (breakIterator == null) {
                        t11.m5067S("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = (BreakIterator) this.f12287k;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            t11.m5067S("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return m5612b(i, iFollowing);
                    }
                    if (breakIterator2 == null) {
                        t11.m5067S("impl");
                        throw null;
                    }
                    i = breakIterator2.following(i);
                } while (i != -1);
                return null;
            case 1:
                if (m5613c().length() <= 0 || i >= m5613c().length()) {
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                while (!m5831n(i) && (!m5831n(i) || (i != 0 && m5831n(i - 1)))) {
                    BreakIterator breakIterator3 = (BreakIterator) this.f12287k;
                    if (breakIterator3 == null) {
                        t11.m5067S("impl");
                        throw null;
                    }
                    i = breakIterator3.following(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.f12287k;
                if (breakIterator4 == null) {
                    t11.m5067S("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator4.following(i);
                if (iFollowing2 == -1 || !m5830m(iFollowing2)) {
                    return null;
                }
                return m5612b(i, iFollowing2);
            default:
                if (m5613c().length() <= 0 || i >= m5613c().length()) {
                    return null;
                }
                y03 y03Var = (y03) this.f12287k;
                c92 c92Var = f12284o;
                if (i < 0) {
                    if (y03Var == null) {
                        t11.m5067S("layoutResult");
                        throw null;
                    }
                    iM2917d = y03Var.f13267b.m2917d(0);
                } else {
                    if (y03Var == null) {
                        t11.m5067S("layoutResult");
                        throw null;
                    }
                    int iM2917d2 = y03Var.f13267b.m2917d(i);
                    iM2917d = m5828k(iM2917d2, c92Var) == i ? iM2917d2 : iM2917d2 + 1;
                }
                y03 y03Var2 = (y03) this.f12287k;
                if (y03Var2 == null) {
                    t11.m5067S("layoutResult");
                    throw null;
                }
                if (iM2917d >= y03Var2.f13267b.f6151f) {
                    return null;
                }
                return m5612b(m5828k(iM2917d, c92Var), m5828k(iM2917d, f12285p) + 1);
        }
    }

    @Override // p000.AbstractC0796v3
    /* JADX INFO: renamed from: i */
    public final int[] mo5618i(int i) {
        int iM2917d;
        switch (this.f12286j) {
            case 0:
                int length = m5613c().length();
                if (length <= 0 || i <= 0) {
                    return null;
                }
                if (i > length) {
                    i = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f12287k;
                    if (breakIterator == null) {
                        t11.m5067S("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i);
                    BreakIterator breakIterator2 = (BreakIterator) this.f12287k;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            t11.m5067S("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return m5612b(iPreceding, i);
                    }
                    if (breakIterator2 == null) {
                        t11.m5067S("impl");
                        throw null;
                    }
                    i = breakIterator2.preceding(i);
                } while (i != -1);
                return null;
            case 1:
                int length2 = m5613c().length();
                if (length2 <= 0 || i <= 0) {
                    return null;
                }
                if (i > length2) {
                    i = length2;
                }
                while (i > 0 && !m5831n(i - 1) && !m5830m(i)) {
                    BreakIterator breakIterator3 = (BreakIterator) this.f12287k;
                    if (breakIterator3 == null) {
                        t11.m5067S("impl");
                        throw null;
                    }
                    i = breakIterator3.preceding(i);
                    if (i == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.f12287k;
                if (breakIterator4 == null) {
                    t11.m5067S("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator4.preceding(i);
                if (iPreceding2 == -1 || !m5831n(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !m5831n(iPreceding2 - 1)) {
                    return m5612b(iPreceding2, i);
                }
                return null;
            default:
                if (m5613c().length() <= 0 || i <= 0) {
                    return null;
                }
                int length3 = m5613c().length();
                y03 y03Var = (y03) this.f12287k;
                c92 c92Var = f12285p;
                if (i > length3) {
                    if (y03Var == null) {
                        t11.m5067S("layoutResult");
                        throw null;
                    }
                    iM2917d = y03Var.f13267b.m2917d(m5613c().length());
                } else {
                    if (y03Var == null) {
                        t11.m5067S("layoutResult");
                        throw null;
                    }
                    int iM2917d2 = y03Var.f13267b.m2917d(i);
                    iM2917d = m5828k(iM2917d2, c92Var) + 1 == i ? iM2917d2 : iM2917d2 - 1;
                }
                if (iM2917d < 0) {
                    return null;
                }
                return m5612b(m5828k(iM2917d, f12284o), m5828k(iM2917d, c92Var) + 1);
        }
    }

    /* JADX INFO: renamed from: k */
    public int m5828k(int i, c92 c92Var) {
        y03 y03Var = (y03) this.f12287k;
        if (y03Var == null) {
            t11.m5067S("layoutResult");
            throw null;
        }
        int iM6206f = y03Var.m6206f(i);
        y03 y03Var2 = (y03) this.f12287k;
        if (y03Var2 == null) {
            t11.m5067S("layoutResult");
            throw null;
        }
        c92 c92VarM6207g = y03Var2.m6207g(iM6206f);
        y03 y03Var3 = (y03) this.f12287k;
        if (c92Var != c92VarM6207g) {
            if (y03Var3 != null) {
                return y03Var3.m6206f(i);
            }
            t11.m5067S("layoutResult");
            throw null;
        }
        if (y03Var3 != null) {
            return y03Var3.f13267b.m2916c(i, false) - 1;
        }
        t11.m5067S("layoutResult");
        throw null;
    }

    /* JADX INFO: renamed from: l */
    public void m5829l(String str) {
        switch (this.f12286j) {
            case 0:
                this.f11660h = str;
                BreakIterator breakIterator = (BreakIterator) this.f12287k;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    t11.m5067S("impl");
                    throw null;
                }
            default:
                this.f11660h = str;
                BreakIterator breakIterator2 = (BreakIterator) this.f12287k;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    t11.m5067S("impl");
                    throw null;
                }
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m5830m(int i) {
        if (i <= 0 || !m5831n(i - 1)) {
            return false;
        }
        return i == m5613c().length() || !m5831n(i);
    }

    /* JADX INFO: renamed from: n */
    public boolean m5831n(int i) {
        if (i < 0 || i >= m5613c().length()) {
            return false;
        }
        return Character.isLetterOrDigit(m5613c().codePointAt(i));
    }
}
