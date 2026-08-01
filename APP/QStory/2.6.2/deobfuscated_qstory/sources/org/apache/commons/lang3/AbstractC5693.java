package org.apache.commons.lang3;

import java.io.IOException;
import java.io.StringWriter;
import java.io.UncheckedIOException;
import p371.AbstractC8966;
import p371.AbstractC8968;
import p371.C8964;
import p371.C8965;
import p371.C8969;
import p371.C8970;

/* JADX INFO: renamed from: org.apache.commons.lang3.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5693 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8969 f15627;

    static {
        C8964 c8964 = new C8964(new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"});
        String[][] strArr = AbstractC8966.f25203;
        AbstractC8968[] abstractC8968Arr = {new C8964((String[][]) strArr.clone())};
        AbstractC8968[] abstractC8968Arr2 = new AbstractC8968[2];
        abstractC8968Arr2[0] = c8964;
        System.arraycopy(abstractC8968Arr, 0, abstractC8968Arr2, 1, 1);
        C8969 c8969 = new C8969(abstractC8968Arr2);
        AbstractC8968[] abstractC8968Arr3 = {new C8965(0)};
        AbstractC8968[] abstractC8968Arr4 = new AbstractC8968[2];
        abstractC8968Arr4[0] = c8969;
        System.arraycopy(abstractC8968Arr3, 0, abstractC8968Arr4, 1, 1);
        f15627 = new C8969(new AbstractC8968[]{new C8964(new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"}, new String[]{"/", "\\/"}), new C8964((String[][]) strArr.clone()), new C8965(0)});
        String[][] strArr2 = AbstractC8966.f25196;
        C8964 c89642 = new C8964((String[][]) strArr2.clone());
        String[][] strArr3 = AbstractC8966.f25202;
        C8964 c89643 = new C8964((String[][]) strArr2.clone());
        String[][] strArr4 = AbstractC8966.f25200;
        new C8969(new AbstractC8968[]{new C8970(0), new C8970(1), new C8964((String[][]) AbstractC8966.f25204.clone()), new C8964(new String[]{"\\\\", "\\"}, new String[]{"\\\"", "\""}, new String[]{"\\'", "'"}, new String[]{"\\", ""})});
        String[][] strArr5 = AbstractC8966.f25195;
        C8964 c89644 = new C8964((String[][]) strArr5.clone());
        String[][] strArr6 = AbstractC8966.f25199;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String m11000(String str) {
        C8969 c8969 = f15627;
        c8969.getClass();
        if (str == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter(str.length() * 2);
            int length = str.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iMo11003 = c8969.mo11003(str, iCharCount, stringWriter);
                if (iMo11003 == 0) {
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
                    for (int i2 = 0; i2 < iMo11003; i2++) {
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
