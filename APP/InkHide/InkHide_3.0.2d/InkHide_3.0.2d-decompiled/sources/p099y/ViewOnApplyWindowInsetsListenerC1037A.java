package p099y;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import p061e.C0537m;

/* JADX INFO: renamed from: y.A */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC1037A implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public C1075g0 f3653a = null;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f3654b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC1084p f3655c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Incorrect args count in method signature: ()V */
    public ViewOnApplyWindowInsetsListenerC1037A(View view, InterfaceC1084p interfaceC1084p) {
        this.f3654b = view;
        this.f3655c = interfaceC1084p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C1075g0 c1075g0M2342c = C1075g0.m2342c(windowInsets, view);
        int i2 = Build.VERSION.SDK_INT;
        InterfaceC1084p interfaceC1084p = this.f3655c;
        if (i2 < 30) {
            AbstractC1038B.m2226a(windowInsets, this.f3654b);
            if (c1075g0M2342c.equals(this.f3653a)) {
                return ((C0537m) interfaceC1084p).m1092a(view, c1075g0M2342c).m2343b();
            }
        }
        this.f3653a = c1075g0M2342c;
        C1075g0 c1075g0M1092a = ((C0537m) interfaceC1084p).m1092a(view, c1075g0M2342c);
        if (i2 >= 30) {
            return c1075g0M1092a.m2343b();
        }
        AbstractC1094z.m2366c(view);
        return c1075g0M1092a.m2343b();
    }
}
