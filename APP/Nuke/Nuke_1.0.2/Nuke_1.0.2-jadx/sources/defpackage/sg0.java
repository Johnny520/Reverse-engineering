package defpackage;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class sg0 extends RuntimeException {
    public final StringBuffer h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sg0(Exception exc, String str) {
        super(str == null ? exc != null ? exc.getMessage() : null : str, exc);
        if (!(exc instanceof sg0)) {
            this.h = new StringBuffer(200);
            return;
        }
        String string = ((sg0) exc).h.toString();
        StringBuffer stringBuffer = new StringBuffer(string.length() + 200);
        this.h = stringBuffer;
        stringBuffer.append(string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static sg0 a(Exception exc, String str) {
        sg0 sg0Var = exc instanceof sg0 ? (sg0) exc : new sg0(exc, null);
        StringBuffer stringBuffer = sg0Var.h;
        stringBuffer.append(str);
        if (!str.endsWith("\n")) {
            stringBuffer.append('\n');
        }
        return sg0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        printStream.println(this.h);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        printWriter.println(this.h);
    }
}
