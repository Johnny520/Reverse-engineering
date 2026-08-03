package f;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements java.util.ListIterator, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2784g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f2785h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f2786i;

    public c0(java.util.List r1, int r2, int r3) {
            r0 = this;
            r0.f2784g = r3
            switch(r3) {
                case 1: goto Lf;
                default: goto L5;
            }
        L5:
            r0.<init>()
            r0.f2785h = r1
            int r2 = r2 + (-1)
            r0.f2786i = r2
            return
        Lf:
            r0.<init>()
            r0.f2785h = r1
            r0.f2786i = r2
            return
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f2784g
            switch(r0) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.f2785h
            int r1 = r2.f2786i
            r0.add(r1, r3)
            int r3 = r2.f2786i
            int r3 = r3 + 1
            r2.f2786i = r3
            return
        L13:
            int r0 = r2.f2786i
            int r0 = r0 + 1
            r2.f2786i = r0
            java.lang.Object r1 = r2.f2785h
            r1.add(r0, r3)
            return
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
            r3 = this;
            int r0 = r3.f2784g
            switch(r0) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            int r0 = r3.f2786i
            java.lang.Object r1 = r3.f2785h
            int r1 = r1.size()
            if (r0 >= r1) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
        L13:
            int r0 = r3.f2786i
            java.lang.Object r1 = r3.f2785h
            int r1 = r1.size()
            r2 = 1
            int r1 = r1 - r2
            if (r0 >= r1) goto L20
            goto L21
        L20:
            r2 = 0
        L21:
            return r2
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r1 = this;
            int r0 = r1.f2784g
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            int r0 = r1.f2786i
            if (r0 <= 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
        Ld:
            int r0 = r1.f2786i
            if (r0 < 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            int r0 = r2.f2784g
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            int r0 = r2.f2786i
            int r1 = r0 + 1
            r2.f2786i = r1
            java.lang.Object r1 = r2.f2785h
            java.lang.Object r0 = r1.get(r0)
            return r0
        L12:
            int r0 = r2.f2786i
            int r0 = r0 + 1
            r2.f2786i = r0
            java.lang.Object r1 = r2.f2785h
            java.lang.Object r0 = r1.get(r0)
            return r0
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r1 = this;
            int r0 = r1.f2784g
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            int r0 = r1.f2786i
            return r0
        L8:
            int r0 = r1.f2786i
            int r0 = r0 + 1
            return r0
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r2 = this;
            int r0 = r2.f2784g
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            int r0 = r2.f2786i
            int r0 = r0 + (-1)
            r2.f2786i = r0
            java.lang.Object r1 = r2.f2785h
            java.lang.Object r0 = r1.get(r0)
            return r0
        L12:
            int r0 = r2.f2786i
            int r1 = r0 + (-1)
            r2.f2786i = r1
            java.lang.Object r1 = r2.f2785h
            java.lang.Object r0 = r1.get(r0)
            return r0
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r1 = this;
            int r0 = r1.f2784g
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            int r0 = r1.f2786i
            int r0 = r0 + (-1)
            return r0
        La:
            int r0 = r1.f2786i
            return r0
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
            r2 = this;
            int r0 = r2.f2784g
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            int r0 = r2.f2786i
            int r0 = r0 + (-1)
            r2.f2786i = r0
            java.lang.Object r1 = r2.f2785h
            r1.remove(r0)
            return
        L11:
            java.lang.Object r0 = r2.f2785h
            int r1 = r2.f2786i
            r0.remove(r1)
            int r0 = r2.f2786i
            int r0 = r0 + (-1)
            r2.f2786i = r0
            return
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.f2784g
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.f2785h
            int r1 = r2.f2786i
            r0.set(r1, r3)
            return
        Ld:
            java.lang.Object r0 = r2.f2785h
            int r1 = r2.f2786i
            r0.set(r1, r3)
            return
    }
}
