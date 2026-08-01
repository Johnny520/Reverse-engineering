package lin.xposed.hook.javaplugin.view;

import android.view.View;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.InterfaceC3749;
import p257.C8207;

/* JADX INFO: renamed from: lin.xposed.hook.javaplugin.view.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5547 implements InterfaceC3749 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ PluginItemView f15310;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15311;

    public /* synthetic */ C5547(PluginItemView pluginItemView, int i) {
        this.f15311 = i;
        this.f15310 = pluginItemView;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3749
    public final boolean onClick(AbstractC3737 abstractC3737, View view) {
        int i = this.f15311;
        PluginItemView pluginItemView = this.f15310;
        C8207 c8207 = (C8207) abstractC3737;
        switch (i) {
            case 0:
                return pluginItemView.lambda$showDeleteDialog$14(c8207, view);
            default:
                return pluginItemView.lambda$showUploadDialog$12(c8207, view);
        }
    }
}
