package p179m2;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p104h3.EnumC2856i;
import p319w2.C9122q3;

/* JADX INFO: renamed from: m2.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4828d extends AbstractC4818b {

    /* JADX INFO: renamed from: f */
    public static C4828d f14360f;

    /* JADX INFO: renamed from: c */
    public C9122q3 f14363c;

    /* JADX INFO: renamed from: d */
    public static final a f14358d = new a(null);

    /* JADX INFO: renamed from: e */
    public static final int f14359e = 8;

    /* JADX INFO: renamed from: g */
    public static final EnumC2856i f14361g = EnumC2856i.f7468r;

    /* JADX INFO: renamed from: h */
    public static final EnumC2856i f14362h = EnumC2856i.f7467q;

    public /* synthetic */ C4828d(AbstractC1043k abstractC1043k) {
        this();
    }

    @Override // p179m2.InterfaceC4843g
    /* JADX INFO: renamed from: a */
    public int[] mo19302a(int i10) {
        int iM35397q;
        if (m19291d().length() <= 0 || i10 >= m19291d().length()) {
            return null;
        }
        C9122q3 c9122q3 = this.f14363c;
        if (i10 < 0) {
            if (c9122q3 == null) {
                AbstractC1061t.m3851l("layoutResult");
                c9122q3 = null;
            }
            iM35397q = c9122q3.m35397q(0);
        } else {
            if (c9122q3 == null) {
                AbstractC1061t.m3851l("layoutResult");
                c9122q3 = null;
            }
            int iM35397q2 = c9122q3.m35397q(i10);
            iM35397q = m19314i(iM35397q2, f14361g) == i10 ? iM35397q2 : iM35397q2 + 1;
        }
        C9122q3 c9122q32 = this.f14363c;
        if (c9122q32 == null) {
            AbstractC1061t.m3851l("layoutResult");
            c9122q32 = null;
        }
        if (iM35397q >= c9122q32.m35395n()) {
            return null;
        }
        return m19290c(m19314i(iM35397q, f14361g), m19314i(iM35397q, f14362h) + 1);
    }

    @Override // p179m2.InterfaceC4843g
    /* JADX INFO: renamed from: b */
    public int[] mo19303b(int i10) {
        int iM35397q;
        if (m19291d().length() <= 0 || i10 <= 0) {
            return null;
        }
        int length = m19291d().length();
        C9122q3 c9122q3 = this.f14363c;
        if (i10 > length) {
            if (c9122q3 == null) {
                AbstractC1061t.m3851l("layoutResult");
                c9122q3 = null;
            }
            iM35397q = c9122q3.m35397q(m19291d().length());
        } else {
            if (c9122q3 == null) {
                AbstractC1061t.m3851l("layoutResult");
                c9122q3 = null;
            }
            int iM35397q2 = c9122q3.m35397q(i10);
            iM35397q = m19314i(iM35397q2, f14362h) + 1 == i10 ? iM35397q2 : iM35397q2 - 1;
        }
        if (iM35397q < 0) {
            return null;
        }
        return m19290c(m19314i(iM35397q, f14361g), m19314i(iM35397q, f14362h) + 1);
    }

    /* JADX INFO: renamed from: i */
    public final int m19314i(int i10, EnumC2856i enumC2856i) {
        C9122q3 c9122q3 = this.f14363c;
        C9122q3 c9122q32 = null;
        if (c9122q3 == null) {
            AbstractC1061t.m3851l("layoutResult");
            c9122q3 = null;
        }
        int iM35401u = c9122q3.m35401u(i10);
        C9122q3 c9122q33 = this.f14363c;
        if (c9122q33 == null) {
            AbstractC1061t.m3851l("layoutResult");
            c9122q33 = null;
        }
        EnumC2856i enumC2856iM35405y = c9122q33.m35405y(iM35401u);
        C9122q3 c9122q34 = this.f14363c;
        if (enumC2856i != enumC2856iM35405y) {
            if (c9122q34 == null) {
                AbstractC1061t.m3851l("layoutResult");
            } else {
                c9122q32 = c9122q34;
            }
            return c9122q32.m35401u(i10);
        }
        if (c9122q34 == null) {
            AbstractC1061t.m3851l("layoutResult");
            c9122q34 = null;
        }
        return C9122q3.m35379p(c9122q34, i10, false, 2, null) - 1;
    }

    /* JADX INFO: renamed from: j */
    public final void m19315j(String str, C9122q3 c9122q3) {
        m19293f(str);
        this.f14363c = c9122q3;
    }

    /* JADX INFO: renamed from: m2.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C4828d m19316a() {
            if (C4828d.f14360f == null) {
                C4828d.f14360f = new C4828d(null);
            }
            C4828d c4828d = C4828d.f14360f;
            c4828d.getClass();
            return c4828d;
        }

        public a() {
        }
    }

    public C4828d() {
    }
}
