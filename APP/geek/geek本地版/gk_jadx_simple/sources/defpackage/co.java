package defpackage;

import android.graphics.Rect;
import android.view.Gravity;

/* JADX INFO: loaded from: classes.dex */
public abstract class co {
    public static void a(int r0, int r1, int r2, Rect r3, int r4, int r5, Rect r6, int r7) {
        Gravity.apply(r0, r1, r2, r3, r4, r5, r6, r7);
    }

    public static void b(int r0, int r1, int r2, Rect r3, Rect r4, int r5) {
        Gravity.apply(r0, r1, r2, r3, r4, r5);
    }

    public static void c(int r0, Rect r1, Rect r2, int r3) {
        Gravity.applyDisplay(r0, r1, r2, r3);
    }
}
