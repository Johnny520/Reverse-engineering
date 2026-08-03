package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC4986
@Yue.InterfaceC5792(version = "1.3")
public final class C5468<T> implements Yue.InterfaceC1598<T>, Yue.InterfaceC1665 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C5468.C5469 f20275 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<Yue.C5468<?>, java.lang.Object> f20276 = null;

    @Yue.InterfaceC4543
    private volatile java.lang.Object result;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC1598<T> f20277;

    /* JADX INFO: renamed from: Yue.ۥۣۡۧۢ$ۥ, reason: contains not printable characters */
    public static final class C5469 {
        public C5469() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C5469(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static /* synthetic */ void m20625() {
                return
        }
    }

    static {
            Yue.ۥۣۡۧۢ$ۥ r0 = new Yue.ۥۣۡۧۢ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C5468.f20275 = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "result"
            java.lang.Class<Yue.ۥۣۡۧۢ> r2 = Yue.C5468.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            Yue.C5468.f20276 = r0
            return
    }

    @Yue.InterfaceC4986
    public C5468(@Yue.InterfaceC4418 Yue.InterfaceC1598<? super T> r2) {
            r1 = this;
            java.lang.String r0 = "delegate"
            Yue.C3329.m13906(r2, r0)
            Yue.ۥ۟ۧۧۧ r0 = Yue.EnumC1664.f5148
            r1.<init>(r2, r0)
            return
    }

    public C5468(@Yue.InterfaceC4418 Yue.InterfaceC1598<? super T> r2, @Yue.InterfaceC4543 java.lang.Object r3) {
            r1 = this;
            java.lang.String r0 = "delegate"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f20277 = r2
            r1.result = r3
            return
    }

    @Override // Yue.InterfaceC1665
    @Yue.InterfaceC4543
    public Yue.InterfaceC1665 getCallerFrame() {
            r2 = this;
            Yue.ۥ۟ۧۤۢ<T> r0 = r2.f20277
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
            Yue.ۥ۟ۧۤۢ<T> r0 = r1.f20277
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
    public void resumeWith(@Yue.InterfaceC4418 java.lang.Object r4) {
            r3 = this;
        L0:
            java.lang.Object r0 = r3.result
            Yue.ۥ۟ۧۧۧ r1 = Yue.EnumC1664.f5148
            if (r0 != r1) goto Lf
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<Yue.ۥۣۡۧۢ<?>, java.lang.Object> r0 = Yue.C5468.f20276
            boolean r0 = Yue.C0084.m471(r0, r3, r1, r4)
            if (r0 == 0) goto L0
            return
        Lf:
            java.lang.Object r1 = Yue.C3341.m13947()
            if (r0 != r1) goto L29
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<Yue.ۥۣۡۧۢ<?>, java.lang.Object> r0 = Yue.C5468.f20276
            java.lang.Object r1 = Yue.C3341.m13947()
            Yue.ۥ۟ۧۧۧ r2 = Yue.EnumC1664.f5149
            boolean r0 = Yue.C0084.m471(r0, r3, r1, r2)
            if (r0 == 0) goto L0
            Yue.ۥ۟ۧۤۢ<T> r0 = r3.f20277
            r0.resumeWith(r4)
            return
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            r4.<init>(r0)
            throw r4
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SafeContinuation for "
            r0.append(r1)
            Yue.ۥ۟ۧۤۢ<T> r1 = r2.f20277
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Yue.InterfaceC4986
    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.Object m20624() {
            r3 = this;
            java.lang.Object r0 = r3.result
            Yue.ۥ۟ۧۧۧ r1 = Yue.EnumC1664.f5148
            if (r0 != r1) goto L19
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<Yue.ۥۣۡۧۢ<?>, java.lang.Object> r0 = Yue.C5468.f20276
            java.lang.Object r2 = Yue.C3341.m13947()
            boolean r0 = Yue.C0084.m471(r0, r3, r1, r2)
            if (r0 == 0) goto L17
            java.lang.Object r0 = Yue.C3341.m13947()
            return r0
        L17:
            java.lang.Object r0 = r3.result
        L19:
            Yue.ۥ۟ۧۧۧ r1 = Yue.EnumC1664.f5149
            if (r0 != r1) goto L22
            java.lang.Object r0 = Yue.C3341.m13947()
            goto L26
        L22:
            boolean r1 = r0 instanceof Yue.C5388.C5390
            if (r1 != 0) goto L27
        L26:
            return r0
        L27:
            Yue.ۥۡۦۧۤ$ۥ۟ r0 = (Yue.C5388.C5390) r0
            java.lang.Throwable r0 = r0.f20031
            throw r0
    }
}
