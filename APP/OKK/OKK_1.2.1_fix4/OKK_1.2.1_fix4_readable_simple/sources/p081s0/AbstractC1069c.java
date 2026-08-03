package p081s0;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: s0.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1069c {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f4152a = null;

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f4153b = null;

    static {
        f4152a = new ThreadLocal();
        f4153b = new ThreadLocal();
    }

    /* JADX INFO: renamed from: a */
    public static void m2550a(ViewParent r2, View r3, Matrix r4) {
        Object r02 = r3.getParent();
        if ((r02 instanceof View) == false) goto L6;
        if (r02 == r2) goto L6;
        m2550a(r2, (View) r02, r4);
        r4.preTranslate(-r0.getScrollX(), -r0.getScrollY());
    L6:
        r4.preTranslate(r3.getLeft(), r3.getTop());
        if (r3.getMatrix().isIdentity() == true) goto L10;
        r4.preConcat(r3.getMatrix());
        return;
    }
}
