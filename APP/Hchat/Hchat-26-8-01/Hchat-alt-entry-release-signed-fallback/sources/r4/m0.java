package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements z4.k, java.lang.Comparable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v4.y f11448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r4.v0 f11449h;

    public m0(v4.y r6, t4.c r7, r4.p r8) {
            r5 = this;
            r5.<init>()
            r5.f11448g = r6
            java.lang.Object[] r6 = r7.f22543h
            int r6 = r6.length
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
            r1 = 0
        Le:
            if (r1 >= r6) goto L29
            java.lang.Object r2 = r7.l(r1)
            t4.b r2 = (t4.b) r2
            r4.b r3 = new r4.b
            r3.<init>(r2, r8)
            r4.c r2 = new r4.c
            r4 = 4
            r2.<init>(r4, r4)
            r2.f11377k = r3
            r0.add(r2)
            int r1 = r1 + 1
            goto Le
        L29:
            r4.v0 r6 = new r4.v0
            r4.b0 r7 = r4.b0.f11368u
            r6.<init>(r7, r0)
            r5.f11449h = r6
            return
    }

    @Override // z4.k
    public final java.lang.String a() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            v4.y r1 = r5.f11448g
            java.lang.String r1 = r1.a()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            r4.v0 r1 = r5.f11449h
            java.util.ArrayList r1 = r1.f11513l
            java.util.Iterator r1 = r1.iterator()
            r2 = 1
        L1c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L39
            java.lang.Object r3 = r1.next()
            r4.c r3 = (r4.c) r3
            if (r2 == 0) goto L2c
            r2 = 0
            goto L31
        L2c:
            java.lang.String r4 = ", "
            r0.append(r4)
        L31:
            java.lang.String r3 = r3.l()
            r0.append(r3)
            goto L1c
        L39:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r2) {
            r1 = this;
            r4.m0 r2 = (r4.m0) r2
            v4.y r0 = r1.f11448g
            v4.y r2 = r2.f11448g
            int r2 = r0.d(r2)
            return r2
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof r4.m0
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            r4.m0 r2 = (r4.m0) r2
            v4.y r2 = r2.f11448g
            v4.y r0 = r1.f11448g
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            v4.y r0 = r1.f11448g
            int r0 = r0.hashCode()
            return r0
    }
}
