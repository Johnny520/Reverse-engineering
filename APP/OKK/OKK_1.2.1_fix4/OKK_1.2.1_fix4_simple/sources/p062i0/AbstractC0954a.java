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
    public int f3381b;

    public AbstractC0954a() {
        this.f3381b = 0;
    }

    @Override // p078r.AbstractC1058a
    /* JADX INFO: renamed from: g */
    public boolean mo1816g(CoordinatorLayout r1, View r2, int r3) {
        mo1829r(r1, r2, r3);
        if (this.f3380a != null) goto L5;
        this.f3380a = new C0955b(r2);
    L5:
        C0955b r12 = this.f3380a;
        View r22 = r12.f3382a;
        r12.f3383b = r22.getTop();
        r12.f3384c = r22.getLeft();
        this.f3380a.m2287a();
        int r13 = this.f3381b;
        if (r13 == 0) goto L13;
        C0955b r23 = this.f3380a;
        if (r23.f3385d == r13) goto L10;
        r23.f3385d = r13;
        r23.m2287a();
    L10:
        this.f3381b = 0;
        return true;
    L13:
        return true;
    }

    /* JADX INFO: renamed from: r */
    public void mo1829r(CoordinatorLayout r1, View r2, int r3) {
        r1.m1174p(r2, r3);
    }

    public AbstractC0954a(int r1) {
        this.f3381b = 0;
    }
}
