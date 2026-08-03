package r9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Class f11805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f11806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f11807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f11808d;

    public w(java.lang.Class r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>()
            r0.f11805a = r1
            r0.f11806b = r2
            r0.f11807c = r3
            r0.f11808d = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L37
        L3:
            boolean r0 = r3 instanceof r9.w
            if (r0 != 0) goto L8
            goto L35
        L8:
            r9.w r3 = (r9.w) r3
            java.lang.Class r0 = r2.f11805a
            java.lang.Class r1 = r3.f11805a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L35
        L15:
            java.lang.String r0 = r2.f11806b
            java.lang.String r1 = r3.f11806b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L35
        L20:
            java.lang.String r0 = r2.f11807c
            java.lang.String r1 = r3.f11807c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L35
        L2b:
            java.lang.String r0 = r2.f11808d
            java.lang.String r3 = r3.f11808d
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
            java.lang.Class r0 = r3.f11805a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f11806b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f11807c
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r1 = r3.f11808d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MessageAccessorKey(type="
            r0.<init>(r1)
            java.lang.Class r1 = r5.f11805a
            r0.append(r1)
            java.lang.String r1 = ", getter="
            r0.append(r1)
            java.lang.String r1 = r5.f11806b
            r0.append(r1)
            java.lang.String r1 = ", primaryField="
            r0.append(r1)
            java.lang.String r1 = ", fallbackField="
            java.lang.String r2 = ")"
            java.lang.String r3 = r5.f11807c
            java.lang.String r4 = r5.f11808d
            java.lang.String r0 = j8.b.k(r0, r3, r1, r4, r2)
            return r0
    }
}
