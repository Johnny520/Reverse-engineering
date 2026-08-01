package p000;

import android.graphics.Matrix;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: lg */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0447lg {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f3001a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f3002b = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static void m1765a(TextInputLayout textInputLayout, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != textInputLayout) {
            m1765a(textInputLayout, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
