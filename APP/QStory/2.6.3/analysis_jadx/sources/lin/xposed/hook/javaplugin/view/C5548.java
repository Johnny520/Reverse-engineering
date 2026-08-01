package lin.xposed.hook.javaplugin.view;

import android.view.View;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.interfaces.InterfaceC3750;
import p257.C8208;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.view.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5548 implements InterfaceC3750 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ PluginItemView f15310;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15311;

    public /* synthetic */ C5548(PluginItemView pluginItemView, int i) {
        this.f15311 = i;
        this.f15310 = pluginItemView;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3750
    public final boolean onClick(AbstractC3738 abstractC3738, View view) {
        int i = this.f15311;
        PluginItemView pluginItemView = this.f15310;
        C8208 c8208 = (C8208) abstractC3738;
        switch (i) {
            case 0:
                return pluginItemView.lambda$showDeleteDialog$14(c8208, view);
            default:
                return pluginItemView.lambda$showUploadDialog$12(c8208, view);
        }
    }
}
