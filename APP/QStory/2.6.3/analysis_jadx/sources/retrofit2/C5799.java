package retrofit2;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5799 implements InterfaceC5795 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5797 f15894;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15895;

    public /* synthetic */ C5799(C5797 c5797, int i) {
        this.f15895 = i;
        this.f15894 = c5797;
    }

    @Override // retrofit2.InterfaceC5795
    public final void onFailure(InterfaceC5778 interfaceC5778, Throwable th) {
        int i = this.f15895;
        C5797 c5797 = this.f15894;
        switch (i) {
            case 0:
                c5797.completeExceptionally(th);
                break;
            default:
                c5797.completeExceptionally(th);
                break;
        }
    }

    @Override // retrofit2.InterfaceC5795
    public final void onResponse(InterfaceC5778 interfaceC5778, C5755 c5755) {
        int i = this.f15895;
        C5797 c5797 = this.f15894;
        switch (i) {
            case 0:
                if (!c5755.f15757.f16764) {
                    c5797.completeExceptionally(new HttpException(c5755));
                } else {
                    c5797.complete(c5755.f15756);
                }
                break;
            default:
                c5797.complete(c5755);
                break;
        }
    }
}
