package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۤۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4810 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static int f15244 = 5201314;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15245;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15246;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15247;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15248;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f15249;

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۦ$ۥ, reason: contains not printable characters */
    public class C4811 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f15250;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f15251;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f15252;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f15253;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f15254;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C4810 f15255;

        public C4811(Yue.C4810 r1) {
                r0 = this;
                r0.f15255 = r1
                r0.<init>()
                return
        }

        private static /* synthetic */ java.lang.String yue_xin_awa(int r2) {
                if (r2 == 0) goto L50
                r0 = 1
                if (r2 == r0) goto L40
                r0 = 2
                if (r2 == r0) goto L30
                r0 = 3
                if (r2 == r0) goto L20
                r0 = 4
                if (r2 == r0) goto L10
                r2 = 0
                return r2
            L10:
                java.lang.String r2 = Yue.C4810.C4811.f15254
                if (r2 != 0) goto L1f
                r0 = -3482869566520061983(0xcfaa5c95108d8fe1, double:-5.961856399798789E75)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C4810.C4811.f15254 = r2
            L1f:
                return r2
            L20:
                java.lang.String r2 = Yue.C4810.C4811.f15253
                if (r2 != 0) goto L2f
                r0 = 7139754222167825334(0x631580a313e89bb6, double:2.0287395786440918E169)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C4810.C4811.f15253 = r2
            L2f:
                return r2
            L30:
                java.lang.String r2 = Yue.C4810.C4811.f15252
                if (r2 != 0) goto L3f
                r0 = -1277391733396650650(0xee45cafc83df4566, double:-1.5755135432922364E223)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C4810.C4811.f15252 = r2
            L3f:
                return r2
            L40:
                java.lang.String r2 = Yue.C4810.C4811.f15251
                if (r2 != 0) goto L4f
                r0 = -7337554370287017970(0x9a2bc52d1eed600e, double:-1.3071094571696172E-182)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C4810.C4811.f15251 = r2
            L4f:
                return r2
            L50:
                java.lang.String r2 = Yue.C4810.C4811.f15250
                if (r2 != 0) goto L5f
                r0 = 7218695438296788925(0x642df5413d69afbd, double:3.704765389456504E174)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C4810.C4811.f15250 = r2
            L5f:
                return r2
        }

        public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r9) throws java.lang.Exception {
                r8 = this;
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                r1 = 3
                r2 = 1
                java.lang.Object[] r9 = r9.args     // Catch: java.lang.Exception -> L4f
                r9 = r9[r2]     // Catch: java.lang.Exception -> L4f
                java.util.List r9 = (java.util.List) r9     // Catch: java.lang.Exception -> L4f
                r3 = 0
                java.lang.Object r4 = r9.get(r3)     // Catch: java.lang.Exception -> L4f
                java.lang.Class r4 = r4.getClass()     // Catch: java.lang.Exception -> L4f
                java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L4f
                java.lang.Class[] r0 = new java.lang.Class[]{r5, r0, r0, r5}     // Catch: java.lang.Exception -> L4f
                java.lang.reflect.Constructor r0 = r4.getConstructor(r0)     // Catch: java.lang.Exception -> L4f
                int r4 = Yue.C4810.m19071()     // Catch: java.lang.Exception -> L4f
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> L4f
                java.lang.String r5 = yue_xin_awa(r3)     // Catch: java.lang.Exception -> L4f
                java.lang.String r6 = yue_xin_awa(r2)     // Catch: java.lang.Exception -> L4f
                java.lang.Integer r7 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L4f
                java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r6, r7}     // Catch: java.lang.Exception -> L4f
                java.lang.Object r0 = r0.newInstance(r4)     // Catch: java.lang.Exception -> L4f
                android.content.Context r4 = Yue.C0421.m1605()     // Catch: java.lang.Exception -> L4f
                int r5 = com.yuexin.panel.R.C7877.f30267     // Catch: java.lang.Exception -> L4f
                android.graphics.drawable.Drawable r4 = r4.getDrawable(r5)     // Catch: java.lang.Exception -> L4f
                r5 = 2
                java.lang.String r5 = yue_xin_awa(r5)     // Catch: java.lang.Exception -> L4f
                Yue.C3846.m15407(r0, r5, r4)     // Catch: java.lang.Exception -> L4f
                r9.add(r3, r0)     // Catch: java.lang.Exception -> L4f
                goto L7d
            L4f:
                r9 = move-exception
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r9)
                java.lang.String r1 = yue_xin_awa(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                Yue.C3801.m15237(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 4
                java.lang.String r1 = yue_xin_awa(r1)
                r0.append(r1)
                r0.append(r9)
                java.lang.String r9 = r0.toString()
                Yue.C4350.m17146(r9, r2)
            L7d:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۡۤۦ$ۥ۟, reason: contains not printable characters */
    public class C4812 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C4810 f15256;

        public C4812(Yue.C4810 r1) {
                r0 = this;
                r0.f15256 = r1
                r0.<init>()
                return
        }

        public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r2) throws java.lang.Exception {
                r1 = this;
                java.lang.Object[] r2 = r2.args
                r0 = 0
                r2 = r2[r0]
                android.view.View r2 = (android.view.View) r2
                int r2 = r2.getId()
                int r0 = Yue.C4810.m19071()
                if (r2 != r0) goto L14
                com.yuexin.panel.C7892.m30730()
            L14:
                return
        }
    }

    static {
            r0 = 851(0x353, float:1.193E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C4810() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static native /* synthetic */ int m19071();

    @Override // Yue.AbstractC3183
    public native com.yuexin.panel.myClass.itemInfo info();

    @Override // Yue.AbstractC3183
    public void load(Yue.C1145 r6, java.lang.ClassLoader r7) {
            r5 = this;
            r6 = 2
            java.lang.String r6 = yue_xin_awa(r6)
            java.lang.Class r6 = de.robv.android.xposed.XposedHelpers.findClass(r6, r7)
            r7 = 3
            java.lang.String r7 = yue_xin_awa(r7)
            java.lang.Class r0 = java.lang.Boolean.TYPE
            Yue.ۥۣۡۤۦ$ۥ r1 = new Yue.ۥۣۡۤۦ$ۥ
            r1.<init>(r5)
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.Class<java.util.List> r3 = java.util.List.class
            java.lang.Class<android.widget.LinearLayout> r4 = android.widget.LinearLayout.class
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r3, r4, r0, r1}
            Yue.C3065.m12916(r6, r7, r0)
            r7 = 4
            java.lang.String r7 = yue_xin_awa(r7)
            Yue.ۥۣۡۤۦ$ۥ۟ r0 = new Yue.ۥۣۡۤۦ$ۥ۟
            r0.<init>(r5)
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            Yue.C3065.m12916(r6, r7, r0)
            return
    }
}
