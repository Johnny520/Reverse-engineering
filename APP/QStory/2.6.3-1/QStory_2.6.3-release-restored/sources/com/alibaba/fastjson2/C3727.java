package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC3682;
import com.alibaba.fastjson2.util.AbstractC3687;
import com.android.p002dx.p005io.Opcodes;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Objects;
import java.util.function.BiFunction;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3727 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C3727 f9489;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C3727 f9490;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public String f9491;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f9492;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f9493;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3727 f9494;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C3727 f9488 = new C3727((C3727) null, "$");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C3727 f9487 = new C3727((C3727) null, "#");

    public C3727(C3727 c3727, String str) {
        this.f9494 = c3727;
        this.f9493 = str;
        this.f9492 = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3727.class == obj.getClass()) {
            C3727 c3727 = (C3727) obj;
            if (this.f9492 == c3727.f9492 && Objects.equals(this.f9494, c3727.f9494) && Objects.equals(this.f9493, c3727.f9493)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f9494, this.f9493, Integer.valueOf(this.f9492));
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x02c9 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018e A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        byte b;
        char c;
        int i;
        int i2;
        int i3;
        char c2;
        int i4;
        int i5;
        String str = this.f9491;
        if (str != null) {
            return str;
        }
        byte[] bArrCopyOf = new byte[16];
        C3727[] c3727Arr = new C3727[4];
        int i6 = 0;
        for (C3727 c3727 = this; c3727 != null; c3727 = c3727.f9494) {
            if (c3727Arr.length == i6) {
                c3727Arr = (C3727[]) Arrays.copyOf(c3727Arr, c3727Arr.length + 4);
            }
            c3727Arr[i6] = c3727;
            i6++;
        }
        char c3 = 1;
        int i7 = i6 - 1;
        boolean z = true;
        int i8 = i7;
        int i9 = 0;
        while (i8 >= 0) {
            C3727 c37272 = c3727Arr[i8];
            String str2 = c37272.f9493;
            if (str2 == null) {
                int i10 = c37272.f9492;
                int iM6316 = AbstractC3682.m6316(i10);
                while (i9 + iM6316 + 2 >= bArrCopyOf.length) {
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + (bArrCopyOf.length >> c3));
                }
                bArrCopyOf[i9] = 91;
                int i11 = i9 + 1 + iM6316;
                AbstractC3682.m6296(i10, bArrCopyOf, i11);
                i9 = i11 + 1;
                bArrCopyOf[i11] = 93;
            } else {
                int i12 = i9 + 1;
                if (i12 >= bArrCopyOf.length) {
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + (bArrCopyOf.length >> c3));
                }
                if (i8 != i7) {
                    bArrCopyOf[i9] = 46;
                    i9 = i12;
                }
                char c4 = 55296;
                char c5 = 127;
                char c6 = '~';
                if (AbstractC3687.f9263 == 8) {
                    char[] cArrM6330 = AbstractC3687.m6330(str2);
                    int i13 = 0;
                    while (i13 < cArrM6330.length) {
                        char c7 = cArrM6330[i13];
                        if (c7 != '`' && c7 != '~') {
                            switch (c7) {
                                default:
                                    switch (c7) {
                                        default:
                                            switch (c7) {
                                                default:
                                                    switch (c7) {
                                                        case '[':
                                                        case '\\':
                                                        case ']':
                                                        case '^':
                                                            break;
                                                        default:
                                                            if (c7 < c3 || c7 > c5) {
                                                                c2 = c3;
                                                                if (c7 >= c4 && c7 < 57344) {
                                                                    if (c7 < 56320) {
                                                                        if (str2.length() - i13 < 2) {
                                                                            i5 = -1;
                                                                        } else {
                                                                            char cCharAt = str2.charAt(i13 + 1);
                                                                            if (cCharAt < 56320 || cCharAt >= 57344) {
                                                                                i4 = i9 + 1;
                                                                                bArrCopyOf[i9] = 63;
                                                                            } else {
                                                                                i5 = ((c7 << '\n') + cCharAt) - 56613888;
                                                                            }
                                                                        }
                                                                        if (i5 < 0) {
                                                                            if (i9 == bArrCopyOf.length) {
                                                                                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + (bArrCopyOf.length >> 1));
                                                                            }
                                                                            i4 = i9 + 1;
                                                                            bArrCopyOf[i9] = 63;
                                                                        } else {
                                                                            int i14 = i9 + 3;
                                                                            if (i14 >= bArrCopyOf.length) {
                                                                                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + (bArrCopyOf.length >> 1));
                                                                            }
                                                                            bArrCopyOf[i9] = (byte) ((i5 >> 18) | 240);
                                                                            bArrCopyOf[i9 + 1] = (byte) (((i5 >> 12) & 63) | 128);
                                                                            bArrCopyOf[i9 + 2] = (byte) (((i5 >> 6) & 63) | 128);
                                                                            bArrCopyOf[i14] = (byte) ((i5 & 63) | 128);
                                                                            i4 = i9 + 4;
                                                                            i13++;
                                                                        }
                                                                    } else {
                                                                        i4 = i9 + 1;
                                                                        bArrCopyOf[i9] = 63;
                                                                    }
                                                                    i9 = i4;
                                                                } else if (c7 > 2047) {
                                                                    int i15 = i9 + 2;
                                                                    if (i15 >= bArrCopyOf.length) {
                                                                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + (bArrCopyOf.length >> 1));
                                                                    }
                                                                    bArrCopyOf[i9] = (byte) (((c7 >> '\f') & 15) | Opcodes.SHL_INT_LIT8);
                                                                    bArrCopyOf[i9 + 1] = (byte) (((c7 >> 6) & 63) | 128);
                                                                    bArrCopyOf[i15] = (byte) ((c7 & '?') | 128);
                                                                    i9 += 3;
                                                                } else {
                                                                    int i16 = i9 + 1;
                                                                    if (i16 >= bArrCopyOf.length) {
                                                                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + (bArrCopyOf.length >> 1));
                                                                    }
                                                                    bArrCopyOf[i9] = (byte) (((c7 >> 6) & 31) | 192);
                                                                    bArrCopyOf[i16] = (byte) ((c7 & '?') | 128);
                                                                    i9 += 2;
                                                                }
                                                                z = false;
                                                            } else {
                                                                if (i9 == bArrCopyOf.length) {
                                                                    c2 = c3;
                                                                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + (bArrCopyOf.length >> 1));
                                                                } else {
                                                                    c2 = c3;
                                                                }
                                                                bArrCopyOf[i9] = (byte) c7;
                                                                i9++;
                                                            }
                                                            break;
                                                    }
                                                case ':':
                                                case ';':
                                                case '<':
                                                case '=':
                                                case '>':
                                                case '?':
                                                case '@':
                                                    break;
                                            }
                                        case '%':
                                        case '&':
                                        case '\'':
                                        case '(':
                                        case ')':
                                        case '*':
                                        case '+':
                                        case ',':
                                        case '-':
                                        case '.':
                                        case '/':
                                            break;
                                    }
                                case '!':
                                case '\"':
                                case '#':
                                    break;
                            }
                        } else {
                            c2 = c3;
                            int i17 = i9 + 1;
                            if (i17 >= bArrCopyOf.length) {
                                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + (bArrCopyOf.length >> 1));
                            }
                            bArrCopyOf[i9] = 92;
                            bArrCopyOf[i17] = (byte) c7;
                            i9 += 2;
                        }
                        i13++;
                        c3 = c2;
                        c4 = 55296;
                        c5 = 127;
                    }
                } else {
                    c = c3;
                    int i18 = 0;
                    while (i18 < str2.length()) {
                        char cCharAt2 = str2.charAt(i18);
                        if (cCharAt2 != '`' && cCharAt2 != c6) {
                            switch (cCharAt2) {
                                default:
                                    switch (cCharAt2) {
                                        default:
                                            switch (cCharAt2) {
                                                default:
                                                    switch (cCharAt2) {
                                                        case '[':
                                                        case '\\':
                                                        case ']':
                                                        case '^':
                                                            break;
                                                        default:
                                                            char c8 = c;
                                                            if (cCharAt2 < c8 || cCharAt2 > 127) {
                                                                if (cCharAt2 >= 55296 && cCharAt2 < 57344) {
                                                                    if (cCharAt2 < 56320) {
                                                                        if (str2.length() - i18 < 2) {
                                                                            i2 = -1;
                                                                        } else {
                                                                            char cCharAt3 = str2.charAt(i18 + 1);
                                                                            if (cCharAt3 < 56320 || cCharAt3 >= 57344) {
                                                                                i = i9 + 1;
                                                                                bArrCopyOf[i9] = 63;
                                                                            } else {
                                                                                i2 = ((cCharAt2 << '\n') + cCharAt3) - 56613888;
                                                                            }
                                                                        }
                                                                        if (i2 < 0) {
                                                                            if (i9 == bArrCopyOf.length) {
                                                                                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + (bArrCopyOf.length >> 1));
                                                                            }
                                                                            i3 = i9 + 1;
                                                                            bArrCopyOf[i9] = 63;
                                                                        } else {
                                                                            i3 = i9 + 4;
                                                                            if (i3 >= bArrCopyOf.length) {
                                                                                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + (bArrCopyOf.length >> 1));
                                                                            }
                                                                            bArrCopyOf[i9] = (byte) ((i2 >> 18) | 240);
                                                                            bArrCopyOf[i9 + 1] = (byte) (((i2 >> 12) & 63) | 128);
                                                                            bArrCopyOf[i9 + 2] = (byte) (((i2 >> 6) & 63) | 128);
                                                                            bArrCopyOf[i9 + 3] = (byte) ((i2 & 63) | 128);
                                                                            i18++;
                                                                        }
                                                                        i9 = i3;
                                                                    } else {
                                                                        i = i9 + 1;
                                                                        bArrCopyOf[i9] = 63;
                                                                    }
                                                                    i9 = i;
                                                                } else if (cCharAt2 > 2047) {
                                                                    int i19 = i9 + 2;
                                                                    if (i19 >= bArrCopyOf.length) {
                                                                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + (bArrCopyOf.length >> 1));
                                                                    }
                                                                    bArrCopyOf[i9] = (byte) (((cCharAt2 >> '\f') & 15) | Opcodes.SHL_INT_LIT8);
                                                                    bArrCopyOf[i9 + 1] = (byte) (((cCharAt2 >> 6) & 63) | 128);
                                                                    bArrCopyOf[i19] = (byte) ((cCharAt2 & '?') | 128);
                                                                    i9 += 3;
                                                                } else {
                                                                    int i20 = i9 + 1;
                                                                    if (i20 >= bArrCopyOf.length) {
                                                                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + (bArrCopyOf.length >> 1));
                                                                    }
                                                                    bArrCopyOf[i9] = (byte) (((cCharAt2 >> 6) & 31) | 192);
                                                                    bArrCopyOf[i20] = (byte) ((cCharAt2 & '?') | 128);
                                                                    i9 += 2;
                                                                }
                                                                z = false;
                                                            } else {
                                                                if (i9 == bArrCopyOf.length) {
                                                                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + (bArrCopyOf.length >> c8));
                                                                }
                                                                bArrCopyOf[i9] = (byte) cCharAt2;
                                                                i9++;
                                                            }
                                                            c = 1;
                                                            break;
                                                    }
                                                case ':':
                                                case ';':
                                                case '<':
                                                case '=':
                                                case '>':
                                                case '?':
                                                case '@':
                                                    break;
                                            }
                                        case '%':
                                        case '&':
                                        case '\'':
                                        case '(':
                                        case ')':
                                        case '*':
                                        case '+':
                                        case ',':
                                        case '-':
                                        case '.':
                                        case '/':
                                            break;
                                    }
                                case '!':
                                case '\"':
                                case '#':
                                    break;
                            }
                        } else {
                            int i21 = i9 + 1;
                            if (i21 >= bArrCopyOf.length) {
                                c = 1;
                                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + (bArrCopyOf.length >> 1));
                            } else {
                                c = 1;
                            }
                            bArrCopyOf[i9] = 92;
                            bArrCopyOf[i21] = (byte) cCharAt2;
                            i9 += 2;
                        }
                        i18++;
                        c6 = '~';
                    }
                    i8--;
                    c3 = c;
                }
            }
            c = c3;
            i8--;
            c3 = c;
        }
        if (z) {
            BiFunction biFunction = AbstractC3687.f9267;
            if (biFunction != null) {
                if (i9 == bArrCopyOf.length) {
                    b = 0;
                } else {
                    byte[] bArr = new byte[i9];
                    b = 0;
                    System.arraycopy(bArrCopyOf, 0, bArr, 0, i9);
                    bArrCopyOf = bArr;
                }
                String str3 = (String) biFunction.apply(bArrCopyOf, Byte.valueOf(b));
                this.f9491 = str3;
                return str3;
            }
            if (AbstractC3687.f9268 != null) {
                char[] cArr = new char[i9];
                for (int i22 = 0; i22 < i9; i22++) {
                    cArr[i22] = (char) bArrCopyOf[i22];
                }
                String str4 = (String) AbstractC3687.f9268.apply(cArr, Boolean.TRUE);
                this.f9491 = str4;
                return str4;
            }
        }
        String str5 = new String(bArrCopyOf, 0, i9, z ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8);
        this.f9491 = str5;
        return str5;
    }

    public C3727(C3727 c3727, int i) {
        this.f9494 = c3727;
        this.f9493 = null;
        this.f9492 = i;
    }
}
