package p008E;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import org.luckypray.dexkit.result.MethodData;
import p001A0.AbstractC0016B;
import p002B.AbstractC0053c;
import p006D.AbstractC0130v;

/* JADX INFO: renamed from: E.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0151e {

    /* JADX INFO: renamed from: e */
    public static final C0151e f344e = null;

    /* JADX INFO: renamed from: f */
    public static final C0151e f345f = null;

    /* JADX INFO: renamed from: g */
    public static final C0151e f346g = null;

    /* JADX INFO: renamed from: h */
    public static final C0151e f347h = null;

    /* JADX INFO: renamed from: i */
    public static final C0151e f348i = null;

    /* JADX INFO: renamed from: j */
    public static final C0151e f349j = null;

    /* JADX INFO: renamed from: k */
    public static final C0151e f350k = null;

    /* JADX INFO: renamed from: l */
    public static final C0151e f351l = null;

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
        int r02 = Build.VERSION.SDK_INT;
        new C0151e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new C0151e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, AbstractC0162p.class);
        f350k = new C0151e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        new C0151e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f351l = new C0151e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        new C0151e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        AccessibilityNodeInfo.AccessibilityAction r8 = null;
        if (r02 < 29) goto L5;
        AccessibilityNodeInfo.AccessibilityAction r3 = AbstractC0016B.m37j();
    L6:
        new C0151e(r3, R.id.accessibilityActionPageUp, null, null, null);
        if (r02 < 29) goto L9;
        AccessibilityNodeInfo.AccessibilityAction r11 = AbstractC0016B.m48u();
    L10:
        new C0151e(r11, R.id.accessibilityActionPageDown, null, null, null);
        if (r02 < 29) goto L13;
        AccessibilityNodeInfo.AccessibilityAction r32 = AbstractC0016B.m52y();
    L14:
        new C0151e(r32, R.id.accessibilityActionPageLeft, null, null, null);
        if (r02 < 29) goto L17;
        AccessibilityNodeInfo.AccessibilityAction r112 = AbstractC0016B.m25B();
    L18:
        new C0151e(r112, R.id.accessibilityActionPageRight, null, null, null);
        new C0151e(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new C0151e(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, AbstractC0163q.class);
        new C0151e(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, AbstractC0161o.class);
        if (r02 < 28) goto L21;
        AccessibilityNodeInfo.AccessibilityAction r10 = AbstractC0053c.m183n();
    L22:
        new C0151e(r10, R.id.accessibilityActionShowTooltip, null, null, null);
        if (r02 < 28) goto L25;
        AccessibilityNodeInfo.AccessibilityAction r16 = AbstractC0053c.m192w();
    L26:
        new C0151e(r16, R.id.accessibilityActionHideTooltip, null, null, null);
        if (r02 < 30) goto L29;
        AccessibilityNodeInfo.AccessibilityAction r33 = AbstractC0130v.m449n();
    L30:
        new C0151e(r33, R.id.accessibilityActionPressAndHold, null, null, null);
        if (r02 < 30) goto L33;
        AccessibilityNodeInfo.AccessibilityAction r113 = AbstractC0130v.m458w();
    L34:
        new C0151e(r113, R.id.accessibilityActionImeEnter, null, null, null);
        if (r02 < 32) goto L37;
        AccessibilityNodeInfo.AccessibilityAction r34 = AbstractC0149c.m467a();
    L38:
        new C0151e(r34, R.id.accessibilityActionDragStart, null, null, null);
        if (r02 < 32) goto L41;
        AccessibilityNodeInfo.AccessibilityAction r102 = AbstractC0149c.m468b();
    L42:
        new C0151e(r102, R.id.accessibilityActionDragDrop, null, null, null);
        if (r02 < 32) goto L45;
        AccessibilityNodeInfo.AccessibilityAction r35 = AbstractC0149c.m469c();
    L46:
        new C0151e(r35, R.id.accessibilityActionDragCancel, null, null, null);
        if (r02 < 33) goto L49;
        AccessibilityNodeInfo.AccessibilityAction r103 = AbstractC0150d.m472c();
    L50:
        new C0151e(r103, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        if (r02 < 34) goto L53;
        r8 = AbstractC0154h.m491a();
    L53:
        new C0151e(r8, R.id.accessibilityActionScrollInDirection, null, null, null);
        return;
    L49:
        r103 = null;
        goto L50
    L45:
        r35 = null;
        goto L46
    L41:
        r102 = null;
        goto L42
    L37:
        r34 = null;
        goto L38
    L33:
        r113 = null;
        goto L34
    L29:
        r33 = null;
        goto L30
    L25:
        r16 = null;
        goto L26
    L21:
        r10 = null;
        goto L22
    L17:
        r112 = null;
        goto L18
    L13:
        r32 = null;
        goto L14
    L9:
        r11 = null;
        goto L10
    L5:
        r3 = null;
        goto L6
    }

    public C0151e(int r7) {
        this(null, r7, null, null, null);
    }

    /* JADX INFO: renamed from: a */
    public final int m477a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f352a).getId();
    }

    public final boolean equals(Object r3) {
        if (r3 != null) goto L6;
        return false;
    L6:
        if ((r3 instanceof C0151e) == true) goto L8;
        return false;
    L8:
        Object r32 = ((C0151e) r3).f352a;
        Object r1 = this.f352a;
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
        Object r02 = this.f352a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public final String toString() {
        StringBuilder r02 = new StringBuilder("AccessibilityActionCompat: ");
        String r1 = C0156j.m504d(this.f353b);
        if (r1.equals("ACTION_UNKNOWN") == false) goto L7;
        Object r2 = this.f352a;
        if (((AccessibilityNodeInfo.AccessibilityAction) r2).getLabel() == null) goto L7;
        r1 = ((AccessibilityNodeInfo.AccessibilityAction) r2).getLabel().toString();
    L7:
        r02.append(r1);
        return r02.toString();
    }

    public C0151e(int r7, Class r8) {
        this(null, r7, null, null, r8);
    }

    public C0151e(Object r1, int r2, String r3, InterfaceC0166t r4, Class r5) {
        this.f353b = r2;
        this.f355d = r4;
        if (r1 != null) goto L5;
        this.f352a = new AccessibilityNodeInfo.AccessibilityAction(r2, r3);
    L6:
        this.f354c = r5;
        return;
    L5:
        this.f352a = r1;
        goto L6
    }
}
