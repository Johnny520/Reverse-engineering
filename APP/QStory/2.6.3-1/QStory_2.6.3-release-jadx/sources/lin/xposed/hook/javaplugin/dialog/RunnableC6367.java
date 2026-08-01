package lin.xposed.hook.javaplugin.dialog;

import android.view.View;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.dialog.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6367 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ PluginDialog f15628;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ View f15629;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15630;

    public /* synthetic */ RunnableC6367(PluginDialog pluginDialog, View view, int i) {
        this.f15630 = i;
        this.f15628 = pluginDialog;
        this.f15629 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f15630;
        View view = this.f15629;
        PluginDialog pluginDialog = this.f15628;
        switch (i) {
            case 0:
                pluginDialog.lambda$initViews$2(view);
                break;
            default:
                pluginDialog.lambda$initViews$3(view);
                break;
        }
    }
}
