package androidx.appcompat.app;

import android.view.MenuItem;
import android.view.Window;
import androidx.appcompat.widget.InterfaceC0156;
import p190.InterfaceC7796;
import p190.MenuC7801;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0065 implements InterfaceC0156, InterfaceC7796 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C0060 f141;

    public /* synthetic */ C0065(C0060 c0060) {
        this.f141 = c0060;
    }

    @Override // p190.InterfaceC7796
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public void mo203(MenuC7801 menuC7801) {
        C0060 c0060 = this.f141;
        boolean zM506 = c0060.f127.f612.m506();
        Window.Callback callback = c0060.f126;
        if (zM506) {
            callback.onPanelClosed(108, menuC7801);
        } else if (callback.onPreparePanel(0, null, menuC7801)) {
            callback.onMenuOpened(108, menuC7801);
        }
    }

    @Override // p190.InterfaceC7796
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean mo204(MenuC7801 menuC7801, MenuItem menuItem) {
        return false;
    }
}
