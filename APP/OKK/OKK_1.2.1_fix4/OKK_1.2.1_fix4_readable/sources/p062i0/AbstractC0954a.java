package p062i0;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p078r.AbstractC1058a;

/* JADX INFO: renamed from: i0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0954a extends AbstractC1058a {

    /* JADX INFO: renamed from: a */
    public C0955b f3380a;

    /* JADX INFO: renamed from: b */
    public int f3381b = 0;

    public AbstractC0954a() {
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: g */
    public boolean mo1816g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        mo1829r(coordinatorLayout, view, i2);
        if (this.f3380a == null) {
            this.f3380a = new C0955b(view);
        }
        C0955b c0955b = this.f3380a;
        View view2 = c0955b.f3382a;
        c0955b.f3383b = view2.getTop();
        c0955b.f3384c = view2.getLeft();
        this.f3380a.m2287a();
        int i3 = this.f3381b;
        if (i3 == 0) {
            return true;
        }
        C0955b c0955b2 = this.f3380a;
        if (c0955b2.f3385d != i3) {
            c0955b2.f3385d = i3;
            c0955b2.m2287a();
        }
        this.f3381b = 0;
        return true;
    }

    /* JADX INFO: renamed from: r */
    public void mo1829r(CoordinatorLayout coordinatorLayout, View view, int i2) {
        coordinatorLayout.m1174p(view, i2);
    }

    public AbstractC0954a(int i2) {
    }
}
