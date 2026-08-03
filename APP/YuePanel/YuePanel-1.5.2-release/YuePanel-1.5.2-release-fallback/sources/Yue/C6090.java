package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6090 extends Yue.AbstractC3183 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f22006;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f22007;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f22008;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f22009;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f22010;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f22011;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f22012;

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۧۢ$ۥ, reason: contains not printable characters */
    public class C6091 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6090 f22013;

        public C6091(Yue.C6090 r1) {
                r0 = this;
                r0.f22013 = r1
                r0.<init>()
                return
        }

        public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r5) throws java.lang.Throwable {
                r4 = this;
                java.lang.Object[] r0 = r5.args
                r1 = 0
                r0 = r0[r1]
                java.lang.String r0 = (java.lang.String) r0
                if (r0 != 0) goto La
                return
            La:
                Yue.ۥۢ۠ۧۢ$ۥ۟۟ r1 = new Yue.ۥۢ۠ۧۢ$ۥ۟۟
                r1.<init>()
                java.lang.Object r5 = r5.thisObject
                r1.f22017 = r5
                long r2 = java.lang.System.currentTimeMillis()
                r1.f22016 = r2
                java.util.Map<java.lang.String, Yue.ۥۢ۠ۧۢ$ۥ۟۟> r5 = Yue.C1501.f4670
                r5.put(r0, r1)
                Yue.C6090.m22856()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۧۢ$ۥ۟, reason: contains not printable characters */
    public class C6092 extends de.robv.android.xposed.XC_MethodHook {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static volatile /* synthetic */ java.lang.String f22014;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6090 f22015;

        public C6092(Yue.C6090 r1) {
                r0 = this;
                r0.f22015 = r1
                r0.<init>()
                return
        }

        private static /* synthetic */ java.lang.String yue_xin_awa(int r2) {
                if (r2 == 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r2 = Yue.C6090.C6092.f22014
                if (r2 != 0) goto L13
                r0 = 1205798495015636870(0x10bbdb57b61b8f86, double:4.5934038758442203E-228)
                java.lang.String r2 = Yue.C3359.m13966(r0)
                Yue.C6090.C6092.f22014 = r2
            L13:
                return r2
        }

        public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r3) throws java.lang.Throwable {
                r2 = this;
                r0 = 0
                java.lang.String r1 = yue_xin_awa(r0)
                boolean r1 = Yue.C1465.m7161(r1)
                if (r1 == 0) goto L11
                java.lang.Object[] r3 = r3.args
                java.lang.Boolean r1 = java.lang.Boolean.FALSE
                r3[r0] = r1
            L11:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۧۢ$ۥ۟۟, reason: contains not printable characters */
    public static class C6093 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public long f22016;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public java.lang.Object f22017;

        public C6093() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            r0 = 615(0x267, float:8.62E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    public C6090() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static native void m22856();

    @Override // Yue.AbstractC3183
    public native com.yuexin.panel.myClass.itemInfo info();

    @Override // Yue.AbstractC3183
    public native void load(Yue.C1145 r1, java.lang.ClassLoader r2);
}
