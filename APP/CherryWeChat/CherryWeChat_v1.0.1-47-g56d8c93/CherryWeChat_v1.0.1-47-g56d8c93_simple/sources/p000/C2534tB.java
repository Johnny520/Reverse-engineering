package p000;

import android.view.MenuItem;
import android.view.Window;

/* JADX INFO: renamed from: tB */
/* JADX INFO: loaded from: classes.dex */
public final class C2534tB implements InterfaceC2448rB, InterfaceC2113jr {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2577uB f8839a;

    public /* synthetic */ C2534tB(C2577uB r1) {
        this.f8839a = r1;
    }

    @Override // p000.InterfaceC2113jr
    /* JADX INFO: renamed from: d */
    public boolean mo233d(MenuC2204lr r1, MenuItem r2) {
        return false;
    }

    @Override // p000.InterfaceC2113jr
    /* JADX INFO: renamed from: n */
    public void mo241n(MenuC2204lr r5) {
        C2577uB r0 = this.f8839a;
        Window.Callback r1 = r0.f8930b;
        if (r0.f8929a.f9213a.m2111o() == false) goto L7;
        r1.onPanelClosed(108, r5);
        return;
    L7:
        if (r1.onPreparePanel(0, null, r5) == false) goto L10;
        r1.onMenuOpened(108, r5);
        return;
    }
}
