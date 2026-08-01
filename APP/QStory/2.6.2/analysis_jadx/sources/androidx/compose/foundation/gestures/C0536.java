package androidx.compose.foundation.gestures;

import androidx.activity.AbstractC0053;
import p112.C7328;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0536 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f1559;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f1560;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float f1561;

    public C0536(float f, float f2, long j) {
        this.f1561 = f;
        this.f1560 = j;
        this.f1559 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0536)) {
            return false;
        }
        C0536 c0536 = (C0536) obj;
        return Float.compare(this.f1561, c0536.f1561) == 0 && C7328.m12501(this.f1560, c0536.f1560) && Float.compare(this.f1559, c0536.f1559) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f1559) + AbstractC0053.m141(Float.hashCode(this.f1561) * 31, 31, this.f1560);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationData(zoom=");
        sb.append(this.f1561);
        sb.append(", offset=");
        sb.append((Object) C7328.m12504(this.f1560));
        sb.append(", degrees=");
        return AbstractC0053.m157(sb, this.f1559, ')');
    }
}
