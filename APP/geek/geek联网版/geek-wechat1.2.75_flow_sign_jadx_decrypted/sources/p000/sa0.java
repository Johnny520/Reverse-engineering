package p000;

import android.graphics.Matrix;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class sa0 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f4287a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f4288b = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static void m2361a(CoordinatorLayout coordinatorLayout, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != coordinatorLayout) {
            m2361a(coordinatorLayout, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
