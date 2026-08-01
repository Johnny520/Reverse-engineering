package ae;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import p376zd.C9981c;

/* JADX INFO: renamed from: ae.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0317p extends C9981c {

    /* JADX INFO: renamed from: a */
    public final Socket f792a;

    public C0317p(Socket socket) {
        socket.getClass();
        this.f792a = socket;
    }

    @Override // p376zd.C9981c
    public IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // p376zd.C9981c
    public void timedOut() {
        try {
            this.f792a.close();
        } catch (AssertionError e10) {
            if (!AbstractC0326y.m1000b(e10)) {
                throw e10;
            }
            AbstractC0326y.f827a.log(Level.WARNING, "Failed to close timed out socket " + this.f792a, (Throwable) e10);
        } catch (Exception e11) {
            AbstractC0326y.f827a.log(Level.WARNING, "Failed to close timed out socket " + this.f792a, (Throwable) e11);
        }
    }
}
