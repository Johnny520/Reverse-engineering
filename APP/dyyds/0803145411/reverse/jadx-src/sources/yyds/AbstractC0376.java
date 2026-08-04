package yyds;

import java.io.PrintStream;

/* JADX INFO: renamed from: yyds.ᛲᛶᛶᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0376 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final int f1917;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final int f1918;

    static {
        int i;
        String[] strArr = {"System.out", "stdout", "sysout"};
        String property = System.getProperty("slf4j.internal.report.stream");
        int i2 = 2;
        if (property == null || property.isEmpty()) {
            i = 1;
        } else {
            for (int i3 = 0; i3 < 3; i3++) {
                if (strArr[i3].equalsIgnoreCase(property)) {
                    i = 2;
                    break;
                }
            }
            i = 1;
        }
        f1917 = i;
        String property2 = System.getProperty("slf4j.internal.verbosity");
        if (property2 != null && !property2.isEmpty()) {
            if (property2.equalsIgnoreCase("DEBUG")) {
                i2 = 1;
            } else if (property2.equalsIgnoreCase("ERROR")) {
                i2 = 4;
            } else if (property2.equalsIgnoreCase("WARN")) {
                i2 = 3;
            }
        }
        f1918 = i2;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final void m1076(String str, Throwable th) {
        m1077().println("SLF4J(E): ".concat(str));
        m1077().println("SLF4J(E): Reported exception:");
        th.printStackTrace(m1077());
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static PrintStream m1077() {
        return AbstractC2104.m4012(f1917) != 1 ? System.err : System.out;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final void m1078(String str) {
        if (AbstractC2104.m4012(3) >= AbstractC2104.m4012(f1918)) {
            m1077().println("SLF4J(W): ".concat(str));
        }
    }
}
