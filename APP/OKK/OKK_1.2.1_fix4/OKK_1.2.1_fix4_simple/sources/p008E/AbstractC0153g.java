package p008E;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: E.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0153g {
    /* JADX INFO: renamed from: a */
    public static C0155i m481a(boolean r2, int r3, int r4, int r5, int r6, boolean r7, String r8, String r9) {
        return new C0155i(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(r2).setColumnIndex(r3).setRowIndex(r4).setColumnSpan(r5).setRowSpan(r6).setSelected(r7).setRowTitle(r8).setColumnTitle(r9).build());
    }

    /* JADX INFO: renamed from: b */
    public static C0156j m482b(AccessibilityNodeInfo r02, int r1, int r2) {
        AccessibilityNodeInfo r03 = r02.getChild(r1, r2);
        if (r03 != null) goto L7;
        return null;
    L7:
        return new C0156j(r03, 0);
    }

    /* JADX INFO: renamed from: c */
    public static String m483c(Object r02) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) r02).getColumnTitle();
    }

    /* JADX INFO: renamed from: d */
    public static String m484d(Object r02) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) r02).getRowTitle();
    }

    /* JADX INFO: renamed from: e */
    public static AccessibilityNodeInfo.ExtraRenderingInfo m485e(AccessibilityNodeInfo r02) {
        return r02.getExtraRenderingInfo();
    }

    /* JADX INFO: renamed from: f */
    public static C0156j m486f(AccessibilityNodeInfo r1, int r2) {
        AccessibilityNodeInfo r12 = r1.getParent(r2);
        if (r12 != null) goto L7;
        return null;
    L7:
        return new C0156j(r12, 0);
    }

    /* JADX INFO: renamed from: g */
    public static String m487g(AccessibilityNodeInfo r02) {
        return r02.getUniqueId();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m488h(AccessibilityNodeInfo r02) {
        return r02.isTextSelectable();
    }

    /* JADX INFO: renamed from: i */
    public static void m489i(AccessibilityNodeInfo r02, boolean r1) {
        r02.setTextSelectable(r1);
    }

    /* JADX INFO: renamed from: j */
    public static void m490j(AccessibilityNodeInfo r02, String r1) {
        r02.setUniqueId(r1);
    }
}
