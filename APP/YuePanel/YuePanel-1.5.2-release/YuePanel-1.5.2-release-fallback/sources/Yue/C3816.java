package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3816 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f12086;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f12087;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f12088;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f12089;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f12090;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f12091;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f12092;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f12093;

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۢۥ$ۥ, reason: contains not printable characters */
    public class C3817 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f12094;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f12095;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f12096;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C3816 f12097;

        public C3817(Yue.C3816 r1) {
                r0 = this;
                r0.f12097 = r1
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
                java.lang.String r2 = Yue.C3816.C3817.f12096
                if (r2 != 0) goto L19
                r0 = -6248461582893793618(0xa949014bcef0beae, double:-8.318012033158497E-110)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C3816.C3817.f12096 = r2
            L19:
                return r2
            L1a:
                java.lang.String r2 = Yue.C3816.C3817.f12095
                if (r2 != 0) goto L29
                r0 = 6124391398629070904(0x54fe358754be5838, double:2.642994705631984E101)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C3816.C3817.f12095 = r2
            L29:
                return r2
            L2a:
                java.lang.String r2 = Yue.C3816.C3817.f12094
                if (r2 != 0) goto L39
                r0 = -3015189725834673034(0xd627e4eb65378476, double:-1.0960270654405862E107)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C3816.C3817.f12094 = r2
            L39:
                return r2
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r3) throws java.lang.Throwable {
                r2 = this;
                r0 = 0
                java.lang.String r0 = yue_xin_awa(r0)
                boolean r0 = Yue.C1465.m7161(r0)
                if (r0 == 0) goto L33
                java.lang.String r0 = Yue.C1501.f4666
                r1 = 1
                java.lang.String r1 = yue_xin_awa(r1)
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L28
                java.lang.String r0 = Yue.C0421.m1601()
                r1 = 2
                java.lang.String r1 = yue_xin_awa(r1)
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L28
                return
            L28:
                java.lang.Object r3 = r3.getResult()
                android.view.View r3 = (android.view.View) r3
                Yue.ۥ۠ۨۢۥ r0 = r2.f12097
                Yue.C3816.m15277(r0, r3)
            L33:
                return
        }
    }

    static {
            r0 = 50
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C3816() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m15272(android.view.View r0);

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static native /* synthetic */ void m15273(Yue.C3816 r0, android.view.View r1, android.content.Context r2);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m15274(Yue.C3816 r0, android.view.View r1);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m15275(Yue.C4336 r0, android.view.View r1);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m15276(java.util.List r0, android.view.View r1);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ void m15277(Yue.C3816 r0, android.view.View r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    private native void m15278(android.view.View r1);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m15279(android.view.View r0);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native /* synthetic */ void m15280(java.util.List r0, android.view.View r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m15281(Yue.C4336 r0, android.view.View r1);

    @Override // Yue.AbstractC3183
    public native com.yuexin.panel.myClass.itemInfo info();

    @Override // Yue.AbstractC3183
    public native void load(Yue.C1145 r1, java.lang.ClassLoader r2);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final native void m15282(android.view.View r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final native /* synthetic */ void m15283(android.view.View r1, android.content.Context r2);

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final native /* synthetic */ void m15284(android.view.View r1);
}
