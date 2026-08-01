package p014;

import java.io.EOFException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import kotlin.text.AbstractC5132;
import okio.ByteString;
import p004.C6092;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子苏哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6231 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f17168 = 0;

    static {
        Charset charset = AbstractC5132.f14688;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ArrayList m11704(String str, ByteString byteString) throws EOFException, UnknownHostException {
        str.getClass();
        byteString.getClass();
        ArrayList arrayList = new ArrayList();
        C6092 c6092 = new C6092();
        c6092.m11471(byteString);
        c6092.readShort();
        short s = c6092.readShort();
        if (((s & 65535) >> 15) == 0) {
            C5925.m11310("not a response");
            return null;
        }
        int i = s & 15;
        if (i == 2) {
            throw new UnknownHostException(str.concat(": SERVFAIL"));
        }
        if (i == 3) {
            throw new UnknownHostException(str.concat(": NXDOMAIN"));
        }
        int i2 = c6092.readShort() & 65535;
        int i3 = c6092.readShort() & 65535;
        c6092.readShort();
        c6092.readShort();
        for (int i4 = 0; i4 < i2; i4++) {
            byte b = c6092.readByte();
            if (b < 0) {
                c6092.skip(1L);
            } else {
                while (b > 0) {
                    c6092.skip(b);
                    b = c6092.readByte();
                }
            }
            c6092.readShort();
            c6092.readShort();
        }
        for (int i5 = 0; i5 < i3; i5++) {
            byte b2 = c6092.readByte();
            if (b2 < 0) {
                c6092.skip(1L);
            } else {
                while (b2 > 0) {
                    c6092.skip(b2);
                    b2 = c6092.readByte();
                }
            }
            int i6 = c6092.readShort() & 65535;
            c6092.readShort();
            c6092.readInt();
            int i7 = c6092.readShort() & 65535;
            if (i6 == 1 || i6 == 28) {
                byte[] bArr = new byte[i7];
                c6092.read(bArr, 0, i7);
                InetAddress byAddress = InetAddress.getByAddress(bArr);
                byAddress.getClass();
                arrayList.add(byAddress);
            } else {
                c6092.skip(i7);
            }
        }
        return arrayList;
    }
}
