package defpackage;

/* JADX INFO: renamed from: ᛵᲈᛲᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0990 extends defpackage.AbstractC1246 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f4418;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.LayoutInflaterFactory2C1411 f4419;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.lang.Object f4420;

    public C0990(defpackage.LayoutInflaterFactory2C1411 r2, android.content.Context r3) {
            r1 = this;
            r0 = 0
            r1.f4418 = r0
            r1.f4419 = r2
            r1.<init>(r2)
            android.content.Context r2 = r3.getApplicationContext()
            java.lang.String r3 = "power"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.os.PowerManager r2 = (android.os.PowerManager) r2
            r1.f4420 = r2
            return
    }

    public C0990(defpackage.LayoutInflaterFactory2C1411 r2, defpackage.C1326 r3) {
            r1 = this;
            r0 = 1
            r1.f4418 = r0
            r1.f4419 = r2
            r1.<init>(r2)
            r1.f4420 = r3
            return
    }

    @Override // defpackage.AbstractC1246
    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final void mo1945() {
            r2 = this;
            int r0 = r2.f4418
            r1 = 1
            ᛸᛱᛱᛲ r2 = r2.f4419
            switch(r0) {
                case 0: goto Lc;
                default: goto L8;
            }
        L8:
            r2.m2585(r1, r1)
            return
        Lc:
            r2.m2585(r1, r1)
            return
    }

    @Override // defpackage.AbstractC1246
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final int mo1946() {
            r22 = this;
            r0 = r22
            int r1 = r0.f4418
            r2 = 2
            r3 = 1
            java.lang.Object r0 = r0.f4420
            switch(r1) {
                case 0: goto L106;
                default: goto Lb;
            }
        Lb:
            ᛷᛸᛱᛸ r0 = (defpackage.C1326) r0
            java.lang.Object r1 = r0.f5856
            android.location.LocationManager r1 = (android.location.LocationManager) r1
            java.lang.Object r4 = r0.f5857
            ᲇᛱᛸᛷ r4 = (defpackage.C1984) r4
            long r5 = r4.f8580
            long r7 = java.lang.System.currentTimeMillis()
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L23
            boolean r0 = r4.f8579
            goto L101
        L23:
            java.lang.Object r0 = r0.f5859
            r5 = r0
            android.content.Context r5 = (android.content.Context) r5
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            int r0 = defpackage.AbstractC0069.m520(r5, r0)
            java.lang.String r6 = "Failed to get last known location"
            java.lang.String r7 = "TwilightManager"
            r8 = 0
            if (r0 != 0) goto L49
            java.lang.String r0 = "network"
            boolean r9 = r1.isProviderEnabled(r0)     // Catch: java.lang.Exception -> L42
            if (r9 == 0) goto L46
            android.location.Location r0 = r1.getLastKnownLocation(r0)     // Catch: java.lang.Exception -> L42
            goto L47
        L42:
            r0 = move-exception
            android.util.Log.d(r7, r6, r0)
        L46:
            r0 = r8
        L47:
            r9 = r0
            goto L4a
        L49:
            r9 = r8
        L4a:
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = defpackage.AbstractC0069.m520(r5, r0)
            if (r0 != 0) goto L63
            java.lang.String r0 = "gps"
            boolean r5 = r1.isProviderEnabled(r0)     // Catch: java.lang.Exception -> L5f
            if (r5 == 0) goto L63
            android.location.Location r8 = r1.getLastKnownLocation(r0)     // Catch: java.lang.Exception -> L5f
            goto L63
        L5f:
            r0 = move-exception
            android.util.Log.d(r7, r6, r0)
        L63:
            if (r8 == 0) goto L75
            if (r9 == 0) goto L75
            long r0 = r8.getTime()
            long r5 = r9.getTime()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 <= 0) goto L78
        L73:
            r9 = r8
            goto L78
        L75:
            if (r8 == 0) goto L78
            goto L73
        L78:
            r0 = 0
            if (r9 == 0) goto Lea
            long r11 = java.lang.System.currentTimeMillis()
            ᲁᛳᛸᲈ r1 = defpackage.C1835.f8019
            if (r1 != 0) goto L8a
            ᲁᛳᛸᲈ r1 = new ᲁᛳᛸᲈ
            r1.<init>()
            defpackage.C1835.f8019 = r1
        L8a:
            r13 = r1
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            long r14 = r11 - r5
            double r16 = r9.getLatitude()
            double r18 = r9.getLongitude()
            r13.m3229(r14, r16, r18)
            double r7 = r9.getLatitude()
            double r15 = r9.getLongitude()
            r10 = r13
            r13 = r7
            r10.m3229(r11, r13, r15)
            r13 = r10
            int r1 = r13.f8023
            if (r1 != r3) goto Lae
            r0 = r3
        Lae:
            long r7 = r13.f8020
            long r14 = r13.f8021
            long r5 = r5 + r11
            double r16 = r9.getLatitude()
            double r18 = r9.getLongitude()
            r20 = r14
            r14 = r5
            r5 = r20
            r13.m3229(r14, r16, r18)
            long r9 = r13.f8020
            r13 = -1
            int r1 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r1 == 0) goto Le0
            int r1 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r1 != 0) goto Ld0
            goto Le0
        Ld0:
            int r1 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r1 <= 0) goto Ld6
            r7 = r9
            goto Ldb
        Ld6:
            int r1 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r1 <= 0) goto Ldb
            r7 = r5
        Ldb:
            r5 = 60000(0xea60, double:2.9644E-319)
            long r7 = r7 + r5
            goto Le5
        Le0:
            r5 = 43200000(0x2932e00, double:2.1343636E-316)
            long r7 = r11 + r5
        Le5:
            r4.f8579 = r0
            r4.f8580 = r7
            goto L101
        Lea:
            java.lang.String r1 = "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values."
            android.util.Log.i(r7, r1)
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r4 = 11
            int r1 = r1.get(r4)
            r4 = 6
            if (r1 < r4) goto L100
            r4 = 22
            if (r1 < r4) goto L101
        L100:
            r0 = r3
        L101:
            if (r0 == 0) goto L104
            goto L105
        L104:
            r2 = r3
        L105:
            return r2
        L106:
            android.os.PowerManager r0 = (android.os.PowerManager) r0
            boolean r0 = r0.isPowerSaveMode()
            if (r0 == 0) goto L10f
            goto L110
        L10f:
            r2 = r3
        L110:
            return r2
    }

    @Override // defpackage.AbstractC1246
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final android.content.IntentFilter mo1947() {
            r1 = this;
            int r1 = r1.f4418
            switch(r1) {
                case 0: goto L1a;
                default: goto L5;
            }
        L5:
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>()
            java.lang.String r0 = "android.intent.action.TIME_SET"
            r1.addAction(r0)
            java.lang.String r0 = "android.intent.action.TIMEZONE_CHANGED"
            r1.addAction(r0)
            java.lang.String r0 = "android.intent.action.TIME_TICK"
            r1.addAction(r0)
            return r1
        L1a:
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>()
            java.lang.String r0 = "android.os.action.POWER_SAVE_MODE_CHANGED"
            r1.addAction(r0)
            return r1
    }
}
