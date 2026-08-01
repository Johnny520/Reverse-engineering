package kotlin.time;

/* JADX INFO: renamed from: kotlin.time.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5162 implements InterfaceC5163 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f14726;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f14727;

    public C5162(long j, int i) {
        this.f14727 = j;
        this.f14726 = i;
    }

    @Override // kotlin.time.InterfaceC5163
    public final Instant toInstant() {
        Instant.Companion.getClass();
        long epochSeconds = Instant.MIN.getEpochSeconds();
        long j = this.f14727;
        if (j >= epochSeconds && j <= Instant.MAX.getEpochSeconds()) {
            return C5152.m10182(this.f14726, j);
        }
        throw new InstantFormatException("The parsed date is outside the range representable by Instant (Unix epoch second " + j + ')');
    }
}
