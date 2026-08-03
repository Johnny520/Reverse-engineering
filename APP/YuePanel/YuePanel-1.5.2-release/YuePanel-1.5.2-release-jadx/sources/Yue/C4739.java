package Yue;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4739 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final CancellationException m1654(@InterfaceC6489 String str, @InterfaceC6489 Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final void m1655(@InterfaceC6399 Throwable th, @InterfaceC6399 Throwable th2) {
        C4741.m1656(th, th2);
    }
}
