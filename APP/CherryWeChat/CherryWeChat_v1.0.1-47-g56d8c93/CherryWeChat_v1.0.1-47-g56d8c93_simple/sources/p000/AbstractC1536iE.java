package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: iE */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1536iE {
    /* JADX INFO: renamed from: a */
    public static View.AccessibilityDelegate m2913a(View r0) {
        return r0.getAccessibilityDelegate();
    }

    /* JADX INFO: renamed from: b */
    public static void m2914b(View r0, Context r1, int[] r2, AttributeSet r3, TypedArray r4, int r5, int r6) {
        r0.saveAttributeDataForStyleable(r1, r2, r3, r4, r5, r6);
    }
}
