package androidx.compose.material3;

import androidx.compose.p001ui.graphics.C2434;

/* JADX INFO: renamed from: androidx.compose.material3.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1975 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f3624 = C2434.f5042;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1975) {
            return C2434.m3509(this.f3624, ((C1975) obj).f3624);
        }
        return false;
    }

    public final int hashCode() {
        int i = C2434.f5044;
        return Long.hashCode(this.f3624) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) C2434.m3514(this.f3624)) + ", rippleAlpha=null)";
    }
}
