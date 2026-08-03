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
    public boolean mo1459g(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo2421r(coordinatorLayout, view, i);
        if (this.f9463a == null) {
            this.f9463a = new C2486s6(view);
        }
        C2486s6 c2486s6 = this.f9463a;
        View view2 = (View) c2486s6.f8746c;
        c2486s6.f8744a = view2.getTop();
        c2486s6.f8745b = view2.getLeft();
        C2486s6 c2486s62 = this.f9463a;
        View view3 = (View) c2486s62.f8746c;
        int top = 0 - (view3.getTop() - c2486s62.f8744a);
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - c2486s62.f8745b));
        return true;
    }

    /* JADX INFO: renamed from: r */
    public void mo2421r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.m2140p(view, i);
    }
}
