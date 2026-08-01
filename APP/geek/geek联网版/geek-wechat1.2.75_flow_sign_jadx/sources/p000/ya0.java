package p000;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ya0 extends AbstractC0889xd {

    /* JADX INFO: renamed from: a */
    public C0163du f5370a;

    @Override // p000.AbstractC0889xd
    /* JADX INFO: renamed from: g */
    public boolean mo655g(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo668r(coordinatorLayout, view, i);
        if (this.f5370a == null) {
            this.f5370a = new C0163du(view);
        }
        C0163du c0163du = this.f5370a;
        View view2 = (View) c0163du.f1432a;
        c0163du.f1433b = view2.getTop();
        c0163du.f1434c = view2.getLeft();
        C0163du c0163du2 = this.f5370a;
        View view3 = (View) c0163du2.f1432a;
        int top = 0 - (view3.getTop() - c0163du2.f1433b);
        WeakHashMap weakHashMap = oa0.f3426a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - c0163du2.f1434c));
        return true;
    }

    /* JADX INFO: renamed from: r */
    public void mo668r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.m209q(view, i);
    }
}
