package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۦۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3074 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f10031;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f10032;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f10033;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f10034;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f10035;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f10036;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f10037;

    /* JADX INFO: renamed from: Yue.ۥ۠ۤۦۥ$ۥ, reason: contains not printable characters */
    public class C3075 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f10038;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f10039;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f10040;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f10041;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C3074 f10042;

        public C3075(Yue.C3074 r1) {
                r0 = this;
                r0.f10042 = r1
                r0.<init>()
                return
        }

        private static /* synthetic */ java.lang.String yue_xin_awa(int r2) {
                if (r2 == 0) goto L3d
                r0 = 1
                if (r2 == r0) goto L2d
                r0 = 2
                if (r2 == r0) goto L1d
                r0 = 3
                if (r2 == r0) goto Ld
                r2 = 0
                return r2
            Ld:
                java.lang.String r2 = Yue.C3074.C3075.f10041
                if (r2 != 0) goto L1c
                r0 = 6491714968278625793(0x5a17345e7b556e01, double:9.817291075397724E125)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C3074.C3075.f10041 = r2
            L1c:
                return r2
            L1d:
                java.lang.String r2 = Yue.C3074.C3075.f10040
                if (r2 != 0) goto L2c
                r0 = -3041141429112269296(0xd5cbb1fb9e0a1610, double:-1.9849689847684825E105)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C3074.C3075.f10040 = r2
            L2c:
                return r2
            L2d:
                java.lang.String r2 = Yue.C3074.C3075.f10039
                if (r2 != 0) goto L3c
                r0 = 8757926205374768500(0x798a677b7872a574, double:2.925361181413557E277)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C3074.C3075.f10039 = r2
            L3c:
                return r2
            L3d:
                java.lang.String r2 = Yue.C3074.C3075.f10038
                if (r2 != 0) goto L4c
                r0 = -4201605389280940511(0xc5b0e628d58aee21, double:-5.230005929479664E27)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C3074.C3075.f10038 = r2
            L4c:
                return r2
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r7) throws java.lang.Throwable {
                r6 = this;
                r0 = 1
                java.lang.Object[] r7 = r7.args     // Catch: java.lang.Throwable -> L40
                int r1 = r7.length     // Catch: java.lang.Throwable -> L40
                r2 = 0
                r3 = r2
            L6:
                if (r3 >= r1) goto L4c
                r4 = r7[r3]     // Catch: java.lang.Throwable -> L40
                boolean r5 = r4 instanceof java.lang.String[]     // Catch: java.lang.Throwable -> L40
                if (r5 == 0) goto L42
                java.lang.String[] r4 = (java.lang.String[]) r4     // Catch: java.lang.Throwable -> L40
                r7 = r4[r2]     // Catch: java.lang.Throwable -> L40
                java.lang.String r1 = yue_xin_awa(r2)     // Catch: java.lang.Throwable -> L40
                java.lang.String r1 = Yue.C3074.m12955(r7, r1)     // Catch: java.lang.Throwable -> L40
                java.lang.String r2 = yue_xin_awa(r0)     // Catch: java.lang.Throwable -> L40
                java.lang.String r7 = Yue.C3074.m12955(r7, r2)     // Catch: java.lang.Throwable -> L40
                if (r1 == 0) goto L4c
                if (r7 == 0) goto L4c
                r2 = 2
                java.lang.String r2 = yue_xin_awa(r2)     // Catch: java.lang.Throwable -> L40
                boolean r2 = r7.startsWith(r2)     // Catch: java.lang.Throwable -> L40
                if (r2 == 0) goto L4c
                java.util.HashMap<java.lang.String, java.lang.String> r2 = Yue.C1501.f4669     // Catch: java.lang.Throwable -> L40
                r3 = 3
                java.lang.String r3 = yue_xin_awa(r3)     // Catch: java.lang.Throwable -> L40
                java.lang.String r7 = java.net.URLDecoder.decode(r7, r3)     // Catch: java.lang.Throwable -> L40
                r2.put(r1, r7)     // Catch: java.lang.Throwable -> L40
                goto L4c
            L40:
                r7 = move-exception
                goto L45
            L42:
                int r3 = r3 + 1
                goto L6
            L45:
                java.lang.String r7 = r7.getMessage()
                Yue.C4350.m17147(r7, r0)
            L4c:
                return
        }
    }

    static {
            r0 = 292(0x124, float:4.09E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C3074() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static native java.lang.String m12955(java.lang.String r0, java.lang.String r1);

    @Override // Yue.AbstractC3183
    public native org.luckypray.dexkit.result.MethodDataList dexKit(org.luckypray.dexkit.DexKitBridge r1);

    @Override // Yue.AbstractC3183
    public native com.yuexin.panel.myClass.itemInfo info();

    @Override // Yue.AbstractC3183
    public native void load(Yue.C1145 r1, java.lang.ClassLoader r2);
}
