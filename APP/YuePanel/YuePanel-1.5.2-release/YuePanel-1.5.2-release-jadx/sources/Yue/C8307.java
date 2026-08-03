package Yue;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: Yue.ۥۢۤۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C8307 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f3396 = 0;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f3397 = 1;

    /* JADX INFO: renamed from: Yue.ۥۢۤۥۥ$ۥ */
    @InterfaceC7113(21)
    public static class C1479 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static int m4288(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static boolean m4289(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m27682(ViewGroup viewGroup, boolean z) {
            viewGroup.setTransitionGroup(z);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static int m4286(@InterfaceC6391 ViewGroup viewGroup) {
        return viewGroup.getLayoutMode();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static int m4287(@InterfaceC6391 ViewGroup viewGroup) {
        return C1479.m4288(viewGroup);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m27677(@InterfaceC6391 ViewGroup viewGroup) {
        return C1479.m4289(viewGroup);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean m27678(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return viewGroup.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m27679(@InterfaceC6391 ViewGroup viewGroup, int i) {
        viewGroup.setLayoutMode(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m27680(ViewGroup viewGroup, boolean z) {
        viewGroup.setMotionEventSplittingEnabled(z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m27681(@InterfaceC6391 ViewGroup viewGroup, boolean z) {
        C1479.m27682(viewGroup, z);
    }
}
