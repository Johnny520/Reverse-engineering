package p030;

import java.io.EOFException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import kotlin.text.AbstractC5964;
import okio.ByteString;
import p020.C6921;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子苏哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7060 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f17513 = 0;

    static {
        Charset charset = AbstractC5964.f15033;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ArrayList m12263(String str, ByteString byteString) throws EOFException, UnknownHostException {
        str.getClass();
        byteString.getClass();
        ArrayList arrayList = new ArrayList();
        C6921 c6921 = new C6921();
        c6921.m12030(byteString);
        c6921.readShort();
        short s = c6921.readShort();
        if (((s & 65535) >> 15) == 0) {
            C6755.m11869("not a response");
            return null;
        }
        int i = s & 15;
        if (i == 2) {
            throw new UnknownHostException(str.concat(": SERVFAIL"));
        }
        if (i == 3) {
            throw new UnknownHostException(str.concat(": NXDOMAIN"));
        }
        int i2 = c6921.readShort() & 65535;
        int i3 = c6921.readShort() & 65535;
        c6921.readShort();
        c6921.readShort();
        for (int i4 = 0; i4 < i2; i4++) {
            byte b = c6921.readByte();
            if (b < 0) {
                c6921.skip(1L);
            } else {
                while (b > 0) {
                    c6921.skip(b);
                    b = c6921.readByte();
                }
            }
            c6921.readShort();
            c6921.readShort();
        }
        for (int i5 = 0; i5 < i3; i5++) {
            byte b2 = c6921.readByte();
            if (b2 < 0) {
                c6921.skip(1L);
            } else {
                while (b2 > 0) {
                    c6921.skip(b2);
                    b2 = c6921.readByte();
                }
            }
            int i6 = c6921.readShort() & 65535;
            c6921.readShort();
            c6921.readInt();
            int i7 = c6921.readShort() & 65535;
            if (i6 == 1 || i6 == 28) {
                byte[] bArr = new byte[i7];
                c6921.read(bArr, 0, i7);
                InetAddress byAddress = InetAddress.getByAddress(bArr);
                byAddress.getClass();
                arrayList.add(byAddress);
            } else {
                c6921.skip(i7);
            }
        }
        return arrayList;
    }
}
