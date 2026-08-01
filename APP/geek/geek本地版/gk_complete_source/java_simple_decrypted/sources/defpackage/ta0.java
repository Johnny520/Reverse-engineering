package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ta0 extends wd {
    public au a;

    @Override // defpackage.wd
    public boolean g(CoordinatorLayout r2, View r3, int r4) {
        r(r2, r3, r4);
        if (this.a != null) goto L5;
        this.a = new au(r3);
    L5:
        au r22 = this.a;
        View r32 = (View) r22.a;
        r22.b = r32.getTop();
        r22.c = r32.getLeft();
        au r23 = this.a;
        View r33 = (View) r23.a;
        int r42 = 0 - (r33.getTop() - r23.b);
        WeakHashMap r0 = ja0.a;
        r33.offsetTopAndBottom(r42);
        r33.offsetLeftAndRight(0 - (r33.getLeft() - r23.c));
        return true;
    }

    public void r(CoordinatorLayout r1, View r2, int r3) {
        r1.q(r2, r3);
    }
}
