package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f3603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f3604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f3605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f3606e;

    public k(int r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r0.<init>()
            r0.f3602a = r1
            r0.f3603b = r2
            r0.f3604c = r3
            r0.f3605d = r4
            r0.f3606e = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof fb.k
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            fb.k r5 = (fb.k) r5
            int r1 = r4.f3602a
            int r3 = r5.f3602a
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.String r1 = r4.f3603b
            java.lang.String r3 = r5.f3603b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            java.lang.String r1 = r4.f3604c
            java.lang.String r3 = r5.f3604c
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L29
            return r2
        L29:
            java.lang.String r1 = r4.f3605d
            java.lang.String r3 = r5.f3605d
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L34
            return r2
        L34:
            java.lang.String r1 = r4.f3606e
            java.lang.String r5 = r5.f3606e
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L3f
            return r2
        L3f:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f3602a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f3603b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f3604c
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f3605d
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r1 = r3.f3606e
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "NativeToolDelta(index="
            r0.<init>(r1)
            int r1 = r5.f3602a
            r0.append(r1)
            java.lang.String r1 = ", id="
            r0.append(r1)
            java.lang.String r1 = r5.f3603b
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = ", arguments="
            java.lang.String r2 = ", providerMetadata="
            java.lang.String r3 = r5.f3604c
            java.lang.String r4 = r5.f3605d
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = ")"
            java.lang.String r2 = r5.f3606e
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
