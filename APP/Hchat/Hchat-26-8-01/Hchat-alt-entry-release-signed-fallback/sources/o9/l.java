package o9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9645b;

    public l(int r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.f9644a = r1
            r0.f9645b = r2
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof o9.l
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            o9.l r8 = (o9.l) r8
            int r1 = r7.f9644a
            int r3 = r8.f9644a
            if (r1 == r3) goto L13
            return r2
        L13:
            long r3 = r7.f9645b
            long r5 = r8.f9645b
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L1c
            return r2
        L1c:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f9644a
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            long r1 = r3.f9645b
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PendingInviteDetail(count="
            r0.<init>(r1)
            int r1 = r3.f9644a
            r0.append(r1)
            java.lang.String r1 = ", updatedAt="
            r0.append(r1)
            long r1 = r3.f9645b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
