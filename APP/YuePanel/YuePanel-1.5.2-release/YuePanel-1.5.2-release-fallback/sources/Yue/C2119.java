package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C2119 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f6658;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f6659;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f6660;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f6661;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f6662;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f6663;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f6664;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f6665;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f6666;

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۦۣ$ۥ, reason: contains not printable characters */
    public class C2120 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f6667;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f6668;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C1145 f6669;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C2119 f6670;

        public C2120(Yue.C2119 r1, Yue.C1145 r2) {
                r0 = this;
                r0.f6670 = r1
                r0.f6669 = r2
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
                java.lang.String r2 = Yue.C2119.C2120.f6668
                if (r2 != 0) goto L16
                r0 = -4938113237667786353(0xbb784c2c7028518f, double:-3.2157543733588855E-22)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C2119.C2120.f6668 = r2
            L16:
                return r2
            L17:
                java.lang.String r2 = Yue.C2119.C2120.f6667
                if (r2 != 0) goto L26
                r0 = 7844401026106168148(0x6cdce92bfcc49354, double:2.4915948565629698E216)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C2119.C2120.f6667 = r2
            L26:
                return r2
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r5) throws java.lang.Throwable {
                r4 = this;
                r0 = 0
                java.lang.String r1 = yue_xin_awa(r0)
                boolean r1 = Yue.C1465.m7161(r1)
                if (r1 != 0) goto Lc
                return
            Lc:
                java.lang.Object r5 = r5.getResult()
                java.util.List r5 = (java.util.List) r5
                if (r5 != 0) goto L15
                return
            L15:
                java.util.Iterator r5 = r5.iterator()
            L19:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L58
                java.lang.Object r1 = r5.next()
                java.lang.Class r2 = r1.getClass()
                java.lang.String r2 = r2.getName()
                Yue.ۥ۟ۤۧ۠ r3 = r4.f6669
                java.lang.String r3 = r3.m6002()
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L19
                java.util.List r2 = Yue.C1501.f4668
                r2.add(r1)
                Yue.ۥۣ۠ۡۧ r2 = new Yue.ۥۣ۠ۡۧ
                r2.<init>()
                Yue.ۥۣ۠ۡۧ r1 = r2.m10796(r1)
                java.lang.Class r2 = java.lang.Integer.TYPE
                Yue.ۥۣ۠ۡۧ r1 = r1.m10798(r2)
                r2 = 1
                java.lang.String r2 = yue_xin_awa(r2)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
                r1.m10795(r2, r3)
                goto L19
            L58:
                return
        }
    }

    static {
            r0 = 696(0x2b8, float:9.75E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C2119() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    @Override // Yue.AbstractC3183
    public native java.util.HashMap<java.lang.String, org.luckypray.dexkit.query.FindMethod> dexKit(org.luckypray.dexkit.DexKitBridge r1, java.lang.String r2);

    @Override // Yue.AbstractC3183
    public native com.yuexin.panel.myClass.itemInfo info();

    @Override // Yue.AbstractC3183
    public native void load(Yue.C1146 r1, java.lang.ClassLoader r2);
}
