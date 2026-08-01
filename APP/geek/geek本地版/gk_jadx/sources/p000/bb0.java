package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class bb0 {

    /* JADX INFO: renamed from: a */
    public static final db0 f804a;

    /* JADX INFO: renamed from: b */
    public static final C0884x8 f805b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f804a = new eb0();
        } else {
            f804a = new db0();
        }
        f805b = new C0884x8(Float.class, "translationAlpha", 5);
        new C0884x8(Rect.class, "clipBounds", 6);
    }

    /* JADX INFO: renamed from: a */
    public static void m551a(View view, int i, int i2, int i3, int i4) {
        f804a.mo934T(view, i, i2, i3, i4);
    }
}
