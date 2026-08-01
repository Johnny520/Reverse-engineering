package org.apache.commons.compress.compressors.deflate64;

import androidx.activity.AbstractC0053;
import androidx.appcompat.widget.C0190;
import androidx.compose.ui.text.input.C2019;
import com.android.dx.io.Opcodes;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.util.Arrays;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p007.AbstractC6136;
import p376.C8978;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: org.apache.commons.compress.compressors.deflate64.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5618 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final int[] f15484;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final int[] f15486;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C0190 f15489;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InputStream f15490;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public AbstractC4921 f15491;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public C8978 f15492;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f15493;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final short[] f15487 = {96, 128, 160, 192, 224, 256, 288, 320, 353, 417, 481, 545, 610, 738, 866, 994, 1123, 1379, 1635, 1891, 2148, 2660, 3172, 3684, 4197, 5221, 6245, 7269, 112};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final int[] f15488 = {16, 32, 48, 64, 81, 113, 146, Opcodes.MUL_INT_LIT16, 275, 403, 532, 788, 1045, 1557, 2070, 3094, 4119, 6167, 8216, 12312, 16409, 24601, 32794, 49178, 65563, 98331, 131100, 196636, 262173, 393245, 524318, 786462};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final int[] f15485 = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};

    static {
        int[] iArr = new int[288];
        f15486 = iArr;
        Arrays.fill(iArr, 0, 144, 8);
        Arrays.fill(iArr, 144, 256, 9);
        Arrays.fill(iArr, 256, 280, 7);
        Arrays.fill(iArr, 280, 288, 8);
        int[] iArr2 = new int[32];
        Arrays.fill(iArr2, 5);
        f15484 = iArr2;
    }

    public C5618(InputStream inputStream) {
        C0190 c0190 = new C0190();
        c0190.f743 = new byte[65536];
        this.f15489 = c0190;
        this.f15492 = new C8978(inputStream, ByteOrder.LITTLE_ENDIAN);
        this.f15490 = inputStream;
        this.f15491 = new C5620(8);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static int m10921(C8978 c8978, C2019 c2019) {
        while (c2019 != null && c2019.f5957 == -1) {
            c2019 = (C2019) (m10923(c8978, 1) == 0 ? c2019.f5956 : c2019.f5955);
        }
        if (c2019 != null) {
            return c2019.f5957;
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C2019 m10922(int[] iArr) {
        int[] iArr2 = new int[65];
        int iMax = 0;
        for (int i : iArr) {
            if (i < 0 || i > 64) {
                C5919.m11249(AbstractC0053.m161(i, "Invalid code ", " in literal table"));
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
        C2019 c2019 = new C2019(0);
        for (int i5 = 0; i5 < iArr.length; i5++) {
            int i6 = iArr[i5];
            if (i6 != 0) {
                int i7 = i6 - 1;
                int i8 = iArr3[i7];
                C2019 c20192 = c2019;
                int i9 = i7;
                while (true) {
                    int i10 = c20192.f5958;
                    if (i9 < 0) {
                        c20192.f5957 = i5;
                        c20192.f5956 = null;
                        c20192.f5955 = null;
                        iArr3[i7] = iArr3[i7] + 1;
                        break;
                    }
                    if (((1 << i9) & i8) == 0) {
                        if (((C2019) c20192.f5956) == null && c20192.f5957 == -1) {
                            c20192.f5956 = new C2019(i10 + 1);
                        }
                        c20192 = (C2019) c20192.f5956;
                    } else {
                        if (((C2019) c20192.f5955) == null && c20192.f5957 == -1) {
                            c20192.f5955 = new C2019(i10 + 1);
                        }
                        c20192 = (C2019) c20192.f5955;
                    }
                    if (c20192 == null) {
                        C5919.m11250("node doesn't exist in Huffman tree");
                        return null;
                    }
                    i9--;
                }
            }
        }
        return c2019;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static long m10923(C8978 c8978, int i) throws IOException {
        long jM14567 = c8978.m14567(i);
        if (jM14567 != -1) {
            return jM14567;
        }
        throw new EOFException("Truncated Deflate64 Stream");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15491 = new C5620(8);
        this.f15492 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m10924(int i, byte[] bArr, int i2) {
        C8978 c8978;
        int iM10923;
        long jM10923;
        while (true) {
            if (this.f15493 && !this.f15491.mo9907()) {
                return -1;
            }
            if (this.f15491.mo9905() == HuffmanState.INITIAL) {
                boolean z = true;
                this.f15493 = m10923(this.f15492, 1) == 1;
                int i3 = 2;
                int iM109232 = (int) m10923(this.f15492, 2);
                if (iM109232 == 0) {
                    C8978 c89782 = this.f15492;
                    int i4 = c89782.f25221 % 8;
                    if (i4 > 0) {
                        c89782.m14566(i4);
                    }
                    long jM109232 = m10923(this.f15492, 16);
                    if ((65535 & (jM109232 ^ 65535)) != m10923(this.f15492, 16)) {
                        C5919.m11250("Illegal LEN / NLEN values");
                        return 0;
                    }
                    this.f15491 = new C5619(this, jM109232);
                } else if (iM109232 == 1) {
                    this.f15491 = new C5621(this, HuffmanState.FIXED_CODES, f15486, f15484);
                } else {
                    if (iM109232 != 2) {
                        C5919.m11250(AbstractC6136.m11556(iM109232, "Unsupported compression: "));
                        return 0;
                    }
                    int[][] iArr = {new int[(int) (m10923(this.f15492, 5) + 257)], new int[(int) (m10923(this.f15492, 5) + 1)]};
                    C8978 c89783 = this.f15492;
                    int[] iArr2 = iArr[0];
                    int[] iArr3 = iArr[1];
                    int iM109233 = (int) (m10923(c89783, 4) + 4);
                    int[] iArr4 = new int[19];
                    int i5 = 0;
                    while (i5 < iM109233) {
                        iArr4[f15485[i5]] = (int) m10923(c89783, 3);
                        i5++;
                        z = z;
                    }
                    boolean z2 = z;
                    C2019 c2019M10922 = m10922(iArr4);
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
                            int iM10921 = m10921(c89783, c2019M10922);
                            if (iM10921 >= 16) {
                                long j = 3;
                                switch (iM10921) {
                                    case 16:
                                        c8978 = c89783;
                                        iM10923 = (int) (m10923(c89783, i3) + 3);
                                        break;
                                    case 17:
                                        jM10923 = m10923(c89783, 3);
                                        i7 = (int) (jM10923 + j);
                                        i8 = 0;
                                        c8978 = c89783;
                                        iM10923 = i7;
                                        break;
                                    case 18:
                                        jM10923 = m10923(c89783, 7);
                                        j = 11;
                                        i7 = (int) (jM10923 + j);
                                        i8 = 0;
                                        c8978 = c89783;
                                        iM10923 = i7;
                                        break;
                                    default:
                                        c8978 = c89783;
                                        iM10923 = i7;
                                        break;
                                }
                            } else {
                                iArr5[i6] = iM10921;
                                iM10923 = i7;
                                i6++;
                                i8 = iM10921;
                                c8978 = c89783;
                            }
                            i7 = iM10923;
                            c89783 = c8978;
                            i3 = 2;
                        }
                    }
                    System.arraycopy(iArr5, 0, iArr2, 0, iArr2.length);
                    System.arraycopy(iArr5, iArr2.length, iArr3, 0, iArr3.length);
                    this.f15491 = new C5621(this, HuffmanState.DYNAMIC_CODES, iArr[0], iArr[z2 ? 1 : 0]);
                }
            } else {
                int iMo9906 = this.f15491.mo9906(bArr, i, i2);
                if (iMo9906 != 0) {
                    return iMo9906;
                }
            }
        }
    }
}
