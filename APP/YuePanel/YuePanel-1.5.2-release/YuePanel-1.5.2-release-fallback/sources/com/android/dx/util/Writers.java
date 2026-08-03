package com.android.dx.util;

/* JADX INFO: loaded from: classes.dex */
public final class Writers {
    private Writers() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.io.PrintWriter printWriterFor(java.io.Writer r1) {
            boolean r0 = r1 instanceof java.io.PrintWriter
            if (r0 == 0) goto L7
            java.io.PrintWriter r1 = (java.io.PrintWriter) r1
            return r1
        L7:
            java.io.PrintWriter r0 = new java.io.PrintWriter
            r0.<init>(r1)
            return r0
    }
}
