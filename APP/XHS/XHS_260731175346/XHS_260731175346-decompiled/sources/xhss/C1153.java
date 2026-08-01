package xhss;

/* JADX INFO: renamed from: xhss.ᲈᛶᲈᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1153 extends java.util.concurrent.CancellationException {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final transient xhss.AbstractC0784 f3751;

    public C1153(java.lang.String r1, java.lang.Throwable r2, xhss.AbstractC0784 r3) {
            r0 = this;
            r0.<init>(r1)
            r0.f3751 = r3
            if (r2 == 0) goto La
            r0.initCause(r2)
        La:
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 == r2) goto L31
            boolean r0 = r3 instanceof xhss.C1153
            if (r0 == 0) goto L2f
            xhss.ᲈᛶᲈᛵ r3 = (xhss.C1153) r3
            java.lang.String r0 = r3.getMessage()
            java.lang.String r1 = r2.getMessage()
            boolean r0 = xhss.AbstractC0007.m97(r0, r1)
            if (r0 == 0) goto L2f
            xhss.ᛸᛷᛳᲈ r0 = r3.f3751
            xhss.ᛸᛷᛳᲈ r1 = r2.f3751
            boolean r0 = xhss.AbstractC0007.m97(r0, r1)
            if (r0 == 0) goto L2f
            java.lang.Throwable r3 = r3.getCause()
            java.lang.Throwable r2 = r2.getCause()
            boolean r2 = xhss.AbstractC0007.m97(r3, r2)
            if (r2 == 0) goto L2f
            goto L31
        L2f:
            r2 = 0
            return r2
        L31:
            r2 = 1
            return r2
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
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            xhss.ᛸᛷᛳᲈ r1 = r2.f3751
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Throwable r2 = r2.getCause()
            if (r2 == 0) goto L1e
            int r2 = r2.hashCode()
            goto L1f
        L1e:
            r2 = 0
        L1f:
            int r1 = r1 + r2
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
            xhss.ᛸᛷᛳᲈ r2 = r2.f3751
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
