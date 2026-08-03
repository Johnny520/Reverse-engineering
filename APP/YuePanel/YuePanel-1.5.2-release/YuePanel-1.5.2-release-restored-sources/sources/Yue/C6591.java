package Yue;

import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: Yue.ۥۣۡۥۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6591 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    public static final String f2154 = "PackageManagerCompat";

    /* JADX INFO: renamed from: ۥ۟ */
    @SuppressLint({"ActionValue"})
    public static final String f2155 = "android.intent.action.AUTO_REVOKE_PERMISSIONS";

    /* JADX INFO: renamed from: Yue.ۥۣۡۥۣ$ۥ */
    @InterfaceC7113(30)
    public static class C1019 {
        /* JADX INFO: renamed from: ۥ */
        public static boolean m3051(@InterfaceC6391 Context context) {
            return !context.getPackageManager().isAutoRevokeWhitelisted();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۥۣ$ۥ۟ */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC1020 {
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    /* JADX INFO: renamed from: ۥ */
    public static boolean m3049(@InterfaceC6391 PackageManager packageManager) {
        int i = Build.VERSION.SDK_INT;
        return (i >= 30) || ((i < 30) && (m3050(packageManager) != null));
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public static String m3050(@InterfaceC6391 PackageManager packageManager) {
        String str = null;
        Iterator<ResolveInfo> it = packageManager.queryIntentActivities(new Intent(f2155).setData(Uri.fromParts("package", "com.example", null)), 0).iterator();
        while (it.hasNext()) {
            String str2 = it.next().activityInfo.packageName;
            if (packageManager.checkPermission("android.permission.PACKAGE_VERIFICATION_AGENT", str2) == 0) {
                if (str != null) {
                    return str;
                }
                str = str2;
            }
        }
        return str;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static ListenableFuture<Integer> m20920(@InterfaceC6391 Context context) {
        C7120<Integer> c7120M22230 = C7120.m22230();
        if (!C8146.m4171(context)) {
            c7120M22230.mo5833(0);
            Log.e(f2154, "User is in locked direct boot mode");
            return c7120M22230;
        }
        if (!m3049(context.getPackageManager())) {
            c7120M22230.mo5833(1);
            return c7120M22230;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        if (i < 30) {
            c7120M22230.mo5833(0);
            Log.e(f2154, "Target SDK version below API 30");
            return c7120M22230;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            if (C1019.m3051(context)) {
                c7120M22230.mo5833(Integer.valueOf(i >= 31 ? 5 : 4));
            } else {
                c7120M22230.mo5833(2);
            }
            return c7120M22230;
        }
        if (i2 == 30) {
            c7120M22230.mo5833(Integer.valueOf(C1019.m3051(context) ? 4 : 2));
            return c7120M22230;
        }
        final ServiceConnectionC8117 serviceConnectionC8117 = new ServiceConnectionC8117(context);
        c7120M22230.addListener(new Runnable() { // from class: Yue.ۥۣۡۥۢ
            @Override // java.lang.Runnable
            public final void run() {
                serviceConnectionC8117.m4150();
            }
        }, Executors.newSingleThreadExecutor());
        serviceConnectionC8117.m4149(c7120M22230);
        return c7120M22230;
    }
}
