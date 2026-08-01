package p229r1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: r1.p */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC3086p implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public C3070c0 f9804a = null;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f9805b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC3081k f9806c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Incorrect args count in method signature: ()V */
    public ViewOnApplyWindowInsetsListenerC3086p(View view, InterfaceC3081k interfaceC3081k) {
        this.f9805b = view;
        this.f9806c = interfaceC3081k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C3070c0 c3070c0M5393c = C3070c0.m5393c(view, windowInsets);
        int i5 = Build.VERSION.SDK_INT;
        InterfaceC3081k interfaceC3081k = this.f9806c;
        if (i5 < 30) {
            AbstractC3087q.m5399a(windowInsets, this.f9805b);
            if (c3070c0M5393c.equals(this.f9804a)) {
                return interfaceC3081k.mo680a(view, c3070c0M5393c).m5394b();
            }
        }
        this.f9804a = c3070c0M5393c;
        C3070c0 c3070c0Mo680a = interfaceC3081k.mo680a(view, c3070c0M5393c);
        if (i5 >= 30) {
            return c3070c0Mo680a.m5394b();
        }
        int i6 = AbstractC3092v.f9811a;
        view.requestApplyInsets();
        return c3070c0Mo680a.m5394b();
    }
}
