package Yue;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(23)
public final class C4590 implements InterfaceC4596 {
    @Override // Yue.InterfaceC4596
    @InterfaceC4482
    /* JADX INFO: renamed from: ۥ */
    public void mo1552(@InterfaceC6399 C7700 c7700, @InterfaceC6399 C7700 c77002, @InterfaceC6399 Window window, @InterfaceC6399 View view, boolean z, boolean z2) {
        C5499.m17103(c7700, "statusBarStyle");
        C5499.m17103(c77002, "navigationBarStyle");
        C5499.m17103(window, "window");
        C5499.m17103(view, "view");
        C8436.m28223(window, false);
        window.setStatusBarColor(c7700.m24492(z));
        window.setNavigationBarColor(c77002.m24489());
        new C8514(window, view).m28370(!z);
    }
}
