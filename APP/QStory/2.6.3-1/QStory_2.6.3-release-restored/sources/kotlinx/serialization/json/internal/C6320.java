package kotlinx.serialization.json.internal;

import net.bytebuddy.asm.Advice;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6320 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final char[] f15513 = new char[117];

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final byte[] f15512 = new byte[126];

    static {
        for (int i = 0; i < 32; i++) {
        }
        m11203(8, 'b');
        m11203(9, Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL);
        m11203(10, 'n');
        m11203(12, 'f');
        m11203(13, Advice.OffsetMapping.ForOrigin.Renderer.ForReturnTypeName.SYMBOL);
        m11203(47, '/');
        m11203(34, '\"');
        m11203(92, '\\');
        byte[] bArr = f15512;
        for (int i2 = 0; i2 < 33; i2++) {
            bArr[i2] = 127;
        }
        bArr[9] = 3;
        bArr[10] = 3;
        bArr[13] = 3;
        bArr[32] = 3;
        bArr[44] = 4;
        bArr[58] = 5;
        bArr[123] = 6;
        bArr[125] = 7;
        bArr[91] = 8;
        bArr[93] = 9;
        bArr[34] = 1;
        bArr[92] = 2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m11203(int i, char c) {
        if (c != 'u') {
            f15513[c] = (char) i;
        }
    }
}
