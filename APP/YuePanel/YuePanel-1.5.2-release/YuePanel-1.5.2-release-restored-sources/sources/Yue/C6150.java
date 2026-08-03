package Yue;

import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;

/* JADX INFO: renamed from: Yue.ۥۡ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6150 {

    /* JADX INFO: renamed from: Yue.ۥۡ۠ۦ$ۥ */
    @InterfaceC7113(28)
    public static class C0917 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m2653(Menu menu, boolean z) {
            menu.setGroupDividerEnabled(z);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static void m2651(@InterfaceC6391 Menu menu, boolean z) {
        if (menu instanceof InterfaceMenuC7682) {
            ((InterfaceMenuC7682) menu).setGroupDividerEnabled(z);
        } else if (Build.VERSION.SDK_INT >= 28) {
            C0917.m2653(menu, z);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟ */
    public static void m2652(MenuItem menuItem, int i) {
        menuItem.setShowAsAction(i);
    }
}
