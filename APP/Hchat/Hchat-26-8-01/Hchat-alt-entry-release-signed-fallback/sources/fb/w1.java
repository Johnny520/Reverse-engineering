package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f3843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f3844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f3845d;

    public w1(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r1.getClass()
            r4.getClass()
            r0.<init>()
            r0.f3842a = r1
            r0.f3843b = r2
            r0.f3844c = r3
            r0.f3845d = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof fb.w1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            fb.w1 r5 = (fb.w1) r5
            java.lang.String r1 = r4.f3842a
            java.lang.String r3 = r5.f3842a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f3843b
            java.lang.String r3 = r5.f3843b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r4.f3844c
            java.lang.String r3 = r5.f3844c
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r4.f3845d
            java.lang.String r5 = r5.f3845d
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L38
            return r2
        L38:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f3842a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f3843b
            if (r2 != 0) goto Lf
            r2 = 0
            goto L13
        Lf:
            int r2 = r2.hashCode()
        L13:
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.String r2 = r3.f3844c
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r1 = r3.f3845d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", content="
            java.lang.String r1 = ", operation="
            java.lang.String r2 = "FileChange(path="
            java.lang.String r3 = r5.f3842a
            java.lang.String r4 = r5.f3843b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", sourcePath="
            java.lang.String r2 = ")"
            java.lang.String r3 = r5.f3844c
            java.lang.String r4 = r5.f3845d
            java.lang.String r0 = j8.b.k(r0, r3, r1, r4, r2)
            return r0
    }
}
