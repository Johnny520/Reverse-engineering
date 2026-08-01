package p303;

import kotlin.Metadata;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪子兰苏世哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m151d2 = {"L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏哲兰;", "", "", "input", "", "飘花落叶言子楪世苏哲兰", "(Ljava/lang/String;)[B", "core"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
public final class C9235 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final byte[] f23626;

    static {
        byte[] bArr = new byte[128];
        for (int i = 0; i < 128; i++) {
            bArr[i] = -1;
        }
        for (int i2 = 0; i2 < 26; i2++) {
            bArr[i2 + 65] = (byte) i2;
            bArr[i2 + 97] = (byte) (i2 + 26);
        }
        for (int i3 = 0; i3 < 10; i3++) {
            bArr[i3 + 48] = (byte) (i3 + 52);
        }
        bArr[43] = 62;
        bArr[47] = 63;
        f23626 = bArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final byte[] m14533(String input) {
        int i;
        char cCharAt;
        int i2;
        char cCharAt2;
        char cCharAt3;
        int i3;
        if (input == null || input.length() == 0) {
            return new byte[0];
        }
        int length = input.length();
        int i4 = (length <= 0 || input.charAt(length + (-1)) != '=') ? 0 : 1;
        if (length > 1 && input.charAt(length - 2) == '=') {
            i4++;
        }
        int i5 = ((length * 3) / 4) - i4;
        if (i5 < 0) {
            i5 = 0;
        }
        byte[] bArr = new byte[i5];
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7 = i3) {
            int i8 = i7 + 1;
            char cCharAt4 = input.charAt(i7);
            if (i8 < length) {
                i = i7 + 2;
                cCharAt = input.charAt(i8);
            } else {
                i = i8;
                cCharAt = 'A';
            }
            if (i < length) {
                i2 = i + 1;
                cCharAt2 = input.charAt(i);
            } else {
                i2 = i;
                cCharAt2 = 'A';
            }
            if (i2 < length) {
                i3 = i2 + 1;
                cCharAt3 = input.charAt(i2);
            } else {
                int i9 = i2;
                cCharAt3 = 'A';
                i3 = i9;
            }
            if (cCharAt4 >= 128 || cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128) {
                C6755.m11869("Invalid Base64 character");
                return null;
            }
            byte[] bArr2 = f23626;
            byte b = bArr2[cCharAt4];
            int i10 = ((cCharAt2 == '=' ? (byte) 0 : bArr2[cCharAt2]) << 6) | (bArr2[cCharAt] << 12) | (b << 18) | (cCharAt3 == '=' ? (byte) 0 : bArr2[cCharAt3]);
            if (i6 < i5) {
                bArr[i6] = (byte) (i10 >> 16);
                i6++;
            }
            if (i6 < i5) {
                bArr[i6] = (byte) (i10 >> 8);
                i6++;
            }
            if (i6 < i5) {
                bArr[i6] = (byte) i10;
                i6++;
            }
        }
        return bArr;
    }
}
