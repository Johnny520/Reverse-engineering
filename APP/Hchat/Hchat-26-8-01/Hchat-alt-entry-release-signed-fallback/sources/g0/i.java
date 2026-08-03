package g0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2.g f4026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i2.g f4027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g0.d f4029d;

    public i(i2.g r1, i2.g r2) {
            r0 = this;
            r0.<init>()
            r0.f4026a = r1
            r0.f4027b = r2
            r1 = 0
            r0.f4028c = r1
            r1 = 0
            r0.f4029d = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof g0.i
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            g0.i r5 = (g0.i) r5
            i2.g r1 = r4.f4026a
            i2.g r3 = r5.f4026a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            i2.g r1 = r4.f4027b
            i2.g r3 = r5.f4027b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            boolean r1 = r4.f4028c
            boolean r3 = r5.f4028c
            if (r1 == r3) goto L29
            return r2
        L29:
            g0.d r1 = r4.f4029d
            g0.d r5 = r5.f4029d
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L34
            return r2
        L34:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            i2.g r0 = r3.f4026a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            i2.g r2 = r3.f4027b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r3.f4028c
            int r0 = eh.a.h(r2, r1, r0)
            g0.d r1 = r3.f4029d
            if (r1 != 0) goto L1d
            r1 = 0
            goto L21
        L1d:
            int r1 = r1.hashCode()
        L21:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TextSubstitutionValue(original="
            r0.<init>(r1)
            i2.g r1 = r2.f4026a
            r0.append(r1)
            java.lang.String r1 = ", substitution="
            r0.append(r1)
            i2.g r1 = r2.f4027b
            r0.append(r1)
            java.lang.String r1 = ", isShowingSubstitution="
            r0.append(r1)
            boolean r1 = r2.f4028c
            r0.append(r1)
            java.lang.String r1 = ", layoutCache="
            r0.append(r1)
            g0.d r1 = r2.f4029d
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
