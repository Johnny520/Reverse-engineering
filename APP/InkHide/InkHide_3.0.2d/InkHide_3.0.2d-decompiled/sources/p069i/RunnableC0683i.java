package p069i;

import android.view.View;
import p068h.InterfaceC0592k;
import p068h.MenuC0594m;

/* JADX INFO: renamed from: i.i */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0683i implements Runnable {

    /* JADX INFO: renamed from: a */
    public final C0677g f2297a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0689k f2298b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC0683i(C0689k c0689k, C0677g c0677g) {
        this.f2298b = c0689k;
        this.f2297a = c0677g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0592k interfaceC0592k;
        C0689k c0689k = this.f2298b;
        MenuC0594m menuC0594m = c0689k.f2304d;
        if (menuC0594m != null && (interfaceC0592k = menuC0594m.f2034e) != null) {
            interfaceC0592k.mo135f(menuC0594m);
        }
        View view = (View) c0689k.f2309i;
        if (view != null && view.getWindowToken() != null) {
            C0677g c0677g = this.f2297a;
            if (c0677g.m1206b()) {
                c0689k.f2320t = c0677g;
            } else if (c0677g.f2102e != null) {
                c0677g.m1208d(0, 0, false, false);
                c0689k.f2320t = c0677g;
            }
        }
        c0689k.f2322v = null;
    }
}
