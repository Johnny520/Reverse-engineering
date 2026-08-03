package n5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i5.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k5.u f9014j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f9015k;

    public b(k5.u r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f9014j = r1
            r0.f9015k = r2
            return
    }

    @Override // a.a, v5.b
    public final void a() {
            r3 = this;
            int r0 = r3.f9015k
            if (r0 < 0) goto Lf
            k5.u r1 = r3.f9014j
            k5.p r1 = r1.f7282t
            k5.u r1 = r1.f7256h
            int r1 = r1.f7272j
            if (r0 >= r1) goto Lf
            return
        Lf:
            v5.a r1 = new v5.a
            java.lang.String r2 = "field@"
            java.lang.String r0 = eh.a.l(r0, r2)
            r1.<init>(r0)
            throw r1
    }

    @Override // i5.a
    public final java.lang.String f1() {
            r4 = this;
            k5.u r0 = r4.f9014j
            k5.s r1 = r0.f7281s
            androidx.lifecycle.x r2 = r0.f7263a
            k5.p r0 = r0.f7282t
            int r3 = r4.f9015k
            int r0 = r0.b(r3)
            int r0 = r2.P(r0)
            java.lang.String r0 = r1.b(r0)
            return r0
    }

    @Override // i5.a
    public final java.lang.String getName() {
            r4 = this;
            k5.u r0 = r4.f9014j
            k5.s r1 = r0.f7280r
            androidx.lifecycle.x r2 = r0.f7263a
            k5.p r0 = r0.f7282t
            int r3 = r4.f9015k
            int r0 = r0.b(r3)
            int r0 = r0 + 4
            int r0 = r2.N(r0)
            java.lang.String r0 = r1.b(r0)
            return r0
    }

    @Override // i5.a
    public final java.lang.String getType() {
            r4 = this;
            k5.u r0 = r4.f9014j
            k5.s r1 = r0.f7281s
            androidx.lifecycle.x r2 = r0.f7263a
            k5.p r0 = r0.f7282t
            int r3 = r4.f9015k
            int r0 = r0.b(r3)
            int r0 = r0 + 2
            int r0 = r2.P(r0)
            java.lang.String r0 = r1.b(r0)
            return r0
    }
}
