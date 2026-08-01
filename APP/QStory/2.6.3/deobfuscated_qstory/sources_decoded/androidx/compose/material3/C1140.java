package androidx.compose.material3;

import androidx.compose.ui.graphics.C1599;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1140 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f3279 = C1599.f4697;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1140) {
            return C1599.m2949(this.f3279, ((C1140) obj).f3279);
        }
        return false;
    }

    public final int hashCode() {
        int i = C1599.f4699;
        return Long.hashCode(this.f3279) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) C1599.m2954(this.f3279)) + ", rippleAlpha=null)";
    }
}
