package n2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2.g f8976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i2.m0 f8978c;

    public s(int r2, java.lang.String r3, long r4) {
            r1 = this;
            r0 = r2 & 1
            if (r0 == 0) goto L6
            java.lang.String r3 = ""
        L6:
            r2 = r2 & 2
            if (r2 == 0) goto Lc
            long r4 = i2.m0.f6358b
        Lc:
            i2.g r2 = new i2.g
            r2.<init>(r3)
            r3 = 0
            r1.<init>(r2, r4, r3)
            return
    }

    public s(i2.g r2, long r3, i2.m0 r5) {
            r1 = this;
            r1.<init>()
            r1.f8976a = r2
            java.lang.String r0 = r2.f6314h
            int r0 = r0.length()
            long r3 = i2.e0.c(r0, r3)
            r1.f8977b = r3
            if (r5 == 0) goto L25
            long r3 = r5.f6360a
            java.lang.String r2 = r2.f6314h
            int r2 = r2.length()
            long r2 = i2.e0.c(r2, r3)
            i2.m0 r4 = new i2.m0
            r4.<init>(r2)
            goto L26
        L25:
            r4 = 0
        L26:
            r1.f8978c = r4
            return
    }

    public static n2.s a(n2.s r1, i2.g r2, long r3, int r5) {
            r0 = r5 & 1
            if (r0 == 0) goto L6
            i2.g r2 = r1.f8976a
        L6:
            r0 = r5 & 2
            if (r0 == 0) goto Lc
            long r3 = r1.f8977b
        Lc:
            r5 = r5 & 4
            if (r5 == 0) goto L13
            i2.m0 r5 = r1.f8978c
            goto L14
        L13:
            r5 = 0
        L14:
            r1.getClass()
            n2.s r1 = new n2.s
            r1.<init>(r2, r3, r5)
            return r1
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof n2.s
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            n2.s r8 = (n2.s) r8
            long r3 = r8.f8977b
            long r5 = r7.f8977b
            boolean r1 = i2.m0.b(r5, r3)
            if (r1 == 0) goto L2b
            i2.m0 r1 = r7.f8978c
            i2.m0 r3 = r8.f8978c
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L2b
            i2.g r1 = r7.f8976a
            i2.g r8 = r8.f8976a
            boolean r8 = gg.l.a(r1, r8)
            if (r8 == 0) goto L2b
            return r0
        L2b:
            return r2
    }

    public final int hashCode() {
            r4 = this;
            i2.g r0 = r4.f8976a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = i2.m0.f6359c
            long r2 = r4.f8977b
            int r0 = eh.a.f(r0, r1, r2)
            i2.m0 r1 = r4.f8978c
            if (r1 == 0) goto L1c
            long r1 = r1.f6360a
            int r1 = java.lang.Long.hashCode(r1)
            goto L1d
        L1c:
            r1 = 0
        L1d:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TextFieldValue(text='"
            r0.<init>(r1)
            i2.g r1 = r3.f8976a
            r0.append(r1)
            java.lang.String r1 = "', selection="
            r0.append(r1)
            long r1 = r3.f8977b
            java.lang.String r1 = i2.m0.h(r1)
            r0.append(r1)
            java.lang.String r1 = ", composition="
            r0.append(r1)
            i2.m0 r1 = r3.f8978c
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
