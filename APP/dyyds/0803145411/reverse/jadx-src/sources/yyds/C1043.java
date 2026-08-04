package yyds;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: yyds.ᛵᛲᛶᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1043 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final C1043 f4741;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final C1043 f4742;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final C1043 f4743;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final C1043 f4744;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final C1043 f4745;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final C1043 f4746;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Object f4747;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int f4748;

    /* JADX WARN: Removed duplicated region for block: B:30:0x01d0  */
    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        new C1043(1, null, null);
        new C1043(2, null, null);
        new C1043(4, null, null);
        new C1043(8, null, null);
        new C1043(16, null, null);
        new C1043(32, null, null);
        new C1043(64, null, null);
        new C1043(128, null, null);
        new C1043(256, AbstractC0121.class, null);
        new C1043(512, AbstractC0121.class, null);
        new C1043(1024, AbstractC1099.class, null);
        new C1043(2048, AbstractC1099.class, null);
        f4744 = new C1043(4096, null, null);
        f4746 = new C1043(8192, null, null);
        new C1043(16384, null, null);
        new C1043(32768, null, null);
        new C1043(65536, null, null);
        new C1043(131072, AbstractC1387.class, null);
        new C1043(262144, null, null);
        new C1043(524288, null, null);
        new C1043(1048576, null, null);
        new C1043(2097152, AbstractC2331.class, null);
        new C1043(R.id.accessibilityActionShowOnScreen, null, AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN);
        f4742 = new C1043(R.id.accessibilityActionScrollToPosition, AbstractC2304.class, AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION);
        f4745 = new C1043(R.id.accessibilityActionScrollUp, null, AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP);
        new C1043(R.id.accessibilityActionScrollLeft, null, AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT);
        f4743 = new C1043(R.id.accessibilityActionScrollDown, null, AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN);
        new C1043(R.id.accessibilityActionScrollRight, null, AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT);
        new C1043(R.id.accessibilityActionPageUp, null, AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP);
        new C1043(R.id.accessibilityActionPageDown, null, AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN);
        new C1043(R.id.accessibilityActionPageLeft, null, AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT);
        new C1043(R.id.accessibilityActionPageRight, null, AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT);
        new C1043(R.id.accessibilityActionContextClick, null, AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK);
        new C1043(R.id.accessibilityActionSetProgress, AbstractC1895.class, AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS);
        new C1043(R.id.accessibilityActionMoveWindow, AbstractC1892.class, AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW);
        new C1043(R.id.accessibilityActionShowTooltip, null, AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP);
        new C1043(R.id.accessibilityActionHideTooltip, null, AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP);
        new C1043(R.id.accessibilityActionPressAndHold, null, AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD);
        new C1043(R.id.accessibilityActionImeEnter, null, AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER);
        int i = Build.VERSION.SDK_INT;
        new C1043(R.id.accessibilityActionDragStart, null, i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null);
        new C1043(R.id.accessibilityActionDragDrop, null, i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null);
        new C1043(R.id.accessibilityActionDragCancel, null, i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null);
        new C1043(R.id.accessibilityActionShowTextSuggestions, null, i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null);
        f4741 = new C1043(R.id.accessibilityActionScrollInDirection, null, i >= 34 ? AbstractC2470.m4519() : null);
        int i2 = AbstractC1827.f9181;
        if (i < 36) {
            accessibilityAction = null;
        } else {
            if ((i < 36 ? i * 100000 : Build.VERSION.SDK_INT_FULL) >= 3600001) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_EXTENDED_SELECTION;
            }
        }
        new C1043(R.id.ALT, null, accessibilityAction);
    }

    public C1043(int i, Class cls, Object obj) {
        this.f4748 = i;
        if (obj == null) {
            this.f4747 = new AccessibilityNodeInfo.AccessibilityAction(i, null);
        } else {
            this.f4747 = obj;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1043)) {
            return false;
        }
        Object obj2 = ((C1043) obj).f4747;
        Object obj3 = this.f4747;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f4747;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strM584 = C0134.m584(this.f4748);
        if (strM584.equals("ACTION_UNKNOWN")) {
            Object obj = this.f4747;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strM584 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strM584);
        return sb.toString();
    }
}
