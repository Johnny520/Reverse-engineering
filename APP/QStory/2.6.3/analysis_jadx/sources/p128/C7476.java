package p128;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7476 extends AbstractC7475 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public AbstractC7483 f20228;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f20229 = 1;

    public C7476(AbstractC7483 abstractC7483) {
        this.f20228 = abstractC7483;
    }

    @Override // p128.InterfaceC7485
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo12666(AbstractC7483 abstractC7483) {
        switch (this.f20229) {
            case 0:
                this.f20228.mo12673();
                abstractC7483.mo12675(this);
                break;
            default:
                C7467 c7467 = (C7467) this.f20228;
                int i = c7467.f20201 - 1;
                c7467.f20201 = i;
                if (i == 0) {
                    c7467.f20204 = false;
                    c7467.m12714();
                }
                abstractC7483.mo12675(this);
                break;
        }
    }

    @Override // p128.AbstractC7475, p128.InterfaceC7485
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public void mo12687(AbstractC7483 abstractC7483) {
        switch (this.f20229) {
            case 1:
                C7467 c7467 = (C7467) this.f20228;
                if (!c7467.f20204) {
                    c7467.m12708();
                    c7467.f20204 = true;
                }
                break;
        }
    }

    public /* synthetic */ C7476() {
    }
}
