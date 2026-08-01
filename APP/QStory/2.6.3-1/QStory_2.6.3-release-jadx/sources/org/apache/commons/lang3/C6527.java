package org.apache.commons.lang3;

import androidx.activity.AbstractC0900;
import java.io.IOException;
import java.io.StringWriter;
import p387.AbstractC9798;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: org.apache.commons.lang3.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6527 extends AbstractC9798 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String f15977 = String.valueOf('\"');

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final char[] f15976 = {',', '\"', '\r', '\n'};

    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    @Override // p387.AbstractC9798
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo11619(CharSequence charSequence, int i, StringWriter stringWriter) throws IOException {
        if (i != 0) {
            C6755.m11870("CsvUnescaper should never reach the [1] index");
            return 0;
        }
        if (charSequence.charAt(0) != '\"' || charSequence.charAt(charSequence.length() - 1) != '\"') {
            stringWriter.write(charSequence.toString());
            return Character.codePointCount(charSequence, 0, charSequence.length());
        }
        String string = charSequence.subSequence(1, charSequence.length() - 1).toString();
        if (!AbstractC6525.m11618(string)) {
            char[] cArr = f15976;
            if (AbstractC6516.m11611(cArr)) {
                stringWriter.write(charSequence.toString());
            } else {
                int length = string.length();
                int length2 = cArr.length;
                int i2 = length - 1;
                int i3 = length2 - 1;
                loop0: for (int i4 = 0; i4 < length; i4++) {
                    char cCharAt = string.charAt(i4);
                    for (int i5 = 0; i5 < length2; i5++) {
                        if (cArr[i5] == cCharAt && (!Character.isHighSurrogate(cCharAt) || i5 == i3 || (i4 < i2 && cArr[i5 + 1] == string.charAt(i4 + 1)))) {
                            StringBuilder sb = new StringBuilder();
                            String str = f15977;
                            stringWriter.write(C6521.f15968.m11614(string, AbstractC0900.m711(sb, str, str), str));
                            break loop0;
                        }
                    }
                }
                stringWriter.write(charSequence.toString());
            }
        }
        return Character.codePointCount(charSequence, 0, charSequence.length());
    }
}
