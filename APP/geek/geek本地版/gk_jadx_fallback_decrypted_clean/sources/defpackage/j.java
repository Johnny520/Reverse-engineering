package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class j extends defpackage.i implements java.util.ListIterator {
    public final /* synthetic */ defpackage.l d;

    public j(defpackage.l r4, int r5) {
            r3 = this;
            r3.d = r4
            r3.<init>(r4)
            int r4 = r4.a()
            if (r5 < 0) goto L10
            if (r5 > r4) goto L10
            r3.b = r5
            return
        L10:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "index: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = ", size: "
            r1.append(r5)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r1 = this;
            int r0 = r1.b
            if (r0 <= 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r2 = this;
            boolean r0 = r2.hasPrevious()
            if (r0 == 0) goto L13
            int r0 = r2.b
            int r0 = r0 + (-1)
            r2.b = r0
            l r1 = r2.d
            java.lang.Object r0 = r1.get(r0)
            return r0
        L13:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r1 = this;
            int r0 = r1.b
            int r0 = r0 + (-1)
            return r0
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }
}
