package p208n4;

import com.bumptech.glide.AbstractC1926h;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import p061L2.AbstractC0972l;
import p117X2.AbstractC1665j;
import p149d3.AbstractC1973a;
import p149d3.AbstractC1983k;
import p215o4.AbstractC2803b;
import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: n4.h */
/* JADX INFO: loaded from: classes.dex */
public class C2709h implements Serializable, Comparable {

    /* JADX INFO: renamed from: g */
    public static final C2709h f8630g = new C2709h(new byte[0]);

    /* JADX INFO: renamed from: d */
    public final byte[] f8631d;

    /* JADX INFO: renamed from: e */
    public transient int f8632e;

    /* JADX INFO: renamed from: f */
    public transient String f8633f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2709h(byte[] bArr) {
        AbstractC1665j.m2985e(bArr, "data");
        this.f8631d = bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public int mo4732a() {
        return this.f8631d.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public String mo4733b() {
        byte[] bArr = this.f8631d;
        char[] cArr = new char[bArr.length * 2];
        int i5 = 0;
        for (byte b2 : bArr) {
            int i6 = i5 + 1;
            char[] cArr2 = AbstractC2803b.f8827a;
            cArr[i5] = cArr2[(b2 >> 4) & 15];
            i5 += 2;
            cArr[i6] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public byte[] mo4734c() {
        return this.f8631d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2709h c2709h = (C2709h) obj;
        AbstractC1665j.m2985e(c2709h, "other");
        int iMo4732a = mo4732a();
        int iMo4732a2 = c2709h.mo4732a();
        int iMin = Math.min(iMo4732a, iMo4732a2);
        for (int i5 = 0; i5 < iMin; i5++) {
            int iMo4735d = mo4735d(i5) & 255;
            int iMo4735d2 = c2709h.mo4735d(i5) & 255;
            if (iMo4735d != iMo4735d2) {
                return iMo4735d < iMo4735d2 ? -1 : 1;
            }
        }
        if (iMo4732a == iMo4732a2) {
            return 0;
        }
        return iMo4732a < iMo4732a2 ? -1 : 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public byte mo4735d(int i5) {
        return this.f8631d[i5];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public boolean mo4736e(int i5, byte[] bArr, int i6, int i7) {
        AbstractC1665j.m2985e(bArr, "other");
        if (i5 < 0) {
            return false;
        }
        byte[] bArr2 = this.f8631d;
        return i5 <= bArr2.length - i7 && i6 >= 0 && i6 <= bArr.length - i7 && AbstractC1926h.m3562e(i5, i6, i7, bArr2, bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2709h) {
            C2709h c2709h = (C2709h) obj;
            int iMo4732a = c2709h.mo4732a();
            byte[] bArr = this.f8631d;
            if (iMo4732a == bArr.length && c2709h.mo4736e(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public boolean mo4737f(C2709h c2709h, int i5) {
        AbstractC1665j.m2985e(c2709h, "other");
        return c2709h.mo4736e(0, this.f8631d, 0, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public String mo4738g(Charset charset) {
        AbstractC1665j.m2985e(charset, "charset");
        return new String(this.f8631d, charset);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public C2709h mo4739h(int i5, int i6) {
        if (i5 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f8631d;
        if (i6 > bArr.length) {
            throw new IllegalArgumentException(AbstractC3202a.m5466a(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (i6 - i5 >= 0) {
            return (i5 == 0 && i6 == bArr.length) ? this : new C2709h(AbstractC0972l.m1996T(bArr, i5, i6));
        }
        throw new IllegalArgumentException("endIndex < beginIndex");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        int i5 = this.f8632e;
        if (i5 != 0) {
            return i5;
        }
        int iHashCode = Arrays.hashCode(this.f8631d);
        this.f8632e = iHashCode;
        return iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public C2709h mo4740i() {
        int i5 = 0;
        while (true) {
            byte[] bArr = this.f8631d;
            if (i5 >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i5];
            if (b2 >= 65 && b2 <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                AbstractC1665j.m2984d(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i5] = (byte) (b2 + 32);
                for (int i6 = i5 + 1; i6 < bArrCopyOf.length; i6++) {
                    byte b5 = bArrCopyOf[i6];
                    if (b5 >= 65 && b5 <= 90) {
                        bArrCopyOf[i6] = (byte) (b5 + 32);
                    }
                }
                return new C2709h(bArrCopyOf);
            }
            i5++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final String m4741j() {
        String str = this.f8633f;
        if (str != null) {
            return str;
        }
        byte[] bArrMo4734c = mo4734c();
        AbstractC1665j.m2985e(bArrMo4734c, "<this>");
        String str2 = new String(bArrMo4734c, AbstractC1973a.f6662a);
        this.f8633f = str2;
        return str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public void mo4742k(C2706e c2706e, int i5) {
        c2706e.write(this.f8631d, 0, i5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        byte b2;
        int i5;
        byte[] bArr = this.f8631d;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        loop0: while (true) {
            if (i6 >= length) {
                break;
            }
            byte b5 = bArr[i6];
            if (b5 >= 0) {
                int i9 = i8 + 1;
                if (i8 == 64) {
                    break;
                }
                if ((b5 != 10 && b5 != 13 && ((b5 >= 0 && b5 < 32) || (127 <= b5 && b5 < 160))) || b5 == 65533) {
                    break;
                }
                i7 += b5 < 65536 ? 1 : 2;
                i6++;
                while (true) {
                    i8 = i9;
                    if (i6 < length && (b2 = bArr[i6]) >= 0) {
                        i6++;
                        i9 = i8 + 1;
                        if (i8 == 64) {
                            break loop0;
                        }
                        if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (127 <= b2 && b2 < 160))) || b2 == 65533) {
                            break loop0;
                        }
                        i7 += b2 < 65536 ? 1 : 2;
                    } else {
                        break;
                    }
                }
            } else if ((b5 >> 5) == -2) {
                int i10 = i6 + 1;
                if (length > i10) {
                    byte b6 = bArr[i10];
                    if ((b6 & 192) == 128) {
                        int i11 = (b6 ^ 3968) ^ (b5 << 6);
                        if (i11 >= 128) {
                            i5 = i8 + 1;
                            if (i8 == 64) {
                                break;
                            }
                            if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
                                break;
                            }
                            i7 += i11 < 65536 ? 1 : 2;
                            i6 += 2;
                            i8 = i5;
                        } else if (i8 != 64) {
                            break;
                        }
                    } else if (i8 != 64) {
                        break;
                    }
                } else if (i8 != 64) {
                    break;
                }
            } else if ((b5 >> 4) == -2) {
                int i12 = i6 + 2;
                if (length > i12) {
                    byte b7 = bArr[i6 + 1];
                    if ((b7 & 192) == 128) {
                        byte b8 = bArr[i12];
                        if ((b8 & 192) == 128) {
                            int i13 = ((b8 ^ (-123008)) ^ (b7 << 6)) ^ (b5 << 12);
                            if (i13 < 2048) {
                                if (i8 != 64) {
                                    break;
                                }
                            } else if (55296 > i13 || i13 >= 57344) {
                                i5 = i8 + 1;
                                if (i8 == 64) {
                                    break;
                                }
                                if ((i13 != 10 && i13 != 13 && ((i13 >= 0 && i13 < 32) || (127 <= i13 && i13 < 160))) || i13 == 65533) {
                                    break;
                                }
                                i7 += i13 < 65536 ? 1 : 2;
                                i6 += 3;
                                i8 = i5;
                            } else if (i8 != 64) {
                                break;
                            }
                        } else if (i8 != 64) {
                            break;
                        }
                    } else if (i8 != 64) {
                        break;
                    }
                } else if (i8 != 64) {
                    break;
                }
            } else if ((b5 >> 3) == -2) {
                int i14 = i6 + 3;
                if (length > i14) {
                    byte b9 = bArr[i6 + 1];
                    if ((b9 & 192) == 128) {
                        byte b10 = bArr[i6 + 2];
                        if ((b10 & 192) == 128) {
                            byte b11 = bArr[i14];
                            if ((b11 & 192) == 128) {
                                int i15 = (((b11 ^ 3678080) ^ (b10 << 6)) ^ (b9 << 12)) ^ (b5 << 18);
                                if (i15 > 1114111) {
                                    if (i8 != 64) {
                                        break;
                                    }
                                } else if (55296 > i15 || i15 >= 57344) {
                                    if (i15 >= 65536) {
                                        i5 = i8 + 1;
                                        if (i8 == 64) {
                                            break;
                                        }
                                        if ((i15 != 10 && i15 != 13 && ((i15 >= 0 && i15 < 32) || (127 <= i15 && i15 < 160))) || i15 == 65533) {
                                            break;
                                        }
                                        i7 += i15 < 65536 ? 1 : 2;
                                        i6 += 4;
                                        i8 = i5;
                                    } else if (i8 != 64) {
                                        break;
                                    }
                                } else if (i8 != 64) {
                                    break;
                                }
                            } else if (i8 != 64) {
                                break;
                            }
                        } else if (i8 != 64) {
                            break;
                        }
                    } else if (i8 != 64) {
                        break;
                    }
                } else if (i8 != 64) {
                    break;
                }
            } else if (i8 != 64) {
                break;
            }
        }
        i7 = -1;
        if (i7 == -1) {
            if (bArr.length <= 64) {
                return "[hex=" + mo4733b() + ']';
            }
            StringBuilder sb = new StringBuilder("[size=");
            sb.append(bArr.length);
            sb.append(" hex=");
            if (64 > bArr.length) {
                throw new IllegalArgumentException(AbstractC3202a.m5466a(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
            }
            sb.append((64 == bArr.length ? this : new C2709h(AbstractC0972l.m1996T(bArr, 0, 64))).mo4733b());
            sb.append("…]");
            return sb.toString();
        }
        String strM4741j = m4741j();
        String strSubstring = strM4741j.substring(0, i7);
        AbstractC1665j.m2984d(strSubstring, "substring(...)");
        String strM3654Q = AbstractC1983k.m3654Q(AbstractC1983k.m3654Q(AbstractC1983k.m3654Q(strSubstring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
        if (i7 >= strM4741j.length()) {
            return "[text=" + strM3654Q + ']';
        }
        return "[size=" + bArr.length + " text=" + strM3654Q + "…]";
    }
}
