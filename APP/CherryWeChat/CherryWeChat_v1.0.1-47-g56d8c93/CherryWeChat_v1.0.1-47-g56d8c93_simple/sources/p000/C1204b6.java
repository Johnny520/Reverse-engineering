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

    public C1204b6(SideSheetBehavior r2) {
        this.f4125a = 1;
        this.f4129e = r2;
        this.f4128d = new RunnableC0562N2(24, this);
    }

    /* JADX INFO: renamed from: a */
    public final void m2324a(int r3) {
        switch(this.f4125a) {
            case 0: goto L13;
            default: goto L4;
        };
    L4:
        SideSheetBehavior r0 = (SideSheetBehavior) this.f4129e;
        WeakReference r1 = r0.f4577p;
        if (r1 != null) goto L7;
        return;
    L7:
        if (r1.get() == null) goto L24;
        this.f4126b = r3;
        if (this.f4127c == true) goto L23;
        ((View) r0.f4577p.get()).postOnAnimation((RunnableC0562N2) this.f4128d);
        this.f4127c = true;
        return;
    L23:
        return;
    L24:
        return;
    L13:
        BottomSheetBehavior r02 = (BottomSheetBehavior) this.f4129e;
        WeakReference r12 = r02.f4431W;
        if (r12 != null) goto L16;
        return;
    L16:
        if (r12.get() == null) goto L27;
        this.f4126b = r3;
        if (this.f4127c == true) goto L26;
        ((View) r02.f4431W.get()).postOnAnimation((RunnableC0431K0) this.f4128d);
        this.f4127c = true;
        return;
    L26:
        return;
    }

    public C1204b6(BottomSheetBehavior r2) {
        this.f4125a = 0;
        this.f4129e = r2;
        this.f4128d = new RunnableC0431K0(3, this);
    }
}
