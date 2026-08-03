package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C2268 {
    public C2268() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC3037
    @Yue.InterfaceC5792(version = "1.1")
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m10468(@Yue.InterfaceC4418 java.lang.Throwable r1, @Yue.InterfaceC4418 java.lang.Throwable r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "exception"
            Yue.C3329.m13906(r2, r0)
            if (r1 == r2) goto L11
            Yue.ۥۡۤۡۤ r0 = Yue.C4778.f15131
            r0.mo13960(r1, r2)
        L11:
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.StackTraceElement[] m10469(@Yue.InterfaceC4418 java.lang.Throwable r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()
            Yue.C3329.m13903(r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m10470(java.lang.Throwable r0) {
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.util.List<java.lang.Throwable> m10471(@Yue.InterfaceC4418 java.lang.Throwable r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            Yue.ۥۡۤۡۤ r0 = Yue.C4778.f15131
            java.util.List r1 = r0.mo13961(r1)
            return r1
    }

    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m10472(java.lang.Throwable r0) {
            return
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final void m10473(java.lang.Throwable r1) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            r1.printStackTrace()
            return
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final void m10474(java.lang.Throwable r1, java.io.PrintStream r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "stream"
            Yue.C3329.m13906(r2, r0)
            r1.printStackTrace(r2)
            return
    }

    @Yue.InterfaceC3250
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final void m10475(java.lang.Throwable r1, java.io.PrintWriter r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r1, r0)
            java.lang.String r0 = "writer"
            Yue.C3329.m13906(r2, r0)
            r1.printStackTrace(r2)
            return
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC5792(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String m10476(@Yue.InterfaceC4418 java.lang.Throwable r2) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r2, r0)
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r1.<init>(r0)
            r2.printStackTrace(r1)
            r1.flush()
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "sw.toString()"
            Yue.C3329.m13905(r2, r0)
            return r2
    }
}
