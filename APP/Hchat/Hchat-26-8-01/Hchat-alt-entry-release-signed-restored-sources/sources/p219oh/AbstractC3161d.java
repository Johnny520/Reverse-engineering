package p219oh;

import java.io.PrintStream;
import p281t3.AbstractC4106c;

/* JADX INFO: renamed from: oh.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3161d {

    /* JADX INFO: renamed from: a */
    public static final int f10216a;

    /* JADX INFO: renamed from: b */
    public static final int f10217b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i9;
        String[] strArr = {"System.out", "stdout", "sysout"};
        String property = System.getProperty("slf4j.internal.report.stream");
        int i10 = 2;
        if (property == null || property.isEmpty()) {
            i9 = 1;
        } else {
            for (int i11 = 0; i11 < 3; i11++) {
                if (strArr[i11].equalsIgnoreCase(property)) {
                    i9 = 2;
                    break;
                }
            }
            i9 = 1;
        }
        f10216a = i9;
        String property2 = System.getProperty("slf4j.internal.verbosity");
        if (property2 != null && !property2.isEmpty()) {
            if (property2.equalsIgnoreCase("DEBUG")) {
                i10 = 1;
            } else if (property2.equalsIgnoreCase("ERROR")) {
                i10 = 4;
            } else if (property2.equalsIgnoreCase("WARN")) {
                i10 = 3;
            }
        }
        f10217b = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m6744a(String str, Throwable th2) {
        m6745b().println("SLF4J(E): ".concat(str));
        m6745b().println("SLF4J(E): Reported exception:");
        th2.printStackTrace(m6745b());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static PrintStream m6745b() {
        return AbstractC4106c.m8279b(f10216a) != 1 ? System.err : System.out;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m6746c(String str) {
        if (AbstractC4106c.m8279b(3) >= AbstractC4106c.m8279b(f10217b)) {
            m6745b().println("SLF4J(W): ".concat(str));
        }
    }
}
