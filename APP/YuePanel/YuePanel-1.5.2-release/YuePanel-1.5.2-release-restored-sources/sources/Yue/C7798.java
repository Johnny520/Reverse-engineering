package Yue;

import Yue.InterfaceC7144;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.service.quicksettings.TileService;

/* JADX INFO: renamed from: Yue.ۥۣۢۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7798 {

    /* JADX INFO: renamed from: ۥ */
    public static InterfaceC7799 f3090;

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۤ$ۥ */
    @InterfaceC7113(24)
    public static class C1363 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m3901(TileService tileService, Intent intent) {
            tileService.startActivityAndCollapse(intent);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۤ$ۥ۟ */
    @InterfaceC7113(34)
    public static class C1364 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m3902(TileService tileService, PendingIntent pendingIntent) {
            tileService.startActivityAndCollapse(pendingIntent);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۡۤ$ۥ۟۟, reason: contains not printable characters */
    public interface InterfaceC7799 {
        /* JADX INFO: renamed from: ۥ */
        void m3903(Intent intent);

        /* JADX INFO: renamed from: ۥ۟ */
        void m3904(PendingIntent pendingIntent);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    /* JADX INFO: renamed from: ۥ */
    public static void m3899() {
        f3090 = null;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    /* JADX INFO: renamed from: ۥ۟ */
    public static void m3900(@InterfaceC6391 InterfaceC7799 interfaceC7799) {
        f3090 = interfaceC7799;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m24767(@InterfaceC6391 TileService tileService, @InterfaceC6391 C6647 c6647) {
        if (Build.VERSION.SDK_INT >= 34) {
            InterfaceC7799 interfaceC7799 = f3090;
            if (interfaceC7799 != null) {
                interfaceC7799.m3904(c6647.m21249());
                return;
            } else {
                C1364.m3902(tileService, c6647.m21249());
                return;
            }
        }
        InterfaceC7799 interfaceC77992 = f3090;
        if (interfaceC77992 != null) {
            interfaceC77992.m3903(c6647.m21247());
        } else {
            C1363.m3901(tileService, c6647.m21247());
        }
    }
}
