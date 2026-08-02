package p000;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t30 {

    /* JADX INFO: renamed from: a */
    public final ViewTreeObserverOnGlobalLayoutListenerC0045b7 f10509a;

    /* JADX INFO: renamed from: b */
    public final C0043b5 f10510b;

    /* JADX INFO: renamed from: d */
    public boolean f10512d;

    /* JADX INFO: renamed from: e */
    public boolean f10513e;

    /* JADX INFO: renamed from: f */
    public boolean f10514f;

    /* JADX INFO: renamed from: g */
    public boolean f10515g;

    /* JADX INFO: renamed from: h */
    public boolean f10516h;

    /* JADX INFO: renamed from: i */
    public boolean f10517i;

    /* JADX INFO: renamed from: j */
    public k03 f10518j;

    /* JADX INFO: renamed from: k */
    public y03 f10519k;

    /* JADX INFO: renamed from: l */
    public us1 f10520l;

    /* JADX INFO: renamed from: n */
    public o62 f10522n;

    /* JADX INFO: renamed from: o */
    public o62 f10523o;

    /* JADX INFO: renamed from: c */
    public final Object f10511c = new Object();

    /* JADX INFO: renamed from: m */
    public in0 f10521m = C0799v6.f11751D;

    /* JADX INFO: renamed from: p */
    public final CursorAnchorInfo.Builder f10524p = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: q */
    public final float[] f10525q = hf1.m2155a();

    /* JADX INFO: renamed from: r */
    public final Matrix f10526r = new Matrix();

    public t30(ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7, C0043b5 c0043b5) {
        this.f10509a = viewTreeObserverOnGlobalLayoutListenerC0045b7;
        this.f10510b = c0043b5;
    }

    /* JADX INFO: renamed from: a */
    public final void m5114a() {
        View view;
        C0043b5 c0043b5 = this.f10510b;
        j71 j71Var = (j71) c0043b5.f563j;
        InputMethodManager inputMethodManager = (InputMethodManager) j71Var.getValue();
        View view2 = (View) c0043b5.f562i;
        if (inputMethodManager.isActive(view2)) {
            in0 in0Var = this.f10521m;
            float[] fArr = this.f10525q;
            in0Var.mo5j(new hf1(fArr));
            this.f10509a.m476t(fArr);
            Matrix matrix = this.f10526r;
            ci0.m796U(matrix, fArr);
            k03 k03Var = this.f10518j;
            k03Var.getClass();
            long j = k03Var.f5297b;
            us1 us1Var = this.f10520l;
            us1Var.getClass();
            y03 y03Var = this.f10519k;
            y03Var.getClass();
            lj1 lj1Var = y03Var.f13267b;
            o62 o62Var = this.f10522n;
            o62Var.getClass();
            float f = o62Var.f7539d;
            float f2 = o62Var.f7537b;
            o62 o62Var2 = this.f10523o;
            o62Var2.getClass();
            boolean z = this.f10514f;
            boolean z2 = this.f10515g;
            boolean z3 = this.f10516h;
            boolean z4 = this.f10517i;
            CursorAnchorInfo.Builder builder = this.f10524p;
            builder.reset();
            builder.setMatrix(matrix);
            f13 f13Var = k03Var.f5298c;
            int iM1497f = f13.m1497f(j);
            builder.setSelectionRange(iM1497f, f13.m1496e(j));
            c92 c92Var = c92.f1252i;
            if (!z || iM1497f < 0) {
                view = view2;
            } else {
                int iMo2451p = us1Var.mo2451p(iM1497f);
                o62 o62VarM6203c = y03Var.m6203c(iMo2451p);
                view = view2;
                float fM778C = ci0.m778C(o62VarM6203c.f7536a, 0.0f, (int) (y03Var.f13268c >> 32));
                boolean zM5321t = AbstractC0738tl.m5321t(o62Var, fM778C, o62VarM6203c.f7537b);
                boolean zM5321t2 = AbstractC0738tl.m5321t(o62Var, fM778C, o62VarM6203c.f7539d);
                boolean z5 = y03Var.m6201a(iMo2451p) == c92Var;
                int i = (zM5321t || zM5321t2) ? 1 : 0;
                if (!zM5321t || !zM5321t2) {
                    i |= 2;
                }
                if (z5) {
                    i |= 4;
                }
                float f3 = o62VarM6203c.f7537b;
                float f4 = o62VarM6203c.f7539d;
                builder.setInsertionMarkerLocation(fM778C, f3, f4, f4, i);
            }
            CursorAnchorInfo.Builder builder2 = builder;
            if (z2) {
                int iM1497f2 = f13Var != null ? f13.m1497f(f13Var.f2739a) : -1;
                int iM1496e = f13Var != null ? f13.m1496e(f13Var.f2739a) : -1;
                if (iM1497f2 >= 0 && iM1497f2 < iM1496e) {
                    builder2.setComposingText(iM1497f2, k03Var.f5296a.f10051i.subSequence(iM1497f2, iM1496e));
                    int iMo2451p2 = us1Var.mo2451p(iM1497f2);
                    int iMo2451p3 = us1Var.mo2451p(iM1496e);
                    float[] fArr2 = new float[(iMo2451p3 - iMo2451p2) * 4];
                    lj1Var.m2914a(fg1.m1636i(iMo2451p2, iMo2451p3), fArr2);
                    while (iM1497f2 < iM1496e) {
                        int iMo2451p4 = us1Var.mo2451p(iM1497f2);
                        int i2 = (iMo2451p4 - iMo2451p2) * 4;
                        float f5 = fArr2[i2];
                        CursorAnchorInfo.Builder builder3 = builder2;
                        float f6 = fArr2[i2 + 1];
                        int i3 = iM1496e;
                        float f7 = fArr2[i2 + 2];
                        float f8 = fArr2[i2 + 3];
                        int i4 = iM1497f2;
                        int i5 = (o62Var.f7536a < f7 ? 1 : 0) & (f5 < o62Var.f7538c ? 1 : 0) & (f2 < f8 ? 1 : 0) & (f6 < f ? 1 : 0);
                        if (!AbstractC0738tl.m5321t(o62Var, f5, f6) || !AbstractC0738tl.m5321t(o62Var, f7, f8)) {
                            i5 |= 2;
                        }
                        if (y03Var.m6201a(iMo2451p4) == c92Var) {
                            i5 |= 4;
                        }
                        builder3.addCharacterBounds(i4, f5, f6, f7, f8, i5);
                        builder2 = builder3;
                        iM1497f2 = i4 + 1;
                        iM1496e = i3;
                    }
                }
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 33 && z3) {
                builder2.setEditorBoundsInfo(AbstractC0117d4.m946h().setEditorBounds(rp0.m4554o0(o62Var2)).setHandwritingBounds(rp0.m4554o0(o62Var2)).build());
            }
            if (i6 >= 34 && z4 && !o62Var.m3518f()) {
                int i7 = lj1Var.f6151f - 1;
                if (i7 < 0) {
                    i7 = 0;
                }
                int iM779D = ci0.m779D(lj1Var.m2918e(f2), 0, i7);
                int iM779D2 = ci0.m779D(lj1Var.m2918e(f), 0, i7);
                if (iM779D <= iM779D2) {
                    while (true) {
                        builder2.addVisibleLineBounds(y03Var.m6204d(iM779D), lj1Var.m2919f(iM779D), y03Var.m6205e(iM779D), lj1Var.m2915b(iM779D));
                        if (iM779D == iM779D2) {
                            break;
                        } else {
                            iM779D++;
                        }
                    }
                }
            }
            ((InputMethodManager) j71Var.getValue()).updateCursorAnchorInfo(view, builder2.build());
            this.f10513e = false;
        }
    }
}
