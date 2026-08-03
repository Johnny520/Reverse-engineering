package i5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends a.a implements v5.b, java.lang.Comparable {
    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            i5.a r1 = (i5.a) r1
            int r1 = r0.e1(r1)
            return r1
    }

    public final int e1(i5.a r3) {
            r2 = this;
            java.lang.String r0 = r2.f1()
            java.lang.String r1 = r3.f1()
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto Lf
            return r0
        Lf:
            java.lang.String r0 = r2.getName()
            java.lang.String r1 = r3.getName()
            int r0 = r0.compareTo(r1)
            if (r0 == 0) goto L1e
            return r0
        L1e:
            java.lang.String r0 = r2.getType()
            java.lang.String r3 = r3.getType()
            int r3 = r0.compareTo(r3)
            return r3
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof i5.a
            if (r0 == 0) goto L32
            i5.a r3 = (i5.a) r3
            java.lang.String r0 = r2.f1()
            java.lang.String r1 = r3.f1()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L32
            java.lang.String r0 = r2.getName()
            java.lang.String r1 = r3.getName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L32
            java.lang.String r0 = r2.getType()
            java.lang.String r3 = r3.getType()
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L32
            r3 = 1
            return r3
        L32:
            r3 = 0
            return r3
    }

    public abstract java.lang.String f1();

    public abstract java.lang.String getName();

    public abstract java.lang.String getType();

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f1()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.getName()
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r2.getType()
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            q5.a r1 = new q5.a     // Catch: java.io.IOException -> L12
            r1.<init>(r0)     // Catch: java.io.IOException -> L12
            r1.h(r2)     // Catch: java.io.IOException -> L12
            java.lang.String r0 = r0.toString()
            return r0
        L12:
            java.lang.String r0 = "Unexpected IOException"
            j8.o.f(r0)
            r0 = 0
            return r0
    }
}
