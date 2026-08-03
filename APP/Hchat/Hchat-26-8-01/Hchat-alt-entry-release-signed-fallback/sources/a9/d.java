package a9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.CharSequence f84a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a9.a f85b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a9.g f86c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.CharSequence f87d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.String f88e;

    public d(java.lang.CharSequence r2) {
            r1 = this;
            a9.g r0 = new a9.g
            r0.<init>()
            r1.<init>()
            r1.f84a = r2
            r2 = 0
            r1.f85b = r2
            r1.f86c = r0
            java.lang.String r2 = ""
            r1.f87d = r2
            r1.f88e = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof a9.d
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            a9.d r5 = (a9.d) r5
            java.lang.CharSequence r1 = r4.f84a
            java.lang.CharSequence r3 = r5.f84a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            a9.a r1 = r4.f85b
            a9.a r3 = r5.f85b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            a9.g r1 = r4.f86c
            a9.g r3 = r5.f86c
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.CharSequence r1 = r4.f87d
            java.lang.CharSequence r3 = r5.f87d
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r4.f88e
            java.lang.String r5 = r5.f88e
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L43
            return r2
        L43:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            java.lang.CharSequence r0 = r2.f84a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            a9.a r1 = r2.f85b
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            int r0 = r0 * 31
            a9.g r1 = r2.f86c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.CharSequence r0 = r2.f87d
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.f88e
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r7 = this;
            java.lang.CharSequence r0 = r7.f84a
            a9.a r1 = r7.f85b
            a9.g r2 = r7.f86c
            java.lang.CharSequence r3 = r7.f87d
            java.lang.String r4 = r7.f88e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "State(baseName="
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = ", baseNameStyle="
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = ", title="
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = ", tail="
            r5.append(r0)
            r5.append(r3)
            java.lang.String r0 = ", lastRendered="
            r5.append(r0)
            java.lang.String r0 = ")"
            java.lang.String r0 = eh.a.r(r5, r4, r0)
            return r0
    }
}
