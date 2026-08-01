package p000;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0281h0 {

    /* JADX INFO: renamed from: e */
    public static final C0281h0 f2068e;

    /* JADX INFO: renamed from: f */
    public static final C0281h0 f2069f;

    /* JADX INFO: renamed from: g */
    public static final C0281h0 f2070g;

    /* JADX INFO: renamed from: h */
    public static final C0281h0 f2071h;

    /* JADX INFO: renamed from: i */
    public static final C0281h0 f2072i;

    /* JADX INFO: renamed from: j */
    public static final C0281h0 f2073j;

    /* JADX INFO: renamed from: k */
    public static final C0281h0 f2074k;

    /* JADX INFO: renamed from: l */
    public static final C0281h0 f2075l;

    /* JADX INFO: renamed from: a */
    public final Object f2076a;

    /* JADX INFO: renamed from: b */
    public final int f2077b;

    /* JADX INFO: renamed from: c */
    public final Class f2078c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0801v0 f2079d;

    static {
        new C0281h0(1);
        new C0281h0(2);
        new C0281h0(4);
        new C0281h0(8);
        f2068e = new C0281h0(16);
        new C0281h0(32);
        new C0281h0(64);
        new C0281h0(128);
        new C0281h0(256, AbstractC0542o0.class);
        new C0281h0(512, AbstractC0542o0.class);
        new C0281h0(1024, AbstractC0579p0.class);
        new C0281h0(2048, AbstractC0579p0.class);
        f2069f = new C0281h0(4096);
        f2070g = new C0281h0(8192);
        new C0281h0(16384);
        new C0281h0(32768);
        new C0281h0(65536);
        new C0281h0(131072, AbstractC0727t0.class);
        f2071h = new C0281h0(262144);
        f2072i = new C0281h0(524288);
        f2073j = new C0281h0(1048576);
        new C0281h0(2097152, AbstractC0764u0.class);
        int i = Build.VERSION.SDK_INT;
        new C0281h0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new C0281h0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, AbstractC0653r0.class);
        f2074k = new C0281h0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new C0281h0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f2075l = new C0281h0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new C0281h0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new C0281h0(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new C0281h0(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new C0281h0(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new C0281h0(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new C0281h0(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new C0281h0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, AbstractC0690s0.class);
        new C0281h0(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, AbstractC0616q0.class);
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
    public final int m1348a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f2076a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0281h0)) {
            return false;
        }
        Object obj2 = ((C0281h0) obj).f2076a;
        Object obj3 = this.f2076a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f2076a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public C0281h0(int i, Class cls) {
        this(null, i, null, null, cls);
    }

    public C0281h0(Object obj, int i, String str, InterfaceC0801v0 interfaceC0801v0, Class cls) {
        this.f2077b = i;
        this.f2079d = interfaceC0801v0;
        if (obj == null) {
            this.f2076a = new AccessibilityNodeInfo.AccessibilityAction(i, str);
        } else {
            this.f2076a = obj;
        }
        this.f2078c = cls;
    }
}
