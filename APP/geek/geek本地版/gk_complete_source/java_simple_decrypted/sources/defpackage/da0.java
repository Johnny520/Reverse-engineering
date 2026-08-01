package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class da0 {
    public static View.AccessibilityDelegate a(View r0) {
        return r0.getAccessibilityDelegate();
    }

    public static List<Rect> b(View r0) {
        return r0.getSystemGestureExclusionRects();
    }

    public static void c(View r0, Context r1, int[] r2, AttributeSet r3, TypedArray r4, int r5, int r6) {
        r0.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6);
    }

    public static void d(View r0, List<Rect> r1) {
        r0.setSystemGestureExclusionRects(r1);
    }
}
