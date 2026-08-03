package okhttp3.internal.connection;

import ac.AbstractC0063p;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RouteException extends RuntimeException {
    private final IOException firstConnectException;
    private IOException lastConnectException;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(IOException iOException) {
        super(iOException);
        iOException.getClass();
        this.firstConnectException = iOException;
        this.lastConnectException = iOException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void addConnectException(IOException iOException) {
        iOException.getClass();
        AbstractC0063p.m412e(this.firstConnectException, iOException);
        this.lastConnectException = iOException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final IOException getFirstConnectException() {
        return this.firstConnectException;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final IOException getLastConnectException() {
        return this.lastConnectException;
    }
}
