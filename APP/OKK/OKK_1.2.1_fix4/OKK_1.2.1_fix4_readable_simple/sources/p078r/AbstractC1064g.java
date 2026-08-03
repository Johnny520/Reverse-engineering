package p078r;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: r.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1064g {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f4082a = null;

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f4083b = null;

    static {
        f4082a = new ThreadLocal();
        f4083b = new ThreadLocal();
    }

    /* JADX INFO: renamed from: a */
    public static void m2536a(ViewParent r2, View r3, Matrix r4) {
        Object r02 = r3.getParent();
        if ((r02 instanceof View) == false) goto L6;
        if (r02 == r2) goto L6;
        m2536a(r2, (View) r02, r4);
        r4.preTranslate(-r0.getScrollX(), -r0.getScrollY());
    L6:
        r4.preTranslate(r3.getLeft(), r3.getTop());
        if (r3.getMatrix().isIdentity() == true) goto L10;
        r4.preConcat(r3.getMatrix());
        return;
    }
}
