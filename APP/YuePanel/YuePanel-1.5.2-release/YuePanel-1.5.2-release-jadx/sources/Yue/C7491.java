package Yue;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: renamed from: Yue.ۥۣۢ۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7491 extends C3443 {

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    @InterfaceC6399
    public final Socket f22670;

    public C7491(@InterfaceC6399 Socket socket) {
        C5499.m17103(socket, "socket");
        this.f22670 = socket;
    }

    @Override // Yue.C3443
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public IOException mo9091(@InterfaceC6489 IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // Yue.C3443
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public void mo9095() {
        try {
            this.f22670.close();
        } catch (AssertionError e) {
            if (!C6542.m20838(e)) {
                throw e;
            }
            C6543.f2141.log(Level.WARNING, "Failed to close timed out socket " + this.f22670, (Throwable) e);
        } catch (Exception e2) {
            C6543.f2141.log(Level.WARNING, "Failed to close timed out socket " + this.f22670, (Throwable) e2);
        }
    }
}
