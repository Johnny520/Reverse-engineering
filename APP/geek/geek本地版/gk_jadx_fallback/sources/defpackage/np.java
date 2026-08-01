package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class np extends java.util.concurrent.CancellationException {
    public final transient defpackage.wp a;

    public np(java.lang.String r1, java.lang.Throwable r2, defpackage.wp r3) {
            r0 = this;
            r0.<init>(r1)
            r0.a = r3
            if (r2 == 0) goto La
            r0.initCause(r2)
        La:
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 == r2) goto L31
            boolean r0 = r3 instanceof defpackage.np
            if (r0 == 0) goto L2f
            np r3 = (defpackage.np) r3
            java.lang.String r0 = r3.getMessage()
            java.lang.String r1 = r2.getMessage()
            boolean r0 = defpackage.ip.i(r0, r1)
            if (r0 == 0) goto L2f
            wp r0 = r3.a
            wp r1 = r2.a
            boolean r0 = defpackage.ip.i(r0, r1)
            if (r0 == 0) goto L2f
            java.lang.Throwable r3 = r3.getCause()
            java.lang.Throwable r0 = r2.getCause()
            boolean r3 = defpackage.ip.i(r3, r0)
            if (r3 == 0) goto L2f
            goto L31
        L2f:
            r3 = 0
            return r3
        L31:
            r3 = 1
            return r3
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
            r1 = this;
            r0 = 0
            java.lang.StackTraceElement[] r0 = new java.lang.StackTraceElement[r0]
            r1.setStackTrace(r0)
            return r1
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.getMessage()
            defpackage.ip.l(r0)
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            wp r1 = r2.a
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Throwable r0 = r2.getCause()
            if (r0 == 0) goto L21
            int r0 = r0.hashCode()
            goto L22
        L21:
            r0 = 0
        L22:
            int r1 = r1 + r0
            return r1
    }

    @Override // java.lang.Throwable
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.String r1 = "; job="
            r0.append(r1)
            wp r1 = r2.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
