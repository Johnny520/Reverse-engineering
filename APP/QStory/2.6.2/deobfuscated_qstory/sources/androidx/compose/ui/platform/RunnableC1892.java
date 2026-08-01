package androidx.compose.ui.platform;

import p052.InterfaceC6542;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1892 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6542 f5555;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f5556;

    public /* synthetic */ RunnableC1892(InterfaceC6542 interfaceC6542, int i) {
        this.f5556 = i;
        this.f5555 = interfaceC6542;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5556;
        InterfaceC6542 interfaceC6542 = this.f5555;
        switch (i) {
            case 0:
                interfaceC6542.invoke();
                break;
            default:
                interfaceC6542.invoke();
                break;
        }
    }
}
