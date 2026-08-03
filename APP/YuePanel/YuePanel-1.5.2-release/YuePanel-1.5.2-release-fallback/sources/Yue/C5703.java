package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۨۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5703 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f20956;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f20957;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f20958;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f20959;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f20960;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f20961;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f20962;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f20963;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f20964;

    /* JADX INFO: renamed from: Yue.ۥۡۨۥۥ$ۥ, reason: contains not printable characters */
    public class C5704 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5703 f20965;

        public C5704(Yue.C5703 r1) {
                r0 = this;
                r0.f20965 = r1
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ void m21309(Yue.C5703.C5704 r0, de.robv.android.xposed.XC_MethodHook.MethodHookParam r1) {
                r0.m21314(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ void m21310(android.view.View r0) {
                m21312(r0)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ void m21311(Yue.C5703.C5704 r0, android.widget.LinearLayout r1) {
                r0.m21313(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static /* synthetic */ void m21312(android.view.View r0) {
                com.yuexin.panel.C7892.m30730()
                return
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r3) throws java.lang.Throwable {
                r2 = this;
                super.afterHookedMethod(r3)
                android.content.Context r0 = Yue.C0421.m1605()
                Yue.C5375.m20256(r0)
                java.lang.Thread r0 = new java.lang.Thread
                Yue.ۥۡۨۥۢ r1 = new Yue.ۥۡۨۥۢ
                r1.<init>(r2, r3)
                r0.<init>(r1)
                r0.start()
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ void m21313(android.widget.LinearLayout r4) {
                r3 = this;
                android.content.Context r0 = Yue.C0421.m1605()
                android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                int r1 = com.yuexin.panel.R.C7879.f30544
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r4, r2)
                r4.addView(r0, r2)
                Yue.ۥۡۨۥۤ r4 = new Yue.ۥۡۨۥۤ
                r4.<init>()
                r0.setOnClickListener(r4)
                Yue.ۥۡۨۥۥ r4 = r3.f20965
                Yue.C5703.m21305(r4, r0)
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ void m21314(de.robv.android.xposed.XC_MethodHook.MethodHookParam r5) {
                r4 = this;
                r0 = 0
            L1:
                r1 = 100
                Yue.C5801.m21654(r1)     // Catch: java.lang.Throwable -> L1
                java.lang.Object r1 = r5.thisObject     // Catch: java.lang.Throwable -> L1
                android.view.View r1 = (android.view.View) r1     // Catch: java.lang.Throwable -> L1
                java.util.List r1 = Yue.C6926.m26795(r1)     // Catch: java.lang.Throwable -> L1
                int r2 = r1.size()     // Catch: java.lang.Throwable -> L1
                r3 = 2
                if (r2 < r3) goto L2e
                r2 = 1
                java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L1
                android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1     // Catch: java.lang.Throwable -> L1
                android.os.Handler r2 = new android.os.Handler     // Catch: java.lang.Throwable -> L1
                android.os.Looper r3 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L1
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L1
                Yue.ۥۡۨۥۣ r3 = new Yue.ۥۡۨۥۣ     // Catch: java.lang.Throwable -> L1
                r3.<init>(r4, r1)     // Catch: java.lang.Throwable -> L1
                r2.post(r3)     // Catch: java.lang.Throwable -> L1
                goto L32
            L2e:
                int r1 = Yue.C1501.f4675     // Catch: java.lang.Throwable -> L1
                if (r0 < r1) goto L33
            L32:
                return
            L33:
                int r0 = r0 + 1
                goto L1
        }
    }

    static {
            r0 = 1050(0x41a, float:1.471E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C5703() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static native /* synthetic */ boolean m21303(java.util.Map r0, java.lang.StringBuilder r1, android.view.View r2);

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m21304(java.lang.StringBuilder r0, com.kongzue.dialogx.dialogs.MessageDialog r1, android.view.View r2);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m21305(Yue.C5703 r0, android.view.View r1);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ boolean m21306(java.lang.StringBuilder r0, com.kongzue.dialogx.dialogs.MessageDialog r1, android.view.View r2);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native /* synthetic */ boolean m21307(java.util.Map r0, java.lang.StringBuilder r1, android.view.View r2);

    @Override // Yue.AbstractC3183
    public native com.yuexin.panel.myClass.itemInfo info();

    @Override // Yue.AbstractC3183
    public native void load(Yue.C1145 r1, java.lang.ClassLoader r2);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final native void m21308(android.view.View r1);
}
