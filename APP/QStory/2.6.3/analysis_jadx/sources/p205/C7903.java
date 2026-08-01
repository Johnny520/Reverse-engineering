package p205;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7903 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f21872;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final float m13353(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final float m13354(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7903) {
            return this.f21872 == ((C7903) obj).f21872;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21872);
    }

    public final String toString() {
        long j = this.f21872;
        if (j == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) C7893.m13317(m13353(j))) + " x " + ((Object) C7893.m13317(m13354(j)));
    }
}
