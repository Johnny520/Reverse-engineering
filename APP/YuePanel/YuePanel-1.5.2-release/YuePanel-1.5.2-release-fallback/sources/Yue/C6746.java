package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۤ۠ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6746 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23618;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23619;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23620;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23621;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23622;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23623;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23624;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23625;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23626;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f23627;

    /* JADX INFO: renamed from: Yue.ۥۢۤ۠ۨ$ۥ, reason: contains not printable characters */
    public class C6747 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6746 f23628;

        public C6747(Yue.C6746 r1) {
                r0 = this;
                r0.f23628 = r1
                r0.<init>()
                return
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r4) throws java.lang.Throwable {
                r3 = this;
                java.lang.Object[] r0 = r4.args
                r1 = 0
                r1 = r0[r1]
                java.lang.String r1 = (java.lang.String) r1
                r1 = 1
                r0 = r0[r1]
                java.lang.Long r0 = (java.lang.Long) r0
                long r0 = r0.longValue()
                java.lang.Object[] r4 = r4.args
                r2 = 2
                r4 = r4[r2]
                java.lang.Long r4 = (java.lang.Long) r4
                r4.longValue()
                Yue.C6716.m25927(r0)
                Yue.C0293.m1291(r0)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤ۠ۨ$ۥ۟, reason: contains not printable characters */
    public class C6748 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6746 f23629;

        public C6748(Yue.C6746 r1) {
                r0 = this;
                r0.f23629 = r1
                r0.<init>()
                return
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r4) throws java.lang.Throwable {
                r3 = this;
                java.lang.Object[] r0 = r4.args
                r1 = 2
                r1 = r0[r1]
                java.lang.String r1 = (java.lang.String) r1
                r1 = 0
                r0 = r0[r1]
                java.lang.Long r0 = (java.lang.Long) r0
                long r0 = r0.longValue()
                java.lang.Object[] r4 = r4.args
                r2 = 1
                r4 = r4[r2]
                java.lang.Long r4 = (java.lang.Long) r4
                r4.longValue()
                Yue.C6716.m25927(r0)
                Yue.C0293.m1291(r0)
                return
        }
    }

    static {
            r0 = 308(0x134, float:4.32E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C6746() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    @Override // Yue.AbstractC3183
    public native java.util.HashMap<java.lang.String, org.luckypray.dexkit.query.FindMethod> dexKit(org.luckypray.dexkit.DexKitBridge r1, java.lang.String r2);

    @Override // Yue.AbstractC3183
    public native com.yuexin.panel.myClass.itemInfo info();

    @Override // Yue.AbstractC3183
    public native void load(Yue.C1146 r1, java.lang.ClassLoader r2);
}
