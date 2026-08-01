package org.apache.commons.compress.compressors.deflate64;

import androidx.activity.AbstractC0900;
import androidx.appcompat.widget.C1037;
import androidx.compose.p001ui.text.input.C2853;
import com.android.p002dx.p005io.Opcodes;
import com.bumptech.glide.AbstractC3889;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.util.Arrays;
import p025.AbstractC7012;
import p395.C9826;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: org.apache.commons.compress.compressors.deflate64.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6449 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final int[] f15829;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final int[] f15831;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C1037 f15834;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InputStream f15835;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public AbstractC3889 f15836;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C9826 f15837;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f15838;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final short[] f15832 = {96, 128, 160, 192, 224, 256, 288, 320, 353, 417, 481, 545, 610, 738, 866, 994, 1123, 1379, 1635, 1891, 2148, 2660, 3172, 3684, 4197, 5221, 6245, 7269, 112};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final int[] f15833 = {16, 32, 48, 64, 81, 113, 146, Opcodes.MUL_INT_LIT16, 275, 403, 532, 788, 1045, 1557, 2070, 3094, 4119, 6167, 8216, 12312, 16409, 24601, 32794, 49178, 65563, 98331, 131100, 196636, 262173, 393245, 524318, 786462};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final int[] f15830 = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};

    static {
        int[] iArr = new int[288];
        f15831 = iArr;
        Arrays.fill(iArr, 0, 144, 8);
        Arrays.fill(iArr, 144, 256, 9);
        Arrays.fill(iArr, 256, 280, 7);
        Arrays.fill(iArr, 280, 288, 8);
        int[] iArr2 = new int[32];
        Arrays.fill(iArr2, 5);
        f15829 = iArr2;
    }

    public C6449(InputStream inputStream) {
        C1037 c1037 = new C1037();
        c1037.f1088 = new byte[65536];
        this.f15834 = c1037;
        this.f15837 = new C9826(inputStream, ByteOrder.LITTLE_ENDIAN);
        this.f15835 = inputStream;
        this.f15836 = new C6451();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static int m11537(C9826 c9826, C2853 c2853) {
        while (c2853 != null && c2853.f6303 == -1) {
            c2853 = (C2853) (m11539(c9826, 1) == 0 ? c2853.f6302 : c2853.f6301);
        }
        if (c2853 != null) {
            return c2853.f6303;
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C2853 m11538(int[] iArr) {
        int[] iArr2 = new int[65];
        int iMax = 0;
        for (int i : iArr) {
            if (i < 0 || i > 64) {
                C6755.m11869(AbstractC0900.m722(i, "Invalid code ", " in literal table"));
                return null;
            }
            iMax = Math.max(iMax, i);
            iArr2[i] = iArr2[i] + 1;
        }
        int i2 = iMax + 1;
        int[] iArrCopyOf = Arrays.copyOf(iArr2, i2);
        int[] iArr3 = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 <= iMax; i4++) {
            i3 = (i3 + iArrCopyOf[i4]) << 1;
            iArr3[i4] = i3;
        }
        C2853 c2853 = new C2853(0);
        for (int i5 = 0; i5 < iArr.length; i5++) {
            int i6 = iArr[i5];
            if (i6 != 0) {
                int i7 = i6 - 1;
                int i8 = iArr3[i7];
                C2853 c28532 = c2853;
                int i9 = i7;
                while (true) {
                    int i10 = c28532.f6304;
                    if (i9 < 0) {
                        c28532.f6303 = i5;
                        c28532.f6302 = null;
                        c28532.f6301 = null;
                        iArr3[i7] = iArr3[i7] + 1;
                        break;
                    }
                    if (((1 << i9) & i8) == 0) {
                        if (((C2853) c28532.f6302) == null && c28532.f6303 == -1) {
                            c28532.f6302 = new C2853(i10 + 1);
                        }
                        c28532 = (C2853) c28532.f6302;
                    } else {
                        if (((C2853) c28532.f6301) == null && c28532.f6303 == -1) {
                            c28532.f6301 = new C2853(i10 + 1);
                        }
                        c28532 = (C2853) c28532.f6301;
                    }
                    if (c28532 == null) {
                        C6755.m11870("node doesn't exist in Huffman tree");
                        return null;
                    }
                    i9--;
                }
            }
        }
        return c2853;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static long m11539(C9826 c9826, int i) throws IOException {
        long jM15162 = c9826.m15162(i);
        if (jM15162 != -1) {
            return jM15162;
        }
        throw new EOFException("Truncated Deflate64 Stream");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15836 = new C6451();
        this.f15837 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m11540(int i, byte[] bArr, int i2) throws IOException {
        C9826 c9826;
        int iM11539;
        long jM11539;
        while (true) {
            if (this.f15838 && !this.f15836.mo7323()) {
                return -1;
            }
            if (this.f15836.mo7320() == HuffmanState.INITIAL) {
                boolean z = true;
                this.f15838 = m11539(this.f15837, 1) == 1;
                int i3 = 2;
                int iM115392 = (int) m11539(this.f15837, 2);
                if (iM115392 == 0) {
                    C9826 c98262 = this.f15837;
                    int i4 = c98262.f25606 % 8;
                    if (i4 > 0) {
                        c98262.m15161(i4);
                    }
                    long jM115392 = m11539(this.f15837, 16);
                    if ((65535 & (jM115392 ^ 65535)) != m11539(this.f15837, 16)) {
                        C6755.m11870("Illegal LEN / NLEN values");
                        return 0;
                    }
                    this.f15836 = new C6450(this, jM115392);
                } else if (iM115392 == 1) {
                    this.f15836 = new C6452(this, HuffmanState.FIXED_CODES, f15831, f15829);
                } else {
                    if (iM115392 != 2) {
                        C6755.m11870(AbstractC7012.m12147(iM115392, "Unsupported compression: "));
                        return 0;
                    }
                    int[][] iArr = {new int[(int) (m11539(this.f15837, 5) + 257)], new int[(int) (m11539(this.f15837, 5) + 1)]};
                    C9826 c98263 = this.f15837;
                    int[] iArr2 = iArr[0];
                    int[] iArr3 = iArr[1];
                    int iM115393 = (int) (m11539(c98263, 4) + 4);
                    int[] iArr4 = new int[19];
                    int i5 = 0;
                    while (i5 < iM115393) {
                        iArr4[f15830[i5]] = (int) m11539(c98263, 3);
                        i5++;
                        z = z;
                    }
                    boolean z2 = z;
                    C2853 c2853M11538 = m11538(iArr4);
                    int length = iArr2.length + iArr3.length;
                    int[] iArr5 = new int[length];
                    int i6 = 0;
                    int i7 = 0;
                    int i8 = -1;
                    while (i6 < length) {
                        if (i7 > 0) {
                            iArr5[i6] = i8;
                            i7--;
                            i6++;
                        } else {
                            int iM11537 = m11537(c98263, c2853M11538);
                            if (iM11537 >= 16) {
                                long j = 3;
                                switch (iM11537) {
                                    case 16:
                                        c9826 = c98263;
                                        iM11539 = (int) (m11539(c98263, i3) + 3);
                                        break;
                                    case 17:
                                        jM11539 = m11539(c98263, 3);
                                        i7 = (int) (jM11539 + j);
                                        i8 = 0;
                                        c9826 = c98263;
                                        iM11539 = i7;
                                        break;
                                    case 18:
                                        jM11539 = m11539(c98263, 7);
                                        j = 11;
                                        i7 = (int) (jM11539 + j);
                                        i8 = 0;
                                        c9826 = c98263;
                                        iM11539 = i7;
                                        break;
                                    default:
                                        c9826 = c98263;
                                        iM11539 = i7;
                                        break;
                                }
                            } else {
                                iArr5[i6] = iM11537;
                                iM11539 = i7;
                                i6++;
                                i8 = iM11537;
                                c9826 = c98263;
                            }
                            i7 = iM11539;
                            c98263 = c9826;
                            i3 = 2;
                        }
                    }
                    System.arraycopy(iArr5, 0, iArr2, 0, iArr2.length);
                    System.arraycopy(iArr5, iArr2.length, iArr3, 0, iArr3.length);
                    this.f15836 = new C6452(this, HuffmanState.DYNAMIC_CODES, iArr[0], iArr[z2 ? 1 : 0]);
                }
            } else {
                int iMo7322 = this.f15836.mo7322(bArr, i, i2);
                if (iMo7322 != 0) {
                    return iMo7322;
                }
            }
        }
    }
}
