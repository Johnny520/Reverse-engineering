package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1109 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3310;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3311;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3312;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3313;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3314;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3315;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3316;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3317;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3318;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3319;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3320;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3321;

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۤۧ$ۥ, reason: contains not printable characters */
    public class C1110 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f3322;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f3323;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C1145 f3324;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C1145 f3325;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C1109 f3326;

        public C1110(Yue.C1109 r1, Yue.C1145 r2, Yue.C1145 r3) {
                r0 = this;
                r0.f3326 = r1
                r0.f3324 = r2
                r0.f3325 = r3
                r0.<init>()
                return
        }

        private static /* synthetic */ java.lang.String yue_xin_awa(int r2) {
                if (r2 == 0) goto L17
                r0 = 1
                if (r2 == r0) goto L7
                r2 = 0
                return r2
            L7:
                java.lang.String r2 = Yue.C1109.C1110.f3323
                if (r2 != 0) goto L16
                r0 = 1431720363704310272(0x13de7e15d049da00, double:5.6610423116774956E-213)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C1109.C1110.f3323 = r2
            L16:
                return r2
            L17:
                java.lang.String r2 = Yue.C1109.C1110.f3322
                if (r2 != 0) goto L26
                r0 = -7146900696298624833(0x9cd11baec020e8bf, double:-7.083128629660675E-170)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C1109.C1110.f3322 = r2
            L26:
                return r2
        }

        public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r4) throws java.lang.Throwable {
                r3 = this;
                r0 = 1
                Yue.ۥ۟ۤۧ۠ r1 = r3.f3324     // Catch: java.lang.Throwable -> L1d
                java.util.List r1 = r1.m6005()     // Catch: java.lang.Throwable -> L1d
                boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1d
                r2 = 0
                if (r1 == 0) goto L1f
                java.lang.Object r4 = r4.thisObject     // Catch: java.lang.Throwable -> L1d
                java.lang.String r1 = yue_xin_awa(r2)     // Catch: java.lang.Throwable -> L1d
                java.lang.Class<java.util.List> r2 = java.util.List.class
                java.lang.Object r4 = Yue.C3846.m15400(r4, r1, r2)     // Catch: java.lang.Throwable -> L1d
                java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L1d
                goto L4c
            L1d:
                r4 = move-exception
                goto L58
            L1f:
                Yue.ۥ۟ۤۧ۠ r1 = r3.f3324     // Catch: java.lang.Throwable -> L1d
                java.util.List r1 = r1.m6005()     // Catch: java.lang.Throwable -> L1d
                int r1 = r1.size()     // Catch: java.lang.Throwable -> L1d
                if (r1 <= r0) goto L3c
                java.lang.Object[] r4 = r4.args     // Catch: java.lang.Throwable -> L1d
                r4 = r4[r0]     // Catch: java.lang.Throwable -> L1d
                java.lang.String r1 = yue_xin_awa(r0)     // Catch: java.lang.Throwable -> L1d
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1d
                java.lang.Object r4 = de.robv.android.xposed.XposedHelpers.callMethod(r4, r1, r2)     // Catch: java.lang.Throwable -> L1d
                java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L1d
                goto L4c
            L3c:
                java.lang.Object[] r4 = r4.args     // Catch: java.lang.Throwable -> L1d
                r4 = r4[r2]     // Catch: java.lang.Throwable -> L1d
                java.lang.String r1 = yue_xin_awa(r0)     // Catch: java.lang.Throwable -> L1d
                java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1d
                java.lang.Object r4 = de.robv.android.xposed.XposedHelpers.callMethod(r4, r1, r2)     // Catch: java.lang.Throwable -> L1d
                java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L1d
            L4c:
                Yue.ۥ۟ۤۤۧ r1 = r3.f3326     // Catch: java.lang.Throwable -> L1d
                Yue.ۥ۟ۤۧ۠ r2 = r3.f3325     // Catch: java.lang.Throwable -> L1d
                java.lang.String r2 = r2.m6002()     // Catch: java.lang.Throwable -> L1d
                Yue.C1109.m5910(r1, r4, r2)     // Catch: java.lang.Throwable -> L1d
                goto L5f
            L58:
                java.lang.String r4 = r4.getMessage()
                Yue.C4350.m17147(r4, r0)
            L5f:
                return
        }
    }

    static {
            r0 = 1062(0x426, float:1.488E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C1109() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m5910(Yue.C1109 r0, java.util.List r1, java.lang.String r2);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native java.util.List<java.lang.String> m5911(java.lang.String r0);

    @Override // Yue.AbstractC3183
    public native java.util.HashMap<java.lang.String, org.luckypray.dexkit.query.FindMethod> dexKit(org.luckypray.dexkit.DexKitBridge r1, java.lang.String r2);

    @Override // Yue.AbstractC3183
    public native org.luckypray.dexkit.result.MethodDataList dexKit(org.luckypray.dexkit.DexKitBridge r1);

    @Override // Yue.AbstractC3183
    public native com.yuexin.panel.myClass.itemInfo info();

    @Override // Yue.AbstractC3183
    public void load(Yue.C1146 r4, java.lang.ClassLoader r5) {
            r3 = this;
            java.util.Map r0 = r4.m6013()     // Catch: java.lang.Throwable -> L33
            r1 = 2
            java.lang.String r1 = yue_xin_awa(r1)     // Catch: java.lang.Throwable -> L33
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L33
            Yue.ۥ۟ۤۧ۠ r0 = (Yue.C1145) r0     // Catch: java.lang.Throwable -> L33
            java.util.Map r4 = r4.m6013()     // Catch: java.lang.Throwable -> L33
            r1 = 3
            java.lang.String r1 = yue_xin_awa(r1)     // Catch: java.lang.Throwable -> L33
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L33
            Yue.ۥ۟ۤۧ۠ r4 = (Yue.C1145) r4     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = r4.m6002()     // Catch: java.lang.Throwable -> L33
            java.lang.Class r5 = r5.loadClass(r1)     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = r4.m6001()     // Catch: java.lang.Throwable -> L33
            Yue.ۥ۟ۤۤۧ$ۥ r2 = new Yue.ۥ۟ۤۤۧ$ۥ     // Catch: java.lang.Throwable -> L33
            r2.<init>(r3, r4, r0)     // Catch: java.lang.Throwable -> L33
            Yue.C3065.m12924(r5, r1, r2)     // Catch: java.lang.Throwable -> L33
            goto L40
        L33:
            r4 = move-exception
            r5 = 0
            java.lang.String r5 = yue_xin_awa(r5)
            java.lang.String r4 = r4.getMessage()
            Yue.C1828.m8591(r5, r4)
        L40:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m5912(java.util.List r7, java.lang.String r8) {
            r6 = this;
            java.util.List<Yue.ۥۡۡۨ۠> r0 = Yue.C1504.f4693
            r0.clear()
            java.util.Iterator r7 = r7.iterator()
        L9:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r0 = r7.next()
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getName()
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L22
            goto L9
        L22:
            com.google.gson.Gson r1 = new com.google.gson.Gson
            r1.<init>()
            java.lang.String r1 = r1.toJson(r0)
            Yue.ۥۡۡۨ۠ r2 = new Yue.ۥۡۡۨ۠
            r2.<init>()
            r3 = 4
            java.lang.String r3 = yue_xin_awa(r3)
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Object r3 = de.robv.android.xposed.XposedHelpers.callMethod(r0, r3, r5)
            java.lang.String r3 = (java.lang.String) r3
            r5 = 5
            java.lang.String r5 = yue_xin_awa(r5)
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Object r0 = de.robv.android.xposed.XposedHelpers.callMethod(r0, r5, r4)
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r1 = m5911(r1)
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto L64
            int r4 = r1.size()
            int r4 = r4 + (-1)
            java.lang.Object r1 = r1.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            r2.m17032(r1)
        L64:
            r2.m17033(r0)
            r2.m17034(r3)
            java.util.List<Yue.ۥۡۡۨ۠> r0 = Yue.C1504.f4693
            r0.add(r2)
            goto L9
        L70:
            return
    }
}
