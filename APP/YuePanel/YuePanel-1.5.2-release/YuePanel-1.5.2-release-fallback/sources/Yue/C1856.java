package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
public final class C1856<T> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final Yue.C4820.InterfaceC4821<java.util.ArrayList<T>> f5710;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final Yue.C5787<T, java.util.ArrayList<T>> f5711;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.util.ArrayList<T> f5712;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final java.util.HashSet<T> f5713;

    public C1856() {
            r2 = this;
            r2.<init>()
            Yue.ۥۡۤۤ۠$ۥ۟ r0 = new Yue.ۥۡۤۤ۠$ۥ۟
            r1 = 10
            r0.<init>(r1)
            r2.f5710 = r0
            Yue.ۥۢ۟ۡ r0 = new Yue.ۥۢ۟ۡ
            r0.<init>()
            r2.f5711 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f5712 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r2.f5713 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m8646(@Yue.InterfaceC4410 T r3, @Yue.InterfaceC4410 T r4) {
            r2 = this;
            Yue.ۥۢ۟ۡ<T, java.util.ArrayList<T>> r0 = r2.f5711
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L27
            Yue.ۥۢ۟ۡ<T, java.util.ArrayList<T>> r0 = r2.f5711
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L27
            Yue.ۥۢ۟ۡ<T, java.util.ArrayList<T>> r0 = r2.f5711
            java.lang.Object r0 = r0.get(r3)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L23
            java.util.ArrayList r0 = r2.m8651()
            Yue.ۥۢ۟ۡ<T, java.util.ArrayList<T>> r1 = r2.f5711
            r1.put(r3, r0)
        L23:
            r0.add(r4)
            return
        L27:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "All nodes must be present in the graph before being added as an edge"
            r3.<init>(r4)
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m8647(@Yue.InterfaceC4410 T r3) {
            r2 = this;
            Yue.ۥۢ۟ۡ<T, java.util.ArrayList<T>> r0 = r2.f5711
            boolean r0 = r0.containsKey(r3)
            if (r0 != 0) goto Le
            Yue.ۥۢ۟ۡ<T, java.util.ArrayList<T>> r0 = r2.f5711
            r1 = 0
            r0.put(r3, r1)
        Le:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m8648() {
            r3 = this;
            Yue.ۥۢ۟ۡ<T, java.util.ArrayList<T>> r0 = r3.f5711
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L19
            Yue.ۥۢ۟ۡ<T, java.util.ArrayList<T>> r2 = r3.f5711
            java.lang.Object r2 = r2.valueAt(r1)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            if (r2 == 0) goto L16
            r3.m8656(r2)
        L16:
            int r1 = r1 + 1
            goto L7
        L19:
            Yue.ۥۢ۟ۡ<T, java.util.ArrayList<T>> r0 = r3.f5711
            r0.clear()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m8649(@Yue.InterfaceC4410 T r2) {
            r1 = this;
            Yue.ۥۢ۟ۡ<T, java.util.ArrayList<T>> r0 = r1.f5711
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m8650(T r5, java.util.ArrayList<T> r6, java.util.HashSet<T> r7) {
            r4 = this;
            boolean r0 = r6.contains(r5)
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r7.contains(r5)
            if (r0 != 0) goto L32
            r7.add(r5)
            Yue.ۥۢ۟ۡ<T, java.util.ArrayList<T>> r0 = r4.f5711
            java.lang.Object r0 = r0.get(r5)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L2b
            int r1 = r0.size()
            r2 = 0
        L1f:
            if (r2 >= r1) goto L2b
            java.lang.Object r3 = r0.get(r2)
            r4.m8650(r3, r6, r7)
            int r2 = r2 + 1
            goto L1f
        L2b:
            r7.remove(r5)
            r6.add(r5)
            return
        L32:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r6 = "This graph contains cyclic dependencies"
            r5.<init>(r6)
            throw r5
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final java.util.ArrayList<T> m8651() {
            r1 = this;
            Yue.ۥۡۤۤ۠$ۥ<java.util.ArrayList<T>> r0 = r1.f5710
            java.lang.Object r0 = r0.acquire()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto Lf
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lf:
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public java.util.List m8652(@Yue.InterfaceC4410 T r2) {
            r1 = this;
            Yue.ۥۢ۟ۡ<T, java.util.ArrayList<T>> r0 = r1.f5711
            java.lang.Object r2 = r0.get(r2)
            java.util.List r2 = (java.util.List) r2
            return r2
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public java.util.List<T> m8653(@Yue.InterfaceC4410 T r5) {
            r4 = this;
            Yue.ۥۢ۟ۡ<T, java.util.ArrayList<T>> r0 = r4.f5711
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L2d
            Yue.ۥۢ۟ۡ<T, java.util.ArrayList<T>> r3 = r4.f5711
            java.lang.Object r3 = r3.valueAt(r2)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 == 0) goto L2a
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L2a
            if (r1 != 0) goto L21
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L21:
            Yue.ۥۢ۟ۡ<T, java.util.ArrayList<T>> r3 = r4.f5711
            java.lang.Object r3 = r3.keyAt(r2)
            r1.add(r3)
        L2a:
            int r2 = r2 + 1
            goto L8
        L2d:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public java.util.ArrayList<T> m8654() {
            r5 = this;
            java.util.ArrayList<T> r0 = r5.f5712
            r0.clear()
            java.util.HashSet<T> r0 = r5.f5713
            r0.clear()
            Yue.ۥۢ۟ۡ<T, java.util.ArrayList<T>> r0 = r5.f5711
            int r0 = r0.size()
            r1 = 0
        L11:
            if (r1 >= r0) goto L23
            Yue.ۥۢ۟ۡ<T, java.util.ArrayList<T>> r2 = r5.f5711
            java.lang.Object r2 = r2.keyAt(r1)
            java.util.ArrayList<T> r3 = r5.f5712
            java.util.HashSet<T> r4 = r5.f5713
            r5.m8650(r2, r3, r4)
            int r1 = r1 + 1
            goto L11
        L23:
            java.util.ArrayList<T> r0 = r5.f5712
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean m8655(@Yue.InterfaceC4410 T r5) {
            r4 = this;
            Yue.ۥۢ۟ۡ<T, java.util.ArrayList<T>> r0 = r4.f5711
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L1f
            Yue.ۥۢ۟ۡ<T, java.util.ArrayList<T>> r3 = r4.f5711
            java.lang.Object r3 = r3.valueAt(r2)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 == 0) goto L1c
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L1c
            r5 = 1
            return r5
        L1c:
            int r2 = r2 + 1
            goto L8
        L1f:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final void m8656(@Yue.InterfaceC4410 java.util.ArrayList<T> r2) {
            r1 = this;
            r2.clear()
            Yue.ۥۡۤۤ۠$ۥ<java.util.ArrayList<T>> r0 = r1.f5710
            r0.release(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int m8657() {
            r1 = this;
            Yue.ۥۢ۟ۡ<T, java.util.ArrayList<T>> r0 = r1.f5711
            int r0 = r0.size()
            return r0
    }
}
