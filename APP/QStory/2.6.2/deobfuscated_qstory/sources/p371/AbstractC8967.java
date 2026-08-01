package p371;

import java.io.StringWriter;

/* JADX INFO: renamed from: 飘花落叶言苏子哲兰世楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8967 extends AbstractC8968 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract boolean mo14546(int i, StringWriter stringWriter);

    @Override // p371.AbstractC8968
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo11003(CharSequence charSequence, int i, StringWriter stringWriter) {
        return mo14546(Character.codePointAt(charSequence, i), stringWriter) ? 1 : 0;
    }
}
