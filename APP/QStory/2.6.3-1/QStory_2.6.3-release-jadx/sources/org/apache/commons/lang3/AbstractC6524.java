package org.apache.commons.lang3;

import java.io.IOException;
import java.io.StringWriter;
import java.io.UncheckedIOException;
import p387.AbstractC9796;
import p387.AbstractC9798;
import p387.C9794;
import p387.C9795;
import p387.C9799;
import p387.C9800;

/* JADX INFO: renamed from: org.apache.commons.lang3.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6524 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C9799 f15972;

    static {
        C9794 c9794 = new C9794(new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"});
        String[][] strArr = AbstractC9796.f25538;
        AbstractC9798[] abstractC9798Arr = {new C9794((String[][]) strArr.clone())};
        AbstractC9798[] abstractC9798Arr2 = new AbstractC9798[2];
        abstractC9798Arr2[0] = c9794;
        System.arraycopy(abstractC9798Arr, 0, abstractC9798Arr2, 1, 1);
        C9799 c9799 = new C9799(abstractC9798Arr2);
        AbstractC9798[] abstractC9798Arr3 = {new C9795(0)};
        AbstractC9798[] abstractC9798Arr4 = new AbstractC9798[2];
        abstractC9798Arr4[0] = c9799;
        System.arraycopy(abstractC9798Arr3, 0, abstractC9798Arr4, 1, 1);
        f15972 = new C9799(new AbstractC9798[]{new C9794(new String[]{"\"", "\\\""}, new String[]{"\\", "\\\\"}, new String[]{"/", "\\/"}), new C9794((String[][]) strArr.clone()), new C9795(0)});
        String[][] strArr2 = AbstractC9796.f25531;
        C9794 c97942 = new C9794((String[][]) strArr2.clone());
        String[][] strArr3 = AbstractC9796.f25537;
        C9794 c97943 = new C9794((String[][]) strArr2.clone());
        String[][] strArr4 = AbstractC9796.f25535;
        new C9799(new AbstractC9798[]{new C9800(0), new C9800(1), new C9794((String[][]) AbstractC9796.f25539.clone()), new C9794(new String[]{"\\\\", "\\"}, new String[]{"\\\"", "\""}, new String[]{"\\'", "'"}, new String[]{"\\", ""})});
        String[][] strArr5 = AbstractC9796.f25530;
        C9794 c97944 = new C9794((String[][]) strArr5.clone());
        String[][] strArr6 = AbstractC9796.f25534;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String m11616(String str) {
        C9799 c9799 = f15972;
        c9799.getClass();
        if (str == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter(str.length() * 2);
            int length = str.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iMo11619 = c9799.mo11619(str, iCharCount, stringWriter);
                if (iMo11619 == 0) {
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
                    for (int i2 = 0; i2 < iMo11619; i2++) {
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
