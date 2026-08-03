package Yue;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3140<E> extends C3715<E> implements InterfaceC3142<E> {
    public C3140(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 InterfaceC3713<E> interfaceC3713, boolean z) {
        super(interfaceC4225, interfaceC3713, false, z);
        m17274((InterfaceC5542) interfaceC4225.get(InterfaceC5542.f13507));
    }

    @Override // Yue.C5557
    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public boolean mo6417(@InterfaceC6399 Throwable th) {
        C4236.m1201(getContext(), th);
        return true;
    }

    @Override // Yue.C5557
    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public void mo6418(@InterfaceC6489 Throwable th) {
        InterfaceC3713<E> interfaceC3713M10176 = m10176();
        if (th != null) {
            cancellationExceptionM1654 = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionM1654 == null) {
                cancellationExceptionM1654 = C4739.m1654(C4325.m1288(this) + " was cancelled", th);
            }
        }
        interfaceC3713M10176.mo5718(cancellationExceptionM1654);
    }
}
