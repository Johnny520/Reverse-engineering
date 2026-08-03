package p000;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: zE */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2795zE extends AbstractC0706Qb {

    /* JADX INFO: renamed from: a */
    public C2486s6 f9463a;

    @Override // p000.AbstractC0706Qb
    /* JADX INFO: renamed from: g */
    public boolean mo1459g(CoordinatorLayout r2, View r3, int r4) {
        mo2421r(r2, r3, r4);
        if (this.f9463a != null) goto L5;
        this.f9463a = new C2486s6(r3);
    L5:
        C2486s6 r22 = this.f9463a;
        View r32 = (View) r22.f8746c;
        r22.f8744a = r32.getTop();
        r22.f8745b = r32.getLeft();
        C2486s6 r23 = this.f9463a;
        View r33 = (View) r23.f8746c;
        int r42 = 0 - (r33.getTop() - r23.f8744a);
        WeakHashMap r0 = AbstractC2185lE.f7617a;
        r33.offsetTopAndBottom(r42);
        r33.offsetLeftAndRight(0 - (r33.getLeft() - r23.f8745b));
        return true;
    }

    /* JADX INFO: renamed from: r */
    public void mo2421r(CoordinatorLayout r1, View r2, int r3) {
        r1.m2140p(r2, r3);
    }
}
