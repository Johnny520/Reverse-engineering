package p000;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;

/* JADX INFO: renamed from: w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0837w {
    /* JADX INFO: renamed from: a */
    public static AccessibilityNodeProvider m2583a(View.AccessibilityDelegate accessibilityDelegate, View view) {
        return accessibilityDelegate.getAccessibilityNodeProvider(view);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2584b(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
        return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
    }
}
