package p357y1;

import gg.AbstractC1416l;
import java.text.BreakIterator;
import p119i2.C1935k0;
import p280t2.EnumC4094j;

/* JADX INFO: renamed from: y1.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5866c extends AbstractC5862b {

    /* JADX INFO: renamed from: e */
    public static C5866c f23824e;

    /* JADX INFO: renamed from: f */
    public static C5866c f23825f;

    /* JADX INFO: renamed from: g */
    public static C5866c f23826g;

    /* JADX INFO: renamed from: h */
    public static final EnumC4094j f23827h = EnumC4094j.f13555h;

    /* JADX INFO: renamed from: i */
    public static final EnumC4094j f23828i = EnumC4094j.f13554g;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f23829c;

    /* JADX INFO: renamed from: d */
    public Object f23830d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p357y1.AbstractC5862b
    /* JADX INFO: renamed from: a */
    public final int[] mo10564a(int i9) {
        int iM4827d;
        switch (this.f23829c) {
            case 0:
                int length = m10566c().length();
                if (length <= 0 || i9 >= length) {
                    return null;
                }
                if (i9 < 0) {
                    i9 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f23830d;
                    if (breakIterator == null) {
                        AbstractC1416l.m3831g("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i9);
                    BreakIterator breakIterator2 = (BreakIterator) this.f23830d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            AbstractC1416l.m3831g("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i9);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return m10565b(i9, iFollowing);
                    }
                    if (breakIterator2 == null) {
                        AbstractC1416l.m3831g("impl");
                        throw null;
                    }
                    i9 = breakIterator2.following(i9);
                } while (i9 != -1);
                return null;
            case 1:
                if (m10566c().length() <= 0 || i9 >= m10566c().length()) {
                    return null;
                }
                if (i9 < 0) {
                    i9 = 0;
                }
                while (!m10572h(i9) && (!m10572h(i9) || (i9 != 0 && m10572h(i9 - 1)))) {
                    BreakIterator breakIterator3 = (BreakIterator) this.f23830d;
                    if (breakIterator3 == null) {
                        AbstractC1416l.m3831g("impl");
                        throw null;
                    }
                    i9 = breakIterator3.following(i9);
                    if (i9 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.f23830d;
                if (breakIterator4 == null) {
                    AbstractC1416l.m3831g("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator4.following(i9);
                if (iFollowing2 == -1 || !m10571g(iFollowing2)) {
                    return null;
                }
                return m10565b(i9, iFollowing2);
            default:
                if (m10566c().length() <= 0 || i9 >= m10566c().length()) {
                    return null;
                }
                C1935k0 c1935k0 = (C1935k0) this.f23830d;
                EnumC4094j enumC4094j = f23827h;
                if (i9 < 0) {
                    if (c1935k0 == null) {
                        AbstractC1416l.m3831g("layoutResult");
                        throw null;
                    }
                    iM4827d = c1935k0.f6562b.m4827d(0);
                } else {
                    if (c1935k0 == null) {
                        AbstractC1416l.m3831g("layoutResult");
                        throw null;
                    }
                    int iM4827d2 = c1935k0.f6562b.m4827d(i9);
                    iM4827d = m10569e(iM4827d2, enumC4094j) == i9 ? iM4827d2 : iM4827d2 + 1;
                }
                C1935k0 c1935k02 = (C1935k0) this.f23830d;
                if (c1935k02 == null) {
                    AbstractC1416l.m3831g("layoutResult");
                    throw null;
                }
                if (iM4827d >= c1935k02.f6562b.f6588f) {
                    return null;
                }
                return m10565b(m10569e(iM4827d, enumC4094j), m10569e(iM4827d, f23828i) + 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p357y1.AbstractC5862b
    /* JADX INFO: renamed from: d */
    public final int[] mo10567d(int i9) {
        int iM4827d;
        switch (this.f23829c) {
            case 0:
                int length = m10566c().length();
                if (length <= 0 || i9 <= 0) {
                    return null;
                }
                if (i9 > length) {
                    i9 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f23830d;
                    if (breakIterator == null) {
                        AbstractC1416l.m3831g("impl");
                        throw null;
                    }
                    boolean zIsBoundary = breakIterator.isBoundary(i9);
                    BreakIterator breakIterator2 = (BreakIterator) this.f23830d;
                    if (zIsBoundary) {
                        if (breakIterator2 == null) {
                            AbstractC1416l.m3831g("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i9);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return m10565b(iPreceding, i9);
                    }
                    if (breakIterator2 == null) {
                        AbstractC1416l.m3831g("impl");
                        throw null;
                    }
                    i9 = breakIterator2.preceding(i9);
                } while (i9 != -1);
                return null;
            case 1:
                int length2 = m10566c().length();
                if (length2 <= 0 || i9 <= 0) {
                    return null;
                }
                if (i9 > length2) {
                    i9 = length2;
                }
                while (i9 > 0 && !m10572h(i9 - 1) && !m10571g(i9)) {
                    BreakIterator breakIterator3 = (BreakIterator) this.f23830d;
                    if (breakIterator3 == null) {
                        AbstractC1416l.m3831g("impl");
                        throw null;
                    }
                    i9 = breakIterator3.preceding(i9);
                    if (i9 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.f23830d;
                if (breakIterator4 == null) {
                    AbstractC1416l.m3831g("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator4.preceding(i9);
                if (iPreceding2 == -1 || !m10572h(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !m10572h(iPreceding2 - 1)) {
                    return m10565b(iPreceding2, i9);
                }
                return null;
            default:
                if (m10566c().length() <= 0 || i9 <= 0) {
                    return null;
                }
                int length3 = m10566c().length();
                C1935k0 c1935k0 = (C1935k0) this.f23830d;
                EnumC4094j enumC4094j = f23828i;
                if (i9 > length3) {
                    if (c1935k0 == null) {
                        AbstractC1416l.m3831g("layoutResult");
                        throw null;
                    }
                    iM4827d = c1935k0.f6562b.m4827d(m10566c().length());
                } else {
                    if (c1935k0 == null) {
                        AbstractC1416l.m3831g("layoutResult");
                        throw null;
                    }
                    int iM4827d2 = c1935k0.f6562b.m4827d(i9);
                    iM4827d = m10569e(iM4827d2, enumC4094j) + 1 == i9 ? iM4827d2 : iM4827d2 - 1;
                }
                if (iM4827d < 0) {
                    return null;
                }
                return m10565b(m10569e(iM4827d, f23827h), m10569e(iM4827d, enumC4094j) + 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public int m10569e(int i9, EnumC4094j enumC4094j) {
        C1935k0 c1935k0 = (C1935k0) this.f23830d;
        if (c1935k0 == null) {
            AbstractC1416l.m3831g("layoutResult");
            throw null;
        }
        int iM4807g = c1935k0.m4807g(i9);
        C1935k0 c1935k02 = (C1935k0) this.f23830d;
        if (c1935k02 == null) {
            AbstractC1416l.m3831g("layoutResult");
            throw null;
        }
        EnumC4094j enumC4094jM4808h = c1935k02.m4808h(iM4807g);
        C1935k0 c1935k03 = (C1935k0) this.f23830d;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public void m10570f(String str) {
        switch (this.f23829c) {
            case 0:
                this.f23818a = str;
                BreakIterator breakIterator = (BreakIterator) this.f23830d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    AbstractC1416l.m3831g("impl");
                    throw null;
                }
            default:
                this.f23818a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.f23830d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    AbstractC1416l.m3831g("impl");
                    throw null;
                }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public boolean m10571g(int i9) {
        if (i9 <= 0 || !m10572h(i9 - 1)) {
            return false;
        }
        return i9 == m10566c().length() || !m10572h(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public boolean m10572h(int i9) {
        if (i9 < 0 || i9 >= m10566c().length()) {
            return false;
        }
        return Character.isLetterOrDigit(m10566c().codePointAt(i9));
    }
}
