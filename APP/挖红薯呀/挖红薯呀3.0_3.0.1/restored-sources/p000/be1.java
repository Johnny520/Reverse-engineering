package p000;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class be1 {

    /* JADX INFO: renamed from: b */
    public static final be1 f502b;

    /* JADX INFO: renamed from: a */
    public final yd1 f503a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        if (Build.VERSION.SDK_INT >= 34) {
            f502b = wd1.f7113j;
        } else {
            f502b = ud1.f6202i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public be1(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.f503a = new xd1(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.f503a = new wd1(this, windowInsets);
        } else if (i >= 31) {
            this.f503a = new vd1(this, windowInsets);
        } else {
            this.f503a = new ud1(this, windowInsets);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static i20 m351a(i20 i20Var, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, i20Var.f2404a - i);
        int iMax2 = Math.max(0, i20Var.f2405b - i2);
        int iMax3 = Math.max(0, i20Var.f2406c - i3);
        int iMax4 = Math.max(0, i20Var.f2407d - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? i20Var : i20.m1512a(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static be1 m352b(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        be1 be1Var = new be1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int i = kc1.f3078a;
            be1 be1VarM1298a = hc1.m1298a(view);
            yd1 yd1Var = be1Var.f503a;
            yd1Var.mo3229t(be1VarM1298a);
            View rootView = view.getRootView();
            yd1Var.mo4316d(rootView);
            yd1Var.mo3224l(rootView);
            yd1Var.mo3225m();
            yd1Var.mo3230u(view.getWindowSystemUiVisibility());
        }
        return be1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof be1) {
            return Objects.equals(this.f503a, ((be1) obj).f503a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        yd1 yd1Var = this.f503a;
        if (yd1Var == null) {
            return 0;
        }
        return yd1Var.hashCode();
    }

    public be1() {
        this.f503a = new yd1(this);
    }
}
