package androidx.appcompat.app;

import android.view.MenuItem;
import android.view.Window;
import androidx.appcompat.widget.InterfaceC0156;
import p190.InterfaceC7797;
import p190.MenuC7802;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0065 implements InterfaceC0156, InterfaceC7797 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C0060 f141;

    public /* synthetic */ C0065(C0060 c0060) {
        this.f141 = c0060;
    }

    @Override // p190.InterfaceC7797
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public void mo204(MenuC7802 menuC7802) {
        C0060 c0060 = this.f141;
        boolean zM507 = c0060.f127.f612.m507();
        Window.Callback callback = c0060.f126;
        if (zM507) {
            callback.onPanelClosed(108, menuC7802);
        } else if (callback.onPreparePanel(0, null, menuC7802)) {
            callback.onMenuOpened(108, menuC7802);
        }
    }

    @Override // p190.InterfaceC7797
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean mo205(MenuC7802 menuC7802, MenuItem menuItem) {
        return false;
    }
}
