package p000;

import android.graphics.Matrix;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class na0 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f3365a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f3366b = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static void m1925a(CoordinatorLayout coordinatorLayout, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != coordinatorLayout) {
            m1925a(coordinatorLayout, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
