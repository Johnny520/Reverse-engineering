package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class i implements java.util.Iterator {
    public final /* synthetic */ int a;
    public int b;
    public final java.lang.Object c;

    public i(defpackage.l r2) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.<init>()
            r1.c = r2
            return
    }

    public i(java.lang.Object[] r2) {
            r1 = this;
            r0 = 1
            r1.a = r0
            java.lang.String r0 = "array"
            defpackage.ip.o(r0, r2)
            r1.<init>()
            r1.c = r2
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            int r0 = r2.b
            java.lang.Object r1 = r2.c
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r1 = r1.length
            if (r0 >= r1) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
        L12:
            int r0 = r2.b
            java.lang.Object r1 = r2.c
            l r1 = (defpackage.l) r1
            int r1 = r1.a()
            if (r0 >= r1) goto L20
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 0: goto L23;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.c     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L12
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L12
            int r1 = r3.b     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L12
            int r2 = r1 + 1
            r3.b = r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L12
            r0 = r0[r1]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L12
            return r0
        L12:
            r0 = move-exception
            int r1 = r3.b
            int r1 = r1 + (-1)
            r3.b = r1
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            throw r1
        L23:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r3.c
            l r0 = (defpackage.l) r0
            int r1 = r3.b
            int r2 = r1 + 1
            r3.b = r2
            java.lang.Object r0 = r0.get(r1)
            return r0
        L38:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
        Ld:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
