package p018b3;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1067w;
import p073f2.InterfaceC2243h;
import p172l8.C4700i0;
import p250r1.C6457g;
import p265s1.AbstractC7117o0;
import p265s1.C7114n2;
import p319w2.C9122q3;

/* JADX INFO: renamed from: b3.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0946e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2243h f2910a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0981v f2911b;

    /* JADX INFO: renamed from: d */
    public boolean f2913d;

    /* JADX INFO: renamed from: e */
    public boolean f2914e;

    /* JADX INFO: renamed from: f */
    public boolean f2915f;

    /* JADX INFO: renamed from: g */
    public boolean f2916g;

    /* JADX INFO: renamed from: h */
    public boolean f2917h;

    /* JADX INFO: renamed from: i */
    public boolean f2918i;

    /* JADX INFO: renamed from: j */
    public C0978t0 f2919j;

    /* JADX INFO: renamed from: k */
    public C9122q3 f2920k;

    /* JADX INFO: renamed from: l */
    public InterfaceC0956i0 f2921l;

    /* JADX INFO: renamed from: n */
    public C6457g f2923n;

    /* JADX INFO: renamed from: o */
    public C6457g f2924o;

    /* JADX INFO: renamed from: c */
    public final Object f2912c = new Object();

    /* JADX INFO: renamed from: m */
    public InterfaceC0184l f2922m = b.f2929r;

    /* JADX INFO: renamed from: p */
    public final CursorAnchorInfo.Builder f2925p = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: q */
    public final float[] f2926q = C7114n2.m28021c(null, 1, null);

    /* JADX INFO: renamed from: r */
    public final Matrix f2927r = new Matrix();

    public C0946e(InterfaceC2243h interfaceC2243h, InterfaceC0981v interfaceC0981v) {
        this.f2910a = interfaceC2243h;
        this.f2911b = interfaceC0981v;
    }

    /* JADX INFO: renamed from: a */
    public final void m3472a() {
        synchronized (this.f2912c) {
            this.f2919j = null;
            this.f2921l = null;
            this.f2920k = null;
            this.f2922m = a.f2928r;
            this.f2923n = null;
            this.f2924o = null;
            C4700i0 c4700i0 = C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3473b(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        synchronized (this.f2912c) {
            try {
                this.f2915f = z12;
                this.f2916g = z13;
                this.f2917h = z14;
                this.f2918i = z15;
                if (z10) {
                    this.f2914e = true;
                    if (this.f2919j != null) {
                        m3474c();
                    }
                }
                this.f2913d = z11;
                C4700i0 c4700i0 = C4700i0.f13910a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3474c() {
        if (this.f2911b.mo3596c()) {
            this.f2922m.mo27m(C7114n2.m28019a(this.f2926q));
            this.f2910a.mo8139B(this.f2926q);
            AbstractC7117o0.m28050a(this.f2927r, this.f2926q);
            InterfaceC0981v interfaceC0981v = this.f2911b;
            CursorAnchorInfo.Builder builder = this.f2925p;
            C0978t0 c0978t0 = this.f2919j;
            c0978t0.getClass();
            InterfaceC0956i0 interfaceC0956i0 = this.f2921l;
            interfaceC0956i0.getClass();
            C9122q3 c9122q3 = this.f2920k;
            c9122q3.getClass();
            Matrix matrix = this.f2927r;
            C6457g c6457g = this.f2923n;
            c6457g.getClass();
            C6457g c6457g2 = this.f2924o;
            c6457g2.getClass();
            interfaceC0981v.updateCursorAnchorInfo(AbstractC0943d.m3468b(builder, c0978t0, interfaceC0956i0, c9122q3, matrix, c6457g, c6457g2, this.f2915f, this.f2916g, this.f2917h, this.f2918i));
            this.f2914e = false;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3475d(C0978t0 c0978t0, InterfaceC0956i0 interfaceC0956i0, C9122q3 c9122q3, InterfaceC0184l interfaceC0184l, C6457g c6457g, C6457g c6457g2) {
        synchronized (this.f2912c) {
            try {
                this.f2919j = c0978t0;
                this.f2921l = interfaceC0956i0;
                this.f2920k = c9122q3;
                this.f2922m = interfaceC0184l;
                this.f2923n = c6457g;
                this.f2924o = c6457g2;
                if (this.f2914e || this.f2913d) {
                    m3474c();
                }
                C4700i0 c4700i0 = C4700i0.f13910a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b3.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public static final a f2928r = new a();

        public a() {
            super(1);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m3476a(((C7114n2) obj).m28036r());
            return C4700i0.f13910a;
        }

        /* JADX INFO: renamed from: a */
        public final void m3476a(float[] fArr) {
        }
    }

    /* JADX INFO: renamed from: b3.e$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public static final b f2929r = new b();

        public b() {
            super(1);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m3477a(((C7114n2) obj).m28036r());
            return C4700i0.f13910a;
        }

        /* JADX INFO: renamed from: a */
        public final void m3477a(float[] fArr) {
        }
    }
}
