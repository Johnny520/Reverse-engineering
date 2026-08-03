package k5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends i5.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k5.u f7302j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k5.o f7303k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f7304l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f7305m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f7306n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f7307o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f7308p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f7309q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f7310r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7311s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f7312t;

    public z(k5.u r2, a5.a r3, k5.o r4, int r5, o5.c r6, o5.c r7, int r8) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f7312t = r0
            r1.f7302j = r2
            r1.f7303k = r4
            r2 = 1
            int r2 = r3.o(r2)
            int r2 = r2 + r5
            r1.f7309q = r2
            r4 = 0
            int r5 = r3.o(r4)
            r1.f7304l = r5
            int r3 = r3.o(r4)
            r1.f7305m = r3
            r1.f7308p = r8
            int r3 = r6.seekTo(r2)
            r1.f7307o = r3
            int r2 = r7.seekTo(r2)
            r1.f7306n = r2
            return
    }

    @Override // i5.b
    public final java.lang.String f1() {
            r1 = this;
            k5.o r0 = r1.f7303k
            java.lang.String r0 = r0.getType()
            return r0
    }

    @Override // i5.b
    public final java.util.List g1() {
            r4 = this;
            int r0 = r4.f7312t
            r1 = -1
            k5.u r2 = r4.f7302j
            if (r0 != r1) goto L35
            androidx.lifecycle.x r0 = r2.f7263a
            int r1 = r4.f7311s
            if (r1 != 0) goto L2b
            int r1 = r4.f7310r
            if (r1 != 0) goto L1b
            k5.p r1 = r2.f7283u
            int r3 = r4.f7309q
            int r1 = r1.b(r3)
            r4.f7310r = r1
        L1b:
            int r1 = r4.f7310r
            int r1 = r1 + 2
            int r1 = r0.P(r1)
            k5.p r3 = r2.f7284v
            int r1 = r3.b(r1)
            r4.f7311s = r1
        L2b:
            int r1 = r4.f7311s
            int r1 = r1 + 8
            int r0 = r0.N(r1)
            r4.f7312t = r0
        L35:
            int r0 = r4.f7312t
            if (r0 <= 0) goto L48
            androidx.lifecycle.x r1 = r2.f7264b
            int r1 = r1.N(r0)
            int r0 = r0 + 4
            k5.y r2 = new k5.y
            r3 = 0
            r2.<init>(r4, r0, r1, r3)
            return r2
        L48:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    @Override // i5.b
    public final java.lang.String getName() {
            r4 = this;
            k5.u r0 = r4.f7302j
            k5.s r1 = r0.f7280r
            androidx.lifecycle.x r2 = r0.f7263a
            int r3 = r4.f7310r
            if (r3 != 0) goto L14
            k5.p r0 = r0.f7283u
            int r3 = r4.f7309q
            int r0 = r0.b(r3)
            r4.f7310r = r0
        L14:
            int r0 = r4.f7310r
            int r0 = r0 + 4
            int r0 = r2.N(r0)
            java.lang.String r0 = r1.b(r0)
            return r0
    }

    @Override // i5.b
    public final java.lang.String h1() {
            r5 = this;
            k5.u r0 = r5.f7302j
            k5.s r1 = r0.f7281s
            androidx.lifecycle.x r2 = r0.f7263a
            int r3 = r5.f7311s
            if (r3 != 0) goto L28
            int r3 = r5.f7310r
            if (r3 != 0) goto L18
            k5.p r3 = r0.f7283u
            int r4 = r5.f7309q
            int r3 = r3.b(r4)
            r5.f7310r = r3
        L18:
            int r3 = r5.f7310r
            int r3 = r3 + 2
            int r3 = r2.P(r3)
            k5.p r0 = r0.f7284v
            int r0 = r0.b(r3)
            r5.f7311s = r0
        L28:
            int r0 = r5.f7311s
            int r0 = r0 + 4
            int r0 = r2.N(r0)
            java.lang.String r0 = r1.b(r0)
            return r0
    }

    public final ac.k i1() {
            r3 = this;
            int r0 = r3.f7305m
            if (r0 <= 0) goto Lc
            ac.k r1 = new ac.k
            k5.u r2 = r3.f7302j
            r1.<init>(r2, r3, r0)
            return r1
        Lc:
            r0 = 0
            return r0
    }

    public final java.util.List j1() {
            r4 = this;
            int r0 = r4.f7312t
            r1 = -1
            if (r0 != r1) goto L35
            k5.u r0 = r4.f7302j
            androidx.lifecycle.x r1 = r0.f7263a
            int r2 = r4.f7311s
            if (r2 != 0) goto L2b
            int r2 = r4.f7310r
            if (r2 != 0) goto L1b
            k5.p r2 = r0.f7283u
            int r3 = r4.f7309q
            int r2 = r2.b(r3)
            r4.f7310r = r2
        L1b:
            int r2 = r4.f7310r
            int r2 = r2 + 2
            int r2 = r1.P(r2)
            k5.p r0 = r0.f7284v
            int r0 = r0.b(r2)
            r4.f7311s = r0
        L2b:
            int r0 = r4.f7311s
            int r0 = r0 + 8
            int r0 = r1.N(r0)
            r4.f7312t = r0
        L35:
            int r0 = r4.f7312t
            if (r0 <= 0) goto L43
            java.util.List r0 = r4.g1()
            k5.x r1 = new k5.x
            r1.<init>(r4, r0)
            return r1
        L43:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }
}
