package org.apache.commons.lang3;

import java.io.IOException;
import java.io.StringWriter;
import p371.AbstractC8968;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: org.apache.commons.lang3.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5695 extends AbstractC8968 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String f15630 = String.valueOf('\"');

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final char[] f15629 = {',', '\"', '\r', '\n'};

    @Override // p371.AbstractC8968
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int mo11003(CharSequence charSequence, int i, StringWriter stringWriter) throws IOException {
        char[] cArr;
        if (i != 0) {
            C5919.m11250("CsvEscaper should never reach the [1] index");
            return 0;
        }
        String string = charSequence.toString();
        int i2 = AbstractC5694.f15628;
        if (string == null || (cArr = f15629) == null) {
            stringWriter.write(charSequence.toString());
        } else {
            int length = string.length();
            int i3 = length - 1;
            int length2 = cArr.length;
            int i4 = length2 - 1;
            loop0: for (int i5 = 0; i5 < length; i5++) {
                char cCharAt = string.charAt(i5);
                for (int i6 = 0; i6 < length2; i6++) {
                    if (cArr[i6] == cCharAt && (!Character.isHighSurrogate(cCharAt) || i6 == i4 || (i5 < i3 && cArr[i6 + 1] == string.charAt(i5 + 1)))) {
                        stringWriter.write(34);
                        String string2 = charSequence.toString();
                        StringBuilder sb = new StringBuilder();
                        String str = f15630;
                        sb.append(str);
                        sb.append(str);
                        stringWriter.write(C5690.f15623.m10998(string2, str, sb.toString()));
                        stringWriter.write(34);
                        break loop0;
                    }
                }
            }
            stringWriter.write(charSequence.toString());
        }
        return Character.codePointCount(charSequence, 0, charSequence.length());
    }
}
