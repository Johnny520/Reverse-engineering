package p000;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class at2 extends C0846wg {

    /* JADX INFO: renamed from: n */
    public final Socket f386n;

    public at2(Socket socket) {
        this.f386n = socket;
    }

    @Override // p000.C0846wg
    /* JADX INFO: renamed from: j */
    public final IOException mo276j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // p000.C0846wg
    /* JADX INFO: renamed from: k */
    public final void mo277k() {
        Socket socket = this.f386n;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!tg3.m5254a(e)) {
                throw e;
            }
            tg3.f10745a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            tg3.f10745a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }
}
