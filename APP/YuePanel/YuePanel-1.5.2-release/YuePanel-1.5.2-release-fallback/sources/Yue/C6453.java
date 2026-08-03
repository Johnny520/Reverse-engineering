package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6453<T> implements java.util.Iterator<T>, Yue.InterfaceC3443 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC2825<T, java.util.Iterator<T>> f22737;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.List<java.util.Iterator<T>> f22738;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public java.util.Iterator<? extends T> f22739;

    public C6453(@Yue.InterfaceC4418 java.util.Iterator<? extends T> r1, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super T, ? extends java.util.Iterator<? extends T>> r2) {
            r0 = this;
            r0.<init>()
            r0.f22737 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.f22738 = r2
            r0.f22739 = r1
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            java.util.Iterator<? extends T> r0 = r1.f22739
            boolean r0 = r0.hasNext()
            return r0
    }

    @Override // java.util.Iterator
    public T next() {
            r1 = this;
            java.util.Iterator<? extends T> r0 = r1.f22739
            java.lang.Object r0 = r0.next()
            r1.m23768(r0)
            return r0
    }

    @Override // java.util.Iterator
    public void remove() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final void m23768(T r3) {
            r2 = this;
            Yue.ۥۣ۠ۡ۟<T, java.util.Iterator<T>> r0 = r2.f22737
            java.lang.Object r3 = r0.invoke(r3)
            java.util.Iterator r3 = (java.util.Iterator) r3
            if (r3 == 0) goto L1a
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1a
            java.util.List<java.util.Iterator<T>> r0 = r2.f22738
            java.util.Iterator<? extends T> r1 = r2.f22739
            r0.add(r1)
            r2.f22739 = r3
            goto L3c
        L1a:
            java.util.Iterator<? extends T> r3 = r2.f22739
            boolean r3 = r3.hasNext()
            if (r3 != 0) goto L3c
            java.util.List<java.util.Iterator<T>> r3 = r2.f22738
            boolean r3 = r3.isEmpty()
            r3 = r3 ^ 1
            if (r3 == 0) goto L3c
            java.util.List<java.util.Iterator<T>> r3 = r2.f22738
            java.lang.Object r3 = Yue.C1219.m6401(r3)
            java.util.Iterator r3 = (java.util.Iterator) r3
            r2.f22739 = r3
            java.util.List<java.util.Iterator<T>> r3 = r2.f22738
            Yue.C1216.m6270(r3)
            goto L1a
        L3c:
            return
    }
}
