package p179m2;

import java.text.BreakIterator;
import java.util.Locale;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: m2.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4848h extends AbstractC4818b {

    /* JADX INFO: renamed from: d */
    public static final a f14414d = new a(null);

    /* JADX INFO: renamed from: e */
    public static final int f14415e = 8;

    /* JADX INFO: renamed from: f */
    public static C4848h f14416f;

    /* JADX INFO: renamed from: c */
    public BreakIterator f14417c;

    public C4848h(Locale locale) {
        m19358l(locale);
    }

    /* JADX INFO: renamed from: i */
    private final boolean m19356i(int i10) {
        if (i10 <= 0 || !m19359j(i10 - 1)) {
            return false;
        }
        return i10 == m19291d().length() || !m19359j(i10);
    }

    /* JADX INFO: renamed from: k */
    private final boolean m19357k(int i10) {
        if (m19359j(i10)) {
            return i10 == 0 || !m19359j(i10 - 1);
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    private final void m19358l(Locale locale) {
        this.f14417c = BreakIterator.getWordInstance(locale);
    }

    @Override // p179m2.InterfaceC4843g
    /* JADX INFO: renamed from: a */
    public int[] mo19302a(int i10) {
        if (m19291d().length() <= 0 || i10 >= m19291d().length()) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (!m19359j(i10) && !m19357k(i10)) {
            BreakIterator breakIterator = this.f14417c;
            if (breakIterator == null) {
                AbstractC1061t.m3851l("impl");
                breakIterator = null;
            }
            i10 = breakIterator.following(i10);
            if (i10 == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f14417c;
        if (breakIterator2 == null) {
            AbstractC1061t.m3851l("impl");
            breakIterator2 = null;
        }
        int iFollowing = breakIterator2.following(i10);
        if (iFollowing == -1 || !m19356i(iFollowing)) {
            return null;
        }
        return m19290c(i10, iFollowing);
    }

    @Override // p179m2.InterfaceC4843g
    /* JADX INFO: renamed from: b */
    public int[] mo19303b(int i10) {
        int length = m19291d().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        while (i10 > 0 && !m19359j(i10 - 1) && !m19356i(i10)) {
            BreakIterator breakIterator = this.f14417c;
            if (breakIterator == null) {
                AbstractC1061t.m3851l("impl");
                breakIterator = null;
            }
            i10 = breakIterator.preceding(i10);
            if (i10 == -1) {
                return null;
            }
        }
        BreakIterator breakIterator2 = this.f14417c;
        if (breakIterator2 == null) {
            AbstractC1061t.m3851l("impl");
            breakIterator2 = null;
        }
        int iPreceding = breakIterator2.preceding(i10);
        if (iPreceding == -1 || !m19357k(iPreceding)) {
            return null;
        }
        return m19290c(iPreceding, i10);
    }

    @Override // p179m2.AbstractC4818b
    /* JADX INFO: renamed from: e */
    public void mo19292e(String str) {
        super.mo19292e(str);
        BreakIterator breakIterator = this.f14417c;
        if (breakIterator == null) {
            AbstractC1061t.m3851l("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m19359j(int i10) {
        if (i10 < 0 || i10 >= m19291d().length()) {
            return false;
        }
        return Character.isLetterOrDigit(m19291d().codePointAt(i10));
    }

    /* JADX INFO: renamed from: m2.h$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C4848h m19360a(Locale locale) {
            if (C4848h.f14416f == null) {
                C4848h.f14416f = new C4848h(locale, null);
            }
            C4848h c4848h = C4848h.f14416f;
            c4848h.getClass();
            return c4848h;
        }

        public a() {
        }
    }

    public /* synthetic */ C4848h(Locale locale, AbstractC1043k abstractC1043k) {
        this(locale);
    }
}
