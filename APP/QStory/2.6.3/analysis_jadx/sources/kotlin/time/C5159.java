package kotlin.time;

/* JADX INFO: renamed from: kotlin.time.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5159 implements InterfaceC5164 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f14717;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f14718;

    public C5159(String str, String str2) {
        this.f14718 = str;
        this.f14717 = str2;
    }

    @Override // kotlin.time.InterfaceC5164
    public final Instant toInstant() {
        throw new InstantFormatException(this.f14718 + " when parsing an Instant from \"" + AbstractC5160.m10205(64, this.f14717) + '\"');
    }
}
