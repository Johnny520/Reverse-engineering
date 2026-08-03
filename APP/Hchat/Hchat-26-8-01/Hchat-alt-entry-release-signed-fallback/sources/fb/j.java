package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f3572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f3573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f3574d;

    public j(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.f3571a = r1
            r0.f3572b = r2
            r0.f3573c = r3
            r0.f3574d = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L37
        L3:
            boolean r0 = r3 instanceof fb.j
            if (r0 != 0) goto L8
            goto L35
        L8:
            fb.j r3 = (fb.j) r3
            java.lang.String r0 = r2.f3571a
            java.lang.String r1 = r3.f3571a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L35
        L15:
            java.lang.String r0 = r2.f3572b
            java.lang.String r1 = r3.f3572b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L35
        L20:
            java.lang.String r0 = r2.f3573c
            java.lang.String r1 = r3.f3573c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L35
        L2b:
            java.lang.String r0 = r2.f3574d
            java.lang.String r3 = r3.f3574d
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L37
        L35:
            r3 = 0
            return r3
        L37:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f3571a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f3572b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f3573c
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r1 = r3.f3574d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", name="
            java.lang.String r1 = ", arguments="
            java.lang.String r2 = "NativeToolCallBuilder(id="
            java.lang.String r3 = r5.f3571a
            java.lang.String r4 = r5.f3572b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", providerMetadata="
            java.lang.String r2 = ")"
            java.lang.String r3 = r5.f3573c
            java.lang.String r4 = r5.f3574d
            java.lang.String r0 = j8.b.k(r0, r3, r1, r4, r2)
            return r0
    }
}
