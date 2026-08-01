package androidx.appcompat.app;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import androidx.core.content.AbstractC3000;
import java.util.Calendar;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0929 extends AbstractC0927 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C0915 f581;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f582 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Object f583;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0929(LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915, Context context) {
        super(layoutInflaterFactory2C0915);
        this.f581 = layoutInflaterFactory2C0915;
        this.f583 = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // androidx.appcompat.app.AbstractC0927
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final IntentFilter mo865() {
        switch (this.f582) {
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

    @Override // androidx.appcompat.app.AbstractC0927
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final int mo872() {
        Location location;
        boolean z;
        long j;
        int i = this.f582;
        Object obj = this.f583;
        switch (i) {
            case 0:
                if (!AbstractC0922.m814((PowerManager) obj)) {
                    break;
                }
                break;
            default:
                C0955 c0955 = (C0955) obj;
                C0956 c0956 = (C0956) c0955.f663;
                LocationManager locationManager = (LocationManager) c0955.f665;
                if (c0956.f667 > System.currentTimeMillis()) {
                    z = c0956.f668;
                } else {
                    Context context = (Context) c0955.f664;
                    Location lastKnownLocation = null;
                    if (AbstractC3000.m4508(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        Location lastKnownLocation2 = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        location = lastKnownLocation2;
                    } else {
                        location = null;
                    }
                    if (AbstractC3000.m4508(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
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
                        if (C0908.f475 == null) {
                            C0908.f475 = new C0908();
                        }
                        C0908 c0908 = C0908.f475;
                        c0908.m745(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                        c0908.m745(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                        z = c0908.f478 == 1;
                        long j2 = c0908.f476;
                        long j3 = c0908.f477;
                        c0908.m745(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis + 86400000);
                        long j4 = c0908.f476;
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
                        c0956.f668 = z;
                        c0956.f667 = j;
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

    @Override // androidx.appcompat.app.AbstractC0927
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo874() {
        int i = this.f582;
        LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915 = this.f581;
        switch (i) {
            case 0:
                layoutInflaterFactory2C0915.m798(true, true);
                break;
            default:
                layoutInflaterFactory2C0915.m798(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0929(LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915, C0955 c0955) {
        super(layoutInflaterFactory2C0915);
        this.f581 = layoutInflaterFactory2C0915;
        this.f583 = c0955;
    }
}
