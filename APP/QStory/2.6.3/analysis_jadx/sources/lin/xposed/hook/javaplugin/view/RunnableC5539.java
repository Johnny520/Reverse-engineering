package lin.xposed.hook.javaplugin.view;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.view.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5539 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ PluginItemView f15289;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15290;

    public /* synthetic */ RunnableC5539(PluginItemView pluginItemView, int i) {
        this.f15290 = i;
        this.f15289 = pluginItemView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f15290;
        PluginItemView pluginItemView = this.f15289;
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
