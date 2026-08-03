package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3186 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f10533;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f10534;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f10535;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f10536;

    /* JADX INFO: renamed from: Yue.ۥ۠ۥ۟ۡ$ۥ, reason: contains not printable characters */
    public class C3187 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C3186 f10537;

        public C3187(Yue.C3186 r1) {
                r0 = this;
                r0.f10537 = r1
                r0.<init>()
                return
        }

        public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r2) throws java.lang.Throwable {
                r1 = this;
                java.lang.Object r0 = r2.thisObject
                Yue.C3185.m13591(r0)
                java.lang.Object[] r2 = r2.args
                r0 = 0
                r2 = r2[r0]
                Yue.C1501.f4671 = r2
                return
        }
    }

    static {
            r0 = 957(0x3bd, float:1.341E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C3186() {
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
