package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class t30 {
    public final b7 a;
    public final b5 b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public k03 j;
    public y03 k;
    public us1 l;
    public o62 n;
    public o62 o;
    public final Object c = new Object();
    public in0 m = v6.D;
    public final CursorAnchorInfo.Builder p = new CursorAnchorInfo.Builder();
    public final float[] q = hf1.a();
    public final Matrix r = new Matrix();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public t30(b7 b7Var, b5 b5Var) {
        this.a = b7Var;
        this.b = b5Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        View view;
        b5 b5Var = this.b;
        j71 j71Var = (j71) b5Var.j;
        InputMethodManager inputMethodManager = (InputMethodManager) j71Var.getValue();
        View view2 = (View) b5Var.i;
        if (inputMethodManager.isActive(view2)) {
            in0 in0Var = this.m;
            float[] fArr = this.q;
            in0Var.j(new hf1(fArr));
            this.a.t(fArr);
            Matrix matrix = this.r;
            ci0.U(matrix, fArr);
            k03 k03Var = this.j;
            k03Var.getClass();
            long j = k03Var.b;
            us1 us1Var = this.l;
            us1Var.getClass();
            y03 y03Var = this.k;
            y03Var.getClass();
            lj1 lj1Var = y03Var.b;
            o62 o62Var = this.n;
            o62Var.getClass();
            float f = o62Var.d;
            float f2 = o62Var.b;
            o62 o62Var2 = this.o;
            o62Var2.getClass();
            boolean z = this.f;
            boolean z2 = this.g;
            boolean z3 = this.h;
            boolean z4 = this.i;
            CursorAnchorInfo.Builder builder = this.p;
            builder.reset();
            builder.setMatrix(matrix);
            f13 f13Var = k03Var.c;
            int iF = f13.f(j);
            builder.setSelectionRange(iF, f13.e(j));
            c92 c92Var = c92.i;
            if (!z || iF < 0) {
                view = view2;
            } else {
                int iP = us1Var.p(iF);
                o62 o62VarC = y03Var.c(iP);
                view = view2;
                float fC = ci0.C(o62VarC.a, 0.0f, (int) (y03Var.c >> 32));
                boolean zT = tl.t(o62Var, fC, o62VarC.b);
                boolean zT2 = tl.t(o62Var, fC, o62VarC.d);
                boolean z5 = y03Var.a(iP) == c92Var;
                int i = (zT || zT2) ? 1 : 0;
                if (!zT || !zT2) {
                    i |= 2;
                }
                if (z5) {
                    i |= 4;
                }
                float f3 = o62VarC.b;
                float f4 = o62VarC.d;
                builder.setInsertionMarkerLocation(fC, f3, f4, f4, i);
            }
            CursorAnchorInfo.Builder builder2 = builder;
            if (z2) {
                int iF2 = f13Var != null ? f13.f(f13Var.a) : -1;
                int iE = f13Var != null ? f13.e(f13Var.a) : -1;
                if (iF2 >= 0 && iF2 < iE) {
                    builder2.setComposingText(iF2, k03Var.a.i.subSequence(iF2, iE));
                    int iP2 = us1Var.p(iF2);
                    int iP3 = us1Var.p(iE);
                    float[] fArr2 = new float[(iP3 - iP2) * 4];
                    lj1Var.a(fg1.i(iP2, iP3), fArr2);
                    while (iF2 < iE) {
                        int iP4 = us1Var.p(iF2);
                        int i2 = (iP4 - iP2) * 4;
                        float f5 = fArr2[i2];
                        CursorAnchorInfo.Builder builder3 = builder2;
                        float f6 = fArr2[i2 + 1];
                        int i3 = iE;
                        float f7 = fArr2[i2 + 2];
                        float f8 = fArr2[i2 + 3];
                        int i4 = iF2;
                        int i5 = (o62Var.a < f7 ? 1 : 0) & (f5 < o62Var.c ? 1 : 0) & (f2 < f8 ? 1 : 0) & (f6 < f ? 1 : 0);
                        if (!tl.t(o62Var, f5, f6) || !tl.t(o62Var, f7, f8)) {
                            i5 |= 2;
                        }
                        if (y03Var.a(iP4) == c92Var) {
                            i5 |= 4;
                        }
                        builder3.addCharacterBounds(i4, f5, f6, f7, f8, i5);
                        builder2 = builder3;
                        iF2 = i4 + 1;
                        iE = i3;
                    }
                }
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 33 && z3) {
                builder2.setEditorBoundsInfo(d4.h().setEditorBounds(rp0.o0(o62Var2)).setHandwritingBounds(rp0.o0(o62Var2)).build());
            }
            if (i6 >= 34 && z4 && !o62Var.f()) {
                int i7 = lj1Var.f - 1;
                if (i7 < 0) {
                    i7 = 0;
                }
                int iD = ci0.D(lj1Var.e(f2), 0, i7);
                int iD2 = ci0.D(lj1Var.e(f), 0, i7);
                if (iD <= iD2) {
                    while (true) {
                        builder2.addVisibleLineBounds(y03Var.d(iD), lj1Var.f(iD), y03Var.e(iD), lj1Var.b(iD));
                        if (iD == iD2) {
                            break;
                        } else {
                            iD++;
                        }
                    }
                }
            }
            ((InputMethodManager) j71Var.getValue()).updateCursorAnchorInfo(view, builder2.build());
            this.e = false;
        }
    }
}
