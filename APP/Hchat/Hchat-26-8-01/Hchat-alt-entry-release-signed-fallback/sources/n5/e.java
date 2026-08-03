package n5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends i5.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k5.u f9021j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f9022k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9023l;

    public e(k5.u r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f9021j = r1
            r0.f9022k = r2
            return
    }

    @Override // a.a, v5.b
    public final void a() {
            r3 = this;
            int r0 = r3.f9022k
            if (r0 < 0) goto Lf
            k5.u r1 = r3.f9021j
            k5.p r1 = r1.f7283u
            k5.u r1 = r1.f7256h
            int r1 = r1.f7274l
            if (r0 >= r1) goto Lf
            return
        Lf:
            v5.a r1 = new v5.a
            java.lang.String r2 = "method@"
            java.lang.String r0 = eh.a.l(r0, r2)
            r1.<init>(r0)
            throw r1
    }

    @Override // i5.b
    public final java.lang.String f1() {
            r4 = this;
            k5.u r0 = r4.f9021j
            k5.s r1 = r0.f7281s
            androidx.lifecycle.x r2 = r0.f7263a
            k5.p r0 = r0.f7283u
            int r3 = r4.f9022k
            int r0 = r0.b(r3)
            int r0 = r2.P(r0)
            java.lang.String r0 = r1.b(r0)
            return r0
    }

    @Override // i5.b
    public final java.util.List g1() {
            r4 = this;
            int r0 = r4.i1()
            k5.u r1 = r4.f9021j
            androidx.lifecycle.x r2 = r1.f7263a
            int r0 = r0 + 8
            int r0 = r2.N(r0)
            if (r0 <= 0) goto L1f
            androidx.lifecycle.x r1 = r1.f7264b
            int r1 = r1.N(r0)
            int r0 = r0 + 4
            k5.y r2 = new k5.y
            r3 = 2
            r2.<init>(r4, r0, r1, r3)
            return r2
        L1f:
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    @Override // i5.b
    public final java.lang.String getName() {
            r4 = this;
            k5.u r0 = r4.f9021j
            k5.s r1 = r0.f7280r
            androidx.lifecycle.x r2 = r0.f7263a
            k5.p r0 = r0.f7283u
            int r3 = r4.f9022k
            int r0 = r0.b(r3)
            int r0 = r0 + 4
            int r0 = r2.N(r0)
            java.lang.String r0 = r1.b(r0)
            return r0
    }

    @Override // i5.b
    public final java.lang.String h1() {
            r3 = this;
            int r0 = r3.i1()
            k5.u r1 = r3.f9021j
            k5.s r2 = r1.f7281s
            androidx.lifecycle.x r1 = r1.f7263a
            int r0 = r0 + 4
            int r0 = r1.N(r0)
            java.lang.String r0 = r2.b(r0)
            return r0
    }

    public final int i1() {
            r4 = this;
            int r0 = r4.f9023l
            if (r0 != 0) goto L1e
            k5.u r0 = r4.f9021j
            k5.p r1 = r0.f7284v
            androidx.lifecycle.x r2 = r0.f7263a
            k5.p r0 = r0.f7283u
            int r3 = r4.f9022k
            int r0 = r0.b(r3)
            int r0 = r0 + 2
            int r0 = r2.P(r0)
            int r0 = r1.b(r0)
            r4.f9023l = r0
        L1e:
            int r0 = r4.f9023l
            return r0
    }
}
