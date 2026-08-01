package p017C4;

import java.io.PrintStream;
import p042H1.AbstractC0636d;

/* JADX INFO: renamed from: C4.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0249d {

    /* JADX INFO: renamed from: a */
    public static final int f827a;

    /* JADX INFO: renamed from: b */
    public static final int f828b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i5;
        String[] strArr = {"System.out", "stdout", "sysout"};
        String property = System.getProperty("slf4j.internal.report.stream");
        int i6 = 2;
        if (property == null || property.isEmpty()) {
            i5 = 1;
        } else {
            for (int i7 = 0; i7 < 3; i7++) {
                if (strArr[i7].equalsIgnoreCase(property)) {
                    i5 = 2;
                    break;
                }
            }
            i5 = 1;
        }
        f827a = i5;
        String property2 = System.getProperty("slf4j.internal.verbosity");
        if (property2 != null && !property2.isEmpty()) {
            if (property2.equalsIgnoreCase("DEBUG")) {
                i6 = 1;
            } else if (property2.equalsIgnoreCase("ERROR")) {
                i6 = 4;
            } else if (property2.equalsIgnoreCase("WARN")) {
                i6 = 3;
            }
        }
        f828b = i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m452a(String str, Throwable th) {
        m453b().println("SLF4J(E): " + str);
        m453b().println("SLF4J(E): Reported exception:");
        th.printStackTrace(m453b());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static PrintStream m453b() {
        return AbstractC0636d.m1088a(f827a) != 1 ? System.err : System.out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m454c(String str) {
        if (AbstractC0636d.m1088a(3) >= AbstractC0636d.m1088a(f828b)) {
            m453b().println("SLF4J(W): " + str);
        }
    }
}
