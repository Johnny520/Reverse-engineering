package u4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements java.lang.Comparable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v4.c0 f13393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v4.c0 f13394h;

    public k(v4.c0 r1, v4.c0 r2) {
            r0 = this;
            r0.<init>()
            r0.f13393g = r1
            r0.f13394h = r2
            return
    }

    public final int a(u4.k r6) {
            r5 = this;
            v4.c0 r0 = r6.f13393g
            r1 = 1
            r2 = -1
            r3 = 0
            v4.c0 r4 = r5.f13393g
            if (r4 != r0) goto Lb
            r0 = r3
            goto L17
        Lb:
            if (r4 != 0) goto Lf
            r0 = r2
            goto L17
        Lf:
            if (r0 != 0) goto L13
            r0 = r1
            goto L17
        L13:
            int r0 = r4.d(r0)
        L17:
            if (r0 == 0) goto L1a
            return r0
        L1a:
            v4.c0 r6 = r6.f13394h
            v4.c0 r0 = r5.f13394h
            if (r0 != r6) goto L21
            return r3
        L21:
            if (r0 != 0) goto L24
            return r2
        L24:
            if (r6 != 0) goto L27
            return r1
        L27:
            int r6 = r0.d(r6)
            return r6
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            u4.k r1 = (u4.k) r1
            int r1 = r0.a(r1)
            return r1
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof u4.k
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            u4.k r3 = (u4.k) r3
            int r3 = r2.a(r3)
            if (r3 != 0) goto L10
            r3 = 1
            return r3
        L10:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            v4.c0 r1 = r3.f13393g
            if (r1 != 0) goto L7
            r1 = r0
            goto Ld
        L7:
            java.lang.String r1 = r1.f14067g
            int r1 = r1.hashCode()
        Ld:
            int r1 = r1 * 31
            v4.c0 r2 = r3.f13394h
            if (r2 != 0) goto L14
            goto L1a
        L14:
            java.lang.String r0 = r2.f14067g
            int r0 = r0.hashCode()
        L1a:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            v4.c0 r0 = r5.f13394h
            v4.c0 r1 = r5.f13393g
            if (r1 == 0) goto Ld
            if (r0 != 0) goto Ld
            java.lang.String r0 = r1.l()
            return r0
        Ld:
            java.lang.String r2 = ""
            if (r1 != 0) goto L14
            if (r0 != 0) goto L14
            return r2
        L14:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "["
            r3.<init>(r4)
            if (r1 != 0) goto L1f
            r1 = r2
            goto L23
        L1f:
            java.lang.String r1 = r1.l()
        L23:
            r3.append(r1)
            java.lang.String r1 = "|"
            r3.append(r1)
            if (r0 != 0) goto L2e
            goto L32
        L2e:
            java.lang.String r2 = r0.l()
        L32:
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            return r0
    }
}
