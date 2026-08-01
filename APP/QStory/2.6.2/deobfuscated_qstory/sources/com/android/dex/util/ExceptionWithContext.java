package com.android.dex.util;

import bsh.C2632;
import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class ExceptionWithContext extends RuntimeException {
    private StringBuffer context;

    public ExceptionWithContext(String str, Throwable th) {
        super(str == null ? th != null ? th.getMessage() : null : str, th);
        if (!(th instanceof ExceptionWithContext)) {
            this.context = new StringBuffer(200);
            return;
        }
        String string = ((ExceptionWithContext) th).context.toString();
        StringBuffer stringBuffer = new StringBuffer(string.length() + 200);
        this.context = stringBuffer;
        stringBuffer.append(string);
    }

    public static ExceptionWithContext withContext(Throwable th, String str) {
        ExceptionWithContext exceptionWithContext = th instanceof ExceptionWithContext ? (ExceptionWithContext) th : new ExceptionWithContext(th);
        exceptionWithContext.addContext(str);
        return exceptionWithContext;
    }

    public void addContext(String str) {
        if (str == null) {
            C2632.m5298("str == null");
            return;
        }
        this.context.append(str);
        if (str.endsWith("\n")) {
            return;
        }
        this.context.append('\n');
    }

    public String getContext() {
        return this.context.toString();
    }

    public void printContext(PrintStream printStream) {
        printStream.println(getMessage());
        printStream.print(this.context);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        printStream.println(this.context);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        printWriter.println(this.context);
    }

    public void printContext(PrintWriter printWriter) {
        printWriter.println(getMessage());
        printWriter.print(this.context);
    }

    public ExceptionWithContext(Throwable th) {
        this(null, th);
    }

    public ExceptionWithContext(String str) {
        this(str, null);
    }
}
