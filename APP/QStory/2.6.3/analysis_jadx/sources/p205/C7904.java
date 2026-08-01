package p205;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7904 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f21873;

    public final boolean equals(Object obj) {
        if (obj instanceof C7904) {
            return this.f21873 == ((C7904) obj).f21873;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21873);
    }

    public final String toString() {
        long j = this.f21873;
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) C7893.m13317(Float.intBitsToFloat((int) (j >> 32)))) + ", " + ((Object) C7893.m13317(Float.intBitsToFloat((int) (4294967295L & j)))) + ')';
    }
}
