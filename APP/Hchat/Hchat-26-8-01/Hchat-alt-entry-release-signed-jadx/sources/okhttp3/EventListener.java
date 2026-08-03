package okhttp3;

import gg.AbstractC1411g;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class EventListener {
    public static final Companion Companion = new Companion(null);
    public static final EventListener NONE = new EventListener() { // from class: okhttp3.EventListener$Companion$NONE$1
    };

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public interface Factory {
        EventListener create(Call call);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void cacheConditionalHit(Call call, Response response) {
        call.getClass();
        response.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void cacheHit(Call call, Response response) {
        call.getClass();
        response.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void cacheMiss(Call call) {
        call.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void callEnd(Call call) {
        call.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void callFailed(Call call, IOException iOException) {
        call.getClass();
        iOException.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void callStart(Call call) {
        call.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void canceled(Call call) {
        call.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
        call.getClass();
        inetSocketAddress.getClass();
        proxy.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
        call.getClass();
        inetSocketAddress.getClass();
        proxy.getClass();
        iOException.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        call.getClass();
        inetSocketAddress.getClass();
        proxy.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void connectionAcquired(Call call, Connection connection) {
        call.getClass();
        connection.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void connectionReleased(Call call, Connection connection) {
        call.getClass();
        connection.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void dnsEnd(Call call, String str, List<InetAddress> list) {
        call.getClass();
        str.getClass();
        list.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void dnsStart(Call call, String str) {
        call.getClass();
        str.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void proxySelectEnd(Call call, HttpUrl httpUrl, List<Proxy> list) {
        call.getClass();
        httpUrl.getClass();
        list.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void proxySelectStart(Call call, HttpUrl httpUrl) {
        call.getClass();
        httpUrl.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void requestBodyEnd(Call call, long j3) {
        call.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void requestBodyStart(Call call) {
        call.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void requestFailed(Call call, IOException iOException) {
        call.getClass();
        iOException.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void requestHeadersEnd(Call call, Request request) {
        call.getClass();
        request.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void requestHeadersStart(Call call) {
        call.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void responseBodyEnd(Call call, long j3) {
        call.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void responseBodyStart(Call call) {
        call.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void responseFailed(Call call, IOException iOException) {
        call.getClass();
        iOException.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void responseHeadersEnd(Call call, Response response) {
        call.getClass();
        response.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void responseHeadersStart(Call call) {
        call.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void satisfactionFailure(Call call, Response response) {
        call.getClass();
        response.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void secureConnectEnd(Call call, Handshake handshake) {
        call.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void secureConnectStart(Call call) {
        call.getClass();
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.EventListener.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        private Companion() {
        }
    }
}
