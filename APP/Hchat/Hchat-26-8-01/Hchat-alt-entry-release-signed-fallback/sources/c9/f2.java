package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f1193c;

    public f2(java.lang.String r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f1191a = r3
            r0.f1192b = r2
            r0.f1193c = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L24
        L3:
            boolean r0 = r3 instanceof c9.f2
            if (r0 != 0) goto L8
            goto L22
        L8:
            c9.f2 r3 = (c9.f2) r3
            boolean r0 = r2.f1191a
            boolean r1 = r3.f1191a
            if (r0 == r1) goto L11
            goto L22
        L11:
            int r0 = r2.f1192b
            int r1 = r3.f1192b
            if (r0 == r1) goto L18
            goto L22
        L18:
            java.lang.String r0 = r2.f1193c
            java.lang.String r3 = r3.f1193c
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L24
        L22:
            r3 = 0
            return r3
        L24:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f1191a
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f1192b
            int r0 = eh.a.e(r2, r0, r1)
            java.lang.String r1 = r3.f1193c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ImportResult(success="
            r0.<init>(r1)
            boolean r1 = r3.f1191a
            r0.append(r1)
            java.lang.String r1 = ", groupCount="
            r0.append(r1)
            int r1 = r3.f1192b
            r0.append(r1)
            java.lang.String r1 = ", message="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r3.f1193c
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
