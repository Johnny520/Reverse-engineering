package p000;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cf3 {

    /* JADX INFO: renamed from: b */
    public static final cf3 f1517b;

    /* JADX INFO: renamed from: a */
    public final ye3 f1518a;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            f1517b = we3.f12478x;
        } else if (i >= 30) {
            f1517b = ue3.f11263w;
        } else {
            f1517b = ye3.f13431b;
        }
    }

    public cf3(cf3 cf3Var) {
        if (cf3Var == null) {
            this.f1518a = new ye3(this);
            return;
        }
        ye3 ye3Var = cf3Var.f1518a;
        int i = Build.VERSION.SDK_INT;
        if (i >= 35 && (ye3Var instanceof xe3)) {
            this.f1518a = new xe3(this, (xe3) ye3Var);
        } else if (i >= 34 && (ye3Var instanceof we3)) {
            this.f1518a = new we3(this, (we3) ye3Var);
        } else if (i >= 31 && (ye3Var instanceof ve3)) {
            this.f1518a = new ve3(this, (ve3) ye3Var);
        } else if (i >= 30 && (ye3Var instanceof ue3)) {
            this.f1518a = new ue3(this, (ue3) ye3Var);
        } else if (i >= 29 && (ye3Var instanceof te3)) {
            this.f1518a = new te3(this, (te3) ye3Var);
        } else if (i >= 28 && (ye3Var instanceof se3)) {
            this.f1518a = new se3(this, (se3) ye3Var);
        } else if (ye3Var instanceof re3) {
            this.f1518a = new re3(this, (re3) ye3Var);
        } else if (ye3Var instanceof qe3) {
            this.f1518a = new qe3(this, (qe3) ye3Var);
        } else {
            this.f1518a = new ye3(this);
        }
        ye3Var.mo4162e(this);
    }

    /* JADX INFO: renamed from: a */
    public static zz0 m768a(zz0 zz0Var, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, zz0Var.f14157a - i);
        int iMax2 = Math.max(0, zz0Var.f14158b - i2);
        int iMax3 = Math.max(0, zz0Var.f14159c - i3);
        int iMax4 = Math.max(0, zz0Var.f14160d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? zz0Var : zz0.m6518b(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX INFO: renamed from: c */
    public static cf3 m769c(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        cf3 cf3Var = new cf3(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int i = wa3.f12444a;
            cf3 cf3VarM4780a = sa3.m4780a(view);
            ye3 ye3Var = cf3Var.f1518a;
            ye3Var.mo4176y(cf3VarM4780a);
            View rootView = view.getRootView();
            ye3Var.mo4161d(rootView);
            ye3Var.mo4168p(rootView);
            ye3Var.mo4169q();
            ye3Var.mo4156A(view.getWindowSystemUiVisibility());
        }
        return cf3Var;
    }

    /* JADX INFO: renamed from: b */
    public final WindowInsets m770b() {
        ye3 ye3Var = this.f1518a;
        if (ye3Var instanceof qe3) {
            return ((qe3) ye3Var).f8938c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cf3) {
            return Objects.equals(this.f1518a, ((cf3) obj).f1518a);
        }
        return false;
    }

    public final int hashCode() {
        ye3 ye3Var = this.f1518a;
        if (ye3Var == null) {
            return 0;
        }
        return ye3Var.hashCode();
    }

    public cf3(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.f1518a = new xe3(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.f1518a = new we3(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.f1518a = new ve3(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.f1518a = new ue3(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f1518a = new te3(this, windowInsets);
        } else if (i >= 28) {
            this.f1518a = new se3(this, windowInsets);
        } else {
            this.f1518a = new re3(this, windowInsets);
        }
    }
}
