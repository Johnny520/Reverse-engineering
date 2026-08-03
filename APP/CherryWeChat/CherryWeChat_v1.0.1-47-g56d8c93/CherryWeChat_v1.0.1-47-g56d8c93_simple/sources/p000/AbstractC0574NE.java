package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: NE */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0574NE {

    /* JADX INFO: renamed from: a */
    public static final C0831TE f1868a = null;

    /* JADX INFO: renamed from: b */
    public static final C2264n7 f1869b = null;

    static {
        if (Build.VERSION.SDK_INT < 29) goto L5;
        f1868a = new C0874UE();
    L6:
        f1869b = new C2264n7(6, Float.class, "translationAlpha");
        new C2264n7(7, Rect.class, "clipBounds");
        return;
    L5:
        f1868a = new C0831TE();
        goto L6
    }

    /* JADX INFO: renamed from: a */
    public static void m1116a(View r6, int r7, int r8, int r9, int r10) {
        f1868a.mo1656Z(r6, r7, r8, r9, r10);
    }

    /* JADX INFO: renamed from: b */
    public static void m1117b(View r1, int r2) {
        f1868a.mo1253R(r1, r2);
    }
}
