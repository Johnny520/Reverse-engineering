package androidx.core.view;

import android.os.Build;
import android.view.DisplayCutout;
import p164.C7665;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2254 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final DisplayCutout f6561;

    public C2254(DisplayCutout displayCutout) {
        this.f6561 = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2254.class != obj.getClass()) {
            return false;
        }
        return this.f6561.equals(((C2254) obj).f6561);
    }

    public final int hashCode() {
        return this.f6561.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f6561 + "}";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7665 m4212() {
        return Build.VERSION.SDK_INT >= 30 ? C7665.m12938(AbstractC2263.m4223(this.f6561)) : C7665.f20806;
    }
}
