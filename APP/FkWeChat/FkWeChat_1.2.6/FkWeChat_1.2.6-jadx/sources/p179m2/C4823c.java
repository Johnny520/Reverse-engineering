package p179m2;

import java.text.BreakIterator;
import java.util.Locale;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: m2.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C4823c extends AbstractC4818b {

    /* JADX INFO: renamed from: d */
    public static final a f14351d = new a(null);

    /* JADX INFO: renamed from: e */
    public static final int f14352e = 8;

    /* JADX INFO: renamed from: f */
    public static C4823c f14353f;

    /* JADX INFO: renamed from: c */
    public BreakIterator f14354c;

    public C4823c(Locale locale) {
        m19304i(locale);
    }

    @Override // p179m2.InterfaceC4843g
    /* JADX INFO: renamed from: a */
    public int[] mo19302a(int i10) {
        int length = m19291d().length();
        if (length <= 0 || i10 >= length) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        do {
            BreakIterator breakIterator = this.f14354c;
            if (breakIterator == null) {
                AbstractC1061t.m3851l("impl");
                breakIterator = null;
            }
            boolean zIsBoundary = breakIterator.isBoundary(i10);
            BreakIterator breakIterator2 = this.f14354c;
            if (zIsBoundary) {
                if (breakIterator2 == null) {
                    AbstractC1061t.m3851l("impl");
                    breakIterator2 = null;
                }
                int iFollowing = breakIterator2.following(i10);
                if (iFollowing == -1) {
                    return null;
                }
                return m19290c(i10, iFollowing);
            }
            if (breakIterator2 == null) {
                AbstractC1061t.m3851l("impl");
                breakIterator2 = null;
            }
            i10 = breakIterator2.following(i10);
        } while (i10 != -1);
        return null;
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
        do {
            BreakIterator breakIterator = this.f14354c;
            if (breakIterator == null) {
                AbstractC1061t.m3851l("impl");
                breakIterator = null;
            }
            boolean zIsBoundary = breakIterator.isBoundary(i10);
            BreakIterator breakIterator2 = this.f14354c;
            if (zIsBoundary) {
                if (breakIterator2 == null) {
                    AbstractC1061t.m3851l("impl");
                    breakIterator2 = null;
                }
                int iPreceding = breakIterator2.preceding(i10);
                if (iPreceding == -1) {
                    return null;
                }
                return m19290c(iPreceding, i10);
            }
            if (breakIterator2 == null) {
                AbstractC1061t.m3851l("impl");
                breakIterator2 = null;
            }
            i10 = breakIterator2.preceding(i10);
        } while (i10 != -1);
        return null;
    }

    @Override // p179m2.AbstractC4818b
    /* JADX INFO: renamed from: e */
    public void mo19292e(String str) {
        super.mo19292e(str);
        BreakIterator breakIterator = this.f14354c;
        if (breakIterator == null) {
            AbstractC1061t.m3851l("impl");
            breakIterator = null;
        }
        breakIterator.setText(str);
    }

    /* JADX INFO: renamed from: i */
    public final void m19304i(Locale locale) {
        this.f14354c = BreakIterator.getCharacterInstance(locale);
    }

    /* JADX INFO: renamed from: m2.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C4823c m19305a(Locale locale) {
            if (C4823c.f14353f == null) {
                C4823c.f14353f = new C4823c(locale, null);
            }
            C4823c c4823c = C4823c.f14353f;
            c4823c.getClass();
            return c4823c;
        }

        public a() {
        }
    }

    public /* synthetic */ C4823c(Locale locale, AbstractC1043k abstractC1043k) {
        this(locale);
    }
}
