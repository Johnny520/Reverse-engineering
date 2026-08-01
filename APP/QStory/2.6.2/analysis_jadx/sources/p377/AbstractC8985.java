package p377;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import org.apache.commons.compress.archivers.zip.C5592;
import org.apache.commons.compress.archivers.zip.C5594;
import org.apache.commons.io.StandardLineSeparator;

/* JADX INFO: renamed from: 飘花落叶言苏子楪兰哲世.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8985 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final byte[] f25234;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ThreadLocal f25235;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final byte[] f25236;

    static {
        char c = File.separatorChar;
        f25236 = new byte[0];
        System.lineSeparator();
        StandardLineSeparator.LF.getString();
        StandardLineSeparator.CRLF.getString();
        f25235 = ThreadLocal.withInitial(new C5594(15));
        f25234 = new byte[8192];
        ThreadLocal.withInitial(new C5594(16));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m14573(C5592 c5592, BufferedOutputStream bufferedOutputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int i = c5592.read(bArr);
            if (-1 == i) {
                return;
            } else {
                bufferedOutputStream.write(bArr, 0, i);
            }
        }
    }
}
