package p221;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8732 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f22217;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final float m13912(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final float m13913(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8732) {
            return this.f22217 == ((C8732) obj).f22217;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22217);
    }

    public final String toString() {
        long j = this.f22217;
        if (j == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) C8722.m13876(m13912(j))) + " x " + ((Object) C8722.m13876(m13913(j)));
    }
}
