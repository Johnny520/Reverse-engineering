package p368;

import bsh.C3466;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: 飘花落叶言苏哲楪兰世子.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9699 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f25360 = 0;

    static {
        "CHECK_";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m15095(String str, String str2) {
        int length = str.length();
        int i = length / 2;
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < length; i2 += 2) {
            bArr[i2 / 2] = (byte) (Character.digit(str.charAt(i2 + 1), 16) + (Character.digit(str.charAt(i2), 16) << 4));
        }
        byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) (bArr[i3] ^ bytes[i3 % bytes.length]);
        }
        String str3 = new String(bArr2, StandardCharsets.UTF_8);
        if (str3.startsWith("CHECK_")) {
            return str3.substring("CHECK_".length());
        }
        C3466.m5899("解密失败：数据校验未通过:".concat(str));
        return null;
    }
}
