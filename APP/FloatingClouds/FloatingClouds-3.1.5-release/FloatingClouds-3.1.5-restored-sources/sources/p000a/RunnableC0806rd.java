package p000a;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import p000a.C0787qd;

/* JADX INFO: renamed from: a.rd */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0806rd implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3194a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f3195b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3196c;

    public /* synthetic */ RunnableC0806rd(Object obj, int i, int i2) {
        this.f3194a = i2;
        this.f3196c = obj;
        this.f3195b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3194a) {
            case 0:
                ((C0787qd.e) this.f3196c).mo1036b(this.f3195b);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f3196c;
                View view = (View) sideSheetBehavior.f5847p.get();
                if (view != null) {
                    sideSheetBehavior.m3252u(view, this.f3195b, false);
                }
                break;
        }
    }
}
