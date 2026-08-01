package p266;

import io.ktor.util.C5043;
import java.math.BigInteger;

/* JADX INFO: renamed from: 飘花落叶言楪兰子苏世哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8993 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public BigInteger f22845;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C8993 m14175(BigInteger bigInteger) {
        C8993 c8993 = new C8993();
        if (bigInteger.signum() >= 0) {
            c8993.f22845 = bigInteger;
            return c8993;
        }
        C5043.m9163(bigInteger, "Attempt to construct ConfigMemorySize with negative number: ");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8993) {
            return ((C8993) obj).f22845.equals(this.f22845);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22845.hashCode();
    }

    public final String toString() {
        return "ConfigMemorySize(" + this.f22845 + ")";
    }
}
