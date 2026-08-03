package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: NE */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0574NE {

    /* JADX INFO: renamed from: a */
    public static final C0831TE f1868a;

    /* JADX INFO: renamed from: b */
    public static final C2264n7 f1869b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f1868a = new C0874UE();
        } else {
            f1868a = new C0831TE();
        }
        f1869b = new C2264n7(6, Float.class, "translationAlpha");
        new C2264n7(7, Rect.class, "clipBounds");
    }

    /* JADX INFO: renamed from: a */
    public static void m1116a(View view, int i, int i2, int i3, int i4) {
        f1868a.mo1656Z(view, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: b */
    public static void m1117b(View view, int i) {
        f1868a.mo1253R(view, i);
    }
}
