package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۥۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3858 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f12280;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f12281;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f12282;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f12283;

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۥۢ$ۥ, reason: contains not printable characters */
    public class C3859 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C3858 f12284;

        public C3859(Yue.C3858 r1) {
                r0 = this;
                r0.f12284 = r1
                r0.<init>()
                return
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r4) throws java.lang.Throwable {
                r3 = this;
                java.lang.Object[] r0 = r4.args
                r1 = 2
                r1 = r0[r1]
                android.content.Intent r1 = (android.content.Intent) r1
                r2 = 1
                r0 = r0[r2]
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                java.lang.Object[] r4 = r4.args
                r2 = 0
                r4 = r4[r2]
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                Yue.C3647.m14760(r1, r4, r0)
                Yue.C5451.m20567(r4, r0, r1)
                return
        }
    }

    static {
            r0 = 400(0x190, float:5.6E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C3858() {
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
