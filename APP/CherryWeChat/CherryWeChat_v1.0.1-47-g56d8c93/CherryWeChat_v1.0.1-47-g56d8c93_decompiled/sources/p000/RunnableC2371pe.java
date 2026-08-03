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

    public /* synthetic */ RunnableC2371pe(int i, int i2, Object obj) {
        this.f8338a = i2;
        this.f8340c = obj;
        this.f8339b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8338a) {
            case 0:
                C2414qe c2414qe = (C2414qe) this.f8340c;
                if (c2414qe.f8467b) {
                    c2414qe.f8466a = AbstractC0828TB.m1639f(this.f8339b, 100);
                    AbstractC1208bA.m2328a(new RunnableC2320oe(c2414qe, 3));
                    c2414qe.invalidate();
                    break;
                }
                break;
            case 1:
                ((AbstractC0585Nj) this.f8340c).mo1159I(this.f8339b);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f8340c;
                View view = (View) sideSheetBehavior.f4577p.get();
                if (view != null) {
                    sideSheetBehavior.m2470t(view, this.f8339b, false);
                }
                break;
        }
    }
}
