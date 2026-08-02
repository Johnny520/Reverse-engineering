package p000;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: f4 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0190f4 {

    /* JADX INFO: renamed from: c */
    public static final C0190f4 f2774c;

    /* JADX INFO: renamed from: d */
    public static final C0190f4 f2775d;

    /* JADX INFO: renamed from: e */
    public static final C0190f4 f2776e;

    /* JADX INFO: renamed from: f */
    public static final C0190f4 f2777f;

    /* JADX INFO: renamed from: g */
    public static final C0190f4 f2778g;

    /* JADX INFO: renamed from: h */
    public static final C0190f4 f2779h;

    /* JADX INFO: renamed from: i */
    public static final C0190f4 f2780i;

    /* JADX INFO: renamed from: j */
    public static final C0190f4 f2781j;

    /* JADX INFO: renamed from: a */
    public final Object f2782a;

    /* JADX INFO: renamed from: b */
    public final int f2783b;

    /* JADX WARN: Removed duplicated region for block: B:62:0x0206  */
    static {
        boolean z = true;
        new C0190f4(null, 1, null, null);
        new C0190f4(null, 2, null, null);
        new C0190f4(null, 4, null, null);
        new C0190f4(null, 8, null, null);
        new C0190f4(null, 16, null, null);
        new C0190f4(null, 32, null, null);
        f2774c = new C0190f4(null, 64, null, null);
        f2775d = new C0190f4(null, 128, null, null);
        new C0190f4(null, 256, null, AbstractC0604q4.class);
        new C0190f4(null, AIChatConfig.DefaultMaxTokens, null, AbstractC0604q4.class);
        new C0190f4(null, 1024, null, AbstractC0643r4.class);
        new C0190f4(null, 2048, null, AbstractC0643r4.class);
        f2776e = new C0190f4(null, 4096, null, null);
        f2777f = new C0190f4(null, 8192, null, null);
        new C0190f4(null, 16384, null, null);
        new C0190f4(null, AIChatConfig.MaxOutputTokens, null, null);
        new C0190f4(null, 65536, null, null);
        new C0190f4(null, 131072, null, AbstractC0797v4.class);
        new C0190f4(null, 262144, null, null);
        new C0190f4(null, 524288, null, null);
        new C0190f4(null, 1048576, null, null);
        new C0190f4(null, 2097152, null, AbstractC0834w4.class);
        new C0190f4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null);
        new C0190f4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, AbstractC0721t4.class);
        f2778g = new C0190f4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null);
        f2779h = new C0190f4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null);
        f2780i = new C0190f4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null);
        f2781j = new C0190f4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null);
        int i = Build.VERSION.SDK_INT;
        new C0190f4(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null);
        new C0190f4(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null);
        new C0190f4(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null);
        new C0190f4(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null);
        new C0190f4(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null);
        new C0190f4(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, AbstractC0760u4.class);
        new C0190f4(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, AbstractC0681s4.class);
        new C0190f4(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null);
        new C0190f4(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null);
        new C0190f4(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null);
        new C0190f4(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null);
        new C0190f4(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null);
        new C0190f4(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null);
        new C0190f4(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null);
        new C0190f4(i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null);
        new C0190f4(i >= 34 ? AbstractC0759u3.m5455a() : null, R.id.accessibilityActionScrollInDirection, null, null);
        int i2 = AbstractC0625qn.f9045a;
        if (i < 36) {
            z = false;
        } else {
            if ((i < 36 ? i * 100000 : Build.VERSION.SDK_INT_FULL) < 3600001) {
            }
        }
        new C0190f4(z ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_EXTENDED_SELECTION : null, R.id.ALT, null, null);
    }

    public C0190f4(Object obj, int i, CharSequence charSequence, Class cls) {
        this.f2783b = i;
        if (obj == null) {
            this.f2782a = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
        } else {
            this.f2782a = obj;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0190f4)) {
            return false;
        }
        Object obj2 = ((C0190f4) obj).f2782a;
        Object obj3 = this.f2782a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f2782a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strM2800c = C0411l4.m2800c(this.f2783b);
        if (strM2800c.equals("ACTION_UNKNOWN")) {
            Object obj = this.f2782a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strM2800c = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strM2800c);
        return sb.toString();
    }

    public C0190f4(String str, int i) {
        this(null, i, str, null);
    }
}
