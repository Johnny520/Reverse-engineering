package a;

/* JADX INFO: loaded from: classes.dex */
public final class C9 implements java.util.Iterator<java.lang.String>, a.InterfaceC0336q9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f47a;
    public int b;
    public int c;
    public int d;
    public int e;

    public C9(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f47a = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r9 = this;
            int r0 = r9.b
            r1 = 0
            r2 = 1
            if (r0 == 0) goto La
            if (r0 != r2) goto L9
            return r2
        L9:
            return r1
        La:
            int r0 = r9.e
            r3 = 2
            if (r0 >= 0) goto L12
            r9.b = r3
            return r1
        L12:
            java.lang.String r0 = r9.f47a
            int r1 = r0.length()
            int r4 = r9.c
            int r5 = r0.length()
        L1e:
            if (r4 >= r5) goto L43
            char r6 = r0.charAt(r4)
            r7 = 13
            r8 = 10
            if (r6 == r8) goto L2f
            if (r6 == r7) goto L2f
            int r4 = r4 + 1
            goto L1e
        L2f:
            if (r6 != r7) goto L40
            int r1 = r4 + 1
            int r5 = r0.length()
            if (r1 >= r5) goto L40
            char r0 = r0.charAt(r1)
            if (r0 != r8) goto L40
            goto L41
        L40:
            r3 = r2
        L41:
            r1 = r4
            goto L44
        L43:
            r3 = -1
        L44:
            r9.b = r2
            r9.e = r3
            r9.d = r1
            return r2
    }

    @Override // java.util.Iterator
    public final java.lang.String next() {
            r3 = this;
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1d
            r0 = 0
            r3.b = r0
            int r0 = r3.d
            int r1 = r3.c
            int r2 = r3.e
            int r2 = r2 + r0
            r3.c = r2
            java.lang.String r2 = r3.f47a
            java.lang.CharSequence r0 = r2.subSequence(r1, r0)
            java.lang.String r0 = r0.toString()
            return r0
        L1d:
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
