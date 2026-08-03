package Yue;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: Yue.ۥۢۤۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C8355 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f3427 = "ViewParentCompat";

    /* JADX INFO: renamed from: ۥ۟ */
    public static int[] f3428;

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۤ$ۥ */
    @InterfaceC7113(21)
    public static class C1495 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static boolean m4321(ViewParent viewParent, View view, float f, float f2, boolean z) {
            return viewParent.onNestedFling(view, f, f2, z);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static boolean m4322(ViewParent viewParent, View view, float f, float f2) {
            return viewParent.onNestedPreFling(view, f, f2);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m27850(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            viewParent.onNestedPreScroll(view, i, i2, iArr);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static void m27851(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            viewParent.onNestedScroll(view, i, i2, i3, i4);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static void m27852(ViewParent viewParent, View view, View view2, int i) {
            viewParent.onNestedScrollAccepted(view, view2, i);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static boolean m27853(ViewParent viewParent, View view, View view2, int i) {
            return viewParent.onStartNestedScroll(view, view2, i);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static void m27854(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static int[] m4319() {
        int[] iArr = f3428;
        if (iArr == null) {
            f3428 = new int[2];
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        return f3428;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m4320(@InterfaceC6391 ViewParent viewParent, @InterfaceC6391 View view, @InterfaceC6391 View view2, int i) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m27836(@InterfaceC6391 ViewParent viewParent, @InterfaceC6391 View view, float f, float f2, boolean z) {
        try {
            return C1495.m4321(viewParent, view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e(f3427, "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean m27837(@InterfaceC6391 ViewParent viewParent, @InterfaceC6391 View view, float f, float f2) {
        try {
            return C1495.m4322(viewParent, view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e(f3427, "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m27838(@InterfaceC6391 ViewParent viewParent, @InterfaceC6391 View view, int i, int i2, @InterfaceC6391 int[] iArr) {
        m27839(viewParent, view, i, i2, iArr, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m27839(@InterfaceC6391 ViewParent viewParent, @InterfaceC6391 View view, int i, int i2, @InterfaceC6391 int[] iArr, int i3) {
        if (viewParent instanceof InterfaceC6367) {
            ((InterfaceC6367) viewParent).onNestedPreScroll(view, i, i2, iArr, i3);
            return;
        }
        if (i3 == 0) {
            try {
                C1495.m27850(viewParent, view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e(f3427, "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m27840(@InterfaceC6391 ViewParent viewParent, @InterfaceC6391 View view, int i, int i2, int i3, int i4) {
        m27842(viewParent, view, i, i2, i3, i4, 0, m4319());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static void m27841(@InterfaceC6391 ViewParent viewParent, @InterfaceC6391 View view, int i, int i2, int i3, int i4, int i5) {
        m27842(viewParent, view, i, i2, i3, i4, i5, m4319());
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m27842(@InterfaceC6391 ViewParent viewParent, @InterfaceC6391 View view, int i, int i2, int i3, int i4, int i5, @InterfaceC6391 int[] iArr) {
        if (viewParent instanceof InterfaceC6368) {
            ((InterfaceC6368) viewParent).onNestedScroll(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof InterfaceC6367) {
            ((InterfaceC6367) viewParent).onNestedScroll(view, i, i2, i3, i4, i5);
            return;
        }
        if (i5 == 0) {
            try {
                C1495.m27851(viewParent, view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                Log.e(f3427, "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static void m27843(@InterfaceC6391 ViewParent viewParent, @InterfaceC6391 View view, @InterfaceC6391 View view2, int i) {
        m27844(viewParent, view, view2, i, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static void m27844(@InterfaceC6391 ViewParent viewParent, @InterfaceC6391 View view, @InterfaceC6391 View view2, int i, int i2) {
        if (viewParent instanceof InterfaceC6367) {
            ((InterfaceC6367) viewParent).onNestedScrollAccepted(view, view2, i, i2);
            return;
        }
        if (i2 == 0) {
            try {
                C1495.m27852(viewParent, view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e(f3427, "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static boolean m27845(@InterfaceC6391 ViewParent viewParent, @InterfaceC6391 View view, @InterfaceC6391 View view2, int i) {
        return m27846(viewParent, view, view2, i, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static boolean m27846(@InterfaceC6391 ViewParent viewParent, @InterfaceC6391 View view, @InterfaceC6391 View view2, int i, int i2) {
        if (viewParent instanceof InterfaceC6367) {
            return ((InterfaceC6367) viewParent).onStartNestedScroll(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        try {
            return C1495.m27853(viewParent, view, view2, i);
        } catch (AbstractMethodError e) {
            Log.e(f3427, "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static void m27847(@InterfaceC6391 ViewParent viewParent, @InterfaceC6391 View view) {
        m27848(viewParent, view, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static void m27848(@InterfaceC6391 ViewParent viewParent, @InterfaceC6391 View view, int i) {
        if (viewParent instanceof InterfaceC6367) {
            ((InterfaceC6367) viewParent).onStopNestedScroll(view, i);
            return;
        }
        if (i == 0) {
            try {
                C1495.m27854(viewParent, view);
            } catch (AbstractMethodError e) {
                Log.e(f3427, "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static boolean m27849(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
