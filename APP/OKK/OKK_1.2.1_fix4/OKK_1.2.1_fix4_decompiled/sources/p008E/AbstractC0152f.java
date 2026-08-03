package p008E;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: E.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0152f {
    /* JADX INFO: renamed from: a */
    public static Object m478a(int i2, float f2, float f3, float f4) {
        return new AccessibilityNodeInfo.RangeInfo(i2, f2, f3, f4);
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m479b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    /* JADX INFO: renamed from: c */
    public static void m480c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
