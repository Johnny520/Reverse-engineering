package s7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends r7.b implements k7.e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r7.g f12377m;

    public i(r7.f r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r1.f12377m = r2
            return
    }

    @Override // r7.b, k7.a
    public final void B(q7.b r2) {
            r1 = this;
            boolean r0 = r1.N()
            if (r0 == 0) goto L9
            super.B(r2)
        L9:
            return
    }

    public final boolean N() {
            r4 = this;
            r7.g r0 = r4.f12377m
            int r0 = r0.get()
            r1 = 0
            if (r0 == 0) goto Lc
            r0 = 8
            goto Ld
        Lc:
            r0 = r1
        Ld:
            r4.M(r0, r1)
            if (r0 == 0) goto L1e
            byte[] r2 = r4.f11553k
        L14:
            if (r1 >= r0) goto L1c
            r3 = -1
            r2[r1] = r3
            int r1 = r1 + 1
            goto L14
        L1c:
            r0 = 1
            return r0
        L1e:
            return r1
    }

    @Override // k7.e
    public final void c() {
            r0 = this;
            r0.N()
            return
    }

    public final java.lang.String toString() {
            r9 = this;
            byte[] r0 = r9.f11553k
            int r1 = r0.length
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r1 * 2
            r2.<init>(r3)
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r1) goto L3f
            r5 = r0[r4]
            int r6 = r5 >> 4
            r6 = r6 & 15
            r7 = 16
            r8 = 10
            if (r6 < 0) goto L25
            if (r6 >= r8) goto L20
            int r6 = r6 + 48
        L1e:
            char r6 = (char) r6
            goto L26
        L20:
            if (r6 > r7) goto L25
            int r6 = r6 + 87
            goto L1e
        L25:
            r6 = r3
        L26:
            r2.append(r6)
            r5 = r5 & 15
            if (r5 < 0) goto L38
            if (r5 >= r8) goto L33
            int r5 = r5 + 48
        L31:
            char r5 = (char) r5
            goto L39
        L33:
            if (r5 > r7) goto L38
            int r5 = r5 + 87
            goto L31
        L38:
            r5 = r3
        L39:
            r2.append(r5)
            int r4 = r4 + 1
            goto Lc
        L3f:
            java.lang.String r0 = r2.toString()
            return r0
    }
}
