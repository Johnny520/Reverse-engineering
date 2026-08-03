package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۨۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5610<T> extends Yue.AbstractC5611<T> implements java.util.Iterator<T>, Yue.InterfaceC1598<Yue.C6593>, Yue.InterfaceC3443 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public int f20716;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public T f20717;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public java.util.Iterator<? extends T> f20718;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.InterfaceC1598<? super Yue.C6593> f20719;

    public C5610() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // Yue.InterfaceC1598
    @Yue.InterfaceC4418
    public Yue.InterfaceC1632 getContext() {
            r1 = this;
            Yue.ۥ۠۠ۧۦ r0 = Yue.C2141.f6728
            return r0
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r4 = this;
        L0:
            int r0 = r4.f20716
            r1 = 0
            if (r0 == 0) goto L29
            r2 = 2
            r3 = 1
            if (r0 == r3) goto L19
            if (r0 == r2) goto L18
            r1 = 3
            if (r0 == r1) goto L18
            r1 = 4
            if (r0 != r1) goto L13
            r0 = 0
            return r0
        L13:
            java.lang.Throwable r0 = r4.m20975()
            throw r0
        L18:
            return r3
        L19:
            java.util.Iterator<? extends T> r0 = r4.f20718
            Yue.C3329.m13903(r0)
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L27
            r4.f20716 = r2
            return r3
        L27:
            r4.f20718 = r1
        L29:
            r0 = 5
            r4.f20716 = r0
            Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ> r0 = r4.f20719
            Yue.C3329.m13903(r0)
            r4.f20719 = r1
            Yue.ۥۡۦۧۤ$ۥ r1 = Yue.C5388.f20029
            Yue.ۥۣۢ۠ۤ r1 = Yue.C6593.f23016
            java.lang.Object r1 = Yue.C5388.m20377(r1)
            r0.resumeWith(r1)
            goto L0
    }

    @Override // java.util.Iterator
    public T next() {
            r3 = this;
            int r0 = r3.f20716
            if (r0 == 0) goto L27
            r1 = 1
            if (r0 == r1) goto L27
            r2 = 2
            if (r0 == r2) goto L1b
            r1 = 3
            if (r0 != r1) goto L16
            r0 = 0
            r3.f20716 = r0
            T r0 = r3.f20717
            r1 = 0
            r3.f20717 = r1
            return r0
        L16:
            java.lang.Throwable r0 = r3.m20975()
            throw r0
        L1b:
            r3.f20716 = r1
            java.util.Iterator<? extends T> r0 = r3.f20718
            Yue.C3329.m13903(r0)
            java.lang.Object r0 = r0.next()
            return r0
        L27:
            java.lang.Object r0 = r3.m20977()
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

    @Override // Yue.InterfaceC1598
    public void resumeWith(@Yue.InterfaceC4418 java.lang.Object r1) {
            r0 = this;
            Yue.C5391.m20403(r1)
            r1 = 4
            r0.f20716 = r1
            return
    }

    @Override // Yue.AbstractC5611
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.lang.Object mo20973(T r2, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r3) {
            r1 = this;
            r1.f20717 = r2
            r2 = 3
            r1.f20716 = r2
            r1.f20719 = r3
            java.lang.Object r2 = Yue.C3341.m13947()
            java.lang.Object r0 = Yue.C3341.m13947()
            if (r2 != r0) goto L14
            Yue.C1757.m8349(r3)
        L14:
            java.lang.Object r3 = Yue.C3341.m13947()
            if (r2 != r3) goto L1b
            return r2
        L1b:
            Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
            return r2
    }

    @Override // Yue.AbstractC5611
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public java.lang.Object mo20974(@Yue.InterfaceC4418 java.util.Iterator<? extends T> r2, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super Yue.C6593> r3) {
            r1 = this;
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L9
            Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
            return r2
        L9:
            r1.f20718 = r2
            r2 = 2
            r1.f20716 = r2
            r1.f20719 = r3
            java.lang.Object r2 = Yue.C3341.m13947()
            java.lang.Object r0 = Yue.C3341.m13947()
            if (r2 != r0) goto L1d
            Yue.C1757.m8349(r3)
        L1d:
            java.lang.Object r3 = Yue.C3341.m13947()
            if (r2 != r3) goto L24
            return r2
        L24:
            Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final java.lang.Throwable m20975() {
            r3 = this;
            int r0 = r3.f20716
            r1 = 4
            if (r0 == r1) goto L29
            r1 = 5
            if (r0 == r1) goto L21
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected state of the iterator: "
            r1.append(r2)
            int r2 = r3.f20716
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            goto L2e
        L21:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Iterator has failed."
            r0.<init>(r1)
            goto L2e
        L29:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
        L2e:
            return r0
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final Yue.InterfaceC1598<Yue.C6593> m20976() {
            r1 = this;
            Yue.ۥ۟ۧۤۢ<? super Yue.ۥۣۢ۠ۤ> r0 = r1.f20719
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final T m20977() {
            r1 = this;
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r1.next()
            return r0
        Lb:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m20978(@Yue.InterfaceC4543 Yue.InterfaceC1598<? super Yue.C6593> r1) {
            r0 = this;
            r0.f20719 = r1
            return
    }
}
