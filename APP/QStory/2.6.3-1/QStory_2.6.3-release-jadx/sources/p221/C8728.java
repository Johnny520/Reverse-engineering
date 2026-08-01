package p221;

import androidx.window.area.AbstractC3400;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8728 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f22213;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8730[] f22212 = {new C8730(0), new C8730(4294967296L), new C8730(8589934592L)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long f22211 = AbstractC3400.m5622(Float.NaN, 0);

    public /* synthetic */ C8728(long j) {
        this.f22213 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static String m13901(long j) {
        long jM13903 = m13903(j);
        if (C8730.m13905(jM13903, 0L)) {
            return "Unspecified";
        }
        if (C8730.m13905(jM13903, 4294967296L)) {
            return m13902(j) + ".sp";
        }
        if (!C8730.m13905(jM13903, 8589934592L)) {
            return "Invalid";
        }
        return m13902(j) + ".em";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final float m13902(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long m13903(long j) {
        return f22212[(int) ((j & 1095216660480L) >>> 32)].f22215;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m13904(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8728) {
            return this.f22213 == ((C8728) obj).f22213;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22213);
    }

    public final String toString() {
        return m13901(this.f22213);
    }
}
