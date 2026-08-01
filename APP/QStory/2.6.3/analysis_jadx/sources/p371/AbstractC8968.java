package p371;

import java.io.StringWriter;

/* JADX INFO: renamed from: 飘花落叶言苏子哲兰楪世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8968 extends AbstractC8969 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract boolean mo14578(int i, StringWriter stringWriter);

    @Override // p371.AbstractC8969
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo11060(CharSequence charSequence, int i, StringWriter stringWriter) {
        return mo14578(Character.codePointAt(charSequence, i), stringWriter) ? 1 : 0;
    }
}
