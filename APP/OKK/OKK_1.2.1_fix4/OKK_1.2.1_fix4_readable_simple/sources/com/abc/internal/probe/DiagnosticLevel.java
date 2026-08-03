package com.abc.internal.probe;

/* JADX INFO: renamed from: b0.m */
/* JADX INFO: loaded from: classes.dex */
public enum DiagnosticLevel extends Enum {

    /* JADX INFO: renamed from: a */
    public static final DiagnosticLevel f1664a = null;

    /* JADX INFO: renamed from: b */
    public static final DiagnosticLevel f1665b = null;

    /* JADX INFO: renamed from: c */
    public static final DiagnosticLevel f1666c = null;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ DiagnosticLevel[] f1667d = null;

    static {
        DiagnosticLevel r02 = new DiagnosticLevel("OK", 0);
        f1664a = r02;
        DiagnosticLevel r1 = new DiagnosticLevel("PARTIAL", 1);
        f1665b = r1;
        DiagnosticLevel r2 = new DiagnosticLevel("FAIL", 2);
        f1666c = r2;
        f1667d = new DiagnosticLevel[]{r02, r1, r2};
    }

    public static DiagnosticLevel valueOf(String r1) {
        return (DiagnosticLevel) Enum.valueOf(DiagnosticLevel.class, r1);
    }

    public static DiagnosticLevel[] values() {
        return (DiagnosticLevel[]) f1667d.clone();
    }
}
