package Yue;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.IBinder;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۥۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceC3364 extends Service {

    /* JADX INFO: renamed from: Yue.ۥ۟ۡۥۤ$ۥ */
    @InterfaceC7113(24)
    public static class C0119 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static int m444() {
            return 512;
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public static ServiceInfo m443(@InterfaceC6391 Context context) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) ServiceC3364.class), C0119.m444() | 128);
    }

    @Override // android.app.Service
    @InterfaceC6391
    public IBinder onBind(@InterfaceC6391 Intent intent) {
        throw new UnsupportedOperationException();
    }
}
