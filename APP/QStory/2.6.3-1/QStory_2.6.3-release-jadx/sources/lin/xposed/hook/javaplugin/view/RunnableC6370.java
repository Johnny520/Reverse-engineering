package lin.xposed.hook.javaplugin.view;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.view.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6370 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ PluginItemView f15634;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15635;

    public /* synthetic */ RunnableC6370(PluginItemView pluginItemView, int i) {
        this.f15635 = i;
        this.f15634 = pluginItemView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f15635;
        PluginItemView pluginItemView = this.f15634;
        switch (i) {
            case 0:
                pluginItemView.lambda$bindPluginInfoData$3();
                break;
            case 1:
                pluginItemView.lambda$bindPluginInfoData$4();
                break;
            case 2:
                pluginItemView.lambda$showDeleteDialog$13();
                break;
            default:
                pluginItemView.lambda$notificationError$0();
                break;
        }
    }
}
