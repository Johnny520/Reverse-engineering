package p250;

import io.ktor.util.C4210;
import java.math.BigInteger;

/* JADX INFO: renamed from: 飘花落叶言楪兰子苏世哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8163 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public BigInteger f22502;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C8163 m13587(BigInteger bigInteger) {
        C8163 c8163 = new C8163();
        if (bigInteger.signum() >= 0) {
            c8163.f22502 = bigInteger;
            return c8163;
        }
        C4210.m8614(bigInteger, "Attempt to construct ConfigMemorySize with negative number: ");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8163) {
            return ((C8163) obj).f22502.equals(this.f22502);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22502.hashCode();
    }

    public final String toString() {
        return "ConfigMemorySize(" + this.f22502 + ")";
    }
}
