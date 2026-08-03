package p000;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: renamed from: pe */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2371pe implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8338a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f8339b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f8340c;

    public /* synthetic */ RunnableC2371pe(int r1, int r2, Object r3) {
        this.f8338a = r2;
        this.f8340c = r3;
        this.f8339b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f8338a) {
            case 0: goto L10;
            case 1: goto L8;
            default: goto L4;
        };
    L4:
        SideSheetBehavior r0 = (SideSheetBehavior) this.f8340c;
        View r1 = (View) r0.f4577p.get();
        if (r1 == null) goto L15;
        r0.m2470t(r1, this.f8339b, false);
        return;
    L15:
        return;
    L8:
        ((AbstractC0585Nj) this.f8340c).mo1159I(this.f8339b);
        return;
    L10:
        C2414qe r02 = (C2414qe) this.f8340c;
        if (r02.f8467b == false) goto L16;
        r02.f8466a = AbstractC0828TB.m1639f(this.f8339b, 100);
        AbstractC1208bA.m2328a(new RunnableC2320oe(r02, 3));
        r02.invalidate();
        return;
    }
}
