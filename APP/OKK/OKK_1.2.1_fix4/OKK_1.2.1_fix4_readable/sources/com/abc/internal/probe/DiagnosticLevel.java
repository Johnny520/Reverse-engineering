package com.abc.internal.probe;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: b0.m */
/* JADX INFO: loaded from: classes.dex */
public final class DiagnosticLevel {

    /* JADX INFO: renamed from: a */
    public static final DiagnosticLevel f1664a;

    /* JADX INFO: renamed from: b */
    public static final DiagnosticLevel f1665b;

    /* JADX INFO: renamed from: c */
    public static final DiagnosticLevel f1666c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ DiagnosticLevel[] f1667d;

    static {
        DiagnosticLevel diagnosticLevel = new DiagnosticLevel("OK", 0);
        f1664a = diagnosticLevel;
        DiagnosticLevel diagnosticLevel2 = new DiagnosticLevel("PARTIAL", 1);
        f1665b = diagnosticLevel2;
        DiagnosticLevel diagnosticLevel3 = new DiagnosticLevel("FAIL", 2);
        f1666c = diagnosticLevel3;
        f1667d = new DiagnosticLevel[]{diagnosticLevel, diagnosticLevel2, diagnosticLevel3};
    }

    public static DiagnosticLevel valueOf(String str) {
        return (DiagnosticLevel) Enum.valueOf(DiagnosticLevel.class, str);
    }

    public static DiagnosticLevel[] values() {
        return (DiagnosticLevel[]) f1667d.clone();
    }
}
