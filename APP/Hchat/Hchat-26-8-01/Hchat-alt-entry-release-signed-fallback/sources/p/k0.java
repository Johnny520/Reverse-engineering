package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9938d;

    public k0(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f9935a = r1
            r0.f9936b = r2
            r0.f9937c = r3
            r0.f9938d = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p.k0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            p.k0 r5 = (p.k0) r5
            int r1 = r5.f9935a
            int r3 = r4.f9935a
            if (r3 != r1) goto L25
            int r1 = r4.f9936b
            int r3 = r5.f9936b
            if (r1 != r3) goto L25
            int r1 = r4.f9937c
            int r3 = r5.f9937c
            if (r1 != r3) goto L25
            int r1 = r4.f9938d
            int r5 = r5.f9938d
            if (r1 != r5) goto L25
            return r0
        L25:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f9935a
            int r0 = r0 * 31
            int r1 = r2.f9936b
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.f9937c
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.f9938d
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "InsetsValues(left="
            r0.<init>(r1)
            int r1 = r3.f9935a
            r0.append(r1)
            java.lang.String r1 = ", top="
            r0.append(r1)
            int r1 = r3.f9936b
            r0.append(r1)
            java.lang.String r1 = ", right="
            r0.append(r1)
            int r1 = r3.f9937c
            r0.append(r1)
            java.lang.String r1 = ", bottom="
            r0.append(r1)
            int r1 = r3.f9938d
            r2 = 41
            java.lang.String r0 = p.a.n(r0, r1, r2)
            return r0
    }
}
