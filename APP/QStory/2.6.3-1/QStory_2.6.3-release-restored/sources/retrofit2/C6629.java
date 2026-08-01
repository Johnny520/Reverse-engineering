package retrofit2;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6629 implements InterfaceC6625 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6627 f16239;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16240;

    public /* synthetic */ C6629(C6627 c6627, int i) {
        this.f16240 = i;
        this.f16239 = c6627;
    }

    @Override // retrofit2.InterfaceC6625
    public final void onFailure(InterfaceC6608 interfaceC6608, Throwable th) {
        int i = this.f16240;
        C6627 c6627 = this.f16239;
        switch (i) {
            case 0:
                c6627.completeExceptionally(th);
                break;
            default:
                c6627.completeExceptionally(th);
                break;
        }
    }

    @Override // retrofit2.InterfaceC6625
    public final void onResponse(InterfaceC6608 interfaceC6608, C6585 c6585) {
        int i = this.f16240;
        C6627 c6627 = this.f16239;
        switch (i) {
            case 0:
                if (!c6585.f16102.f17109) {
                    c6627.completeExceptionally(new HttpException(c6585));
                } else {
                    c6627.complete(c6585.f16101);
                }
                break;
            default:
                c6627.complete(c6585);
                break;
        }
    }
}
