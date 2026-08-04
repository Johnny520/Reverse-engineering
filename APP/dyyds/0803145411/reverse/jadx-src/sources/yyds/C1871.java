package yyds;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: renamed from: yyds.ᛸᲀᲇᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1871 extends AbstractC2315 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f9417 = 0;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final Object f9418;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C2181 f9419;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1871(LayoutInflaterFactory2C2181 layoutInflaterFactory2C2181, Context context) {
        super(layoutInflaterFactory2C2181);
        this.f9419 = layoutInflaterFactory2C2181;
        this.f9418 = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // yyds.AbstractC2315
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final int mo3657() {
        Location location;
        boolean z;
        long j;
        int i = this.f9417;
        Object obj = this.f9418;
        switch (i) {
            case 0:
                if (!((PowerManager) obj).isPowerSaveMode()) {
                    break;
                }
                break;
            default:
                C0644 c0644 = (C0644) obj;
                LocationManager locationManager = (LocationManager) c0644.f3099;
                C1152 c1152 = (C1152) c0644.f3102;
                if (c1152.f5297 > System.currentTimeMillis()) {
                    z = c1152.f5296;
                } else {
                    Context context = (Context) c0644.f3101;
                    Location lastKnownLocation = null;
                    if (AbstractC0427.m1193(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        Location lastKnownLocation2 = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        location = lastKnownLocation2;
                    } else {
                        location = null;
                    }
                    if (AbstractC0427.m1193(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
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
                        C2206 c2206 = C2206.f10904;
                        if (c2206 == null) {
                            c2206 = new C2206();
                            C2206.f10904 = c2206;
                        }
                        C2206 c22062 = c2206;
                        c22062.m4193(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        c22062.m4193(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                        z = c22062.f10906 == 1;
                        long j2 = c22062.f10908;
                        long j3 = c22062.f10907;
                        c22062.m4193(86400000 + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                        long j4 = c22062.f10908;
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
                        c1152.f5296 = z;
                        c1152.f5297 = j;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i2 = Calendar.getInstance().get(11);
                        if (i2 < 6 || i2 >= 22) {
                            z = true;
                        }
                    }
                }
                if (!z) {
                    break;
                }
                break;
        }
        return 1;
    }

    @Override // yyds.AbstractC2315
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void mo3658() {
        int i = this.f9417;
        LayoutInflaterFactory2C2181 layoutInflaterFactory2C2181 = this.f9419;
        switch (i) {
            case 0:
                layoutInflaterFactory2C2181.m4164(true, true);
                break;
            default:
                layoutInflaterFactory2C2181.m4164(true, true);
                break;
        }
    }

    @Override // yyds.AbstractC2315
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final IntentFilter mo3659() {
        switch (this.f9417) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1871(LayoutInflaterFactory2C2181 layoutInflaterFactory2C2181, C0644 c0644) {
        super(layoutInflaterFactory2C2181);
        this.f9419 = layoutInflaterFactory2C2181;
        this.f9418 = c0644;
    }
}
