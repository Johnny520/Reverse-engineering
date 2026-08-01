package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class gb0 {

    /* JADX INFO: renamed from: a */
    public static final ib0 f1949a;

    /* JADX INFO: renamed from: b */
    public static final C0327i9 f1950b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f1949a = new jb0();
        } else {
            f1949a = new ib0();
        }
        f1950b = new C0327i9(Float.class, "translationAlpha", 5);
        new C0327i9(Rect.class, "clipBounds", 6);
    }

    /* JADX INFO: renamed from: a */
    public static void m1221a(View view, int i, int i2, int i3, int i4) {
        f1949a.mo1498P(view, i, i2, i3, i4);
    }
}
