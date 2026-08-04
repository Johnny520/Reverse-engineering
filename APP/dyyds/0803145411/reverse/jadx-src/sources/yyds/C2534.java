package yyds;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: yyds.ᲇᲁᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C2534 implements Serializable, Comparable {

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final C2534 f12475 = new C2534(new byte[0]);

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public transient String f12476;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final byte[] f12477;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public transient int f12478;

    public C2534(byte[] bArr) {
        this.f12477 = bArr;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2534 c2534 = (C2534) obj;
        int iMo4261 = mo4261();
        int iMo42612 = c2534.mo4261();
        int iMin = Math.min(iMo4261, iMo42612);
        for (int i = 0; i < iMin; i++) {
            int iMo4259 = mo4259(i) & 255;
            int iMo42592 = c2534.mo4259(i) & 255;
            if (iMo4259 != iMo42592) {
                return iMo4259 < iMo42592 ? -1 : 1;
            }
        }
        if (iMo4261 == iMo42612) {
            return 0;
        }
        return iMo4261 < iMo42612 ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2534) {
            C2534 c2534 = (C2534) obj;
            int iMo4261 = c2534.mo4261();
            byte[] bArr = this.f12477;
            if (iMo4261 == bArr.length && c2534.mo4266(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f12478;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f12477);
        this.f12478 = iHashCode;
        return iHashCode;
    }

    public String toString() {
        byte b;
        int i;
        C2534 c2534 = this;
        byte[] bArr = c2534.f12477;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                break;
            }
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                int i5 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (127 <= b2 && b2 < 160))) || b2 == 65533) {
                    break;
                }
                i3 += b2 < 65536 ? 1 : 2;
                i2++;
                while (true) {
                    i4 = i5;
                    if (i2 < length && (b = bArr[i2]) >= 0) {
                        i2++;
                        i5 = i4 + 1;
                        if (i4 == 64) {
                            break loop0;
                        }
                        if ((b != 10 && b != 13 && ((b >= 0 && b < 32) || (127 <= b && b < 160))) || b == 65533) {
                            break loop0;
                        }
                        i3 += b < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b2 >> 5) == -2) {
                int i6 = i2 + 1;
                if (length > i6) {
                    byte b3 = bArr[i6];
                    if ((b3 & 192) == 128) {
                        int i7 = (b3 ^ 3968) ^ (b2 << 6);
                        if (i7 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i7 != 10 && i7 != 13 && ((i7 >= 0 && i7 < 32) || (127 <= i7 && i7 < 160))) || i7 == 65533) {
                                break;
                            }
                            i3 += i7 < 65536 ? 1 : 2;
                            i2 += 2;
                            i4 = i;
                        } else if (i4 != 64) {
                            break;
                        }
                    } else if (i4 != 64) {
                        break;
                    }
                } else if (i4 != 64) {
                    break;
                }
            } else if ((b2 >> 4) == -2) {
                int i8 = i2 + 2;
                if (length > i8) {
                    byte b4 = bArr[i2 + 1];
                    if ((b4 & 192) == 128) {
                        byte b5 = bArr[i8];
                        if ((b5 & 192) == 128) {
                            int i9 = ((b5 ^ (-123008)) ^ (b4 << 6)) ^ (b2 << 12);
                            if (i9 < 2048) {
                                if (i4 != 64) {
                                    break;
                                }
                            } else if (55296 > i9 || i9 >= 57344) {
                                i = i4 + 1;
                                if (i4 == 64) {
                                    break;
                                }
                                if ((i9 != 10 && i9 != 13 && ((i9 >= 0 && i9 < 32) || (127 <= i9 && i9 < 160))) || i9 == 65533) {
                                    break;
                                }
                                i3 += i9 < 65536 ? 1 : 2;
                                i2 += 3;
                                i4 = i;
                            } else if (i4 != 64) {
                                break;
                            }
                        } else if (i4 != 64) {
                            break;
                        }
                    } else if (i4 != 64) {
                        break;
                    }
                } else if (i4 != 64) {
                    break;
                }
            } else if ((b2 >> 3) == -2) {
                int i10 = i2 + 3;
                if (length > i10) {
                    byte b6 = bArr[i2 + 1];
                    if ((b6 & 192) == 128) {
                        byte b7 = bArr[i2 + 2];
                        if ((b7 & 192) == 128) {
                            byte b8 = bArr[i10];
                            if ((b8 & 192) == 128) {
                                int i11 = (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12)) ^ (b2 << 18);
                                if (i11 > 1114111) {
                                    if (i4 != 64) {
                                        break;
                                    }
                                } else if (55296 > i11 || i11 >= 57344) {
                                    if (i11 >= 65536) {
                                        i = i4 + 1;
                                        if (i4 == 64) {
                                            break;
                                        }
                                        if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
                                            break;
                                        }
                                        i3 += i11 < 65536 ? 1 : 2;
                                        i2 += 4;
                                        i4 = i;
                                    } else if (i4 != 64) {
                                        break;
                                    }
                                } else if (i4 != 64) {
                                    break;
                                }
                            } else if (i4 != 64) {
                                break;
                            }
                        } else if (i4 != 64) {
                            break;
                        }
                    } else if (i4 != 64) {
                        break;
                    }
                } else if (i4 != 64) {
                    break;
                }
            } else if (i4 != 64) {
                break;
            }
        }
        i3 = -1;
        if (i3 != -1) {
            String strM4576 = c2534.m4576();
            String strM1598 = AbstractC0692.m1598(AbstractC0692.m1598(AbstractC0692.m1598(strM4576.substring(0, i3), "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i3 >= strM4576.length()) {
                return "[text=" + strM1598 + ']';
            }
            return "[size=" + bArr.length + " text=" + strM1598 + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + c2534.mo4265() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            C0188.m806(AbstractC0897.m1999(new StringBuilder("endIndex > length("), bArr.length, ')'));
            return null;
        }
        if (64 != bArr.length) {
            c2534 = new C2534(AbstractC2070.m3946(bArr, 0, 64));
        }
        sb.append(c2534.mo4265());
        sb.append("…]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public String mo4256(Charset charset) {
        return new String(this.f12477, charset);
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public C2534 mo4258(int i, int i2) {
        if (i < 0) {
            C0188.m798("beginIndex < 0");
            return null;
        }
        byte[] bArr = this.f12477;
        if (i2 > bArr.length) {
            C0188.m806(AbstractC0897.m1999(new StringBuilder("endIndex > length("), bArr.length, ')'));
            return null;
        }
        if (i2 - i >= 0) {
            return (i == 0 && i2 == bArr.length) ? this : new C2534(AbstractC2070.m3946(bArr, i, i2));
        }
        C0188.m798("endIndex < beginIndex");
        return null;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public byte mo4259(int i) {
        return this.f12477[i];
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public String mo4260() {
        byte[] bArr = AbstractC0496.f2433;
        byte[] bArr2 = this.f12477;
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr2[i];
            int i3 = i + 2;
            byte b2 = bArr2[i + 1];
            i += 3;
            byte b3 = bArr2[i3];
            bArr3[i2] = bArr[(b & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr3[i2 + 2] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 += 4;
            bArr3[i4] = bArr[b3 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b4 = bArr2[i];
            bArr3[i2] = bArr[(b4 & 255) >> 2];
            bArr3[i2 + 1] = bArr[(b4 & 3) << 4];
            bArr3[i2 + 2] = 61;
            bArr3[i2 + 3] = 61;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b5 = bArr2[i];
            byte b6 = bArr2[i5];
            bArr3[i2] = bArr[(b5 & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i2 + 2] = bArr[(b6 & 15) << 2];
            bArr3[i2 + 3] = 61;
        }
        return new String(bArr3, AbstractC0347.f1806);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public int mo4261() {
        return this.f12477.length;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public boolean mo4262(C2534 c2534, int i) {
        return c2534.mo4266(0, 0, i, this.f12477);
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final String m4576() {
        String str = this.f12476;
        if (str != null) {
            return str;
        }
        String str2 = new String(mo4267(), AbstractC0347.f1806);
        this.f12476 = str2;
        return str2;
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ */
    public void mo4263(C1507 c1507, int i) {
        c1507.m3018(i, this.f12477);
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public C2534 mo4264() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f12477;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                bArrCopyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new C2534(bArrCopyOf);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public String mo4265() {
        byte[] bArr = this.f12477;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = AbstractC0181.f1027;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public boolean mo4266(int i, int i2, int i3, byte[] bArr) {
        if (i >= 0) {
            byte[] bArr2 = this.f12477;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (bArr2[i4 + i] == bArr[i4 + i2]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public byte[] mo4267() {
        return this.f12477;
    }
}
