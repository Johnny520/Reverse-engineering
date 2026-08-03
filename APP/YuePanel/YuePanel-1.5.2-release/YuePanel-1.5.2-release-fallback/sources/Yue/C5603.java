package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5603 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static Yue.C1146 f20657;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f20658;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f20659;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f20660;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f20661;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f20662;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f20663;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f20664;

    static {
            r0 = 965(0x3c5, float:1.352E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C5603() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m20962(java.lang.String r6, java.lang.String r7) {
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            Yue.ۥ۟ۤۧۡ r1 = Yue.C5603.f20657
            java.util.Map r1 = r1.m6013()
            r2 = 2
            java.lang.String r2 = yue_xin_awa(r2)
            java.lang.Object r1 = r1.get(r2)
            Yue.ۥ۟ۤۧ۠ r1 = (Yue.C1145) r1
            java.lang.String r1 = r1.m6002()
            java.lang.ClassLoader r2 = Yue.C0421.m1607()
            r3 = 1
            java.lang.Class r1 = de.robv.android.xposed.XposedHelpers.findClass(r1, r2)     // Catch: java.lang.Throwable -> L47
            java.lang.Class r2 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L47
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r0, r2, r2, r4}     // Catch: java.lang.Throwable -> L47
            java.lang.reflect.Constructor r0 = r1.getConstructor(r0)     // Catch: java.lang.Throwable -> L47
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L47
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L47
            r4 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L47
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7, r1, r2, r4}     // Catch: java.lang.Throwable -> L47
            java.lang.Object r6 = r0.newInstance(r6)     // Catch: java.lang.Throwable -> L47
            Yue.C4388.m17257(r6)     // Catch: java.lang.Throwable -> L47
            goto L67
        L47:
            r6 = move-exception
            r7 = 5
            java.lang.String r7 = yue_xin_awa(r7)
            Yue.C4350.m17146(r7, r3)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r6 = 6
            java.lang.String r6 = yue_xin_awa(r6)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            Yue.C3801.m15237(r6)
        L67:
            return
    }

    @Override // Yue.AbstractC3183
    public native java.util.HashMap<java.lang.String, org.luckypray.dexkit.query.FindMethod> dexKit(org.luckypray.dexkit.DexKitBridge r1, java.lang.String r2);

    @Override // Yue.AbstractC3183
    public native com.yuexin.panel.myClass.itemInfo info();

    @Override // Yue.AbstractC3183
    public native void load(Yue.C1146 r1, java.lang.ClassLoader r2);
}
