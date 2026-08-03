package p043Y;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: Y.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0465x {

    /* JADX INFO: renamed from: a */
    public static final C0437C f1048a = null;

    /* JADX INFO: renamed from: b */
    public static final C0443b f1049b = null;

    static {
        if (Build.VERSION.SDK_INT < 29) goto L5;
        f1048a = new C0438D();
    L6:
        f1049b = new C0443b(Float.class, "translationAlpha", 5);
        new C0443b(Rect.class, "clipBounds", 6);
        return;
    L5:
        f1048a = new C0437C();
        goto L6
    }

    /* JADX INFO: renamed from: a */
    public static void m1095a(View r6, int r7, int r8, int r9, int r10) {
        f1048a.mo1038y0(r6, r7, r8, r9, r10);
    }

    /* JADX INFO: renamed from: b */
    public static void m1096b(View r1, int r2) {
        f1048a.mo925l0(r1, r2);
    }
}
