package p000;

import android.view.View;
import com.github.megatronking.stringfog.Base64;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: u7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0772u7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4674a;

    /* JADX INFO: renamed from: b */
    public int f4675b;

    /* JADX INFO: renamed from: c */
    public boolean f4676c;

    /* JADX INFO: renamed from: d */
    public final Runnable f4677d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC0852wd f4678e;

    public C0772u7(SideSheetBehavior sideSheetBehavior) {
        this.f4674a = 1;
        this.f4678e = sideSheetBehavior;
        this.f4677d = new RunnableC0581p1(12, this);
    }

    /* JADX INFO: renamed from: a */
    public final void m2425a(int i) {
        int i2 = this.f4674a;
        Runnable runnable = this.f4677d;
        AbstractC0852wd abstractC0852wd = this.f4678e;
        switch (i2) {
            case Base64.DEFAULT /* 0 */:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC0852wd;
                WeakReference weakReference = bottomSheetBehavior.f1033U;
                if (weakReference != null && weakReference.get() != null) {
                    this.f4675b = i;
                    if (!this.f4676c) {
                        WeakHashMap weakHashMap = ja0.f2600a;
                        s90.m2321m((View) bottomSheetBehavior.f1033U.get(), (RunnableC0919y6) runnable);
                        this.f4676c = true;
                    }
                    break;
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC0852wd;
                WeakReference weakReference2 = sideSheetBehavior.f1160p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f4675b = i;
                    if (!this.f4676c) {
                        WeakHashMap weakHashMap2 = ja0.f2600a;
                        s90.m2321m((View) sideSheetBehavior.f1160p.get(), (RunnableC0581p1) runnable);
                        this.f4676c = true;
                    }
                    break;
                }
                break;
        }
    }

    public C0772u7(BottomSheetBehavior bottomSheetBehavior) {
        this.f4674a = 0;
        this.f4678e = bottomSheetBehavior;
        this.f4677d = new RunnableC0919y6(1, this);
    }
}
