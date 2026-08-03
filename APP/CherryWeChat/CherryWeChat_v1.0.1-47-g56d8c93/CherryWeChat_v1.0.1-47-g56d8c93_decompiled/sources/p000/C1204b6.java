package p000;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: b6 */
/* JADX INFO: loaded from: classes.dex */
public final class C1204b6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4125a;

    /* JADX INFO: renamed from: b */
    public int f4126b;

    /* JADX INFO: renamed from: c */
    public boolean f4127c;

    /* JADX INFO: renamed from: d */
    public final Runnable f4128d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC0706Qb f4129e;

    public C1204b6(SideSheetBehavior sideSheetBehavior) {
        this.f4125a = 1;
        this.f4129e = sideSheetBehavior;
        this.f4128d = new RunnableC0562N2(24, this);
    }

    /* JADX INFO: renamed from: a */
    public final void m2324a(int i) {
        switch (this.f4125a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f4129e;
                WeakReference weakReference = bottomSheetBehavior.f4431W;
                if (weakReference != null && weakReference.get() != null) {
                    this.f4126b = i;
                    if (!this.f4127c) {
                        ((View) bottomSheetBehavior.f4431W.get()).postOnAnimation((RunnableC0431K0) this.f4128d);
                        this.f4127c = true;
                    }
                    break;
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f4129e;
                WeakReference weakReference2 = sideSheetBehavior.f4577p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f4126b = i;
                    if (!this.f4127c) {
                        ((View) sideSheetBehavior.f4577p.get()).postOnAnimation((RunnableC0562N2) this.f4128d);
                        this.f4127c = true;
                    }
                    break;
                }
                break;
        }
    }

    public C1204b6(BottomSheetBehavior bottomSheetBehavior) {
        this.f4125a = 0;
        this.f4129e = bottomSheetBehavior;
        this.f4128d = new RunnableC0431K0(3, this);
    }
}
