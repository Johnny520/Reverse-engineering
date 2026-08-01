package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class bb0 {
    public static final db0 a = null;
    public static final x8 b = null;

    static {
        if (Build.VERSION.SDK_INT < 29) goto L5;
        a = new eb0();
    L6:
        b = new x8(Float.class, "translationAlpha", 5);
        new x8(Rect.class, "clipBounds", 6);
        return;
    L5:
        a = new db0();
        goto L6
    }

    public static void a(View r6, int r7, int r8, int r9, int r10) {
        a.T(r6, r7, r8, r9, r10);
    }
}
