package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p185m8.AbstractC5106t;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\bÀ\u0006\u0003"}, m16758d2 = {"Lokhttp3/Dns;", _UrlKt.FRAGMENT_ENCODE_SET, "lookup", _UrlKt.FRAGMENT_ENCODE_SET, "Ljava/net/InetAddress;", "hostname", _UrlKt.FRAGMENT_ENCODE_SET, "Companion", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public interface Dns {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final Dns SYSTEM = new Companion.DnsSystem();

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001¨\u0006\u0007"}, m16758d2 = {"Lokhttp3/Dns$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "SYSTEM", "Lokhttp3/Dns;", "DnsSystem", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        @Metadata(m16757d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m16758d2 = {"Lokhttp3/Dns$Companion$DnsSystem;", "Lokhttp3/Dns;", "<init>", "()V", "lookup", _UrlKt.FRAGMENT_ENCODE_SET, "Ljava/net/InetAddress;", "hostname", _UrlKt.FRAGMENT_ENCODE_SET, "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
        public static final class DnsSystem implements Dns {
            @Override // okhttp3.Dns
            public List<InetAddress> lookup(String hostname) throws UnknownHostException {
                hostname.getClass();
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    allByName.getClass();
                    return AbstractC5106t.m20713V0(allByName);
                } catch (NullPointerException e10) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + hostname);
                    unknownHostException.initCause(e10);
                    throw unknownHostException;
                }
            }
        }

        private Companion() {
        }
    }

    List<InetAddress> lookup(String hostname);
}
