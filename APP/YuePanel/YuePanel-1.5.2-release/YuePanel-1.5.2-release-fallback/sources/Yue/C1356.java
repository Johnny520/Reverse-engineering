package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۣ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1356 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f4380;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f4381;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f4382;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f4383;

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۣ۟$ۥ, reason: contains not printable characters */
    public class C1357 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C1356 f4384;

        public C1357(Yue.C1356 r1) {
                r0 = this;
                r0.f4384 = r1
                r0.<init>()
                return
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r2) {
                r1 = this;
                Yue.ۥ۟ۦۣ۟ r0 = r1.f4384
                java.lang.Object r2 = r2.thisObject
                android.view.View r2 = (android.view.View) r2
                Yue.C1356.m6847(r0, r2)
                return
        }
    }

    static {
            r0 = 632(0x278, float:8.86E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C1356() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static native /* synthetic */ void m6846();

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static native /* synthetic */ void m6847(Yue.C1356 r0, android.view.View r1);

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static native /* synthetic */ void m6848();

    @Override // Yue.AbstractC3183
    public native com.yuexin.panel.myClass.itemInfo info();

    @Override // Yue.AbstractC3183
    public void load(Yue.C1145 r1, java.lang.ClassLoader r2) {
            r0 = this;
            r1 = 3
            java.lang.String r1 = yue_xin_awa(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.Class r1 = r2.loadClass(r1)     // Catch: java.lang.Throwable -> L12
            Yue.ۥ۟ۦۣ۟$ۥ r2 = new Yue.ۥ۟ۦۣ۟$ۥ     // Catch: java.lang.Throwable -> L12
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L12
            Yue.C3065.m12923(r1, r2)     // Catch: java.lang.Throwable -> L12
            goto L1f
        L12:
            r1 = move-exception
            r2 = 0
            java.lang.String r2 = yue_xin_awa(r2)
            java.lang.String r1 = r1.getMessage()
            Yue.C1828.m8591(r2, r1)
        L1f:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final native void m6849(android.view.View r1);
}
