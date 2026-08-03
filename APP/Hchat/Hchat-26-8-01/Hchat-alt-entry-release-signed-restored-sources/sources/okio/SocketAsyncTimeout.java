package okio;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class SocketAsyncTimeout extends AsyncTimeout {
    private final Socket socket;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SocketAsyncTimeout(Socket socket) {
        socket.getClass();
        this.socket = socket;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.AsyncTimeout
    public IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okio.AsyncTimeout
    public void timedOut() {
        try {
            this.socket.close();
        } catch (AssertionError e6) {
            if (!Okio.isAndroidGetsocknameError(e6)) {
                throw e6;
            }
            Okio__JvmOkioKt.logger.log(Level.WARNING, "Failed to close timed out socket " + this.socket, (Throwable) e6);
        } catch (Exception e7) {
            Okio__JvmOkioKt.logger.log(Level.WARNING, "Failed to close timed out socket " + this.socket, (Throwable) e7);
        }
    }
}
