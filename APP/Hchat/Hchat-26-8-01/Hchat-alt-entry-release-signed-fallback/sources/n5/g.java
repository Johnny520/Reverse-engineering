package n5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends i5.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k5.u f9026j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f9027k;

    public g(k5.u r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f9026j = r1
            r0.f9027k = r2
            return
    }

    @Override // a.a, v5.b
    public final void a() {
            r3 = this;
            int r0 = r3.f9027k
            if (r0 < 0) goto Lf
            k5.u r1 = r3.f9026j
            k5.s r1 = r1.f7281s
            k5.u r1 = r1.f7262h
            int r1 = r1.f7268f
            if (r0 >= r1) goto Lf
            return
        Lf:
            v5.a r1 = new v5.a
            java.lang.String r2 = "type@"
            java.lang.String r0 = eh.a.l(r0, r2)
            r1.<init>(r0)
            throw r1
    }

    @Override // v5.c
    public final java.lang.String getType() {
            r2 = this;
            k5.u r0 = r2.f9026j
            k5.s r0 = r0.f7281s
            int r1 = r2.f9027k
            java.lang.String r0 = r0.b(r1)
            return r0
    }
}
