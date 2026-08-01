package p371;

import java.io.IOException;
import java.io.StringWriter;

/* JADX INFO: renamed from: 飘花落叶言苏子哲兰世楪.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8971 extends AbstractC8967 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f25209;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f25210;

    public C8971(int i, int i2) {
        this.f25210 = i;
        this.f25209 = i2;
    }

    @Override // p371.AbstractC8967
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo14546(int i, StringWriter stringWriter) throws IOException {
        if (i < this.f25210 || i > this.f25209) {
            return false;
        }
        stringWriter.write("&#");
        stringWriter.write(Integer.toString(i, 10));
        stringWriter.write(59);
        return true;
    }
}
