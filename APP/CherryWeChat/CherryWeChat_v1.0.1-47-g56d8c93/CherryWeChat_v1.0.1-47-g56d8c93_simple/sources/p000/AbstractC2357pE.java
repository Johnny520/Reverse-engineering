package p000;

import android.graphics.Matrix;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: pE */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2357pE {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f8243a = null;

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f8244b = null;

    static {
        f8243a = new ThreadLocal();
        f8244b = new ThreadLocal();
    }

    /* JADX INFO: renamed from: a */
    public static void m4773a(CoordinatorLayout r2, View r3, Matrix r4) {
        Object r0 = r3.getParent();
        if ((r0 instanceof View) == false) goto L6;
        if (r0 == r2) goto L6;
        m4773a(r2, (View) r0, r4);
        r4.preTranslate(-r0.getScrollX(), -r0.getScrollY());
    L6:
        r4.preTranslate(r3.getLeft(), r3.getTop());
        if (r3.getMatrix().isIdentity() == true) goto L10;
        r4.preConcat(r3.getMatrix());
        return;
    }
}
