package p371;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: 飘花落叶言苏子哲兰世楪.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8964 extends AbstractC8968 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f25190;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f25191;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final HashMap f25193 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashSet f25192 = new HashSet();

    public C8964(CharSequence[]... charSequenceArr) {
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        for (CharSequence[] charSequenceArr2 : charSequenceArr) {
            this.f25193.put(charSequenceArr2[0].toString(), charSequenceArr2[1].toString());
            this.f25192.add(Character.valueOf(charSequenceArr2[0].charAt(0)));
            int length = charSequenceArr2[0].length();
            i = length < i ? length : i;
            if (length > i2) {
                i2 = length;
            }
        }
        this.f25191 = i;
        this.f25190 = i2;
    }

    @Override // p371.AbstractC8968
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo11003(CharSequence charSequence, int i, StringWriter stringWriter) throws IOException {
        if (!this.f25192.contains(Character.valueOf(charSequence.charAt(i)))) {
            return 0;
        }
        int length = this.f25190;
        if (i + length > charSequence.length()) {
            length = charSequence.length() - i;
        }
        while (length >= this.f25191) {
            String str = (String) this.f25193.get(charSequence.subSequence(i, i + length).toString());
            if (str != null) {
                stringWriter.write(str);
                return length;
            }
            length--;
        }
        return 0;
    }
}
