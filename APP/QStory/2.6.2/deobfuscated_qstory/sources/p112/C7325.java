package p112;

import io.ktor.client.plugins.AbstractC3932;

/* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7325 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f19532;

    public /* synthetic */ C7325(long j) {
        this.f19532 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static String m12485(long j) {
        if (j == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + AbstractC3932.m8302(Float.intBitsToFloat((int) (j >> 32))) + ", " + AbstractC3932.m8302(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final boolean m12486(long j) {
        return (j == 9205357640488583168L) | (Float.intBitsToFloat((int) (j >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final float m12487(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m12488(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7325) {
            return this.f19532 == ((C7325) obj).f19532;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f19532);
    }

    public final String toString() {
        return m12485(this.f19532);
    }
}
