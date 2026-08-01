package kotlin.collections;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5159 extends AbstractC5166 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ C5158 f13252;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f13253;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f13254;

    public C5159(C5158 c5158) {
        this.f13252 = c5158;
        this.f13254 = c5158.size();
        this.f13253 = c5158.f13250;
    }

    @Override // kotlin.collections.AbstractC5166
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo9319() {
        int i = this.f13254;
        if (i == 0) {
            this.f13263 = 2;
            return;
        }
        C5158 c5158 = this.f13252;
        Object[] objArr = c5158.f13251;
        int i2 = this.f13253;
        this.f13262 = objArr[i2];
        this.f13263 = 1;
        this.f13253 = (i2 + 1) % c5158.f13249;
        this.f13254 = i - 1;
    }
}
