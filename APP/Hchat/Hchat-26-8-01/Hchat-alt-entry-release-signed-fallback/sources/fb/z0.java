package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f3867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f3868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f3869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f3870e;

    public z0(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            r0.<init>()
            r0.f3866a = r1
            r0.f3867b = r2
            r0.f3868c = r3
            r0.f3869d = r4
            r0.f3870e = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof fb.z0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            fb.z0 r5 = (fb.z0) r5
            int r1 = r4.f3866a
            int r3 = r5.f3866a
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.String r1 = r4.f3867b
            java.lang.String r3 = r5.f3867b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            java.lang.String r1 = r4.f3868c
            java.lang.String r3 = r5.f3868c
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L29
            return r2
        L29:
            java.lang.String r1 = r4.f3869d
            java.lang.String r3 = r5.f3869d
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L34
            return r2
        L34:
            java.lang.String r1 = r4.f3870e
            java.lang.String r5 = r5.f3870e
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L3f
            return r2
        L3f:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f3866a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f3867b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f3868c
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f3869d
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r1 = r3.f3870e
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ToolCall(index="
            r0.<init>(r1)
            int r1 = r5.f3866a
            r0.append(r1)
            java.lang.String r1 = ", id="
            r0.append(r1)
            java.lang.String r1 = r5.f3867b
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = ", arguments="
            java.lang.String r2 = ", providerMetadata="
            java.lang.String r3 = r5.f3868c
            java.lang.String r4 = r5.f3869d
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = ")"
            java.lang.String r2 = r5.f3870e
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
