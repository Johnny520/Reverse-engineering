package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۧۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5910<T> implements Yue.InterfaceC1598<T>, Yue.InterfaceC1665 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC1598<T> f21568;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.InterfaceC1632 f21569;

    public C5910(@Yue.InterfaceC4418 Yue.InterfaceC1598<? super T> r1, @Yue.InterfaceC4418 Yue.InterfaceC1632 r2) {
            r0 = this;
            r0.<init>()
            r0.f21568 = r1
            r0.f21569 = r2
            return
    }

    @Override // Yue.InterfaceC1665
    @Yue.InterfaceC4543
    public Yue.InterfaceC1665 getCallerFrame() {
            r2 = this;
            Yue.ۥ۟ۧۤۢ<T> r0 = r2.f21568
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
            Yue.ۥ۟ۧۦۥ r0 = r1.f21569
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
    public void resumeWith(@Yue.InterfaceC4418 java.lang.Object r2) {
            r1 = this;
            Yue.ۥ۟ۧۤۢ<T> r0 = r1.f21568
            r0.resumeWith(r2)
            return
    }
}
