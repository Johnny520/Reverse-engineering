package org.slf4j.helpers;

import java.io.PrintStream;

/* JADX INFO: renamed from: org.slf4j.helpers.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5750 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Reporter$Level f15750;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Reporter$TargetChoice f15751;

    static {
        Reporter$TargetChoice reporter$TargetChoice;
        String[] strArr = {"System.out", "stdout", "sysout"};
        String property = System.getProperty("slf4j.internal.report.stream");
        if (property != null && !property.isEmpty()) {
            int i = 0;
            while (true) {
                if (i >= 3) {
                    reporter$TargetChoice = Reporter$TargetChoice.Stderr;
                    break;
                } else {
                    if (strArr[i].equalsIgnoreCase(property)) {
                        reporter$TargetChoice = Reporter$TargetChoice.Stdout;
                        break;
                    }
                    i++;
                }
            }
        } else {
            reporter$TargetChoice = Reporter$TargetChoice.Stderr;
        }
        f15751 = reporter$TargetChoice;
        String property2 = System.getProperty("slf4j.internal.verbosity");
        f15750 = (property2 == null || property2.isEmpty()) ? Reporter$Level.INFO : property2.equalsIgnoreCase("DEBUG") ? Reporter$Level.DEBUG : property2.equalsIgnoreCase("ERROR") ? Reporter$Level.ERROR : property2.equalsIgnoreCase("WARN") ? Reporter$Level.WARN : Reporter$Level.INFO;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m11138(String str) {
        if (Reporter$Level.WARN.levelInt >= f15750.levelInt) {
            m11140().println("SLF4J(W): " + str);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m11139(String str) {
        if (Reporter$Level.INFO.levelInt >= f15750.levelInt) {
            m11140().println("SLF4J(I): ".concat(str));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static PrintStream m11140() {
        return f15751.ordinal() != 1 ? System.err : System.out;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m11141(String str, Throwable th) {
        m11140().println("SLF4J(E): ".concat(str));
        m11140().println("SLF4J(E): Reported exception:");
        th.printStackTrace(m11140());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m11142(String str) {
        m11140().println("SLF4J(E): ".concat(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m11143(String str) {
        if (Reporter$Level.DEBUG.levelInt >= f15750.levelInt) {
            m11140().println("SLF4J(D): ".concat(str));
        }
    }
}
