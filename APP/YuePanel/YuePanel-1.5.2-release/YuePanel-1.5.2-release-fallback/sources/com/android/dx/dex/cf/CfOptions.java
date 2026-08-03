package com.android.dx.dex.cf;

/* JADX INFO: loaded from: classes.dex */
public class CfOptions {
    public java.lang.String dontOptimizeListFile;
    public boolean localInfo;
    public boolean optimize;
    public java.lang.String optimizeListFile;
    public int positionInfo;
    public boolean statistics;
    public boolean strictNameCheck;
    public java.io.PrintStream warn;

    public CfOptions() {
            r2 = this;
            r2.<init>()
            r0 = 2
            r2.positionInfo = r0
            r0 = 0
            r2.localInfo = r0
            r1 = 1
            r2.strictNameCheck = r1
            r2.optimize = r0
            r0 = 0
            r2.optimizeListFile = r0
            r2.dontOptimizeListFile = r0
            java.io.PrintStream r0 = java.lang.System.err
            r2.warn = r0
            return
    }
}
