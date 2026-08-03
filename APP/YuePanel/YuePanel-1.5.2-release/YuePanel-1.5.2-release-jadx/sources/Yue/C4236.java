package Yue;

import Yue.InterfaceC4234;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4236 {

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۧ۠$ۥ */
    public static final class C0363 extends AbstractC2981 implements InterfaceC4234 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138<InterfaceC4225, Throwable, C8107> f8589;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۢ<? super Yue.ۥ۟ۧۦۥ, ? super java.lang.Throwable, Yue.ۥۣۢ۠ۤ> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0363(InterfaceC5138<? super InterfaceC4225, ? super Throwable, C8107> interfaceC5138, InterfaceC4234.C0362 c0362) {
            super(c0362);
            this.f8589 = interfaceC5138;
        }

        @Override // Yue.InterfaceC4234
        /* JADX INFO: renamed from: ۥ۟۟ۢ */
        public void mo6569(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 Throwable th) {
            this.f8589.invoke(interfaceC4225, th);
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final InterfaceC4234 m1200(@InterfaceC6399 InterfaceC5138<? super InterfaceC4225, ? super Throwable, C8107> interfaceC5138) {
        return new C0363(interfaceC5138, InterfaceC4234.f8587);
    }

    @InterfaceC5495
    /* JADX INFO: renamed from: ۥ۟ */
    public static final void m1201(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 Throwable th) {
        try {
            InterfaceC4234 interfaceC4234 = (InterfaceC4234) interfaceC4225.get(InterfaceC4234.f8587);
            if (interfaceC4234 != null) {
                interfaceC4234.mo6569(interfaceC4225, th);
            } else {
                C4235.m1199(interfaceC4225, th);
            }
        } catch (Throwable th2) {
            C4235.m1199(interfaceC4225, m12176(th, th2));
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Throwable m12176(@InterfaceC6399 Throwable th, @InterfaceC6399 Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        C4741.m1656(runtimeException, th);
        return runtimeException;
    }
}
