package p055f;

import android.view.MenuItem;
import p006D.C0095d;

/* JADX INFO: renamed from: f.d */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0773d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0774e f2745a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MenuItem f2746b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MenuC0779j f2747c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0095d f2748d;

    public RunnableC0773d(C0095d c0095d, C0774e c0774e, MenuItemC0780k menuItemC0780k, MenuC0779j menuC0779j) {
        this.f2748d = c0095d;
        this.f2745a = c0774e;
        this.f2746b = menuItemC0780k;
        this.f2747c = menuC0779j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0774e c0774e = this.f2745a;
        if (c0774e != null) {
            C0095d c0095d = this.f2748d;
            ((ViewOnKeyListenerC0775f) c0095d.f251b).f2752A = true;
            c0774e.f2750b.m1997c(false);
            ((ViewOnKeyListenerC0775f) c0095d.f251b).f2752A = false;
        }
        MenuItem menuItem = this.f2746b;
        if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
            this.f2747c.m2010p(menuItem, null, 4);
        }
    }
}
