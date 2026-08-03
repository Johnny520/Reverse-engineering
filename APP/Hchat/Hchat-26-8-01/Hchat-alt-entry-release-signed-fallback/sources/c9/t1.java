package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c9.s1 f1376c;

    public t1(int r1, int r2, c9.s1 r3) {
            r0 = this;
            r0.<init>()
            r0.f1374a = r1
            r0.f1375b = r2
            r0.f1376c = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof c9.t1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            c9.t1 r5 = (c9.t1) r5
            int r1 = r4.f1374a
            int r3 = r5.f1374a
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r4.f1375b
            int r3 = r5.f1375b
            if (r1 == r3) goto L1a
            return r2
        L1a:
            c9.s1 r1 = r4.f1376c
            c9.s1 r5 = r5.f1376c
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L25
            return r2
        L25:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f1374a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f1375b
            int r0 = eh.a.e(r2, r0, r1)
            c9.s1 r1 = r3.f1376c
            if (r1 != 0) goto L15
            r1 = 0
            goto L19
        L15:
            int r1 = r1.hashCode()
        L19:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", unreadCount="
            java.lang.String r1 = ", latest="
            int r2 = r5.f1374a
            int r3 = r5.f1375b
            java.lang.String r4 = "GroupSnapshot(totalConversations="
            java.lang.StringBuilder r0 = eh.a.s(r2, r3, r4, r0, r1)
            c9.s1 r1 = r5.f1376c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
