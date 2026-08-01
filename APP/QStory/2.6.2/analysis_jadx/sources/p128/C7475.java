package p128;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7475 extends AbstractC7474 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public AbstractC7482 f20233;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f20234 = 1;

    public C7475(AbstractC7482 abstractC7482) {
        this.f20233 = abstractC7482;
    }

    @Override // p128.InterfaceC7484
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo12639(AbstractC7482 abstractC7482) {
        switch (this.f20234) {
            case 0:
                this.f20233.mo12646();
                abstractC7482.mo12648(this);
                break;
            default:
                C7466 c7466 = (C7466) this.f20233;
                int i = c7466.f20206 - 1;
                c7466.f20206 = i;
                if (i == 0) {
                    c7466.f20209 = false;
                    c7466.m12685();
                }
                abstractC7482.mo12648(this);
                break;
        }
    }

    @Override // p128.AbstractC7474, p128.InterfaceC7484
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public void mo12660(AbstractC7482 abstractC7482) {
        switch (this.f20234) {
            case 1:
                C7466 c7466 = (C7466) this.f20233;
                if (!c7466.f20209) {
                    c7466.m12679();
                    c7466.f20209 = true;
                }
                break;
        }
    }

    public /* synthetic */ C7475() {
    }
}
