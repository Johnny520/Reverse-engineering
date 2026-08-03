package p008E;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: E.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0152f {
    /* JADX INFO: renamed from: a */
    public static Object m478a(int r1, float r2, float r3, float r4) {
        return new AccessibilityNodeInfo.RangeInfo(r1, r2, r3, r4);
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m479b(AccessibilityNodeInfo r02) {
        return r02.getStateDescription();
    }

    /* JADX INFO: renamed from: c */
    public static void m480c(AccessibilityNodeInfo r02, CharSequence r1) {
        r02.setStateDescription(r1);
    }
}
