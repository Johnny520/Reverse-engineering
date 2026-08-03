package p000;

/* JADX INFO: loaded from: classes.dex */
public final class u<T> implements java.util.Iterator<T>, p000.n4 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final T[] f1055;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f1056;

    public u(T[] r1) {
            r0 = this;
            r0.<init>()
            r0.f1055 = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.f1056
            T[] r1 = r2.f1055
            int r1 = r1.length
            if (r0 >= r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // java.util.Iterator
    public final T next() {
            r3 = this;
            T[] r0 = r3.f1055     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            int r1 = r3.f1056     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            int r2 = r1 + 1
            r3.f1056 = r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            r0 = r0[r1]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            return r0
        Lb:
            r0 = move-exception
            int r1 = r3.f1056
            int r1 = r1 + (-1)
            r3.f1056 = r1
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            throw r1
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
