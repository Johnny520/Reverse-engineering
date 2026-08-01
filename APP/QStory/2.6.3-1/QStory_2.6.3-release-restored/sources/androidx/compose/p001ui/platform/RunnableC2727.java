package androidx.compose.p001ui.platform;

import p068.InterfaceC7372;

/* JADX INFO: renamed from: androidx.compose.ui.platform.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2727 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC7372 f5901;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f5902;

    public /* synthetic */ RunnableC2727(InterfaceC7372 interfaceC7372, int i) {
        this.f5902 = i;
        this.f5901 = interfaceC7372;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5902;
        InterfaceC7372 interfaceC7372 = this.f5901;
        switch (i) {
            case 0:
                interfaceC7372.invoke();
                break;
            default:
                interfaceC7372.invoke();
                break;
        }
    }
}
