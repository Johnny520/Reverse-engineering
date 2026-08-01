package com.android.dx.util;

import androidx.activity.AbstractC0053;
import bsh.C2633;
import com.alibaba.fastjson2.C2942;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class HexParser {
    private HexParser() {
    }

    public static byte[] parse(String str) {
        char c;
        int iIndexOf;
        int length = str.length();
        int i = length / 2;
        byte[] bArr = new byte[i];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int iIndexOf2 = str.indexOf(10, i3);
            if (iIndexOf2 < 0) {
                iIndexOf2 = length;
            }
            int iIndexOf3 = str.indexOf(35, i3);
            String strSubstring = (iIndexOf3 < 0 || iIndexOf3 >= iIndexOf2) ? str.substring(i3, iIndexOf2) : str.substring(i3, iIndexOf3);
            int i5 = iIndexOf2 + 1;
            int iIndexOf4 = strSubstring.indexOf(58);
            char c2 = 16;
            if (iIndexOf4 != -1 && ((iIndexOf = strSubstring.indexOf(34)) == -1 || iIndexOf >= iIndexOf4)) {
                String strTrim = strSubstring.substring(i2, iIndexOf4).trim();
                strSubstring = strSubstring.substring(iIndexOf4 + 1);
                if (Integer.parseInt(strTrim, 16) != i4) {
                    C2633.m5339(AbstractC0053.m157("bogus offset marker: ", strTrim));
                    return null;
                }
            }
            int length2 = strSubstring.length();
            int i6 = i2;
            int i7 = i6;
            int i8 = -1;
            while (i6 < length2) {
                char cCharAt = strSubstring.charAt(i6);
                if (i7 != 0) {
                    if (cCharAt == '\"') {
                        c = c2;
                        i7 = 0;
                    } else {
                        bArr[i4] = (byte) cCharAt;
                        i4++;
                        c = c2;
                    }
                } else if (cCharAt <= ' ') {
                    c = 16;
                } else if (cCharAt != '\"') {
                    c = 16;
                    int iDigit = Character.digit(cCharAt, 16);
                    if (iDigit == -1) {
                        throw new RuntimeException("bogus digit character: \"" + cCharAt + "\"");
                    }
                    if (i8 == -1) {
                        i8 = iDigit;
                    } else {
                        bArr[i4] = (byte) ((i8 << 4) | iDigit);
                        i4++;
                        i8 = -1;
                    }
                } else {
                    if (i8 != -1) {
                        C2942.m6402(Hex.u4(i4), "spare digit around offset ");
                        return null;
                    }
                    i7 = 1;
                    c = 16;
                }
                i6++;
                c2 = c;
            }
            if (i8 != -1) {
                C2942.m6402(Hex.u4(i4), "spare digit around offset ");
                return null;
            }
            if (i7 != 0) {
                C2942.m6402(Hex.u4(i4), "unterminated quote around offset ");
                return null;
            }
            i3 = i5;
            i2 = 0;
        }
        if (i4 >= i) {
            return bArr;
        }
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, 0, bArr2, 0, i4);
        return bArr2;
    }
}
