package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import tf.AbstractC4165l;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface Dns {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final Dns SYSTEM = new Companion.DnsSystem();

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
        public static final class DnsSystem implements Dns {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // okhttp3.Dns
            public List<InetAddress> lookup(String str) throws UnknownHostException {
                str.getClass();
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    allByName.getClass();
                    return AbstractC4165l.m8375L0(allByName);
                } catch (NullPointerException e6) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                    unknownHostException.initCause(e6);
                    throw unknownHostException;
                }
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private Companion() {
        }
    }

    List<InetAddress> lookup(String str);
}
