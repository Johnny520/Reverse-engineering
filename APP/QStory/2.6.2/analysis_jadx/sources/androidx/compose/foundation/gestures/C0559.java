package androidx.compose.foundation.gestures;

import androidx.activity.AbstractC0053;
import p112.C7328;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0559 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f1607;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f1608;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f1609;

    public C0559(long j, long j2, boolean z) {
        this.f1609 = j;
        this.f1608 = j2;
        this.f1607 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0559)) {
            return false;
        }
        C0559 c0559 = (C0559) obj;
        return C7328.m12501(this.f1609, c0559.f1609) && this.f1608 == c0559.f1608 && this.f1607 == c0559.f1607;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1607) + AbstractC0053.m141(Long.hashCode(this.f1609) * 31, 31, this.f1608);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MouseWheelScrollDelta(value=");
        sb.append((Object) C7328.m12504(this.f1609));
        sb.append(", timeMillis=");
        sb.append(this.f1608);
        sb.append(", shouldApplyImmediately=");
        return AbstractC0053.m150(sb, this.f1607, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0559 m1342(C0559 c0559) {
        return new C0559(C7328.m12498(this.f1609, c0559.f1609), Math.max(this.f1608, c0559.f1608), this.f1607);
    }
}
