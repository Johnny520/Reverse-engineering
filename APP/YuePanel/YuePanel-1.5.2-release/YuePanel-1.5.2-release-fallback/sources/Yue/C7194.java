package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۦۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7194 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.util.concurrent.atomic.AtomicBoolean f24809;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.util.concurrent.atomic.AtomicBoolean f24810;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.util.List<Yue.C7211> f24811 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24812;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24813;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24814;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24815;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24816;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24817;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24818;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24819;

    /* JADX INFO: renamed from: Yue.ۥۢۦۤۤ$ۥ, reason: contains not printable characters */
    public class C7195 extends de.robv.android.xposed.XC_MethodHook {
        public C7195() {
                r0 = this;
                r0.<init>()
                return
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r3) throws java.lang.Throwable {
                r2 = this;
                java.lang.Object[] r0 = r3.args
                int r0 = r0.length
                r1 = 1
                if (r0 != r1) goto Lb
                java.lang.Object r3 = r3.thisObject
                Yue.C1501.m7396(r3)
            Lb:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۦۤۤ$ۥ۟, reason: contains not printable characters */
    public class C7196 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f24820;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f24821;

        public C7196() {
                r0 = this;
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
                java.lang.String r2 = Yue.C7194.C7196.f24821
                if (r2 != 0) goto L16
                r0 = 8330119989323276104(0x739a87fed3fe9f48, double:7.420169994866632E248)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C7194.C7196.f24821 = r2
            L16:
                return r2
            L17:
                java.lang.String r2 = Yue.C7194.C7196.f24820
                if (r2 != 0) goto L26
                r0 = -2013069114494367754(0xe410244e5a40c7f6, double:-9.980907402150299E173)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C7194.C7196.f24820 = r2
            L26:
                return r2
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ void m27687() {
                m27688()
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ void m27688() {
                r0 = 0
            L1:
                r1 = 5
                if (r0 >= r1) goto Lf
                r1 = 1000(0x3e8, double:4.94E-321)
                Yue.C5801.m21654(r1)
                Yue.C6745.m25983()
                int r0 = r0 + 1
                goto L1
            Lf:
                return
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicBoolean r3 = Yue.C7194.f24810
                boolean r3 = r3.get()
                if (r3 == 0) goto L9
                return
            L9:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r0 = Yue.C0421.m1602()
                r3.append(r0)
                r0 = 0
                java.lang.String r0 = yue_xin_awa(r0)
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                Yue.C3801.m15237(r3)
                java.lang.Thread r3 = new java.lang.Thread
                Yue.ۥۢۦۥ r0 = new Yue.ۥۢۦۥ
                r0.<init>()
                r3.<init>(r0)
                r3.start()
                java.util.concurrent.atomic.AtomicBoolean r3 = Yue.C7194.f24810
                r0 = 1
                r3.set(r0)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r1 = Yue.C0421.m1602()
                r3.append(r1)
                java.lang.String r0 = yue_xin_awa(r0)
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                Yue.C3801.m15237(r3)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۦۤۤ$ۥ۟۟, reason: contains not printable characters */
    public class C7197 extends de.robv.android.xposed.XC_MethodHook {
        public C7197() {
                r0 = this;
                r0.<init>()
                return
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r1) throws java.lang.Throwable {
                r0 = this;
                java.lang.Object r1 = r1.getResult()
                android.content.Context r1 = (android.content.Context) r1
                if (r1 == 0) goto Lb
                Yue.C5375.m20256(r1)
            Lb:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۦۤۤ$ۥ۟۟۟, reason: contains not printable characters */
    public class C7198 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f24822;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f24823;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f24824;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f24825;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f24826;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f24827;

        public C7198() {
                r0 = this;
                r0.<init>()
                return
        }

        private static /* synthetic */ java.lang.String yue_xin_awa(int r2) {
                if (r2 == 0) goto L63
                r0 = 1
                if (r2 == r0) goto L53
                r0 = 2
                if (r2 == r0) goto L43
                r0 = 3
                if (r2 == r0) goto L33
                r0 = 4
                if (r2 == r0) goto L23
                r0 = 5
                if (r2 == r0) goto L13
                r2 = 0
                return r2
            L13:
                java.lang.String r2 = Yue.C7194.C7198.f24827
                if (r2 != 0) goto L22
                r0 = -4981209216552905739(0xbadf309bef7653f5, double:-4.0311974274127197E-25)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C7194.C7198.f24827 = r2
            L22:
                return r2
            L23:
                java.lang.String r2 = Yue.C7194.C7198.f24826
                if (r2 != 0) goto L32
                r0 = 5490439965782235432(0x4c31f60f2d0ed928, double:1.127440855231909E59)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C7194.C7198.f24826 = r2
            L32:
                return r2
            L33:
                java.lang.String r2 = Yue.C7194.C7198.f24825
                if (r2 != 0) goto L42
                r0 = -4719103213421073595(0xbe8260a159a1eb45, double:-1.3692276185417293E-7)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C7194.C7198.f24825 = r2
            L42:
                return r2
            L43:
                java.lang.String r2 = Yue.C7194.C7198.f24824
                if (r2 != 0) goto L52
                r0 = -4931624373010769661(0xbb8f59c2f908d903, double:-8.2984430085050865E-22)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C7194.C7198.f24824 = r2
            L52:
                return r2
            L53:
                java.lang.String r2 = Yue.C7194.C7198.f24823
                if (r2 != 0) goto L62
                r0 = 3895494887513716590(0x360f93f6029af76e, double:2.7008157022209648E-48)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C7194.C7198.f24823 = r2
            L62:
                return r2
            L63:
                java.lang.String r2 = Yue.C7194.C7198.f24822
                if (r2 != 0) goto L72
                r0 = 5414116339064640063(0x4b22ce200a96123f, double:9.005890311547055E53)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C7194.C7198.f24822 = r2
            L72:
                return r2
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r8) {
                r7 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = Yue.C7194.f24809     // Catch: java.lang.Throwable -> L6a
                boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L6a
                if (r0 == 0) goto L9
                return
            L9:
                java.lang.Object[] r8 = r8.args     // Catch: java.lang.Throwable -> L6a
                r0 = 0
                r8 = r8[r0]     // Catch: java.lang.Throwable -> L6a
                java.lang.String r1 = yue_xin_awa(r0)     // Catch: java.lang.Throwable -> L6a
                java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L6a
                java.lang.Object r1 = de.robv.android.xposed.XposedHelpers.callMethod(r8, r1, r2)     // Catch: java.lang.Throwable -> L6a
                java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L6a
                r2 = 1
                java.lang.String r3 = yue_xin_awa(r2)     // Catch: java.lang.Throwable -> L6a
                java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L6a
                java.lang.Object r3 = de.robv.android.xposed.XposedHelpers.callMethod(r8, r3, r4)     // Catch: java.lang.Throwable -> L6a
                java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L6a
                r4 = 2
                java.lang.String r4 = yue_xin_awa(r4)     // Catch: java.lang.Throwable -> L6a
                java.lang.ClassLoader r5 = com.yuexin.panel.hook.MainHook.f30589     // Catch: java.lang.Throwable -> L6a
                r6 = 3
                java.lang.String r6 = yue_xin_awa(r6)     // Catch: java.lang.Throwable -> L6a
                java.lang.Class r5 = r5.loadClass(r6)     // Catch: java.lang.Throwable -> L6a
                java.lang.Object r8 = Yue.C3846.m15400(r8, r4, r5)     // Catch: java.lang.Throwable -> L6a
                if (r1 == 0) goto L6c
                if (r3 == 0) goto L6c
                if (r8 != 0) goto L42
                goto L6c
            L42:
                r4 = 4
                java.lang.String r4 = yue_xin_awa(r4)     // Catch: java.lang.Throwable -> L6a
                java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L6a
                java.lang.Object r8 = de.robv.android.xposed.XposedHelpers.callMethod(r8, r4, r5)     // Catch: java.lang.Throwable -> L6a
                java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L6a
                java.lang.Object r8 = r8.get(r0)     // Catch: java.lang.Throwable -> L6a
                java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L6a
                Yue.C4263.m16547(r8)     // Catch: java.lang.Throwable -> L6a
                Yue.C4263.m16552(r1)     // Catch: java.lang.Throwable -> L6a
                Yue.C4263.m16551(r3)     // Catch: java.lang.Throwable -> L6a
                com.yuexin.panel.C7892.m30718(r2)     // Catch: java.lang.Throwable -> L6a
                Yue.C1119.m5918()     // Catch: java.lang.Throwable -> L6a
                java.util.concurrent.atomic.AtomicBoolean r8 = Yue.C7194.f24809     // Catch: java.lang.Throwable -> L6a
                r8.set(r2)     // Catch: java.lang.Throwable -> L6a
                goto L84
            L6a:
                r8 = move-exception
                goto L6d
            L6c:
                return
            L6d:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 5
                java.lang.String r1 = yue_xin_awa(r1)
                r0.append(r1)
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                Yue.C3801.m15237(r8)
            L84:
                return
        }
    }

    static {
            r0 = 294(0x126, float:4.12E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            Yue.C7194.f24809 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            Yue.C7194.f24810 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            Yue.C7194.f24811 = r0
            return
    }

    public C7194() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static native void m27684();

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m27685() {
            java.lang.ClassLoader r0 = Yue.C0421.m1607()
            r1 = 0
            java.lang.String r1 = yue_xin_awa(r1)     // Catch: java.lang.Throwable -> L15
            java.lang.Class r1 = r0.loadClass(r1)     // Catch: java.lang.Throwable -> L15
            Yue.ۥۢۦۤۤ$ۥ r2 = new Yue.ۥۢۦۤۤ$ۥ     // Catch: java.lang.Throwable -> L15
            r2.<init>()     // Catch: java.lang.Throwable -> L15
            Yue.C3065.m12923(r1, r2)     // Catch: java.lang.Throwable -> L15
        L15:
            r1 = 1
            java.lang.String r1 = yue_xin_awa(r1)     // Catch: java.lang.Exception -> L4c
            java.lang.Class r1 = de.robv.android.xposed.XposedHelpers.findClass(r1, r0)     // Catch: java.lang.Exception -> L4c
            r2 = 2
            java.lang.String r2 = yue_xin_awa(r2)     // Catch: java.lang.Exception -> L4c
            java.lang.Class<android.os.Bundle> r3 = android.os.Bundle.class
            Yue.ۥۢۦۤۤ$ۥ۟ r4 = new Yue.ۥۢۦۤۤ$ۥ۟     // Catch: java.lang.Exception -> L4c
            r4.<init>()     // Catch: java.lang.Exception -> L4c
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}     // Catch: java.lang.Exception -> L4c
            Yue.C3065.m12916(r1, r2, r3)     // Catch: java.lang.Exception -> L4c
            r1 = 3
            java.lang.String r1 = yue_xin_awa(r1)     // Catch: java.lang.Exception -> L4c
            java.lang.Class r0 = de.robv.android.xposed.XposedHelpers.findClass(r1, r0)     // Catch: java.lang.Exception -> L4c
            r1 = 4
            java.lang.String r1 = yue_xin_awa(r1)     // Catch: java.lang.Exception -> L4c
            Yue.ۥۢۦۤۤ$ۥ۟۟ r2 = new Yue.ۥۢۦۤۤ$ۥ۟۟     // Catch: java.lang.Exception -> L4c
            r2.<init>()     // Catch: java.lang.Exception -> L4c
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Exception -> L4c
            Yue.C3065.m12916(r0, r1, r2)     // Catch: java.lang.Exception -> L4c
            goto L6b
        L4c:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = Yue.C0421.m1602()
            r1.append(r2)
            r2 = 5
            java.lang.String r2 = yue_xin_awa(r2)
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            Yue.C3801.m15237(r0)
        L6b:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native void m27686();
}
