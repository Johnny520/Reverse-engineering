package androidx.compose.ui.platform;

import p052.InterfaceC6543;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1892 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6543 f5556;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f5557;

    public /* synthetic */ RunnableC1892(InterfaceC6543 interfaceC6543, int i) {
        this.f5557 = i;
        this.f5556 = interfaceC6543;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5557;
        InterfaceC6543 interfaceC6543 = this.f5556;
        switch (i) {
            case 0:
                interfaceC6543.invoke();
                break;
            default:
                interfaceC6543.invoke();
                break;
        }
    }
}
