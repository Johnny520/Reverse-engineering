package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cf3 {
    public static final cf3 b;
    public final ye3 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b = we3.x;
        } else if (i >= 30) {
            b = ue3.w;
        } else {
            b = ye3.b;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public cf3(cf3 cf3Var) {
        if (cf3Var == null) {
            this.a = new ye3(this);
            return;
        }
        ye3 ye3Var = cf3Var.a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 35 && (ye3Var instanceof xe3)) {
            this.a = new xe3(this, (xe3) ye3Var);
        } else if (i >= 34 && (ye3Var instanceof we3)) {
            this.a = new we3(this, (we3) ye3Var);
        } else if (i >= 31 && (ye3Var instanceof ve3)) {
            this.a = new ve3(this, (ve3) ye3Var);
        } else if (i >= 30 && (ye3Var instanceof ue3)) {
            this.a = new ue3(this, (ue3) ye3Var);
        } else if (i >= 29 && (ye3Var instanceof te3)) {
            this.a = new te3(this, (te3) ye3Var);
        } else if (i >= 28 && (ye3Var instanceof se3)) {
            this.a = new se3(this, (se3) ye3Var);
        } else if (ye3Var instanceof re3) {
            this.a = new re3(this, (re3) ye3Var);
        } else if (ye3Var instanceof qe3) {
            this.a = new qe3(this, (qe3) ye3Var);
        } else {
            this.a = new ye3(this);
        }
        ye3Var.e(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static zz0 a(zz0 zz0Var, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, zz0Var.a - i);
        int iMax2 = Math.max(0, zz0Var.b - i2);
        int iMax3 = Math.max(0, zz0Var.c - i3);
        int iMax4 = Math.max(0, zz0Var.d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? zz0Var : zz0.b(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static cf3 c(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        cf3 cf3Var = new cf3(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int i = wa3.a;
            cf3 cf3VarA = sa3.a(view);
            ye3 ye3Var = cf3Var.a;
            ye3Var.y(cf3VarA);
            View rootView = view.getRootView();
            ye3Var.d(rootView);
            ye3Var.p(rootView);
            ye3Var.q();
            ye3Var.A(view.getWindowSystemUiVisibility());
        }
        return cf3Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final WindowInsets b() {
        ye3 ye3Var = this.a;
        if (ye3Var instanceof qe3) {
            return ((qe3) ye3Var).c;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cf3) {
            return Objects.equals(this.a, ((cf3) obj).a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        ye3 ye3Var = this.a;
        if (ye3Var == null) {
            return 0;
        }
        return ye3Var.hashCode();
    }

    public cf3(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new xe3(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.a = new we3(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.a = new ve3(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.a = new ue3(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.a = new te3(this, windowInsets);
        } else if (i >= 28) {
            this.a = new se3(this, windowInsets);
        } else {
            this.a = new re3(this, windowInsets);
        }
    }
}
