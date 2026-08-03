package k5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends o5.s {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7235k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f7236l;

    public /* synthetic */ l(java.lang.Object r1, androidx.lifecycle.x r2, int r3, int r4, int r5) {
            r0 = this;
            r0.f7235k = r5
            r0.f7236l = r1
            r0.<init>(r2, r3, r4)
            return
    }

    @Override // o5.s
    public final java.lang.Object a(a5.a r2, int r3) {
            r1 = this;
            int r0 = r1.f7235k
            switch(r0) {
                case 0: goto L22;
                case 1: goto L18;
                case 2: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f7236l
            o5.r r0 = (o5.r) r0
            java.lang.Object r2 = r0.a(r2, r3)
            return r2
        Le:
            r3 = 0
            int r2 = r2.o(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L18:
            r3 = 0
            int r2 = r2.o(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
        L22:
            r3 = 0
            int r2 = r2.o(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            return r2
    }

    @Override // o5.s, java.util.ListIterator, java.util.Iterator
    public java.lang.Object next() {
            r3 = this;
            int r0 = r3.f7235k
            switch(r0) {
                case 0: goto L40;
                case 1: goto L25;
                case 2: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = super.next()
            return r0
        La:
            int r0 = r3.f9545j
            java.lang.Object r1 = r3.f7236l
            k5.n r1 = (k5.n) r1
            java.lang.Object r2 = r1.f7242l
            k5.o r2 = (k5.o) r2
            int r2 = r2.f7252s
            if (r0 != r2) goto L1e
            a5.a r0 = r3.f9542g
            int r0 = r0.f56h
            r1.f7241k = r0
        L1e:
            java.lang.Object r0 = super.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            return r0
        L25:
            int r0 = r3.f9545j
            java.lang.Object r1 = r3.f7236l
            k5.n r1 = (k5.n) r1
            java.lang.Object r2 = r1.f7242l
            k5.o r2 = (k5.o) r2
            int r2 = r2.f7251r
            if (r0 != r2) goto L39
            a5.a r0 = r3.f9542g
            int r0 = r0.f56h
            r1.f7240j = r0
        L39:
            java.lang.Object r0 = super.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            return r0
        L40:
            int r0 = r3.f9545j
            java.lang.Object r1 = r3.f7236l
            k5.n r1 = (k5.n) r1
            java.lang.Object r2 = r1.f7242l
            k5.o r2 = (k5.o) r2
            int r2 = r2.f7250q
            if (r0 != r2) goto L54
            a5.a r0 = r3.f9542g
            int r0 = r0.f56h
            r1.f7239i = r0
        L54:
            java.lang.Object r0 = super.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            return r0
    }
}
