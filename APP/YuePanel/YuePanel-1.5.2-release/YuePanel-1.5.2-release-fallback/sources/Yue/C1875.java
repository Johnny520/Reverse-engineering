package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C1875 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final int f5792 = 0;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int f5793 = 1;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f5794 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f5795 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f5796 = -1;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final <T> void m8761(@Yue.InterfaceC4418 Yue.AbstractC1874<? super T> r3, int r4) {
            Yue.ۥ۟ۧۤۢ r0 = r3.mo5315()
            r1 = 4
            if (r4 != r1) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            if (r1 != 0) goto L33
            boolean r2 = r0 instanceof Yue.C1871
            if (r2 == 0) goto L33
            boolean r4 = m8763(r4)
            int r2 = r3.f5791
            boolean r2 = m8763(r2)
            if (r4 != r2) goto L33
            r4 = r0
            Yue.ۥ۠۟ۢ۟ r4 = (Yue.C1871) r4
            Yue.ۥ۟ۧۦۨ r4 = r4.f5784
            Yue.ۥ۟ۧۦۥ r0 = r0.getContext()
            boolean r1 = r4.isDispatchNeeded(r0)
            if (r1 == 0) goto L2f
            r4.dispatch(r0, r3)
            goto L36
        L2f:
            m8766(r3)
            goto L36
        L33:
            m8765(r3, r0, r1)
        L36:
            return
    }

    @Yue.InterfaceC4986
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ void m8762() {
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final boolean m8763(int r2) {
            r0 = 1
            if (r2 == r0) goto L8
            r1 = 2
            if (r2 != r1) goto L7
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final boolean m8764(int r1) {
            r0 = 2
            if (r1 != r0) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = 0
        L6:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T> void m8765(@Yue.InterfaceC4418 Yue.AbstractC1874<? super T> r3, @Yue.InterfaceC4418 Yue.InterfaceC1598<? super T> r4, boolean r5) {
            java.lang.Object r0 = r3.mo5318()
            java.lang.Throwable r1 = r3.mo5316(r0)
            if (r1 == 0) goto L15
            Yue.ۥۡۦۧۤ$ۥ r3 = Yue.C5388.f20029
            java.lang.Object r3 = Yue.C5391.m20390(r1)
        L10:
            java.lang.Object r3 = Yue.C5388.m20377(r3)
            goto L1c
        L15:
            Yue.ۥۡۦۧۤ$ۥ r1 = Yue.C5388.f20029
            java.lang.Object r3 = r3.mo5317(r0)
            goto L10
        L1c:
            if (r5 == 0) goto L56
            Yue.ۥ۠۟ۢ۟ r4 = (Yue.C1871) r4
            Yue.ۥ۟ۧۤۢ<T> r5 = r4.f5785
            java.lang.Object r0 = r4.f5787
            Yue.ۥ۟ۧۦۥ r1 = r5.getContext()
            java.lang.Object r0 = Yue.C6179.m23131(r1, r0)
            Yue.ۥۢ۠ۦۢ r2 = Yue.C6179.f22151
            if (r0 == r2) goto L35
            Yue.ۥۣۢ۠۟ r5 = Yue.C1639.m7920(r5, r1, r0)
            goto L36
        L35:
            r5 = 0
        L36:
            Yue.ۥ۟ۧۤۢ<T> r4 = r4.f5785     // Catch: java.lang.Throwable -> L49
            r4.resumeWith(r3)     // Catch: java.lang.Throwable -> L49
            Yue.ۥۣۢ۠ۤ r3 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto L45
            boolean r3 = r5.m25373()
            if (r3 == 0) goto L59
        L45:
            Yue.C6179.m23129(r1, r0)
            goto L59
        L49:
            r3 = move-exception
            if (r5 == 0) goto L52
            boolean r4 = r5.m25373()
            if (r4 == 0) goto L55
        L52:
            Yue.C6179.m23129(r1, r0)
        L55:
            throw r3
        L56:
            r4.resumeWith(r3)
        L59:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final void m8766(Yue.AbstractC1874<?> r4) {
            Yue.ۥۢۡۡۨ r0 = Yue.C6184.f22161
            Yue.ۥ۠ۡۡ۠ r0 = r0.m23136()
            boolean r1 = r0.m10260()
            if (r1 == 0) goto L10
            r0.m10256(r4)
            goto L2b
        L10:
            r1 = 1
            r0.m10258(r1)
            Yue.ۥ۟ۧۤۢ r2 = r4.mo5315()     // Catch: java.lang.Throwable -> L25
            m8765(r4, r2, r1)     // Catch: java.lang.Throwable -> L25
        L1b:
            boolean r2 = r0.m10263()     // Catch: java.lang.Throwable -> L25
            if (r2 != 0) goto L1b
        L21:
            r0.m10254(r1)
            goto L2b
        L25:
            r2 = move-exception
            r3 = 0
            r4.m8760(r2, r3)     // Catch: java.lang.Throwable -> L2c
            goto L21
        L2b:
            return
        L2c:
            r4 = move-exception
            r0.m10254(r1)
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final void m8767(@Yue.InterfaceC4418 Yue.InterfaceC1598<?> r1, @Yue.InterfaceC4418 java.lang.Throwable r2) {
            Yue.ۥۡۦۧۤ$ۥ r0 = Yue.C5388.f20029
            java.lang.Object r2 = Yue.C5391.m20390(r2)
            java.lang.Object r2 = Yue.C5388.m20377(r2)
            r1.resumeWith(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final void m8768(@Yue.InterfaceC4418 Yue.AbstractC1874<?> r2, @Yue.InterfaceC4418 Yue.AbstractC2237 r3, @Yue.InterfaceC4418 Yue.InterfaceC2823<Yue.C6593> r4) {
            r0 = 1
            r3.m10258(r0)
            r4.invoke()     // Catch: java.lang.Throwable -> L17
        L7:
            boolean r4 = r3.m10263()     // Catch: java.lang.Throwable -> L17
            if (r4 != 0) goto L7
            Yue.C3249.m13687(r0)
        L10:
            r3.m10254(r0)
            Yue.C3249.m13686(r0)
            goto L20
        L17:
            r4 = move-exception
            r1 = 0
            r2.m8760(r4, r1)     // Catch: java.lang.Throwable -> L21
            Yue.C3249.m13687(r0)
            goto L10
        L20:
            return
        L21:
            r2 = move-exception
            Yue.C3249.m13687(r0)
            r3.m10254(r0)
            Yue.C3249.m13686(r0)
            throw r2
    }
}
