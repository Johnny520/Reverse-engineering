package p317;

import android.animation.TimeInterpolator;
import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: 飘花落叶言楪苏子哲世兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8678 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f24466;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f24467;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public TimeInterpolator f24468;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long f24469;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public long f24470;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8678)) {
            return false;
        }
        C8678 c8678 = (C8678) obj;
        if (this.f24470 == c8678.f24470 && this.f24469 == c8678.f24469 && this.f24467 == c8678.f24467 && this.f24466 == c8678.f24466) {
            return m14373().getClass().equals(c8678.m14373().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f24470;
        long j2 = this.f24469;
        return ((((m14373().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.f24467) * 31) + this.f24466;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(C8678.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f24470);
        sb.append(" duration: ");
        sb.append(this.f24469);
        sb.append(" interpolator: ");
        sb.append(m14373().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f24467);
        sb.append(" repeatMode: ");
        return AbstractC0053.m147(sb, "}\n", this.f24466);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TimeInterpolator m14373() {
        TimeInterpolator timeInterpolator = this.f24468;
        return timeInterpolator != null ? timeInterpolator : AbstractC8680.f24475;
    }
}
