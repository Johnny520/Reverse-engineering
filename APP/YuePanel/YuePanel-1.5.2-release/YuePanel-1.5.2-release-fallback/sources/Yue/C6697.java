package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6697 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23421;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23422;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23423;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23424;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23425;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23426;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23427;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23428;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23429;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23430;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23431;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23432;

    /* JADX INFO: renamed from: Yue.ۥۣۢۧۡ$ۥ, reason: contains not printable characters */
    public class C6698 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f23433;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6697 f23434;

        public C6698(Yue.C6697 r1) {
                r0 = this;
                r0.f23434 = r1
                r0.<init>()
                return
        }

        private static /* synthetic */ java.lang.String yue_xin_awa(int r2) {
                if (r2 == 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r2 = Yue.C6697.C6698.f23433
                if (r2 != 0) goto L13
                r0 = -462249933028048883(0xf995c222906a400d, double:-4.821273586388463E277)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C6697.C6698.f23433 = r2
            L13:
                return r2
        }

        public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r2) {
                r1 = this;
                r0 = 0
                java.lang.String r0 = yue_xin_awa(r0)
                boolean r0 = Yue.C1465.m7161(r0)
                if (r0 != 0) goto Lc
                return
            Lc:
                java.lang.Object[] r2 = r2.args
                r0 = 1
                r2 = r2[r0]
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                Yue.ۥۣۢۧۡ r0 = r1.f23434
                Yue.C6697.m25852(r0, r2)
                return
        }
    }

    static {
            r0 = 137(0x89, float:1.92E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C6697() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m25848(android.view.ViewGroup r0, android.content.Context r1, android.widget.LinearLayout.LayoutParams r2, android.widget.LinearLayout.LayoutParams r3);

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static native /* synthetic */ void m25849(android.view.View r0);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m25850(Yue.C4339 r0, android.widget.TextView r1, android.widget.LinearLayout r2, android.widget.LinearLayout.LayoutParams r3, android.view.ViewGroup r4, android.widget.LinearLayout.LayoutParams r5);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m25851(android.widget.LinearLayout r0);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m25852(Yue.C6697 r0, android.view.ViewGroup r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ void m25853(android.view.View r0);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m25854(Yue.C4339 r0, android.widget.TextView r1, android.widget.LinearLayout r2, android.widget.LinearLayout.LayoutParams r3, android.view.ViewGroup r4, android.widget.LinearLayout.LayoutParams r5);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static native /* synthetic */ void m25855(android.view.ViewGroup r0, android.content.Context r1, android.widget.LinearLayout.LayoutParams r2, android.widget.LinearLayout.LayoutParams r3);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m25856(android.widget.LinearLayout r0);

    @Override // Yue.AbstractC3183
    public native org.luckypray.dexkit.result.MethodDataList dexKit(org.luckypray.dexkit.DexKitBridge r1);

    @Override // Yue.AbstractC3183
    public native com.yuexin.panel.myClass.itemInfo info();

    @Override // Yue.AbstractC3183
    public native void load(Yue.C1145 r1, java.lang.ClassLoader r2);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final native void m25857(android.view.ViewGroup r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final native void m25858(android.widget.LinearLayout r1);
}
