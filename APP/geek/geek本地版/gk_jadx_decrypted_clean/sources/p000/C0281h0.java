package p000;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0281h0 {

    /* JADX INFO: renamed from: e */
    public static final C0281h0 f2180e;

    /* JADX INFO: renamed from: f */
    public static final C0281h0 f2181f;

    /* JADX INFO: renamed from: g */
    public static final C0281h0 f2182g;

    /* JADX INFO: renamed from: h */
    public static final C0281h0 f2183h;

    /* JADX INFO: renamed from: i */
    public static final C0281h0 f2184i;

    /* JADX INFO: renamed from: j */
    public static final C0281h0 f2185j;

    /* JADX INFO: renamed from: k */
    public static final C0281h0 f2186k;

    /* JADX INFO: renamed from: l */
    public static final C0281h0 f2187l;

    /* JADX INFO: renamed from: a */
    public final Object f2188a;

    /* JADX INFO: renamed from: b */
    public final int f2189b;

    /* JADX INFO: renamed from: c */
    public final Class f2190c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0802v0 f2191d;

    static {
        new C0281h0(1);
        new C0281h0(2);
        new C0281h0(4);
        new C0281h0(8);
        f2180e = new C0281h0(16);
        new C0281h0(32);
        new C0281h0(64);
        new C0281h0(128);
        new C0281h0(256, AbstractC0542o0.class);
        new C0281h0(512, AbstractC0542o0.class);
        new C0281h0(1024, AbstractC0579p0.class);
        new C0281h0(2048, AbstractC0579p0.class);
        f2181f = new C0281h0(4096);
        f2182g = new C0281h0(8192);
        new C0281h0(16384);
        new C0281h0(32768);
        new C0281h0(65536);
        new C0281h0(131072, AbstractC0728t0.class);
        f2183h = new C0281h0(262144);
        f2184i = new C0281h0(524288);
        f2185j = new C0281h0(1048576);
        new C0281h0(2097152, AbstractC0765u0.class);
        int i = Build.VERSION.SDK_INT;
        new C0281h0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new C0281h0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, AbstractC0654r0.class);
        f2186k = new C0281h0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new C0281h0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f2187l = new C0281h0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new C0281h0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new C0281h0(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new C0281h0(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new C0281h0(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new C0281h0(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new C0281h0(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new C0281h0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, AbstractC0691s0.class);
        new C0281h0(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, AbstractC0617q0.class);
        new C0281h0(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new C0281h0(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new C0281h0(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new C0281h0(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new C0281h0(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new C0281h0(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new C0281h0(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new C0281h0(i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
    }

    public C0281h0(int i) {
        this(null, i, null, null, null);
    }

    /* JADX INFO: renamed from: a */
    public final int m1335a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f2188a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0281h0)) {
            return false;
        }
        Object obj2 = ((C0281h0) obj).f2188a;
        Object obj3 = this.f2188a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f2188a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public C0281h0(int i, Class cls) {
        this(null, i, null, null, cls);
    }

    public C0281h0(Object obj, int i, String str, InterfaceC0802v0 interfaceC0802v0, Class cls) {
        this.f2189b = i;
        this.f2191d = interfaceC0802v0;
        if (obj == null) {
            this.f2188a = new AccessibilityNodeInfo.AccessibilityAction(i, str);
        } else {
            this.f2188a = obj;
        }
        this.f2190c = cls;
    }
}
