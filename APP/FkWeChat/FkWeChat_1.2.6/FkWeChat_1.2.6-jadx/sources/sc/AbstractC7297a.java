package sc;

import com.alibaba.fastjson2.JSONB;
import p172l8.C4700i0;
import p299ub.AbstractC8611a0;
import p309v5.C8825g;

/* JADX INFO: renamed from: sc.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7297a {
    /* JADX INFO: renamed from: a */
    public static final String m28924a(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = i10;
        bArr.getClass();
        if (i17 < 0 || i11 > bArr.length || i17 > i11) {
            C8825g.m33891a("size=", bArr.length, " beginIndex=", i17, " endIndex=", i11);
            return null;
        }
        char[] cArr = new char[i11 - i17];
        int i18 = 0;
        while (i17 < i11) {
            byte b10 = bArr[i17];
            if (b10 >= 0) {
                i12 = i18 + 1;
                cArr[i18] = (char) b10;
                i17++;
                while (i17 < i11) {
                    byte b11 = bArr[i17];
                    if (b11 < 0) {
                        break;
                    }
                    i17++;
                    cArr[i12] = (char) b11;
                    i12++;
                }
                C4700i0 c4700i0 = C4700i0.f13910a;
            } else {
                if ((b10 >> 5) == -2) {
                    int i19 = i17 + 1;
                    if (i11 <= i19) {
                        i12 = i18 + 1;
                        cArr[i18] = (char) 65533;
                    } else {
                        byte b12 = bArr[i19];
                        if ((b12 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128) {
                            int i20 = (b10 << 6) ^ (b12 ^ 3968);
                            if (i20 < 128) {
                                i12 = i18 + 1;
                                cArr[i18] = (char) 65533;
                            } else {
                                i12 = i18 + 1;
                                cArr[i18] = (char) i20;
                            }
                            C4700i0 c4700i02 = C4700i0.f13910a;
                        } else {
                            i12 = i18 + 1;
                            cArr[i18] = (char) 65533;
                        }
                    }
                    C4700i0 c4700i03 = C4700i0.f13910a;
                } else if ((b10 >> 4) == -2) {
                    int i21 = i17 + 2;
                    if (i11 <= i21) {
                        i12 = i18 + 1;
                        cArr[i18] = (char) 65533;
                        C4700i0 c4700i04 = C4700i0.f13910a;
                        int i22 = i17 + 1;
                        i13 = (i11 <= i22 || (bArr[i22] & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) ? 1 : 2;
                    } else {
                        byte b13 = bArr[i17 + 1];
                        if ((b13 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128) {
                            byte b14 = bArr[i21];
                            if ((b14 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128) {
                                int i23 = (b10 << 12) ^ ((b14 ^ (-123008)) ^ (b13 << 6));
                                if (i23 < 2048) {
                                    i12 = i18 + 1;
                                    cArr[i18] = (char) 65533;
                                } else if (55296 > i23 || i23 >= 57344) {
                                    i12 = i18 + 1;
                                    cArr[i18] = (char) i23;
                                } else {
                                    i12 = i18 + 1;
                                    cArr[i18] = (char) 65533;
                                }
                                C4700i0 c4700i05 = C4700i0.f13910a;
                                i13 = 3;
                            } else {
                                i12 = i18 + 1;
                                cArr[i18] = (char) 65533;
                                C4700i0 c4700i06 = C4700i0.f13910a;
                            }
                        } else {
                            i12 = i18 + 1;
                            cArr[i18] = (char) 65533;
                            C4700i0 c4700i07 = C4700i0.f13910a;
                        }
                    }
                } else {
                    if ((b10 >> 3) == -2) {
                        int i24 = i17 + 3;
                        if (i11 <= i24) {
                            i14 = i18 + 1;
                            cArr[i18] = 65533;
                            C4700i0 c4700i08 = C4700i0.f13910a;
                            int i25 = i17 + 1;
                            if (i11 > i25 && (bArr[i25] & JSONB.Constants.BC_INT64_SHORT_MIN) == 128) {
                                int i26 = i17 + 2;
                                i16 = (i11 <= i26 || (bArr[i26] & JSONB.Constants.BC_INT64_SHORT_MIN) != 128) ? 2 : 3;
                            }
                            i16 = 1;
                        } else {
                            byte b15 = bArr[i17 + 1];
                            if ((b15 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128) {
                                byte b16 = bArr[i17 + 2];
                                if ((b16 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128) {
                                    byte b17 = bArr[i24];
                                    if ((b17 & JSONB.Constants.BC_INT64_SHORT_MIN) == 128) {
                                        int i27 = (b10 << 18) ^ (((b17 ^ 3678080) ^ (b16 << 6)) ^ (b15 << 12));
                                        if (i27 > 1114111) {
                                            i14 = i18 + 1;
                                            cArr[i18] = 65533;
                                        } else if ((55296 > i27 || i27 >= 57344) && i27 >= 65536) {
                                            if (i27 != 65533) {
                                                cArr[i18] = (char) ((i27 >>> 10) + 55232);
                                                i15 = i18 + 2;
                                                cArr[i18 + 1] = (char) ((i27 & 1023) + 56320);
                                            } else {
                                                cArr[i18] = 65533;
                                                i15 = i18 + 1;
                                            }
                                            C4700i0 c4700i09 = C4700i0.f13910a;
                                            i14 = i15;
                                            i16 = 4;
                                        } else {
                                            i14 = i18 + 1;
                                            cArr[i18] = 65533;
                                        }
                                        C4700i0 c4700i010 = C4700i0.f13910a;
                                        i16 = 4;
                                    } else {
                                        i14 = i18 + 1;
                                        cArr[i18] = 65533;
                                        C4700i0 c4700i011 = C4700i0.f13910a;
                                    }
                                } else {
                                    i14 = i18 + 1;
                                    cArr[i18] = 65533;
                                    C4700i0 c4700i012 = C4700i0.f13910a;
                                }
                            } else {
                                i14 = i18 + 1;
                                cArr[i18] = 65533;
                                C4700i0 c4700i013 = C4700i0.f13910a;
                                i16 = 1;
                            }
                        }
                        i17 += i16;
                    } else {
                        i14 = i18 + 1;
                        cArr[i18] = 65533;
                        i17++;
                    }
                    i18 = i14;
                }
                i17 += i13;
            }
            i18 = i12;
        }
        return AbstractC8611a0.m33077x(cArr, 0, i18);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m28925b(byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        return m28924a(bArr, i10, i11);
    }
}
