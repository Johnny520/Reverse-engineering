package u4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u4.t f13515d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v4.c0 f13516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13518c;

    static {
            u4.t r0 = new u4.t
            r1 = 0
            r2 = -1
            r0.<init>(r1, r2, r2)
            u4.t.f13515d = r0
            return
    }

    public t(v4.c0 r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            r0 = -1
            if (r3 < r0) goto L16
            if (r4 < r0) goto Lf
            r1.f13516a = r2
            r1.f13517b = r3
            r1.f13518c = r4
            return
        Lf:
            java.lang.String r2 = "line < -1"
            j8.o.t(r2)
            r2 = 0
            throw r2
        L16:
            java.lang.String r2 = "address < -1"
            j8.o.t(r2)
            r2 = 0
            throw r2
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof u4.t
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r0 = 1
            if (r4 != r5) goto La
            return r0
        La:
            u4.t r5 = (u4.t) r5
            int r2 = r4.f13517b
            int r3 = r5.f13517b
            if (r2 != r3) goto L27
            int r2 = r4.f13518c
            int r3 = r5.f13518c
            if (r2 != r3) goto L27
            v4.c0 r5 = r5.f13516a
            v4.c0 r2 = r4.f13516a
            if (r2 == r5) goto L26
            if (r2 == 0) goto L27
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L27
        L26:
            return r0
        L27:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            v4.c0 r0 = r2.f13516a
            java.lang.String r0 = r0.f14067g
            int r0 = r0.hashCode()
            int r1 = r2.f13517b
            int r0 = r0 + r1
            int r1 = r2.f13518c
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 50
            r0.<init>(r1)
            v4.c0 r1 = r2.f13516a
            if (r1 == 0) goto L17
            java.lang.String r1 = r1.a()
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
        L17:
            int r1 = r2.f13518c
            if (r1 < 0) goto L1e
            r0.append(r1)
        L1e:
            r1 = 64
            r0.append(r1)
            int r1 = r2.f13517b
            if (r1 >= 0) goto L2d
            java.lang.String r1 = "????"
            r0.append(r1)
            goto L34
        L2d:
            java.lang.String r1 = a.a.X0(r1)
            r0.append(r1)
        L34:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
