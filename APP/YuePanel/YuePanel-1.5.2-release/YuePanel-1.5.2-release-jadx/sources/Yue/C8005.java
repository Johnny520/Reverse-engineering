package Yue;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: renamed from: Yue.ۥۣۢۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8005 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String f23808 = "TwilightManager";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f23809 = 6;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f23810 = 22;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static C8005 f23811;

    /* JADX INFO: renamed from: ۥ */
    public final Context f3187;

    /* JADX INFO: renamed from: ۥ۟ */
    public final LocationManager f3188;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C1402 f23812 = new C1402();

    /* JADX INFO: renamed from: Yue.ۥۣۢۢۢ$ۥ */
    public static class C1402 {

        /* JADX INFO: renamed from: ۥ */
        public boolean f3189;

        /* JADX INFO: renamed from: ۥ۟ */
        public long f3190;
    }

    @InterfaceC8392
    public C8005(@InterfaceC6391 Context context, @InterfaceC6391 LocationManager locationManager) {
        this.f3187 = context;
        this.f3188 = locationManager;
    }

    /* JADX INFO: renamed from: ۥ */
    public static C8005 m4018(@InterfaceC6391 Context context) {
        if (f23811 == null) {
            Context applicationContext = context.getApplicationContext();
            f23811 = new C8005(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f23811;
    }

    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m25227(C8005 c8005) {
        f23811 = c8005;
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: ۥ۟ */
    public final Location m4019() {
        Location locationM25228 = C6653.m21276(this.f3187, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m25228("network") : null;
        Location locationM252282 = C6653.m21276(this.f3187, "android.permission.ACCESS_FINE_LOCATION") == 0 ? m25228("gps") : null;
        return (locationM252282 == null || locationM25228 == null) ? locationM252282 != null ? locationM252282 : locationM25228 : locationM252282.getTime() > locationM25228.getTime() ? locationM252282 : locationM25228;
    }

    @InterfaceC7118(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final Location m25228(String str) {
        try {
            if (this.f3188.isProviderEnabled(str)) {
                return this.f3188.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d(f23808, "Failed to get last known location", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m25229() {
        C1402 c1402 = this.f23812;
        if (m25230()) {
            return c1402.f3189;
        }
        Location locationM4019 = m4019();
        if (locationM4019 != null) {
            m25231(locationM4019);
            return c1402.f3189;
        }
        Log.i(f23808, "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final boolean m25230() {
        return this.f23812.f3190 > System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m25231(@InterfaceC6391 Location location) {
        long j;
        C1402 c1402 = this.f23812;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C8004 c8004M4016 = C8004.m4016();
        c8004M4016.m4017(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        c8004M4016.m4017(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = c8004M4016.f23807 == 1;
        long j2 = c8004M4016.f3186;
        long j3 = c8004M4016.f3185;
        c8004M4016.m4017(jCurrentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j4 = c8004M4016.f3186;
        if (j2 == -1 || j3 == -1) {
            j = jCurrentTimeMillis + 43200000;
        } else {
            if (jCurrentTimeMillis <= j3) {
                j4 = jCurrentTimeMillis > j2 ? j3 : j2;
            }
            j = j4 + C7033.f21235;
        }
        c1402.f3189 = z;
        c1402.f3190 = j;
    }
}
