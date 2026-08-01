package androidx.appcompat.app;

import android.view.MenuItem;
import android.view.Window;
import androidx.appcompat.widget.InterfaceC1003;
import p206.InterfaceC8626;
import p206.MenuC8631;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0912 implements InterfaceC1003, InterfaceC8626 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C0907 f486;

    public /* synthetic */ C0912(C0907 c0907) {
        this.f486 = c0907;
    }

    @Override // p206.InterfaceC8626
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public void mo764(MenuC8631 menuC8631) {
        C0907 c0907 = this.f486;
        boolean zM1067 = c0907.f472.f957.m1067();
        Window.Callback callback = c0907.f471;
        if (zM1067) {
            callback.onPanelClosed(108, menuC8631);
        } else if (callback.onPreparePanel(0, null, menuC8631)) {
            callback.onMenuOpened(108, menuC8631);
        }
    }

    @Override // p206.InterfaceC8626
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public boolean mo765(MenuC8631 menuC8631, MenuItem menuItem) {
        return false;
    }
}
