package p073f4;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: renamed from: f4.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C1064a extends RuntimeException {

    /* JADX INFO: renamed from: g */
    public final StringBuffer f3410g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1064a(String str, Exception exc) {
        super(str == null ? exc != null ? exc.getMessage() : null : str, exc);
        if (!(exc instanceof C1064a)) {
            this.f3410g = new StringBuffer(200);
            return;
        }
        String string = ((C1064a) exc).f3410g.toString();
        StringBuffer stringBuffer = new StringBuffer(string.length() + 200);
        this.f3410g = stringBuffer;
        stringBuffer.append(string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C1064a m2686b(String str, Exception exc) {
        C1064a c1064a = exc instanceof C1064a ? (C1064a) exc : new C1064a(null, exc);
        c1064a.m2687a(str);
        return c1064a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2687a(String str) {
        StringBuffer stringBuffer = this.f3410g;
        stringBuffer.append(str);
        if (str.endsWith("\n")) {
            return;
        }
        stringBuffer.append('\n');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        printStream.println(this.f3410g);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        printWriter.println(this.f3410g);
    }
}
