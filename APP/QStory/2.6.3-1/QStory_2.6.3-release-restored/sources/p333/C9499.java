package p333;

import android.animation.TimeInterpolator;
import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: 飘花落叶言楪苏子哲世兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9499 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f24803;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f24804;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public TimeInterpolator f24805;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long f24806;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public long f24807;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9499)) {
            return false;
        }
        C9499 c9499 = (C9499) obj;
        if (this.f24807 == c9499.f24807 && this.f24806 == c9499.f24806 && this.f24804 == c9499.f24804 && this.f24803 == c9499.f24803) {
            return m14952().getClass().equals(c9499.m14952().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f24807;
        long j2 = this.f24806;
        return ((((m14952().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.f24804) * 31) + this.f24803;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(C9499.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f24807);
        sb.append(" duration: ");
        sb.append(this.f24806);
        sb.append(" interpolator: ");
        sb.append(m14952().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f24804);
        sb.append(" repeatMode: ");
        return AbstractC0900.m707(sb, "}\n", this.f24803);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TimeInterpolator m14952() {
        TimeInterpolator timeInterpolator = this.f24805;
        return timeInterpolator != null ? timeInterpolator : AbstractC9501.f24812;
    }
}
