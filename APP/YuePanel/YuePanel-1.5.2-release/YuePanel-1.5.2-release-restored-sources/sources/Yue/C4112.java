package Yue;

import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4112 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f678 = 1;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f679 = 2;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f8213 = 3;

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۨ۟$ۥ */
    @InterfaceC7113(24)
    public static class C0328 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static int m1077(ConnectivityManager connectivityManager) {
            return connectivityManager.getRestrictBackgroundStatus();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۨ۟$ۥ۟ */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC0329 {
    }

    @InterfaceC6490
    @InterfaceC7118("android.permission.ACCESS_NETWORK_STATE")
    @SuppressLint({"ReferencesDeprecated"})
    /* JADX INFO: renamed from: ۥ */
    public static NetworkInfo m1075(@InterfaceC6391 ConnectivityManager connectivityManager, @InterfaceC6391 Intent intent) {
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo != null) {
            return connectivityManager.getNetworkInfo(networkInfo.getType());
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static int m1076(@InterfaceC6391 ConnectivityManager connectivityManager) {
        return C0328.m1077(connectivityManager);
    }

    @InterfaceC7118("android.permission.ACCESS_NETWORK_STATE")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m11724(@InterfaceC6391 ConnectivityManager connectivityManager) {
        return connectivityManager.isActiveNetworkMetered();
    }
}
