package r9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f11787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11788b;

    public r(java.lang.ref.WeakReference r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f11787a = r1
            r0.f11788b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof r9.r
            if (r0 != 0) goto L8
            goto L1b
        L8:
            r9.r r3 = (r9.r) r3
            java.lang.ref.WeakReference r0 = r2.f11787a
            java.lang.ref.WeakReference r1 = r3.f11787a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1b
        L15:
            boolean r0 = r2.f11788b
            boolean r3 = r3.f11788b
            if (r0 == r3) goto L1d
        L1b:
            r3 = 0
            return r3
        L1d:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            java.lang.ref.WeakReference r0 = r2.f11787a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            boolean r1 = r2.f11788b
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AvatarDetailsClipState(view="
            r0.<init>(r1)
            java.lang.ref.WeakReference r1 = r2.f11787a
            r0.append(r1)
            java.lang.String r1 = ", originalClipChildren="
            r0.append(r1)
            boolean r1 = r2.f11788b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
