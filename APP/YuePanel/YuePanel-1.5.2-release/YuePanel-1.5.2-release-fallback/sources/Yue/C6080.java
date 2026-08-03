package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6080<T> implements Yue.InterfaceC3574<T>, java.io.Serializable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public Yue.InterfaceC2823<? extends T> f21992;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4543
    public volatile java.lang.Object f21993;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.lang.Object f21994;

    public C6080(@Yue.InterfaceC4418 Yue.InterfaceC2823<? extends T> r2, @Yue.InterfaceC4543 java.lang.Object r3) {
            r1 = this;
            java.lang.String r0 = "initializer"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f21992 = r2
            Yue.ۥۢۢۧۧ r2 = Yue.C6551.f22943
            r1.f21993 = r2
            if (r3 != 0) goto L11
            r3 = r1
        L11:
            r1.f21994 = r3
            return
    }

    public /* synthetic */ C6080(Yue.InterfaceC2823 r1, java.lang.Object r2, int r3, Yue.C1769 r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    private final java.lang.Object m22824() {
            r2 = this;
            Yue.ۥ۠ۥۢ۟ r0 = new Yue.ۥ۠ۥۢ۟
            java.lang.Object r1 = r2.getValue()
            r0.<init>(r1)
            return r0
    }

    @Override // Yue.InterfaceC3574
    public T getValue() {
            r3 = this;
            java.lang.Object r0 = r3.f21993
            Yue.ۥۢۢۧۧ r1 = Yue.C6551.f22943
            if (r0 == r1) goto L7
            return r0
        L7:
            java.lang.Object r0 = r3.f21994
            monitor-enter(r0)
            java.lang.Object r2 = r3.f21993     // Catch: java.lang.Throwable -> L1f
            if (r2 == r1) goto Lf
            goto L1d
        Lf:
            Yue.ۥۣ۠۠ۨ<? extends T> r1 = r3.f21992     // Catch: java.lang.Throwable -> L1f
            Yue.C3329.m13903(r1)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r2 = r1.invoke()     // Catch: java.lang.Throwable -> L1f
            r3.f21993 = r2     // Catch: java.lang.Throwable -> L1f
            r1 = 0
            r3.f21992 = r1     // Catch: java.lang.Throwable -> L1f
        L1d:
            monitor-exit(r0)
            return r2
        L1f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // Yue.InterfaceC3574
    public boolean isInitialized() {
            r2 = this;
            java.lang.Object r0 = r2.f21993
            Yue.ۥۢۢۧۧ r1 = Yue.C6551.f22943
            if (r0 == r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r1 = this;
            boolean r0 = r1.isInitialized()
            if (r0 == 0) goto Lf
            java.lang.Object r0 = r1.getValue()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto L11
        Lf:
            java.lang.String r0 = "Lazy value not initialized yet."
        L11:
            return r0
    }
}
