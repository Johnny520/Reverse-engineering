package androidx.core.view;

import android.os.Build;
import android.view.DisplayCutout;
import p164.C7664;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2254 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final DisplayCutout f6560;

    public C2254(DisplayCutout displayCutout) {
        this.f6560 = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2254.class != obj.getClass()) {
            return false;
        }
        return this.f6560.equals(((C2254) obj).f6560);
    }

    public final int hashCode() {
        return this.f6560.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f6560 + "}";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7664 m4202() {
        return Build.VERSION.SDK_INT >= 30 ? C7664.m12909(AbstractC2263.m4213(this.f6560)) : C7664.f20811;
    }
}
