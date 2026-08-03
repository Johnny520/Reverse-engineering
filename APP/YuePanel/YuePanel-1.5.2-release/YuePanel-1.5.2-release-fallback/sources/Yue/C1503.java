package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C1503 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.util.List<java.lang.String> f4687;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static Yue.C3667 f4688;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static java.lang.String f4689;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static com.shoujiduoduo.util.NativeDES f4690;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static Yue.C5526 f4691;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ java.lang.String f4692;

    static {
            r0 = 1069(0x42d, float:1.498E-42)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            Yue.C1503.f4687 = r0
            r0 = 0
            java.lang.String r0 = yue_xin_awa(r0)
            java.lang.String r0 = Yue.C1465.m7166(r0)
            Yue.C1503.f4689 = r0
            java.io.File r0 = new java.io.File
            java.lang.String r1 = Yue.C1503.f4689
            r0.<init>(r1)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L2e
            java.io.File r0 = new java.io.File
            java.lang.String r1 = Yue.C1503.f4689
            r0.<init>(r1)
            r0.mkdirs()
        L2e:
            return
    }

    public C1503() {
            r0 = this;
            r0.<init>()
            return
    }

    private static native /* synthetic */ java.lang.String yue_xin_awa(int r0);
}
