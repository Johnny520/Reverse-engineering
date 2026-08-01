package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;
import p164.C7665;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2225 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C2225 f6520;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2238 f6521;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            f6520 = C2236.f6530;
        } else if (i >= 30) {
            f6520 = C2241.f6536;
        } else {
            f6520 = C2238.f6531;
        }
    }

    public C2225(C2225 c2225) {
        if (c2225 == null) {
            this.f6521 = new C2238(this);
            return;
        }
        C2238 c2238 = c2225.f6521;
        int i = Build.VERSION.SDK_INT;
        if (i >= 35 && (c2238 instanceof C2239)) {
            this.f6521 = new C2239(this, (C2239) c2238);
        } else if (i >= 34 && (c2238 instanceof C2236)) {
            this.f6521 = new C2236(this, (C2236) c2238);
        } else if (i >= 31 && (c2238 instanceof C2237)) {
            this.f6521 = new C2237(this, (C2237) c2238);
        } else if (i >= 30 && (c2238 instanceof C2241)) {
            this.f6521 = new C2241(this, (C2241) c2238);
        } else if (i >= 29 && (c2238 instanceof C2240)) {
            this.f6521 = new C2240(this, (C2240) c2238);
        } else if (i >= 28 && (c2238 instanceof C2219)) {
            this.f6521 = new C2219(this, (C2219) c2238);
        } else if (c2238 instanceof C2218) {
            this.f6521 = new C2218(this, (C2218) c2238);
        } else if (c2238 instanceof C2222) {
            this.f6521 = new C2222(this, (C2222) c2238);
        } else {
            this.f6521 = new C2238(this);
        }
        c2238.mo4040(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C7665 m4062(C7665 c7665, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, c7665.f20810 - i);
        int iMax2 = Math.max(0, c7665.f20809 - i2);
        int iMax3 = Math.max(0, c7665.f20808 - i3);
        int iMax4 = Math.max(0, c7665.f20807 - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? c7665 : C7665.m12939(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C2225 m4063(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C2225 c2225 = new C2225(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = AbstractC2270.f6594;
            C2225 c2225M3993 = AbstractC2189.m3993(view);
            C2238 c2238 = c2225.f6521;
            c2238.mo4037(c2225M3993);
            View rootView = view.getRootView();
            c2238.mo4041(rootView);
            c2238.mo4050(rootView);
            c2238.mo4048();
            c2238.mo4036(view.getWindowSystemUiVisibility());
        }
        return c2225;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2225) {
            return Objects.equals(this.f6521, ((C2225) obj).f6521);
        }
        return false;
    }

    public final int hashCode() {
        C2238 c2238 = this.f6521;
        if (c2238 == null) {
            return 0;
        }
        return c2238.hashCode();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C2225 m4064(int i, int i2, int i3, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        AbstractC2223 c2220 = i5 >= 36 ? new C2220(this) : i5 >= 35 ? new C2221(this) : i5 >= 34 ? new C2233(this) : i5 >= 31 ? new C2232(this) : i5 >= 30 ? new C2235(this) : i5 >= 29 ? new C2234(this) : new C2231(this);
        c2220.mo4058(C7665.m12939(i, i2, i3, i4));
        return c2220.mo4056();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m4065() {
        return this.f6521.mo4047().f20809;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m4066() {
        return this.f6521.mo4047().f20808;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m4067() {
        return this.f6521.mo4047().f20810;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m4068() {
        return this.f6521.mo4047().f20807;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final WindowInsets m4069() {
        C2238 c2238 = this.f6521;
        if (c2238 instanceof C2222) {
            return ((C2222) c2238).f6508;
        }
        return null;
    }

    public C2225(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.f6521 = new C2239(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.f6521 = new C2236(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.f6521 = new C2237(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.f6521 = new C2241(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f6521 = new C2240(this, windowInsets);
        } else if (i >= 28) {
            this.f6521 = new C2219(this, windowInsets);
        } else {
            this.f6521 = new C2218(this, windowInsets);
        }
    }
}
