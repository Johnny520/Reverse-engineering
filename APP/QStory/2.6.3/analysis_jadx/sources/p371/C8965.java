package p371;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: 飘花落叶言苏子哲兰楪世.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8965 extends AbstractC8969 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f25180;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f25181;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final HashMap f25183 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashSet f25182 = new HashSet();

    public C8965(CharSequence[]... charSequenceArr) {
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        for (CharSequence[] charSequenceArr2 : charSequenceArr) {
            this.f25183.put(charSequenceArr2[0].toString(), charSequenceArr2[1].toString());
            this.f25182.add(Character.valueOf(charSequenceArr2[0].charAt(0)));
            int length = charSequenceArr2[0].length();
            i = length < i ? length : i;
            if (length > i2) {
                i2 = length;
            }
        }
        this.f25181 = i;
        this.f25180 = i2;
    }

    @Override // p371.AbstractC8969
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo11060(CharSequence charSequence, int i, StringWriter stringWriter) throws IOException {
        if (!this.f25182.contains(Character.valueOf(charSequence.charAt(i)))) {
            return 0;
        }
        int length = this.f25180;
        if (i + length > charSequence.length()) {
            length = charSequence.length() - i;
        }
        while (length >= this.f25181) {
            String str = (String) this.f25183.get(charSequence.subSequence(i, i + length).toString());
            if (str != null) {
                stringWriter.write(str);
                return length;
            }
            length--;
        }
        return 0;
    }
}
