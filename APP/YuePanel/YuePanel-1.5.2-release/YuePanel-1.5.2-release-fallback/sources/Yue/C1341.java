package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۣۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1341 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f4294;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f4295;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f4296;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f4297;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f4298;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f4299;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f4300;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f4301;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f4302;

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۣۨ$ۥ, reason: contains not printable characters */
    public class C1342 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f4303;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f4304;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C1341 f4305;

        public C1342(Yue.C1341 r1) {
                r0 = this;
                r0.f4305 = r1
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
                java.lang.String r2 = Yue.C1341.C1342.f4304
                if (r2 != 0) goto L16
                r0 = -9069094350177773554(0x82241abd1726d80e, double:-2.401631960770026E-298)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C1341.C1342.f4304 = r2
            L16:
                return r2
            L17:
                java.lang.String r2 = Yue.C1341.C1342.f4303
                if (r2 != 0) goto L26
                r0 = -9194865848243477468(0x8065463a3e13a424, double:-9.467389421367982E-307)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C1341.C1342.f4303 = r2
            L26:
                return r2
        }

        public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r3) throws java.lang.Throwable {
                r2 = this;
                r0 = 0
                java.lang.String r0 = yue_xin_awa(r0)
                boolean r0 = Yue.C1465.m7161(r0)
                if (r0 == 0) goto L28
                r0 = 1
                java.lang.String r1 = yue_xin_awa(r0)
                boolean r1 = Yue.C1465.m7161(r1)
                if (r1 != 0) goto L17
                goto L28
            L17:
                java.lang.Object[] r1 = r3.args
                r0 = r1[r0]
                java.lang.Long r0 = (java.lang.Long) r0
                long r0 = r0.longValue()
                java.lang.String r0 = Yue.C6238.m23252(r0)
                r3.setResult(r0)
            L28:
                return
        }
    }

    static {
            r0 = 604(0x25c, float:8.46E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C1341() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m6817(java.lang.String[] r0, com.kongzue.dialogx.dialogs.BottomMenu r1, android.view.View r2);

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    private static native /* synthetic */ boolean m6818(java.lang.String[] r0, com.kongzue.dialogx.dialogs.BottomMenu r1, android.view.View r2);

    @Override // Yue.AbstractC3183
    public native com.yuexin.panel.myClass.itemInfo info();

    @Override // Yue.AbstractC3183
    public native void load(Yue.C1145 r1, java.lang.ClassLoader r2);

    @Override // Yue.AbstractC3183
    public native void onClick();
}
