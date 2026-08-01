package kotlin.collections;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4326 extends AbstractC4333 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ C4325 f12903;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f12904;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f12905;

    public C4326(C4325 c4325) {
        this.f12903 = c4325;
        this.f12905 = c4325.size();
        this.f12904 = c4325.f12901;
    }

    @Override // kotlin.collections.AbstractC4333
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo8770() {
        int i = this.f12905;
        if (i == 0) {
            this.f12914 = 2;
            return;
        }
        C4325 c4325 = this.f12903;
        Object[] objArr = c4325.f12902;
        int i2 = this.f12904;
        this.f12913 = objArr[i2];
        this.f12914 = 1;
        this.f12904 = (i2 + 1) % c4325.f12900;
        this.f12905 = i - 1;
    }
}
