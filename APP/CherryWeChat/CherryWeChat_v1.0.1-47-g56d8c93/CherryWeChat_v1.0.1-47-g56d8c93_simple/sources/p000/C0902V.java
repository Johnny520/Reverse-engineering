package p000;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: V */
/* JADX INFO: loaded from: classes.dex */
public final class C0902V {

    /* JADX INFO: renamed from: e */
    public static final C0902V f2802e = null;

    /* JADX INFO: renamed from: f */
    public static final C0902V f2803f = null;

    /* JADX INFO: renamed from: g */
    public static final C0902V f2804g = null;

    /* JADX INFO: renamed from: h */
    public static final C0902V f2805h = null;

    /* JADX INFO: renamed from: i */
    public static final C0902V f2806i = null;

    /* JADX INFO: renamed from: j */
    public static final C0902V f2807j = null;

    /* JADX INFO: renamed from: k */
    public static final C0902V f2808k = null;

    /* JADX INFO: renamed from: l */
    public static final C0902V f2809l = null;

    /* JADX INFO: renamed from: a */
    public final Object f2810a;

    /* JADX INFO: renamed from: b */
    public final int f2811b;

    /* JADX INFO: renamed from: c */
    public final Class f2812c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2123k0 f2813d;

    static {
        AccessibilityNodeInfo.AccessibilityAction r2 = null;
        new C0902V(1, null);
        new C0902V(2, null);
        new C0902V(4, null);
        new C0902V(8, null);
        f2802e = new C0902V(16, null);
        new C0902V(32, null);
        new C0902V(64, null);
        new C0902V(128, null);
        new C0902V(256, AbstractC1303d0.class);
        new C0902V(512, AbstractC1303d0.class);
        new C0902V(1024, AbstractC1346e0.class);
        new C0902V(2048, AbstractC1346e0.class);
        f2803f = new C0902V(4096, null);
        f2804g = new C0902V(8192, null);
        new C0902V(16384, null);
        new C0902V(32768, null);
        new C0902V(65536, null);
        new C0902V(131072, AbstractC1522i0.class);
        f2805h = new C0902V(262144, null);
        f2806i = new C0902V(524288, null);
        f2807j = new C0902V(1048576, null);
        new C0902V(2097152, AbstractC2079j0.class);
        int r0 = Build.VERSION.SDK_INT;
        new C0902V(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new C0902V(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, AbstractC1434g0.class);
        f2808k = new C0902V(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new C0902V(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f2809l = new C0902V(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new C0902V(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        if (r0 < 29) goto L5;
        AccessibilityNodeInfo.AccessibilityAction r10 = AbstractC0688Q.m1408l();
    L6:
        new C0902V(r10, R.id.accessibilityActionPageUp, null, null, null);
        if (r0 < 29) goto L9;
        AccessibilityNodeInfo.AccessibilityAction r16 = AbstractC0688Q.m1419w();
    L10:
        new C0902V(r16, R.id.accessibilityActionPageDown, null, null, null);
        if (r0 < 29) goto L13;
        AccessibilityNodeInfo.AccessibilityAction r5 = AbstractC0688Q.m1393A();
    L14:
        new C0902V(r5, R.id.accessibilityActionPageLeft, null, null, null);
        if (r0 < 29) goto L17;
        AccessibilityNodeInfo.AccessibilityAction r11 = AbstractC0688Q.m1396D();
    L18:
        new C0902V(r11, R.id.accessibilityActionPageRight, null, null, null);
        new C0902V(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new C0902V(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, AbstractC1478h0.class);
        new C0902V(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, AbstractC1390f0.class);
        new C0902V(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null, null);
        new C0902V(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null, null);
        if (r0 < 30) goto L21;
        AccessibilityNodeInfo.AccessibilityAction r102 = AbstractC0773S.m1581l();
    L22:
        new C0902V(r102, R.id.accessibilityActionPressAndHold, null, null, null);
        if (r0 < 30) goto L25;
        AccessibilityNodeInfo.AccessibilityAction r162 = AbstractC0773S.m1592w();
    L26:
        new C0902V(r162, R.id.accessibilityActionImeEnter, null, null, null);
        if (r0 < 32) goto L29;
        AccessibilityNodeInfo.AccessibilityAction r4 = AbstractC0816T.m1617a();
    L30:
        new C0902V(r4, R.id.accessibilityActionDragStart, null, null, null);
        if (r0 < 32) goto L33;
        AccessibilityNodeInfo.AccessibilityAction r103 = AbstractC0816T.m1618b();
    L34:
        new C0902V(r103, R.id.accessibilityActionDragDrop, null, null, null);
        if (r0 < 32) goto L37;
        AccessibilityNodeInfo.AccessibilityAction r42 = AbstractC0816T.m1619c();
    L38:
        new C0902V(r42, R.id.accessibilityActionDragCancel, null, null, null);
        if (r0 < 33) goto L41;
        AccessibilityNodeInfo.AccessibilityAction r104 = AbstractC0859U.m1692b();
    L42:
        new C0902V(r104, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        if (r0 < 34) goto L45;
        r2 = AbstractC1031Y.m1953a();
    L45:
        new C0902V(r2, R.id.accessibilityActionScrollInDirection, null, null, null);
        return;
    L41:
        r104 = null;
        goto L42
    L37:
        r42 = null;
        goto L38
    L33:
        r103 = null;
        goto L34
    L29:
        r4 = null;
        goto L30
    L25:
        r162 = null;
        goto L26
    L21:
        r102 = null;
        goto L22
    L17:
        r11 = null;
        goto L18
    L13:
        r5 = null;
        goto L14
    L9:
        r16 = null;
        goto L10
    L5:
        r10 = null;
        goto L6
    }

    public C0902V(int r7, String r8) {
        this(null, r7, r8, null, null);
    }

    /* JADX INFO: renamed from: a */
    public final int m1752a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f2810a).getId();
    }

    public final boolean equals(Object r3) {
        if (r3 != null) goto L6;
        return false;
    L6:
        if ((r3 instanceof C0902V) == true) goto L8;
        return false;
    L8:
        Object r32 = ((C0902V) r3).f2810a;
        Object r1 = this.f2810a;
        if (r1 != null) goto L13;
        if (r32 == null) goto L15;
        return false;
    L15:
        return true;
    L13:
        if (r1.equals(r32) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        Object r0 = this.f2810a;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.hashCode();
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("AccessibilityActionCompat: ");
        String r1 = C1118a0.m2039d(this.f2811b);
        if (r1.equals("ACTION_UNKNOWN") == false) goto L7;
        Object r2 = this.f2810a;
        if (((AccessibilityNodeInfo.AccessibilityAction) r2).getLabel() == null) goto L7;
        r1 = ((AccessibilityNodeInfo.AccessibilityAction) r2).getLabel().toString();
    L7:
        r0.append(r1);
        return r0.toString();
    }

    public C0902V(int r7, Class r8) {
        this(null, r7, null, null, r8);
    }

    public C0902V(Object r1, int r2, CharSequence r3, InterfaceC2123k0 r4, Class r5) {
        this.f2811b = r2;
        this.f2813d = r4;
        if (r1 != null) goto L5;
        this.f2810a = new AccessibilityNodeInfo.AccessibilityAction(r2, r3);
    L6:
        this.f2812c = r5;
        return;
    L5:
        this.f2810a = r1;
        goto L6
    }
}
