package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C0567<T> implements java.util.Iterator<T>, Yue.InterfaceC3443 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final T[] f1474;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f1475;

    public C0567(@Yue.InterfaceC4418 T[] r2) {
            r1 = this;
            java.lang.String r0 = "array"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f1474 = r2
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r2 = this;
            int r0 = r2.f1475
            T[] r1 = r2.f1474
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
    public T next() {
            r3 = this;
            T[] r0 = r3.f1474     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            int r1 = r3.f1475     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            int r2 = r1 + 1
            r3.f1475 = r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            r0 = r0[r1]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> Lb
            return r0
        Lb:
            r0 = move-exception
            int r1 = r3.f1475
            int r1 = r1 + (-1)
            r3.f1475 = r1
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r0)
            throw r1
    }

    @Override // java.util.Iterator
    public void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final T[] m2008() {
            r1 = this;
            T[] r0 = r1.f1474
            return r0
    }
}
