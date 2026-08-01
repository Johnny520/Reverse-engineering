package androidx.compose.material3;

import androidx.compose.ui.graphics.C1599;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1140 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f3278 = C1599.f4696;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1140) {
            return C1599.m2939(this.f3278, ((C1140) obj).f3278);
        }
        return false;
    }

    public final int hashCode() {
        int i = C1599.f4698;
        return Long.hashCode(this.f3278) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) C1599.m2944(this.f3278)) + ", rippleAlpha=null)";
    }
}
