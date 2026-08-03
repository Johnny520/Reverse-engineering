package Yue;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4244 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final InterfaceC4243 m1208(@InterfaceC6399 InterfaceC4225 interfaceC4225) {
        if (interfaceC4225.get(InterfaceC5542.f13507) == null) {
            interfaceC4225 = interfaceC4225.plus(C5555.m17215(null, 1, null));
        }
        return new C4197(interfaceC4225);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final InterfaceC4243 m1209() {
        return new C4197(C7679.m24447(null, 1, null).plus(C4423.m12872()));
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m12237(@InterfaceC6399 InterfaceC4243 interfaceC4243, @InterfaceC6399 String str, @InterfaceC6489 Throwable th) {
        m12238(interfaceC4243, C4739.m1654(str, th));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final void m12238(@InterfaceC6399 InterfaceC4243 interfaceC4243, @InterfaceC6489 CancellationException cancellationException) {
        InterfaceC5542 interfaceC5542 = (InterfaceC5542) interfaceC4243.getCoroutineContext().get(InterfaceC5542.f13507);
        if (interfaceC5542 != null) {
            interfaceC5542.mo6939(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC4243).toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m12239(InterfaceC4243 interfaceC4243, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        m12237(interfaceC4243, str, th);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ void m12240(InterfaceC4243 interfaceC4243, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        m12238(interfaceC4243, cancellationException);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <R> Object m12241(@InterfaceC6399 InterfaceC5138<? super InterfaceC4243, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5138, @InterfaceC6399 InterfaceC4199<? super R> interfaceC4199) {
        C7242 c7242 = new C7242(interfaceC4199.getContext(), interfaceC4199);
        Object objM26706 = C8103.m26706(c7242, c7242, interfaceC5138);
        if (objM26706 == C5508.m17142()) {
            C4324.m12513(interfaceC4199);
        }
        return objM26706;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final Object m12242(@InterfaceC6399 InterfaceC4199<? super InterfaceC4225> interfaceC4199) {
        return interfaceC4199.getContext();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final Object m12243(InterfaceC4199<? super InterfaceC4225> interfaceC4199) {
        C5437.m16931(3);
        throw null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final void m12244(@InterfaceC6399 InterfaceC4243 interfaceC4243) {
        C5553.m17211(interfaceC4243.getCoroutineContext());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final boolean m12245(@InterfaceC6399 InterfaceC4243 interfaceC4243) {
        InterfaceC5542 interfaceC5542 = (InterfaceC5542) interfaceC4243.getCoroutineContext().get(InterfaceC5542.f13507);
        if (interfaceC5542 != null) {
            return interfaceC5542.mo5773();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static /* synthetic */ void m12246(InterfaceC4243 interfaceC4243) {
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final InterfaceC4243 m12247(@InterfaceC6399 InterfaceC4243 interfaceC4243, @InterfaceC6399 InterfaceC4225 interfaceC4225) {
        return new C4197(interfaceC4243.getCoroutineContext().plus(interfaceC4225));
    }
}
