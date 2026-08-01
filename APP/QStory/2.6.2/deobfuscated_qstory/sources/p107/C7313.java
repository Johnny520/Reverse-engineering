package p107;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7313 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f19509;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public long f19510;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7313)) {
            return false;
        }
        C7313 c7313 = (C7313) obj;
        return this.f19510 == c7313.f19510 && Float.compare(this.f19509, c7313.f19509) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19509) + (Long.hashCode(this.f19510) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.f19510);
        sb.append(", dataPoint=");
        return AbstractC0053.m157(sb, this.f19509, ')');
    }
}
