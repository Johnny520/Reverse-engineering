package p000;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ta0 extends AbstractC0852wd {

    /* JADX INFO: renamed from: a */
    public C0044au f4559a;

    @Override // p000.AbstractC0852wd
    /* JADX INFO: renamed from: g */
    public boolean mo697g(CoordinatorLayout coordinatorLayout, View view, int i) {
        mo710r(coordinatorLayout, view, i);
        if (this.f4559a == null) {
            this.f4559a = new C0044au(view);
        }
        C0044au c0044au = this.f4559a;
        View view2 = (View) c0044au.f681a;
        c0044au.f682b = view2.getTop();
        c0044au.f683c = view2.getLeft();
        C0044au c0044au2 = this.f4559a;
        View view3 = (View) c0044au2.f681a;
        int top = 0 - (view3.getTop() - c0044au2.f682b);
        WeakHashMap weakHashMap = ja0.f2600a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - c0044au2.f683c));
        return true;
    }

    /* JADX INFO: renamed from: r */
    public void mo710r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.m224q(view, i);
    }
}
