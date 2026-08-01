package org.slf4j.helpers;

import java.io.PrintStream;

/* JADX INFO: renamed from: org.slf4j.helpers.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6580 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Reporter$Level f16095;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final Reporter$TargetChoice f16096;

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
        f16096 = reporter$TargetChoice;
        String property2 = System.getProperty("slf4j.internal.verbosity");
        f16095 = (property2 == null || property2.isEmpty()) ? Reporter$Level.INFO : property2.equalsIgnoreCase("DEBUG") ? Reporter$Level.DEBUG : property2.equalsIgnoreCase("ERROR") ? Reporter$Level.ERROR : property2.equalsIgnoreCase("WARN") ? Reporter$Level.WARN : Reporter$Level.INFO;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final void m11697(String str) {
        if (Reporter$Level.WARN.levelInt >= f16095.levelInt) {
            m11699().println("SLF4J(W): " + str);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m11698(String str) {
        if (Reporter$Level.INFO.levelInt >= f16095.levelInt) {
            m11699().println("SLF4J(I): ".concat(str));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static PrintStream m11699() {
        return f16096.ordinal() != 1 ? System.err : System.out;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m11700(String str, Throwable th) {
        m11699().println("SLF4J(E): ".concat(str));
        m11699().println("SLF4J(E): Reported exception:");
        th.printStackTrace(m11699());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final void m11701(String str) {
        m11699().println("SLF4J(E): ".concat(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m11702(String str) {
        if (Reporter$Level.DEBUG.levelInt >= f16095.levelInt) {
            m11699().println("SLF4J(D): ".concat(str));
        }
    }
}
