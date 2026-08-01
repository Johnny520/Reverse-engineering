package io.ktor.utils.io;

import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.InterfaceC5434;

/* JADX INFO: renamed from: io.ktor.utils.io.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4237 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Throwable f12743;

    /* JADX WARN: Multi-variable type inference failed */
    public C4237(Throwable th) {
        Throwable iOException;
        if (th == 0) {
            iOException = null;
        } else if (th instanceof CancellationException) {
            if (th instanceof InterfaceC5434) {
                iOException = ((InterfaceC5434) th).createCopy();
            } else {
                String message = ((CancellationException) th).getMessage();
                iOException = AbstractC5399.m10491(message == null ? "Channel was cancelled" : message, th);
            }
        } else if ((th instanceof IOException) && (th instanceof InterfaceC5434)) {
            iOException = ((InterfaceC5434) th).createCopy();
        } else {
            String message2 = th.getMessage();
            iOException = new IOException(message2 == null ? "Channel was closed" : message2, th);
        }
        this.f12743 = iOException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Throwable m8652() {
        Throwable th = this.f12743;
        if (th == 0) {
            return null;
        }
        if (th instanceof IOException) {
            return th instanceof InterfaceC5434 ? ((InterfaceC5434) th).createCopy() : new IOException(((IOException) th).getMessage(), th);
        }
        if (!(th instanceof InterfaceC5434)) {
            return AbstractC5399.m10491(th.getMessage(), th);
        }
        Throwable thCreateCopy = ((InterfaceC5434) th).createCopy();
        return thCreateCopy == null ? AbstractC5399.m10491(th.getMessage(), th) : thCreateCopy;
    }
}
