package p234s1;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import p218p1.AbstractC2889a;

/* JADX INFO: renamed from: s1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C3172d {

    /* JADX INFO: renamed from: c */
    public static final C3172d f9921c;

    /* JADX INFO: renamed from: d */
    public static final C3172d f9922d;

    /* JADX INFO: renamed from: e */
    public static final C3172d f9923e;

    /* JADX INFO: renamed from: f */
    public static final C3172d f9924f;

    /* JADX INFO: renamed from: g */
    public static final C3172d f9925g;

    /* JADX INFO: renamed from: h */
    public static final C3172d f9926h;

    /* JADX INFO: renamed from: i */
    public static final C3172d f9927i;

    /* JADX INFO: renamed from: j */
    public static final C3172d f9928j;

    /* JADX INFO: renamed from: a */
    public final Object f9929a;

    /* JADX INFO: renamed from: b */
    public final int f9930b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0206  */
    static {
        boolean z5 = true;
        new C3172d(null, 1, null, null);
        new C3172d(null, 2, null, null);
        new C3172d(null, 4, null, null);
        new C3172d(null, 8, null, null);
        new C3172d(null, 16, null, null);
        new C3172d(null, 32, null, null);
        f9921c = new C3172d(null, 64, null, null);
        f9922d = new C3172d(null, 128, null, null);
        new C3172d(null, 256, null, AbstractC3177i.class);
        new C3172d(null, 512, null, AbstractC3177i.class);
        new C3172d(null, 1024, null, AbstractC3178j.class);
        new C3172d(null, 2048, null, AbstractC3178j.class);
        f9923e = new C3172d(null, 4096, null, null);
        f9924f = new C3172d(null, 8192, null, null);
        new C3172d(null, 16384, null, null);
        new C3172d(null, 32768, null, null);
        new C3172d(null, 65536, null, null);
        new C3172d(null, 131072, null, AbstractC3182n.class);
        new C3172d(null, 262144, null, null);
        new C3172d(null, 524288, null, null);
        new C3172d(null, 1048576, null, null);
        new C3172d(null, 2097152, null, AbstractC3183o.class);
        new C3172d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null);
        new C3172d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, AbstractC3180l.class);
        f9925g = new C3172d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null);
        f9926h = new C3172d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null);
        f9927i = new C3172d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null);
        f9928j = new C3172d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null);
        int i5 = Build.VERSION.SDK_INT;
        new C3172d(i5 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null);
        new C3172d(i5 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null);
        new C3172d(i5 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null);
        new C3172d(i5 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null);
        new C3172d(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null);
        new C3172d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, AbstractC3181m.class);
        new C3172d(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, AbstractC3179k.class);
        new C3172d(i5 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null);
        new C3172d(i5 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null);
        new C3172d(i5 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null);
        new C3172d(i5 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null);
        new C3172d(i5 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null);
        new C3172d(i5 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null);
        new C3172d(i5 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null);
        new C3172d(i5 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null);
        new C3172d(i5 >= 34 ? AbstractC3170b.m5432a() : null, R.id.accessibilityActionScrollInDirection, null, null);
        int i6 = AbstractC2889a.f9146a;
        if (i5 < 36) {
            z5 = false;
        } else {
            if ((i5 < 36 ? i5 * 100000 : Build.VERSION.SDK_INT_FULL) < 3600001) {
            }
        }
        new C3172d(z5 ? AbstractC3174f.m5446a() : null, R.id.ALT, null, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3172d(String str, int i5) {
        this(null, i5, str, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C3172d)) {
            return false;
        }
        Object obj2 = ((C3172d) obj).f9929a;
        Object obj3 = this.f9929a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object obj = this.f9929a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strM5447c = C3175g.m5447c(this.f9930b);
        if (strM5447c.equals("ACTION_UNKNOWN")) {
            Object obj = this.f9929a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strM5447c = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strM5447c);
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3172d(Object obj, int i5, CharSequence charSequence, Class cls) {
        this.f9930b = i5;
        if (obj == null) {
            this.f9929a = new AccessibilityNodeInfo.AccessibilityAction(i5, charSequence);
        } else {
            this.f9929a = obj;
        }
    }
}
