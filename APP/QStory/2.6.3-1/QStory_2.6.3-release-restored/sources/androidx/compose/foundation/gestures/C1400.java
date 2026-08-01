package androidx.compose.foundation.gestures;

import androidx.activity.AbstractC0900;
import p128.C8158;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1400 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f1953;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f1954;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f1955;

    public C1400(long j, long j2, boolean z) {
        this.f1955 = j;
        this.f1954 = j2;
        this.f1953 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1400)) {
            return false;
        }
        C1400 c1400 = (C1400) obj;
        return C8158.m13087(this.f1955, c1400.f1955) && this.f1954 == c1400.f1954 && this.f1953 == c1400.f1953;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1953) + AbstractC0900.m702(Long.hashCode(this.f1955) * 31, 31, this.f1954);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MouseWheelScrollDelta(value=");
        sb.append((Object) C8158.m13090(this.f1955));
        sb.append(", timeMillis=");
        sb.append(this.f1954);
        sb.append(", shouldApplyImmediately=");
        return AbstractC0900.m712(sb, this.f1953, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1400 m1912(C1400 c1400) {
        return new C1400(C8158.m13084(this.f1955, c1400.f1955), Math.max(this.f1954, c1400.f1954), this.f1953);
    }
}
