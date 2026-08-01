package p205;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7900 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f21873;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m13318(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7900) {
            return this.f21873 == ((C7900) obj).f21873;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21873);
    }

    public final String toString() {
        long j = this.f21873;
        return m13318(j, 0L) ? "Unspecified" : m13318(j, 4294967296L) ? "Sp" : m13318(j, 8589934592L) ? "Em" : "Invalid";
    }
}
