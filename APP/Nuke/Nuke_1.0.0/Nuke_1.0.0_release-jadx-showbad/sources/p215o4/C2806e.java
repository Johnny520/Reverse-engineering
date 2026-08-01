package p215o4;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import p208n4.C2703b;

/* JADX INFO: renamed from: o4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2806e extends C2703b {

    /* JADX INFO: renamed from: n */
    public final Socket f8834n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2806e(Socket socket) {
        this.f8834n = socket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.C2703b
    /* JADX INFO: renamed from: j */
    public final IOException mo3767j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p208n4.C2703b
    /* JADX INFO: renamed from: k */
    public final void mo3347k() {
        Socket socket = this.f8834n;
        try {
            socket.close();
        } catch (AssertionError e5) {
            if (!AbstractC2807f.m4990a(e5)) {
                throw e5;
            }
            AbstractC2807f.f8835a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e5);
        } catch (Exception e6) {
            AbstractC2807f.f8835a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e6);
        }
    }
}
