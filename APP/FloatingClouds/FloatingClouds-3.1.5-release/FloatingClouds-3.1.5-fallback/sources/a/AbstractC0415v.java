package a;

/* JADX INFO: renamed from: a.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0415v<T> implements java.util.Iterator<T>, a.InterfaceC0336q9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f726a;
    public java.io.File b;

    public final boolean a() {
            r5 = this;
            r0 = 3
            r5.f726a = r0
            r0 = r5
            a.v6$b r0 = (a.C0422v6.b) r0
        L6:
            java.util.ArrayDeque<a.v6$c> r1 = r0.c
            java.lang.Object r2 = r1.peek()
            a.v6$c r2 = (a.C0422v6.c) r2
            if (r2 != 0) goto L12
            r1 = 0
            goto L42
        L12:
            java.io.File r3 = r2.a()
            if (r3 != 0) goto L1c
            r1.pop()
            goto L6
        L1c:
            java.io.File r2 = r2.f734a
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L41
            boolean r2 = r3.isDirectory()
            if (r2 == 0) goto L41
            int r2 = r1.size()
            a.v6 r4 = r0.d
            r4.getClass()
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r2 < r4) goto L39
            goto L41
        L39:
            a.v6$a r2 = r0.b(r3)
            r1.push(r2)
            goto L6
        L41:
            r1 = r3
        L42:
            r2 = 1
            if (r1 == 0) goto L4a
            r0.b = r1
            r0.f726a = r2
            goto L4d
        L4a:
            r1 = 2
            r0.f726a = r1
        L4d:
            int r0 = r5.f726a
            if (r0 != r2) goto L52
            return r2
        L52:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r2 = this;
            int r0 = r2.f726a
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
            boolean r0 = r2.a()
            return r0
    }

    @Override // java.util.Iterator
    public final T next() {
            r3 = this;
            int r0 = r3.f726a
            r1 = 1
            r2 = 0
            if (r0 != r1) goto Lb
            r3.f726a = r2
            java.io.File r0 = r3.b
            return r0
        Lb:
            r1 = 2
            if (r0 == r1) goto L19
            boolean r0 = r3.a()
            if (r0 == 0) goto L19
            r3.f726a = r2
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
