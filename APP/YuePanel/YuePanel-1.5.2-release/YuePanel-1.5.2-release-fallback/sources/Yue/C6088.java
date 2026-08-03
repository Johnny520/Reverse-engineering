package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6088 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int f22005 = 0;

    static {
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r0 = r0.availableProcessors()
            Yue.C6088.f22005 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int m22849() {
            int r0 = Yue.C6088.f22005
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String m22850(@Yue.InterfaceC4418 java.lang.String r0) {
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L5
            goto L6
        L5:
            r0 = 0
        L6:
            return r0
    }
}
