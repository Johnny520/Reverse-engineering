package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ia0 {
    /* JADX INFO: renamed from: a */
    public static View.AccessibilityDelegate m1491a(View view) {
        return view.getAccessibilityDelegate();
    }

    /* JADX INFO: renamed from: b */
    public static List<Rect> m1492b(View view) {
        return view.getSystemGestureExclusionRects();
    }

    /* JADX INFO: renamed from: c */
    public static void m1493c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }

    /* JADX INFO: renamed from: d */
    public static void m1494d(View view, List<Rect> list) {
        view.setSystemGestureExclusionRects(list);
    }
}
