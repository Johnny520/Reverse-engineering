package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦۣ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5279 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.lang.Object f19783;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.lang.String f19784;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static java.lang.String f19785;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f19786;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f19787;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f19788;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f19789;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f19790;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f19791;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f19792;

    /* JADX INFO: renamed from: Yue.ۥۡۦۣ۠$ۥ, reason: contains not printable characters */
    public class C5280 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5279 f19793;

        public C5280(Yue.C5279 r1) {
                r0 = this;
                r0.f19793 = r1
                r0.<init>()
                return
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r1) {
                r0 = this;
                java.lang.Object r1 = r1.thisObject
                Yue.C5279.m19937(r1)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۣ۠$ۥ۟, reason: contains not printable characters */
    public class C5281 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f19794;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ java.lang.ClassLoader f19795;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C1145 f19796;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5279 f19797;

        public C5281(Yue.C5279 r1, java.lang.ClassLoader r2, Yue.C1145 r3) {
                r0 = this;
                r0.f19797 = r1
                r0.f19795 = r2
                r0.f19796 = r3
                r0.<init>()
                return
        }

        private static /* synthetic */ java.lang.String yue_xin_awa(int r2) {
                if (r2 == 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r2 = Yue.C5279.C5281.f19794
                if (r2 != 0) goto L13
                r0 = -6728739784281742067(0xa29eb6d10bd9250d, double:-6.2968048677748386E-142)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C5279.C5281.f19794 = r2
            L13:
                return r2
        }

        public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r4) {
                r3 = this;
                java.lang.String r0 = Yue.C5279.m19938()     // Catch: java.lang.Throwable -> L37
                if (r0 != 0) goto L53
                java.lang.ClassLoader r0 = r3.f19795     // Catch: java.lang.Throwable -> L37
                java.lang.Object[] r4 = r4.args     // Catch: java.lang.Throwable -> L37
                r1 = 1
                r4 = r4[r1]     // Catch: java.lang.Throwable -> L37
                java.lang.Class r4 = r4.getClass()     // Catch: java.lang.Throwable -> L37
                java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L37
                java.lang.Class r4 = r0.loadClass(r4)     // Catch: java.lang.Throwable -> L37
                java.lang.ClassLoader r0 = r3.f19795     // Catch: java.lang.Throwable -> L37
                Yue.ۥ۟ۤۧ۠ r2 = r3.f19796     // Catch: java.lang.Throwable -> L37
                java.util.List r2 = r2.m6005()     // Catch: java.lang.Throwable -> L37
                java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L37
                java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L37
                java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.Throwable -> L37
                java.lang.Class r4 = Yue.C3842.m15386(r4, r0)     // Catch: java.lang.Throwable -> L37
                java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L37
                Yue.C5279.m19939(r4)     // Catch: java.lang.Throwable -> L37
                goto L53
            L37:
                r4 = move-exception
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 0
                java.lang.String r1 = yue_xin_awa(r1)
                r0.append(r1)
                java.lang.String r4 = r4.getMessage()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                Yue.C3801.m15237(r4)
            L53:
                return
        }
    }

    static {
            r0 = 1105(0x451, float:1.548E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C5279() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static native /* synthetic */ java.lang.Object m19937(java.lang.Object r0);

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static native /* synthetic */ java.lang.String m19938();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ java.lang.String m19939(java.lang.String r0);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean m19940() {
            java.lang.ClassLoader r0 = Yue.C0421.m1607()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = Yue.C5279.f19785     // Catch: java.lang.Throwable -> L2f
            java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.Throwable -> L2f
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r0 = Yue.C5276.m19883(r0, r1)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r1 = Yue.C5279.f19783     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = Yue.C5279.f19784     // Catch: java.lang.Throwable -> L2f
            r3 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r0}     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r0 = de.robv.android.xposed.XposedHelpers.callMethod(r1, r2, r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L2f
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L2f
            return r0
        L2f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 6
            java.lang.String r2 = yue_xin_awa(r2)
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            Yue.C4350.m17148(r0)
            r0 = 0
            return r0
    }

    @Override // Yue.AbstractC3183
    public native org.luckypray.dexkit.result.MethodDataList dexKit(org.luckypray.dexkit.DexKitBridge r1);

    @Override // Yue.AbstractC3183
    public native com.yuexin.panel.myClass.itemInfo info();

    @Override // Yue.AbstractC3183
    public void load(Yue.C1145 r6, java.lang.ClassLoader r7) {
            r5 = this;
            java.lang.String r0 = r6.m6001()     // Catch: java.lang.Throwable -> L3c
            Yue.C5279.f19784 = r0     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = r6.m6002()     // Catch: java.lang.Throwable -> L3c
            java.lang.Class r0 = r7.loadClass(r0)     // Catch: java.lang.Throwable -> L3c
            Yue.ۥۡۦۣ۠$ۥ r1 = new Yue.ۥۡۦۣ۠$ۥ     // Catch: java.lang.Throwable -> L3c
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L3c
            Yue.C3065.m12923(r0, r1)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = r6.m6002()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = r6.m6001()     // Catch: java.lang.Throwable -> L3c
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L3c
            java.util.List r3 = r6.m6005()     // Catch: java.lang.Throwable -> L3c
            r4 = 1
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Class r3 = r7.loadClass(r3)     // Catch: java.lang.Throwable -> L3c
            Yue.ۥۡۦۣ۠$ۥ۟ r4 = new Yue.ۥۡۦۣ۠$ۥ۟     // Catch: java.lang.Throwable -> L3c
            r4.<init>(r5, r7, r6)     // Catch: java.lang.Throwable -> L3c
            java.lang.Object[] r6 = new java.lang.Object[]{r2, r3, r4}     // Catch: java.lang.Throwable -> L3c
            Yue.C3065.m12917(r0, r7, r1, r6)     // Catch: java.lang.Throwable -> L3c
            goto L49
        L3c:
            r6 = move-exception
            r7 = 2
            java.lang.String r7 = yue_xin_awa(r7)
            java.lang.String r6 = r6.getMessage()
            Yue.C1828.m8591(r7, r6)
        L49:
            return
    }
}
