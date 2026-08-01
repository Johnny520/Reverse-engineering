package p000;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class z90 {
    /* JADX INFO: renamed from: a */
    public static Rect m2822a(View view) {
        return view.getClipBounds();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2823b(View view) {
        return view.isInLayout();
    }

    /* JADX INFO: renamed from: c */
    public static void m2824c(View view, Rect rect) {
        view.setClipBounds(rect);
    }
}
