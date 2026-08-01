package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fk implements java.util.Iterator {
    public int a;
    public java.io.File b;
    public final java.util.ArrayDeque c;
    public final /* synthetic */ defpackage.gg d;

    public fk(defpackage.gg r3) {
            r2 = this;
            r2.<init>()
            r2.d = r3
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r2.c = r0
            java.lang.Object r3 = r3.b
            java.io.File r3 = (java.io.File) r3
            boolean r1 = r3.isDirectory()
            if (r1 == 0) goto L1e
            bk r3 = r2.a(r3)
            r0.push(r3)
            return
        L1e:
            boolean r1 = r3.isFile()
            if (r1 == 0) goto L2d
            dk r1 = new dk
            r1.<init>(r3)
            r0.push(r1)
            return
        L2d:
            r3 = 2
            r2.a = r3
            return
    }

    public final defpackage.bk a(java.io.File r3) {
            r2 = this;
            gg r0 = r2.d
            java.lang.Object r0 = r0.c
            hk r0 = (defpackage.hk) r0
            int r0 = r0.ordinal()
            if (r0 == 0) goto L1b
            r1 = 1
            if (r0 != r1) goto L15
            ck r0 = new ck
            r0.<init>(r3)
            return r0
        L15:
            pb r3 = new pb
            r3.<init>()
            throw r3
        L1b:
            ek r0 = new ek
            r0.<init>(r3)
            return r0
    }

    public final boolean b() {
            r4 = this;
            r0 = 3
            r4.a = r0
        L3:
            java.util.ArrayDeque r0 = r4.c
            java.lang.Object r1 = r0.peek()
            gk r1 = (defpackage.gk) r1
            if (r1 != 0) goto Lf
            r0 = 0
            goto L3a
        Lf:
            java.io.File r2 = r1.a()
            if (r2 != 0) goto L19
            r0.pop()
            goto L3
        L19:
            java.io.File r1 = r1.a
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L39
            boolean r1 = r2.isDirectory()
            if (r1 == 0) goto L39
            int r1 = r0.size()
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r1 < r3) goto L31
            goto L39
        L31:
            bk r1 = r4.a(r2)
            r0.push(r1)
            goto L3
        L39:
            r0 = r2
        L3a:
            r1 = 1
            if (r0 == 0) goto L42
            r4.b = r0
            r4.a = r1
            goto L45
        L42:
            r0 = 2
            r4.a = r0
        L45:
            int r0 = r4.a
            if (r0 != r1) goto L4a
            return r1
        L4a:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.a
            if (r0 == 0) goto L15
            r1 = 1
            if (r0 == r1) goto L14
            r1 = 2
            if (r0 != r1) goto Lc
            r0 = 0
            return r0
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "hasNext called when the iterator is in the FAILED state."
            r0.<init>(r1)
            throw r0
        L14:
            return r1
        L15:
            boolean r0 = r2.b()
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.a
            r1 = 1
            r2 = 0
            if (r0 != r1) goto Lb
            r3.a = r2
            java.io.File r0 = r3.b
            return r0
        Lb:
            r1 = 2
            if (r0 == r1) goto L19
            boolean r0 = r3.b()
            if (r0 == 0) goto L19
            r3.a = r2
            java.io.File r0 = r3.b
            return r0
        L19:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
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
