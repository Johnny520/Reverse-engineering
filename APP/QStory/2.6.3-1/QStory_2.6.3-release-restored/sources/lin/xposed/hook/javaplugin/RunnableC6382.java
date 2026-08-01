package lin.xposed.hook.javaplugin;

import lin.xposed.hook.javaplugin.PluginMenuFloatingWindow;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6382 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ PluginMenuFloatingWindow.C04081 f15659;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15660;

    public /* synthetic */ RunnableC6382(PluginMenuFloatingWindow.C04081 c04081, int i) {
        this.f15660 = i;
        this.f15659 = c04081;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f15660;
        PluginMenuFloatingWindow.C04081 c04081 = this.f15659;
        switch (i) {
            case 0:
                c04081.lambda$hide$1();
                break;
            default:
                c04081.lambda$show$0();
                break;
        }
    }
}
