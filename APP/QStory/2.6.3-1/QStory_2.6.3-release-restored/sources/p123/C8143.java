package p123;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8143 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f19849;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public long f19850;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8143)) {
            return false;
        }
        C8143 c8143 = (C8143) obj;
        return this.f19850 == c8143.f19850 && Float.compare(this.f19849, c8143.f19849) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19849) + (Long.hashCode(this.f19850) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.f19850);
        sb.append(", dataPoint=");
        return AbstractC0900.m715(sb, this.f19849, ')');
    }
}
