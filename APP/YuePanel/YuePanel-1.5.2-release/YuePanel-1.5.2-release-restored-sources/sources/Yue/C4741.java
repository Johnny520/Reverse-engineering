package Yue;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C4741 {
    @InterfaceC5289
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ */
    public static void m1656(@InterfaceC6399 Throwable th, @InterfaceC6399 Throwable th2) {
        C5499.m17103(th, "<this>");
        C5499.m17103(th2, "exception");
        if (th != th2) {
            C6671.f2230.mo2264(th, th2);
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final StackTraceElement[] m1657(@InterfaceC6399 Throwable th) {
        C5499.m17103(th, "<this>");
        StackTraceElement[] stackTrace = th.getStackTrace();
        C5499.m17100(stackTrace);
        return stackTrace;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m14264(Throwable th) {
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final List<Throwable> m14265(@InterfaceC6399 Throwable th) {
        C5499.m17103(th, "<this>");
        return C6671.f2230.mo17150(th);
    }

    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m14266(Throwable th) {
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final void m14267(Throwable th) {
        C5499.m17103(th, "<this>");
        th.printStackTrace();
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final void m14268(Throwable th, PrintStream printStream) {
        C5499.m17103(th, "<this>");
        C5499.m17103(printStream, "stream");
        th.printStackTrace(printStream);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final void m14269(Throwable th, PrintWriter printWriter) {
        C5499.m17103(th, "<this>");
        C5499.m17103(printWriter, "writer");
        th.printStackTrace(printWriter);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final String m14270(@InterfaceC6399 Throwable th) {
        C5499.m17103(th, "<this>");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        C5499.m17102(string, "sw.toString()");
        return string;
    }
}
