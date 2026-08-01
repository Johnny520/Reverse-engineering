package p101z;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: z.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1104e {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C1106g m2374a(boolean z2, int i2, int i3, int i4, int i5, boolean z3, String str, String str2) {
        new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z2).setColumnIndex(i2).setRowIndex(i3).setColumnSpan(i4).setRowSpan(i5).setSelected(z3).setRowTitle(str).setColumnTitle(str2).build();
        return new C1106g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C1107h m2375b(AccessibilityNodeInfo accessibilityNodeInfo, int i2, int i3) {
        AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i2, i3);
        if (child != null) {
            return new C1107h(child, 0);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static String m2376c(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m2377d(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static AccessibilityNodeInfo.ExtraRenderingInfo m2378e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtraRenderingInfo();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static C1107h m2379f(AccessibilityNodeInfo accessibilityNodeInfo, int i2) {
        AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent(i2);
        if (parent != null) {
            return new C1107h(parent, 0);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static String m2380g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static boolean m2381h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m2382i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z2) {
        accessibilityNodeInfo.setTextSelectable(z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m2383j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setUniqueId(str);
    }
}
