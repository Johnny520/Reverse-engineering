package p371;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: renamed from: 飘花落叶言苏子哲兰楪世.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8972 extends AbstractC8968 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f25199;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f25200;

    public C8972(int i, int i2) {
        this.f25200 = i;
        this.f25199 = i2;
    }

    @Override // p371.AbstractC8968
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo14578(int i, StringWriter stringWriter) throws IOException {
        if (i < this.f25200 || i > this.f25199) {
            return false;
        }
        stringWriter.write("&#");
        stringWriter.write(Integer.toString(i, 10));
        stringWriter.write(59);
        return true;
    }
}
