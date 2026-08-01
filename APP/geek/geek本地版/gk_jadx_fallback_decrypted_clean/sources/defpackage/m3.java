package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m3 extends defpackage.o3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ defpackage.r3 d;
    public final java.lang.Object e;

    public m3(defpackage.r3 r2, android.content.Context r3) {
            r1 = this;
            r0 = 0
            r1.c = r0
            r1.d = r2
            r1.<init>(r2)
            android.content.Context r2 = r3.getApplicationContext()
            java.lang.String r3 = "power"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.os.PowerManager r2 = (android.os.PowerManager) r2
            r1.e = r2
            return
    }

    public m3(defpackage.r3 r2, defpackage.r5 r3) {
            r1 = this;
            r0 = 1
            r1.c = r0
            r1.d = r2
            r1.<init>(r2)
            r1.e = r3
            return
    }

    @Override // defpackage.o3
    public final android.content.IntentFilter e() {
            r2 = this;
            int r0 = r2.c
            switch(r0) {
                case 0: goto L1a;
                default: goto L5;
            }
        L5:
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "android.intent.action.TIME_SET"
            r0.addAction(r1)
            java.lang.String r1 = "android.intent.action.TIMEZONE_CHANGED"
            r0.addAction(r1)
            java.lang.String r1 = "android.intent.action.TIME_TICK"
            r0.addAction(r1)
            return r0
        L1a:
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "android.os.action.POWER_SAVE_MODE_CHANGED"
            r0.addAction(r1)
            return r0
    }

    @Override // defpackage.o3
    public final int f() {
            r24 = this;
            r1 = r24
            int r0 = r1.c
            switch(r0) {
                case 0: goto L102;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r1.e
            r5 r0 = (defpackage.r5) r0
            java.lang.Object r2 = r0.c
            z70 r2 = (defpackage.z70) r2
            java.lang.Object r3 = r0.b
            android.location.LocationManager r3 = (android.location.LocationManager) r3
            long r4 = r2.b
            long r6 = java.lang.System.currentTimeMillis()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r5 = 1
            if (r4 <= 0) goto L22
            boolean r0 = r2.a
            goto Lfe
        L22:
            java.lang.Object r0 = r0.d
            r4 = r0
            android.content.Context r4 = (android.content.Context) r4
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            int r0 = defpackage.gt.a(r4, r0)
            java.lang.String r6 = "Failed to get last known location"
            java.lang.String r7 = "TwilightManager"
            r8 = 0
            if (r0 != 0) goto L48
            java.lang.String r0 = "network"
            boolean r9 = r3.isProviderEnabled(r0)     // Catch: java.lang.Exception -> L41
            if (r9 == 0) goto L45
            android.location.Location r0 = r3.getLastKnownLocation(r0)     // Catch: java.lang.Exception -> L41
            goto L46
        L41:
            r0 = move-exception
            android.util.Log.d(r7, r6, r0)
        L45:
            r0 = r8
        L46:
            r9 = r0
            goto L49
        L48:
            r9 = r8
        L49:
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = defpackage.gt.a(r4, r0)
            if (r0 != 0) goto L62
            java.lang.String r0 = "gps"
            boolean r4 = r3.isProviderEnabled(r0)     // Catch: java.lang.Exception -> L5e
            if (r4 == 0) goto L62
            android.location.Location r8 = r3.getLastKnownLocation(r0)     // Catch: java.lang.Exception -> L5e
            goto L62
        L5e:
            r0 = move-exception
            android.util.Log.d(r7, r6, r0)
        L62:
            if (r8 == 0) goto L74
            if (r9 == 0) goto L74
            long r3 = r8.getTime()
            long r10 = r9.getTime()
            int r0 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r0 <= 0) goto L77
        L72:
            r9 = r8
            goto L77
        L74:
            if (r8 == 0) goto L77
            goto L72
        L77:
            r0 = 0
            if (r9 == 0) goto Le7
            long r15 = java.lang.System.currentTimeMillis()
            y70 r3 = defpackage.y70.d
            if (r3 != 0) goto L89
            y70 r3 = new y70
            r3.<init>()
            defpackage.y70.d = r3
        L89:
            y70 r17 = defpackage.y70.d
            r3 = 86400000(0x5265c00, double:4.2687272E-316)
            long r22 = r15 - r3
            double r18 = r9.getLatitude()
            double r20 = r9.getLongitude()
            r17.a(r18, r20, r22)
            double r11 = r9.getLatitude()
            double r13 = r9.getLongitude()
            r10 = r17
            r10.a(r11, r13, r15)
            int r6 = r10.c
            if (r6 != r5) goto Lad
            r0 = r5
        Lad:
            long r6 = r10.b
            long r11 = r10.a
            long r22 = r15 + r3
            double r18 = r9.getLatitude()
            double r20 = r9.getLongitude()
            r17 = r10
            r17.a(r18, r20, r22)
            long r3 = r10.b
            r8 = -1
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto Ldd
            int r8 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r8 != 0) goto Lcd
            goto Ldd
        Lcd:
            int r8 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r8 <= 0) goto Ld3
            r6 = r3
            goto Ld8
        Ld3:
            int r3 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r3 <= 0) goto Ld8
            r6 = r11
        Ld8:
            r3 = 60000(0xea60, double:2.9644E-319)
            long r6 = r6 + r3
            goto Le2
        Ldd:
            r3 = 43200000(0x2932e00, double:2.1343636E-316)
            long r6 = r15 + r3
        Le2:
            r2.a = r0
            r2.b = r6
            goto Lfe
        Le7:
            java.lang.String r2 = "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values."
            android.util.Log.i(r7, r2)
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            r3 = 11
            int r2 = r2.get(r3)
            r3 = 6
            if (r2 < r3) goto Lfd
            r3 = 22
            if (r2 < r3) goto Lfe
        Lfd:
            r0 = r5
        Lfe:
            if (r0 == 0) goto L101
            r5 = 2
        L101:
            return r5
        L102:
            java.lang.Object r0 = r1.e
            android.os.PowerManager r0 = (android.os.PowerManager) r0
            boolean r0 = r0.isPowerSaveMode()
            if (r0 == 0) goto L10e
            r0 = 2
            goto L10f
        L10e:
            r0 = 1
        L10f:
            return r0
    }

    @Override // defpackage.o3
    public final void h() {
            r2 = this;
            int r0 = r2.c
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            r3 r0 = r2.d
            r1 = 1
            r0.m(r1, r1)
            return
        Lc:
            r3 r0 = r2.d
            r1 = 1
            r0.m(r1, r1)
            return
    }
}
