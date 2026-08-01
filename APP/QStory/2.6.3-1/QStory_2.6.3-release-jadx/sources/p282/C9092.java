package p282;

import java.util.HashMap;
import p279.C9084;

/* JADX INFO: renamed from: 飘花落叶言楪哲兰苏子世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9092 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C9084 f23221;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final double f23222;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final double f23223;

    public C9092(double d, double d2, C9084 c9084) {
        this.f23223 = d;
        this.f23222 = d2;
        this.f23221 = c9084;
        new HashMap();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9092)) {
            return false;
        }
        C9092 c9092 = (C9092) obj;
        return Double.compare(this.f23223, c9092.f23223) == 0 && Double.compare(this.f23222, c9092.f23222) == 0 && this.f23221.equals(c9092.f23221);
    }

    public final int hashCode() {
        return ((Double.hashCode(this.f23222) + (Double.hashCode(this.f23223) * 31)) * 31) + this.f23221.f23202;
    }

    public final String toString() {
        return "TonalPalette(hue=" + this.f23223 + ", chroma=" + this.f23222 + ", keyColor=" + this.f23221 + ")";
    }
}
