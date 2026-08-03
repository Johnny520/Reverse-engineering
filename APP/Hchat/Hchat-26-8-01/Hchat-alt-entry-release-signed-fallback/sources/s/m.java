package s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12040b;

    public m(int r4, int r5) {
            r3 = this;
            r3.<init>()
            r3.f12039a = r4
            r3.f12040b = r5
            r0 = 0
            r1 = 1
            if (r4 < 0) goto Ld
            r2 = r1
            goto Le
        Ld:
            r2 = r0
        Le:
            if (r2 != 0) goto L15
            java.lang.String r2 = "negative start index"
            o.b.a(r2)
        L15:
            if (r5 < r4) goto L18
            r0 = r1
        L18:
            if (r0 != 0) goto L1f
            java.lang.String r4 = "end index greater than start"
            o.b.a(r4)
        L1f:
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof s.m
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            s.m r5 = (s.m) r5
            int r1 = r4.f12039a
            int r3 = r5.f12039a
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r4.f12040b
            int r5 = r5.f12040b
            if (r1 == r5) goto L1a
            return r2
        L1a:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f12039a
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            int r1 = r2.f12040b
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Interval(start="
            r0.<init>(r1)
            int r1 = r3.f12039a
            r0.append(r1)
            java.lang.String r1 = ", end="
            r0.append(r1)
            int r1 = r3.f12040b
            r2 = 41
            java.lang.String r0 = p.a.n(r0, r1, r2)
            return r0
    }
}
