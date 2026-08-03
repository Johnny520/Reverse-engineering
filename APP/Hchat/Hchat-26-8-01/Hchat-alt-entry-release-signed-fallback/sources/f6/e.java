package f6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e extends f6.a implements java.util.List, java.util.RandomAccess {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f6.c f3315h = null;

    static {
            f6.c r0 = new f6.c
            f6.f r1 = f6.f.f3316k
            r2 = 0
            r0.<init>(r1, r2)
            f6.e.f3315h = r0
            return
    }

    public static f6.f f(java.lang.Object... r3) {
            int r0 = r3.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L16
            r2 = r3[r1]
            if (r2 == 0) goto Lb
            int r1 = r1 + 1
            goto L2
        Lb:
            java.lang.String r3 = "at index "
            java.lang.String r3 = eh.a.l(r1, r3)
            bsh.j.c(r3)
            r3 = 0
            return r3
        L16:
            int r0 = r3.length
            if (r0 != 0) goto L1c
            f6.f r3 = f6.f.f3316k
            return r3
        L1c:
            f6.f r1 = new f6.f
            r1.<init>(r0, r3)
            return r1
    }

    public static f6.e g(java.util.List r2) {
            boolean r0 = r2 instanceof f6.a
            if (r0 == 0) goto L21
            f6.a r2 = (f6.a) r2
            f6.e r2 = (f6.e) r2
            boolean r0 = r2.e()
            if (r0 == 0) goto L20
            java.lang.Object[] r0 = f6.a.f3304g
            java.lang.Object[] r2 = r2.toArray(r0)
            int r0 = r2.length
            if (r0 != 0) goto L1a
            f6.f r2 = f6.f.f3316k
            return r2
        L1a:
            f6.f r1 = new f6.f
            r1.<init>(r0, r2)
            return r1
        L20:
            return r2
        L21:
            java.lang.Object[] r2 = r2.toArray()
            f6.f r2 = f(r2)
            return r2
    }

    public static f6.e h(k5.b0 r3) {
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto Ld
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.List r3 = (java.util.List) r3
            f6.e r3 = g(r3)
            return r3
        Ld:
            java.util.Iterator r3 = r3.iterator()
            o5.t r3 = (o5.t) r3
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L1c
            f6.f r3 = f6.f.f3316k
            return r3
        L1c:
            java.lang.Object r0 = r3.next()
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L2f
            java.lang.Object[] r3 = new java.lang.Object[]{r0}
            f6.f r3 = f(r3)
            return r3
        L2f:
            f6.b r1 = new f6.b
            r1.<init>()
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1.f3308d = r2
            r2 = 0
            r1.f3307c = r2
            r1.a(r0)
        L3f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4d
            java.lang.Object r0 = r3.next()
            r1.a(r0)
            goto L3f
        L4d:
            r3 = 1
            r1.f3306b = r3
            java.lang.Object r3 = r1.f3308d
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            int r0 = r1.f3307c
            if (r0 != 0) goto L5b
            f6.f r3 = f6.f.f3316k
            return r3
        L5b:
            f6.f r1 = new f6.f
            r1.<init>(r0, r3)
            return r1
    }

    @Override // f6.a
    public int a(java.lang.Object[] r4) {
            r3 = this;
            int r0 = r3.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L10
            java.lang.Object r2 = r3.get(r1)
            r4[r1] = r2
            int r1 = r1 + 1
            goto L5
        L10:
            return r0
    }

    @Override // java.util.List
    public final void add(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List
    public final boolean addAll(int r1, java.util.Collection r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            goto L30
        L4:
            boolean r1 = r7 instanceof java.util.List
            r2 = 0
            if (r1 != 0) goto La
            goto L54
        La:
            java.util.List r7 = (java.util.List) r7
            int r1 = r6.size()
            int r3 = r7.size()
            if (r1 == r3) goto L17
            goto L54
        L17:
            boolean r3 = r7 instanceof java.util.RandomAccess
            if (r3 == 0) goto L31
            r3 = r2
        L1c:
            if (r3 >= r1) goto L30
            java.lang.Object r4 = r6.get(r3)
            java.lang.Object r5 = r7.get(r3)
            boolean r4 = java.util.Objects.equals(r4, r5)
            if (r4 != 0) goto L2d
            goto L54
        L2d:
            int r3 = r3 + 1
            goto L1c
        L30:
            return r0
        L31:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L39:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L55
            boolean r3 = r7.hasNext()
            if (r3 != 0) goto L46
            goto L54
        L46:
            java.lang.Object r3 = r1.next()
            java.lang.Object r4 = r7.next()
            boolean r3 = java.util.Objects.equals(r3, r4)
            if (r3 != 0) goto L39
        L54:
            return r2
        L55:
            boolean r7 = r7.hasNext()
            r7 = r7 ^ r0
            return r7
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
            r4 = this;
            int r0 = r4.size()
            r1 = 1
            r2 = 0
        L6:
            if (r2 >= r0) goto L18
            int r1 = r1 * 31
            java.lang.Object r3 = r4.get(r2)
            int r3 = r3.hashCode()
            int r3 = r3 + r1
            int r1 = ~r3
            int r1 = ~r1
            int r2 = r2 + 1
            goto L6
        L18:
            return r1
    }

    public final f6.c i(int r3) {
            r2 = this;
            int r0 = r2.size()
            if (r3 < 0) goto L17
            if (r3 > r0) goto L17
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L11
            f6.c r3 = f6.e.f3315h
            return r3
        L11:
            f6.c r0 = new f6.c
            r0.<init>(r2, r3)
            return r0
        L17:
            java.lang.String r1 = "index"
            java.lang.String r3 = oh.h.h(r3, r0, r1)
            okio.a.i(r3)
            r3 = 0
            return r3
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object r5) {
            r4 = this;
            r0 = -1
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r4.size()
            r2 = 0
        L9:
            if (r2 >= r1) goto L19
            java.lang.Object r3 = r4.get(r2)
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L16
            return r2
        L16:
            int r2 = r2 + 1
            goto L9
        L19:
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator iterator() {
            r1 = this;
            r0 = 0
            f6.c r0 = r1.i(r0)
            return r0
    }

    public f6.e j(int r2, int r3) {
            r1 = this;
            int r0 = r1.size()
            oh.h.p(r2, r3, r0)
            int r3 = r3 - r2
            int r0 = r1.size()
            if (r3 != r0) goto Lf
            return r1
        Lf:
            if (r3 != 0) goto L14
            f6.f r2 = f6.f.f3316k
            return r2
        L14:
            f6.d r0 = new f6.d
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object r4) {
            r3 = this;
            r0 = -1
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r3.size()
            int r1 = r1 + (-1)
        La:
            if (r1 < 0) goto L1a
            java.lang.Object r2 = r3.get(r1)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L17
            return r1
        L17:
            int r1 = r1 + (-1)
            goto La
        L1a:
            return r0
    }

    public java.util.ListIterator listIterator() {
            r1 = this;
            r0 = 0
            f6.c r0 = r1.i(r0)
            return r0
    }

    public /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int r1) {
            r0 = this;
            f6.c r1 = r0.i(r1)
            return r1
    }

    @Override // java.util.List
    public final java.lang.Object remove(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.List
    public final java.lang.Object set(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    public /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
            r0 = this;
            f6.e r1 = r0.j(r1, r2)
            return r1
    }
}
