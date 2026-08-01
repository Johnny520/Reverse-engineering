package defpackage;

import android.view.accessibility.AccessibilityRecord;

/* JADX INFO: loaded from: classes.dex */
public abstract class m0 {
    public static int a(AccessibilityRecord r0) {
        return r0.getMaxScrollX();
    }

    public static int b(AccessibilityRecord r0) {
        return r0.getMaxScrollY();
    }

    public static void c(AccessibilityRecord r0, int r1) {
        r0.setMaxScrollX(r1);
    }

    public static void d(AccessibilityRecord r0, int r1) {
        r0.setMaxScrollY(r1);
    }
}
