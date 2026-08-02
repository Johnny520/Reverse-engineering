package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class n91 {
    public final j9 a;
    public final sz0 b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public k03 j;
    public y03 k;
    public us1 l;
    public o62 m;
    public o62 n;
    public final Object c = new Object();
    public final CursorAnchorInfo.Builder o = new CursorAnchorInfo.Builder();
    public final float[] p = hf1.a();
    public final Matrix q = new Matrix();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n91(j9 j9Var, sz0 sz0Var) {
        this.a = j9Var;
        this.b = sz0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        float f;
        float f2;
        sz0 sz0Var = this.b;
        InputMethodManager inputMethodManagerF = sz0Var.F();
        View view = (View) sz0Var.i;
        if (!inputMethodManagerF.isActive(view) || this.j == null || this.l == null || this.k == null || this.m == null || this.n == null) {
            return;
        }
        float[] fArr = this.p;
        hf1.d(fArr);
        c61 c61Var = (c61) this.a.o.y.getValue();
        if (c61Var != null) {
            if (!c61Var.w()) {
                c61Var = null;
            }
            if (c61Var != null) {
                c61Var.C(fArr);
            }
        }
        o62 o62Var = this.n;
        o62Var.getClass();
        float f3 = -o62Var.a;
        o62 o62Var2 = this.n;
        o62Var2.getClass();
        hf1.f(fArr, f3, -o62Var2.b);
        Matrix matrix = this.q;
        ci0.U(matrix, fArr);
        k03 k03Var = this.j;
        k03Var.getClass();
        long j = k03Var.b;
        us1 us1Var = this.l;
        us1Var.getClass();
        y03 y03Var = this.k;
        y03Var.getClass();
        lj1 lj1Var = y03Var.b;
        o62 o62Var3 = this.m;
        o62Var3.getClass();
        float f4 = o62Var3.d;
        float f5 = o62Var3.b;
        o62 o62Var4 = this.n;
        o62Var4.getClass();
        boolean z = this.f;
        boolean z2 = this.g;
        boolean z3 = this.h;
        boolean z4 = this.i;
        CursorAnchorInfo.Builder builder = this.o;
        builder.reset();
        builder.setMatrix(matrix);
        f13 f13Var = k03Var.c;
        int iF = f13.f(j);
        builder.setSelectionRange(iF, f13.e(j));
        c92 c92Var = c92.i;
        if (!z || iF < 0) {
            f = f4;
            f2 = f5;
        } else {
            int iP = us1Var.p(iF);
            o62 o62VarC = y03Var.c(iP);
            f = f4;
            f2 = f5;
            float fC = ci0.C(o62VarC.a, 0.0f, (int) (y03Var.c >> 32));
            boolean zP = qp0.p(o62Var3, fC, o62VarC.b);
            boolean zP2 = qp0.p(o62Var3, fC, o62VarC.d);
            boolean z5 = y03Var.a(iP) == c92Var;
            int i = (zP || zP2) ? 1 : 0;
            if (!zP || !zP2) {
                i |= 2;
            }
            if (z5) {
                i |= 4;
            }
            float f6 = o62VarC.b;
            float f7 = o62VarC.d;
            builder.setInsertionMarkerLocation(fC, f6, f7, f7, i);
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
                    float f8 = fArr2[i2];
                    CursorAnchorInfo.Builder builder3 = builder2;
                    float f9 = fArr2[i2 + 1];
                    int i3 = iP2;
                    float f10 = fArr2[i2 + 2];
                    float f11 = fArr2[i2 + 3];
                    int i4 = iE;
                    int i5 = (o62Var3.a < f10 ? 1 : 0) & (f8 < o62Var3.c ? 1 : 0) & (f2 < f11 ? 1 : 0) & (f9 < f ? 1 : 0);
                    if (!qp0.p(o62Var3, f8, f9) || !qp0.p(o62Var3, f10, f11)) {
                        i5 |= 2;
                    }
                    if (y03Var.a(iP4) == c92Var) {
                        i5 |= 4;
                    }
                    int i6 = iF2;
                    builder3.addCharacterBounds(i6, f8, f9, f10, f11, i5);
                    builder2 = builder3;
                    iF2 = i6 + 1;
                    iP2 = i3;
                    iE = i4;
                }
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33 && z3) {
            builder2.setEditorBoundsInfo(d4.h().setEditorBounds(rp0.o0(o62Var4)).setHandwritingBounds(rp0.o0(o62Var4)).build());
        }
        if (i7 >= 34 && z4 && !o62Var3.f()) {
            int i8 = lj1Var.f - 1;
            if (i8 < 0) {
                i8 = 0;
            }
            int iD = ci0.D(lj1Var.e(f2), 0, i8);
            int iD2 = ci0.D(lj1Var.e(f), 0, i8);
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
        sz0Var.F().updateCursorAnchorInfo(view, builder2.build());
        this.e = false;
    }
}
