package i2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f6253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f6256d;

    public /* synthetic */ c(i2.b r2, int r3, int r4, int r5) {
            r1 = this;
            r0 = r5 & 4
            if (r0 == 0) goto L6
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
        L6:
            r5 = r5 & 8
            if (r5 == 0) goto Ld
            java.lang.String r5 = ""
            goto Lf
        Ld:
            java.lang.String r5 = "md_link"
        Lf:
            r1.<init>(r5, r3, r4, r2)
            return
    }

    public c(java.lang.String r1, int r2, int r3, java.lang.Object r4) {
            r0 = this;
            r0.<init>()
            r0.f6253a = r4
            r0.f6254b = r2
            r0.f6255c = r3
            r0.f6256d = r1
            return
    }

    public final i2.e a(int r5) {
            r4 = this;
            int r0 = r4.f6255c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r1) goto L7
            goto L8
        L7:
            r5 = r0
        L8:
            if (r5 == r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 != 0) goto L14
            java.lang.String r0 = "Item.end should be set first"
            o2.a.b(r0)
        L14:
            i2.e r0 = new i2.e
            int r1 = r4.f6254b
            java.lang.String r2 = r4.f6256d
            java.lang.Object r3 = r4.f6253a
            r0.<init>(r2, r1, r5, r3)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof i2.c
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            i2.c r5 = (i2.c) r5
            java.lang.Object r1 = r4.f6253a
            java.lang.Object r3 = r5.f6253a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r4.f6254b
            int r3 = r5.f6254b
            if (r1 == r3) goto L1e
            return r2
        L1e:
            int r1 = r4.f6255c
            int r3 = r5.f6255c
            if (r1 == r3) goto L25
            return r2
        L25:
            java.lang.String r1 = r4.f6256d
            java.lang.String r5 = r5.f6256d
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L30
            return r2
        L30:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Object r0 = r3.f6253a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f6254b
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r3.f6255c
            int r0 = eh.a.e(r2, r0, r1)
            java.lang.String r1 = r3.f6256d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MutableRange(item="
            r0.<init>(r1)
            java.lang.Object r1 = r3.f6253a
            r0.append(r1)
            java.lang.String r1 = ", start="
            r0.append(r1)
            int r1 = r3.f6254b
            r0.append(r1)
            java.lang.String r1 = ", end="
            r0.append(r1)
            int r1 = r3.f6255c
            r0.append(r1)
            java.lang.String r1 = ", tag="
            r0.append(r1)
            java.lang.String r1 = r3.f6256d
            r2 = 41
            java.lang.String r0 = eh.a.q(r0, r1, r2)
            return r0
    }
}
