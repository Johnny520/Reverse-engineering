package p164l0;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import p010a9.InterfaceC0184l;
import p018b3.C0978t0;
import p018b3.InterfaceC0956i0;
import p172l8.C4700i0;
import p250r1.C6457g;
import p265s1.AbstractC7117o0;
import p265s1.C7114n2;
import p319w2.C9122q3;

/* JADX INFO: renamed from: l0.i2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4432i2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0184l f12939a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4404b2 f12940b;

    /* JADX INFO: renamed from: d */
    public boolean f12942d;

    /* JADX INFO: renamed from: e */
    public boolean f12943e;

    /* JADX INFO: renamed from: f */
    public boolean f12944f;

    /* JADX INFO: renamed from: g */
    public boolean f12945g;

    /* JADX INFO: renamed from: h */
    public boolean f12946h;

    /* JADX INFO: renamed from: i */
    public boolean f12947i;

    /* JADX INFO: renamed from: j */
    public C0978t0 f12948j;

    /* JADX INFO: renamed from: k */
    public C9122q3 f12949k;

    /* JADX INFO: renamed from: l */
    public InterfaceC0956i0 f12950l;

    /* JADX INFO: renamed from: m */
    public C6457g f12951m;

    /* JADX INFO: renamed from: n */
    public C6457g f12952n;

    /* JADX INFO: renamed from: c */
    public final Object f12941c = new Object();

    /* JADX INFO: renamed from: o */
    public final CursorAnchorInfo.Builder f12953o = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: p */
    public final float[] f12954p = C7114n2.m28021c(null, 1, null);

    /* JADX INFO: renamed from: q */
    public final Matrix f12955q = new Matrix();

    public C4432i2(InterfaceC0184l interfaceC0184l, InterfaceC4404b2 interfaceC4404b2) {
        this.f12939a = interfaceC0184l;
        this.f12940b = interfaceC4404b2;
    }

    /* JADX INFO: renamed from: a */
    public final void m17265a() {
        synchronized (this.f12941c) {
            this.f12948j = null;
            this.f12950l = null;
            this.f12949k = null;
            this.f12951m = null;
            this.f12952n = null;
            C4700i0 c4700i0 = C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m17266b(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        synchronized (this.f12941c) {
            try {
                this.f12944f = z12;
                this.f12945g = z13;
                this.f12946h = z14;
                this.f12947i = z15;
                if (z10) {
                    this.f12943e = true;
                    if (this.f12948j != null) {
                        m17267c();
                    }
                }
                this.f12942d = z11;
                C4700i0 c4700i0 = C4700i0.f13910a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m17267c() {
        if (!this.f12940b.mo17204c() || this.f12948j == null || this.f12950l == null || this.f12949k == null || this.f12951m == null || this.f12952n == null) {
            return;
        }
        C7114n2.m28026h(this.f12954p);
        this.f12939a.mo27m(C7114n2.m28019a(this.f12954p));
        float[] fArr = this.f12954p;
        C6457g c6457g = this.f12952n;
        c6457g.getClass();
        float f10 = -c6457g.m25583l();
        C6457g c6457g2 = this.f12952n;
        c6457g2.getClass();
        C7114n2.m28034p(fArr, f10, -c6457g2.m25586o(), 0.0f);
        AbstractC7117o0.m28050a(this.f12955q, this.f12954p);
        InterfaceC4404b2 interfaceC4404b2 = this.f12940b;
        CursorAnchorInfo.Builder builder = this.f12953o;
        C0978t0 c0978t0 = this.f12948j;
        c0978t0.getClass();
        InterfaceC0956i0 interfaceC0956i0 = this.f12950l;
        interfaceC0956i0.getClass();
        C9122q3 c9122q3 = this.f12949k;
        c9122q3.getClass();
        Matrix matrix = this.f12955q;
        C6457g c6457g3 = this.f12951m;
        c6457g3.getClass();
        C6457g c6457g4 = this.f12952n;
        c6457g4.getClass();
        interfaceC4404b2.updateCursorAnchorInfo(AbstractC4428h2.m17258b(builder, c0978t0, interfaceC0956i0, c9122q3, matrix, c6457g3, c6457g4, this.f12944f, this.f12945g, this.f12946h, this.f12947i));
        this.f12943e = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m17268d(C0978t0 c0978t0, InterfaceC0956i0 interfaceC0956i0, C9122q3 c9122q3, C6457g c6457g, C6457g c6457g2) {
        synchronized (this.f12941c) {
            try {
                this.f12948j = c0978t0;
                this.f12950l = interfaceC0956i0;
                this.f12949k = c9122q3;
                this.f12951m = c6457g;
                this.f12952n = c6457g2;
                if (this.f12943e || this.f12942d) {
                    m17267c();
                }
                C4700i0 c4700i0 = C4700i0.f13910a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
