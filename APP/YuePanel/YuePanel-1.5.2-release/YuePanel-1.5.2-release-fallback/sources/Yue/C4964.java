package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۥۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4964 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.util.List<android.view.View> f15817 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15818;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15819;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15820;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15821;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15822;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15823;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15824;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15825;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15826;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15827;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15828;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15829;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15830;

    /* JADX INFO: renamed from: Yue.ۥۡۥۢۥ$ۥ, reason: contains not printable characters */
    public class C4965 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f15831;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f15832;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C4964 f15833;

        public C4965(Yue.C4964 r1) {
                r0 = this;
                r0.f15833 = r1
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
                java.lang.String r2 = Yue.C4964.C4965.f15832
                if (r2 != 0) goto L16
                r0 = 6160932153671587088(0x55800726d8e09510, double:7.17969730563941E103)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C4964.C4965.f15832 = r2
            L16:
                return r2
            L17:
                java.lang.String r2 = Yue.C4964.C4965.f15831
                if (r2 != 0) goto L26
                r0 = 2591087789027366920(0x23f5649daed41808, double:1.839561371678888E-135)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C4964.C4965.f15831 = r2
            L26:
                return r2
        }

        public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r2) throws java.lang.Throwable {
                r1 = this;
                r0 = 0
                java.lang.String r0 = yue_xin_awa(r0)
                boolean r0 = Yue.C1465.m7161(r0)
                if (r0 == 0) goto L1b
                r0 = 1
                java.lang.String r0 = yue_xin_awa(r0)
                int r0 = Yue.C1465.m7163(r0)
                if (r0 == 0) goto L17
                goto L1b
            L17:
                r0 = 0
                r2.setResult(r0)
            L1b:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۥۢۥ$ۥ۟, reason: contains not printable characters */
    public class C4966 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C4964 f15834;

        public C4966(Yue.C4964 r1) {
                r0 = this;
                r0.f15834 = r1
                r0.<init>()
                return
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r2) {
                r1 = this;
                java.lang.Object r2 = r2.thisObject
                android.view.View r2 = (android.view.View) r2
                java.util.List r0 = Yue.C4964.m19387()
                r0.add(r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۥۢۥ$ۥ۟۟, reason: contains not printable characters */
    public class C4967 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C4964 f15835;

        public C4967(Yue.C4964 r1) {
                r0 = this;
                r0.f15835 = r1
                r0.<init>()
                return
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r2) {
                r1 = this;
                java.lang.Object r2 = r2.thisObject
                android.view.View r2 = (android.view.View) r2
                java.util.List r0 = Yue.C4964.m19387()
                r0.add(r2)
                return
        }
    }

    static {
            r0 = 551(0x227, float:7.72E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            Yue.C4964.f15817 = r0
            return
    }

    public C4964() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m19385();

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static native /* synthetic */ void m19386(android.view.View r0);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ java.util.List m19387();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native void m19388();

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native /* synthetic */ void m19389(android.view.View r0);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static native /* synthetic */ void m19390();

    @Override // Yue.AbstractC3183
    public native org.luckypray.dexkit.result.MethodDataList dexKit(org.luckypray.dexkit.DexKitBridge r1);

    @Override // Yue.AbstractC3183
    public native com.yuexin.panel.myClass.itemInfo info();

    @Override // Yue.AbstractC3183
    public void load(Yue.C1145 r4, java.lang.ClassLoader r5) {
            r3 = this;
            r0 = 4
            java.lang.String r1 = r4.m6002()     // Catch: java.lang.Throwable -> L22
            java.lang.Class r1 = r5.loadClass(r1)     // Catch: java.lang.Throwable -> L22
            java.lang.String r4 = r4.m6001()     // Catch: java.lang.Throwable -> L22
            Yue.ۥۡۥۢۥ$ۥ r2 = new Yue.ۥۡۥۢۥ$ۥ     // Catch: java.lang.Throwable -> L22
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L22
            Yue.C3065.m12924(r1, r4, r2)     // Catch: java.lang.Throwable -> L22
            java.lang.String r4 = yue_xin_awa(r0)     // Catch: java.lang.Throwable -> L22
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L22
            Yue.C1465.m7171(r4, r1)     // Catch: java.lang.Throwable -> L22
            goto L31
        L22:
            java.lang.String r4 = yue_xin_awa(r0)
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            Yue.C1465.m7171(r4, r0)
            r3.m19392(r5)
        L31:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final native java.lang.String m19391();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m19392(java.lang.ClassLoader r3) {
            r2 = this;
            r0 = 2
            java.lang.String r0 = yue_xin_awa(r0)     // Catch: java.lang.Throwable -> L30
            boolean r0 = Yue.C1465.m7161(r0)     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto Lc
            return
        Lc:
            r0 = 7
            java.lang.String r0 = yue_xin_awa(r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.Class r0 = r3.loadClass(r0)     // Catch: java.lang.Throwable -> L1d
            Yue.ۥۡۥۢۥ$ۥ۟ r1 = new Yue.ۥۡۥۢۥ$ۥ۟     // Catch: java.lang.Throwable -> L1d
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1d
            Yue.C3065.m12923(r0, r1)     // Catch: java.lang.Throwable -> L1d
        L1d:
            r0 = 8
            java.lang.String r0 = yue_xin_awa(r0)     // Catch: java.lang.Throwable -> L30
            java.lang.Class r3 = r3.loadClass(r0)     // Catch: java.lang.Throwable -> L30
            Yue.ۥۡۥۢۥ$ۥ۟۟ r0 = new Yue.ۥۡۥۢۥ$ۥ۟۟     // Catch: java.lang.Throwable -> L30
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L30
            Yue.C3065.m12923(r3, r0)     // Catch: java.lang.Throwable -> L30
            goto L3d
        L30:
            r3 = move-exception
            r0 = 1
            java.lang.String r0 = yue_xin_awa(r0)
            java.lang.String r3 = r3.getMessage()
            Yue.C1828.m8591(r0, r3)
        L3d:
            return
    }
}
