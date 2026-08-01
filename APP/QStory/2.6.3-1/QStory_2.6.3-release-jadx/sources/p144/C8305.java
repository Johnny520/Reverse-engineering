package p144;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8305 extends AbstractC8304 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public AbstractC8312 f20573;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f20574 = 1;

    public C8305(AbstractC8312 abstractC8312) {
        this.f20573 = abstractC8312;
    }

    @Override // p144.InterfaceC8314
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo13225(AbstractC8312 abstractC8312) {
        switch (this.f20574) {
            case 0:
                this.f20573.mo13232();
                abstractC8312.mo13234(this);
                break;
            default:
                C8296 c8296 = (C8296) this.f20573;
                int i = c8296.f20546 - 1;
                c8296.f20546 = i;
                if (i == 0) {
                    c8296.f20549 = false;
                    c8296.m13273();
                }
                abstractC8312.mo13234(this);
                break;
        }
    }

    @Override // p144.AbstractC8304, p144.InterfaceC8314
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public void mo13246(AbstractC8312 abstractC8312) {
        switch (this.f20574) {
            case 1:
                C8296 c8296 = (C8296) this.f20573;
                if (!c8296.f20549) {
                    c8296.m13267();
                    c8296.f20549 = true;
                }
                break;
        }
    }

    public /* synthetic */ C8305() {
    }
}
