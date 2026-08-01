package bsh;

import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: bsh.o4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1231o4 extends C1163d2 {

    /* JADX INFO: renamed from: t */
    public final boolean f3730t;

    public C1231o4(Throwable th, InterfaceC1188h3 interfaceC1188h3, C1174f1 c1174f1) {
        this("TargetError", th, interfaceC1188h3, c1174f1, false);
    }

    /* JADX INFO: renamed from: g */
    public synchronized Throwable m4995g() {
        Throwable cause = getCause();
        if (!(cause instanceof InvocationTargetException)) {
            return cause;
        }
        return cause.getCause();
    }

    @Override // bsh.C1163d2, java.lang.Throwable
    public synchronized String getMessage() {
        return super.getMessage() + "Caused by: " + m4998j(getCause());
    }

    /* JADX INFO: renamed from: h */
    public boolean m4996h() {
        return this.f3730t;
    }

    /* JADX INFO: renamed from: i */
    public void m4997i(boolean z10, PrintStream printStream) {
        if (z10) {
            super.printStackTrace(printStream);
            printStream.println("--- Target Stack Trace ---");
        }
        for (StackTraceElement stackTraceElement : getCause().getStackTrace()) {
            if (stackTraceElement.getClassName().contains("reflect")) {
                return;
            }
            printStream.println("        at " + stackTraceElement);
        }
    }

    /* JADX INFO: renamed from: j */
    public final synchronized String m4998j(Throwable th) {
        if (th == null) {
            return "Cause is null";
        }
        StringBuilder sb2 = new StringBuilder(th.toString());
        while (true) {
            th = th.getCause();
            if (th == null) {
                return sb2.toString();
            }
            sb2.append("\n");
            sb2.append(th.toString());
        }
    }

    public C1231o4(String str, Throwable th, InterfaceC1188h3 interfaceC1188h3, C1174f1 c1174f1, boolean z10) {
        super(str, interfaceC1188h3, c1174f1, th);
        this.f3730t = z10;
    }
}
