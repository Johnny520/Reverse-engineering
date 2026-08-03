package o5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements java.util.Iterator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a5.a f9516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f9517h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9518i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f9519j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Iterable f9520k;

    public g(k5.a r2, androidx.lifecycle.x r3, int r4, int r5) {
            r1 = this;
            r0 = 1
            r1.f9519j = r0
            r1.f9520k = r2
            r1.<init>()
            r3.getClass()
            a5.a r2 = new a5.a
            r0 = 5
            r2.<init>(r4, r0, r3)
            r1.f9516g = r2
            r1.f9517h = r5
            return
    }

    public g(o5.h r2, a5.a r3, int r4) {
            r1 = this;
            r0 = 0
            r1.f9519j = r0
            r1.f9520k = r2
            r1.<init>()
            r1.f9516g = r3
            r1.f9517h = r4
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.f9518i
            int r1 = r2.f9517h
            if (r0 >= r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.f9518i
            int r1 = r3.f9517h
            if (r0 >= r1) goto L46
            int r0 = r0 + 1
            r3.f9518i = r0
            int r0 = r3.f9519j
            a5.a r1 = r3.f9516g
            switch(r0) {
                case 0: goto L32;
                default: goto L11;
            }
        L11:
            java.lang.Iterable r0 = r3.f9520k
            k5.a r0 = (k5.a) r0
            int r2 = r0.f7170j
            switch(r2) {
                case 0: goto L26;
                default: goto L1a;
            }
        L1a:
            k5.c r2 = new k5.c
            java.lang.Comparable r0 = r0.f7171k
            p5.a r0 = (p5.a) r0
            k5.u r0 = r0.f10247g
            r2.<init>(r0, r1)
            goto L45
        L26:
            k5.c r2 = new k5.c
            java.lang.Comparable r0 = r0.f7171k
            k5.b r0 = (k5.b) r0
            k5.u r0 = r0.f7173g
            r2.<init>(r0, r1)
            goto L45
        L32:
            java.lang.Iterable r0 = r3.f9520k
            o5.h r0 = (o5.h) r0
            k5.u r0 = r0.f9522g
            k5.s r0 = r0.f7280r
            r2 = 0
            int r1 = r1.o(r2)
            int r1 = r1 + (-1)
            java.lang.String r2 = r0.d(r1)
        L45:
            return r2
        L46:
            bsh.j.e()
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }
}
