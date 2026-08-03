package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧۡ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7192 {

    /* JADX INFO: renamed from: Yue.ۥۡۧۡ۠$ۥ */
    public static final class RunnableC1203 implements Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5122<C8107> f21703;

        public RunnableC1203(InterfaceC5122<C8107> interfaceC5122) {
            this.f21703 = interfaceC5122;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f21703.invoke();
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final Runnable m3486(@InterfaceC6399 InterfaceC5122<C8107> interfaceC5122) {
        return new RunnableC1203(interfaceC5122);
    }
}
