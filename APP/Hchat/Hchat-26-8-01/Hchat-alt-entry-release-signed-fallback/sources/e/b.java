package e;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends e.e implements java.util.Iterator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e.c f2268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e.c f2269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2270i;

    public b(e.c r1, e.c r2, int r3) {
            r0 = this;
            r0.f2270i = r3
            r0.<init>()
            r0.f2268g = r2
            r0.f2269h = r1
            return
    }

    @Override // e.e
    public final void a(e.c r4) {
            r3 = this;
            e.c r0 = r3.f2268g
            r1 = 0
            if (r0 != r4) goto Ld
            e.c r0 = r3.f2269h
            if (r4 != r0) goto Ld
            r3.f2269h = r1
            r3.f2268g = r1
        Ld:
            e.c r0 = r3.f2268g
            if (r0 != r4) goto L1d
            int r2 = r3.f2270i
            switch(r2) {
                case 0: goto L19;
                default: goto L16;
            }
        L16:
            e.c r0 = r0.f2273i
            goto L1b
        L19:
            e.c r0 = r0.f2274j
        L1b:
            r3.f2268g = r0
        L1d:
            e.c r0 = r3.f2269h
            if (r0 != r4) goto L2e
            e.c r4 = r3.f2268g
            if (r0 == r4) goto L2c
            if (r4 != 0) goto L28
            goto L2c
        L28:
            e.c r1 = r3.b(r0)
        L2c:
            r3.f2269h = r1
        L2e:
            return
    }

    public final e.c b(e.c r2) {
            r1 = this;
            int r0 = r1.f2270i
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            e.c r2 = r2.f2274j
            return r2
        L8:
            e.c r2 = r2.f2273i
            return r2
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            e.c r0 = r1.f2269h
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            e.c r0 = r2.f2269h
            e.c r1 = r2.f2268g
            if (r0 == r1) goto Le
            if (r1 != 0) goto L9
            goto Le
        L9:
            e.c r1 = r2.b(r0)
            goto Lf
        Le:
            r1 = 0
        Lf:
            r2.f2269h = r1
            return r0
    }
}
