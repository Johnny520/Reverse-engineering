package p020b5;

import bsh.C1259t2;
import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: renamed from: b5.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C0996b extends RuntimeException {

    /* JADX INFO: renamed from: q */
    public StringBuffer f3060q;

    public C0996b(String str, Throwable th) {
        super(str == null ? th != null ? th.getMessage() : null : str, th);
        if (!(th instanceof C0996b)) {
            this.f3060q = new StringBuffer(200);
            return;
        }
        String string = ((C0996b) th).f3060q.toString();
        StringBuffer stringBuffer = new StringBuffer(string.length() + 200);
        this.f3060q = stringBuffer;
        stringBuffer.append(string);
    }

    /* JADX INFO: renamed from: b */
    public static C0996b m3684b(Throwable th, String str) {
        C0996b c0996b = th instanceof C0996b ? (C0996b) th : new C0996b(th);
        c0996b.m3685a(str);
        return c0996b;
    }

    /* JADX INFO: renamed from: a */
    public void m3685a(String str) {
        if (str == null) {
            C1259t2.m5095a("str == null");
            return;
        }
        this.f3060q.append(str);
        if (str.endsWith("\n")) {
            return;
        }
        this.f3060q.append('\n');
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        printStream.println(this.f3060q);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        printWriter.println(this.f3060q);
    }

    public C0996b(Throwable th) {
        this(null, th);
    }

    public C0996b(String str) {
        this(str, null);
    }
}
