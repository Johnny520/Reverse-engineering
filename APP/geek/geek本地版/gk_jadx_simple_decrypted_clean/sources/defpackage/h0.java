package defpackage;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    public static final h0 e = null;
    public static final h0 f = null;
    public static final h0 g = null;
    public static final h0 h = null;
    public static final h0 i = null;
    public static final h0 j = null;
    public static final h0 k = null;
    public static final h0 l = null;
    public final Object a;
    public final int b;
    public final Class c;
    public final v0 d;

    static {
        new h0(1);
        new h0(2);
        new h0(4);
        new h0(8);
        e = new h0(16);
        new h0(32);
        new h0(64);
        new h0(128);
        new h0(256, o0.class);
        new h0(512, o0.class);
        new h0(1024, p0.class);
        new h0(2048, p0.class);
        f = new h0(4096);
        g = new h0(8192);
        new h0(16384);
        new h0(32768);
        new h0(65536);
        new h0(131072, t0.class);
        h = new h0(262144);
        i = new h0(524288);
        j = new h0(1048576);
        new h0(2097152, u0.class);
        int r0 = Build.VERSION.SDK_INT;
        new h0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new h0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, r0.class);
        k = new h0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new h0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        l = new h0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new h0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        AccessibilityNodeInfo.AccessibilityAction r2 = null;
        if (r0 < 29) goto L5;
        AccessibilityNodeInfo.AccessibilityAction r9 = f0.h();
    L6:
        new h0(r9, R.id.accessibilityActionPageUp, null, null, null);
        if (r0 < 29) goto L9;
        AccessibilityNodeInfo.AccessibilityAction r15 = f0.w();
    L10:
        new h0(r15, R.id.accessibilityActionPageDown, null, null, null);
        if (r0 < 29) goto L13;
        AccessibilityNodeInfo.AccessibilityAction r5 = f0.A();
    L14:
        new h0(r5, R.id.accessibilityActionPageLeft, null, null, null);
        if (r0 < 29) goto L17;
        AccessibilityNodeInfo.AccessibilityAction r11 = f0.D();
    L18:
        new h0(r11, R.id.accessibilityActionPageRight, null, null, null);
        new h0(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new h0(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, s0.class);
        new h0(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, q0.class);
        if (r0 < 28) goto L21;
        AccessibilityNodeInfo.AccessibilityAction r10 = c0.l();
    L22:
        new h0(r10, R.id.accessibilityActionShowTooltip, null, null, null);
        if (r0 < 28) goto L25;
        AccessibilityNodeInfo.AccessibilityAction r16 = c0.w();
    L26:
        new h0(r16, R.id.accessibilityActionHideTooltip, null, null, null);
        if (r0 < 30) goto L29;
        AccessibilityNodeInfo.AccessibilityAction r4 = d0.l();
    L30:
        new h0(r4, R.id.accessibilityActionPressAndHold, null, null, null);
        if (r0 < 30) goto L33;
        AccessibilityNodeInfo.AccessibilityAction r112 = d0.y();
    L34:
        new h0(r112, R.id.accessibilityActionImeEnter, null, null, null);
        if (r0 < 32) goto L37;
        AccessibilityNodeInfo.AccessibilityAction r42 = g0.a();
    L38:
        new h0(r42, R.id.accessibilityActionDragStart, null, null, null);
        if (r0 < 32) goto L41;
        AccessibilityNodeInfo.AccessibilityAction r102 = g0.b();
    L42:
        new h0(r102, R.id.accessibilityActionDragDrop, null, null, null);
        if (r0 < 32) goto L45;
        AccessibilityNodeInfo.AccessibilityAction r43 = g0.c();
    L46:
        new h0(r43, R.id.accessibilityActionDragCancel, null, null, null);
        if (r0 < 33) goto L49;
        r2 = e0.a();
    L49:
        new h0(r2, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        return;
    L45:
        r43 = null;
        goto L46
    L41:
        r102 = null;
        goto L42
    L37:
        r42 = null;
        goto L38
    L33:
        r112 = null;
        goto L34
    L29:
        r4 = null;
        goto L30
    L25:
        r16 = null;
        goto L26
    L21:
        r10 = null;
        goto L22
    L17:
        r11 = null;
        goto L18
    L13:
        r5 = null;
        goto L14
    L9:
        r15 = null;
        goto L10
    L5:
        r9 = null;
        goto L6
    }

    public h0(int r7) {
        this(null, r7, null, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.a).getId();
    }

    public final boolean equals(Object r3) {
        if (r3 != null) goto L6;
        return false;
    L6:
        if ((r3 instanceof h0) == true) goto L8;
        return false;
    L8:
        Object r32 = ((h0) r3).a;
        Object r1 = this.a;
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
        Object r0 = this.a;
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.hashCode();
    }

    public h0(int r7, Class r8) {
        this(null, r7, null, null, r8);
    }

    public h0(Object r1, int r2, String r3, v0 r4, Class r5) {
        this.b = r2;
        this.d = r4;
        if (r1 != null) goto L5;
        this.a = new AccessibilityNodeInfo.AccessibilityAction(r2, r3);
    L6:
        this.c = r5;
        return;
    L5:
        this.a = r1;
        goto L6
    }
}
