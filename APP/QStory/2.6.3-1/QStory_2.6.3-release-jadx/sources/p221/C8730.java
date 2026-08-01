package p221;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8730 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f22215;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m13905(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8730) {
            return this.f22215 == ((C8730) obj).f22215;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22215);
    }

    public final String toString() {
        long j = this.f22215;
        return m13905(j, 0L) ? "Unspecified" : m13905(j, 4294967296L) ? "Sp" : m13905(j, 8589934592L) ? "Em" : "Invalid";
    }
}
