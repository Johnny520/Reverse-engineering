package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ae3 implements View.OnApplyWindowInsetsListener {
    public final wd3 a;
    public cf3 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ae3(View view, wd3 wd3Var) {
        cf3 cf3VarB;
        this.a = wd3Var;
        int i = wa3.a;
        cf3 cf3VarA = sa3.a(view);
        if (cf3VarA != null) {
            int i2 = Build.VERSION.SDK_INT;
            cf3VarB = (i2 >= 36 ? new oe3(cf3VarA) : i2 >= 35 ? new ne3(cf3VarA) : i2 >= 34 ? new me3(cf3VarA) : i2 >= 31 ? new le3(cf3VarA) : i2 >= 30 ? new ke3(cf3VarA) : i2 >= 29 ? new je3(cf3VarA) : new he3(cf3VarA)).b();
        } else {
            cf3VarB = null;
        }
        this.b = cf3VarB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.b = cf3.c(view, windowInsets);
            return be3.j(view, windowInsets);
        }
        cf3 cf3VarC = cf3.c(view, windowInsets);
        ye3 ye3Var = cf3VarC.a;
        if (this.b == null) {
            int i = wa3.a;
            this.b = sa3.a(view);
        }
        if (this.b == null) {
            this.b = cf3VarC;
            return be3.j(view, windowInsets);
        }
        wd3 wd3VarK = be3.k(view);
        if (wd3VarK != null && Objects.equals(wd3VarK.h, cf3VarC)) {
            return be3.j(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        cf3 cf3Var = this.b;
        int i2 = 1;
        while (i2 <= 512) {
            zz0 zz0VarI = ye3Var.i(i2);
            zz0 zz0VarI2 = cf3Var.a.i(i2);
            int i3 = zz0VarI.a;
            int i4 = zz0VarI.d;
            int i5 = zz0VarI.c;
            int i6 = zz0VarI.b;
            int i7 = zz0VarI2.a;
            int i8 = zz0VarI2.d;
            int i9 = zz0VarI2.c;
            int i10 = zz0VarI2.b;
            if (i3 > i7 || i6 > i10 || i5 > i9 || i4 > i8) {
                iArr = iArr2;
                z = true;
            } else {
                iArr = iArr2;
                z = false;
            }
            if (z != (i3 < i7 || i6 < i10 || i5 < i9 || i4 < i8)) {
                if (z) {
                    iArr[0] = iArr[0] | i2;
                } else {
                    iArr3[0] = iArr3[0] | i2;
                }
            }
            i2 <<= 1;
            iArr2 = iArr;
        }
        int i11 = iArr2[0];
        int i12 = iArr3[0];
        int i13 = i11 | i12;
        if (i13 == 0) {
            this.b = cf3VarC;
            return be3.j(view, windowInsets);
        }
        cf3 cf3Var2 = this.b;
        ge3 ge3Var = new ge3(i13, (i11 & 8) != 0 ? be3.e : (i12 & 8) != 0 ? be3.f : (i11 & 519) != 0 ? be3.g : (i12 & 519) != 0 ? be3.h : null, (i13 & 8) != 0 ? 160L : 250L);
        ge3Var.a.e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(ge3Var.a.b());
        zz0 zz0VarI3 = ye3Var.i(i13);
        zz0 zz0VarI4 = cf3Var2.a.i(i13);
        int iMin = Math.min(zz0VarI3.a, zz0VarI4.a);
        int i14 = zz0VarI3.b;
        int i15 = zz0VarI4.b;
        int iMin2 = Math.min(i14, i15);
        int i16 = zz0VarI3.c;
        int i17 = zz0VarI4.c;
        int iMin3 = Math.min(i16, i17);
        int i18 = zz0VarI3.d;
        int i19 = zz0VarI4.d;
        dq1 dq1Var = new dq1(21, zz0.b(iMin, iMin2, iMin3, Math.min(i18, i19)), zz0.b(Math.max(zz0VarI3.a, zz0VarI4.a), Math.max(i14, i15), Math.max(i16, i17), Math.max(i18, i19)));
        be3.g(view, ge3Var, cf3VarC, false);
        duration.addUpdateListener(new xd3(ge3Var, cf3VarC, cf3Var2, i13, view));
        duration.addListener(new yd3(ge3Var, view));
        xt1 xt1Var = new xt1(view, new zd3(view, ge3Var, dq1Var, duration));
        view.getViewTreeObserver().addOnPreDrawListener(xt1Var);
        view.addOnAttachStateChangeListener(xt1Var);
        this.b = cf3VarC;
        return be3.j(view, windowInsets);
    }
}
