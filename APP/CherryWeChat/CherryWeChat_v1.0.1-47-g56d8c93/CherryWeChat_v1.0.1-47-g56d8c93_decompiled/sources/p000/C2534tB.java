package p000;

import android.view.MenuItem;
import android.view.Window;

/* JADX INFO: renamed from: tB */
/* JADX INFO: loaded from: classes.dex */
public final class C2534tB implements InterfaceC2448rB, InterfaceC2113jr {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2577uB f8839a;

    public /* synthetic */ C2534tB(C2577uB c2577uB) {
        this.f8839a = c2577uB;
    }

    @Override // p000.InterfaceC2113jr
    /* JADX INFO: renamed from: d */
    public boolean mo233d(MenuC2204lr menuC2204lr, MenuItem menuItem) {
        return false;
    }

    @Override // p000.InterfaceC2113jr
    /* JADX INFO: renamed from: n */
    public void mo241n(MenuC2204lr menuC2204lr) {
        C2577uB c2577uB = this.f8839a;
        Window.Callback callback = c2577uB.f8930b;
        if (c2577uB.f8929a.f9213a.m2111o()) {
            callback.onPanelClosed(108, menuC2204lr);
        } else if (callback.onPreparePanel(0, null, menuC2204lr)) {
            callback.onMenuOpened(108, menuC2204lr);
        }
    }
}
