package p000;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: no */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class C0505no implements Serializable, Comparable {

    /* JADX INFO: renamed from: k */
    public static final C0505no f7266k = new C0505no(new byte[0]);

    /* JADX INFO: renamed from: h */
    public final byte[] f7267h;

    /* JADX INFO: renamed from: i */
    public transient int f7268i;

    /* JADX INFO: renamed from: j */
    public transient String f7269j;

    public C0505no(byte[] bArr) {
        bArr.getClass();
        this.f7267h = bArr;
    }

    /* JADX INFO: renamed from: a */
    public int mo3322a() {
        return this.f7267h.length;
    }

    /* JADX INFO: renamed from: b */
    public String mo3323b() {
        byte[] bArr = this.f7267h;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = AbstractC0570p7.f7992a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: c */
    public byte[] mo3324c() {
        return this.f7267h;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0505no c0505no = (C0505no) obj;
        c0505no.getClass();
        int iMo3322a = mo3322a();
        int iMo3322a2 = c0505no.mo3322a();
        int iMin = Math.min(iMo3322a, iMo3322a2);
        for (int i = 0; i < iMin; i++) {
            int iMo3325d = mo3325d(i) & 255;
            int iMo3325d2 = c0505no.mo3325d(i) & 255;
            if (iMo3325d != iMo3325d2) {
                return iMo3325d < iMo3325d2 ? -1 : 1;
            }
        }
        if (iMo3322a == iMo3322a2) {
            return 0;
        }
        return iMo3322a < iMo3322a2 ? -1 : 1;
    }

    /* JADX INFO: renamed from: d */
    public byte mo3325d(int i) {
        return this.f7267h[i];
    }

    /* JADX INFO: renamed from: e */
    public boolean mo3326e(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i >= 0) {
            byte[] bArr2 = this.f7267h;
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0505no) {
            C0505no c0505no = (C0505no) obj;
            int iMo3322a = c0505no.mo3322a();
            byte[] bArr = this.f7267h;
            if (iMo3322a == bArr.length && c0505no.mo3326e(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo3327f(C0505no c0505no, int i) {
        c0505no.getClass();
        return c0505no.mo3326e(0, this.f7267h, 0, i);
    }

    /* JADX INFO: renamed from: g */
    public String mo3328g(Charset charset) {
        charset.getClass();
        return new String(this.f7267h, charset);
    }

    /* JADX INFO: renamed from: h */
    public C0505no mo3329h(int i, int i2) {
        if (i < 0) {
            C0676s.m4651j("beginIndex < 0");
            return null;
        }
        byte[] bArr = this.f7267h;
        if (i2 > bArr.length) {
            C0676s.m4645c(vi0.m5694m(new StringBuilder("endIndex > length("), bArr.length, ')'));
            return null;
        }
        if (i2 - i >= 0) {
            return (i == 0 && i2 == bArr.length) ? this : new C0505no(AbstractC0460mg.m3092g0(bArr, i, i2));
        }
        C0676s.m4651j("endIndex < beginIndex");
        return null;
    }

    public int hashCode() {
        int i = this.f7268i;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f7267h);
        this.f7268i = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public C0505no mo3330i() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f7267h;
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
                return new C0505no(bArrCopyOf);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: j */
    public final String m3331j() {
        String str = this.f7269j;
        if (str != null) {
            return str;
        }
        byte[] bArrMo3324c = mo3324c();
        bArrMo3324c.getClass();
        String str2 = new String(bArrMo3324c, AbstractC0856wq.f12612a);
        this.f7269j = str2;
        return str2;
    }

    /* JADX INFO: renamed from: k */
    public void mo3332k(C0209fn c0209fn, int i) {
        c0209fn.write(this.f7267h, 0, i);
    }

    public String toString() {
        byte b;
        int i;
        C0505no c0505no = this;
        byte[] bArr = c0505no.f7267h;
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
            String strM3331j = c0505no.m3331j();
            String strM6010b0 = wv2.m6010b0(wv2.m6010b0(wv2.m6010b0(strM3331j.substring(0, i3), "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i3 >= strM3331j.length()) {
                return "[text=" + strM6010b0 + ']';
            }
            return "[size=" + bArr.length + " text=" + strM6010b0 + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + c0505no.mo3323b() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            C0676s.m4645c(vi0.m5694m(new StringBuilder("endIndex > length("), bArr.length, ')'));
            return null;
        }
        if (64 != bArr.length) {
            c0505no = new C0505no(AbstractC0460mg.m3092g0(bArr, 0, 64));
        }
        sb.append(c0505no.mo3323b());
        sb.append("…]");
        return sb.toString();
    }
}
