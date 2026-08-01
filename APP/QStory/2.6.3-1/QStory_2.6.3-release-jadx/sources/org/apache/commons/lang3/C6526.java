package org.apache.commons.lang3;

import java.io.IOException;
import java.io.StringWriter;
import p387.AbstractC9798;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: org.apache.commons.lang3.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6526 extends AbstractC9798 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String f15975 = String.valueOf('\"');

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final char[] f15974 = {',', '\"', '\r', '\n'};

    @Override // p387.AbstractC9798
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int mo11619(CharSequence charSequence, int i, StringWriter stringWriter) throws IOException {
        char[] cArr;
        if (i != 0) {
            C6755.m11870("CsvEscaper should never reach the [1] index");
            return 0;
        }
        String string = charSequence.toString();
        int i2 = AbstractC6525.f15973;
        if (string == null || (cArr = f15974) == null) {
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
                        String str = f15975;
                        sb.append(str);
                        sb.append(str);
                        stringWriter.write(C6521.f15968.m11614(string2, str, sb.toString()));
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
