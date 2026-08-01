package p205;

import androidx.window.area.AbstractC2567;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7899 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f21868;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7901[] f21867 = {new C7901(0), new C7901(4294967296L), new C7901(8589934592L)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long f21866 = AbstractC2567.m5062(Float.NaN, 0);

    public /* synthetic */ C7899(long j) {
        this.f21868 = j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static String m13342(long j) {
        long jM13344 = m13344(j);
        if (C7901.m13346(jM13344, 0L)) {
            return "Unspecified";
        }
        if (C7901.m13346(jM13344, 4294967296L)) {
            return m13343(j) + ".sp";
        }
        if (!C7901.m13346(jM13344, 8589934592L)) {
            return "Invalid";
        }
        return m13343(j) + ".em";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final float m13343(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long m13344(long j) {
        return f21867[(int) ((j & 1095216660480L) >>> 32)].f21870;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m13345(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7899) {
            return this.f21868 == ((C7899) obj).f21868;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21868);
    }

    public final String toString() {
        return m13342(this.f21868);
    }
}
