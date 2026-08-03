package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0019 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f46;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f47;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f48;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f49;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f50;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f51;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f52;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f53;

    /* JADX INFO: renamed from: Yue.ۥ۟۟۠۠$ۥ, reason: contains not printable characters */
    public class C0020 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f54;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f55;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f56;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ java.lang.ClassLoader f57;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0019 f58;

        public C0020(Yue.C0019 r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.f58 = r1
                r0.f57 = r2
                r0.<init>()
                return
        }

        private static /* synthetic */ java.lang.String yue_xin_awa(int r2) {
                if (r2 == 0) goto L2a
                r0 = 1
                if (r2 == r0) goto L1a
                r0 = 2
                if (r2 == r0) goto La
                r2 = 0
                return r2
            La:
                java.lang.String r2 = Yue.C0019.C0020.f56
                if (r2 != 0) goto L19
                r0 = -4061799449780968636(0xc7a196ebb6eda344, double:-1.1690250658225777E37)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C0019.C0020.f56 = r2
            L19:
                return r2
            L1a:
                java.lang.String r2 = Yue.C0019.C0020.f55
                if (r2 != 0) goto L29
                r0 = 3525063710357537117(0x30eb8ac49a7b415d, double:4.8713296589714606E-73)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C0019.C0020.f55 = r2
            L29:
                return r2
            L2a:
                java.lang.String r2 = Yue.C0019.C0020.f54
                if (r2 != 0) goto L39
                r0 = -5019277460014409320(0xba57f1be4eb75998, double:-1.2088787295786493E-27)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C0019.C0020.f54 = r2
            L39:
                return r2
        }

        public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r5) throws java.lang.Throwable {
                r4 = this;
                super.beforeHookedMethod(r5)
                java.lang.Object[] r5 = r5.args
                r0 = 1
                r5 = r5[r0]
                java.lang.Class r1 = r5.getClass()
                java.lang.ClassLoader r2 = r4.f57
                r3 = 0
                java.lang.String r3 = yue_xin_awa(r3)
                java.lang.Class r2 = r2.loadClass(r3)
                java.lang.reflect.Field r1 = de.robv.android.xposed.XposedHelpers.findFirstFieldByExactType(r1, r2)
                java.lang.Object r5 = r1.get(r5)
                java.lang.Class r1 = r5.getClass()
                java.lang.ClassLoader r2 = r4.f57
                java.lang.String r3 = yue_xin_awa(r0)
                java.lang.Class r2 = r2.loadClass(r3)
                java.lang.reflect.Field r1 = de.robv.android.xposed.XposedHelpers.findFirstFieldByExactType(r1, r2)
                java.lang.Object r5 = r1.get(r5)
                r1 = 2
                java.lang.String r2 = yue_xin_awa(r1)
                java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
                java.lang.String r5 = r5.toString()
                java.util.regex.Matcher r5 = r2.matcher(r5)
                boolean r2 = r5.find()
                if (r2 == 0) goto L82
                java.lang.String r2 = r5.group(r0)
                int r2 = java.lang.Integer.parseInt(r2)
                if (r2 != r0) goto L67
                java.lang.String r0 = r5.group(r1)     // Catch: java.lang.Exception -> L5f
                java.lang.String r0 = Yue.C6636.m25500(r0)     // Catch: java.lang.Exception -> L5f
                goto L63
            L5f:
                java.lang.String r0 = r5.group(r1)
            L63:
                Yue.C4263.m16554(r0)
                goto L70
            L67:
                if (r2 != r1) goto L70
                java.lang.String r0 = r5.group(r1)
                Yue.C4263.m16554(r0)
            L70:
                Yue.C4263.m16553(r2)
                r0 = 4
                java.lang.String r5 = r5.group(r0)
                Yue.C4263.m16555(r5)
                java.lang.String r5 = Yue.C4263.m16540()
                Yue.C3647.m14758(r5)
            L82:
                return
        }
    }

    static {
            r0 = 255(0xff, float:3.57E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C0019() {
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
