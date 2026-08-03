package com.android.dx.command.grep;

/* JADX INFO: loaded from: classes.dex */
public final class Main {
    public Main() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void main(java.lang.String[] r6) throws java.io.IOException {
            r0 = 0
            r1 = r6[r0]
            r2 = 1
            r6 = r6[r2]
            com.android.dex.Dex r3 = new com.android.dex.Dex
            java.io.File r4 = new java.io.File
            r4.<init>(r1)
            r3.<init>(r4)
            com.android.dx.command.grep.Grep r1 = new com.android.dx.command.grep.Grep
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6)
            java.io.PrintWriter r4 = new java.io.PrintWriter
            java.io.PrintStream r5 = java.lang.System.out
            r4.<init>(r5)
            r1.<init>(r3, r6, r4)
            int r6 = r1.grep()
            if (r6 <= 0) goto L27
            goto L28
        L27:
            r0 = r2
        L28:
            java.lang.System.exit(r0)
            return
    }
}
