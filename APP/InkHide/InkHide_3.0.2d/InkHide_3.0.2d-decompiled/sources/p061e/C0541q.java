package p061e;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import androidx.fragment.app.AbstractC0429g;
import java.util.Calendar;
import p004C.C0064h;
import p052b1.AbstractC0503h;

/* JADX INFO: renamed from: e.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0541q extends AbstractC0429g {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f1768c = 1;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ LayoutInflaterFactory2C0545u f1769d;

    /* JADX INFO: renamed from: e */
    public final Object f1770e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0541q(LayoutInflaterFactory2C0545u layoutInflaterFactory2C0545u, C0064h c0064h) {
        super(layoutInflaterFactory2C0545u);
        this.f1769d = layoutInflaterFactory2C0545u;
        this.f1770e = c0064h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.fragment.app.AbstractC0429g
    /* JADX INFO: renamed from: e */
    public final IntentFilter mo827e() {
        switch (this.f1768c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.fragment.app.AbstractC0429g
    /* JADX INFO: renamed from: f */
    public final int mo828f() {
        Location location;
        boolean z2;
        long j2;
        switch (this.f1768c) {
            case 0:
                return ((PowerManager) this.f1770e).isPowerSaveMode() ? 2 : 1;
            default:
                C0064h c0064h = (C0064h) this.f1770e;
                C0521B c0521b = (C0521B) c0064h.f310d;
                if (c0521b.f1673b <= System.currentTimeMillis()) {
                    Context context = (Context) c0064h.f308b;
                    int iM980h = AbstractC0503h.m980h(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location lastKnownLocation = null;
                    LocationManager locationManager = (LocationManager) c0064h.f309c;
                    if (iM980h == 0) {
                        try {
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                        Location lastKnownLocation2 = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        location = lastKnownLocation2;
                    } else {
                        location = null;
                    }
                    if (AbstractC0503h.m980h(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e3) {
                            Log.d("TwilightManager", "Failed to get last known location", e3);
                        }
                    }
                    if (lastKnownLocation == null || location == null ? lastKnownLocation != null : lastKnownLocation.getTime() > location.getTime()) {
                        location = lastKnownLocation;
                    }
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (C0520A.f1668d == null) {
                            C0520A.f1668d = new C0520A();
                        }
                        C0520A c0520a = C0520A.f1668d;
                        c0520a.m1046a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        c0520a.m1046a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                        z2 = c0520a.f1671c == 1;
                        long j3 = c0520a.f1670b;
                        long j4 = c0520a.f1669a;
                        c0520a.m1046a(86400000 + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                        long j5 = c0520a.f1670b;
                        if (j3 == -1 || j4 == -1) {
                            j2 = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis <= j4) {
                                j5 = jCurrentTimeMillis > j3 ? j4 : j3;
                            }
                            j2 = j5 + 60000;
                        }
                        c0521b.f1672a = z2;
                        c0521b.f1673b = j2;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i2 = Calendar.getInstance().get(11);
                        if (i2 < 6 || i2 >= 22) {
                            z2 = true;
                        }
                    }
                    break;
                } else {
                    z2 = c0521b.f1672a;
                }
                return z2 ? 2 : 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // androidx.fragment.app.AbstractC0429g
    /* JADX INFO: renamed from: h */
    public final void mo830h() {
        switch (this.f1768c) {
            case 0:
                this.f1769d.m1107m(true);
                break;
            default:
                this.f1769d.m1107m(true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0541q(LayoutInflaterFactory2C0545u layoutInflaterFactory2C0545u, Context context) {
        super(layoutInflaterFactory2C0545u);
        this.f1769d = layoutInflaterFactory2C0545u;
        this.f1770e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
