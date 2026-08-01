package p099y;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;
import p002B.AbstractC0054a;

/* JADX INFO: renamed from: y.F */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1042F {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static View.AccessibilityDelegate m2266a(View view) {
        return view.getAccessibilityDelegate();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static ContentCaptureSession m2267b(View view) {
        return view.getContentCaptureSession();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static List<Rect> m2268c(View view) {
        return view.getSystemGestureExclusionRects();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m2269d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m2270e(View view, AbstractC0054a abstractC0054a) {
        view.setContentCaptureSession(null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static void m2271f(View view, List<Rect> list) {
        view.setSystemGestureExclusionRects(list);
    }
}
