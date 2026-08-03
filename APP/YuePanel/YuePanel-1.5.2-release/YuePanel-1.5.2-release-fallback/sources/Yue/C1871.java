package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۢ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1871<T> extends Yue.AbstractC1874<T> implements Yue.InterfaceC1665, Yue.InterfaceC1598<T> {

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f5783 = null;

    @Yue.InterfaceC4418
    private volatile /* synthetic */ java.lang.Object _reusableCancellableContinuation;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public final Yue.AbstractC1643 f5784;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public final Yue.InterfaceC1598<T> f5785;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @Yue.InterfaceC3417
    @Yue.InterfaceC4543
    public java.lang.Object f5786;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    @Yue.InterfaceC3417
    public final java.lang.Object f5787;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_reusableCancellableContinuation"
            java.lang.Class<Yue.ۥ۠۟ۢ۟> r2 = Yue.C1871.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            Yue.C1871.f5783 = r0
            return
    }

    public C1871(@Yue.InterfaceC4418 Yue.AbstractC1643 r2, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super T> r3) {
            r1 = this;
            r0 = -1
            r1.<init>(r0)
            r1.f5784 = r2
            r1.f5785 = r3
            Yue.ۥۢ۠ۦۢ r2 = Yue.C1872.m8749()
            r1.f5786 = r2
            Yue.ۥ۟ۧۦۥ r2 = r1.getContext()
            java.lang.Object r2 = Yue.C6179.m23130(r2)
            r1.f5787 = r2
            r2 = 0
            r1._reusableCancellableContinuation = r2
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m8737() {
            return
    }

    @Override // Yue.InterfaceC1665
    @Yue.InterfaceC4543
    public Yue.InterfaceC1665 getCallerFrame() {
            r2 = this;
            Yue.ۥ۟ۧۤۢ<T> r0 = r2.f5785
            boolean r1 = r0 instanceof Yue.InterfaceC1665
            if (r1 == 0) goto L9
            Yue.ۥ۟ۧۧۨ r0 = (Yue.InterfaceC1665) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // Yue.InterfaceC1598
    @Yue.InterfaceC4418
    public Yue.InterfaceC1632 getContext() {
            r1 = this;
            Yue.ۥ۟ۧۤۢ<T> r0 = r1.f5785
            Yue.ۥ۟ۧۦۥ r0 = r0.getContext()
            return r0
    }

    @Override // Yue.InterfaceC1665
    @Yue.InterfaceC4543
    public java.lang.StackTraceElement getStackTraceElement() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // Yue.InterfaceC1598
    public void resumeWith(@Yue.InterfaceC4418 java.lang.Object r7) {
            r6 = this;
            Yue.ۥ۟ۧۤۢ<T> r0 = r6.f5785
            Yue.ۥ۟ۧۦۥ r0 = r0.getContext()
            r1 = 0
            r2 = 1
            java.lang.Object r3 = Yue.C1423.m7054(r7, r1, r2, r1)
            Yue.ۥ۟ۧۦۨ r4 = r6.f5784
            boolean r4 = r4.isDispatchNeeded(r0)
            r5 = 0
            if (r4 == 0) goto L1f
            r6.f5786 = r3
            r6.f5791 = r5
            Yue.ۥ۟ۧۦۨ r7 = r6.f5784
            r7.dispatch(r0, r6)
            goto L5f
        L1f:
            Yue.ۥۢۡۡۨ r0 = Yue.C6184.f22161
            Yue.ۥ۠ۡۡ۠ r0 = r0.m23136()
            boolean r4 = r0.m10260()
            if (r4 == 0) goto L33
            r6.f5786 = r3
            r6.f5791 = r5
            r0.m10256(r6)
            goto L5f
        L33:
            r0.m10258(r2)
            Yue.ۥ۟ۧۦۥ r3 = r6.getContext()     // Catch: java.lang.Throwable -> L54
            java.lang.Object r4 = r6.f5787     // Catch: java.lang.Throwable -> L54
            java.lang.Object r4 = Yue.C6179.m23131(r3, r4)     // Catch: java.lang.Throwable -> L54
            Yue.ۥ۟ۧۤۢ<T> r5 = r6.f5785     // Catch: java.lang.Throwable -> L56
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L56
            Yue.ۥۣۢ۠ۤ r7 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L56
            Yue.C6179.m23129(r3, r4)     // Catch: java.lang.Throwable -> L54
        L4a:
            boolean r7 = r0.m10263()     // Catch: java.lang.Throwable -> L54
            if (r7 != 0) goto L4a
        L50:
            r0.m10254(r2)
            goto L5f
        L54:
            r7 = move-exception
            goto L5b
        L56:
            r7 = move-exception
            Yue.C6179.m23129(r3, r4)     // Catch: java.lang.Throwable -> L54
            throw r7     // Catch: java.lang.Throwable -> L54
        L5b:
            r6.m8760(r7, r1)     // Catch: java.lang.Throwable -> L60
            goto L50
        L5f:
            return
        L60:
            r7 = move-exception
            r0.m10254(r2)
            throw r7
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DispatchedContinuation["
            r0.append(r1)
            Yue.ۥ۟ۧۦۨ r1 = r2.f5784
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            Yue.ۥ۟ۧۤۢ<T> r1 = r2.f5785
            java.lang.String r1 = Yue.C1758.m8352(r1)
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // Yue.AbstractC1874
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo5314(@Yue.InterfaceC4543 java.lang.Object r2, @Yue.InterfaceC4418 java.lang.Throwable r3) {
            r1 = this;
            boolean r0 = r2 instanceof Yue.C1418
            if (r0 == 0) goto Lb
            Yue.ۥ۟ۦۣۣ r2 = (Yue.C1418) r2
            Yue.ۥۣ۠ۡ۟<java.lang.Throwable, Yue.ۥۣۢ۠ۤ> r2 = r2.f4522
            r2.invoke(r3)
        Lb:
            return
    }

    @Override // Yue.AbstractC1874
    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public Yue.InterfaceC1598<T> mo5315() {
            r0 = this;
            return r0
    }

    @Override // Yue.AbstractC1874
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public java.lang.Object mo5318() {
            r2 = this;
            java.lang.Object r0 = r2.f5786
            Yue.ۥۢ۠ۦۢ r1 = Yue.C1872.m8749()
            r2.f5786 = r1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final void m8738() {
            r2 = this;
        L0:
            java.lang.Object r0 = r2._reusableCancellableContinuation
            Yue.ۥۢ۠ۦۢ r1 = Yue.C1872.f5789
            if (r0 == r1) goto L0
            return
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final Yue.C0934<T> m8739() {
            r4 = this;
        L0:
            java.lang.Object r0 = r4._reusableCancellableContinuation
            if (r0 != 0) goto La
            Yue.ۥۢ۠ۦۢ r0 = Yue.C1872.f5789
            r4._reusableCancellableContinuation = r0
            r0 = 0
            return r0
        La:
            boolean r1 = r0 instanceof Yue.C0934
            if (r1 == 0) goto L1b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = Yue.C1871.f5783
            Yue.ۥۢ۠ۦۢ r2 = Yue.C1872.f5789
            boolean r1 = Yue.C0084.m471(r1, r4, r0, r2)
            if (r1 == 0) goto L0
            Yue.ۥۣ۟ۨ۠ r0 = (Yue.C0934) r0
            return r0
        L1b:
            Yue.ۥۢ۠ۦۢ r1 = Yue.C1872.f5789
            if (r0 == r1) goto L0
            boolean r1 = r0 instanceof java.lang.Throwable
            if (r1 == 0) goto L24
            goto L0
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Inconsistent state "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m8740(@Yue.InterfaceC4418 Yue.InterfaceC1632 r1, T r2) {
            r0 = this;
            r0.f5786 = r2
            r2 = 1
            r0.f5791 = r2
            Yue.ۥ۟ۧۦۨ r2 = r0.f5784
            r2.dispatchYield(r1, r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final Yue.C0934<?> m8741() {
            r2 = this;
            java.lang.Object r0 = r2._reusableCancellableContinuation
            boolean r1 = r0 instanceof Yue.C0934
            if (r1 == 0) goto L9
            Yue.ۥۣ۟ۨ۠ r0 = (Yue.C0934) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean m8742() {
            r1 = this;
            java.lang.Object r0 = r1._reusableCancellableContinuation
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final boolean m8743(@Yue.InterfaceC4418 java.lang.Throwable r5) {
            r4 = this;
        L0:
            java.lang.Object r0 = r4._reusableCancellableContinuation
            Yue.ۥۢ۠ۦۢ r1 = Yue.C1872.f5789
            boolean r2 = Yue.C3329.m13897(r0, r1)
            r3 = 1
            if (r2 == 0) goto L14
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Yue.C1871.f5783
            boolean r0 = Yue.C0084.m471(r0, r4, r1, r5)
            if (r0 == 0) goto L0
            return r3
        L14:
            boolean r1 = r0 instanceof java.lang.Throwable
            if (r1 == 0) goto L19
            return r3
        L19:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = Yue.C1871.f5783
            r2 = 0
            boolean r0 = Yue.C0084.m471(r1, r4, r0, r2)
            if (r0 == 0) goto L0
            r5 = 0
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final void m8744() {
            r1 = this;
            r1.m8738()
            Yue.ۥۣ۟ۨ۠ r0 = r1.m8741()
            if (r0 == 0) goto Lc
            r0.m5325()
        Lc:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final void m8745(@Yue.InterfaceC4418 java.lang.Object r7, @Yue.InterfaceC4543 Yue.InterfaceC2825<? super java.lang.Throwable, Yue.C6593> r8) {
            r6 = this;
            java.lang.Object r8 = Yue.C1423.m7053(r7, r8)
            Yue.ۥ۟ۧۦۨ r0 = r6.f5784
            Yue.ۥ۟ۧۦۥ r1 = r6.getContext()
            boolean r0 = r0.isDispatchNeeded(r1)
            r1 = 1
            if (r0 == 0) goto L20
            r6.f5786 = r8
            r6.f5791 = r1
            Yue.ۥ۟ۧۦۨ r7 = r6.f5784
            Yue.ۥ۟ۧۦۥ r8 = r6.getContext()
            r7.dispatch(r8, r6)
            goto Lbc
        L20:
            Yue.ۥۢۡۡۨ r0 = Yue.C6184.f22161
            Yue.ۥ۠ۡۡ۠ r0 = r0.m23136()
            boolean r2 = r0.m10260()
            if (r2 == 0) goto L35
            r6.f5786 = r8
            r6.f5791 = r1
            r0.m10256(r6)
            goto Lbc
        L35:
            r0.m10258(r1)
            r2 = 0
            Yue.ۥ۟ۧۦۥ r3 = r6.getContext()     // Catch: java.lang.Throwable -> L62
            Yue.ۥ۠ۦ۟ۡ$ۥ۟ r4 = Yue.InterfaceC3383.f10824     // Catch: java.lang.Throwable -> L62
            Yue.ۥ۟ۧۦۥ$ۥ۟ r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L62
            Yue.ۥ۠ۦ۟ۡ r3 = (Yue.InterfaceC3383) r3     // Catch: java.lang.Throwable -> L62
            if (r3 == 0) goto L64
            boolean r4 = r3.mo371()     // Catch: java.lang.Throwable -> L62
            if (r4 != 0) goto L64
            java.util.concurrent.CancellationException r7 = r3.mo13982()     // Catch: java.lang.Throwable -> L62
            r6.mo5314(r8, r7)     // Catch: java.lang.Throwable -> L62
            Yue.ۥۡۦۧۤ$ۥ r8 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L62
            java.lang.Object r7 = Yue.C5391.m20390(r7)     // Catch: java.lang.Throwable -> L62
            java.lang.Object r7 = Yue.C5388.m20377(r7)     // Catch: java.lang.Throwable -> L62
            r6.resumeWith(r7)     // Catch: java.lang.Throwable -> L62
            goto L92
        L62:
            r7 = move-exception
            goto Lb5
        L64:
            Yue.ۥ۟ۧۤۢ<T> r8 = r6.f5785     // Catch: java.lang.Throwable -> L62
            java.lang.Object r3 = r6.f5787     // Catch: java.lang.Throwable -> L62
            Yue.ۥ۟ۧۦۥ r4 = r8.getContext()     // Catch: java.lang.Throwable -> L62
            java.lang.Object r3 = Yue.C6179.m23131(r4, r3)     // Catch: java.lang.Throwable -> L62
            Yue.ۥۢ۠ۦۢ r5 = Yue.C6179.f22151     // Catch: java.lang.Throwable -> L62
            if (r3 == r5) goto L79
            Yue.ۥۣۢ۠۟ r8 = Yue.C1639.m7920(r8, r4, r3)     // Catch: java.lang.Throwable -> L62
            goto L7a
        L79:
            r8 = r2
        L7a:
            Yue.ۥ۟ۧۤۢ<T> r5 = r6.f5785     // Catch: java.lang.Throwable -> La2
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> La2
            Yue.ۥۣۢ۠ۤ r7 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> La2
            Yue.C3249.m13687(r1)     // Catch: java.lang.Throwable -> L62
            if (r8 == 0) goto L8c
            boolean r7 = r8.m25373()     // Catch: java.lang.Throwable -> L62
            if (r7 == 0) goto L8f
        L8c:
            Yue.C6179.m23129(r4, r3)     // Catch: java.lang.Throwable -> L62
        L8f:
            Yue.C3249.m13686(r1)     // Catch: java.lang.Throwable -> L62
        L92:
            boolean r7 = r0.m10263()     // Catch: java.lang.Throwable -> L62
            if (r7 != 0) goto L92
            Yue.C3249.m13687(r1)
        L9b:
            r0.m10254(r1)
            Yue.C3249.m13686(r1)
            goto Lbc
        La2:
            r7 = move-exception
            Yue.C3249.m13687(r1)     // Catch: java.lang.Throwable -> L62
            if (r8 == 0) goto Lae
            boolean r8 = r8.m25373()     // Catch: java.lang.Throwable -> L62
            if (r8 == 0) goto Lb1
        Lae:
            Yue.C6179.m23129(r4, r3)     // Catch: java.lang.Throwable -> L62
        Lb1:
            Yue.C3249.m13686(r1)     // Catch: java.lang.Throwable -> L62
            throw r7     // Catch: java.lang.Throwable -> L62
        Lb5:
            r6.m8760(r7, r2)     // Catch: java.lang.Throwable -> Lbd
            Yue.C3249.m13687(r1)
            goto L9b
        Lbc:
            return
        Lbd:
            r7 = move-exception
            Yue.C3249.m13687(r1)
            r0.m10254(r1)
            Yue.C3249.m13686(r1)
            throw r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final boolean m8746(@Yue.InterfaceC4543 java.lang.Object r3) {
            r2 = this;
            Yue.ۥ۟ۧۦۥ r0 = r2.getContext()
            Yue.ۥ۠ۦ۟ۡ$ۥ۟ r1 = Yue.InterfaceC3383.f10824
            Yue.ۥ۟ۧۦۥ$ۥ۟ r0 = r0.get(r1)
            Yue.ۥ۠ۦ۟ۡ r0 = (Yue.InterfaceC3383) r0
            if (r0 == 0) goto L2a
            boolean r1 = r0.mo371()
            if (r1 != 0) goto L2a
            java.util.concurrent.CancellationException r0 = r0.mo13982()
            r2.mo5314(r3, r0)
            Yue.ۥۡۦۧۤ$ۥ r3 = Yue.C5388.f20029
            java.lang.Object r3 = Yue.C5391.m20390(r0)
            java.lang.Object r3 = Yue.C5388.m20377(r3)
            r2.resumeWith(r3)
            r3 = 1
            return r3
        L2a:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final void m8747(@Yue.InterfaceC4418 java.lang.Object r6) {
            r5 = this;
            Yue.ۥ۟ۧۤۢ<T> r0 = r5.f5785
            java.lang.Object r1 = r5.f5787
            Yue.ۥ۟ۧۦۥ r2 = r0.getContext()
            java.lang.Object r1 = Yue.C6179.m23131(r2, r1)
            Yue.ۥۢ۠ۦۢ r3 = Yue.C6179.f22151
            if (r1 == r3) goto L15
            Yue.ۥۣۢ۠۟ r0 = Yue.C1639.m7920(r0, r2, r1)
            goto L16
        L15:
            r0 = 0
        L16:
            r3 = 1
            Yue.ۥ۟ۧۤۢ<T> r4 = r5.f5785     // Catch: java.lang.Throwable -> L30
            r4.resumeWith(r6)     // Catch: java.lang.Throwable -> L30
            Yue.ۥۣۢ۠ۤ r6 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L30
            Yue.C3249.m13687(r3)
            if (r0 == 0) goto L29
            boolean r6 = r0.m25373()
            if (r6 == 0) goto L2c
        L29:
            Yue.C6179.m23129(r2, r1)
        L2c:
            Yue.C3249.m13686(r3)
            return
        L30:
            r6 = move-exception
            Yue.C3249.m13687(r3)
            if (r0 == 0) goto L3c
            boolean r0 = r0.m25373()
            if (r0 == 0) goto L3f
        L3c:
            Yue.C6179.m23129(r2, r1)
        L3f:
            Yue.C3249.m13686(r3)
            throw r6
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final java.lang.Throwable m8748(@Yue.InterfaceC4418 Yue.InterfaceC0932<?> r4) {
            r3 = this;
        L0:
            java.lang.Object r0 = r3._reusableCancellableContinuation
            Yue.ۥۢ۠ۦۢ r1 = Yue.C1872.f5789
            r2 = 0
            if (r0 != r1) goto L10
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = Yue.C1871.f5783
            boolean r0 = Yue.C0084.m471(r0, r3, r1, r4)
            if (r0 == 0) goto L0
            return r2
        L10:
            boolean r4 = r0 instanceof java.lang.Throwable
            if (r4 == 0) goto L2b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = Yue.C1871.f5783
            boolean r4 = Yue.C0084.m471(r4, r3, r0, r2)
            if (r4 == 0) goto L1f
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
        L1f:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Inconsistent state "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }
}
