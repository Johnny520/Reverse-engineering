package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0699 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f1877;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f1878;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f1879;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f1880;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f1881;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۢۦ$ۥ, reason: contains not printable characters */
    public class C0700 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f1882;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ java.lang.reflect.Method f1883;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0699 f1884;

        public C0700(Yue.C0699 r1, java.lang.reflect.Method r2) {
                r0 = this;
                r0.f1884 = r1
                r0.f1883 = r2
                r0.<init>()
                return
        }

        private static /* synthetic */ java.lang.String yue_xin_awa(int r2) {
                if (r2 == 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r2 = Yue.C0699.C0700.f1882
                if (r2 != 0) goto L13
                r0 = 2496816107060660610(0x22a679054ad30982, double:9.214420348488425E-142)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C0699.C0700.f1882 = r2
            L13:
                return r2
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r4) throws java.lang.Throwable {
                r3 = this;
                java.lang.Object r4 = r4.thisObject
                java.lang.reflect.Method r0 = r3.f1883
                java.lang.String r0 = r0.getName()
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]
                java.lang.Object r4 = de.robv.android.xposed.XposedHelpers.callMethod(r4, r0, r2)
                java.lang.String r0 = yue_xin_awa(r1)
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                java.lang.Object[] r1 = new java.lang.Object[]{r1}
                de.robv.android.xposed.XposedHelpers.callMethod(r4, r0, r1)
                return
        }
    }

    static {
            r0 = 760(0x2f8, float:1.065E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C0699() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    @Override // Yue.AbstractC3183
    public native com.yuexin.panel.myClass.itemInfo info();

    @Override // Yue.AbstractC3183
    public native void load(Yue.C1145 r1, java.lang.ClassLoader r2);
}
