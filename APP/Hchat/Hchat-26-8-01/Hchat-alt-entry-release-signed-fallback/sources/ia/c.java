package ia;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f6558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f6559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f6560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.List f6561d;

    public /* synthetic */ c(int r3, java.util.List r4, java.util.List r5) {
            r2 = this;
            r0 = r3 & 1
            tf.t r1 = tf.t.f13167g
            if (r0 == 0) goto L7
            r4 = r1
        L7:
            r3 = r3 & 2
            if (r3 == 0) goto Lc
            r5 = r1
        Lc:
            r2.<init>(r4, r5, r1, r1)
            return
    }

    public c(java.util.List r1, java.util.List r2, java.util.List r3, java.util.List r4) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.f6558a = r1
            r0.f6559b = r2
            r0.f6560c = r3
            r0.f6561d = r4
            return
    }

    public static ia.c a(java.util.List r1, java.util.List r2, java.util.List r3, java.util.List r4) {
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            ia.c r0 = new ia.c
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static /* synthetic */ ia.c b(ia.c r1, java.util.List r2, java.util.List r3, java.util.ArrayList r4, java.util.ArrayList r5, int r6) {
            r0 = r6 & 1
            if (r0 == 0) goto L6
            java.util.List r2 = r1.f6558a
        L6:
            r0 = r6 & 2
            if (r0 == 0) goto Lc
            java.util.List r3 = r1.f6559b
        Lc:
            r0 = r6 & 4
            if (r0 == 0) goto L12
            java.util.List r4 = r1.f6560c
        L12:
            r6 = r6 & 8
            if (r6 == 0) goto L18
            java.util.List r5 = r1.f6561d
        L18:
            ia.c r1 = a(r2, r3, r4, r5)
            return r1
    }

    public final boolean c() {
            r1 = this;
            java.util.List r0 = r1.f6558a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L22
            java.util.List r0 = r1.f6559b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L22
            java.util.List r0 = r1.f6560c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L22
            java.util.List r0 = r1.f6561d
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L22
            r0 = 1
            return r0
        L22:
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof ia.c
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ia.c r5 = (ia.c) r5
            java.util.List r1 = r4.f6558a
            java.util.List r3 = r5.f6558a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.List r1 = r4.f6559b
            java.util.List r3 = r5.f6559b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.util.List r1 = r4.f6560c
            java.util.List r3 = r5.f6560c
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.util.List r1 = r4.f6561d
            java.util.List r5 = r5.f6561d
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L38
            return r2
        L38:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.util.List r0 = r3.f6558a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.util.List r2 = r3.f6559b
            int r0 = j8.b.e(r2, r0, r1)
            java.util.List r2 = r3.f6560c
            int r0 = j8.b.e(r2, r0, r1)
            java.util.List r1 = r3.f6561d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FakeSnsInteraction(likes="
            r0.<init>(r1)
            java.util.List r1 = r2.f6558a
            r0.append(r1)
            java.lang.String r1 = ", comments="
            r0.append(r1)
            java.util.List r1 = r2.f6559b
            r0.append(r1)
            java.lang.String r1 = ", pendingLikes="
            r0.append(r1)
            java.util.List r1 = r2.f6560c
            r0.append(r1)
            java.lang.String r1 = ", pendingComments="
            r0.append(r1)
            java.util.List r1 = r2.f6561d
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
