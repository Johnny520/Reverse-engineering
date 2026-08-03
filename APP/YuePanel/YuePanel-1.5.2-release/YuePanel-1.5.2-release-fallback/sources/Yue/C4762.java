package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۤ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4762 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15094;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15095;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15096;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15097;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15098;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15099;

    /* JADX INFO: renamed from: Yue.ۥۡۤ۠ۦ$ۥ, reason: contains not printable characters */
    public class C4763 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f15100;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f15101;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f15102;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f15103;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C4762 f15104;

        public C4763(Yue.C4762 r1) {
                r0 = this;
                r0.f15104 = r1
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
                java.lang.String r2 = Yue.C4762.C4763.f15103
                if (r2 != 0) goto L1c
                r0 = -6088565731505428549(0xab8111b9ce00a7bb, double:-3.901985540861875E-99)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C4762.C4763.f15103 = r2
            L1c:
                return r2
            L1d:
                java.lang.String r2 = Yue.C4762.C4763.f15102
                if (r2 != 0) goto L2c
                r0 = 2947681856558245437(0x28e84507f304a63d, double:1.2614649154552736E-111)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C4762.C4763.f15102 = r2
            L2c:
                return r2
            L2d:
                java.lang.String r2 = Yue.C4762.C4763.f15101
                if (r2 != 0) goto L3c
                r0 = -3711183183404264190(0xcc7f3a8eb0c91502, double:-3.136415627202166E60)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C4762.C4763.f15101 = r2
            L3c:
                return r2
            L3d:
                java.lang.String r2 = Yue.C4762.C4763.f15100
                if (r2 != 0) goto L4c
                r0 = 944139809090701262(0xd1a4227732807ce, double:1.5022148322508184E-245)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C4762.C4763.f15100 = r2
            L4c:
                return r2
        }

        public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r4) throws java.lang.Throwable {
                r3 = this;
                java.lang.Object[] r4 = r4.args
                r0 = 0
                r4 = r4[r0]
                java.lang.String r4 = (java.lang.String) r4
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L43
                r1.<init>(r4)     // Catch: java.lang.Exception -> L43
                java.lang.String r4 = yue_xin_awa(r0)     // Catch: java.lang.Exception -> L43
                boolean r4 = r1.isNull(r4)     // Catch: java.lang.Exception -> L43
                if (r4 != 0) goto L43
                r4 = 1
                java.lang.String r0 = yue_xin_awa(r4)     // Catch: java.lang.Exception -> L43
                boolean r0 = r1.isNull(r0)     // Catch: java.lang.Exception -> L43
                r2 = 2
                if (r0 != 0) goto L2d
                java.lang.String r4 = yue_xin_awa(r4)     // Catch: java.lang.Exception -> L43
                java.lang.String r0 = yue_xin_awa(r2)     // Catch: java.lang.Exception -> L43
                r1.put(r4, r0)     // Catch: java.lang.Exception -> L43
            L2d:
                r4 = 3
                java.lang.String r0 = yue_xin_awa(r4)     // Catch: java.lang.Exception -> L43
                boolean r0 = r1.isNull(r0)     // Catch: java.lang.Exception -> L43
                if (r0 != 0) goto L43
                java.lang.String r4 = yue_xin_awa(r4)     // Catch: java.lang.Exception -> L43
                java.lang.String r0 = yue_xin_awa(r2)     // Catch: java.lang.Exception -> L43
                r1.put(r4, r0)     // Catch: java.lang.Exception -> L43
            L43:
                return
        }
    }

    static {
            r0 = 1080(0x438, float:1.513E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C4762() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    @Override // Yue.AbstractC3183
    public native com.yuexin.panel.myClass.itemInfo info();

    @Override // Yue.AbstractC3183
    public native void load(Yue.C1145 r1, java.lang.ClassLoader r2);
}
