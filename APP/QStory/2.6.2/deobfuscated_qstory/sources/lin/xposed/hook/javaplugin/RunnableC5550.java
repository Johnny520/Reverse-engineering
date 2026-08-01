package lin.xposed.hook.javaplugin;

import lin.xposed.hook.javaplugin.PluginMenuFloatingWindow;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5550 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ PluginMenuFloatingWindow.AnonymousClass1 f15314;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15315;

    public /* synthetic */ RunnableC5550(PluginMenuFloatingWindow.AnonymousClass1 anonymousClass1, int i) {
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
