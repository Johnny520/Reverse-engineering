package com.android.dex.util;

/* JADX INFO: loaded from: classes.dex */
public class ExceptionWithContext extends java.lang.RuntimeException {
    private java.lang.StringBuffer context;

    public ExceptionWithContext(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ExceptionWithContext(java.lang.String r3, java.lang.Throwable r4) {
            r2 = this;
            if (r3 == 0) goto L3
            goto Lb
        L3:
            if (r4 == 0) goto La
            java.lang.String r3 = r4.getMessage()
            goto Lb
        La:
            r3 = 0
        Lb:
            r2.<init>(r3, r4)
            boolean r3 = r4 instanceof com.android.dex.util.ExceptionWithContext
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 == 0) goto L2c
            com.android.dex.util.ExceptionWithContext r4 = (com.android.dex.util.ExceptionWithContext) r4
            java.lang.StringBuffer r3 = r4.context
            java.lang.String r3 = r3.toString()
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            int r1 = r3.length()
            int r1 = r1 + r0
            r4.<init>(r1)
            r2.context = r4
            r4.append(r3)
            goto L33
        L2c:
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>(r0)
            r2.context = r3
        L33:
            return
    }

    public ExceptionWithContext(java.lang.Throwable r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    public static com.android.dex.util.ExceptionWithContext withContext(java.lang.Throwable r1, java.lang.String r2) {
            boolean r0 = r1 instanceof com.android.dex.util.ExceptionWithContext
            if (r0 == 0) goto L7
            com.android.dex.util.ExceptionWithContext r1 = (com.android.dex.util.ExceptionWithContext) r1
            goto Ld
        L7:
            com.android.dex.util.ExceptionWithContext r0 = new com.android.dex.util.ExceptionWithContext
            r0.<init>(r1)
            r1 = r0
        Ld:
            r1.addContext(r2)
            return r1
    }

    public void addContext(java.lang.String r2) {
            r1 = this;
            if (r2 == 0) goto L17
            java.lang.StringBuffer r0 = r1.context
            r0.append(r2)
            java.lang.String r0 = "\n"
            boolean r2 = r2.endsWith(r0)
            if (r2 != 0) goto L16
            java.lang.StringBuffer r2 = r1.context
            r0 = 10
            r2.append(r0)
        L16:
            return
        L17:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "str == null"
            r2.<init>(r0)
            throw r2
    }

    public java.lang.String getContext() {
            r1 = this;
            java.lang.StringBuffer r0 = r1.context
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void printContext(java.io.PrintStream r2) {
            r1 = this;
            java.lang.String r0 = r1.getMessage()
            r2.println(r0)
            java.lang.StringBuffer r0 = r1.context
            r2.print(r0)
            return
    }

    public void printContext(java.io.PrintWriter r2) {
            r1 = this;
            java.lang.String r0 = r1.getMessage()
            r2.println(r0)
            java.lang.StringBuffer r0 = r1.context
            r2.print(r0)
            return
    }

    @Override // java.lang.Throwable
    public void printStackTrace(java.io.PrintStream r2) {
            r1 = this;
            super.printStackTrace(r2)
            java.lang.StringBuffer r0 = r1.context
            r2.println(r0)
            return
    }

    @Override // java.lang.Throwable
    public void printStackTrace(java.io.PrintWriter r2) {
            r1 = this;
            super.printStackTrace(r2)
            java.lang.StringBuffer r0 = r1.context
            r2.println(r0)
            return
    }
}
