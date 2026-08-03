package Yue;

import Yue.C3530;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: Yue.ۥۢۥۣۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C8436 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f3501 = 8;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f3502 = 9;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f25286 = 10;

    /* JADX INFO: renamed from: Yue.ۥۢۥۣۣ$ۥ */
    public static class C1534 {
        /* JADX INFO: renamed from: ۥ */
        public static void m4424(@InterfaceC6391 Window window, boolean z) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | C3530.C0172.f6005);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۣۣ$ۥ۟ */
    @InterfaceC7113(28)
    public static class C1535 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static <T> T m4425(Window window, int i) {
            return (T) window.requireViewById(i);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۣۣ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7113(30)
    public static class C8437 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m4426(@InterfaceC6391 Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public static C8514 m4422(@InterfaceC6391 Window window, @InterfaceC6391 View view) {
        return new C8514(window, view);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public static <T extends View> T m4423(@InterfaceC6391 Window window, @InterfaceC5411 int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) C1535.m4425(window, i);
        }
        T t = (T) window.findViewById(i);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Window");
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m28223(@InterfaceC6391 Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            C8437.m4426(window, z);
        } else {
            C1534.m4424(window, z);
        }
    }
}
