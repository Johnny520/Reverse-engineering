package p266;

import java.util.HashMap;
import p263.C8255;

/* JADX INFO: renamed from: 飘花落叶言楪哲兰苏子世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8263 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8255 f22876;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final double f22877;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final double f22878;

    public C8263(double d, double d2, C8255 c8255) {
        this.f22878 = d;
        this.f22877 = d2;
        this.f22876 = c8255;
        new HashMap();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8263)) {
            return false;
        }
        C8263 c8263 = (C8263) obj;
        return Double.compare(this.f22878, c8263.f22878) == 0 && Double.compare(this.f22877, c8263.f22877) == 0 && this.f22876.equals(c8263.f22876);
    }

    public final int hashCode() {
        return ((Double.hashCode(this.f22877) + (Double.hashCode(this.f22878) * 31)) * 31) + this.f22876.f22857;
    }

    public final String toString() {
        return "TonalPalette(hue=" + this.f22878 + ", chroma=" + this.f22877 + ", keyColor=" + this.f22876 + ")";
    }
}
