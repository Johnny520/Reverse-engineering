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

    public RunnableC0773d(C0095d r1, C0774e r2, MenuItemC0780k r3, MenuC0779j r4) {
        this.f2748d = r1;
        this.f2745a = r2;
        this.f2746b = r3;
        this.f2747c = r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0774e r02 = this.f2745a;
        if (r02 == null) goto L5;
        C0095d r1 = this.f2748d;
        ((ViewOnKeyListenerC0775f) r1.f251b).f2752A = true;
        r02.f2750b.m1997c(false);
        ((ViewOnKeyListenerC0775f) r1.f251b).f2752A = false;
    L5:
        MenuItem r03 = this.f2746b;
        if (r03.isEnabled() == true) goto L8;
        return;
    L8:
        if (r03.hasSubMenu() == false) goto L12;
        this.f2747c.m2010p(r03, null, 4);
        return;
    }
}
