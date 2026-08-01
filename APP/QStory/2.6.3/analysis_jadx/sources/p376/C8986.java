package p376;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Objects;

/* JADX INFO: renamed from: 飘花落叶言苏子楪兰世哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8986 extends RandomAccessFile {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final File f25216;

    public C8986(String str, String str2) {
        super(str, str2);
        this.f25216 = str != null ? new File(str) : null;
    }

    public final String toString() {
        return Objects.toString(this.f25216);
    }

    public C8986(File file, String str) {
        super(file, str);
        this.f25216 = file;
    }
}
