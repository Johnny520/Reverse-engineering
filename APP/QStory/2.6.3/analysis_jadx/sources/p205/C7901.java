package p205;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7901 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f21870;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m13346(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7901) {
            return this.f21870 == ((C7901) obj).f21870;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21870);
    }

    public final String toString() {
        long j = this.f21870;
        return m13346(j, 0L) ? "Unspecified" : m13346(j, 4294967296L) ? "Sp" : m13346(j, 8589934592L) ? "Em" : "Invalid";
    }
}
