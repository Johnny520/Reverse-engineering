package p101z;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: z.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1102c {

    /* JADX INFO: renamed from: c */
    public static final C1102c f3743c;

    /* JADX INFO: renamed from: d */
    public static final C1102c f3744d;

    /* JADX INFO: renamed from: e */
    public static final C1102c f3745e;

    /* JADX INFO: renamed from: f */
    public static final C1102c f3746f;

    /* JADX INFO: renamed from: a */
    public final Object f3747a;

    /* JADX INFO: renamed from: b */
    public final int f3748b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new C1102c(null, 1, null);
        new C1102c(null, 2, null);
        new C1102c(null, 4, null);
        new C1102c(null, 8, null);
        new C1102c(null, 16, null);
        new C1102c(null, 32, null);
        new C1102c(null, 64, null);
        new C1102c(null, 128, null);
        new C1102c(null, 256, AbstractC1108i.class);
        new C1102c(null, 512, AbstractC1108i.class);
        new C1102c(null, 1024, AbstractC1109j.class);
        new C1102c(null, 2048, AbstractC1109j.class);
        f3743c = new C1102c(null, 4096, null);
        f3744d = new C1102c(null, 8192, null);
        new C1102c(null, 16384, null);
        new C1102c(null, 32768, null);
        new C1102c(null, 65536, null);
        new C1102c(null, 131072, AbstractC1113n.class);
        new C1102c(null, 262144, null);
        new C1102c(null, 524288, null);
        new C1102c(null, 1048576, null);
        new C1102c(null, 2097152, AbstractC1114o.class);
        int i2 = Build.VERSION.SDK_INT;
        new C1102c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null);
        new C1102c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, AbstractC1111l.class);
        f3745e = new C1102c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null);
        new C1102c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null);
        f3746f = new C1102c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null);
        new C1102c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null);
        new C1102c(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null);
        new C1102c(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null);
        new C1102c(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null);
        new C1102c(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null);
        new C1102c(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null);
        new C1102c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, AbstractC1112m.class);
        new C1102c(i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, AbstractC1110k.class);
        new C1102c(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null);
        new C1102c(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null);
        new C1102c(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null);
        new C1102c(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null);
        new C1102c(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null);
        new C1102c(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null);
        new C1102c(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null);
        new C1102c(i2 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null);
        new C1102c(i2 >= 34 ? AbstractC1105f.m2384a() : null, R.id.accessibilityActionScrollInDirection, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1102c(Object obj, int i2, Class cls) {
        this.f3748b = i2;
        if (obj == null) {
            this.f3747a = new AccessibilityNodeInfo.AccessibilityAction(i2, null);
        } else {
            this.f3747a = obj;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1102c)) {
            return false;
        }
        Object obj2 = ((C1102c) obj).f3747a;
        Object obj3 = this.f3747a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.f3747a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strM2396b = C1107h.m2396b(this.f3748b);
        if (strM2396b.equals("ACTION_UNKNOWN")) {
            Object obj = this.f3747a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strM2396b = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strM2396b);
        return sb.toString();
    }
}
