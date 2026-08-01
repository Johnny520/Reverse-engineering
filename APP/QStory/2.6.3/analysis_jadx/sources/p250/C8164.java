package p250;

import io.ktor.util.C4211;
import java.math.BigInteger;

/* JADX INFO: renamed from: 飘花落叶言楪兰子苏世哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8164 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public BigInteger f22500;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C8164 m13616(BigInteger bigInteger) {
        C8164 c8164 = new C8164();
        if (bigInteger.signum() >= 0) {
            c8164.f22500 = bigInteger;
            return c8164;
        }
        C4211.m8604(bigInteger, "Attempt to construct ConfigMemorySize with negative number: ");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8164) {
            return ((C8164) obj).f22500.equals(this.f22500);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22500.hashCode();
    }

    public final String toString() {
        return "ConfigMemorySize(" + this.f22500 + ")";
    }
}
