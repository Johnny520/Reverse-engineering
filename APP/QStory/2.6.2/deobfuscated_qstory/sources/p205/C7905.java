package p205;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7905 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f21882;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String m13328(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean m13329(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m13330(Object obj, long j) {
        return (obj instanceof C7905) && j == ((C7905) obj).f21882;
    }

    public final boolean equals(Object obj) {
        return m13330(obj, this.f21882);
    }

    public final int hashCode() {
        return Long.hashCode(this.f21882);
    }

    public final String toString() {
        return m13328(this.f21882);
    }
}
