package p376;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import org.apache.commons.compress.archivers.zip.C5593;
import org.apache.commons.compress.archivers.zip.C5595;
import org.apache.commons.io.StandardLineSeparator;

/* JADX INFO: renamed from: 飘花落叶言苏子楪兰世哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8985 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final byte[] f25213;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ThreadLocal f25214;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final byte[] f25215;

    static {
        char c = File.separatorChar;
        f25215 = new byte[0];
        System.lineSeparator();
        StandardLineSeparator.LF.getString();
        StandardLineSeparator.CRLF.getString();
        f25214 = ThreadLocal.withInitial(new C5595(15));
        f25213 = new byte[8192];
        ThreadLocal.withInitial(new C5595(16));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m14586(C5593 c5593, BufferedOutputStream bufferedOutputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int i = c5593.read(bArr);
            if (-1 == i) {
                return;
            } else {
                bufferedOutputStream.write(bArr, 0, i);
            }
        }
    }
}
