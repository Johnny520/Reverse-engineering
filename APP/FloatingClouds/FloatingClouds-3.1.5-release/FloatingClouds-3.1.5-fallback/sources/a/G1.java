package a;

/* JADX INFO: loaded from: classes.dex */
public final class G1 implements java.util.Iterator, a.InterfaceC0336q9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94a;
    public int b;
    public final java.lang.Object c;

    public G1(android.view.ViewGroup r2) {
            r1 = this;
            r0 = 1
            r1.f94a = r0
            r1.<init>()
            r1.c = r2
            return
    }

    public G1(java.lang.Object[] r2) {
            r1 = this;
            r0 = 0
            r1.f94a = r0
            java.lang.String r0 = "array"
            a.C0193i9.e(r2, r0)
            r1.<init>()
            r1.c = r2
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.f94a
            switch(r0) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            int r0 = r2.b
            java.lang.Object r1 = r2.c
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r1 = r1.getChildCount()
            if (r0 >= r1) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
        L15:
            int r0 = r2.b
            java.lang.Object r1 = r2.c
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r1 = r1.length
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
            int r0 = r3.f94a
            switch(r0) {
                case 0: goto L1c;
                default: goto L5;
            }
        L5:
            int r0 = r3.b
            int r1 = r0 + 1
            r3.b = r1
            java.lang.Object r1 = r3.c
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.View r0 = r1.getChildAt(r0)
            if (r0 == 0) goto L16
            return r0
        L16:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
        L1c:
            java.lang.Object r0 = r3.c     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L29
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L29
            int r1 = r3.b     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L29
            int r2 = r1 + 1
            r3.b = r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L29
            r0 = r0[r1]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L29
            return r0
        L29:
            r0 = move-exception
            int r1 = r3.b
            int r1 = r1 + (-1)
            r3.b = r1
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            int r0 = r2.f94a
            switch(r0) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            int r0 = r2.b
            int r0 = r0 + (-1)
            r2.b = r0
            java.lang.Object r1 = r2.c
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r1.removeViewAt(r0)
            return
        L13:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }
}
