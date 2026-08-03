package a;

/* JADX INFO: renamed from: a.j6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0207j6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f528a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final java.lang.String d;
    public final long e;

    public C0207j6(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, long r6) {
            r1 = this;
            java.lang.String r0 = "matcherInfo"
            a.C0193i9.e(r3, r0)
            java.lang.String r0 = "reason"
            a.C0193i9.e(r4, r0)
            r1.<init>()
            r1.f528a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            r1.e = r6
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof a.C0207j6
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            a.j6 r8 = (a.C0207j6) r8
            java.lang.String r1 = r8.f528a
            java.lang.String r3 = r7.f528a
            boolean r1 = a.C0193i9.a(r3, r1)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r7.b
            java.lang.String r3 = r8.b
            boolean r1 = a.C0193i9.a(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r7.c
            java.lang.String r3 = r8.c
            boolean r1 = a.C0193i9.a(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r7.d
            java.lang.String r3 = r8.d
            boolean r1 = a.C0193i9.a(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            long r3 = r7.e
            long r5 = r8.e
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L41
            return r2
        L41:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f528a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.b
            int r0 = a.C0487z.b(r2, r0, r1)
            java.lang.String r2 = r3.c
            int r0 = a.C0487z.b(r2, r0, r1)
            java.lang.String r2 = r3.d
            int r0 = a.C0487z.b(r2, r0, r1)
            long r1 = r3.e
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FailureReason(type="
            r0.<init>(r1)
            java.lang.String r1 = r3.f528a
            r0.append(r1)
            java.lang.String r1 = ", matcherInfo="
            r0.append(r1)
            java.lang.String r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", reason="
            r0.append(r1)
            java.lang.String r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", stackTrace="
            r0.append(r1)
            java.lang.String r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", timestamp="
            r0.append(r1)
            long r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
