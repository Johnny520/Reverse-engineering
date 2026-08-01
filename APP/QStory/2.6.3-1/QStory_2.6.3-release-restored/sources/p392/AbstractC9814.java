package p392;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import org.apache.commons.compress.archivers.zip.C6423;
import org.apache.commons.compress.archivers.zip.C6425;
import org.apache.commons.p014io.StandardLineSeparator;

/* JADX INFO: renamed from: 飘花落叶言苏子楪兰世哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9814 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final byte[] f25558;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ThreadLocal f25559;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final byte[] f25560;

    static {
        char c = File.separatorChar;
        f25560 = new byte[0];
        System.lineSeparator();
        StandardLineSeparator.LF.getString();
        StandardLineSeparator.CRLF.getString();
        f25559 = ThreadLocal.withInitial(new C6425(15));
        f25558 = new byte[8192];
        ThreadLocal.withInitial(new C6425(16));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m15145(C6423 c6423, BufferedOutputStream bufferedOutputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int i = c6423.read(bArr);
            if (-1 == i) {
                return;
            } else {
                bufferedOutputStream.write(bArr, 0, i);
            }
        }
    }
}
