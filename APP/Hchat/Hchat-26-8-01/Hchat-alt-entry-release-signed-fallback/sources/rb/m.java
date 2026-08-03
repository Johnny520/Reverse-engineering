package rb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f11931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f11932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.List f11935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.List f11936h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f11937i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f11938j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f11939k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f11940l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f11941m;

    public m(boolean r1, boolean r2, java.lang.String r3, java.lang.String r4, int r5, int r6, java.util.List r7, java.util.List r8, boolean r9, int r10, int r11, int r12, int r13) {
            r0 = this;
            r3.getClass()
            r4.getClass()
            r7.getClass()
            r8.getClass()
            r0.<init>()
            r0.f11929a = r1
            r0.f11930b = r2
            r0.f11931c = r3
            r0.f11932d = r4
            r0.f11933e = r5
            r0.f11934f = r6
            r0.f11935g = r7
            r0.f11936h = r8
            r0.f11937i = r9
            r0.f11938j = r10
            r0.f11939k = r11
            r0.f11940l = r12
            r0.f11941m = r13
            return
    }

    public final int a() {
            r5 = this;
            r0 = 0
            java.util.List r1 = r5.f11935g
            if (r1 == 0) goto Lc
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto Lc
            return r0
        Lc:
            java.util.Iterator r1 = r1.iterator()
            r2 = r0
        L11:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r1.next()
            rb.d r3 = (rb.d) r3
            rb.e r3 = r3.f11883c
            rb.e r4 = rb.e.f11886h
            if (r3 != r4) goto L25
            r3 = 1
            goto L26
        L25:
            r3 = r0
        L26:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L11
            int r2 = r2 + 1
            if (r2 < 0) goto L35
            goto L11
        L35:
            a.a.P0()
            r0 = 0
            throw r0
        L3a:
            return r2
    }

    public final int b() {
            r5 = this;
            r0 = 0
            java.util.List r1 = r5.f11935g
            if (r1 == 0) goto Lc
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto Lc
            return r0
        Lc:
            java.util.Iterator r1 = r1.iterator()
            r2 = r0
        L11:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r1.next()
            rb.d r3 = (rb.d) r3
            rb.e r3 = r3.f11883c
            rb.e r4 = rb.e.f11887i
            if (r3 != r4) goto L25
            r3 = 1
            goto L26
        L25:
            r3 = r0
        L26:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L11
            int r2 = r2 + 1
            if (r2 < 0) goto L35
            goto L11
        L35:
            a.a.P0()
            r0 = 0
            throw r0
        L3a:
            return r2
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            goto L79
        L4:
            boolean r0 = r3 instanceof rb.m
            if (r0 != 0) goto La
            goto L77
        La:
            rb.m r3 = (rb.m) r3
            boolean r0 = r2.f11929a
            boolean r1 = r3.f11929a
            if (r0 == r1) goto L14
            goto L77
        L14:
            boolean r0 = r2.f11930b
            boolean r1 = r3.f11930b
            if (r0 == r1) goto L1b
            goto L77
        L1b:
            java.lang.String r0 = r2.f11931c
            java.lang.String r1 = r3.f11931c
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L26
            goto L77
        L26:
            java.lang.String r0 = r2.f11932d
            java.lang.String r1 = r3.f11932d
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L31
            goto L77
        L31:
            int r0 = r2.f11933e
            int r1 = r3.f11933e
            if (r0 == r1) goto L38
            goto L77
        L38:
            int r0 = r2.f11934f
            int r1 = r3.f11934f
            if (r0 == r1) goto L3f
            goto L77
        L3f:
            java.util.List r0 = r2.f11935g
            java.util.List r1 = r3.f11935g
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L4a
            goto L77
        L4a:
            java.util.List r0 = r2.f11936h
            java.util.List r1 = r3.f11936h
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L55
            goto L77
        L55:
            boolean r0 = r2.f11937i
            boolean r1 = r3.f11937i
            if (r0 == r1) goto L5c
            goto L77
        L5c:
            int r0 = r2.f11938j
            int r1 = r3.f11938j
            if (r0 == r1) goto L63
            goto L77
        L63:
            int r0 = r2.f11939k
            int r1 = r3.f11939k
            if (r0 == r1) goto L6a
            goto L77
        L6a:
            int r0 = r2.f11940l
            int r1 = r3.f11940l
            if (r0 == r1) goto L71
            goto L77
        L71:
            int r0 = r2.f11941m
            int r3 = r3.f11941m
            if (r0 == r3) goto L79
        L77:
            r3 = 0
            return r3
        L79:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f11929a
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.f11930b
            int r0 = eh.a.h(r0, r1, r2)
            java.lang.String r2 = r3.f11931c
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f11932d
            int r0 = eh.a.g(r0, r1, r2)
            int r2 = r3.f11933e
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r3.f11934f
            int r0 = eh.a.e(r2, r0, r1)
            java.util.List r2 = r3.f11935g
            int r0 = j8.b.e(r2, r0, r1)
            java.util.List r2 = r3.f11936h
            int r0 = j8.b.e(r2, r0, r1)
            boolean r2 = r3.f11937i
            int r0 = eh.a.h(r0, r1, r2)
            int r2 = r3.f11938j
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r3.f11939k
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r3.f11940l
            int r0 = eh.a.e(r2, r0, r1)
            int r1 = r3.f11941m
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ZombieCheckSnapshot(ready="
            r0.<init>(r1)
            boolean r1 = r5.f11929a
            r0.append(r1)
            java.lang.String r1 = ", running="
            r0.append(r1)
            boolean r1 = r5.f11930b
            r0.append(r1)
            java.lang.String r1 = ", status="
            r0.append(r1)
            java.lang.String r1 = ", currentName="
            java.lang.String r2 = ", totalCount="
            java.lang.String r3 = r5.f11931c
            java.lang.String r4 = r5.f11932d
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = ", pendingCount="
            java.lang.String r2 = ", results="
            int r3 = r5.f11933e
            int r4 = r5.f11934f
            wb.en.p(r0, r3, r1, r4, r2)
            java.util.List r1 = r5.f11935g
            r0.append(r1)
            java.lang.String r1 = ", logs="
            r0.append(r1)
            java.util.List r1 = r5.f11936h
            r0.append(r1)
            java.lang.String r1 = ", deleting="
            r0.append(r1)
            boolean r1 = r5.f11937i
            r0.append(r1)
            java.lang.String r1 = ", deleteTotalCount="
            r0.append(r1)
            int r1 = r5.f11938j
            r0.append(r1)
            java.lang.String r1 = ", deleteCompletedCount="
            r0.append(r1)
            java.lang.String r1 = ", deleteSuccessCount="
            java.lang.String r2 = ", deleteFailureCount="
            int r3 = r5.f11939k
            int r4 = r5.f11940l
            wb.en.p(r0, r3, r1, r4, r2)
            java.lang.String r1 = ")"
            int r2 = r5.f11941m
            java.lang.String r0 = j8.b.j(r0, r2, r1)
            return r0
    }
}
