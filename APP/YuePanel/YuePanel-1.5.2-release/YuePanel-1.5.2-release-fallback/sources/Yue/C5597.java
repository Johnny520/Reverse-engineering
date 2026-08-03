package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۨۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5597 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f20645;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f20646;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f20647;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f20648;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f20649;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f20650;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f20651;

    /* JADX INFO: renamed from: Yue.ۥۡۨۡ۟$ۥ, reason: contains not printable characters */
    public class C5598 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f20652;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5597 f20653;

        public C5598(Yue.C5597 r1) {
                r0 = this;
                r0.f20653 = r1
                r0.<init>()
                return
        }

        private static /* synthetic */ java.lang.String yue_xin_awa(int r2) {
                if (r2 == 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r2 = Yue.C5597.C5598.f20652
                if (r2 != 0) goto L13
                r0 = 3650488232502961642(0x32a923b4d31525ea, double:1.1935680781050296E-64)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C5597.C5598.f20652 = r2
            L13:
                return r2
        }

        public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r2) throws java.lang.Throwable {
                r1 = this;
                r0 = 0
                java.lang.String r0 = yue_xin_awa(r0)
                boolean r0 = Yue.C1465.m7161(r0)
                if (r0 != 0) goto Lc
                return
            Lc:
                Yue.ۥۡۨۡ۟ r0 = r1.f20653
                Yue.C5597.m20955(r0)
                r0 = 0
                r2.setResult(r0)
                return
        }
    }

    static {
            r0 = 963(0x3c3, float:1.35E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C5597() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m20953(android.widget.EditText r0, android.view.View r1);

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static native /* synthetic */ void m20954(android.widget.EditText r0);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m20955(Yue.C5597 r0);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m20956(android.widget.EditText r0);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m20957(android.widget.EditText r0, android.view.View r1);

    @Override // Yue.AbstractC3183
    public native com.yuexin.panel.myClass.itemInfo info();

    @Override // Yue.AbstractC3183
    public void load(Yue.C1145 r2, java.lang.ClassLoader r3) {
            r1 = this;
            r2 = 3
            java.lang.String r2 = yue_xin_awa(r2)     // Catch: java.lang.Throwable -> L17
            java.lang.Class r2 = r3.loadClass(r2)     // Catch: java.lang.Throwable -> L17
            r3 = 4
            java.lang.String r3 = yue_xin_awa(r3)     // Catch: java.lang.Throwable -> L17
            Yue.ۥۡۨۡ۟$ۥ r0 = new Yue.ۥۡۨۡ۟$ۥ     // Catch: java.lang.Throwable -> L17
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L17
            Yue.C3065.m12924(r2, r3, r0)     // Catch: java.lang.Throwable -> L17
            goto L24
        L17:
            r2 = move-exception
            r3 = 5
            java.lang.String r3 = yue_xin_awa(r3)
            java.lang.String r2 = r2.getMessage()
            Yue.C1828.m8591(r3, r2)
        L24:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final native void m20958();
}
