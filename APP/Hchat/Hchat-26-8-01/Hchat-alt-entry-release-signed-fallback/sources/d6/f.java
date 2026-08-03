package d6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class f extends java.lang.RuntimeException {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.StringBuffer f2008g;

    public f(java.lang.Exception r2, java.lang.String r3, java.lang.Object... r4) {
            r1 = this;
            if (r3 == 0) goto L7
            java.lang.String r3 = java.lang.String.format(r3, r4)
            goto Lf
        L7:
            if (r2 == 0) goto Le
            java.lang.String r3 = r2.getMessage()
            goto Lf
        Le:
            r3 = 0
        Lf:
            r1.<init>(r3, r2)
            boolean r3 = r2 instanceof d6.f
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 == 0) goto L30
            d6.f r2 = (d6.f) r2
            java.lang.StringBuffer r2 = r2.f2008g
            java.lang.String r2 = r2.toString()
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            int r0 = r2.length()
            int r0 = r0 + r4
            r3.<init>(r0)
            r1.f2008g = r3
            r3.append(r2)
            return
        L30:
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>(r4)
            r1.f2008g = r2
            return
    }

    public static d6.f a(java.lang.Exception r3, java.lang.String r4, java.lang.Object... r5) {
            boolean r0 = r3 instanceof d6.f
            if (r0 == 0) goto L7
            d6.f r3 = (d6.f) r3
            goto L11
        L7:
            d6.f r0 = new d6.f
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r0.<init>(r3, r2, r1)
            r3 = r0
        L11:
            java.lang.String r4 = java.lang.String.format(r4, r5)
            java.lang.StringBuffer r5 = r3.f2008g
            r5.append(r4)
            java.lang.String r0 = "\n"
            boolean r4 = r4.endsWith(r0)
            if (r4 != 0) goto L27
            r4 = 10
            r5.append(r4)
        L27:
            return r3
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(java.io.PrintStream r2) {
            r1 = this;
            super.printStackTrace(r2)
            java.lang.StringBuffer r0 = r1.f2008g
            r2.println(r0)
            return
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(java.io.PrintWriter r2) {
            r1 = this;
            super.printStackTrace(r2)
            java.lang.StringBuffer r0 = r1.f2008g
            r2.println(r0)
            return
    }
}
