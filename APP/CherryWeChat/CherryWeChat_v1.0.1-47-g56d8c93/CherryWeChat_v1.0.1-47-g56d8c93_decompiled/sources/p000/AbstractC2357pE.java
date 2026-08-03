package p000;

import android.graphics.Matrix;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: pE */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2357pE {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f8243a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f8244b = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static void m4773a(CoordinatorLayout coordinatorLayout, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != coordinatorLayout) {
            m4773a(coordinatorLayout, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
