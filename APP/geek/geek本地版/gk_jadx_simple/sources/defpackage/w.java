package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    public static AccessibilityNodeProvider a(View.AccessibilityDelegate r0, View r1) {
        return r0.getAccessibilityNodeProvider(r1);
    }

    public static boolean b(View.AccessibilityDelegate r0, View r1, int r2, Bundle r3) {
        return r0.performAccessibilityAction(r1, r2, r3);
    }
}
