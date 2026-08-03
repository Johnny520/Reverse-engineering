package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class c<E> implements java.util.Collection<E>, p000.n4 {

    public static final class a extends p000.o4 implements p000.g3<E, java.lang.CharSequence> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ p000.c<E> f170;

        public a(p000.c<? extends E> r1) {
                r0 = this;
                r0.f170 = r1
                r0.<init>()
                return
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p000.g3
        /* JADX INFO: renamed from: ۥ۟۟ */
        public final java.lang.CharSequence mo12(java.lang.Object r2) {
                r1 = this;
                ۟.c<E> r0 = r1.f170
                if (r2 != r0) goto L7
                java.lang.String r2 = "(this Collection)"
                goto Lb
            L7:
                java.lang.String r2 = java.lang.String.valueOf(r2)
            Lb:
                return r2
        }
    }

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.util.Collection
    public final boolean add(E r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection<? extends E> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public final void clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Collection
    public boolean contains(E r4) {
            r3 = this;
            boolean r0 = r3.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            goto L1d
        L8:
            java.util.Iterator r0 = r3.iterator()
        Lc:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r0.next()
            boolean r2 = p000.h4.m185(r2, r4)
            if (r2 == 0) goto Lc
            r1 = 1
        L1d:
            return r1
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection<? extends java.lang.Object> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            p000.h4.m189(r0, r3)
            boolean r0 = r3.isEmpty()
            r1 = 1
            if (r0 == 0) goto Ld
            goto L22
        Ld:
            java.util.Iterator r3 = r3.iterator()
        L11:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r3.next()
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L11
            r1 = 0
        L22:
            return r1
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.mo86()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.mo86()
            return r0
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
            r1 = this;
            java.lang.Object[] r0 = p000.jb.m220(r1)
            return r0
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] r2) {
            r1 = this;
            java.lang.String r0 = "array"
            p000.h4.m189(r0, r2)
            java.lang.Object[] r2 = p000.jb.m221(r1, r2)
            return r2
    }

    public final java.lang.String toString() {
            r6 = this;
            ۟.c$a r4 = new ۟.c$a
            r4.<init>(r6)
            java.lang.String r1 = ", "
            java.lang.String r2 = "["
            java.lang.String r3 = "]"
            r5 = 24
            r0 = r6
            java.lang.String r0 = p000.o0.m323(r0, r1, r2, r3, r4, r5)
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public abstract int mo86();
}
