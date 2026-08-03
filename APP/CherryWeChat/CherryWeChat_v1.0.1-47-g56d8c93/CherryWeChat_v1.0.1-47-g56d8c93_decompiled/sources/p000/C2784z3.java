package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import java.util.Calendar;

/* JADX INFO: renamed from: z3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2784z3 extends AbstractC0047B3 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f9448c = 0;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ LayoutInflaterFactory2C0176E3 f9449d;

    /* JADX INFO: renamed from: e */
    public final Object f9450e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2784z3(LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3, C2656w4 c2656w4) {
        super(layoutInflaterFactory2C0176E3);
        this.f9449d = layoutInflaterFactory2C0176E3;
        this.f9450e = c2656w4;
    }

    @Override // p000.AbstractC0047B3
    /* JADX INFO: renamed from: e */
    public final IntentFilter mo79e() {
        switch (this.f9448c) {
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    @Override // p000.AbstractC0047B3
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo82h() {
        boolean z;
        long j;
        switch (this.f9448c) {
            case 0:
                return AbstractC2569u3.m5078a((PowerManager) this.f9450e) ? 2 : 1;
            default:
                C2656w4 c2656w4 = (C2656w4) this.f9450e;
                C0785SB c0785sb = (C0785SB) c2656w4.f9197c;
                LocationManager locationManager = (LocationManager) c2656w4.f9196b;
                if (c0785sb.f2485b > System.currentTimeMillis()) {
                    z = c0785sb.f2484a;
                } else {
                    Context context = (Context) c2656w4.f9198d;
                    Location lastKnownLocation = null;
                    if (AbstractC0148Dc.m270d(context, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
                        Location lastKnownLocation2 = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        if (AbstractC0148Dc.m270d(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                            try {
                                if (locationManager.isProviderEnabled("gps")) {
                                    lastKnownLocation = locationManager.getLastKnownLocation("gps");
                                }
                                break;
                            } catch (Exception unused) {
                            }
                        }
                        if (lastKnownLocation == null || lastKnownLocation2 == null ? lastKnownLocation != null : lastKnownLocation.getTime() > lastKnownLocation2.getTime()) {
                            lastKnownLocation2 = lastKnownLocation;
                        }
                        if (lastKnownLocation2 != null) {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (C0742RB.f2370d == null) {
                                C0742RB.f2370d = new C0742RB();
                            }
                            C0742RB c0742rb = C0742RB.f2370d;
                            c0742rb.m1536a(lastKnownLocation2.getLatitude(), lastKnownLocation2.getLongitude(), jCurrentTimeMillis - 86400000);
                            c0742rb.m1536a(lastKnownLocation2.getLatitude(), lastKnownLocation2.getLongitude(), jCurrentTimeMillis);
                            z = c0742rb.f2373c == 1;
                            long j2 = c0742rb.f2372b;
                            long j3 = c0742rb.f2371a;
                            c0742rb.m1536a(lastKnownLocation2.getLatitude(), lastKnownLocation2.getLongitude(), jCurrentTimeMillis + 86400000);
                            long j4 = c0742rb.f2372b;
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
                            c0785sb.f2484a = z;
                            c0785sb.f2485b = j;
                        } else {
                            int i = Calendar.getInstance().get(11);
                            if (i < 6 || i >= 22) {
                                z = true;
                            }
                        }
                        break;
                    }
                }
                return z ? 2 : 1;
        }
    }

    @Override // p000.AbstractC0047B3
    /* JADX INFO: renamed from: m */
    public final void mo86m() {
        switch (this.f9448c) {
            case 0:
                this.f9449d.m350m(true, true);
                break;
            default:
                this.f9449d.m350m(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2784z3(LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3, Context context) {
        super(layoutInflaterFactory2C0176E3);
        this.f9449d = layoutInflaterFactory2C0176E3;
        this.f9450e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
