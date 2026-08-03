package fun.box001.internal.error;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: renamed from: b.a */
/* JADX INFO: loaded from: classes.dex */
public class DexGenerationException extends RuntimeException {

    /* JADX INFO: renamed from: a */
    private StringBuffer f0a;

    public DexGenerationException(String str, Exception exc) {
        super(str == null ? exc != null ? exc.getMessage() : null : str, exc);
        if (!(exc instanceof DexGenerationException)) {
            this.f0a = new StringBuffer(200);
            return;
        }
        String string = ((DexGenerationException) exc).f0a.toString();
        StringBuffer stringBuffer = new StringBuffer(string.length() + 200);
        this.f0a = stringBuffer;
        stringBuffer.append(string);
    }

    /* JADX INFO: renamed from: b */
    public static DexGenerationException m22b(String str, Exception exc) {
        DexGenerationException dexGenerationException = exc instanceof DexGenerationException ? (DexGenerationException) exc : new DexGenerationException(null, exc);
        dexGenerationException.m23a(str);
        return dexGenerationException;
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
