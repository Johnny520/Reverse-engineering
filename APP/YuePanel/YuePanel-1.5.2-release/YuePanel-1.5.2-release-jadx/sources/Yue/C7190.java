package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7190 implements InterfaceC4199<C8107> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6489
    public C7148<C8107> f21702;

    @Override // Yue.InterfaceC4199
    @InterfaceC6399
    public InterfaceC4225 getContext() {
        return C4629.f9940;
    }

    @Override // Yue.InterfaceC4199
    public void resumeWith(@InterfaceC6399 Object obj) {
        synchronized (this) {
            this.f21702 = C7148.m3437(obj);
            C5499.m17101(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            C8107 c8107 = C8107.f3222;
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m3483() {
        synchronized (this) {
            while (true) {
                try {
                    C7148<C8107> c7148 = this.f21702;
                    if (c7148 == null) {
                        C5499.m17101(this, "null cannot be cast to non-null type java.lang.Object");
                        wait();
                    } else {
                        C7149.m22422(c7148.m22410());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public final C7148<C8107> m3484() {
        return this.f21702;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m22525(@InterfaceC6489 C7148<C8107> c7148) {
        this.f21702 = c7148;
    }
}
