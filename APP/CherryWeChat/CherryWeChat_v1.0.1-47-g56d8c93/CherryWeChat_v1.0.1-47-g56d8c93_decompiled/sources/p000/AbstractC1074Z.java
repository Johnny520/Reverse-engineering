package p000;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: Z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1074Z {
    /* JADX INFO: renamed from: a */
    public static int m2013a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getChecked();
    }

    /* JADX INFO: renamed from: b */
    public static int m2014b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExpandedState();
    }

    /* JADX INFO: renamed from: c */
    public static CharSequence m2015c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getSupplementalDescription();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m2016d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isFieldRequired();
    }
}
