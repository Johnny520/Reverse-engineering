package defpackage;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class u90 {
    public static Rect a(View r0) {
        return r0.getClipBounds();
    }

    public static boolean b(View r0) {
        return r0.isInLayout();
    }

    public static void c(View r0, Rect r1) {
        r0.setClipBounds(r1);
    }
}
