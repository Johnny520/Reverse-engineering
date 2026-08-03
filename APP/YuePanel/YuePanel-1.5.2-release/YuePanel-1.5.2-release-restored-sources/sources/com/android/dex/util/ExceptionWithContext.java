package com.android.dex.util;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class ExceptionWithContext extends RuntimeException {
    private StringBuffer context;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ExceptionWithContext(String str) {
        this(str, null);
    }

    public static ExceptionWithContext withContext(Throwable th, String str) {
        ExceptionWithContext exceptionWithContext = th instanceof ExceptionWithContext ? (ExceptionWithContext) th : new ExceptionWithContext(th);
        exceptionWithContext.addContext(str);
        return exceptionWithContext;
    }

    public void addContext(String str) {
        if (str == null) {
            throw new NullPointerException("str == null");
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void printContext(PrintStream printStream) {
        printStream.println(getMessage());
        printStream.print(this.context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        printStream.println(this.context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ExceptionWithContext(Throwable th) {
        this(null, th);
    }

    public ExceptionWithContext(String str, Throwable th) {
        super(str == null ? th != null ? th.getMessage() : null : str, th);
        if (th instanceof ExceptionWithContext) {
            String string = ((ExceptionWithContext) th).context.toString();
            StringBuffer stringBuffer = new StringBuffer(string.length() + 200);
            this.context = stringBuffer;
            stringBuffer.append(string);
            return;
        }
        this.context = new StringBuffer(200);
    }

    public void printContext(PrintWriter printWriter) {
        printWriter.println(getMessage());
        printWriter.print(this.context);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        printWriter.println(this.context);
    }
}
