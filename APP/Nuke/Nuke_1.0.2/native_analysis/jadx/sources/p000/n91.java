package p000;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n91 {

    /* JADX INFO: renamed from: a */
    public final C0342j9 f7058a;

    /* JADX INFO: renamed from: b */
    public final sz0 f7059b;

    /* JADX INFO: renamed from: d */
    public boolean f7061d;

    /* JADX INFO: renamed from: e */
    public boolean f7062e;

    /* JADX INFO: renamed from: f */
    public boolean f7063f;

    /* JADX INFO: renamed from: g */
    public boolean f7064g;

    /* JADX INFO: renamed from: h */
    public boolean f7065h;

    /* JADX INFO: renamed from: i */
    public boolean f7066i;

    /* JADX INFO: renamed from: j */
    public k03 f7067j;

    /* JADX INFO: renamed from: k */
    public y03 f7068k;

    /* JADX INFO: renamed from: l */
    public us1 f7069l;

    /* JADX INFO: renamed from: m */
    public o62 f7070m;

    /* JADX INFO: renamed from: n */
    public o62 f7071n;

    /* JADX INFO: renamed from: c */
    public final Object f7060c = new Object();

    /* JADX INFO: renamed from: o */
    public final CursorAnchorInfo.Builder f7072o = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: p */
    public final float[] f7073p = hf1.m2155a();

    /* JADX INFO: renamed from: q */
    public final Matrix f7074q = new Matrix();

    public n91(C0342j9 c0342j9, sz0 sz0Var) {
        this.f7058a = c0342j9;
        this.f7059b = sz0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m3259a() {
        float f;
        float f2;
        sz0 sz0Var = this.f7059b;
        InputMethodManager inputMethodManagerM5033F = sz0Var.m5033F();
        View view = (View) sz0Var.f10436i;
        if (!inputMethodManagerM5033F.isActive(view) || this.f7067j == null || this.f7069l == null || this.f7068k == null || this.f7070m == null || this.f7071n == null) {
            return;
        }
        float[] fArr = this.f7073p;
        hf1.m2158d(fArr);
        c61 c61Var = (c61) this.f7058a.f4922o.f6524y.getValue();
        if (c61Var != null) {
            if (!c61Var.mo653w()) {
                c61Var = null;
            }
            if (c61Var != null) {
                c61Var.mo641C(fArr);
            }
        }
        o62 o62Var = this.f7071n;
        o62Var.getClass();
        float f3 = -o62Var.f7536a;
        o62 o62Var2 = this.f7071n;
        o62Var2.getClass();
        hf1.m2160f(fArr, f3, -o62Var2.f7537b);
        Matrix matrix = this.f7074q;
        ci0.m796U(matrix, fArr);
        k03 k03Var = this.f7067j;
        k03Var.getClass();
        long j = k03Var.f5297b;
        us1 us1Var = this.f7069l;
        us1Var.getClass();
        y03 y03Var = this.f7068k;
        y03Var.getClass();
        lj1 lj1Var = y03Var.f13267b;
        o62 o62Var3 = this.f7070m;
        o62Var3.getClass();
        float f4 = o62Var3.f7539d;
        float f5 = o62Var3.f7537b;
        o62 o62Var4 = this.f7071n;
        o62Var4.getClass();
        boolean z = this.f7063f;
        boolean z2 = this.f7064g;
        boolean z3 = this.f7065h;
        boolean z4 = this.f7066i;
        CursorAnchorInfo.Builder builder = this.f7072o;
        builder.reset();
        builder.setMatrix(matrix);
        f13 f13Var = k03Var.f5298c;
        int iM1497f = f13.m1497f(j);
        builder.setSelectionRange(iM1497f, f13.m1496e(j));
        c92 c92Var = c92.f1252i;
        if (!z || iM1497f < 0) {
            f = f4;
            f2 = f5;
        } else {
            int iMo2451p = us1Var.mo2451p(iM1497f);
            o62 o62VarM6203c = y03Var.m6203c(iMo2451p);
            f = f4;
            f2 = f5;
            float fM778C = ci0.m778C(o62VarM6203c.f7536a, 0.0f, (int) (y03Var.f13268c >> 32));
            boolean zM4261p = qp0.m4261p(o62Var3, fM778C, o62VarM6203c.f7537b);
            boolean zM4261p2 = qp0.m4261p(o62Var3, fM778C, o62VarM6203c.f7539d);
            boolean z5 = y03Var.m6201a(iMo2451p) == c92Var;
            int i = (zM4261p || zM4261p2) ? 1 : 0;
            if (!zM4261p || !zM4261p2) {
                i |= 2;
            }
            if (z5) {
                i |= 4;
            }
            float f6 = o62VarM6203c.f7537b;
            float f7 = o62VarM6203c.f7539d;
            builder.setInsertionMarkerLocation(fM778C, f6, f7, f7, i);
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
                    float f8 = fArr2[i2];
                    CursorAnchorInfo.Builder builder3 = builder2;
                    float f9 = fArr2[i2 + 1];
                    int i3 = iMo2451p2;
                    float f10 = fArr2[i2 + 2];
                    float f11 = fArr2[i2 + 3];
                    int i4 = iM1496e;
                    int i5 = (o62Var3.f7536a < f10 ? 1 : 0) & (f8 < o62Var3.f7538c ? 1 : 0) & (f2 < f11 ? 1 : 0) & (f9 < f ? 1 : 0);
                    if (!qp0.m4261p(o62Var3, f8, f9) || !qp0.m4261p(o62Var3, f10, f11)) {
                        i5 |= 2;
                    }
                    if (y03Var.m6201a(iMo2451p4) == c92Var) {
                        i5 |= 4;
                    }
                    int i6 = iM1497f2;
                    builder3.addCharacterBounds(i6, f8, f9, f10, f11, i5);
                    builder2 = builder3;
                    iM1497f2 = i6 + 1;
                    iMo2451p2 = i3;
                    iM1496e = i4;
                }
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33 && z3) {
            builder2.setEditorBoundsInfo(AbstractC0117d4.m946h().setEditorBounds(rp0.m4554o0(o62Var4)).setHandwritingBounds(rp0.m4554o0(o62Var4)).build());
        }
        if (i7 >= 34 && z4 && !o62Var3.m3518f()) {
            int i8 = lj1Var.f6151f - 1;
            if (i8 < 0) {
                i8 = 0;
            }
            int iM779D = ci0.m779D(lj1Var.m2918e(f2), 0, i8);
            int iM779D2 = ci0.m779D(lj1Var.m2918e(f), 0, i8);
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
        sz0Var.m5033F().updateCursorAnchorInfo(view, builder2.build());
        this.f7062e = false;
    }
}
