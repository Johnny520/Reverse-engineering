package p008E;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: E.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0153g {
    /* JADX INFO: renamed from: a */
    public static C0155i m481a(boolean z2, int i2, int i3, int i4, int i5, boolean z3, String str, String str2) {
        return new C0155i(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z2).setColumnIndex(i2).setRowIndex(i3).setColumnSpan(i4).setRowSpan(i5).setSelected(z3).setRowTitle(str).setColumnTitle(str2).build());
    }

    /* JADX INFO: renamed from: b */
    public static C0156j m482b(AccessibilityNodeInfo accessibilityNodeInfo, int i2, int i3) {
        AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i2, i3);
        if (child != null) {
            return new C0156j(child, 0);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static String m483c(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
    }

    /* JADX INFO: renamed from: d */
    public static String m484d(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
    }

    /* JADX INFO: renamed from: e */
    public static AccessibilityNodeInfo.ExtraRenderingInfo m485e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtraRenderingInfo();
    }

    /* JADX INFO: renamed from: f */
    public static C0156j m486f(AccessibilityNodeInfo accessibilityNodeInfo, int i2) {
        AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent(i2);
        if (parent != null) {
            return new C0156j(parent, 0);
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static String m487g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m488h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    /* JADX INFO: renamed from: i */
    public static void m489i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z2) {
        accessibilityNodeInfo.setTextSelectable(z2);
    }

    /* JADX INFO: renamed from: j */
    public static void m490j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setUniqueId(str);
    }
}
