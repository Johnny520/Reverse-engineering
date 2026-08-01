package retrofit2;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5798 implements InterfaceC5794 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5796 f15894;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15895;

    public /* synthetic */ C5798(C5796 c5796, int i) {
        this.f15895 = i;
        this.f15894 = c5796;
    }

    @Override // retrofit2.InterfaceC5794
    public final void onFailure(InterfaceC5777 interfaceC5777, Throwable th) {
        int i = this.f15895;
        C5796 c5796 = this.f15894;
        switch (i) {
            case 0:
                c5796.completeExceptionally(th);
                break;
            default:
                c5796.completeExceptionally(th);
                break;
        }
    }

    @Override // retrofit2.InterfaceC5794
    public final void onResponse(InterfaceC5777 interfaceC5777, C5754 c5754) {
        int i = this.f15895;
        C5796 c5796 = this.f15894;
        switch (i) {
            case 0:
                if (!c5754.f15757.f17003) {
                    c5796.completeExceptionally(new HttpException(c5754));
                } else {
                    c5796.complete(c5754.f15756);
                }
                break;
            default:
                c5796.complete(c5754);
                break;
        }
    }
}
