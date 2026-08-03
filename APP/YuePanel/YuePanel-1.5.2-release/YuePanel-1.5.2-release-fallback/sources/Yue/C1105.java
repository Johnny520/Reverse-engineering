package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۤۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1105 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.util.List f3287;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.lang.String f3288;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3289;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3290;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3291;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3292;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3293;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3294;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3295;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3296;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3297;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3298;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3299;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f3300;

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۤۥ$ۥ, reason: contains not printable characters */
    public class C1106 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ java.lang.ClassLoader f3301;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C1105 f3302;

        public C1106(Yue.C1105 r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.f3302 = r1
                r0.f3301 = r2
                r0.<init>()
                return
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r3) throws java.lang.Throwable {
                r2 = this;
                java.lang.Object r3 = r3.getResult()     // Catch: java.lang.Throwable -> L32
                Yue.ۥ۟ۤۤۥ r0 = r2.f3302     // Catch: java.lang.Throwable -> L32
                java.lang.ClassLoader r1 = r2.f3301     // Catch: java.lang.Throwable -> L32
                java.util.List r0 = Yue.C1105.m5904(r0, r3, r1)     // Catch: java.lang.Throwable -> L32
                r1 = 0
                java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L32
                java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0     // Catch: java.lang.Throwable -> L32
                java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L32
                java.lang.Class<java.util.ArrayList> r1 = java.util.ArrayList.class
                java.lang.Object r3 = Yue.C3846.m15400(r3, r0, r1)     // Catch: java.lang.Throwable -> L32
                java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L32
                java.util.List r0 = Yue.C1105.f3287     // Catch: java.lang.Throwable -> L32
                if (r0 == 0) goto L34
                int r0 = r3.size()     // Catch: java.lang.Throwable -> L32
                java.util.List r1 = Yue.C1105.f3287     // Catch: java.lang.Throwable -> L32
                int r1 = r1.size()     // Catch: java.lang.Throwable -> L32
                if (r0 <= r1) goto L36
                Yue.C1105.f3287 = r3     // Catch: java.lang.Throwable -> L32
                goto L36
            L32:
                r3 = move-exception
                goto L3c
            L34:
                Yue.C1105.f3287 = r3     // Catch: java.lang.Throwable -> L32
            L36:
                Yue.ۥ۟ۤۤۥ r3 = r2.f3302     // Catch: java.lang.Throwable -> L32
                Yue.C1105.m5905(r3)     // Catch: java.lang.Throwable -> L32
                goto L43
            L3c:
                java.lang.String r3 = r3.getMessage()
                Yue.C4350.m17148(r3)
            L43:
                return
        }
    }

    static {
            r0 = 1065(0x429, float:1.492E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C1105() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static native /* synthetic */ java.util.List m5904(Yue.C1105 r0, java.lang.Object r1, java.lang.ClassLoader r2) throws java.lang.Throwable;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static native /* synthetic */ void m5905(Yue.C1105 r0) throws java.lang.Throwable;

    @Override // Yue.AbstractC3183
    public native java.util.HashMap<java.lang.String, org.luckypray.dexkit.query.FindMethod> dexKit(org.luckypray.dexkit.DexKitBridge r1, java.lang.String r2);

    @Override // Yue.AbstractC3183
    public native com.yuexin.panel.myClass.itemInfo info();

    @Override // Yue.AbstractC3183
    public native void load(Yue.C1146 r1, java.lang.ClassLoader r2);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final native java.util.List<java.lang.reflect.Field> m5906(java.lang.Object r1, java.lang.ClassLoader r2) throws java.lang.Throwable;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final native void m5907() throws java.lang.Throwable;
}
