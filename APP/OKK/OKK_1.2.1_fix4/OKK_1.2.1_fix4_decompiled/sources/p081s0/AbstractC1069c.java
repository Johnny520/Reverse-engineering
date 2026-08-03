package p081s0;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: s0.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1069c {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f4152a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f4153b = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static void m2550a(ViewParent viewParent, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            m2550a(viewParent, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
