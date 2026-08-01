package p116hf;

import java.io.PrintStream;

/* JADX INFO: renamed from: hf.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3030m {

    /* JADX INFO: renamed from: a */
    public static final String[] f8026a = {"System.out", "stdout", "sysout"};

    /* JADX INFO: renamed from: b */
    public static final b f8027b = m11191e();

    /* JADX INFO: renamed from: c */
    public static final a f8028c = m11193g();

    /* JADX INFO: renamed from: hf.m$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public enum a {
        DEBUG(0),
        INFO(1),
        WARN(2),
        ERROR(3);


        /* JADX INFO: renamed from: q */
        public int f8034q;

        a(int i10) {
            this.f8034q = i10;
        }
    }

    /* JADX INFO: renamed from: hf.m$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public enum b {
        Stderr,
        Stdout
    }

    /* JADX INFO: renamed from: a */
    public static void m11187a(String str) {
        if (m11194h(a.DEBUG)) {
            m11190d().println("SLF4J(D): " + str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m11188b(String str) {
        m11190d().println("SLF4J(E): " + str);
    }

    /* JADX INFO: renamed from: c */
    public static final void m11189c(String str, Throwable th) {
        m11190d().println("SLF4J(E): " + str);
        m11190d().println("SLF4J(E): Reported exception:");
        th.printStackTrace(m11190d());
    }

    /* JADX INFO: renamed from: d */
    public static PrintStream m11190d() {
        return f8027b.ordinal() != 1 ? System.err : System.out;
    }

    /* JADX INFO: renamed from: e */
    public static b m11191e() {
        String property = System.getProperty("slf4j.internal.report.stream");
        if (property == null || property.isEmpty()) {
            return b.Stderr;
        }
        for (String str : f8026a) {
            if (str.equalsIgnoreCase(property)) {
                return b.Stdout;
            }
        }
        return b.Stderr;
    }

    /* JADX INFO: renamed from: f */
    public static void m11192f(String str) {
        if (m11194h(a.INFO)) {
            m11190d().println("SLF4J(I): " + str);
        }
    }

    /* JADX INFO: renamed from: g */
    public static a m11193g() {
        String property = System.getProperty("slf4j.internal.verbosity");
        return (property == null || property.isEmpty()) ? a.INFO : property.equalsIgnoreCase("DEBUG") ? a.DEBUG : property.equalsIgnoreCase("ERROR") ? a.ERROR : property.equalsIgnoreCase("WARN") ? a.WARN : a.INFO;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m11194h(a aVar) {
        return aVar.f8034q >= f8028c.f8034q;
    }

    /* JADX INFO: renamed from: i */
    public static final void m11195i(String str) {
        if (m11194h(a.WARN)) {
            m11190d().println("SLF4J(W): " + str);
        }
    }
}
