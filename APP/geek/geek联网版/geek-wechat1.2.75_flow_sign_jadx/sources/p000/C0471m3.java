package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import com.github.megatronking.stringfog.Base64;
import java.util.Calendar;

/* JADX INFO: renamed from: m3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0471m3 extends AbstractC0545o3 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f3058c = 0;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ LayoutInflaterFactory2C0656r3 f3059d;

    /* JADX INFO: renamed from: e */
    public final Object f3060e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0471m3(LayoutInflaterFactory2C0656r3 layoutInflaterFactory2C0656r3, C0658r5 c0658r5) {
        super(layoutInflaterFactory2C0656r3);
        this.f3059d = layoutInflaterFactory2C0656r3;
        this.f3060e = c0658r5;
    }

    @Override // p000.AbstractC0545o3
    /* JADX INFO: renamed from: e */
    public final IntentFilter mo1795e() {
        switch (this.f3058c) {
            case Base64.DEFAULT /* 0 */:
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

    @Override // p000.AbstractC0545o3
    /* JADX INFO: renamed from: f */
    public final int mo1796f() {
        Location location;
        boolean z;
        long j;
        switch (this.f3058c) {
            case Base64.DEFAULT /* 0 */:
                return ((PowerManager) this.f3060e).isPowerSaveMode() ? 2 : 1;
            default:
                C0658r5 c0658r5 = (C0658r5) this.f3060e;
                f80 f80Var = (f80) c0658r5.f4065c;
                LocationManager locationManager = (LocationManager) c0658r5.f4064b;
                if (f80Var.f1755b <= System.currentTimeMillis()) {
                    Context context = (Context) c0658r5.f4066d;
                    Location lastKnownLocation = null;
                    if (AbstractC0387ju.m1619d(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        Location lastKnownLocation2 = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        location = lastKnownLocation2;
                    } else {
                        location = null;
                    }
                    if (AbstractC0387ju.m1619d(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e2) {
                            Log.d("TwilightManager", "Failed to get last known location", e2);
                        }
                    }
                    if (lastKnownLocation == null || location == null ? lastKnownLocation != null : lastKnownLocation.getTime() > location.getTime()) {
                        location = lastKnownLocation;
                    }
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (e80.f1531d == null) {
                            e80.f1531d = new e80();
                        }
                        e80 e80Var = e80.f1531d;
                        e80Var.m971a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                        e80Var.m971a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                        z = e80Var.f1534c == 1;
                        long j2 = e80Var.f1533b;
                        long j3 = e80Var.f1532a;
                        e80Var.m971a(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis + 86400000);
                        long j4 = e80Var.f1533b;
                        if (j2 == -1 || j3 == -1) {
                            j = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis > j3) {
                                j2 = j4;
                            } else if (jCurrentTimeMillis > j2) {
                                j2 = j3;
                            }
                            j = j2 + 60000;
                        }
                        f80Var.f1754a = z;
                        f80Var.f1755b = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i = Calendar.getInstance().get(11);
                        if (i < 6 || i >= 22) {
                            z = true;
                        }
                    }
                    break;
                } else {
                    z = f80Var.f1754a;
                }
                return z ? 2 : 1;
        }
    }

    @Override // p000.AbstractC0545o3
    /* JADX INFO: renamed from: h */
    public final void mo1797h() {
        switch (this.f3058c) {
            case Base64.DEFAULT /* 0 */:
                this.f3059d.m2213m(true, true);
                break;
            default:
                this.f3059d.m2213m(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0471m3(LayoutInflaterFactory2C0656r3 layoutInflaterFactory2C0656r3, Context context) {
        super(layoutInflaterFactory2C0656r3);
        this.f3059d = layoutInflaterFactory2C0656r3;
        this.f3060e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
