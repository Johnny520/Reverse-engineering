package p172l8;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import p283t8.AbstractC8204b;

/* JADX INFO: renamed from: l8.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4693f {
    /* JADX INFO: renamed from: a */
    public static void m18753a(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            AbstractC8204b.f27516a.mo31889a(th, th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static List m18754b(Throwable th) {
        th.getClass();
        return AbstractC8204b.f27516a.mo31890b(th);
    }

    /* JADX INFO: renamed from: c */
    public static String m18755c(Throwable th) {
        th.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }
}
