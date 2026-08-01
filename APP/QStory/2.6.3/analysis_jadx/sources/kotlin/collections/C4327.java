package kotlin.collections;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4327 extends AbstractC4334 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ C4326 f12907;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f12908;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f12909;

    public C4327(C4326 c4326) {
        this.f12907 = c4326;
        this.f12909 = c4326.size();
        this.f12908 = c4326.f12905;
    }

    @Override // kotlin.collections.AbstractC4334
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo8760() {
        int i = this.f12909;
        if (i == 0) {
            this.f12918 = 2;
            return;
        }
        C4326 c4326 = this.f12907;
        Object[] objArr = c4326.f12906;
        int i2 = this.f12908;
        this.f12917 = objArr[i2];
        this.f12918 = 1;
        this.f12908 = (i2 + 1) % c4326.f12904;
        this.f12909 = i - 1;
    }
}
