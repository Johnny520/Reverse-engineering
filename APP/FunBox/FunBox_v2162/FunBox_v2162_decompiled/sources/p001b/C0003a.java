package p001b;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: renamed from: b.a */
/* JADX INFO: loaded from: classes.dex */
public class C0003a extends RuntimeException {

    /* JADX INFO: renamed from: a */
    private StringBuffer f0a;

    public C0003a(String str, Exception exc) {
        super(str == null ? exc != null ? exc.getMessage() : null : str, exc);
        if (!(exc instanceof C0003a)) {
            this.f0a = new StringBuffer(200);
            return;
        }
        String string = ((C0003a) exc).f0a.toString();
        StringBuffer stringBuffer = new StringBuffer(string.length() + 200);
        this.f0a = stringBuffer;
        stringBuffer.append(string);
    }

    /* JADX INFO: renamed from: b */
    public static C0003a m22b(String str, Exception exc) {
        C0003a c0003a = exc instanceof C0003a ? (C0003a) exc : new C0003a(null, exc);
        c0003a.m23a(str);
        return c0003a;
    }

    /* JADX INFO: renamed from: a */
    public final void m23a(String str) {
        if (str == null) {
            throw new NullPointerException("str == null");
        }
        this.f0a.append(str);
        if (str.endsWith("\n")) {
            return;
        }
        this.f0a.append('\n');
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        printStream.println(this.f0a);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        printWriter.println(this.f0a);
    }
}
