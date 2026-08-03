package p043Y;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: Y.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0465x {

    /* JADX INFO: renamed from: a */
    public static final C0437C f1048a;

    /* JADX INFO: renamed from: b */
    public static final C0443b f1049b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f1048a = new C0438D();
        } else {
            f1048a = new C0437C();
        }
        f1049b = new C0443b(Float.class, "translationAlpha", 5);
        new C0443b(Rect.class, "clipBounds", 6);
    }

    /* JADX INFO: renamed from: a */
    public static void m1095a(View view, int i2, int i3, int i4, int i5) {
        f1048a.mo1038y0(view, i2, i3, i4, i5);
    }

    /* JADX INFO: renamed from: b */
    public static void m1096b(View view, int i2) {
        f1048a.mo925l0(view, i2);
    }
}
