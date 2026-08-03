package p046d6;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: renamed from: d6.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C0709f extends RuntimeException {

    /* JADX INFO: renamed from: g */
    public final StringBuffer f2128g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0709f(Exception exc, String str, Object... objArr) {
        super(str != null ? String.format(str, objArr) : exc != null ? exc.getMessage() : null, exc);
        if (!(exc instanceof C0709f)) {
            this.f2128g = new StringBuffer(200);
            return;
        }
        String string = ((C0709f) exc).f2128g.toString();
        StringBuffer stringBuffer = new StringBuffer(string.length() + 200);
        this.f2128g = stringBuffer;
        stringBuffer.append(string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C0709f m1882a(Exception exc, String str, Object... objArr) {
        C0709f c0709f = exc instanceof C0709f ? (C0709f) exc : new C0709f(exc, null, new Object[0]);
        String str2 = String.format(str, objArr);
        StringBuffer stringBuffer = c0709f.f2128g;
        stringBuffer.append(str2);
        if (!str2.endsWith("\n")) {
            stringBuffer.append('\n');
        }
        return c0709f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        printStream.println(this.f2128g);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        printWriter.println(this.f2128g);
    }
}
