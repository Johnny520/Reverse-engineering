package com.android.dx.command.dexer;

/* JADX INFO: loaded from: classes.dex */
public class DxContext {
    public final com.android.dx.dex.cf.CodeStatistics codeStatistics;
    public final java.io.PrintStream err;
    final java.io.PrintStream noop;
    public final com.android.dx.dex.cf.OptimizerOptions optimizerOptions;
    public final java.io.PrintStream out;


    public DxContext() {
            r2 = this;
            java.io.PrintStream r0 = java.lang.System.out
            java.io.PrintStream r1 = java.lang.System.err
            r2.<init>(r0, r1)
            return
    }

    public DxContext(java.io.OutputStream r3, java.io.OutputStream r4) {
            r2 = this;
            r2.<init>()
            com.android.dx.dex.cf.CodeStatistics r0 = new com.android.dx.dex.cf.CodeStatistics
            r0.<init>()
            r2.codeStatistics = r0
            com.android.dx.dex.cf.OptimizerOptions r0 = new com.android.dx.dex.cf.OptimizerOptions
            r0.<init>()
            r2.optimizerOptions = r0
            java.io.PrintStream r0 = new java.io.PrintStream
            com.android.dx.command.dexer.DxContext$1 r1 = new com.android.dx.command.dexer.DxContext$1
            r1.<init>(r2)
            r0.<init>(r1)
            r2.noop = r0
            java.io.PrintStream r0 = new java.io.PrintStream
            r0.<init>(r3)
            r2.out = r0
            java.io.PrintStream r3 = new java.io.PrintStream
            r3.<init>(r4)
            r2.err = r3
            return
    }
}
