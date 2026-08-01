package androidx.compose.ui.viewinterop;

import p052.InterfaceC6542;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2078 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6542 f6173;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f6174;

    public /* synthetic */ RunnableC2078(InterfaceC6542 interfaceC6542, int i) {
        this.f6174 = i;
        this.f6173 = interfaceC6542;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6174;
        InterfaceC6542 interfaceC6542 = this.f6173;
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
