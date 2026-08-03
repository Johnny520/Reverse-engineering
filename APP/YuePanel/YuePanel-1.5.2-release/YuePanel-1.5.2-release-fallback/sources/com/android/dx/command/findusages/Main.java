package com.android.dx.command.findusages;

/* JADX INFO: loaded from: classes.dex */
public final class Main {
    public Main() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void main(java.lang.String[] r4) throws java.io.IOException {
            r0 = 0
            r0 = r4[r0]
            r1 = 1
            r1 = r4[r1]
            r2 = 2
            r4 = r4[r2]
            com.android.dex.Dex r2 = new com.android.dex.Dex
            java.io.File r3 = new java.io.File
            r3.<init>(r0)
            r2.<init>(r3)
            java.io.PrintWriter r0 = new java.io.PrintWriter
            java.io.PrintStream r3 = java.lang.System.out
            r0.<init>(r3)
            com.android.dx.command.findusages.FindUsages r3 = new com.android.dx.command.findusages.FindUsages
            r3.<init>(r2, r1, r4, r0)
            r3.findUsages()
            r0.flush()
            return
    }
}
