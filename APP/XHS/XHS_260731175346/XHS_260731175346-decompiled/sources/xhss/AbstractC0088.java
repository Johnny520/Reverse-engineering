package xhss;

/* JADX INFO: renamed from: xhss.ᛱᲀᛸᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0088 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final int f432 = 0;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final int f433 = 0;

    static {
            java.lang.String r0 = "stdout"
            java.lang.String r1 = "sysout"
            java.lang.String r2 = "System.out"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.lang.String r1 = "slf4j.internal.report.stream"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            r2 = 2
            r3 = 3
            r4 = 1
            if (r1 == 0) goto L2c
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L1c
            goto L2c
        L1c:
            r5 = 0
        L1d:
            if (r5 >= r3) goto L2c
            r6 = r0[r5]
            boolean r6 = r6.equalsIgnoreCase(r1)
            if (r6 == 0) goto L29
            r0 = r2
            goto L2d
        L29:
            int r5 = r5 + 1
            goto L1d
        L2c:
            r0 = r4
        L2d:
            xhss.AbstractC0088.f433 = r0
            java.lang.String r0 = "slf4j.internal.verbosity"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L5b
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L3e
            goto L5b
        L3e:
            java.lang.String r1 = "DEBUG"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L48
            r2 = r4
            goto L5b
        L48:
            java.lang.String r1 = "ERROR"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 == 0) goto L52
            r2 = 4
            goto L5b
        L52:
            java.lang.String r1 = "WARN"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L5b
            r2 = r3
        L5b:
            xhss.AbstractC0088.f432 = r2
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static java.io.PrintStream m247() {
            int r0 = xhss.AbstractC0088.f433
            int r0 = xhss.AbstractC0390.m784(r0)
            r1 = 1
            if (r0 == r1) goto Lc
            java.io.PrintStream r0 = java.lang.System.err
            return r0
        Lc:
            java.io.PrintStream r0 = java.lang.System.out
            return r0
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final void m248(java.lang.String r2) {
            r0 = 3
            int r0 = xhss.AbstractC0390.m784(r0)
            int r1 = xhss.AbstractC0088.f432
            int r1 = xhss.AbstractC0390.m784(r1)
            if (r0 < r1) goto L1a
            java.io.PrintStream r0 = m247()
            java.lang.String r1 = "SLF4J(W): "
            java.lang.String r2 = r1.concat(r2)
            r0.println(r2)
        L1a:
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final void m249(java.lang.String r2, java.lang.Throwable r3) {
            java.io.PrintStream r0 = m247()
            java.lang.String r1 = "SLF4J(E): "
            java.lang.String r2 = r1.concat(r2)
            r0.println(r2)
            java.io.PrintStream r2 = m247()
            java.lang.String r0 = "SLF4J(E): Reported exception:"
            r2.println(r0)
            java.io.PrintStream r2 = m247()
            r3.printStackTrace(r2)
            return
    }
}
