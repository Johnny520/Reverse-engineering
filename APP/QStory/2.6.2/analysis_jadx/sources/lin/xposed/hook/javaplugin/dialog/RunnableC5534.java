package lin.xposed.hook.javaplugin.dialog;

import android.view.View;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.dialog.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5534 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ PluginDialog f15283;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ View f15284;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15285;

    public /* synthetic */ RunnableC5534(PluginDialog pluginDialog, View view, int i) {
        this.f15285 = i;
        this.f15283 = pluginDialog;
        this.f15284 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f15285;
        View view = this.f15284;
        PluginDialog pluginDialog = this.f15283;
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
