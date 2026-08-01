package defpackage;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    public static boolean a(AccessibilityManager r1, a0 r2) {
        return r1.addTouchExplorationStateChangeListener(new b0(r2));
    }

    public static boolean b(AccessibilityManager r1, a0 r2) {
        return r1.removeTouchExplorationStateChangeListener(new b0(r2));
    }
}
