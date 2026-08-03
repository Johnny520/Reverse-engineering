package Yue;

import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Yue.ۥۡۤۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6711 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f2258 = "PopupWindowCompatApi21";

    /* JADX INFO: renamed from: ۥ۟ */
    public static Method f2259;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean f17277;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Method f17278;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static boolean f17279;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static Field f17280;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static boolean f17281;

    /* JADX INFO: renamed from: Yue.ۥۡۤۤۥ$ۥ */
    @InterfaceC7113(23)
    public static class C1071 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static boolean m3191(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static int m3192(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m21392(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static void m21393(PopupWindow popupWindow, int i) {
            popupWindow.setWindowLayoutType(i);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static boolean m3189(@InterfaceC6391 PopupWindow popupWindow) {
        return C1071.m3191(popupWindow);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static int m3190(@InterfaceC6391 PopupWindow popupWindow) {
        return C1071.m3192(popupWindow);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m21389(@InterfaceC6391 PopupWindow popupWindow, boolean z) {
        C1071.m21392(popupWindow, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m21390(@InterfaceC6391 PopupWindow popupWindow, int i) {
        C1071.m21393(popupWindow, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m21391(@InterfaceC6391 PopupWindow popupWindow, @InterfaceC6391 View view, int i, int i2, int i3) {
        popupWindow.showAsDropDown(view, i, i2, i3);
    }
}
