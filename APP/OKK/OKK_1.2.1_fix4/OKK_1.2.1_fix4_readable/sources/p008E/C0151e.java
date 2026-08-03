package p008E;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import org.luckypray.dexkit.result.MethodData;

/* JADX INFO: renamed from: E.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0151e {

    /* JADX INFO: renamed from: e */
    public static final C0151e f344e;

    /* JADX INFO: renamed from: f */
    public static final C0151e f345f;

    /* JADX INFO: renamed from: g */
    public static final C0151e f346g;

    /* JADX INFO: renamed from: h */
    public static final C0151e f347h;

    /* JADX INFO: renamed from: i */
    public static final C0151e f348i;

    /* JADX INFO: renamed from: j */
    public static final C0151e f349j;

    /* JADX INFO: renamed from: k */
    public static final C0151e f350k;

    /* JADX INFO: renamed from: l */
    public static final C0151e f351l;

    /* JADX INFO: renamed from: a */
    public final Object f352a;

    /* JADX INFO: renamed from: b */
    public final int f353b;

    /* JADX INFO: renamed from: c */
    public final Class f354c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0166t f355d;

    static {
        new C0151e(1);
        new C0151e(2);
        new C0151e(4);
        new C0151e(8);
        f344e = new C0151e(16);
        new C0151e(32);
        new C0151e(64);
        new C0151e(128);
        new C0151e(256, AbstractC0159m.class);
        new C0151e(512, AbstractC0159m.class);
        new C0151e(1024, AbstractC0160n.class);
        new C0151e(2048, AbstractC0160n.class);
        f345f = new C0151e(4096);
        f346g = new C0151e(8192);
        new C0151e(16384);
        new C0151e(32768);
        new C0151e(65536);
        new C0151e(MethodData.ACC_DECLARED_SYNCHRONIZED, AbstractC0164r.class);
        f347h = new C0151e(262144);
        f348i = new C0151e(524288);
        f349j = new C0151e(1048576);
        new C0151e(2097152, AbstractC0165s.class);
        int i2 = Build.VERSION.SDK_INT;
        new C0151e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new C0151e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, AbstractC0162p.class);
        f350k = new C0151e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new C0151e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f351l = new C0151e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new C0151e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new C0151e(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new C0151e(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new C0151e(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new C0151e(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new C0151e(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new C0151e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, AbstractC0163q.class);
        new C0151e(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, AbstractC0161o.class);
        new C0151e(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new C0151e(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new C0151e(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new C0151e(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new C0151e(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new C0151e(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new C0151e(i2 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new C0151e(i2 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new C0151e(i2 >= 34 ? AbstractC0154h.m491a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public C0151e(int i2) {
        this(null, i2, null, null, null);
    }

    /* JADX INFO: renamed from: a */
    public final int m477a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f352a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0151e)) {
            return false;
        }
        Object obj2 = ((C0151e) obj).f352a;
        Object obj3 = this.f352a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f352a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strM504d = C0156j.m504d(this.f353b);
        if (strM504d.equals("ACTION_UNKNOWN")) {
            Object obj = this.f352a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strM504d = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strM504d);
        return sb.toString();
    }

    public C0151e(int i2, Class cls) {
        this(null, i2, null, null, cls);
    }

    public C0151e(Object obj, int i2, String str, InterfaceC0166t interfaceC0166t, Class cls) {
        this.f353b = i2;
        this.f355d = interfaceC0166t;
        if (obj == null) {
            this.f352a = new AccessibilityNodeInfo.AccessibilityAction(i2, str);
        } else {
            this.f352a = obj;
        }
        this.f354c = cls;
    }
}
