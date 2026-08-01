package defpackage;

import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    public static int a(AccessibilityEvent r0) {
        return r0.getContentChangeTypes();
    }

    public static void b(AccessibilityEvent r0, int r1) {
        r0.setContentChangeTypes(r1);
    }
}
