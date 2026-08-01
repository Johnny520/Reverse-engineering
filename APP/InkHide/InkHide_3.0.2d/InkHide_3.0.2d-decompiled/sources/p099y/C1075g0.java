package p099y;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;
import p085r.C0811c;

/* JADX INFO: renamed from: y.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1075g0 {

    /* JADX INFO: renamed from: b */
    public static final C1075g0 f3704b;

    /* JADX INFO: renamed from: a */
    public final C1073f0 f3705a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f3704b = C1071e0.f3700l;
        } else {
            f3704b = C1073f0.f3701b;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1075g0(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f3705a = new C1071e0(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.f3705a = new C1067c0(this, windowInsets);
        } else if (i2 >= 28) {
            this.f3705a = new C1065b0(this, windowInsets);
        } else {
            this.f3705a = new C1063a0(this, windowInsets);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C0811c m2341a(C0811c c0811c, int i2, int i3, int i4, int i5) {
        int iMax = Math.max(0, c0811c.f2712a - i2);
        int iMax2 = Math.max(0, c0811c.f2713b - i3);
        int iMax3 = Math.max(0, c0811c.f2714c - i4);
        int iMax4 = Math.max(0, c0811c.f2715d - i5);
        return (iMax == i2 && iMax2 == i3 && iMax3 == i4 && iMax4 == i5) ? c0811c : C0811c.m1479a(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static C1075g0 m2342c(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        C1075g0 c1075g0 = new C1075g0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = AbstractC1048L.f3662a;
            C1075g0 c1075g0M2252a = AbstractC1039C.m2252a(view);
            C1073f0 c1073f0 = c1075g0.f3705a;
            c1073f0.mo2320l(c1075g0M2252a);
            c1073f0.mo2315d(view.getRootView());
        }
        return c1075g0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final WindowInsets m2343b() {
        C1073f0 c1073f0 = this.f3705a;
        if (c1073f0 instanceof AbstractC1061Z) {
            return ((AbstractC1061Z) c1073f0).f3686c;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1075g0)) {
            return false;
        }
        return Objects.equals(this.f3705a, ((C1075g0) obj).f3705a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        C1073f0 c1073f0 = this.f3705a;
        if (c1073f0 == null) {
            return 0;
        }
        return c1073f0.hashCode();
    }

    public C1075g0() {
        this.f3705a = new C1073f0(this);
    }
}
