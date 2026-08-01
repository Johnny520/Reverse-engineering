package p101z;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: z.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1103d {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Object m2371a(int i2, float f, float f2, float f3) {
        return new AccessibilityNodeInfo.RangeInfo(i2, f, f2, f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static CharSequence m2372b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m2373c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
