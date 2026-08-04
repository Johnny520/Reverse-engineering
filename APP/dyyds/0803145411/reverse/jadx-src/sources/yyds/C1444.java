package yyds;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: renamed from: yyds.ᛶᲇᛳᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1444 extends C0313 {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final Socket f6858;

    public C1444(Socket socket) {
        this.f6858 = socket;
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final IOException m2942(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // yyds.C0313
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public final void mo979() {
        Socket socket = this.f6858;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!AbstractC1124.m2315(e)) {
                throw e;
            }
            AbstractC1124.f5180.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            AbstractC1124.f5180.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }
}
