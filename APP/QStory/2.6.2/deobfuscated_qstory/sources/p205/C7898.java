package p205;

import p392.AbstractC9124;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7898 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f21871;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7900[] f21870 = {new C7900(0), new C7900(4294967296L), new C7900(8589934592L)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long f21869 = AbstractC9124.m14667(Float.NaN, 0);

    public /* synthetic */ C7898(long j) {
        this.f21871 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static String m13314(long j) {
        long jM13316 = m13316(j);
        if (C7900.m13318(jM13316, 0L)) {
            return "Unspecified";
        }
        if (C7900.m13318(jM13316, 4294967296L)) {
            return m13315(j) + ".sp";
        }
        if (!C7900.m13318(jM13316, 8589934592L)) {
            return "Invalid";
        }
        return m13315(j) + ".em";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final float m13315(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long m13316(long j) {
        return f21870[(int) ((j & 1095216660480L) >>> 32)].f21873;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m13317(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7898) {
            return this.f21871 == ((C7898) obj).f21871;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21871);
    }

    public final String toString() {
        return m13314(this.f21871);
    }
}
