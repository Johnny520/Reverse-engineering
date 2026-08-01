package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;
import p180.C8494;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3058 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C3058 f6865;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3071 f6866;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            f6865 = C3069.f6875;
        } else if (i >= 30) {
            f6865 = C3074.f6881;
        } else {
            f6865 = C3071.f6876;
        }
    }

    public C3058(C3058 c3058) {
        if (c3058 == null) {
            this.f6866 = new C3071(this);
            return;
        }
        C3071 c3071 = c3058.f6866;
        int i = Build.VERSION.SDK_INT;
        if (i >= 35 && (c3071 instanceof C3072)) {
            this.f6866 = new C3072(this, (C3072) c3071);
        } else if (i >= 34 && (c3071 instanceof C3069)) {
            this.f6866 = new C3069(this, (C3069) c3071);
        } else if (i >= 31 && (c3071 instanceof C3070)) {
            this.f6866 = new C3070(this, (C3070) c3071);
        } else if (i >= 30 && (c3071 instanceof C3074)) {
            this.f6866 = new C3074(this, (C3074) c3071);
        } else if (i >= 29 && (c3071 instanceof C3073)) {
            this.f6866 = new C3073(this, (C3073) c3071);
        } else if (i >= 28 && (c3071 instanceof C3052)) {
            this.f6866 = new C3052(this, (C3052) c3071);
        } else if (c3071 instanceof C3051) {
            this.f6866 = new C3051(this, (C3051) c3071);
        } else if (c3071 instanceof C3055) {
            this.f6866 = new C3055(this, (C3055) c3071);
        } else {
            this.f6866 = new C3071(this);
        }
        c3071.mo4600(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C8494 m4622(C8494 c8494, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, c8494.f21155 - i);
        int iMax2 = Math.max(0, c8494.f21154 - i2);
        int iMax3 = Math.max(0, c8494.f21153 - i3);
        int iMax4 = Math.max(0, c8494.f21152 - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? c8494 : C8494.m13498(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C3058 m4623(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C3058 c3058 = new C3058(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = AbstractC3103.f6939;
            C3058 c3058M4553 = AbstractC3022.m4553(view);
            C3071 c3071 = c3058.f6866;
            c3071.mo4597(c3058M4553);
            View rootView = view.getRootView();
            c3071.mo4601(rootView);
            c3071.mo4610(rootView);
            c3071.mo4608();
            c3071.mo4596(view.getWindowSystemUiVisibility());
        }
        return c3058;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3058) {
            return Objects.equals(this.f6866, ((C3058) obj).f6866);
        }
        return false;
    }

    public final int hashCode() {
        C3071 c3071 = this.f6866;
        if (c3071 == null) {
            return 0;
        }
        return c3071.hashCode();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C3058 m4624(int i, int i2, int i3, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        AbstractC3056 c3053 = i5 >= 36 ? new C3053(this) : i5 >= 35 ? new C3054(this) : i5 >= 34 ? new C3066(this) : i5 >= 31 ? new C3065(this) : i5 >= 30 ? new C3068(this) : i5 >= 29 ? new C3067(this) : new C3064(this);
        c3053.mo4618(C8494.m13498(i, i2, i3, i4));
        return c3053.mo4616();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int m4625() {
        return this.f6866.mo4607().f21154;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m4626() {
        return this.f6866.mo4607().f21153;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m4627() {
        return this.f6866.mo4607().f21155;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m4628() {
        return this.f6866.mo4607().f21152;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final WindowInsets m4629() {
        C3071 c3071 = this.f6866;
        if (c3071 instanceof C3055) {
            return ((C3055) c3071).f6853;
        }
        return null;
    }

    public C3058(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.f6866 = new C3072(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.f6866 = new C3069(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.f6866 = new C3070(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.f6866 = new C3074(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f6866 = new C3073(this, windowInsets);
        } else if (i >= 28) {
            this.f6866 = new C3052(this, windowInsets);
        } else {
            this.f6866 = new C3051(this, windowInsets);
        }
    }
}
