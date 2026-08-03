package lh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements java.io.Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f8058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f8059h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f8060i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final sf.i f8061j;

    public b(java.lang.String r6) {
            r5 = this;
            r6.getClass()
            r5.<init>()
            d1.c0 r0 = new d1.c0
            r1 = 7
            r0.<init>(r5, r1)
            sf.i r1 = new sf.i
            r1.<init>(r0)
            r5.f8061j = r1
            r0 = 6
            java.lang.String r1 = "->"
            r2 = 0
            int r0 = og.m.r0(r6, r1, r2, r2, r0)
            int r1 = r0 + 1
            r3 = 4
            java.lang.String r4 = ":"
            int r1 = og.m.r0(r6, r4, r1, r2, r3)
            r3 = -1
            if (r0 == r3) goto L48
            if (r1 == r3) goto L48
            java.lang.String r2 = r6.substring(r2, r0)
            java.lang.String r2 = kh.b.e(r2)
            r5.f8058g = r2
            int r0 = r0 + 2
            java.lang.String r0 = r6.substring(r0, r1)
            r5.f8059h = r0
            int r1 = r1 + 1
            java.lang.String r6 = r6.substring(r1)
            java.lang.String r6 = kh.b.e(r6)
            r5.f8060i = r6
            return
        L48:
            java.lang.IllegalAccessError r0 = new java.lang.IllegalAccessError
            java.lang.String r1 = "not field descriptor: "
            java.lang.String r6 = r1.concat(r6)
            r0.<init>(r6)
            throw r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof lh.b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            lh.b r5 = (lh.b) r5
            java.lang.String r1 = r5.f8058g
            java.lang.String r3 = r4.f8058g
            boolean r1 = gg.l.a(r3, r1)
            if (r1 == 0) goto L2b
            java.lang.String r1 = r4.f8059h
            java.lang.String r3 = r5.f8059h
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L2b
            java.lang.String r1 = r4.f8060i
            java.lang.String r5 = r5.f8060i
            boolean r5 = gg.l.a(r1, r5)
            if (r5 == 0) goto L2b
            return r0
        L2b:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f8058g
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.f8059h
            int r1 = r1.hashCode()
            int r1 = r1 * 31
            int r1 = r1 + r0
            java.lang.String r0 = r2.f8060i
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.f8058g
            java.lang.String r1 = kh.b.g(r1)
            r0.append(r1)
            java.lang.String r1 = "->"
            r0.append(r1)
            java.lang.String r1 = r2.f8059h
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            sf.i r1 = r2.f8061j
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
