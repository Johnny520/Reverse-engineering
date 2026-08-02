package defpackage;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class k93 implements na0 {
    public final boolean h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public k93(boolean z) {
        this.h = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.na0
    public final List d(String str) throws UnknownHostException {
        str.getClass();
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            allByName.getClass();
            List<InetAddress> listT0 = mg.t0(allByName);
            if (this.h || listT0.isEmpty()) {
                return listT0;
            }
            for (InetAddress inetAddress : listT0) {
                inetAddress.getClass();
                if (!inetAddress.isAnyLocalAddress() && !inetAddress.isLoopbackAddress() && !inetAddress.isLinkLocalAddress() && !inetAddress.isSiteLocalAddress() && !inetAddress.isMulticastAddress()) {
                    if (inetAddress instanceof Inet4Address) {
                        byte[] address = ((Inet4Address) inetAddress).getAddress();
                        address.getClass();
                        int i = address[0] & 255;
                        int i2 = address[1] & 255;
                        int i3 = address[2] & 255;
                        if (i == 0 || ((i == 100 && 64 <= i2 && i2 < 128) || ((i == 192 && i2 == 0 && (i3 == 0 || i3 == 2)) || ((i == 198 && 18 <= i2 && i2 < 20) || ((i == 198 && i2 == 51 && i3 == 100) || ((i == 203 && i2 == 0 && i3 == 113) || i >= 224)))))) {
                        }
                    } else if (inetAddress instanceof Inet6Address) {
                        byte[] address2 = ((Inet6Address) inetAddress).getAddress();
                        address2.getClass();
                        byte b = address2[0];
                        int i4 = b & 255;
                        int i5 = address2[1] & 255;
                        if ((b & 254) == 252 || (i4 == 32 && i5 == 1 && (address2[2] & 255) == 13 && (address2[3] & 255) == 184)) {
                        }
                    }
                }
                throw new k32("The resolved address is private or reserved.");
            }
            return listT0;
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }
}
