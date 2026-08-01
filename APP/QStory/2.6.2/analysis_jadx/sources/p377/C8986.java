package p377;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Objects;

/* JADX INFO: renamed from: 飘花落叶言苏子楪兰哲世.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8986 extends RandomAccessFile {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final File f25237;

    public C8986(String str, String str2) {
        super(str, str2);
        this.f25237 = str != null ? new File(str) : null;
    }

    public final String toString() {
        return Objects.toString(this.f25237);
    }

    public C8986(File file, String str) {
        super(file, str);
        this.f25237 = file;
    }
}
