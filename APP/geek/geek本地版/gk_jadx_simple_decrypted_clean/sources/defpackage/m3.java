package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.util.Log;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class m3 extends o3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ r3 d;
    public final Object e;

    public m3(r3 r2, r5 r3) {
        this.c = 1;
        this.d = r2;
        super(r2);
        this.e = r3;
    }

    @Override // defpackage.o3
    public final IntentFilter e() {
        switch(this.c) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        IntentFilter r0 = new IntentFilter();
        r0.addAction("android.intent.action.TIME_SET");
        r0.addAction("android.intent.action.TIMEZONE_CHANGED");
        r0.addAction("android.intent.action.TIME_TICK");
        return r0;
    L6:
        IntentFilter r02 = new IntentFilter();
        r02.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return r02;
    }

    @Override // defpackage.o3
    public final int f() {
        switch(this.c) {
            case 0: goto L66;
            default: goto L4;
        };
    L4:
        r5 r0 = (r5) this.e;
        z70 r2 = (z70) r0.c;
        LocationManager r3 = (LocationManager) r0.b;
        if (r2.b <= System.currentTimeMillis()) goto L7;
        boolean r02 = r2.a;
    L62:
        if (r02 == false) goto L74;
        return 2;
    L74:
        return 1;
    L7:
        Context r4 = (Context) r0.d;
        Location r8 = null;
        if (gt.a(r4, "android.permission.ACCESS_COARSE_LOCATION") == 0) goto L72;
        Location r9 = null;
    L20:
        if (gt.a(r4, "android.permission.ACCESS_FINE_LOCATION") == 0) goto L70;
    L28:
        if (r8 == null) goto L33;
        if (r9 == null) goto L33;
        if (r8.getTime() <= r9.getTime()) goto L35;
    L32:
        r9 = r8;
    L35:
        r02 = false;
        if (r9 == null) goto L57;
        long r15 = System.currentTimeMillis();
        if (y70.d != null) goto L40;
        y70.d = new y70();
    L40:
        y70 r17 = y70.d;
        r17.a(r9.getLatitude(), r9.getLongitude(), r15 - 86400000);
        r17.a(r9.getLatitude(), r9.getLongitude(), r15);
        if (r17.c != 1) goto L43;
        r02 = true;
    L43:
        long r6 = r17.b;
        long r11 = r17.a;
        r17.a(r9.getLatitude(), r9.getLongitude(), r15 + 86400000);
        long r32 = r17.b;
        if (r6 != (-1)) goto L46;
    L55:
        long r62 = r15 + 43200000;
    L56:
        r2.a = r02;
        r2.b = r62;
        goto L62
    L46:
        if (r11 == (-1)) goto L55;
        if (r15 <= r11) goto L52;
        r6 = r32;
    L54:
        r62 = r6 + 60000;
        goto L56
    L52:
        if (r15 <= r6) goto L54;
        r6 = r11;
        goto L54
    L57:
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int r22 = Calendar.getInstance().get(11);
        if (r22 >= 6) goto L60;
    L61:
        r02 = true;
        goto L62
    L60:
        if (r22 < 22) goto L62;
    L33:
        if (r8 == null) goto L35;
    L70:
    L26:
        e = move-exception;
        Log.d("TwilightManager", "Failed to get last known location", e);
        goto L28
    L23:
        if (r3.isProviderEnabled("gps") == false) goto L28;
        r8 = r3.getLastKnownLocation("gps");     // Catch: Exception -> L26
        goto L28
    L72:
    L14:
        e = move-exception;
        Log.d("TwilightManager", "Failed to get last known location", e);
    L16:
        Location r03 = null;
    L17:
        r9 = r03;
        goto L20
    L11:
        if (r3.isProviderEnabled("network") == false) goto L16;
        r03 = r3.getLastKnownLocation("network");     // Catch: Exception -> L14
        goto L17
    L66:
        if (((PowerManager) this.e).isPowerSaveMode() == false) goto L68;
        return 2;
    L68:
        return 1;
    }

    @Override // defpackage.o3
    public final void h() {
        switch(this.c) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        this.d.m(true, true);
        return;
    L6:
        this.d.m(true, true);
    }

    public m3(r3 r2, Context r3) {
        this.c = 0;
        this.d = r2;
        super(r2);
        this.e = (PowerManager) r3.getApplicationContext().getSystemService("power");
    }
}
