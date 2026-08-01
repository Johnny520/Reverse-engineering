package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class yn0 extends java.util.concurrent.CancellationException {

    /* JADX INFO: renamed from: ε */
    public final transient p000.fo0 f12690;

    public yn0(java.lang.String r1, java.lang.Throwable r2, p000.fo0 r3) {
            r0 = this;
            r0.<init>(r1)
            r0.f12690 = r3
            if (r2 == 0) goto La
            r0.initCause(r2)
        La:
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 == r2) goto L31
            boolean r0 = r3 instanceof p000.yn0
            if (r0 == 0) goto L2f
            yn0 r3 = (p000.yn0) r3
            java.lang.String r0 = r3.getMessage()
            java.lang.String r1 = r2.getMessage()
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L2f
            fo0 r0 = r3.f12690
            fo0 r1 = r2.f12690
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L2f
            java.lang.Throwable r3 = r3.getCause()
            java.lang.Throwable r2 = r2.getCause()
            boolean r2 = p000.ln0.m3626(r3, r2)
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
            r0.getClass()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            fo0 r1 = r2.f12690
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Throwable r2 = r2.getCause()
            if (r2 == 0) goto L21
            int r2 = r2.hashCode()
            goto L22
        L21:
            r2 = 0
        L22:
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
            fo0 r2 = r2.f12690
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
