package a;

/* JADX INFO: loaded from: classes.dex */
public final class Gf<T> implements java.util.Iterator<T>, a.InterfaceC0336q9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f107a;
    public java.util.Iterator<? extends T> b;

    public Gf(a.G1 r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f107a = r0
            r1.b = r2
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            java.util.Iterator<? extends T> r0 = r1.b
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public final T next() {
            r4 = this;
            java.util.Iterator<? extends T> r0 = r4.b
            java.lang.Object r0 = r0.next()
            r1 = r0
            android.view.View r1 = (android.view.View) r1
            boolean r2 = r1 instanceof android.view.ViewGroup
            r3 = 0
            if (r2 == 0) goto L11
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L12
        L11:
            r1 = r3
        L12:
            if (r1 == 0) goto L19
            a.G1 r3 = new a.G1
            r3.<init>(r1)
        L19:
            java.util.ArrayList r1 = r4.f107a
            if (r3 == 0) goto L2b
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L2b
            java.util.Iterator<? extends T> r2 = r4.b
            r1.add(r2)
            r4.b = r3
            return r0
        L2b:
            java.util.Iterator<? extends T> r2 = r4.b
            boolean r2 = r2.hasNext()
            if (r2 != 0) goto L67
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L67
            boolean r2 = r1.isEmpty()
            java.lang.String r3 = "List is empty."
            if (r2 != 0) goto L61
            int r2 = a.C0294o3.c0(r1)
            java.lang.Object r2 = r1.get(r2)
            java.util.Iterator r2 = (java.util.Iterator) r2
            r4.b = r2
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L5b
            int r2 = a.C0294o3.c0(r1)
            r1.remove(r2)
            goto L2b
        L5b:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r3)
            throw r0
        L61:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>(r3)
            throw r0
        L67:
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
