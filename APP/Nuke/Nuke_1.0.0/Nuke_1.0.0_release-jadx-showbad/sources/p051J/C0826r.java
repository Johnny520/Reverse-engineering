package p051J;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import com.bumptech.glide.AbstractC1926h;
import p000A.C0042V0;
import p029F0.InterfaceC0430v;
import p030F1.AbstractC0448m;
import p092S0.AbstractC1251D;
import p092S0.C1257J;
import p092S0.C1259L;
import p092S0.C1277o;
import p115X0.C1646u;
import p117X2.AbstractC1665j;
import p147d1.EnumC1960j;
import p204n0.C2684c;
import p211o0.AbstractC2767z;
import p211o0.C2730E;

/* JADX INFO: renamed from: J.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0826r {

    /* JADX INFO: renamed from: a */
    public final C0809a f2649a;

    /* JADX INFO: renamed from: b */
    public final C0822n f2650b;

    /* JADX INFO: renamed from: d */
    public boolean f2652d;

    /* JADX INFO: renamed from: e */
    public boolean f2653e;

    /* JADX INFO: renamed from: f */
    public boolean f2654f;

    /* JADX INFO: renamed from: g */
    public boolean f2655g;

    /* JADX INFO: renamed from: h */
    public boolean f2656h;

    /* JADX INFO: renamed from: i */
    public boolean f2657i;

    /* JADX INFO: renamed from: j */
    public C1646u f2658j;

    /* JADX INFO: renamed from: k */
    public C1257J f2659k;

    /* JADX INFO: renamed from: l */
    public C0042V0 f2660l;

    /* JADX INFO: renamed from: m */
    public C2684c f2661m;

    /* JADX INFO: renamed from: n */
    public C2684c f2662n;

    /* JADX INFO: renamed from: c */
    public final Object f2651c = new Object();

    /* JADX INFO: renamed from: o */
    public final CursorAnchorInfo.Builder f2663o = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: p */
    public final float[] f2664p = C2730E.m4782a();

    /* JADX INFO: renamed from: q */
    public final Matrix f2665q = new Matrix();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0826r(C0809a c0809a, C0822n c0822n) {
        this.f2649a = c0809a;
        this.f2650b = c0822n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1470a() {
        float f2;
        float f5;
        C0822n c0822n = this.f2650b;
        InputMethodManager inputMethodManagerM1454a = c0822n.m1454a();
        View view = c0822n.f2641b;
        if (!inputMethodManagerM1454a.isActive(view) || this.f2658j == null || this.f2660l == null || this.f2659k == null || this.f2661m == null || this.f2662n == null) {
            return;
        }
        float[] fArr = this.f2664p;
        C2730E.m4785d(fArr);
        InterfaceC0430v interfaceC0430v = (InterfaceC0430v) this.f2649a.f2599k.f2648u.getValue();
        if (interfaceC0430v != null) {
            if (!interfaceC0430v.mo632D()) {
                interfaceC0430v = null;
            }
            if (interfaceC0430v != null) {
                interfaceC0430v.mo633I(fArr);
            }
        }
        C2684c c2684c = this.f2662n;
        AbstractC1665j.m2982b(c2684c);
        float f6 = -c2684c.f8558a;
        C2684c c2684c2 = this.f2662n;
        AbstractC1665j.m2982b(c2684c2);
        C2730E.m4787f(fArr, f6, -c2684c2.f8559b);
        Matrix matrix = this.f2665q;
        AbstractC2767z.m4945p(matrix, fArr);
        C1646u c1646u = this.f2658j;
        AbstractC1665j.m2982b(c1646u);
        long j5 = c1646u.f5651b;
        C0042V0 c0042v0 = this.f2660l;
        AbstractC1665j.m2982b(c0042v0);
        C1257J c1257j = this.f2659k;
        AbstractC1665j.m2982b(c1257j);
        C1277o c1277o = c1257j.f4527b;
        C2684c c2684c3 = this.f2661m;
        AbstractC1665j.m2982b(c2684c3);
        float f7 = c2684c3.f8561d;
        float f8 = c2684c3.f8559b;
        C2684c c2684c4 = this.f2662n;
        AbstractC1665j.m2982b(c2684c4);
        boolean z5 = this.f2654f;
        boolean z6 = this.f2655g;
        boolean z7 = this.f2656h;
        boolean z8 = this.f2657i;
        CursorAnchorInfo.Builder builder = this.f2663o;
        builder.reset();
        builder.setMatrix(matrix);
        C1259L c1259l = c1646u.f5652c;
        int iM2338f = C1259L.m2338f(j5);
        builder.setSelectionRange(iM2338f, C1259L.m2337e(j5));
        EnumC1960j enumC1960j = EnumC1960j.f6637e;
        if (!z5 || iM2338f < 0) {
            f2 = f7;
            f5 = f8;
        } else {
            c0042v0.m57a(iM2338f);
            C2684c c2684cM2326c = c1257j.m2326c(iM2338f);
            f2 = f7;
            f5 = f8;
            float fM3567j = AbstractC1926h.m3567j(c2684cM2326c.f8558a, 0.0f, (int) (c1257j.f4528c >> 32));
            boolean zM1461f = AbstractC0825q.m1461f(c2684c3, fM3567j, c2684cM2326c.f8559b);
            boolean zM1461f2 = AbstractC0825q.m1461f(c2684c3, fM3567j, c2684cM2326c.f8561d);
            boolean z9 = c1257j.m2324a(iM2338f) == enumC1960j;
            int i5 = (zM1461f || zM1461f2) ? 1 : 0;
            if (!zM1461f || !zM1461f2) {
                i5 |= 2;
            }
            if (z9) {
                i5 |= 4;
            }
            float f9 = c2684cM2326c.f8559b;
            float f10 = c2684cM2326c.f8561d;
            builder.setInsertionMarkerLocation(fM3567j, f9, f10, f10, i5);
        }
        CursorAnchorInfo.Builder builder2 = builder;
        if (z6) {
            int iM2338f2 = c1259l != null ? C1259L.m2338f(c1259l.f4538a) : -1;
            int iM2337e = c1259l != null ? C1259L.m2337e(c1259l.f4538a) : -1;
            if (iM2338f2 >= 0 && iM2338f2 < iM2337e) {
                builder2.setComposingText(iM2338f2, c1646u.f5650a.f4563e.subSequence(iM2338f2, iM2337e));
                c0042v0.m57a(iM2338f2);
                c0042v0.m57a(iM2337e);
                float[] fArr2 = new float[(iM2337e - iM2338f2) * 4];
                c1277o.m2360a(AbstractC1251D.m2313b(iM2338f2, iM2337e), fArr2);
                int i6 = iM2338f2;
                while (i6 < iM2337e) {
                    c0042v0.m57a(i6);
                    int i7 = (i6 - iM2338f2) * 4;
                    float f11 = fArr2[i7];
                    float f12 = fArr2[i7 + 1];
                    CursorAnchorInfo.Builder builder3 = builder2;
                    float f13 = fArr2[i7 + 2];
                    float f14 = fArr2[i7 + 3];
                    float[] fArr3 = fArr2;
                    int i8 = (c2684c3.f8558a < f13 ? 1 : 0) & (f11 < c2684c3.f8560c ? 1 : 0) & (f5 < f14 ? 1 : 0) & (f12 < f2 ? 1 : 0);
                    if (!AbstractC0825q.m1461f(c2684c3, f11, f12) || !AbstractC0825q.m1461f(c2684c3, f13, f14)) {
                        i8 |= 2;
                    }
                    if (c1257j.m2324a(i6) == enumC1960j) {
                        i8 |= 4;
                    }
                    int i9 = i6;
                    builder3.addCharacterBounds(i9, f11, f12, f13, f14, i8);
                    builder2 = builder3;
                    i6 = i9 + 1;
                    fArr2 = fArr3;
                }
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 && z7) {
            builder2.setEditorBoundsInfo(AbstractC0448m.m724h().setEditorBounds(AbstractC2767z.m4950u(c2684c4)).setHandwritingBounds(AbstractC2767z.m4950u(c2684c4)).build());
        }
        if (i10 >= 34 && z8 && !c2684c3.m4655f()) {
            int i11 = c1277o.f4590f - 1;
            if (i11 < 0) {
                i11 = 0;
            }
            int iM3568k = AbstractC1926h.m3568k(c1277o.m2364e(f5), 0, i11);
            int iM3568k2 = AbstractC1926h.m3568k(c1277o.m2364e(f2), 0, i11);
            if (iM3568k <= iM3568k2) {
                while (true) {
                    builder2.addVisibleLineBounds(c1257j.m2327d(iM3568k), c1277o.m2365f(iM3568k), c1257j.m2328e(iM3568k), c1277o.m2361b(iM3568k));
                    if (iM3568k == iM3568k2) {
                        break;
                    } else {
                        iM3568k++;
                    }
                }
            }
        }
        c0822n.m1454a().updateCursorAnchorInfo(view, builder2.build());
        this.f2653e = false;
    }
}
