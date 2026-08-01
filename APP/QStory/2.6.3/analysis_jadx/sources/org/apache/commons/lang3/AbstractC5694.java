package org.apache.commons.lang3;

import java.io.IOException;
import java.io.StringWriter;
import java.io.UncheckedIOException;
import p371.AbstractC8967;
import p371.AbstractC8969;
import p371.C8965;
import p371.C8966;
import p371.C8970;
import p371.C8971;

/* JADX INFO: renamed from: org.apache.commons.lang3.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5694 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8970 f15627;

    static {
        C8965 c8965 = new C8965(new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"});
        String[][] strArr = AbstractC8967.f25193;
        AbstractC8969[] abstractC8969Arr = {new C8965((String[][]) strArr.clone())};
        AbstractC8969[] abstractC8969Arr2 = new AbstractC8969[2];
        abstractC8969Arr2[0] = c8965;
        System.arraycopy(abstractC8969Arr, 0, abstractC8969Arr2, 1, 1);
        C8970 c8970 = new C8970(abstractC8969Arr2);
        AbstractC8969[] abstractC8969Arr3 = {new C8966(0)};
        AbstractC8969[] abstractC8969Arr4 = new AbstractC8969[2];
        abstractC8969Arr4[0] = c8970;
        System.arraycopy(abstractC8969Arr3, 0, abstractC8969Arr4, 1, 1);
        f15627 = new C8970(new AbstractC8969[]{new C8965(new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"}, new String[]{"/", "\\/"}), new C8965((String[][]) strArr.clone()), new C8966(0)});
        String[][] strArr2 = AbstractC8967.f25186;
        C8965 c89652 = new C8965((String[][]) strArr2.clone());
        String[][] strArr3 = AbstractC8967.f25192;
        C8965 c89653 = new C8965((String[][]) strArr2.clone());
        String[][] strArr4 = AbstractC8967.f25190;
        new C8970(new AbstractC8969[]{new C8971(0), new C8971(1), new C8965((String[][]) AbstractC8967.f25194.clone()), new C8965(new String[]{"\\\\", "\\"}, new String[]{"\\\"", "\""}, new String[]{"\\'", "'"}, new String[]{"\\", ""})});
        String[][] strArr5 = AbstractC8967.f25185;
        C8965 c89654 = new C8965((String[][]) strArr5.clone());
        String[][] strArr6 = AbstractC8967.f25189;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String m11057(String str) {
        C8970 c8970 = f15627;
        c8970.getClass();
        if (str == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter(str.length() * 2);
            int length = str.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iMo11060 = c8970.mo11060(str, iCharCount, stringWriter);
                if (iMo11060 == 0) {
                    char cCharAt = str.charAt(iCharCount);
                    stringWriter.write(cCharAt);
                    int i = iCharCount + 1;
                    if (Character.isHighSurrogate(cCharAt) && i < length) {
                        char cCharAt2 = str.charAt(i);
                        if (Character.isLowSurrogate(cCharAt2)) {
                            stringWriter.write(cCharAt2);
                            iCharCount += 2;
                        }
                    }
                    iCharCount = i;
                } else {
                    for (int i2 = 0; i2 < iMo11060; i2++) {
                        iCharCount += Character.charCount(Character.codePointAt(str, iCharCount));
                    }
                }
            }
            return stringWriter.toString();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
