package p014;

import java.io.EOFException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import kotlin.text.AbstractC5131;
import okio.ByteString;
import p005.C6101;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子哲苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6189 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f16933 = 0;

    static {
        Charset charset = AbstractC5131.f14688;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ArrayList m11639(String str, ByteString byteString) throws EOFException, UnknownHostException {
        str.getClass();
        byteString.getClass();
        ArrayList arrayList = new ArrayList();
        C6101 c6101 = new C6101();
        c6101.m11476(byteString);
        c6101.readShort();
        short s = c6101.readShort();
        if (((s & 65535) >> 15) == 0) {
            C5919.m11249("not a response");
            return null;
        }
        int i = s & 15;
        if (i == 2) {
            throw new UnknownHostException(str.concat(": SERVFAIL"));
        }
        if (i == 3) {
            throw new UnknownHostException(str.concat(": NXDOMAIN"));
        }
        int i2 = c6101.readShort() & 65535;
        int i3 = c6101.readShort() & 65535;
        c6101.readShort();
        c6101.readShort();
        for (int i4 = 0; i4 < i2; i4++) {
            byte b = c6101.readByte();
            if (b < 0) {
                c6101.skip(1L);
            } else {
                while (b > 0) {
                    c6101.skip(b);
                    b = c6101.readByte();
                }
            }
            c6101.readShort();
            c6101.readShort();
        }
        for (int i5 = 0; i5 < i3; i5++) {
            byte b2 = c6101.readByte();
            if (b2 < 0) {
                c6101.skip(1L);
            } else {
                while (b2 > 0) {
                    c6101.skip(b2);
                    b2 = c6101.readByte();
                }
            }
            int i6 = c6101.readShort() & 65535;
            c6101.readShort();
            c6101.readInt();
            int i7 = c6101.readShort() & 65535;
            if (i6 == 1 || i6 == 28) {
                byte[] bArr = new byte[i7];
                c6101.read(bArr, 0, i7);
                InetAddress byAddress = InetAddress.getByAddress(bArr);
                byAddress.getClass();
                arrayList.add(byAddress);
            } else {
                c6101.skip(i7);
            }
        }
        return arrayList;
    }
}
