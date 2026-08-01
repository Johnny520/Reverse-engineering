package p317;

import android.animation.TimeInterpolator;
import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: 飘花落叶言楪苏子哲世兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8670 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f24458;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f24459;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public TimeInterpolator f24460;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public long f24461;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public long f24462;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8670)) {
            return false;
        }
        C8670 c8670 = (C8670) obj;
        if (this.f24462 == c8670.f24462 && this.f24461 == c8670.f24461 && this.f24459 == c8670.f24459 && this.f24458 == c8670.f24458) {
            return m14393().getClass().equals(c8670.m14393().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f24462;
        long j2 = this.f24461;
        return ((((m14393().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.f24459) * 31) + this.f24458;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(C8670.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f24462);
        sb.append(" duration: ");
        sb.append(this.f24461);
        sb.append(" interpolator: ");
        sb.append(m14393().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f24459);
        sb.append(" repeatMode: ");
        return AbstractC0053.m147(sb, "}\n", this.f24458);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TimeInterpolator m14393() {
        TimeInterpolator timeInterpolator = this.f24460;
        return timeInterpolator != null ? timeInterpolator : AbstractC8672.f24467;
    }
}
