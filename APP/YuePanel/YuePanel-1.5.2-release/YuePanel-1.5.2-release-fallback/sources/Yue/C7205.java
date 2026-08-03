package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۦۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7205 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.util.List<Yue.C7211> f24853 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24854;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24855;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24856;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24857;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24858;

    /* JADX INFO: renamed from: Yue.ۥۢۦۤۧ$ۥ, reason: contains not printable characters */
    public class C7206 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f24859;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f24860;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f24861;

        public C7206() {
                r0 = this;
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
                java.lang.String r2 = Yue.C7205.C7206.f24861
                if (r2 != 0) goto L19
                r0 = -7310183677583565590(0x9a8d02ad1ec5dcea, double:-8.739108705326238E-181)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C7205.C7206.f24861 = r2
            L19:
                return r2
            L1a:
                java.lang.String r2 = Yue.C7205.C7206.f24860
                if (r2 != 0) goto L29
                r0 = -2013069114494367754(0xe410244e5a40c7f6, double:-9.980907402150299E173)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C7205.C7206.f24860 = r2
            L29:
                return r2
            L2a:
                java.lang.String r2 = Yue.C7205.C7206.f24859
                if (r2 != 0) goto L39
                r0 = -4622642403068451595(0xbfd91339e97264f5, double:-0.39179847524208294)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C7205.C7206.f24859 = r2
            L39:
                return r2
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r4) throws java.lang.Throwable {
                r3 = this;
                java.util.List<Yue.ۥۢۦۥ۟> r4 = Yue.C7205.f24853
                boolean r0 = r4.isEmpty()
                if (r0 != 0) goto L11
                r4 = 0
                java.lang.String r4 = yue_xin_awa(r4)
                Yue.C3801.m15237(r4)
                return
            L11:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = Yue.C0421.m1602()
                r0.append(r1)
                r1 = 1
                java.lang.String r2 = yue_xin_awa(r1)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                Yue.C3801.m15237(r0)
                Yue.C7205.m27702()
                java.lang.String r0 = Yue.C6635.m25485()
                Yue.C4263.m16552(r0)
                java.lang.String r0 = Yue.C6635.m25482()
                Yue.C4263.m16551(r0)
                java.lang.String r0 = Yue.C6635.m25481()
                Yue.C4263.m16547(r0)
                Yue.C1465.m7167(r4)
                Yue.C1828.m8581(r4)
                com.yuexin.panel.C7892.m30718(r1)
                Yue.C4388.m17260()
                Yue.C0526.m1867()
                r4 = 2
                java.lang.String r4 = yue_xin_awa(r4)
                Yue.C3801.m15237(r4)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۦۤۧ$ۥ۟, reason: contains not printable characters */
    public class C7207 extends de.robv.android.xposed.XC_MethodHook {
        public C7207() {
                r0 = this;
                r0.<init>()
                return
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r2) throws java.lang.Throwable {
                r1 = this;
                java.lang.Object r2 = r2.getResult()
                android.content.Context r2 = (android.content.Context) r2
                if (r2 != 0) goto L9
                return
            L9:
                android.content.Context r0 = Yue.C0421.m1605()
                if (r0 == 0) goto L13
                Yue.C5375.m20256(r2)
                return
            L13:
                Yue.C7205.m27703(r2)
                Yue.C7205.m27704()
                return
        }
    }

    static {
            r0 = 306(0x132, float:4.29E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            Yue.C7205.f24853 = r0
            return
    }

    public C7205() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m27702();

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static native /* synthetic */ void m27703(android.content.Context r0);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m27704();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native void m27705();

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m27706() {
            r0 = 0
            java.lang.String r0 = yue_xin_awa(r0)     // Catch: java.lang.Exception -> L21
            java.lang.ClassLoader r1 = Yue.C0421.m1607()     // Catch: java.lang.Exception -> L21
            java.lang.Class r0 = de.robv.android.xposed.XposedHelpers.findClass(r0, r1)     // Catch: java.lang.Exception -> L21
            r1 = 1
            java.lang.String r1 = yue_xin_awa(r1)     // Catch: java.lang.Exception -> L21
            java.lang.Class<android.os.Bundle> r2 = android.os.Bundle.class
            Yue.ۥۢۦۤۧ$ۥ r3 = new Yue.ۥۢۦۤۧ$ۥ     // Catch: java.lang.Exception -> L21
            r3.<init>()     // Catch: java.lang.Exception -> L21
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}     // Catch: java.lang.Exception -> L21
            Yue.C3065.m12916(r0, r1, r2)     // Catch: java.lang.Exception -> L21
            goto L40
        L21:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = Yue.C0421.m1602()
            r1.append(r2)
            r2 = 2
            java.lang.String r2 = yue_xin_awa(r2)
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            Yue.C3801.m15237(r0)
        L40:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m27707() {
            java.lang.ClassLoader r0 = com.yuexin.panel.hook.MainHook.f30589
            Yue.C0421.m1618(r0)
            r0 = 3
            java.lang.String r0 = yue_xin_awa(r0)
            java.lang.ClassLoader r1 = Yue.C0421.m1607()
            java.lang.Class r0 = de.robv.android.xposed.XposedHelpers.findClass(r0, r1)
            r1 = 4
            java.lang.String r1 = yue_xin_awa(r1)
            Yue.ۥۢۦۤۧ$ۥ۟ r2 = new Yue.ۥۢۦۤۧ$ۥ۟
            r2.<init>()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            Yue.C3065.m12916(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static native void m27708(android.content.Context r0);
}
