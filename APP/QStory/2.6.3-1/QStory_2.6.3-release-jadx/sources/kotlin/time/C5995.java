package kotlin.time;

/* JADX INFO: renamed from: kotlin.time.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5995 implements InterfaceC5996 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f15071;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f15072;

    public C5995(long j, int i) {
        this.f15072 = j;
        this.f15071 = i;
    }

    @Override // kotlin.time.InterfaceC5996
    public final Instant toInstant() {
        Instant.Companion.getClass();
        long epochSeconds = Instant.MIN.getEpochSeconds();
        long j = this.f15072;
        if (j >= epochSeconds && j <= Instant.MAX.getEpochSeconds()) {
            return C5985.m10745(this.f15071, j);
        }
        throw new InstantFormatException("The parsed date is outside the range representable by Instant (Unix epoch second " + j + ')');
    }
}
