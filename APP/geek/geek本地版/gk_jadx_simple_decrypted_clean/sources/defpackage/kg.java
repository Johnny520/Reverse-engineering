package defpackage;

import android.graphics.Matrix;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class kg {
    public static final ThreadLocal a = null;
    public static final ThreadLocal b = null;

    static {
        a = new ThreadLocal();
        b = new ThreadLocal();
    }

    public static void a(TextInputLayout r2, View r3, Matrix r4) {
        Object r0 = r3.getParent();
        if ((r0 instanceof View) == false) goto L6;
        if (r0 == r2) goto L6;
        a(r2, (View) r0, r4);
        r4.preTranslate(-r0.getScrollX(), -r0.getScrollY());
    L6:
        r4.preTranslate(r3.getLeft(), r3.getTop());
        if (r3.getMatrix().isIdentity() == true) goto L10;
        r4.preConcat(r3.getMatrix());
        return;
    }
}
