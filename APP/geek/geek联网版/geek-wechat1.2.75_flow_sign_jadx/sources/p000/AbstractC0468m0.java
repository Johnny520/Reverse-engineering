package p000;

import android.view.accessibility.AccessibilityRecord;

/* JADX INFO: renamed from: m0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0468m0 {
    /* JADX INFO: renamed from: a */
    public static int m1790a(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollX();
    }

    /* JADX INFO: renamed from: b */
    public static int m1791b(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollY();
    }

    /* JADX INFO: renamed from: c */
    public static void m1792c(AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollX(i);
    }

    /* JADX INFO: renamed from: d */
    public static void m1793d(AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollY(i);
    }
}
