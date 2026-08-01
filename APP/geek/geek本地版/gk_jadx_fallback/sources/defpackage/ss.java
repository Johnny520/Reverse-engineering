package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ss implements java.util.Iterator {
    public final int a;
    public int b;
    public int c;
    public boolean d;
    public final /* synthetic */ defpackage.m6 e;

    public ss(defpackage.m6 r2, int r3) {
            r1 = this;
            r1.<init>()
            r1.e = r2
            r0 = 0
            r1.d = r0
            r1.a = r3
            int r2 = r2.d()
            r1.b = r2
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.c
            int r1 = r2.b
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
            if (r0 == 0) goto L19
            int r0 = r3.c
            int r1 = r3.a
            m6 r2 = r3.e
            java.lang.Object r0 = r2.b(r0, r1)
            int r1 = r3.c
            r2 = 1
            int r1 = r1 + r2
            r3.c = r1
            r3.d = r2
            return r0
        L19:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            boolean r0 = r2.d
            if (r0 == 0) goto L19
            int r0 = r2.c
            int r0 = r0 + (-1)
            r2.c = r0
            int r1 = r2.b
            int r1 = r1 + (-1)
            r2.b = r1
            r1 = 0
            r2.d = r1
            m6 r1 = r2.e
            r1.g(r0)
            return
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }
}
