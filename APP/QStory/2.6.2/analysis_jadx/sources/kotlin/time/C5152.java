package kotlin.time;

/* JADX INFO: renamed from: kotlin.time.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5152 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Instant m10182(int i, long j) {
        long j2 = i;
        long j3 = j2 / 1000000000;
        if ((j2 ^ 1000000000) < 0 && j3 * 1000000000 != j2) {
            j3--;
        }
        long j4 = j + j3;
        if ((j ^ j4) < 0 && (j3 ^ j) >= 0) {
            if (j > 0) {
                Instant.Companion.getClass();
                return Instant.MAX;
            }
            Instant.Companion.getClass();
            return Instant.MIN;
        }
        if (j4 < -31557014167219200L) {
            return Instant.MIN;
        }
        if (j4 > 31556889864403199L) {
            return Instant.MAX;
        }
        long j5 = j2 % 1000000000;
        return new Instant(j4, (int) (j5 + ((((j5 ^ 1000000000) & ((-j5) | j5)) >> 63) & 1000000000)));
    }
}
