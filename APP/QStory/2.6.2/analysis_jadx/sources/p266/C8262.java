package p266;

import java.util.HashMap;
import p263.C8254;

/* JADX INFO: renamed from: 飘花落叶言楪哲兰苏子世.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8262 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8254 f22877;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final double f22878;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final double f22879;

    public C8262(double d, double d2, C8254 c8254) {
        this.f22879 = d;
        this.f22878 = d2;
        this.f22877 = c8254;
        new HashMap();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8262)) {
            return false;
        }
        C8262 c8262 = (C8262) obj;
        return Double.compare(this.f22879, c8262.f22879) == 0 && Double.compare(this.f22878, c8262.f22878) == 0 && this.f22877.equals(c8262.f22877);
    }

    public final int hashCode() {
        return ((Double.hashCode(this.f22878) + (Double.hashCode(this.f22879) * 31)) * 31) + this.f22877.f22858;
    }

    public final String toString() {
        return "TonalPalette(hue=" + this.f22879 + ", chroma=" + this.f22878 + ", keyColor=" + this.f22877 + ")";
    }
}
