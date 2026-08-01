package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gp implements java.util.Iterator {
    public final int a;
    public final int b;
    public boolean c;
    public int d;

    public gp(int r3, int r4, int r5) {
            r2 = this;
            r2.<init>()
            r2.a = r5
            r2.b = r4
            r0 = 0
            r1 = 1
            if (r5 <= 0) goto Lf
            if (r3 > r4) goto L12
        Ld:
            r0 = r1
            goto L12
        Lf:
            if (r3 < r4) goto L12
            goto Ld
        L12:
            r2.c = r0
            if (r0 == 0) goto L17
            goto L18
        L17:
            r3 = r4
        L18:
            r2.d = r3
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            boolean r0 = r1.c
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            int r0 = r2.d
            int r1 = r2.b
            if (r0 != r1) goto L14
            boolean r1 = r2.c
            if (r1 == 0) goto Le
            r1 = 0
            r2.c = r1
            goto L19
        Le:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L14:
            int r1 = r2.a
            int r1 = r1 + r0
            r2.d = r1
        L19:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
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
