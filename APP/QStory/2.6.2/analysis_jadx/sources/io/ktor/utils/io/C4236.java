package io.ktor.utils.io;

import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5433;

/* JADX INFO: renamed from: io.ktor.utils.io.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4236 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Throwable f12739;

    /* JADX WARN: Multi-variable type inference failed */
    public C4236(Throwable th) {
        Throwable iOException;
        if (th == 0) {
            iOException = null;
        } else if (th instanceof CancellationException) {
            if (th instanceof InterfaceC5433) {
                iOException = ((InterfaceC5433) th).createCopy();
            } else {
                String message = ((CancellationException) th).getMessage();
                iOException = AbstractC5398.m10487(message == null ? "Channel was cancelled" : message, th);
            }
        } else if ((th instanceof IOException) && (th instanceof InterfaceC5433)) {
            iOException = ((InterfaceC5433) th).createCopy();
        } else {
            String message2 = th.getMessage();
            iOException = new IOException(message2 == null ? "Channel was closed" : message2, th);
        }
        this.f12739 = iOException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Throwable m8662() {
        Throwable th = this.f12739;
        if (th == 0) {
            return null;
        }
        if (th instanceof IOException) {
            return th instanceof InterfaceC5433 ? ((InterfaceC5433) th).createCopy() : new IOException(((IOException) th).getMessage(), th);
        }
        if (!(th instanceof InterfaceC5433)) {
            return AbstractC5398.m10487(th.getMessage(), th);
        }
        Throwable thCreateCopy = ((InterfaceC5433) th).createCopy();
        return thCreateCopy == null ? AbstractC5398.m10487(th.getMessage(), th) : thCreateCopy;
    }
}
