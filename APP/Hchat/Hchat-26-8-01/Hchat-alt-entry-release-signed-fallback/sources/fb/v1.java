package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fb.u1 f3836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f3837b;

    public v1(fb.u1 r1, java.lang.String r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.f3836a = r1
            r0.f3837b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof fb.v1
            if (r0 != 0) goto L8
            goto L1b
        L8:
            fb.v1 r3 = (fb.v1) r3
            fb.u1 r0 = r2.f3836a
            fb.u1 r1 = r3.f3836a
            if (r0 == r1) goto L11
            goto L1b
        L11:
            java.lang.String r0 = r2.f3837b
            java.lang.String r3 = r3.f3837b
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L1d
        L1b:
            r3 = 0
            return r3
        L1d:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            fb.u1 r0 = r2.f3836a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.f3837b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Operation(kind="
            r0.<init>(r1)
            fb.u1 r1 = r2.f3836a
            r0.append(r1)
            java.lang.String r1 = ", text="
            r0.append(r1)
            java.lang.String r1 = r2.f3837b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
