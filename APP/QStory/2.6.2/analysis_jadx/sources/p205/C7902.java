package p205;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7902 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f21875;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final float m13325(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final float m13326(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7902) {
            return this.f21875 == ((C7902) obj).f21875;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21875);
    }

    public final String toString() {
        long j = this.f21875;
        if (j == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) C7892.m13289(m13325(j))) + " x " + ((Object) C7892.m13289(m13326(j)));
    }
}
