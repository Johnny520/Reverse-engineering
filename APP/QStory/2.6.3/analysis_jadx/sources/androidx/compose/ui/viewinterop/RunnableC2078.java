package androidx.compose.ui.viewinterop;

import p052.InterfaceC6543;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2078 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC6543 f6174;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f6175;

    public /* synthetic */ RunnableC2078(InterfaceC6543 interfaceC6543, int i) {
        this.f6175 = i;
        this.f6174 = interfaceC6543;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6175;
        InterfaceC6543 interfaceC6543 = this.f6174;
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
