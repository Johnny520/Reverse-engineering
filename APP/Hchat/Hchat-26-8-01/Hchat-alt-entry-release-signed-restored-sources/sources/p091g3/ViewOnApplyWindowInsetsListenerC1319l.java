package p091g3;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: g3.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC1319l implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public C1332r0 f4388a = null;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f4389b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC1305e f4390c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Incorrect args count in method signature: ()V */
    public ViewOnApplyWindowInsetsListenerC1319l(View view, InterfaceC1305e interfaceC1305e) {
        this.f4389b = view;
        this.f4390c = interfaceC1305e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C1332r0 c1332r0M3558c = C1332r0.m3558c(windowInsets, view);
        int i9 = Build.VERSION.SDK_INT;
        InterfaceC1305e interfaceC1305e = this.f4390c;
        if (i9 < 30) {
            AbstractC1321m.m3523a(windowInsets, this.f4389b);
            if (c1332r0M3558c.equals(this.f4388a)) {
                return interfaceC1305e.mo3460c(view, c1332r0M3558c).m3559b();
            }
        }
        this.f4388a = c1332r0M3558c;
        C1332r0 c1332r0Mo3460c = interfaceC1305e.mo3460c(view, c1332r0M3558c);
        if (i9 >= 30) {
            return c1332r0Mo3460c.m3559b();
        }
        int i10 = AbstractC1329q.f4395a;
        AbstractC1317k.m3519a(view);
        return c1332r0Mo3460c.m3559b();
    }
}
