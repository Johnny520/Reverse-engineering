package g0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f4045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.String f4046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g0.e f4048d;

    public m(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f4045a = r1
            r0.f4046b = r2
            r1 = 0
            r0.f4047c = r1
            r1 = 0
            r0.f4048d = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof g0.m
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            g0.m r5 = (g0.m) r5
            java.lang.String r1 = r4.f4045a
            java.lang.String r3 = r5.f4045a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r4.f4046b
            java.lang.String r3 = r5.f4046b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            boolean r1 = r4.f4047c
            boolean r3 = r5.f4047c
            if (r1 == r3) goto L29
            return r2
        L29:
            g0.e r1 = r4.f4048d
            g0.e r5 = r5.f4048d
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L34
            return r2
        L34:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f4045a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f4046b
            int r0 = eh.a.g(r0, r1, r2)
            boolean r2 = r3.f4047c
            int r0 = eh.a.h(r0, r1, r2)
            g0.e r1 = r3.f4048d
            if (r1 != 0) goto L1b
            r1 = 0
            goto L1f
        L1b:
            int r1 = r1.hashCode()
        L1f:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TextSubstitution(layoutCache="
            r0.<init>(r1)
            g0.e r1 = r2.f4048d
            r0.append(r1)
            java.lang.String r1 = ", isShowingSubstitution="
            r0.append(r1)
            boolean r1 = r2.f4047c
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
