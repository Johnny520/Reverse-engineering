package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C2351 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final char f7698 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> f7699 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f7700;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.lang.Object f7701;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.lang.String f7702;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public java.lang.Class<?> f7703;

    static {
            r0 = 91
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            Yue.C2351.f7699 = r0
            return
    }

    public C2351() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final native boolean m10788();

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public <T> T m10789(java.lang.String r3) {
            r2 = this;
            r0 = 0
            boolean r1 = r2.m10788()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L8
            return r0
        L8:
            r1 = -1
            java.lang.String r3 = r2.m10792(r3, r0, r1)     // Catch: java.lang.Throwable -> L17
            if (r3 != 0) goto L10
            return r0
        L10:
            java.lang.Object r1 = r2.f7701     // Catch: java.lang.Throwable -> L17
            java.lang.Object r3 = de.robv.android.xposed.XposedHelpers.getObjectField(r1, r3)     // Catch: java.lang.Throwable -> L17
            return r3
        L17:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public <T> T m10790(java.lang.String r3, java.lang.Class<?> r4, int r5) {
            r2 = this;
            r0 = 0
            boolean r1 = r2.m10788()     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1c
            if (r4 != 0) goto La
            goto L1c
        La:
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r3 = r2.m10792(r3, r4, r5)     // Catch: java.lang.Throwable -> L1c
            if (r3 != 0) goto L15
            return r0
        L15:
            java.lang.Object r4 = r2.f7701     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r3 = de.robv.android.xposed.XposedHelpers.getObjectField(r4, r3)     // Catch: java.lang.Throwable -> L1c
            return r3
        L1c:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final native void m10791();

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final native java.lang.String m10792(java.lang.String r1, java.lang.String r2, int r3);

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public native Yue.C2351 m10793(java.lang.Class<?> r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public native Yue.C2351 m10794(java.lang.String r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m10795(java.lang.String r3, java.lang.Object r4) throws java.lang.Throwable {
            r2 = this;
            boolean r0 = r2.m10788()
            if (r0 == 0) goto L7
            return
        L7:
            r0 = 0
            r1 = -1
            java.lang.String r3 = r2.m10792(r3, r0, r1)
            if (r3 == 0) goto L15
            java.lang.Object r0 = r2.f7701
            de.robv.android.xposed.XposedHelpers.setObjectField(r0, r3, r4)
            return
        L15:
            java.lang.Throwable r3 = new java.lang.Throwable
            r4 = 0
            java.lang.String r4 = yue_xin_awa(r4)
            r3.<init>(r4)
            throw r3
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public native Yue.C2351 m10796(java.lang.Object r1);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public native Yue.C2351 m10797(java.lang.Object r1, java.lang.Class<?> r2);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public native Yue.C2351 m10798(java.lang.Class<?> r1);
}
