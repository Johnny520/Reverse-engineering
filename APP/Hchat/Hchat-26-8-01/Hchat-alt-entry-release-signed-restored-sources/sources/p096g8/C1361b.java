package p096g8;

import com.alibaba.fastjson2.JSONB;
import java.util.Arrays;
import p068eh.AbstractC0921a;
import p136j8.C2104o;

/* JADX INFO: renamed from: g8.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1361b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4510a;

    /* JADX INFO: renamed from: b */
    public final byte[] f4511b;

    /* JADX INFO: renamed from: c */
    public int f4512c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1361b(byte[] bArr, int i9, byte b10) {
        this.f4510a = i9;
        switch (i9) {
            case 1:
                this.f4511b = bArr == null ? new byte[0] : bArr;
                return;
            case 2:
            default:
                this.f4511b = bArr;
                return;
            case 3:
                int length = bArr.length;
                if (length < 0) {
                    C2104o.m5294t("end < start");
                    throw null;
                }
                if (length > bArr.length) {
                    C2104o.m5294t("end > bytes.length");
                    throw null;
                }
                this.f4511b = bArr;
                this.f4512c = length;
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void m3653a(int i9, int i10) {
        int i11 = this.f4512c;
        if (i9 < 0 || i10 < i9 || i10 > i11) {
            StringBuilder sbM2256s = AbstractC0921a.m2256s(i9, i10, "bad range: ", "..", "; actual size ");
            sbM2256s.append(i11);
            throw new IllegalArgumentException(sbM2256s.toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public int m3654b(int i9) {
        m3653a(i9, i9 + 4);
        return m3658f(i9 + 3) | (this.f4511b[i9] << 24) | (m3658f(i9 + 1) << 16) | (m3658f(i9 + 2) << 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public long m3655c(int i9) {
        m3653a(i9, i9 + 8);
        byte[] bArr = this.f4511b;
        int iM3658f = (bArr[i9] << 24) | (m3658f(i9 + 1) << 16) | (m3658f(i9 + 2) << 8) | m3658f(i9 + 3);
        return (((long) iM3658f) << 32) | (((long) (m3658f(i9 + 7) | (bArr[i9 + 4] << 24) | (m3658f(i9 + 5) << 16) | (m3658f(i9 + 6) << 8))) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public int m3656d(int i9) {
        m3653a(i9, i9 + 2);
        return m3658f(i9 + 1) | (this.f4511b[i9] << 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public int m3657e(int i9) {
        m3653a(i9, i9 + 1);
        return m3658f(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public int m3658f(int i9) {
        return this.f4511b[i9] & 255;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public int m3659g(int i9) {
        m3653a(i9, i9 + 2);
        return m3658f(i9 + 1) | (m3658f(i9) << 8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public byte[] m3660h() {
        switch (this.f4510a) {
            case 0:
                int iM3662j = m3662j();
                if (iM3662j >= 0) {
                    byte[] bArr = this.f4511b;
                    int length = bArr.length;
                    int i9 = this.f4512c;
                    if (iM3662j <= length - i9) {
                        byte[] bArr2 = new byte[iM3662j];
                        System.arraycopy(bArr, i9, bArr2, 0, iM3662j);
                        this.f4512c += iM3662j;
                    }
                }
                C2104o.m5276A("bytes长度异常");
                break;
            default:
                int iM3662j2 = m3662j();
                if (iM3662j2 >= 0) {
                    byte[] bArr3 = this.f4511b;
                    int length2 = bArr3.length;
                    int i10 = this.f4512c;
                    if (iM3662j2 <= length2 - i10) {
                        byte[] bArr4 = new byte[iM3662j2];
                        System.arraycopy(bArr3, i10, bArr4, 0, iM3662j2);
                        this.f4512c += iM3662j2;
                    }
                }
                C2104o.m5276A("bytes长度异常");
                break;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public String m3661i() {
        byte[] bArrM3660h = m3660h();
        try {
            return new String(bArrM3660h, "UTF-8");
        } catch (Throwable unused) {
            return new String(bArrM3660h);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public int m3662j() {
        switch (this.f4510a) {
            case 0:
                long jM3663k = m3663k();
                if (jM3663k > 2147483647L) {
                    C2104o.m5276A("varint过大");
                }
                break;
            default:
                long jM3663k2 = m3663k();
                if (jM3663k2 > 2147483647L) {
                    C2104o.m5276A("varint过大");
                }
                break;
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        return 0;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long m3663k() {
        switch (this.f4510a) {
            case 0:
                long j3 = 0;
                int i9 = 0;
                while (true) {
                    if (i9 >= 64) {
                        C2104o.m5276A("varint异常");
                    } else {
                        int i10 = this.f4512c;
                        int i11 = i10 + 1;
                        byte[] bArr = this.f4511b;
                        if (i11 > bArr.length) {
                            C2104o.m5276A("protobuf长度不足");
                        } else {
                            this.f4512c = i10 + 1;
                            byte b10 = bArr[i10];
                            j3 |= ((long) (b10 & JSONB.Constants.BC_SYMBOL)) << i9;
                            if ((b10 & 128) == 0) {
                                return j3;
                            }
                            i9 += 7;
                        }
                    }
                    break;
                }
                break;
            default:
                long j4 = 0;
                int i12 = 0;
                while (true) {
                    if (i12 >= 64) {
                        C2104o.m5276A("varint异常");
                    } else {
                        int i13 = this.f4512c;
                        int i14 = i13 + 1;
                        byte[] bArr2 = this.f4511b;
                        if (i14 > bArr2.length) {
                            C2104o.m5276A("protobuf长度不足");
                        } else {
                            this.f4512c = i13 + 1;
                            byte b11 = bArr2[i13];
                            j4 |= ((long) (b11 & JSONB.Constants.BC_SYMBOL)) << i12;
                            if ((b11 & 128) == 0) {
                                return j4;
                            }
                            i12 += 7;
                        }
                    }
                    break;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public void m3664l(int i9) {
        switch (this.f4510a) {
            case 0:
                if (i9 == 0) {
                    m3663k();
                } else if (i9 == 1) {
                    m3665m(8);
                } else if (i9 == 2) {
                    m3665m(m3662j());
                } else if (i9 != 5) {
                    C2104o.m5276A(AbstractC0921a.m2249l(i9, "不支持的wireType: "));
                } else {
                    m3665m(4);
                }
                break;
            default:
                if (i9 == 0) {
                    m3663k();
                } else if (i9 == 1) {
                    m3665m(8);
                } else if (i9 == 2) {
                    m3665m(m3662j());
                } else if (i9 != 5) {
                    C2104o.m5276A(AbstractC0921a.m2249l(i9, "不支持的wireType: "));
                } else {
                    m3665m(4);
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public void m3665m(int i9) {
        switch (this.f4510a) {
            case 0:
                if (i9 < 0) {
                    C2104o.m5276A("跳过长度异常");
                } else {
                    int i10 = this.f4512c;
                    if (i10 + i9 > this.f4511b.length) {
                        C2104o.m5276A("protobuf长度不足");
                    } else {
                        this.f4512c = i10 + i9;
                    }
                }
                break;
            default:
                if (i9 < 0) {
                    C2104o.m5276A("跳过长度异常");
                } else {
                    if (i9 >= 0) {
                        int i11 = this.f4512c;
                        if (i11 + i9 <= this.f4511b.length) {
                            this.f4512c = i11 + i9;
                        }
                    }
                    C2104o.m5276A("protobuf长度不足");
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public C1361b m3666n(int i9, int i10) {
        m3653a(i9, i10);
        return new C1361b(Arrays.copyOfRange(this.f4511b, i9, i10), 3, (byte) 0);
    }

    public C1361b(byte[] bArr, int i9) {
        this.f4510a = 2;
        this.f4511b = bArr;
        this.f4512c = i9;
    }
}
