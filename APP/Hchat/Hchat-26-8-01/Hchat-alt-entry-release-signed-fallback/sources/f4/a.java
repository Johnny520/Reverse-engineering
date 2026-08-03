package f4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class a extends java.lang.RuntimeException {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.StringBuffer f3257g;

    public a(java.lang.String r3, java.lang.Exception r4) {
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
            boolean r3 = r4 instanceof f4.a
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 == 0) goto L2c
            f4.a r4 = (f4.a) r4
            java.lang.StringBuffer r3 = r4.f3257g
            java.lang.String r3 = r3.toString()
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            int r1 = r3.length()
            int r1 = r1 + r0
            r4.<init>(r1)
            r2.f3257g = r4
            r4.append(r3)
            return
        L2c:
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>(r0)
            r2.f3257g = r3
            return
    }

    public static f4.a b(java.lang.String r2, java.lang.Exception r3) {
            boolean r0 = r3 instanceof f4.a
            if (r0 == 0) goto L7
            f4.a r3 = (f4.a) r3
            goto Le
        L7:
            f4.a r0 = new f4.a
            r1 = 0
            r0.<init>(r1, r3)
            r3 = r0
        Le:
            r3.a(r2)
            return r3
    }

    public final void a(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuffer r0 = r2.f3257g
            r0.append(r3)
            java.lang.String r1 = "\n"
            boolean r3 = r3.endsWith(r1)
            if (r3 != 0) goto L12
            r3 = 10
            r0.append(r3)
        L12:
            return
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(java.io.PrintStream r2) {
            r1 = this;
            super.printStackTrace(r2)
            java.lang.StringBuffer r0 = r1.f3257g
            r2.println(r0)
            return
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(java.io.PrintWriter r2) {
            r1 = this;
            super.printStackTrace(r2)
            java.lang.StringBuffer r0 = r1.f3257g
            r2.println(r0)
            return
    }
}
