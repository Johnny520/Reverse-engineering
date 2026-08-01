package kotlin.time;

/* JADX INFO: renamed from: kotlin.time.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5158 implements InterfaceC5163 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f14717;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f14718;

    public C5158(String str, String str2) {
        this.f14718 = str;
        this.f14717 = str2;
    }

    @Override // kotlin.time.InterfaceC5163
    public final Instant toInstant() {
        throw new InstantFormatException(this.f14718 + " when parsing an Instant from \"" + AbstractC5159.m10201(64, this.f14717) + '\"');
    }
}
