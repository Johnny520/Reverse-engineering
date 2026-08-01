package kotlin.time;

/* JADX INFO: renamed from: kotlin.time.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5991 implements InterfaceC5996 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f15062;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f15063;

    public C5991(String str, String str2) {
        this.f15063 = str;
        this.f15062 = str2;
    }

    @Override // kotlin.time.InterfaceC5996
    public final Instant toInstant() {
        throw new InstantFormatException(this.f15063 + " when parsing an Instant from \"" + AbstractC5992.m10764(64, this.f15062) + '\"');
    }
}
