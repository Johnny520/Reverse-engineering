package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦۨ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC7155 implements Runnable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final AbstractC4232 f21573;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC3665<C8107> f21574;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۟ۨ۟<? super Yue.ۥۣۢ۠ۤ> */
    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC7155(@InterfaceC6399 AbstractC4232 abstractC4232, @InterfaceC6399 InterfaceC3665<? super C8107> interfaceC3665) {
        this.f21573 = abstractC4232;
        this.f21574 = interfaceC3665;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f21574.mo10016(this.f21573, C8107.f3222);
    }
}
