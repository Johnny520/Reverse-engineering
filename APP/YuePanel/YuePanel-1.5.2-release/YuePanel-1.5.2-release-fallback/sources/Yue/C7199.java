package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۦۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7199 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static boolean f24828;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.util.concurrent.atomic.AtomicBoolean f24829;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.util.List<Yue.C7211> f24830 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24831;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24832;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24833;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24834;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24835;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24836;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24837;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24838;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f24839;

    /* JADX INFO: renamed from: Yue.ۥۢۦۤۥ$ۥ, reason: contains not printable characters */
    public class C7200 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ java.lang.ClassLoader f24840;

        public C7200(java.lang.ClassLoader r1) {
                r0 = this;
                r0.f24840 = r1
                r0.<init>()
                return
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r3) throws java.lang.Throwable {
                r2 = this;
                java.lang.Object r3 = r3.thisObject
                android.app.Activity r3 = (android.app.Activity) r3
                android.content.Context r0 = r3.getApplicationContext()
                if (r0 == 0) goto L15
                Yue.C0421.m1617(r0)
                java.lang.ClassLoader r0 = r0.getClassLoader()
                Yue.C0421.m1618(r0)
                goto L1d
            L15:
                Yue.C0421.m1617(r3)
                java.lang.ClassLoader r0 = r2.f24840
                Yue.C0421.m1618(r0)
            L1d:
                android.content.Context r0 = Yue.C0421.m1605()
                java.lang.String r0 = Yue.C0542.m1914(r0)
                Yue.C0421.m1621(r0)
                android.content.Context r0 = Yue.C0421.m1605()
                long r0 = Yue.C0542.m1913(r0)
                Yue.C0421.m1622(r0)
                android.content.Context r0 = Yue.C0421.m1605()
                Yue.C5375.m20256(r0)
                com.kongzue.dialogx.DialogX.init(r3)
                Yue.C7199.m27690()
                java.lang.ClassLoader r3 = r2.f24840
                Yue.C7199.m27691(r3)
                java.util.List<Yue.ۥۢۦۥ۟> r3 = Yue.C7199.f24830
                Yue.C1828.m8581(r3)
                Yue.C0526.m1867()
                java.util.concurrent.atomic.AtomicBoolean r3 = Yue.C7199.f24829
                r0 = 1
                r3.set(r0)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۦۤۥ$ۥ۟, reason: contains not printable characters */
    public class C7201 extends de.robv.android.xposed.XC_MethodHook {
        public C7201() {
                r0 = this;
                r0.<init>()
                return
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r1) throws java.lang.Throwable {
                r0 = this;
                java.lang.Object r1 = r1.thisObject
                Yue.C7199.m27692(r1)
                return
        }
    }

    static {
            r0 = 302(0x12e, float:4.23E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            Yue.C7199.f24829 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            Yue.C7199.f24830 = r0
            return
    }

    public C7199() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m27689(java.lang.Object r0);

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static native /* synthetic */ void m27690();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m27691(java.lang.ClassLoader r0);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m27692(java.lang.Object r0);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native void m27693();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native void m27694(java.lang.Object r0);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m27695(java.lang.ClassLoader r1) {
            r0 = 2
            java.lang.String r0 = yue_xin_awa(r0)     // Catch: java.lang.Throwable -> L11
            java.lang.Class r1 = r1.loadClass(r0)     // Catch: java.lang.Throwable -> L11
            Yue.ۥۢۦۤۥ$ۥ۟ r0 = new Yue.ۥۢۦۤۥ$ۥ۟     // Catch: java.lang.Throwable -> L11
            r0.<init>()     // Catch: java.lang.Throwable -> L11
            Yue.C3065.m12923(r1, r0)     // Catch: java.lang.Throwable -> L11
        L11:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m27696(java.lang.Object r6) {
            r0 = 0
            r1 = r0
        L2:
            r2 = 100
            Yue.C5801.m21654(r2)     // Catch: java.lang.Throwable -> L6f
            r2 = 3
            java.lang.String r2 = yue_xin_awa(r2)     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r2 = de.robv.android.xposed.XposedHelpers.getObjectField(r6, r2)     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L6a
            r3 = 4
            java.lang.String r3 = yue_xin_awa(r3)     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r2 = de.robv.android.xposed.XposedHelpers.getObjectField(r2, r3)     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L6a
            com.google.gson.JsonObject r2 = Yue.C4553.m18123(r2)     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L6e
            r3 = 5
            java.lang.String r3 = yue_xin_awa(r3)     // Catch: java.lang.Throwable -> L6f
            com.google.gson.JsonArray r3 = r2.getAsJsonArray(r3)     // Catch: java.lang.Throwable -> L6f
            com.google.gson.JsonElement r3 = r3.get(r0)     // Catch: java.lang.Throwable -> L6f
            com.google.gson.JsonObject r3 = r3.getAsJsonObject()     // Catch: java.lang.Throwable -> L6f
            r4 = 6
            java.lang.String r4 = yue_xin_awa(r4)     // Catch: java.lang.Throwable -> L6f
            com.google.gson.JsonElement r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r3 = r3.getAsString()     // Catch: java.lang.Throwable -> L6f
            r4 = 7
            java.lang.String r4 = yue_xin_awa(r4)     // Catch: java.lang.Throwable -> L6f
            com.google.gson.JsonElement r4 = r2.get(r4)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = r4.getAsString()     // Catch: java.lang.Throwable -> L6f
            r5 = 8
            java.lang.String r5 = yue_xin_awa(r5)     // Catch: java.lang.Throwable -> L6f
            com.google.gson.JsonElement r2 = r2.get(r5)     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = r2.getAsString()     // Catch: java.lang.Throwable -> L6f
            Yue.C4263.m16551(r4)     // Catch: java.lang.Throwable -> L6f
            Yue.C4263.m16552(r2)     // Catch: java.lang.Throwable -> L6f
            Yue.C4263.m16547(r3)     // Catch: java.lang.Throwable -> L6f
            r2 = 1
            com.yuexin.panel.C7892.m30718(r2)     // Catch: java.lang.Throwable -> L6f
            goto L6e
        L6a:
            r2 = 100
            if (r1 < r2) goto L6f
        L6e:
            return
        L6f:
            int r1 = r1 + 1
            goto L2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static native void m27697();
}
