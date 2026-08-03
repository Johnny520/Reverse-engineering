package p000;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: V */
/* JADX INFO: loaded from: classes.dex */
public final class C0902V {

    /* JADX INFO: renamed from: e */
    public static final C0902V f2802e;

    /* JADX INFO: renamed from: f */
    public static final C0902V f2803f;

    /* JADX INFO: renamed from: g */
    public static final C0902V f2804g;

    /* JADX INFO: renamed from: h */
    public static final C0902V f2805h;

    /* JADX INFO: renamed from: i */
    public static final C0902V f2806i;

    /* JADX INFO: renamed from: j */
    public static final C0902V f2807j;

    /* JADX INFO: renamed from: k */
    public static final C0902V f2808k;

    /* JADX INFO: renamed from: l */
    public static final C0902V f2809l;

    /* JADX INFO: renamed from: a */
    public final Object f2810a;

    /* JADX INFO: renamed from: b */
    public final int f2811b;

    /* JADX INFO: renamed from: c */
    public final Class f2812c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2123k0 f2813d;

    static {
        new C0902V(1, (String) null);
        new C0902V(2, (String) null);
        new C0902V(4, (String) null);
        new C0902V(8, (String) null);
        f2802e = new C0902V(16, (String) null);
        new C0902V(32, (String) null);
        new C0902V(64, (String) null);
        new C0902V(128, (String) null);
        new C0902V(256, AbstractC1303d0.class);
        new C0902V(512, AbstractC1303d0.class);
        new C0902V(1024, AbstractC1346e0.class);
        new C0902V(2048, AbstractC1346e0.class);
        f2803f = new C0902V(4096, (String) null);
        f2804g = new C0902V(8192, (String) null);
        new C0902V(16384, (String) null);
        new C0902V(32768, (String) null);
        new C0902V(65536, (String) null);
        new C0902V(131072, AbstractC1522i0.class);
        f2805h = new C0902V(262144, (String) null);
        f2806i = new C0902V(524288, (String) null);
        f2807j = new C0902V(1048576, (String) null);
        new C0902V(2097152, AbstractC2079j0.class);
        int i = Build.VERSION.SDK_INT;
        new C0902V(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new C0902V(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, AbstractC1434g0.class);
        f2808k = new C0902V(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new C0902V(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f2809l = new C0902V(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new C0902V(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new C0902V(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new C0902V(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new C0902V(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new C0902V(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new C0902V(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new C0902V(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, AbstractC1478h0.class);
        new C0902V(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, AbstractC1390f0.class);
        new C0902V(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null, null);
        new C0902V(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null, null);
        new C0902V(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new C0902V(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new C0902V(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new C0902V(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new C0902V(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new C0902V(i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new C0902V(i >= 34 ? AbstractC1031Y.m1953a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public C0902V(int i, String str) {
        this(null, i, str, null, null);
    }

    /* JADX INFO: renamed from: a */
    public final int m1752a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f2810a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0902V)) {
            return false;
        }
        Object obj2 = ((C0902V) obj).f2810a;
        Object obj3 = this.f2810a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f2810a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String strM2039d = C1118a0.m2039d(this.f2811b);
        if (strM2039d.equals("ACTION_UNKNOWN")) {
            Object obj = this.f2810a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strM2039d = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(strM2039d);
        return sb.toString();
    }

    public C0902V(int i, Class cls) {
        this(null, i, null, null, cls);
    }

    public C0902V(Object obj, int i, CharSequence charSequence, InterfaceC2123k0 interfaceC2123k0, Class cls) {
        this.f2811b = i;
        this.f2813d = interfaceC2123k0;
        if (obj == null) {
            this.f2810a = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
        } else {
            this.f2810a = obj;
        }
        this.f2812c = cls;
    }
}
