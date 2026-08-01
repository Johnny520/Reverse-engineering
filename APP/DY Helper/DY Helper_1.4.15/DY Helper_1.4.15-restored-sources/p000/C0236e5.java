package p000;

/* JADX INFO: renamed from: e5 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0236e5 extends p000.AbstractC1118 {

    /* JADX INFO: renamed from: γ */
    public final /* synthetic */ int f3409;

    /* JADX INFO: renamed from: δ */
    public final /* synthetic */ androidx.appcompat.app.LayoutInflaterFactory2C0026 f3410;

    /* JADX INFO: renamed from: ε */
    public final java.lang.Object f3411;

    public C0236e5(androidx.appcompat.app.LayoutInflaterFactory2C0026 r2, android.content.Context r3) {
            r1 = this;
            r0 = 0
            r1.f3409 = r0
            r1.f3410 = r2
            r1.<init>(r2)
            android.content.Context r2 = r3.getApplicationContext()
            java.lang.String r3 = "power"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.os.PowerManager r2 = (android.os.PowerManager) r2
            r1.f3411 = r2
            return
    }

    public C0236e5(androidx.appcompat.app.LayoutInflaterFactory2C0026 r2, p000.C0538m6 r3) {
            r1 = this;
            r0 = 1
            r1.f3409 = r0
            r1.f3410 = r2
            r1.<init>(r2)
            r1.f3411 = r3
            return
    }

    @Override // p000.AbstractC1118
    /* JADX INFO: renamed from: δ */
    public final android.content.IntentFilter mo1844() {
            r1 = this;
            int r1 = r1.f3409
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

    @Override // p000.AbstractC1118
    /* JADX INFO: renamed from: η */
    public final int mo1845() {
            r21 = this;
            r0 = r21
            int r1 = r0.f3409
            switch(r1) {
                case 0: goto L105;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r0.f3411
            m6 r0 = (p000.C0538m6) r0
            java.lang.Object r1 = r0.f6968
            f62 r1 = (p000.f62) r1
            java.lang.Object r2 = r0.f6967
            android.location.LocationManager r2 = (android.location.LocationManager) r2
            long r3 = r1.f3766
            long r5 = java.lang.System.currentTimeMillis()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r4 = 1
            if (r3 <= 0) goto L22
            boolean r0 = r1.f3765
            goto L101
        L22:
            java.lang.Object r0 = r0.f6969
            r3 = r0
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r0 = "android.permission.ACCESS_COARSE_LOCATION"
            int r0 = p000.e81.m1873(r3, r0)
            java.lang.String r5 = "Failed to get last known location"
            java.lang.String r6 = "TwilightManager"
            r7 = 0
            if (r0 != 0) goto L48
            java.lang.String r0 = "network"
            boolean r8 = r2.isProviderEnabled(r0)     // Catch: java.lang.Exception -> L41
            if (r8 == 0) goto L45
            android.location.Location r0 = r2.getLastKnownLocation(r0)     // Catch: java.lang.Exception -> L41
            goto L46
        L41:
            r0 = move-exception
            android.util.Log.d(r6, r5, r0)
        L45:
            r0 = r7
        L46:
            r8 = r0
            goto L49
        L48:
            r8 = r7
        L49:
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = p000.e81.m1873(r3, r0)
            if (r0 != 0) goto L62
            java.lang.String r0 = "gps"
            boolean r3 = r2.isProviderEnabled(r0)     // Catch: java.lang.Exception -> L5e
            if (r3 == 0) goto L62
            android.location.Location r7 = r2.getLastKnownLocation(r0)     // Catch: java.lang.Exception -> L5e
            goto L62
        L5e:
            r0 = move-exception
            android.util.Log.d(r6, r5, r0)
        L62:
            if (r7 == 0) goto L74
            if (r8 == 0) goto L74
            long r2 = r7.getTime()
            long r9 = r8.getTime()
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 <= 0) goto L77
        L72:
            r8 = r7
            goto L77
        L74:
            if (r7 == 0) goto L77
            goto L72
        L77:
            r0 = 0
            if (r8 == 0) goto Lea
            long r10 = java.lang.System.currentTimeMillis()
            e62 r2 = p000.e62.f3421
            if (r2 != 0) goto L89
            e62 r2 = new e62
            r2.<init>()
            p000.e62.f3421 = r2
        L89:
            e62 r12 = p000.e62.f3421
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            long r13 = r10 - r2
            double r15 = r8.getLatitude()
            double r17 = r8.getLongitude()
            r12.m1851(r13, r15, r17)
            double r5 = r8.getLatitude()
            double r14 = r8.getLongitude()
            r9 = r12
            r12 = r5
            r9.m1851(r10, r12, r14)
            r12 = r9
            int r5 = r12.f3423
            if (r5 != r4) goto Lae
            r0 = r4
        Lae:
            long r5 = r12.f3425
            long r13 = r12.f3424
            long r2 = r2 + r10
            double r15 = r8.getLatitude()
            double r17 = r8.getLongitude()
            r19 = r13
            r13 = r2
            r2 = r19
            r12.m1851(r13, r15, r17)
            long r7 = r12.f3425
            r12 = -1
            int r9 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r9 == 0) goto Le0
            int r9 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r9 != 0) goto Ld0
            goto Le0
        Ld0:
            int r9 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r9 <= 0) goto Ld6
            r5 = r7
            goto Ldb
        Ld6:
            int r7 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r7 <= 0) goto Ldb
            r5 = r2
        Ldb:
            r2 = 60000(0xea60, double:2.9644E-319)
            long r5 = r5 + r2
            goto Le5
        Le0:
            r2 = 43200000(0x2932e00, double:2.1343636E-316)
            long r5 = r10 + r2
        Le5:
            r1.f3765 = r0
            r1.f3766 = r5
            goto L101
        Lea:
            java.lang.String r1 = "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values."
            android.util.Log.i(r6, r1)
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r2 = 11
            int r1 = r1.get(r2)
            r2 = 6
            if (r1 < r2) goto L100
            r2 = 22
            if (r1 < r2) goto L101
        L100:
            r0 = r4
        L101:
            if (r0 == 0) goto L104
            r4 = 2
        L104:
            return r4
        L105:
            java.lang.Object r0 = r0.f3411
            android.os.PowerManager r0 = (android.os.PowerManager) r0
            boolean r0 = p000.AbstractC1045z4.m7087(r0)
            if (r0 == 0) goto L111
            r0 = 2
            goto L112
        L111:
            r0 = 1
        L112:
            return r0
    }

    @Override // p000.AbstractC1118
    /* JADX INFO: renamed from: χ */
    public final void mo1846() {
            r1 = this;
            int r0 = r1.f3409
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            androidx.appcompat.app.β r1 = r1.f3410
            r0 = 1
            r1.m222(r0, r0)
            return
        Lc:
            androidx.appcompat.app.β r1 = r1.f3410
            r0 = 1
            r1.m222(r0, r0)
            return
    }
}
