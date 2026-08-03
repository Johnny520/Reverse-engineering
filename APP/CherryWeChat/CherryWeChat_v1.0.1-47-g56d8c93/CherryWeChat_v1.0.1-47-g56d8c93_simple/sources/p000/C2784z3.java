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
    public final /* synthetic */ int f9448c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ LayoutInflaterFactory2C0176E3 f9449d;

    /* JADX INFO: renamed from: e */
    public final Object f9450e;

    public C2784z3(LayoutInflaterFactory2C0176E3 r2, C2656w4 r3) {
        this.f9448c = 1;
        this.f9449d = r2;
        super(r2);
        this.f9450e = r3;
    }

    @Override // p000.AbstractC0047B3
    /* JADX INFO: renamed from: e */
    public final IntentFilter mo79e() {
        switch(this.f9448c) {
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

    @Override // p000.AbstractC0047B3
    /* JADX INFO: renamed from: h */
    public final int mo82h() {
        switch(this.f9448c) {
            case 0: goto L59;
            default: goto L4;
        };
    L4:
        C2656w4 r1 = (C2656w4) this.f9450e;
        C0785SB r2 = (C0785SB) r1.f9197c;
        LocationManager r3 = (LocationManager) r1.f9196b;
        if (r2.f2485b <= System.currentTimeMillis()) goto L7;
        boolean r12 = r2.f2484a;
    L55:
        if (r12 == false) goto L69;
        return 2;
    L69:
        return 1;
    L7:
        Context r13 = (Context) r1.f9198d;
        Location r6 = null;
        if (AbstractC0148Dc.m270d(r13, "android.permission.ACCESS_COARSE_LOCATION") == 0) goto L65;
    L14:
        Location r4 = null;
    L16:
        if (AbstractC0148Dc.m270d(r13, "android.permission.ACCESS_FINE_LOCATION") == 0) goto L67;
    L21:
        if (r6 == null) goto L26;
        if (r4 == null) goto L26;
        if (r6.getTime() <= r4.getTime()) goto L28;
    L25:
        r4 = r6;
    L28:
        r12 = false;
        if (r4 == null) goto L50;
        long r11 = System.currentTimeMillis();
        if (C0742RB.f2370d != null) goto L33;
        C0742RB.f2370d = new C0742RB();
    L33:
        C0742RB r132 = C0742RB.f2370d;
        r132.m1536a(r4.getLatitude(), r4.getLongitude(), r11 - 86400000);
        r132.m1536a(r4.getLatitude(), r4.getLongitude(), r11);
        if (r132.f2373c != 1) goto L36;
        r12 = true;
    L36:
        long r62 = r132.f2372b;
        long r8 = r132.f2371a;
        r132.m1536a(r4.getLatitude(), r4.getLongitude(), r11 + 86400000);
        long r32 = r132.f2372b;
        if (r62 != (-1)) goto L39;
    L48:
        long r63 = r11 + 43200000;
    L49:
        r2.f2484a = r12;
        r2.f2485b = r63;
        goto L55
    L39:
        if (r8 == (-1)) goto L48;
        if (r11 <= r8) goto L45;
        r62 = r32;
    L47:
        r63 = r62 + 60000;
        goto L49
    L45:
        if (r11 <= r62) goto L47;
        r62 = r8;
        goto L47
    L50:
        int r22 = Calendar.getInstance().get(11);
        if (r22 >= 6) goto L53;
    L54:
        r12 = true;
        goto L55
    L53:
        if (r22 < 22) goto L55;
    L26:
        if (r6 == null) goto L28;
    L67:
        if (r3.isProviderEnabled("gps") == false) goto L21;
        r6 = r3.getLastKnownLocation("gps");     // Catch: Exception -> L63
        goto L21
    L65:
        if (r3.isProviderEnabled("network") == false) goto L14;
        r4 = r3.getLastKnownLocation("network");     // Catch: Exception -> L64
    L59:
        if (AbstractC2569u3.m5078a((PowerManager) this.f9450e) == false) goto L61;
        return 2;
    L61:
        return 1;
    }

    @Override // p000.AbstractC0047B3
    /* JADX INFO: renamed from: m */
    public final void mo86m() {
        switch(this.f9448c) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        this.f9449d.m350m(true, true);
        return;
    L6:
        this.f9449d.m350m(true, true);
    }

    public C2784z3(LayoutInflaterFactory2C0176E3 r2, Context r3) {
        this.f9448c = 0;
        this.f9449d = r2;
        super(r2);
        this.f9450e = (PowerManager) r3.getApplicationContext().getSystemService("power");
    }
}
