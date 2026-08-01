package p107;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7314 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public float f19504;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public long f19505;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7314)) {
            return false;
        }
        C7314 c7314 = (C7314) obj;
        return this.f19505 == c7314.f19505 && Float.compare(this.f19504, c7314.f19504) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19504) + (Long.hashCode(this.f19505) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataPointAtTime(time=");
        sb.append(this.f19505);
        sb.append(", dataPoint=");
        return AbstractC0053.m155(sb, this.f19504, ')');
    }
}
