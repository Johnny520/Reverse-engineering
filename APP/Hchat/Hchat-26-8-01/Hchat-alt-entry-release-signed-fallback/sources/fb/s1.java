package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f3764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f3765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f3766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3769f;

    public s1(java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, boolean r5, int r6) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.f3764a = r1
            r0.f3765b = r2
            r0.f3766c = r3
            r0.f3767d = r4
            r0.f3768e = r5
            r0.f3769f = r6
            return
    }

    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.f3765b
            return r0
    }

    public final boolean b() {
            r1 = this;
            boolean r0 = r1.f3768e
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L41
        L3:
            boolean r0 = r3 instanceof fb.s1
            if (r0 != 0) goto L8
            goto L3f
        L8:
            fb.s1 r3 = (fb.s1) r3
            java.lang.String r0 = r2.f3764a
            java.lang.String r1 = r3.f3764a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L3f
        L15:
            java.lang.String r0 = r2.f3765b
            java.lang.String r1 = r3.f3765b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L20
            goto L3f
        L20:
            java.lang.String r0 = r2.f3766c
            java.lang.String r1 = r3.f3766c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L3f
        L2b:
            int r0 = r2.f3767d
            int r1 = r3.f3767d
            if (r0 == r1) goto L32
            goto L3f
        L32:
            boolean r0 = r2.f3768e
            boolean r1 = r3.f3768e
            if (r0 == r1) goto L39
            goto L3f
        L39:
            int r0 = r2.f3769f
            int r3 = r3.f3769f
            if (r0 == r3) goto L41
        L3f:
            r3 = 0
            return r3
        L41:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f3764a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f3765b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f3766c
            int r0 = eh.a.g(r0, r1, r2)
            int r2 = r3.f3767d
            int r0 = eh.a.e(r2, r0, r1)
            boolean r2 = r3.f3768e
            int r0 = eh.a.h(r0, r1, r2)
            int r1 = r3.f3769f
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", modelContent="
            java.lang.String r1 = ", handle="
            java.lang.String r2 = "StoredResult(preview="
            java.lang.String r3 = r5.f3764a
            java.lang.String r4 = r5.f3765b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.f3766c
            r0.append(r1)
            java.lang.String r1 = ", totalChars="
            r0.append(r1)
            int r1 = r5.f3767d
            r0.append(r1)
            java.lang.String r1 = ", truncated="
            r0.append(r1)
            boolean r1 = r5.f3768e
            r0.append(r1)
            java.lang.String r1 = ", nextOffset="
            r0.append(r1)
            int r1 = r5.f3769f
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
