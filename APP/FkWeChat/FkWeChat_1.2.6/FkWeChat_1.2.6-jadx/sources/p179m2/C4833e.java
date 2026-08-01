package p179m2;

import android.graphics.Rect;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p080f9.AbstractC2368o;
import p104h3.EnumC2856i;
import p250r1.C6457g;
import p277t2.C8094w;
import p319w2.C9122q3;

/* JADX INFO: renamed from: m2.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4833e extends AbstractC4818b {

    /* JADX INFO: renamed from: h */
    public static C4833e f14376h;

    /* JADX INFO: renamed from: c */
    public C9122q3 f14379c;

    /* JADX INFO: renamed from: d */
    public C8094w f14380d;

    /* JADX INFO: renamed from: e */
    public Rect f14381e;

    /* JADX INFO: renamed from: f */
    public static final a f14374f = new a(null);

    /* JADX INFO: renamed from: g */
    public static final int f14375g = 8;

    /* JADX INFO: renamed from: i */
    public static final EnumC2856i f14377i = EnumC2856i.f7468r;

    /* JADX INFO: renamed from: j */
    public static final EnumC2856i f14378j = EnumC2856i.f7467q;

    public C4833e() {
        this.f14381e = new Rect();
    }

    /* JADX INFO: renamed from: i */
    private final int m19328i(int i10, EnumC2856i enumC2856i) {
        C9122q3 c9122q3 = this.f14379c;
        C9122q3 c9122q32 = null;
        if (c9122q3 == null) {
            AbstractC1061t.m3851l("layoutResult");
            c9122q3 = null;
        }
        int iM35401u = c9122q3.m35401u(i10);
        C9122q3 c9122q33 = this.f14379c;
        if (c9122q33 == null) {
            AbstractC1061t.m3851l("layoutResult");
            c9122q33 = null;
        }
        EnumC2856i enumC2856iM35405y = c9122q33.m35405y(iM35401u);
        C9122q3 c9122q34 = this.f14379c;
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

    @Override // p179m2.InterfaceC4843g
    /* JADX INFO: renamed from: a */
    public int[] mo19302a(int i10) {
        int iM35395n;
        C9122q3 c9122q3 = null;
        if (m19291d().length() <= 0 || i10 >= m19291d().length()) {
            return null;
        }
        try {
            C8094w c8094w = this.f14380d;
            if (c8094w == null) {
                AbstractC1061t.m3851l("node");
                c8094w = null;
            }
            C6457g c6457gM31285k = c8094w.m31285k();
            int iRound = Math.round(c6457gM31285k.m25580i() - c6457gM31285k.m25586o());
            int iM8578e = AbstractC2368o.m8578e(0, i10);
            C9122q3 c9122q32 = this.f14379c;
            if (c9122q32 == null) {
                AbstractC1061t.m3851l("layoutResult");
                c9122q32 = null;
            }
            int iM35397q = c9122q32.m35397q(iM8578e);
            C9122q3 c9122q33 = this.f14379c;
            if (c9122q33 == null) {
                AbstractC1061t.m3851l("layoutResult");
                c9122q33 = null;
            }
            float fM35402v = c9122q33.m35402v(iM35397q) + iRound;
            C9122q3 c9122q34 = this.f14379c;
            if (c9122q34 == null) {
                AbstractC1061t.m3851l("layoutResult");
                c9122q34 = null;
            }
            C9122q3 c9122q35 = this.f14379c;
            if (c9122q35 == null) {
                AbstractC1061t.m3851l("layoutResult");
                c9122q35 = null;
            }
            float fM35402v2 = c9122q34.m35402v(c9122q35.m35395n() - 1);
            C9122q3 c9122q36 = this.f14379c;
            if (fM35402v < fM35402v2) {
                if (c9122q36 == null) {
                    AbstractC1061t.m3851l("layoutResult");
                } else {
                    c9122q3 = c9122q36;
                }
                iM35395n = c9122q3.m35398r(fM35402v);
            } else {
                if (c9122q36 == null) {
                    AbstractC1061t.m3851l("layoutResult");
                } else {
                    c9122q3 = c9122q36;
                }
                iM35395n = c9122q3.m35395n();
            }
            return m19290c(iM8578e, m19328i(iM35395n - 1, f14378j) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // p179m2.InterfaceC4843g
    /* JADX INFO: renamed from: b */
    public int[] mo19303b(int i10) {
        int iM35398r;
        C9122q3 c9122q3 = null;
        if (m19291d().length() <= 0 || i10 <= 0) {
            return null;
        }
        try {
            C8094w c8094w = this.f14380d;
            if (c8094w == null) {
                AbstractC1061t.m3851l("node");
                c8094w = null;
            }
            C6457g c6457gM31285k = c8094w.m31285k();
            int iRound = Math.round(c6457gM31285k.m25580i() - c6457gM31285k.m25586o());
            int iM8582i = AbstractC2368o.m8582i(m19291d().length(), i10);
            C9122q3 c9122q32 = this.f14379c;
            if (c9122q32 == null) {
                AbstractC1061t.m3851l("layoutResult");
                c9122q32 = null;
            }
            int iM35397q = c9122q32.m35397q(iM8582i);
            C9122q3 c9122q33 = this.f14379c;
            if (c9122q33 == null) {
                AbstractC1061t.m3851l("layoutResult");
                c9122q33 = null;
            }
            float fM35402v = c9122q33.m35402v(iM35397q) - iRound;
            if (fM35402v > 0.0f) {
                C9122q3 c9122q34 = this.f14379c;
                if (c9122q34 == null) {
                    AbstractC1061t.m3851l("layoutResult");
                } else {
                    c9122q3 = c9122q34;
                }
                iM35398r = c9122q3.m35398r(fM35402v);
            } else {
                iM35398r = 0;
            }
            if (iM8582i == m19291d().length() && iM35398r < iM35397q) {
                iM35398r++;
            }
            return m19290c(m19328i(iM35398r, f14377i), iM8582i);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m19329j(String str, C9122q3 c9122q3, C8094w c8094w) {
        m19293f(str);
        this.f14379c = c9122q3;
        this.f14380d = c8094w;
    }

    /* JADX INFO: renamed from: m2.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C4833e m19330a() {
            if (C4833e.f14376h == null) {
                C4833e.f14376h = new C4833e(null);
            }
            C4833e c4833e = C4833e.f14376h;
            c4833e.getClass();
            return c4833e;
        }

        public a() {
        }
    }

    public /* synthetic */ C4833e(AbstractC1043k abstractC1043k) {
        this();
    }
}
