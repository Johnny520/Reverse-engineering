package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f3672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f3673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f3674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f3675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3676e;

    public n2(java.util.List r1, java.util.List r2, java.util.List r3, java.lang.String r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.f3672a = r1
            r0.f3673b = r2
            r0.f3674c = r3
            r0.f3675d = r4
            r0.f3676e = r5
            return
    }

    public final boolean a() {
            r1 = this;
            java.util.List r0 = r1.f3672a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1b
            java.util.List r0 = r1.f3673b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1b
            java.util.List r0 = r1.f3674c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L19
            goto L1b
        L19:
            r0 = 0
            return r0
        L1b:
            r0 = 1
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L3e
        L3:
            boolean r0 = r3 instanceof fb.n2
            if (r0 != 0) goto L8
            goto L3c
        L8:
            fb.n2 r3 = (fb.n2) r3
            java.util.List r0 = r2.f3672a
            java.util.List r1 = r3.f3672a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L3c
        L15:
            java.util.List r0 = r2.f3673b
            java.util.List r1 = r3.f3673b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L3c
        L20:
            java.util.List r0 = r2.f3674c
            java.util.List r1 = r3.f3674c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L3c
        L2b:
            java.lang.String r0 = r2.f3675d
            java.lang.String r1 = r3.f3675d
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            goto L3c
        L36:
            boolean r0 = r2.f3676e
            boolean r3 = r3.f3676e
            if (r0 == r3) goto L3e
        L3c:
            r3 = 0
            return r3
        L3e:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.util.List r0 = r3.f3672a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.util.List r2 = r3.f3673b
            int r0 = j8.b.e(r2, r0, r1)
            java.util.List r2 = r3.f3674c
            int r0 = j8.b.e(r2, r0, r1)
            java.lang.String r2 = r3.f3675d
            int r0 = eh.a.g(r0, r1, r2)
            boolean r1 = r3.f3676e
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ChangeSummary(created="
            r0.<init>(r1)
            java.util.List r1 = r3.f3672a
            r0.append(r1)
            java.lang.String r1 = ", modified="
            r0.append(r1)
            java.util.List r1 = r3.f3673b
            r0.append(r1)
            java.lang.String r1 = ", deleted="
            r0.append(r1)
            java.util.List r1 = r3.f3674c
            r0.append(r1)
            java.lang.String r1 = ", diff="
            r0.append(r1)
            java.lang.String r1 = r3.f3675d
            r0.append(r1)
            java.lang.String r1 = ", diffTruncated="
            r0.append(r1)
            java.lang.String r1 = ")"
            boolean r2 = r3.f3676e
            java.lang.String r0 = p.a.m(r1, r0, r2)
            return r0
    }
}
