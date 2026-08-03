package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5885 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f21521;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f21522;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f21523;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f21524;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f21525;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f21526;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f21527;

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ$ۥ, reason: contains not printable characters */
    public class C5886 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5885 f21528;

        public C5886(Yue.C5885 r1) {
                r0 = this;
                r0.f21528 = r1
                r0.<init>()
                return
        }

        public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r2) throws java.lang.Throwable {
                r1 = this;
                super.beforeHookedMethod(r2)
                java.lang.Object[] r2 = r2.args
                r0 = 0
                r2 = r2[r0]
                android.view.MotionEvent r2 = (android.view.MotionEvent) r2
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ$ۥ۟, reason: contains not printable characters */
    public class C5887 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5885 f21529;

        public C5887(Yue.C5885 r1) {
                r0 = this;
                r0.f21529 = r1
                r0.<init>()
                return
        }

        public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r4) {
                r3 = this;
                java.lang.Object[] r0 = r4.args
                r1 = 2
                r1 = r0[r1]
                android.content.Intent r1 = (android.content.Intent) r1
                r2 = 0
                r0 = r0[r2]
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                java.lang.Object[] r4 = r4.args
                r2 = 1
                r4 = r4[r2]
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                Yue.C3647.m14760(r1, r0, r4)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۟ۧ$ۥ۟۟, reason: contains not printable characters */
    public class C5888 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5885 f21530;

        public C5888(Yue.C5885 r1) {
                r0 = this;
                r0.f21530 = r1
                r0.<init>()
                return
        }

        public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r4) {
                r3 = this;
                java.lang.Object[] r0 = r4.args
                r1 = 2
                r1 = r0[r1]
                android.content.Intent r1 = (android.content.Intent) r1
                r2 = 0
                r0 = r0[r2]
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                java.lang.Object[] r4 = r4.args
                r2 = 1
                r4 = r4[r2]
                java.lang.Integer r4 = (java.lang.Integer) r4
                int r4 = r4.intValue()
                Yue.C3647.m14760(r1, r0, r4)
                return
        }
    }

    static {
            r0 = 803(0x323, float:1.125E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C5885() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    @Override // Yue.AbstractC3183
    public native com.yuexin.panel.myClass.itemInfo info();

    @Override // Yue.AbstractC3183
    public native void load(Yue.C1145 r1, java.lang.ClassLoader r2);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m21909(de.robv.android.xposed.XC_MethodHook.MethodHookParam r1) {
            r0 = this;
            Yue.C3647.m14761(r1)
            return
    }
}
