package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۧۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0202 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.util.List<Yue.C7211> f447;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.lang.String f448;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.util.concurrent.atomic.AtomicBoolean f449 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f450;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f451;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f452;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f453;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f454;

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۧۥ$ۥ, reason: contains not printable characters */
    public class C0203 extends de.robv.android.xposed.XC_MethodHook {
        public C0203() {
                r0 = this;
                r0.<init>()
                return
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r3) throws java.lang.Throwable {
                r2 = this;
                java.lang.String r0 = Yue.C0421.m1602()
                Yue.ۥ۟ۡۥۧ r1 = Yue.EnumC0540.f1356
                java.lang.String r1 = r1.m1910()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L8c
                java.lang.Object r3 = r3.thisObject
                android.app.Activity r3 = (android.app.Activity) r3
                java.lang.String r0 = Yue.C0202.f448
                java.lang.String r1 = Yue.C0421.m1600()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L29
                java.lang.String r0 = Yue.C0202.f448
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L29
                return
            L29:
                Yue.C0421.m1613(r3)
                android.content.Context r0 = r3.getBaseContext()
                java.lang.ClassLoader r1 = r3.getClassLoader()
                if (r0 == 0) goto L41
                Yue.C0421.m1617(r0)
                java.lang.ClassLoader r0 = r0.getClassLoader()
                Yue.C0421.m1618(r0)
                goto L47
            L41:
                Yue.C0421.m1617(r3)
                Yue.C0421.m1618(r1)
            L47:
                java.lang.String r0 = Yue.C0421.m1600()
                Yue.C0202.f448 = r0
                android.content.Context r0 = Yue.C0421.m1605()
                java.lang.String r0 = Yue.C0542.m1914(r0)
                Yue.C0421.m1621(r0)
                android.content.Context r0 = Yue.C0421.m1605()
                long r0 = Yue.C0542.m1913(r0)
                Yue.C0421.m1622(r0)
                android.content.Context r0 = Yue.C0421.m1605()
                Yue.C5375.m20256(r0)
                com.kongzue.dialogx.DialogX.init(r3)
                java.util.List r3 = Yue.C0202.m1078()
                Yue.C1828.m8581(r3)
                Yue.C0202.m1079()
                java.util.concurrent.atomic.AtomicBoolean r3 = Yue.C0202.m1080()
                boolean r3 = r3.get()
                if (r3 != 0) goto L8c
                Yue.C0526.m1867()
                java.util.concurrent.atomic.AtomicBoolean r3 = Yue.C0202.m1080()
                r0 = 1
                r3.set(r0)
            L8c:
                return
        }
    }

    static {
            r0 = 699(0x2bb, float:9.8E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            r0 = 4
            java.lang.String r0 = yue_xin_awa(r0)
            Yue.C0202.f448 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            Yue.C0202.f449 = r0
            return
    }

    public C0202() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static native /* synthetic */ java.util.List m1078();

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static native /* synthetic */ void m1079();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static native /* synthetic */ java.util.concurrent.atomic.AtomicBoolean m1080();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m1081(java.lang.ClassLoader r3) {
            r0 = 0
            java.lang.String r0 = yue_xin_awa(r0)
            java.lang.Class r3 = de.robv.android.xposed.XposedHelpers.findClass(r0, r3)
            r0 = 1
            java.lang.String r0 = yue_xin_awa(r0)
            Yue.ۥ۟۟ۧۥ$ۥ r1 = new Yue.ۥ۟۟ۧۥ$ۥ
            r1.<init>()
            java.lang.Class<android.os.Bundle> r2 = android.os.Bundle.class
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1}
            Yue.C3065.m12916(r3, r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static native void m1082();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static native void m1083(java.util.List<Yue.C7211> r0);
}
