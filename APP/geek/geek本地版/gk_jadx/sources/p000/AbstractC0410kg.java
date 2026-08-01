package p000;

import android.graphics.Matrix;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: kg */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0410kg {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f2888a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f2889b = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static void m1698a(TextInputLayout textInputLayout, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != textInputLayout) {
            m1698a(textInputLayout, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
