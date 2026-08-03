package p006D;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;
import p013H.AbstractC0201a;

/* JADX INFO: renamed from: D.L */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0075L {
    /* JADX INFO: renamed from: a */
    public static View.AccessibilityDelegate m267a(View r02) {
        return r02.getAccessibilityDelegate();
    }

    /* JADX INFO: renamed from: b */
    public static ContentCaptureSession m268b(View r02) {
        return r02.getContentCaptureSession();
    }

    /* JADX INFO: renamed from: c */
    public static List<Rect> m269c(View r02) {
        return r02.getSystemGestureExclusionRects();
    }

    /* JADX INFO: renamed from: d */
    public static void m270d(View r02, Context r1, int[] r2, AttributeSet r3, TypedArray r4, int r5, int r6) {
        r02.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6);
    }

    /* JADX INFO: renamed from: e */
    public static void m271e(View r02, AbstractC0201a r1) {
        r02.setContentCaptureSession(null);
    }

    /* JADX INFO: renamed from: f */
    public static void m272f(View r02, List<Rect> r1) {
        r02.setSystemGestureExclusionRects(r1);
    }
}
