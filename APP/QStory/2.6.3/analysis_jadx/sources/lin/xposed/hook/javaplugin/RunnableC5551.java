package lin.xposed.hook.javaplugin;

import lin.xposed.hook.javaplugin.PluginMenuFloatingWindow;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5551 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ PluginMenuFloatingWindow.AnonymousClass1 f15314;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15315;

    public /* synthetic */ RunnableC5551(PluginMenuFloatingWindow.AnonymousClass1 anonymousClass1, int i) {
        this.f15315 = i;
        this.f15314 = anonymousClass1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f15315;
        PluginMenuFloatingWindow.AnonymousClass1 anonymousClass1 = this.f15314;
        switch (i) {
            case 0:
                anonymousClass1.lambda$hide$1();
                break;
            default:
                anonymousClass1.lambda$show$0();
                break;
        }
    }
}
