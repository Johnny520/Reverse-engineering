package x8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f21379c;

    public w(java.lang.String r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f21377a = r2
            r0.f21378b = r3
            r0.f21379c = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L24
        L3:
            boolean r0 = r3 instanceof x8.w
            if (r0 != 0) goto L8
            goto L22
        L8:
            x8.w r3 = (x8.w) r3
            int r0 = r2.f21377a
            int r1 = r3.f21377a
            if (r0 == r1) goto L11
            goto L22
        L11:
            boolean r0 = r2.f21378b
            boolean r1 = r3.f21378b
            if (r0 == r1) goto L18
            goto L22
        L18:
            java.lang.String r0 = r2.f21379c
            java.lang.String r3 = r3.f21379c
            boolean r3 = r0.equals(r3)
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
            int r0 = r3.f21377a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.f21378b
            int r0 = eh.a.h(r0, r1, r2)
            java.lang.String r1 = r3.f21379c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HttpTextResult(code="
            r0.<init>(r1)
            int r1 = r3.f21377a
            r0.append(r1)
            java.lang.String r1 = ", successful="
            r0.append(r1)
            boolean r1 = r3.f21378b
            r0.append(r1)
            java.lang.String r1 = ", text="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r3.f21379c
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
