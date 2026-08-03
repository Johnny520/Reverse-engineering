package nb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends nb.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f9297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9298b;

    public n(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f9297a = r1
            r1 = 0
            r0.f9298b = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof nb.n
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            nb.n r5 = (nb.n) r5
            java.lang.String r1 = r4.f9297a
            java.lang.String r3 = r5.f9297a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r4.f9298b
            int r5 = r5.f9298b
            if (r1 == r5) goto L1e
            return r2
        L1e:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f9297a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r2.f9298b
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            int r0 = r3.f9298b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Speech(text="
            r1.<init>(r2)
            java.lang.String r2 = r3.f9297a
            r1.append(r2)
            java.lang.String r2 = ", resumeOffset="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
