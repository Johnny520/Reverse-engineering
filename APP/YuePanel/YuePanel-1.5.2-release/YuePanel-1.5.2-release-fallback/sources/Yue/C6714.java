package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6714 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23532;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23533;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23534;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23535;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23536;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23537;

    /* JADX INFO: renamed from: Yue.ۥۣۢۨۢ$ۥ, reason: contains not printable characters */
    public class C6715 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f23538;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f23539;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6714 f23540;

        public C6715(Yue.C6714 r1) {
                r0 = this;
                r0.f23540 = r1
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
                java.lang.String r2 = Yue.C6714.C6715.f23539
                if (r2 != 0) goto L16
                r0 = 1890184754014383161(0x1a3b4904e6e2ec39, double:2.568563293915224E-182)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C6714.C6715.f23539 = r2
            L16:
                return r2
            L17:
                java.lang.String r2 = Yue.C6714.C6715.f23538
                if (r2 != 0) goto L26
                r0 = -7358406702375995059(0x99e1b0173806794d, double:-5.203407156758954E-184)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C6714.C6715.f23538 = r2
            L26:
                return r2
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r5) throws java.lang.Throwable {
                r4 = this;
                r0 = 0
                java.lang.String r1 = yue_xin_awa(r0)     // Catch: java.lang.Throwable -> L4a
                boolean r1 = Yue.C1465.m7161(r1)     // Catch: java.lang.Throwable -> L4a
                if (r1 != 0) goto Lc
                return
            Lc:
                java.lang.Object[] r1 = r5.args     // Catch: java.lang.Throwable -> L4a
                r1 = r1[r0]     // Catch: java.lang.Throwable -> L4a
                java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> L4a
                java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L4a
                Yue.ۥۣ۠ۡۧ r2 = new Yue.ۥۣ۠ۡۧ     // Catch: java.lang.Throwable -> L4a
                r2.<init>()     // Catch: java.lang.Throwable -> L4a
                java.lang.Object[] r3 = r5.args     // Catch: java.lang.Throwable -> L4a
                r0 = r3[r0]     // Catch: java.lang.Throwable -> L4a
                Yue.ۥۣ۠ۡۧ r0 = r2.m10796(r0)     // Catch: java.lang.Throwable -> L4a
                java.lang.Class<java.util.List> r2 = java.util.List.class
                Yue.ۥۣ۠ۡۧ r0 = r0.m10798(r2)     // Catch: java.lang.Throwable -> L4a
                Yue.ۥۣ۠ۡۧ r0 = r0.m10794(r1)     // Catch: java.lang.Throwable -> L4a
                r1 = 1
                java.lang.String r1 = yue_xin_awa(r1)     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r0 = r0.m10789(r1)     // Catch: java.lang.Throwable -> L4a
                java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r5 = r5.getResult()     // Catch: java.lang.Throwable -> L4a
                java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Throwable -> L4a
                if (r0 == 0) goto L52
                if (r5 == 0) goto L52
                Yue.ۥۣۢۨۢ r1 = r4.f23540     // Catch: java.lang.Throwable -> L4a
                Yue.C6714.m25921(r1, r0, r5)     // Catch: java.lang.Throwable -> L4a
                goto L52
            L4a:
                r5 = move-exception
                java.lang.String r5 = r5.getMessage()
                Yue.C4350.m17148(r5)
            L52:
                return
        }
    }

    static {
            r0 = 110(0x6e, float:1.54E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C6714() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m25921(Yue.C6714 r0, java.util.List r1, java.util.List r2);

    @Override // Yue.AbstractC3183
    public native org.luckypray.dexkit.result.MethodDataList dexKit(org.luckypray.dexkit.DexKitBridge r1);

    @Override // Yue.AbstractC3183
    public native com.yuexin.panel.myClass.itemInfo info();

    @Override // Yue.AbstractC3183
    public native void load(Yue.C1145 r1, java.lang.ClassLoader r2);

    @Override // Yue.AbstractC3183
    public native void onClick();

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final native void m25922(java.util.List r1, java.util.List r2);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final native void m25923(java.util.List r1, java.util.List r2);
}
