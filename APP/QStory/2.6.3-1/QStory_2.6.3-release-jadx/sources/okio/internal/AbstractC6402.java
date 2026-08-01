package okio.internal;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.EOFException;
import kotlin.text.AbstractC5964;
import p020.C6921;
import p020.C6927;
import p020.C6938;

/* JADX INFO: renamed from: okio.internal.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6402 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long[] f15698;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final byte[] f15699;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(AbstractC5964.f15033);
        bytes.getClass();
        f15699 = bytes;
        f15698 = new long[]{-1, 9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, Long.MAX_VALUE};
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005a, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007c, code lost:
    
        return r9;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m11498(C6921 c6921, C6938 c6938, boolean z) {
        int i;
        int i2;
        int i3;
        C6927 c6927;
        int i4;
        c6938.getClass();
        C6927 c69272 = c6921.f16993;
        if (c69272 != null) {
            byte[] bArr = c69272.f17014;
            int i5 = c69272.f17013;
            int i6 = c69272.f17012;
            int[] iArr = c6938.f17036;
            C6927 c69273 = c69272;
            int i7 = -1;
            int i8 = 0;
            loop0: while (true) {
                int i9 = i8 + 1;
                int i10 = iArr[i8];
                int i11 = i8 + 2;
                int i12 = iArr[i9];
                if (i12 != -1) {
                    i7 = i12;
                }
                if (c69273 == null) {
                    break;
                }
                if (i10 >= 0) {
                    int i13 = i5 + 1;
                    int i14 = bArr[i5] & DefaultClassResolver.NAME;
                    int i15 = i11 + i10;
                    while (i11 != i15) {
                        if (i14 == iArr[i11]) {
                            i = iArr[i11 + i10];
                            if (i13 == i6) {
                                c69273 = c69273.f17009;
                                c69273.getClass();
                                int i16 = c69273.f17013;
                                byte[] bArr2 = c69273.f17014;
                                i2 = c69273.f17012;
                                if (c69273 == c69272) {
                                    i3 = i16;
                                    bArr = bArr2;
                                    c69273 = null;
                                } else {
                                    i3 = i16;
                                    bArr = bArr2;
                                }
                            } else {
                                i2 = i6;
                                i3 = i13;
                            }
                            if (i >= 0) {
                                return i;
                            }
                            int i17 = i2;
                            i8 = -i;
                            i5 = i3;
                            i6 = i17;
                        } else {
                            i11++;
                        }
                    }
                    break loop0;
                }
                int i18 = (i10 * (-1)) + i11;
                while (true) {
                    int i19 = i5 + 1;
                    int i20 = i11 + 1;
                    if ((bArr[i5] & DefaultClassResolver.NAME) != iArr[i11]) {
                        break loop0;
                    }
                    boolean z2 = i20 == i18;
                    if (i19 == i6) {
                        c69273.getClass();
                        C6927 c69274 = c69273.f17009;
                        c69274.getClass();
                        i3 = c69274.f17013;
                        byte[] bArr3 = c69274.f17014;
                        i4 = c69274.f17012;
                        if (c69274 != c69272) {
                            c6927 = c69274;
                            bArr = bArr3;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr3;
                            c6927 = null;
                        }
                    } else {
                        c6927 = c69273;
                        i4 = i6;
                        i3 = i19;
                    }
                    if (z2) {
                        i = iArr[i20];
                        int i21 = i4;
                        c69273 = c6927;
                        i2 = i21;
                        break;
                    }
                    i5 = i3;
                    i6 = i4;
                    c69273 = c6927;
                    i11 = i20;
                }
            }
        } else {
            return z ? -2 : -1;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String m11499(C6921 c6921, long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (c6921.m12045(j2) == 13) {
                String strM12036 = c6921.m12036(j2, AbstractC5964.f15033);
                c6921.skip(2L);
                return strM12036;
            }
        }
        String strM120362 = c6921.m12036(j, AbstractC5964.f15033);
        c6921.skip(1L);
        return strM120362;
    }
}
