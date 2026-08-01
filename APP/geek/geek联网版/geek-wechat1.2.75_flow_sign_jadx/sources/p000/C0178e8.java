package p000;

import android.view.View;
import com.github.megatronking.stringfog.Base64;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: e8 */
/* JADX INFO: loaded from: classes.dex */
public final class C0178e8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1526a;

    /* JADX INFO: renamed from: b */
    public int f1527b;

    /* JADX INFO: renamed from: c */
    public boolean f1528c;

    /* JADX INFO: renamed from: d */
    public final Runnable f1529d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC0889xd f1530e;

    public C0178e8(SideSheetBehavior sideSheetBehavior) {
        this.f1526a = 1;
        this.f1530e = sideSheetBehavior;
        this.f1529d = new RunnableC0884x8(12, this);
    }

    /* JADX INFO: renamed from: a */
    public final void m970a(int i) {
        int i2 = this.f1526a;
        Runnable runnable = this.f1529d;
        AbstractC0889xd abstractC0889xd = this.f1530e;
        switch (i2) {
            case Base64.DEFAULT /* 0 */:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) abstractC0889xd;
                WeakReference weakReference = bottomSheetBehavior.f958U;
                if (weakReference != null && weakReference.get() != null) {
                    this.f1527b = i;
                    if (!this.f1528c) {
                        WeakHashMap weakHashMap = oa0.f3426a;
                        x90.m2665m((View) bottomSheetBehavior.f958U.get(), (RunnableC0325i7) runnable);
                        this.f1528c = true;
                    }
                    break;
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) abstractC0889xd;
                WeakReference weakReference2 = sideSheetBehavior.f1085p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f1527b = i;
                    if (!this.f1528c) {
                        WeakHashMap weakHashMap2 = oa0.f3426a;
                        x90.m2665m((View) sideSheetBehavior.f1085p.get(), (RunnableC0884x8) runnable);
                        this.f1528c = true;
                    }
                    break;
                }
                break;
        }
    }

    public C0178e8(BottomSheetBehavior bottomSheetBehavior) {
        this.f1526a = 0;
        this.f1530e = bottomSheetBehavior;
        this.f1529d = new RunnableC0325i7(1, this);
    }
}
