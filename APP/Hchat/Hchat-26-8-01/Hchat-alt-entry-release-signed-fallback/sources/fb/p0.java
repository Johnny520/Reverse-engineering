package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fb.r0 f3697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f3698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fb.o0 f3699c;

    public p0(fb.r0 r1, java.lang.String r2, fb.o0 r3) {
            r0 = this;
            r0.<init>()
            r0.f3697a = r1
            r0.f3698b = r2
            r0.f3699c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof fb.p0
            if (r0 != 0) goto L8
            goto L2a
        L8:
            fb.p0 r3 = (fb.p0) r3
            fb.r0 r0 = r2.f3697a
            fb.r0 r1 = r3.f3697a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            java.lang.String r0 = r2.f3698b
            java.lang.String r1 = r3.f3698b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            fb.o0 r0 = r2.f3699c
            fb.o0 r3 = r3.f3699c
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L2c
        L2a:
            r3 = 0
            return r3
        L2c:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            fb.r0 r0 = r3.f3697a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f3698b
            int r0 = eh.a.g(r0, r1, r2)
            fb.o0 r1 = r3.f3699c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Entry(server="
            r0.<init>(r1)
            fb.r0 r1 = r2.f3697a
            r0.append(r1)
            java.lang.String r1 = ", namespace="
            r0.append(r1)
            java.lang.String r1 = r2.f3698b
            r0.append(r1)
            java.lang.String r1 = ", client="
            r0.append(r1)
            fb.o0 r1 = r2.f3699c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
