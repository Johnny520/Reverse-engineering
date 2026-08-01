package p115X0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import com.bumptech.glide.AbstractC1926h;
import p000A.C0042V0;
import p000A.C0072l0;
import p030F1.AbstractC0448m;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p049I2.AbstractC0797o;
import p092S0.AbstractC1251D;
import p092S0.C1257J;
import p092S0.C1259L;
import p092S0.C1277o;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p147d1.EnumC1960j;
import p204n0.C2684c;
import p211o0.AbstractC2767z;
import p211o0.C2730E;

/* JADX INFO: renamed from: X0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1628c {

    /* JADX INFO: renamed from: a */
    public final ViewTreeObserverOnGlobalLayoutListenerC0772y f5597a;

    /* JADX INFO: renamed from: b */
    public final C0072l0 f5598b;

    /* JADX INFO: renamed from: d */
    public boolean f5600d;

    /* JADX INFO: renamed from: e */
    public boolean f5601e;

    /* JADX INFO: renamed from: f */
    public boolean f5602f;

    /* JADX INFO: renamed from: g */
    public boolean f5603g;

    /* JADX INFO: renamed from: h */
    public boolean f5604h;

    /* JADX INFO: renamed from: i */
    public boolean f5605i;

    /* JADX INFO: renamed from: j */
    public C1646u f5606j;

    /* JADX INFO: renamed from: k */
    public C1257J f5607k;

    /* JADX INFO: renamed from: l */
    public C0042V0 f5608l;

    /* JADX INFO: renamed from: n */
    public C2684c f5610n;

    /* JADX INFO: renamed from: o */
    public C2684c f5611o;

    /* JADX INFO: renamed from: c */
    public final Object f5599c = new Object();

    /* JADX INFO: renamed from: m */
    public InterfaceC1601c f5609m = C1627b.f5591g;

    /* JADX INFO: renamed from: p */
    public final CursorAnchorInfo.Builder f5612p = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: q */
    public final float[] f5613q = C2730E.m4782a();

    /* JADX INFO: renamed from: r */
    public final Matrix f5614r = new Matrix();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1628c(ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y, C0072l0 c0072l0) {
        this.f5597a = viewTreeObserverOnGlobalLayoutListenerC0772y;
        this.f5598b = c0072l0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v0, types: [K2.e, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public final void m2928a() {
        View view;
        C0072l0 c0072l0 = this.f5598b;
        ?? r22 = c0072l0.f308f;
        InputMethodManager inputMethodManager = (InputMethodManager) r22.getValue();
        View view2 = (View) c0072l0.f307e;
        if (inputMethodManager.isActive(view2)) {
            InterfaceC1601c interfaceC1601c = this.f5609m;
            float[] fArr = this.f5613q;
            interfaceC1601c.mo1h(new C2730E(fArr));
            this.f5597a.m1313s(fArr);
            Matrix matrix = this.f5614r;
            AbstractC2767z.m4945p(matrix, fArr);
            C1646u c1646u = this.f5606j;
            AbstractC1665j.m2982b(c1646u);
            long j5 = c1646u.f5651b;
            C0042V0 c0042v0 = this.f5608l;
            AbstractC1665j.m2982b(c0042v0);
            C1257J c1257j = this.f5607k;
            AbstractC1665j.m2982b(c1257j);
            C1277o c1277o = c1257j.f4527b;
            C2684c c2684c = this.f5610n;
            AbstractC1665j.m2982b(c2684c);
            float f2 = c2684c.f8561d;
            float f5 = c2684c.f8559b;
            C2684c c2684c2 = this.f5611o;
            AbstractC1665j.m2982b(c2684c2);
            boolean z5 = this.f5602f;
            boolean z6 = this.f5603g;
            boolean z7 = this.f5604h;
            boolean z8 = this.f5605i;
            CursorAnchorInfo.Builder builder = this.f5612p;
            builder.reset();
            builder.setMatrix(matrix);
            C1259L c1259l = c1646u.f5652c;
            int iM2338f = C1259L.m2338f(j5);
            builder.setSelectionRange(iM2338f, C1259L.m2337e(j5));
            EnumC1960j enumC1960j = EnumC1960j.f6637e;
            if (!z5 || iM2338f < 0) {
                view = view2;
            } else {
                c0042v0.m57a(iM2338f);
                C2684c c2684cM2326c = c1257j.m2326c(iM2338f);
                view = view2;
                float fM3567j = AbstractC1926h.m3567j(c2684cM2326c.f8558a, 0.0f, (int) (c1257j.f4528c >> 32));
                boolean zM1387l = AbstractC0797o.m1387l(c2684c, fM3567j, c2684cM2326c.f8559b);
                boolean zM1387l2 = AbstractC0797o.m1387l(c2684c, fM3567j, c2684cM2326c.f8561d);
                boolean z9 = c1257j.m2324a(iM2338f) == enumC1960j;
                int i5 = (zM1387l || zM1387l2) ? 1 : 0;
                if (!zM1387l || !zM1387l2) {
                    i5 |= 2;
                }
                if (z9) {
                    i5 |= 4;
                }
                float f6 = c2684cM2326c.f8559b;
                float f7 = c2684cM2326c.f8561d;
                builder.setInsertionMarkerLocation(fM3567j, f6, f7, f7, i5);
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
                        float f8 = fArr2[i7];
                        float f9 = fArr2[i7 + 1];
                        CursorAnchorInfo.Builder builder3 = builder2;
                        float f10 = fArr2[i7 + 2];
                        float f11 = fArr2[i7 + 3];
                        int i8 = iM2337e;
                        int i9 = (c2684c.f8558a < f10 ? 1 : 0) & (f8 < c2684c.f8560c ? 1 : 0) & (f5 < f11 ? 1 : 0) & (f9 < f2 ? 1 : 0);
                        if (!AbstractC0797o.m1387l(c2684c, f8, f9) || !AbstractC0797o.m1387l(c2684c, f10, f11)) {
                            i9 |= 2;
                        }
                        if (c1257j.m2324a(i6) == enumC1960j) {
                            i9 |= 4;
                        }
                        int i10 = i6;
                        builder3.addCharacterBounds(i10, f8, f9, f10, f11, i9);
                        builder2 = builder3;
                        i6 = i10 + 1;
                        iM2337e = i8;
                    }
                }
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 33 && z7) {
                builder2.setEditorBoundsInfo(AbstractC0448m.m724h().setEditorBounds(AbstractC2767z.m4950u(c2684c2)).setHandwritingBounds(AbstractC2767z.m4950u(c2684c2)).build());
            }
            if (i11 >= 34 && z8 && !c2684c.m4655f()) {
                int i12 = c1277o.f4590f - 1;
                if (i12 < 0) {
                    i12 = 0;
                }
                int iM3568k = AbstractC1926h.m3568k(c1277o.m2364e(f5), 0, i12);
                int iM3568k2 = AbstractC1926h.m3568k(c1277o.m2364e(f2), 0, i12);
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
            ((InputMethodManager) r22.getValue()).updateCursorAnchorInfo(view, builder2.build());
            this.f5601e = false;
        }
    }
}
