package p000;

import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0912y {
    /* JADX INFO: renamed from: a */
    public static int m2711a(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    /* JADX INFO: renamed from: b */
    public static void m2712b(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }
}
