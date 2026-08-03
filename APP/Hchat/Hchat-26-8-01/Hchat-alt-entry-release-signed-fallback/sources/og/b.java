package og;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements java.util.Iterator, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9809h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9810i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public lg.d f9811j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f9812k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ og.c f9813l;

    public b(og.c r2) {
            r1 = this;
            r1.<init>()
            r1.f9813l = r2
            r0 = -1
            r1.f9808g = r0
            java.lang.CharSequence r2 = r2.f9814a
            int r2 = r2.length()
            r0 = 0
            int r2 = r9.e0.r(r0, r0, r2)
            r1.f9809h = r2
            r1.f9810i = r2
            return
    }

    public final void a() {
            r8 = this;
            og.c r0 = r8.f9813l
            java.lang.CharSequence r1 = r0.f9814a
            int r2 = r8.f9810i
            r3 = 0
            if (r2 >= 0) goto Lf
            r8.f9808g = r3
            r0 = 0
            r8.f9811j = r0
            return
        Lf:
            int r4 = r0.f9815b
            r5 = -1
            r6 = 1
            if (r4 <= 0) goto L1c
            int r7 = r8.f9812k
            int r7 = r7 + r6
            r8.f9812k = r7
            if (r7 >= r4) goto L22
        L1c:
            int r4 = r1.length()
            if (r2 <= r4) goto L36
        L22:
            lg.d r0 = new lg.d
            int r2 = r8.f9809h
            r1.getClass()
            int r1 = r1.length()
            int r1 = r1 - r6
            r0.<init>(r2, r1, r6)
            r8.f9811j = r0
            r8.f9810i = r5
            goto L7b
        L36:
            fg.p r0 = r0.f9816c
            int r2 = r8.f9810i
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.invoke(r1, r2)
            sf.e r0 = (sf.e) r0
            if (r0 != 0) goto L5a
            lg.d r0 = new lg.d
            int r2 = r8.f9809h
            r1.getClass()
            int r1 = r1.length()
            int r1 = r1 - r6
            r0.<init>(r2, r1, r6)
            r8.f9811j = r0
            r8.f9810i = r5
            goto L7b
        L5a:
            java.lang.Object r1 = r0.f12418g
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.f12419h
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r2 = r8.f9809h
            lg.d r2 = r9.e0.r0(r2, r1)
            r8.f9811j = r2
            int r1 = r1 + r0
            r8.f9809h = r1
            if (r0 != 0) goto L78
            r3 = r6
        L78:
            int r1 = r1 + r3
            r8.f9810i = r1
        L7b:
            r8.f9808g = r6
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.f9808g
            r1 = -1
            if (r0 != r1) goto L8
            r2.a()
        L8:
            int r0 = r2.f9808g
            r1 = 1
            if (r0 != r1) goto Le
            return r1
        Le:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.f9808g
            r1 = -1
            if (r0 != r1) goto L8
            r3.a()
        L8:
            int r0 = r3.f9808g
            if (r0 == 0) goto L17
            lg.d r0 = r3.f9811j
            r0.getClass()
            r2 = 0
            r3.f9811j = r2
            r3.f9808g = r1
            return r0
        L17:
            bsh.j.e()
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
