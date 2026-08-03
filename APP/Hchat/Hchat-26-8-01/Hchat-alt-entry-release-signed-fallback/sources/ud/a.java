package ud;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends md.e implements ud.h, java.lang.Comparable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f13671i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13672j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f13673k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.util.ArrayList f13674l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public java.util.List f13675m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public java.util.List f13676n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public java.util.List f13677o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public java.util.BitSet f13678p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public java.util.BitSet f13679q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public java.util.BitSet f13680r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ud.a f13681s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ud.a f13682t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public java.util.List f13683u;

    public a(int r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            r2.f13674l = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
            r2.f13675m = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r2.f13676n = r0
            xe.g r0 = xe.g.f21560g
            r2.f13678p = r0
            r2.f13679q = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 3
            r0.<init>(r1)
            r2.f13683u = r0
            r2.f13671i = r3
            r2.f13672j = r4
            r2.f13673k = r5
            return
    }

    public final void H() {
            r5 = this;
            java.util.List r0 = r5.f13676n
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L9
            goto L64
        L9:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Iterator r2 = r0.iterator()
        L16:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2c
            java.lang.Object r3 = r2.next()
            ud.a r3 = (ud.a) r3
            boolean r4 = a.a.q0(r3)
            if (r4 == 0) goto L16
            r1.add(r3)
            goto L16
        L2c:
            md.a r2 = md.a.f8829l
            md.f r3 = r5.f8877g
            boolean r2 = r3.a(r2)
            if (r2 == 0) goto L54
            md.b r2 = md.b.f8871z
            md.f r3 = r5.f8877g
            java.util.List r2 = r3.d(r2)
            java.util.Iterator r2 = r2.iterator()
        L42:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L54
            java.lang.Object r3 = r2.next()
            nd.t r3 = (nd.t) r3
            ud.a r3 = r3.f9392a
            r1.add(r3)
            goto L42
        L54:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L5b
            goto L64
        L5b:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r0)
            r2.removeAll(r1)
            r0 = r2
        L64:
            r5.f13677o = r0
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r2) {
            r1 = this;
            ud.a r2 = (ud.a) r2
            int r0 = r1.f13671i
            int r2 = r2.f13671i
            int r2 = java.lang.Integer.compare(r0, r2)
            return r2
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof ud.a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ud.a r4 = (ud.a) r4
            int r1 = r3.f13671i
            int r4 = r4.f13671i
            if (r1 != r4) goto L13
            return r0
        L13:
            return r2
    }

    @Override // ud.h
    public final java.util.List g() {
            r1 = this;
            java.util.ArrayList r0 = r1.f13674l
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f13671i
            return r0
    }

    @Override // ud.j
    public final java.lang.String k() {
            r1 = this;
            int r0 = r1.f13671i
            java.lang.String r0 = java.lang.Integer.toString(r0)
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            int r0 = r3.f13673k
            java.lang.String r0 = xe.m.d(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "B:"
            r1.<init>(r2)
            int r2 = r3.f13671i
            r1.append(r2)
            java.lang.String r2 = ":"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
