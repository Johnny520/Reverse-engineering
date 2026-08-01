package p000;

import android.graphics.Rect;
import android.view.Gravity;

/* JADX INFO: renamed from: co */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0111co {
    /* JADX INFO: renamed from: a */
    public static void m693a(int i, int i2, int i3, Rect rect, int i4, int i5, Rect rect2, int i6) {
        Gravity.apply(i, i2, i3, rect, i4, i5, rect2, i6);
    }

    /* JADX INFO: renamed from: b */
    public static void m694b(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        Gravity.apply(i, i2, i3, rect, rect2, i4);
    }

    /* JADX INFO: renamed from: c */
    public static void m695c(int i, Rect rect, Rect rect2, int i2) {
        Gravity.applyDisplay(i, rect, rect2, i2);
    }
}
