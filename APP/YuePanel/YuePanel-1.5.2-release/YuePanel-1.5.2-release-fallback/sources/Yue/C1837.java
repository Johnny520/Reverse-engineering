package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۟۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1837 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f5658;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f5659;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f5660;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f5661;

    /* JADX INFO: renamed from: Yue.ۥ۠۟۠ۢ$ۥ, reason: contains not printable characters */
    public class C1838 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C1837 f5662;

        public C1838(Yue.C1837 r1) {
                r0 = this;
                r0.f5662 = r1
                r0.<init>()
                return
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r1) throws java.lang.Throwable {
                r0 = this;
                java.lang.Object r1 = r1.getResult()
                android.app.Dialog r1 = (android.app.Dialog) r1
                Yue.C1502.m7400(r1)
                return
        }
    }

    static {
            r0 = 932(0x3a4, float:1.306E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C1837() {
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
