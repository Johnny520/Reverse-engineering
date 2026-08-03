package f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements java.util.Iterator, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f2765i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2766j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2767k;

    public a(int r1) {
            r0 = this;
            r0.<init>()
            r0.f2763g = r1
            return
    }

    public a(f.e r1, int r2) {
            r0 = this;
            r0.f2766j = r2
            switch(r2) {
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            r0.f2767k = r1
            int r1 = r1.f2792i
            r0.<init>(r1)
            return
        Ld:
            r0.f2767k = r1
            int r1 = r1.f2792i
            r0.<init>(r1)
            return
    }

    public a(f.f r2) {
            r1 = this;
            r0 = 2
            r1.f2766j = r0
            r1.f2767k = r2
            int r2 = r2.f2802i
            r1.<init>(r2)
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.f2764h
            int r1 = r2.f2763g
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
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L30
            int r0 = r3.f2764h
            int r1 = r3.f2766j
            switch(r1) {
                case 0: goto L1f;
                case 1: goto L16;
                default: goto Ld;
            }
        Ld:
            java.lang.Object r1 = r3.f2767k
            f.f r1 = (f.f) r1
            java.lang.Object[] r1 = r1.f2801h
            r0 = r1[r0]
            goto L27
        L16:
            java.lang.Object r1 = r3.f2767k
            f.e r1 = (f.e) r1
            java.lang.Object r0 = r1.l(r0)
            goto L27
        L1f:
            java.lang.Object r1 = r3.f2767k
            f.e r1 = (f.e) r1
            java.lang.Object r0 = r1.h(r0)
        L27:
            int r1 = r3.f2764h
            r2 = 1
            int r1 = r1 + r2
            r3.f2764h = r1
            r3.f2765i = r2
            return r0
        L30:
            bsh.j.e()
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            boolean r0 = r2.f2765i
            if (r0 == 0) goto L30
            int r0 = r2.f2764h
            int r0 = r0 + (-1)
            r2.f2764h = r0
            int r1 = r2.f2766j
            switch(r1) {
                case 0: goto L1f;
                case 1: goto L17;
                default: goto Lf;
            }
        Lf:
            java.lang.Object r1 = r2.f2767k
            f.f r1 = (f.f) r1
            r1.a(r0)
            goto L26
        L17:
            java.lang.Object r1 = r2.f2767k
            f.e r1 = (f.e) r1
            r1.j(r0)
            goto L26
        L1f:
            java.lang.Object r1 = r2.f2767k
            f.e r1 = (f.e) r1
            r1.j(r0)
        L26:
            int r0 = r2.f2763g
            int r0 = r0 + (-1)
            r2.f2763g = r0
            r0 = 0
            r2.f2765i = r0
            return
        L30:
            java.lang.String r0 = "Call next() before removing an element."
            j8.o.A(r0)
            return
    }
}
