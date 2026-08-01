package p228;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8771 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f22329;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f22330;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f22331;

    public C8771(int i, int i2, boolean z) {
        this.f22331 = i;
        this.f22330 = i2;
        this.f22329 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8771)) {
            return false;
        }
        C8771 c8771 = (C8771) obj;
        return this.f22331 == c8771.f22331 && this.f22330 == c8771.f22330 && this.f22329 == c8771.f22329;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22329) + AbstractC0900.m704(this.f22330, Integer.hashCode(this.f22331) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BidiRun(start=");
        sb.append(this.f22331);
        sb.append(", end=");
        sb.append(this.f22330);
        sb.append(", isRtl=");
        return AbstractC0900.m712(sb, this.f22329, ')');
    }
}
