package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۥۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5792(version = "1.3")
public abstract class AbstractC0730 implements Yue.InterfaceC1598<java.lang.Object>, Yue.InterfaceC1665, java.io.Serializable {

    @Yue.InterfaceC4543
    private final Yue.InterfaceC1598<java.lang.Object> completion;

    public AbstractC0730(@Yue.InterfaceC4543 Yue.InterfaceC1598<java.lang.Object> r1) {
            r0 = this;
            r0.<init>()
            r0.completion = r1
            return
    }

    @Yue.InterfaceC4418
    public Yue.InterfaceC1598<Yue.C6593> create(@Yue.InterfaceC4418 Yue.InterfaceC1598<?> r2) {
            r1 = this;
            java.lang.String r0 = "completion"
            Yue.C3329.m13906(r2, r0)
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "create(Continuation) has not been overridden"
            r2.<init>(r0)
            throw r2
    }

    @Yue.InterfaceC4418
    public Yue.InterfaceC1598<Yue.C6593> create(@Yue.InterfaceC4543 java.lang.Object r1, @Yue.InterfaceC4418 Yue.InterfaceC1598<?> r2) {
            r0 = this;
            java.lang.String r1 = "completion"
            Yue.C3329.m13906(r2, r1)
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "create(Any?;Continuation) has not been overridden"
            r1.<init>(r2)
            throw r1
    }

    @Override // Yue.InterfaceC1665
    @Yue.InterfaceC4543
    public Yue.InterfaceC1665 getCallerFrame() {
            r2 = this;
            Yue.ۥ۟ۧۤۢ<java.lang.Object> r0 = r2.completion
            boolean r1 = r0 instanceof Yue.InterfaceC1665
            if (r1 == 0) goto L9
            Yue.ۥ۟ۧۧۨ r0 = (Yue.InterfaceC1665) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Yue.InterfaceC4543
    public final Yue.InterfaceC1598<java.lang.Object> getCompletion() {
            r1 = this;
            Yue.ۥ۟ۧۤۢ<java.lang.Object> r0 = r1.completion
            return r0
    }

    @Override // Yue.InterfaceC1665
    @Yue.InterfaceC4543
    public java.lang.StackTraceElement getStackTraceElement() {
            r1 = this;
            java.lang.StackTraceElement r0 = Yue.C1745.m8293(r1)
            return r0
    }

    @Yue.InterfaceC4543
    public abstract java.lang.Object invokeSuspend(@Yue.InterfaceC4418 java.lang.Object r1);

    public void releaseIntercepted() {
            r0 = this;
            return
    }

    @Override // Yue.InterfaceC1598
    public final void resumeWith(@Yue.InterfaceC4418 java.lang.Object r4) {
            r3 = this;
            r0 = r3
        L1:
            Yue.C1757.m8348(r0)
            Yue.ۥ۟ۢۥۢ r0 = (Yue.AbstractC0730) r0
            Yue.ۥ۟ۧۤۢ<java.lang.Object> r1 = r0.completion
            Yue.C3329.m13903(r1)
            java.lang.Object r4 = r0.invokeSuspend(r4)     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r2 = Yue.C3341.m13947()     // Catch: java.lang.Throwable -> L1d
            if (r4 != r2) goto L16
            return
        L16:
            Yue.ۥۡۦۧۤ$ۥ r2 = Yue.C5388.f20029     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r4 = Yue.C5388.m20377(r4)     // Catch: java.lang.Throwable -> L1d
            goto L28
        L1d:
            r4 = move-exception
            Yue.ۥۡۦۧۤ$ۥ r2 = Yue.C5388.f20029
            java.lang.Object r4 = Yue.C5391.m20390(r4)
            java.lang.Object r4 = Yue.C5388.m20377(r4)
        L28:
            r0.releaseIntercepted()
            boolean r0 = r1 instanceof Yue.AbstractC0730
            if (r0 == 0) goto L31
            r0 = r1
            goto L1
        L31:
            r1.resumeWith(r4)
            return
    }

    @Yue.InterfaceC4418
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Continuation at "
            r0.append(r1)
            java.lang.StackTraceElement r1 = r2.getStackTraceElement()
            if (r1 == 0) goto L11
            goto L19
        L11:
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
        L19:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
