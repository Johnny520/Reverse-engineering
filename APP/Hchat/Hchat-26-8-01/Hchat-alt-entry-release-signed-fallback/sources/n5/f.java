package n5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends a.a implements java.lang.CharSequence, java.lang.Comparable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k5.u f9024j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f9025k;

    public f(k5.u r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f9024j = r1
            r0.f9025k = r2
            return
    }

    @Override // a.a, v5.b
    public final void a() {
            r3 = this;
            int r0 = r3.f9025k
            if (r0 < 0) goto Lf
            k5.u r1 = r3.f9024j
            k5.s r1 = r1.f7280r
            k5.u r1 = r1.f7262h
            int r1 = r1.f7266d
            if (r0 >= r1) goto Lf
            return
        Lf:
            v5.a r1 = new v5.a
            java.lang.String r2 = "string@"
            java.lang.String r0 = eh.a.l(r0, r2)
            r1.<init>(r0)
            throw r1
    }

    @Override // java.lang.CharSequence
    public final char charAt(int r2) {
            r1 = this;
            java.lang.String r0 = r1.e1()
            char r2 = r0.charAt(r2)
            return r2
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r2) {
            r1 = this;
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            java.lang.String r0 = r1.e1()
            java.lang.String r2 = r2.toString()
            int r2 = r0.compareTo(r2)
            return r2
    }

    public final java.lang.String e1() {
            r2 = this;
            k5.u r0 = r2.f9024j
            k5.s r0 = r0.f7280r
            int r1 = r2.f9025k
            java.lang.String r0 = r0.b(r1)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 == 0) goto L15
            boolean r0 = r2 instanceof n5.f
            if (r0 == 0) goto L15
            java.lang.String r0 = r1.e1()
            n5.f r2 = (n5.f) r2
            java.lang.String r2 = r2.e1()
            boolean r2 = r0.equals(r2)
            return r2
        L15:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.e1()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.lang.CharSequence
    public final int length() {
            r1 = this;
            java.lang.String r0 = r1.e1()
            int r0 = r0.length()
            return r0
    }

    @Override // java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int r2, int r3) {
            r1 = this;
            java.lang.String r0 = r1.e1()
            java.lang.CharSequence r2 = r0.subSequence(r2, r3)
            return r2
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.e1()
            return r0
    }
}
