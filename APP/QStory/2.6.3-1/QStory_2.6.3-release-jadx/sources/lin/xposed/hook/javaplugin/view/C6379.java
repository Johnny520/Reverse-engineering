package lin.xposed.hook.javaplugin.view;

import android.view.View;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.InterfaceC4582;
import p273.C9037;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.view.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6379 implements InterfaceC4582 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ PluginItemView f15655;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15656;

    public /* synthetic */ C6379(PluginItemView pluginItemView, int i) {
        this.f15656 = i;
        this.f15655 = pluginItemView;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC4582
    public final boolean onClick(AbstractC4570 abstractC4570, View view) {
        int i = this.f15656;
        PluginItemView pluginItemView = this.f15655;
        C9037 c9037 = (C9037) abstractC4570;
        switch (i) {
            case 0:
                return pluginItemView.lambda$showDeleteDialog$14(c9037, view);
            default:
                return pluginItemView.lambda$showUploadDialog$12(c9037, view);
        }
    }
}
