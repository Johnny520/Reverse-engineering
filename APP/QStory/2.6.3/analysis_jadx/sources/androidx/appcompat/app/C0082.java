package androidx.appcompat.app;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import androidx.core.content.AbstractC2167;
import java.util.Calendar;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0082 extends AbstractC0080 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C0068 f236;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final /* synthetic */ int f237 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final Object f238;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0082(LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068, Context context) {
        super(layoutInflaterFactory2C0068);
        this.f236 = layoutInflaterFactory2C0068;
        this.f238 = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // androidx.appcompat.app.AbstractC0080
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final IntentFilter mo305() {
        switch (this.f237) {
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

    @Override // androidx.appcompat.app.AbstractC0080
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final int mo312() {
        Location location;
        boolean z;
        long j;
        int i = this.f237;
        Object obj = this.f238;
        switch (i) {
            case 0:
                if (!AbstractC0075.m254((PowerManager) obj)) {
                    break;
                }
                break;
            default:
                C0108 c0108 = (C0108) obj;
                C0109 c0109 = (C0109) c0108.f318;
                LocationManager locationManager = (LocationManager) c0108.f320;
                if (c0109.f322 > System.currentTimeMillis()) {
                    z = c0109.f323;
                } else {
                    Context context = (Context) c0108.f319;
                    Location lastKnownLocation = null;
                    if (AbstractC2167.m3948(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        try {
                        } catch (Exception e) {
                            Log.d("TwilightManager", "Failed to get last known location", e);
                        }
                        Location lastKnownLocation2 = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        location = lastKnownLocation2;
                    } else {
                        location = null;
                    }
                    if (AbstractC2167.m3948(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
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
                        if (C0061.f130 == null) {
                            C0061.f130 = new C0061();
                        }
                        C0061 c0061 = C0061.f130;
                        c0061.m185(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                        c0061.m185(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                        z = c0061.f133 == 1;
                        long j2 = c0061.f131;
                        long j3 = c0061.f132;
                        c0061.m185(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis + 86400000);
                        long j4 = c0061.f131;
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
                        c0109.f323 = z;
                        c0109.f322 = j;
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

    @Override // androidx.appcompat.app.AbstractC0080
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo314() {
        int i = this.f237;
        LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068 = this.f236;
        switch (i) {
            case 0:
                layoutInflaterFactory2C0068.m238(true, true);
                break;
            default:
                layoutInflaterFactory2C0068.m238(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0082(LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068, C0108 c0108) {
        super(layoutInflaterFactory2C0068);
        this.f236 = layoutInflaterFactory2C0068;
        this.f238 = c0108;
    }
}
