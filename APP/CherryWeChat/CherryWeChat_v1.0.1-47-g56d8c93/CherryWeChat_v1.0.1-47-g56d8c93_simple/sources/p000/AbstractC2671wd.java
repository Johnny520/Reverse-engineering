package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: wd */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2671wd {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f9230a = null;

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f9231b = null;

    static {
        f9230a = new ThreadLocal();
        f9231b = new ThreadLocal();
    }

    /* JADX INFO: renamed from: a */
    public static void m5235a(TextInputLayout r3, View r4, Rect r5) {
        r5.set(0, 0, r4.getWidth(), r4.getHeight());
        ThreadLocal r0 = f9230a;
        Matrix r1 = (Matrix) r0.get();
        if (r1 != null) goto L5;
        r1 = new Matrix();
        r0.set(r1);
    L6:
        m5236b(r3, r4, r1);
        ThreadLocal r32 = f9231b;
        RectF r42 = (RectF) r32.get();
        if (r42 != null) goto L9;
        r42 = new RectF();
        r32.set(r42);
    L9:
        r42.set(r5);
        r1.mapRect(r42);
        r5.set((int) (r42.left + 0.5f), (int) (r42.top + 0.5f), (int) (r42.right + 0.5f), (int) (r42.bottom + 0.5f));
        return;
    L5:
        r1.reset();
        goto L6
    }

    /* JADX INFO: renamed from: b */
    public static void m5236b(TextInputLayout r2, View r3, Matrix r4) {
        Object r0 = r3.getParent();
        if ((r0 instanceof View) == false) goto L6;
        if (r0 == r2) goto L6;
        m5236b(r2, (View) r0, r4);
        r4.preTranslate(-r0.getScrollX(), -r0.getScrollY());
    L6:
        r4.preTranslate(r3.getLeft(), r3.getTop());
        if (r3.getMatrix().isIdentity() == true) goto L10;
        r4.preConcat(r3.getMatrix());
        return;
    }
}
