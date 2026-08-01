package okhttp3;

import java.net.Socket;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\b\u001a\u00020\tH&¨\u0006\nÀ\u0006\u0003"}, m16758d2 = {"Lokhttp3/Connection;", _UrlKt.FRAGMENT_ENCODE_SET, "route", "Lokhttp3/Route;", "socket", "Ljava/net/Socket;", "handshake", "Lokhttp3/Handshake;", "protocol", "Lokhttp3/Protocol;", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public interface Connection {
    Handshake handshake();

    Protocol protocol();

    Route route();

    Socket socket();
}
