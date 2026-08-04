package yyds;

/* JADX INFO: renamed from: yyds.ᛸᛴᲇᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1767 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C0949[] f8863;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int f8864;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final byte[] f8865;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final int f8866;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int[] f8867;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final int[] f8868;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final String[] f8869;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public C1767(byte[] bArr) {
        this.f8865 = bArr;
        int iM3514 = m3514(8);
        this.f8867 = new int[iM3514];
        this.f8869 = new String[iM3514];
        int i = 10;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        int i3 = 1;
        while (true) {
            int iM35142 = 4;
            if (i3 >= iM3514) {
                this.f8866 = i2;
                this.f8864 = i;
                int[] iArr = null;
                this.f8863 = z ? new C0949[iM3514] : null;
                if (z2) {
                    char[] cArr = new char[i2];
                    int iM3515 = m3515();
                    for (int iM35143 = m3514(iM3515 - 2); iM35143 > 0; iM35143--) {
                        String strM3516 = m3516(cArr, iM3515);
                        int iM3521 = m3521(iM3515 + 2);
                        int i4 = iM3515 + 6;
                        if ("BootstrapMethods".equals(strM3516)) {
                            int iM35144 = m3514(i4);
                            int[] iArr2 = new int[iM35144];
                            int iM35145 = iM3515 + 8;
                            for (int i5 = 0; i5 < iM35144; i5++) {
                                iArr2[i5] = iM35145;
                                iM35145 += (m3514(iM35145 + 2) * 2) + 4;
                            }
                            iArr = iArr2;
                        } else {
                            iM3515 = i4 + iM3521;
                        }
                    }
                    C1693.m3437();
                    throw null;
                }
                this.f8868 = iArr;
                return;
            }
            int i6 = i3 + 1;
            int i7 = i + 1;
            this.f8867[i3] = i7;
            switch (bArr[i]) {
                case 1:
                    iM35142 = m3514(i7) + 3;
                    if (iM35142 > i2) {
                        i2 = iM35142;
                    }
                    i3 = i6;
                    i += iM35142;
                    break;
                case 2:
                case 13:
                case 14:
                default:
                    C1693.m3437();
                    throw null;
                case 3:
                case 4:
                case 9:
                case 10:
                case 11:
                case 12:
                    i3 = i6;
                    iM35142 = 5;
                    i += iM35142;
                    break;
                case 5:
                case 6:
                    i3 += 2;
                    iM35142 = 9;
                    i += iM35142;
                    break;
                case 7:
                case 8:
                case 16:
                case 19:
                case 20:
                    i3 = i6;
                    iM35142 = 3;
                    i += iM35142;
                    break;
                case 15:
                    i3 = i6;
                    i += iM35142;
                    break;
                case 17:
                    z = true;
                    z2 = true;
                    i3 = i6;
                    iM35142 = 5;
                    i += iM35142;
                    break;
                case 18:
                    z2 = true;
                    i3 = i6;
                    iM35142 = 5;
                    i += iM35142;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static C0680 m3506(int i, C0680[] c0680Arr) {
        if (c0680Arr[i] == null) {
            c0680Arr[i] = new C0680();
        }
        C0680 c0680 = c0680Arr[i];
        c0680.f3234 = (short) (c0680.f3234 & (-2));
        return c0680;
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final String m3507(char[] cArr, int i) {
        return m3516(cArr, this.f8867[m3514(i)]);
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final int m3508(C2552 c2552, int i, String str, char[] cArr) {
        int i2 = 0;
        byte[] bArr = this.f8865;
        if (c2552 == null) {
            int i3 = bArr[i] & 255;
            return i3 != 64 ? i3 != 91 ? i3 != 101 ? i + 3 : i + 5 : m3510(null, i + 1, false, cArr) : m3510(null, i + 3, true, cArr);
        }
        boolean z = c2552.f12612;
        C1450 c1450 = (C1450) c2552.f12614;
        C2548 c2548 = (C2548) c2552.f12608;
        int i4 = i + 1;
        int i5 = bArr[i] & 255;
        if (i5 == 64) {
            String strM3516 = m3516(cArr, i4);
            c2552.f12610++;
            if (z) {
                c2548.m4590(c1450.m2952(str));
            }
            c2548.m4586(64, c1450.m2952(strM3516));
            c2548.m4590(0);
            return m3510(new C2552(c1450, true, c2548, (C2552) null), i + 3, true, cArr);
        }
        if (i5 != 70) {
            int[] iArr = this.f8867;
            if (i5 == 83) {
                c2552.m4640(Short.valueOf((short) m3521(iArr[m3514(i4)])), str);
                return i + 3;
            }
            if (i5 == 99) {
                String strM35162 = m3516(cArr, i4);
                c2552.m4640(C1308.m2590(strM35162, 0, strM35162.length()), str);
                return i + 3;
            }
            if (i5 == 101) {
                String strM35163 = m3516(cArr, i4);
                String strM35164 = m3516(cArr, i + 3);
                c2552.f12610++;
                if (z) {
                    c2548.m4590(c1450.m2952(str));
                }
                c2548.m4586(101, c1450.m2952(strM35163));
                c2548.m4590(c1450.m2952(strM35164));
                return i + 5;
            }
            if (i5 == 115) {
                c2552.m4640(m3516(cArr, i4), str);
                return i + 3;
            }
            if (i5 != 73 && i5 != 74) {
                if (i5 == 90) {
                    c2552.m4640(m3521(iArr[m3514(i4)]) == 0 ? Boolean.FALSE : Boolean.TRUE, str);
                    return i + 3;
                }
                if (i5 == 91) {
                    int iM3514 = m3514(i4);
                    int i6 = i + 3;
                    if (iM3514 == 0) {
                        return m3510(c2552.m4638(str), i4, false, cArr);
                    }
                    int i7 = bArr[i6] & 255;
                    if (i7 == 70) {
                        float[] fArr = new float[iM3514];
                        while (i2 < iM3514) {
                            fArr[i2] = Float.intBitsToFloat(m3521(iArr[m3514(i6 + 1)]));
                            i6 += 3;
                            i2++;
                        }
                        c2552.m4640(fArr, str);
                        return i6;
                    }
                    if (i7 == 83) {
                        short[] sArr = new short[iM3514];
                        while (i2 < iM3514) {
                            sArr[i2] = (short) m3521(iArr[m3514(i6 + 1)]);
                            i6 += 3;
                            i2++;
                        }
                        c2552.m4640(sArr, str);
                        return i6;
                    }
                    if (i7 == 90) {
                        boolean[] zArr = new boolean[iM3514];
                        for (int i8 = 0; i8 < iM3514; i8++) {
                            zArr[i8] = m3521(iArr[m3514(i6 + 1)]) != 0;
                            i6 += 3;
                        }
                        c2552.m4640(zArr, str);
                        return i6;
                    }
                    if (i7 == 73) {
                        int[] iArr2 = new int[iM3514];
                        while (i2 < iM3514) {
                            iArr2[i2] = m3521(iArr[m3514(i6 + 1)]);
                            i6 += 3;
                            i2++;
                        }
                        c2552.m4640(iArr2, str);
                        return i6;
                    }
                    if (i7 == 74) {
                        long[] jArr = new long[iM3514];
                        while (i2 < iM3514) {
                            jArr[i2] = m3519(iArr[m3514(i6 + 1)]);
                            i6 += 3;
                            i2++;
                        }
                        c2552.m4640(jArr, str);
                        return i6;
                    }
                    switch (i7) {
                        case 66:
                            byte[] bArr2 = new byte[iM3514];
                            while (i2 < iM3514) {
                                bArr2[i2] = (byte) m3521(iArr[m3514(i6 + 1)]);
                                i6 += 3;
                                i2++;
                            }
                            c2552.m4640(bArr2, str);
                            return i6;
                        case 67:
                            char[] cArr2 = new char[iM3514];
                            while (i2 < iM3514) {
                                cArr2[i2] = (char) m3521(iArr[m3514(i6 + 1)]);
                                i6 += 3;
                                i2++;
                            }
                            c2552.m4640(cArr2, str);
                            return i6;
                        case 68:
                            double[] dArr = new double[iM3514];
                            while (i2 < iM3514) {
                                dArr[i2] = Double.longBitsToDouble(m3519(iArr[m3514(i6 + 1)]));
                                i6 += 3;
                                i2++;
                            }
                            c2552.m4640(dArr, str);
                            return i6;
                        default:
                            return m3510(c2552.m4638(str), i4, false, cArr);
                    }
                }
                switch (i5) {
                    case 66:
                        c2552.m4640(Byte.valueOf((byte) m3521(iArr[m3514(i4)])), str);
                        return i + 3;
                    case 67:
                        c2552.m4640(Character.valueOf((char) m3521(iArr[m3514(i4)])), str);
                        return i + 3;
                    case 68:
                        break;
                    default:
                        C1693.m3437();
                        return 0;
                }
            }
        }
        c2552.m4640(m3517(cArr, m3514(i4)), str);
        return i + 3;
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final short m3509(int i) {
        byte[] bArr = this.f8865;
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final int m3510(C2552 c2552, int i, boolean z, char[] cArr) {
        int iM3514 = m3514(i);
        int iM3508 = i + 2;
        if (!z) {
            while (true) {
                int i2 = iM3514 - 1;
                if (iM3514 <= 0) {
                    break;
                }
                iM3508 = m3508(c2552, iM3508, null, cArr);
                iM3514 = i2;
            }
        } else {
            while (true) {
                int i3 = iM3514 - 1;
                if (iM3514 <= 0) {
                    break;
                }
                iM3508 = m3508(c2552, iM3508 + 2, m3516(cArr, iM3508), cArr);
                iM3514 = i3;
            }
        }
        if (c2552 != null) {
            c2552.m4639();
        }
        return iM3508;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final int m3511(int i) {
        return this.f8865[i] & 255;
    }

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final String m3512(char[] cArr, int i, int i2) {
        int i3;
        int i4 = i2 + i;
        int i5 = 0;
        while (i < i4) {
            int i6 = i + 1;
            byte[] bArr = this.f8865;
            byte b = bArr[i];
            if ((b & 128) == 0) {
                cArr[i5] = (char) (b & 127);
                i5++;
                i = i6;
            } else {
                if ((b & 224) == 192) {
                    i3 = i5 + 1;
                    i += 2;
                    cArr[i5] = (char) (((b & 31) << 6) + (bArr[i6] & 63));
                } else {
                    i3 = i5 + 1;
                    int i7 = i + 2;
                    i += 3;
                    cArr[i5] = (char) (((b & 15) << 12) + ((bArr[i6] & 63) << 6) + (bArr[i7] & 63));
                }
                i5 = i3;
            }
        }
        return new String(cArr, 0, i5);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m3513(C1060 c1060, int i) {
        int i2;
        int i3;
        int iM3521 = m3521(i);
        int i4 = iM3521 >>> 24;
        if (i4 != 0 && i4 != 1) {
            switch (i4) {
                case 16:
                case 17:
                case 18:
                case 23:
                    i2 = iM3521 & (-256);
                    i3 = i + 3;
                    break;
                case 19:
                case 20:
                case 21:
                    i2 = iM3521 & (-16777216);
                    i3 = i + 1;
                    break;
                case 22:
                    break;
                default:
                    switch (i4) {
                        case 64:
                        case 65:
                            i2 = iM3521 & (-16777216);
                            int iM3514 = m3514(i + 1);
                            i3 = i + 3;
                            c1060.f4844 = new C0680[iM3514];
                            c1060.f4842 = new C0680[iM3514];
                            c1060.f4843 = new int[iM3514];
                            for (int i5 = 0; i5 < iM3514; i5++) {
                                int iM35142 = m3514(i3);
                                int iM35143 = m3514(i3 + 2);
                                int iM35144 = m3514(i3 + 4);
                                i3 += 6;
                                c1060.f4844[i5] = m3506(iM35142, c1060.f4841);
                                c1060.f4842[i5] = m3506(iM35142 + iM35143, c1060.f4841);
                                c1060.f4843[i5] = iM35144;
                            }
                            break;
                        case 66:
                            break;
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                            i2 = iM3521 & (-16777216);
                            i3 = i + 3;
                            break;
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                            i2 = iM3521 & (-16776961);
                            i3 = i + 4;
                            break;
                        default:
                            C1693.m3437();
                            return 0;
                    }
                    break;
            }
        } else {
            i2 = iM3521 & (-65536);
            i3 = i + 2;
        }
        c1060.f4832 = i2;
        int iM3511 = m3511(i3);
        c1060.f4834 = iM3511 == 0 ? null : new C2548(i3, this.f8865);
        return (iM3511 * 2) + i3 + 1;
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final int m3514(int i) {
        byte[] bArr = this.f8865;
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int m3515() {
        int i = this.f8864;
        int iM3514 = (m3514(i + 6) * 2) + i + 8;
        int iM35142 = m3514(iM3514);
        int iM3521 = iM3514 + 2;
        while (true) {
            int i2 = iM35142 - 1;
            if (iM35142 <= 0) {
                break;
            }
            int iM35143 = m3514(iM3521 + 6);
            iM3521 += 8;
            while (true) {
                int i3 = iM35143 - 1;
                if (iM35143 > 0) {
                    iM3521 += m3521(iM3521 + 2) + 6;
                    iM35143 = i3;
                }
            }
            iM35142 = i2;
        }
        int iM35144 = m3514(iM3521);
        int iM35212 = iM3521 + 2;
        while (true) {
            int i4 = iM35144 - 1;
            if (iM35144 <= 0) {
                return iM35212 + 2;
            }
            int iM35145 = m3514(iM35212 + 6);
            iM35212 += 8;
            while (true) {
                int i5 = iM35145 - 1;
                if (iM35145 > 0) {
                    iM35212 += m3521(iM35212 + 2) + 6;
                    iM35145 = i5;
                }
            }
            iM35144 = i4;
        }
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final String m3516(char[] cArr, int i) {
        int iM3514 = m3514(i);
        if (i == 0 || iM3514 == 0) {
            return null;
        }
        return m3522(cArr, iM3514);
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final Object m3517(char[] cArr, int i) {
        int[] iArr = this.f8867;
        int i2 = iArr[i];
        byte[] bArr = this.f8865;
        byte b = bArr[i2 - 1];
        switch (b) {
            case 3:
                return Integer.valueOf(m3521(i2));
            case 4:
                return Float.valueOf(Float.intBitsToFloat(m3521(i2)));
            case 5:
                return Long.valueOf(m3519(i2));
            case 6:
                return Double.valueOf(Double.longBitsToDouble(m3519(i2)));
            case 7:
                String strM3516 = m3516(cArr, i2);
                return new C1308(strM3516.charAt(0) == '[' ? 9 : 12, 0, strM3516.length(), strM3516);
            case 8:
                return m3516(cArr, i2);
            default:
                switch (b) {
                    case 15:
                        int iM3511 = m3511(i2);
                        int i3 = iArr[m3514(i2 + 1)];
                        int i4 = iArr[m3514(i3 + 2)];
                        return new C2767(iM3511, m3507(cArr, i3), m3516(cArr, i4), m3516(cArr, i4 + 2), bArr[i3 - 1] == 11);
                    case 16:
                        String strM35162 = m3516(cArr, i2);
                        return new C1308(11, 0, strM35162.length(), strM35162);
                    case 17:
                        C0949[] c0949Arr = this.f8863;
                        C0949 c0949 = c0949Arr[i];
                        if (c0949 != null) {
                            return c0949;
                        }
                        int i5 = iArr[m3514(i2 + 2)];
                        String strM35163 = m3516(cArr, i5);
                        String strM35164 = m3516(cArr, i5 + 2);
                        int i6 = this.f8868[m3514(i2)];
                        C2767 c2767 = (C2767) m3517(cArr, m3514(i6));
                        int iM3514 = m3514(i6 + 2);
                        Object[] objArr = new Object[iM3514];
                        int i7 = i6 + 4;
                        for (int i8 = 0; i8 < iM3514; i8++) {
                            objArr[i8] = m3517(cArr, m3514(i7));
                            i7 += 2;
                        }
                        C0949 c09492 = new C0949(strM35163, strM35164, c2767, objArr);
                        c0949Arr[i] = c09492;
                        return c09492;
                    default:
                        C1693.m3437();
                        return null;
                }
        }
    }

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final int m3518(int i, Object[] objArr, int i2, char[] cArr, C0680[] c0680Arr) {
        int i3 = i + 1;
        switch (this.f8865[i] & 255) {
            case 0:
                objArr[i2] = 0;
                return i3;
            case 1:
                objArr[i2] = 1;
                return i3;
            case 2:
                objArr[i2] = 2;
                return i3;
            case 3:
                objArr[i2] = 3;
                return i3;
            case 4:
                objArr[i2] = 4;
                return i3;
            case 5:
                objArr[i2] = 5;
                return i3;
            case 6:
                objArr[i2] = 6;
                return i3;
            case 7:
                objArr[i2] = m3507(cArr, i3);
                break;
            case 8:
                objArr[i2] = m3506(m3514(i3), c0680Arr);
                break;
            default:
                C1693.m3437();
                return 0;
        }
        return i + 3;
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final long m3519(int i) {
        return (((long) m3521(i + 4)) & 4294967295L) | (((long) m3521(i)) << 32);
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final void m3520(C1399 c1399, C1060 c1060, int i, boolean z) {
        C2552 c2552M4631;
        int iM3510 = i + 1;
        int i2 = this.f8865[i] & 255;
        if (z) {
            c1399.f6560 = i2;
        } else {
            c1399.f6564 = i2;
        }
        char[] cArr = c1060.f4846;
        for (int i3 = 0; i3 < i2; i3++) {
            int iM3514 = m3514(iM3510);
            iM3510 += 2;
            while (true) {
                int i4 = iM3514 - 1;
                if (iM3514 > 0) {
                    String strM3516 = m3516(cArr, iM3510);
                    int i5 = iM3510 + 2;
                    C1450 c1450 = c1399.f6545;
                    String str = c1399.f6552;
                    if (z) {
                        C2552[] c2552Arr = c1399.f6526;
                        if (c2552Arr == null) {
                            c2552Arr = new C2552[C1308.m2593(str)];
                            c1399.f6526 = c2552Arr;
                        }
                        c2552M4631 = C2552.m4631(c1450, strM3516, c2552Arr[i3]);
                        c2552Arr[i3] = c2552M4631;
                    } else {
                        C2552[] c2552Arr2 = c1399.f6565;
                        if (c2552Arr2 == null) {
                            c2552Arr2 = new C2552[C1308.m2593(str)];
                            c1399.f6565 = c2552Arr2;
                        }
                        c2552M4631 = C2552.m4631(c1450, strM3516, c2552Arr2[i3]);
                        c2552Arr2[i3] = c2552M4631;
                    }
                    iM3510 = m3510(c2552M4631, i5, true, cArr);
                    iM3514 = i4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final int m3521(int i) {
        byte[] bArr = this.f8865;
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final String m3522(char[] cArr, int i) {
        String[] strArr = this.f8869;
        String str = strArr[i];
        if (str != null) {
            return str;
        }
        int i2 = this.f8867[i];
        String strM3512 = m3512(cArr, i2 + 2, m3514(i2));
        strArr[i] = strM3512;
        return strM3512;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int m3523(int[] iArr, int i) {
        if (iArr == null || i >= iArr.length || m3511(iArr[i]) < 67) {
            return -1;
        }
        return m3514(iArr[i] + 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c A[FALL_THROUGH] */
    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] m3524(C1399 c1399, C1060 c1060, int i, boolean z) {
        int i2;
        C2552 c2552M4635;
        char[] cArr = c1060.f4846;
        int iM3514 = m3514(i);
        int[] iArr = new int[iM3514];
        int iM3510 = i + 2;
        for (int i3 = 0; i3 < iM3514; i3++) {
            iArr[i3] = iM3510;
            int iM3521 = m3521(iM3510);
            int i4 = iM3521 >>> 24;
            if (i4 != 23) {
                switch (i4) {
                    default:
                        switch (i4) {
                            case 64:
                            case 65:
                                int iM35142 = m3514(iM3510 + 1);
                                i2 = iM3510 + 3;
                                while (true) {
                                    int i5 = iM35142 - 1;
                                    if (iM35142 > 0) {
                                        int iM35143 = m3514(i2);
                                        int iM35144 = m3514(i2 + 2);
                                        i2 += 6;
                                        m3506(iM35143, c1060.f4841);
                                        m3506(iM35143 + iM35144, c1060.f4841);
                                        iM35142 = i5;
                                    }
                                    break;
                                }
                                break;
                            case 66:
                            case 67:
                            case 68:
                            case 69:
                            case 70:
                                break;
                            case 71:
                            case 72:
                            case 73:
                            case 74:
                            case 75:
                                i2 = iM3510 + 4;
                                break;
                            default:
                                C1693.m3437();
                                return null;
                        }
                    case 16:
                    case 17:
                    case 18:
                        i2 = iM3510 + 3;
                        break;
                }
            }
            int iM3511 = m3511(i2);
            if (i4 == 66) {
                C2548 c2548 = iM3511 != 0 ? new C2548(i2, this.f8865) : null;
                int i6 = (iM3511 * 2) + 1 + i2;
                String strM3516 = m3516(cArr, i6);
                int i7 = i6 + 2;
                int i8 = iM3521 & (-256);
                C1450 c1450 = c1399.f6545;
                if (z) {
                    c2552M4635 = C2552.m4635(c1450, i8, c2548, strM3516, c1399.f6555);
                    c1399.f6555 = c2552M4635;
                } else {
                    c2552M4635 = C2552.m4635(c1450, i8, c2548, strM3516, c1399.f6553);
                    c1399.f6553 = c2552M4635;
                }
                iM3510 = m3510(c2552M4635, i7, true, cArr);
            } else {
                iM3510 = m3510(null, (iM3511 * 2) + 3 + i2, true, cArr);
            }
        }
        return iArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:152:0x0391. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x07ea  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0940  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x09d0  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0a29  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0a4e  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0a73  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0a99  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0abd  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0ae1  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0b06  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0b32  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0b56  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0b76  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0b96  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0b9d  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0bba  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0bce  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x06ba A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3525(C1399 c1399, C1060 c1060, int i) {
        int i2;
        int i3;
        C1399 c13992;
        byte[] bArr;
        C0644 c0644;
        C0680[] c0680Arr;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        C1767 c1767;
        int i7;
        int[] iArr2;
        String strM3516;
        int[] iArr3;
        int[] iArr4;
        int i8;
        int i9;
        C0644 c06442;
        C1767 c17672;
        int[] iArr5;
        int i10;
        int i11;
        int[] iArr6;
        int i12;
        C1450 c1450;
        C2548 c2548;
        int i13;
        int i14;
        int i15;
        C0680[] c0680Arr2;
        int i16;
        int i17;
        int iM3523;
        int i18;
        int i19;
        C1399 c13993;
        String str;
        boolean z;
        C1450 c14502;
        C2548 c25482;
        int i20;
        int i21;
        int i22;
        int i23;
        int[] iArr7;
        int i24;
        int i25;
        int i26;
        int i27;
        int[] iArr8;
        int i28;
        int i29;
        int i30;
        int[] iArr9;
        int iM3514;
        int iM3518;
        int i31;
        int iM35142;
        int i32;
        int i33;
        int i34;
        int i35;
        C2548 c25483;
        C1450 c14503;
        int i36;
        int i37;
        C2548 c25484;
        int i38;
        int i39;
        int i40;
        int i41;
        C1767 c17673 = this;
        int i42 = c1399.f6563;
        C2548 c25485 = c1399.f6562;
        C1450 c14504 = c1399.f6545;
        char[] cArr = c1060.f4846;
        int iM35143 = c17673.m3514(i);
        int iM35144 = c17673.m3514(i + 2);
        int iM3521 = c17673.m3521(i + 4);
        byte b = 8;
        int i43 = i + 8;
        byte[] bArr2 = c17673.f8865;
        if (iM3521 > bArr2.length - i43) {
            C1693.m3437();
            return;
        }
        int i44 = i43 + iM3521;
        C0680[] c0680Arr3 = new C0680[iM3521 + 1];
        c1060.f4841 = c0680Arr3;
        int i45 = i43;
        while (true) {
            byte[] bArr3 = bArr2;
            byte b2 = b;
            boolean z2 = true;
            if (i45 < i44) {
                int i46 = i45 - i43;
                switch (bArr3[i45] & 255) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 83:
                    case 84:
                    case 85:
                    case 86:
                    case 87:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    case 93:
                    case 94:
                    case 95:
                    case 96:
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                    case 101:
                    case 102:
                    case 103:
                    case 104:
                    case 105:
                    case 106:
                    case 107:
                    case 108:
                    case 109:
                    case 110:
                    case 111:
                    case 112:
                    case 113:
                    case 114:
                    case 115:
                    case 116:
                    case 117:
                    case 118:
                    case 119:
                    case 120:
                    case 121:
                    case 122:
                    case 123:
                    case 124:
                    case 125:
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                    case 131:
                    case 133:
                    case 134:
                    case 135:
                    case 136:
                    case 137:
                    case 138:
                    case 139:
                    case 140:
                    case 141:
                    case 142:
                    case 143:
                    case 144:
                    case 145:
                    case 146:
                    case 147:
                    case 148:
                    case 149:
                    case 150:
                    case 151:
                    case 152:
                    case 172:
                    case 173:
                    case 174:
                    case 175:
                    case 176:
                    case 177:
                    case 190:
                    case 191:
                    case 194:
                    case 195:
                        i45++;
                        bArr2 = bArr3;
                        b = b2;
                        break;
                    case 16:
                    case 18:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 169:
                    case 188:
                        i45 += 2;
                        bArr2 = bArr3;
                        b = b2;
                        break;
                    case 17:
                    case 19:
                    case 20:
                    case 132:
                    case 178:
                    case 179:
                    case 180:
                    case 181:
                    case 182:
                    case 183:
                    case 184:
                    case 187:
                    case 189:
                    case 192:
                    case 193:
                        i45 += 3;
                        bArr2 = bArr3;
                        b = b2;
                        break;
                    case 153:
                    case 154:
                    case 155:
                    case 156:
                    case 157:
                    case 158:
                    case 159:
                    case 160:
                    case 161:
                    case 162:
                    case 163:
                    case 164:
                    case 165:
                    case 166:
                    case 167:
                    case 168:
                    case 198:
                    case 199:
                        m3506(c17673.m3509(i45 + 1) + i46, c0680Arr3);
                        i45 += 3;
                        bArr2 = bArr3;
                        b = b2;
                        break;
                    case 170:
                        int i47 = (4 - (i46 & 3)) + i45;
                        m3506(c17673.m3521(i47) + i46, c0680Arr3);
                        int iM35212 = (c17673.m3521(i47 + 8) - c17673.m3521(i47 + 4)) + 1;
                        i41 = i47 + 12;
                        while (true) {
                            int i48 = iM35212 - 1;
                            if (iM35212 <= 0) {
                                i45 = i41;
                                bArr2 = bArr3;
                                b = b2;
                            } else {
                                m3506(c17673.m3521(i41) + i46, c0680Arr3);
                                i41 += 4;
                                iM35212 = i48;
                            }
                            break;
                        }
                        break;
                    case 171:
                        int i49 = (4 - (i46 & 3)) + i45;
                        m3506(c17673.m3521(i49) + i46, c0680Arr3);
                        int iM35213 = c17673.m3521(i49 + 4);
                        i41 = i49 + 8;
                        while (true) {
                            int i50 = iM35213 - 1;
                            if (iM35213 <= 0) {
                                i45 = i41;
                                bArr2 = bArr3;
                                b = b2;
                            } else {
                                m3506(c17673.m3521(i41 + 4) + i46, c0680Arr3);
                                i41 += 8;
                                iM35213 = i50;
                            }
                            break;
                        }
                        break;
                    case 185:
                    case 186:
                        i45 += 5;
                        bArr2 = bArr3;
                        b = b2;
                        break;
                    case 196:
                        int i51 = bArr3[i45 + 1] & 255;
                        if (i51 != 132) {
                            if (i51 != 169) {
                                switch (i51) {
                                    default:
                                        switch (i51) {
                                            case 54:
                                            case 55:
                                            case 56:
                                            case 57:
                                            case 58:
                                                break;
                                            default:
                                                C1693.m3437();
                                                return;
                                        }
                                        bArr2 = bArr3;
                                        b = b2;
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                        i45 += 4;
                                        bArr2 = bArr3;
                                        b = b2;
                                        break;
                                }
                            }
                            i45 += 4;
                            bArr2 = bArr3;
                            b = b2;
                        } else {
                            i45 += 6;
                            bArr2 = bArr3;
                            b = b2;
                        }
                        break;
                    case 197:
                        break;
                    case 200:
                    case 201:
                    case 220:
                        m3506(c17673.m3521(i45 + 1) + i46, c0680Arr3);
                        i45 += 5;
                        bArr2 = bArr3;
                        b = b2;
                        break;
                    case 202:
                    case 203:
                    case 204:
                    case 205:
                    case 206:
                    case 207:
                    case 208:
                    case 209:
                    case 210:
                    case 211:
                    case 212:
                    case 213:
                    case 214:
                    case 215:
                    case 216:
                    case 217:
                    case 218:
                    case 219:
                        m3506(c17673.m3514(i45 + 1) + i46, c0680Arr3);
                        i45 += 3;
                        bArr2 = bArr3;
                        b = b2;
                        break;
                    default:
                        C1693.m3437();
                        return;
                }
            } else {
                int i52 = 4;
                int iM35145 = c17673.m3514(i45);
                int i53 = 2;
                int i54 = i45 + 2;
                while (true) {
                    int i55 = iM35145 - 1;
                    int i56 = i53;
                    int i57 = i44;
                    int[] iArr10 = c17673.f8867;
                    if (iM35145 > 0) {
                        C0680 c0680M3506 = m3506(c17673.m3514(i54), c0680Arr3);
                        C0680 c0680M35062 = m3506(c17673.m3514(i54 + 2), c0680Arr3);
                        C0680 c0680M35063 = m3506(c17673.m3514(i54 + 4), c0680Arr3);
                        String strM35162 = c17673.m3516(cArr, iArr10[c17673.m3514(i54 + 6)]);
                        i54 += 8;
                        C1231 c1231 = new C1231(c0680M3506, c0680M35062, c0680M35063, strM35162 != null ? c14504.m2960(7, strM35162).f11716 : 0, strM35162);
                        if (c1399.f6556 == null) {
                            c1399.f6556 = c1231;
                        } else {
                            c1399.f6558.f5648 = c1231;
                        }
                        c1399.f6558 = c1231;
                        iM35145 = i55;
                        i53 = i56;
                        i44 = i57;
                    } else {
                        int iM35146 = c17673.m3514(i54);
                        int i58 = i54 + 2;
                        boolean z3 = true;
                        C0644 c06443 = null;
                        int i59 = 0;
                        int i60 = 0;
                        int[] iArrM3524 = null;
                        int[] iArrM35242 = null;
                        int i61 = 0;
                        int i62 = 0;
                        while (true) {
                            int i63 = iM35146 - 1;
                            if (iM35146 <= 0) {
                                int i64 = i42;
                                C2548 c25486 = c25485;
                                C1450 c14505 = c14504;
                                int i65 = i43;
                                boolean z4 = (c1060.f4839 & 8) != 0;
                                if (i59 != 0) {
                                    c1060.f4833 = -1;
                                    c1060.f4831 = 0;
                                    c1060.f4837 = 0;
                                    c1060.f4847 = 0;
                                    Object[] objArr = new Object[iM35144];
                                    c1060.f4840 = objArr;
                                    c1060.f4838 = 0;
                                    c1060.f4845 = new Object[iM35143];
                                    if (z4) {
                                        String str2 = c1060.f4848;
                                        if ((c1060.f4849 & 8) == 0) {
                                            i2 = 3;
                                            if ("<init>".equals(c1060.f4835)) {
                                                i3 = 0;
                                                objArr[0] = 6;
                                            } else {
                                                i3 = 0;
                                                objArr[0] = c17673.m3507(c1060.f4846, c17673.f8864 + 2);
                                            }
                                            i32 = 1;
                                        } else {
                                            i2 = 3;
                                            i3 = 0;
                                            i32 = 0;
                                        }
                                        int i66 = i32;
                                        int i67 = 1;
                                        while (true) {
                                            int i68 = i67 + 1;
                                            char cCharAt = str2.charAt(i67);
                                            if (cCharAt == 'F') {
                                                i33 = i66 + 1;
                                                objArr[i66] = Integer.valueOf(i56);
                                            } else if (cCharAt != 'L') {
                                                if (cCharAt != 'S' && cCharAt != 'I') {
                                                    if (cCharAt == 'J') {
                                                        objArr[i66] = 4;
                                                        i66++;
                                                        i67 = i68;
                                                    } else if (cCharAt != 'Z') {
                                                        if (cCharAt != '[') {
                                                            switch (cCharAt) {
                                                                case 'D':
                                                                    i34 = i66 + 1;
                                                                    objArr[i66] = Integer.valueOf(i2);
                                                                    break;
                                                            }
                                                            c1060.f4837 = i66;
                                                        } else {
                                                            while (str2.charAt(i68) == '[') {
                                                                i68++;
                                                            }
                                                            if (str2.charAt(i68) == 'L') {
                                                                do {
                                                                    i68++;
                                                                } while (str2.charAt(i68) != ';');
                                                            }
                                                            i34 = i66 + 1;
                                                            i68++;
                                                            objArr[i66] = str2.substring(i67, i68);
                                                        }
                                                        i66 = i34;
                                                        i67 = i68;
                                                    }
                                                }
                                                i33 = i66 + 1;
                                                objArr[i66] = 1;
                                            } else {
                                                int i69 = i68;
                                                while (str2.charAt(i69) != ';') {
                                                    i69++;
                                                }
                                                i67 = i69 + 1;
                                                objArr[i66] = str2.substring(i68, i69);
                                                i66++;
                                            }
                                            i66 = i33;
                                            i67 = i68;
                                        }
                                    } else {
                                        i2 = 3;
                                        i3 = 0;
                                    }
                                    int i70 = i59;
                                    while (i70 < i60 - 2) {
                                        if (bArr3[i70] == b2 && (iM35142 = c17673.m3514(i70 + 1)) >= 0 && iM35142 < iM3521 && (bArr3[i65 + iM35142] & 255) == 187) {
                                            m3506(iM35142, c0680Arr3);
                                        }
                                        i70++;
                                        b2 = 8;
                                    }
                                } else {
                                    i2 = 3;
                                    i3 = 0;
                                }
                                if (!z4 || (c1060.f4839 & 256) == 0) {
                                    c13992 = c1399;
                                    bArr = bArr3;
                                    c0644 = c06443;
                                    c0680Arr = c0680Arr3;
                                    i4 = i57;
                                    i5 = i60;
                                    i6 = i3;
                                } else {
                                    bArr = bArr3;
                                    c0644 = c06443;
                                    c0680Arr = c0680Arr3;
                                    i4 = i57;
                                    i5 = i60;
                                    i6 = i3;
                                    c13992 = c1399;
                                    c13992.m2832(-1, iM35144, 0, null, null);
                                }
                                int[] iArr11 = iArrM3524;
                                int iM35232 = c17673.m3523(iArr11, i6);
                                int[] iArr12 = iArrM35242;
                                int iM35233 = c17673.m3523(iArr12, i6);
                                int i71 = i6;
                                int i72 = (c1060.f4839 & 256) == 0 ? 33 : i71;
                                int i73 = iM35232;
                                int i74 = iM35233;
                                boolean z5 = z4;
                                int i75 = i71;
                                int i76 = i75;
                                int i77 = i76;
                                int i78 = i65;
                                while (i78 < i4) {
                                    int i79 = i78 - i65;
                                    C0680 c0680 = c0680Arr[i79];
                                    int i80 = i4;
                                    if (c0680 == null) {
                                        iArr4 = iArr11;
                                        i8 = iM35144;
                                    } else {
                                        int i81 = (c1060.f4839 & 2) == 0 ? 1 : i71;
                                        c13992.m2811(c0680);
                                        if (i81 != 0) {
                                            iArr4 = iArr11;
                                            if ((c0680.f3234 & 128) != 0) {
                                                c13992.m2831(c0680.f3235 & 65535, c0680);
                                                if (c0680.f3240 != null) {
                                                    int i82 = 1;
                                                    while (true) {
                                                        int[] iArr13 = c0680.f3240;
                                                        i8 = iM35144;
                                                        if (i82 <= iArr13[i71]) {
                                                            c13992.m2831(iArr13[i82], c0680);
                                                            i82++;
                                                            iM35144 = i8;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        i8 = iM35144;
                                    }
                                    int i83 = i59;
                                    while (i83 != 0) {
                                        int i84 = c1060.f4833;
                                        if (i84 == i79 || i84 == -1) {
                                            if (i84 != -1) {
                                                if (!z3 || z5) {
                                                    iArr8 = iArr12;
                                                    i28 = i78;
                                                    c1399.m2832(-1, c1060.f4837, c1060.f4838, c1060.f4840, c1060.f4845);
                                                } else {
                                                    iArr8 = iArr12;
                                                    i28 = i78;
                                                    c13992.m2832(c1060.f4831, c1060.f4847, c1060.f4838, c1060.f4840, c1060.f4845);
                                                }
                                                i29 = i71;
                                            } else {
                                                iArr8 = iArr12;
                                                i28 = i78;
                                                i29 = i75;
                                            }
                                            int i85 = i5;
                                            if (i83 < i85) {
                                                char[] cArr2 = c1060.f4846;
                                                C0680[] c0680Arr4 = c1060.f4841;
                                                if (z3) {
                                                    i30 = bArr[i83] & 255;
                                                    i83++;
                                                } else {
                                                    c1060.f4833 = -1;
                                                    i30 = 255;
                                                }
                                                c1060.f4847 = i71;
                                                if (i30 < 64) {
                                                    c1060.f4831 = i2;
                                                    c1060.f4838 = 0;
                                                    i5 = i85;
                                                    i31 = i29;
                                                    iM3518 = i83;
                                                    iArr9 = iArr8;
                                                } else {
                                                    if (i30 < 128) {
                                                        iM3514 = i30 - 64;
                                                        i5 = i85;
                                                        int i86 = i83;
                                                        iArr9 = iArr8;
                                                        iM3518 = m3518(i86, c1060.f4845, 0, cArr2, c0680Arr4);
                                                        c1060.f4831 = 4;
                                                        c1060.f4838 = 1;
                                                        i31 = i29;
                                                    } else {
                                                        i5 = i85;
                                                        int i87 = i83;
                                                        iArr9 = iArr8;
                                                        if (i30 < 247) {
                                                            C1693.m3437();
                                                            return;
                                                        }
                                                        iM3514 = m3514(i87);
                                                        iM3518 = i87 + 2;
                                                        if (i30 == 247) {
                                                            i31 = i29;
                                                            iM3518 = m3518(iM3518, c1060.f4845, 0, cArr2, c0680Arr4);
                                                            c1060.f4831 = 4;
                                                            c1060.f4838 = 1;
                                                        } else {
                                                            i31 = i29;
                                                            if (i30 >= 248 && i30 < 251) {
                                                                c1060.f4831 = 2;
                                                                int i88 = 251 - i30;
                                                                c1060.f4847 = i88;
                                                                c1060.f4837 -= i88;
                                                                c1060.f4838 = 0;
                                                            } else if (i30 == 251) {
                                                                c1060.f4831 = 3;
                                                                c1060.f4838 = 0;
                                                            } else if (i30 < 255) {
                                                                int i89 = i30 - 251;
                                                                int i90 = z5 ? c1060.f4837 : 0;
                                                                int i91 = i89;
                                                                while (i91 > 0) {
                                                                    iM3518 = m3518(iM3518, c1060.f4840, i90, cArr2, c0680Arr4);
                                                                    i91--;
                                                                    i89 = i89;
                                                                    i90++;
                                                                }
                                                                int i92 = i89;
                                                                c1060.f4831 = 1;
                                                                c1060.f4847 = i92;
                                                                c1060.f4837 += i92;
                                                                c1060.f4838 = 0;
                                                            } else {
                                                                C1767 c17674 = this;
                                                                int iM35147 = c17674.m3514(iM3518);
                                                                int iM35182 = i87 + 4;
                                                                c1060.f4831 = 0;
                                                                c1060.f4847 = iM35147;
                                                                c1060.f4837 = iM35147;
                                                                for (int i93 = 0; i93 < iM35147; i93++) {
                                                                    iM35182 = c17674.m3518(iM35182, c1060.f4840, i93, cArr2, c0680Arr4);
                                                                }
                                                                int iM35148 = c17674.m3514(iM35182);
                                                                iM3518 = iM35182 + 2;
                                                                c1060.f4838 = iM35148;
                                                                int i94 = 0;
                                                                while (i94 < iM35148) {
                                                                    iM3518 = c17674.m3518(iM3518, c1060.f4845, i94, cArr2, c0680Arr4);
                                                                    i94++;
                                                                    c17674 = this;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    i30 = iM3514;
                                                }
                                                int i95 = i30 + 1 + c1060.f4833;
                                                c1060.f4833 = i95;
                                                m3506(i95, c0680Arr4);
                                                iArr12 = iArr9;
                                                i78 = i28;
                                                i75 = i31;
                                                i2 = 3;
                                                i71 = 0;
                                                i83 = iM3518;
                                            } else {
                                                int i96 = i29;
                                                iArr12 = iArr8;
                                                i5 = i85;
                                                i78 = i28;
                                                i75 = i96;
                                                i83 = 0;
                                                i2 = 3;
                                                i71 = 0;
                                            }
                                            c13992 = c1399;
                                        } else {
                                            int[] iArr14 = iArr12;
                                            int i97 = i78;
                                            int[] iArr15 = iArr4;
                                            if (i75 == 0) {
                                                if ((c1060.f4839 & 8) != 0) {
                                                    i9 = i83;
                                                    c06442 = c0644;
                                                    c17672 = this;
                                                    iArr5 = iArr14;
                                                    c1399.m2832(256, 0, 0, null, null);
                                                    c13992 = c1399;
                                                } else {
                                                    c13992 = c1399;
                                                    i9 = i83;
                                                    c06442 = c0644;
                                                    c17672 = this;
                                                    iArr5 = iArr14;
                                                }
                                                i10 = 0;
                                            } else {
                                                c13992 = c1399;
                                                i9 = i83;
                                                c06442 = c0644;
                                                c17672 = this;
                                                iArr5 = iArr14;
                                                i10 = i75;
                                            }
                                            i11 = bArr[i97] & 255;
                                            switch (i11) {
                                                case 0:
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                case 10:
                                                case 11:
                                                case 12:
                                                case 13:
                                                case 14:
                                                case 15:
                                                case 46:
                                                case 47:
                                                case 48:
                                                case 49:
                                                case 50:
                                                case 51:
                                                case 52:
                                                case 53:
                                                case 79:
                                                case 80:
                                                case 81:
                                                case 82:
                                                case 83:
                                                case 84:
                                                case 85:
                                                case 86:
                                                case 87:
                                                case 88:
                                                case 89:
                                                case 90:
                                                case 91:
                                                case 92:
                                                case 93:
                                                case 94:
                                                case 95:
                                                case 96:
                                                case 97:
                                                case 98:
                                                case 99:
                                                case 100:
                                                case 101:
                                                case 102:
                                                case 103:
                                                case 104:
                                                case 105:
                                                case 106:
                                                case 107:
                                                case 108:
                                                case 109:
                                                case 110:
                                                case 111:
                                                case 112:
                                                case 113:
                                                case 114:
                                                case 115:
                                                case 116:
                                                case 117:
                                                case 118:
                                                case 119:
                                                case 120:
                                                case 121:
                                                case 122:
                                                case 123:
                                                case 124:
                                                case 125:
                                                case 126:
                                                case 127:
                                                case 128:
                                                case 129:
                                                case 130:
                                                case 131:
                                                case 133:
                                                case 134:
                                                case 135:
                                                case 136:
                                                case 137:
                                                case 138:
                                                case 139:
                                                case 140:
                                                case 141:
                                                case 142:
                                                case 143:
                                                case 144:
                                                case 145:
                                                case 146:
                                                case 147:
                                                case 148:
                                                case 149:
                                                case 150:
                                                case 151:
                                                case 152:
                                                case 172:
                                                case 173:
                                                case 174:
                                                case 175:
                                                case 176:
                                                case 177:
                                                case 190:
                                                case 191:
                                                case 194:
                                                case 195:
                                                    iArr6 = iArr5;
                                                    i12 = iM35143;
                                                    c1450 = c14505;
                                                    c2548 = c25486;
                                                    i13 = iM3521;
                                                    i14 = i72;
                                                    i15 = i64;
                                                    c0680Arr2 = c0680Arr;
                                                    c13992.m2828(i11);
                                                    i16 = i97 + 1;
                                                    i17 = i76;
                                                    iM3523 = i73;
                                                    i18 = i10;
                                                    while (iArr15 != null && i17 < iArr15.length && iM3523 <= i79) {
                                                        if (iM3523 != i79) {
                                                            int iM3513 = c17672.m3513(c1060, iArr15[i17]);
                                                            i27 = i16;
                                                            c17672.m3510(c13992.m2826(c1060.f4832, c1060.f4834, c17672.m3516(cArr, iM3513), true), iM3513 + 2, true, cArr);
                                                        } else {
                                                            i27 = i16;
                                                        }
                                                        i17++;
                                                        iM3523 = c17672.m3523(iArr15, i17);
                                                        i16 = i27;
                                                    }
                                                    int i98 = i16;
                                                    int i99 = i77;
                                                    int iM35234 = i74;
                                                    while (iArr6 != null) {
                                                        iArr7 = iArr6;
                                                        if (i99 >= iArr7.length || iM35234 > i79) {
                                                            i21 = i99;
                                                            i22 = i17;
                                                            i23 = i18;
                                                            c17673 = c17672;
                                                            i75 = i23;
                                                            i4 = i80;
                                                            i59 = i9;
                                                            iM35144 = i8;
                                                            i72 = i14;
                                                            i2 = 3;
                                                            i71 = 0;
                                                            i74 = iM35234;
                                                            iArr11 = iArr15;
                                                            c25486 = c2548;
                                                            i78 = i98;
                                                            i76 = i22;
                                                            iM35143 = i12;
                                                            i77 = i21;
                                                            i73 = iM3523;
                                                            iArr12 = iArr7;
                                                            c0680Arr = c0680Arr2;
                                                            i64 = i15;
                                                            iM3521 = i13;
                                                            c14505 = c1450;
                                                            c0644 = c06442;
                                                        } else {
                                                            if (iM35234 == i79) {
                                                                int iM35132 = c17672.m3513(c1060, iArr7[i99]);
                                                                i24 = i99;
                                                                i25 = i17;
                                                                i26 = i18;
                                                                c17672.m3510(c13992.m2826(c1060.f4832, c1060.f4834, c17672.m3516(cArr, iM35132), false), iM35132 + 2, true, cArr);
                                                            } else {
                                                                i24 = i99;
                                                                i25 = i17;
                                                                i26 = i18;
                                                            }
                                                            i99 = i24 + 1;
                                                            iM35234 = c17672.m3523(iArr7, i99);
                                                            iArr6 = iArr7;
                                                            i17 = i25;
                                                            i18 = i26;
                                                        }
                                                        break;
                                                    }
                                                    i21 = i99;
                                                    i22 = i17;
                                                    i23 = i18;
                                                    iArr7 = iArr6;
                                                    c17673 = c17672;
                                                    i75 = i23;
                                                    i4 = i80;
                                                    i59 = i9;
                                                    iM35144 = i8;
                                                    i72 = i14;
                                                    i2 = 3;
                                                    i71 = 0;
                                                    i74 = iM35234;
                                                    iArr11 = iArr15;
                                                    c25486 = c2548;
                                                    i78 = i98;
                                                    i76 = i22;
                                                    iM35143 = i12;
                                                    i77 = i21;
                                                    i73 = iM3523;
                                                    iArr12 = iArr7;
                                                    c0680Arr = c0680Arr2;
                                                    i64 = i15;
                                                    iM3521 = i13;
                                                    c14505 = c1450;
                                                    c0644 = c06442;
                                                    break;
                                                case 16:
                                                case 188:
                                                    iArr6 = iArr5;
                                                    i12 = iM35143;
                                                    c1450 = c14505;
                                                    c2548 = c25486;
                                                    i13 = iM3521;
                                                    i14 = i72;
                                                    i15 = i64;
                                                    c0680Arr2 = c0680Arr;
                                                    c13992.m2827(i11, bArr[i97 + 1]);
                                                    i16 = i97 + 2;
                                                    i17 = i76;
                                                    iM3523 = i73;
                                                    i18 = i10;
                                                    while (iArr15 != null) {
                                                        if (iM3523 != i79) {
                                                        }
                                                        i17++;
                                                        iM3523 = c17672.m3523(iArr15, i17);
                                                        i16 = i27;
                                                    }
                                                    int i982 = i16;
                                                    int i992 = i77;
                                                    int iM352342 = i74;
                                                    while (iArr6 != null) {
                                                    }
                                                    i21 = i992;
                                                    i22 = i17;
                                                    i23 = i18;
                                                    iArr7 = iArr6;
                                                    c17673 = c17672;
                                                    i75 = i23;
                                                    i4 = i80;
                                                    i59 = i9;
                                                    iM35144 = i8;
                                                    i72 = i14;
                                                    i2 = 3;
                                                    i71 = 0;
                                                    i74 = iM352342;
                                                    iArr11 = iArr15;
                                                    c25486 = c2548;
                                                    i78 = i982;
                                                    i76 = i22;
                                                    iM35143 = i12;
                                                    i77 = i21;
                                                    i73 = iM3523;
                                                    iArr12 = iArr7;
                                                    c0680Arr = c0680Arr2;
                                                    i64 = i15;
                                                    iM3521 = i13;
                                                    c14505 = c1450;
                                                    c0644 = c06442;
                                                    break;
                                                case 17:
                                                    iArr6 = iArr5;
                                                    i12 = iM35143;
                                                    c1450 = c14505;
                                                    c2548 = c25486;
                                                    i13 = iM3521;
                                                    i14 = i72;
                                                    i15 = i64;
                                                    c0680Arr2 = c0680Arr;
                                                    c13992.m2827(i11, c17672.m3509(i97 + 1));
                                                    i16 = i97 + 3;
                                                    i17 = i76;
                                                    iM3523 = i73;
                                                    i18 = i10;
                                                    while (iArr15 != null) {
                                                    }
                                                    int i9822 = i16;
                                                    int i9922 = i77;
                                                    int iM3523422 = i74;
                                                    while (iArr6 != null) {
                                                    }
                                                    i21 = i9922;
                                                    i22 = i17;
                                                    i23 = i18;
                                                    iArr7 = iArr6;
                                                    c17673 = c17672;
                                                    i75 = i23;
                                                    i4 = i80;
                                                    i59 = i9;
                                                    iM35144 = i8;
                                                    i72 = i14;
                                                    i2 = 3;
                                                    i71 = 0;
                                                    i74 = iM3523422;
                                                    iArr11 = iArr15;
                                                    c25486 = c2548;
                                                    i78 = i9822;
                                                    i76 = i22;
                                                    iM35143 = i12;
                                                    i77 = i21;
                                                    i73 = iM3523;
                                                    iArr12 = iArr7;
                                                    c0680Arr = c0680Arr2;
                                                    i64 = i15;
                                                    iM3521 = i13;
                                                    c14505 = c1450;
                                                    c0644 = c06442;
                                                    break;
                                                case 18:
                                                    iArr6 = iArr5;
                                                    i12 = iM35143;
                                                    c1450 = c14505;
                                                    c2548 = c25486;
                                                    i13 = iM3521;
                                                    i14 = i72;
                                                    i15 = i64;
                                                    c0680Arr2 = c0680Arr;
                                                    c13992.m2818(c17672.m3517(cArr, bArr[i97 + 1] & 255));
                                                    i16 = i97 + 2;
                                                    i17 = i76;
                                                    iM3523 = i73;
                                                    i18 = i10;
                                                    while (iArr15 != null) {
                                                    }
                                                    int i98222 = i16;
                                                    int i99222 = i77;
                                                    int iM35234222 = i74;
                                                    while (iArr6 != null) {
                                                    }
                                                    i21 = i99222;
                                                    i22 = i17;
                                                    i23 = i18;
                                                    iArr7 = iArr6;
                                                    c17673 = c17672;
                                                    i75 = i23;
                                                    i4 = i80;
                                                    i59 = i9;
                                                    iM35144 = i8;
                                                    i72 = i14;
                                                    i2 = 3;
                                                    i71 = 0;
                                                    i74 = iM35234222;
                                                    iArr11 = iArr15;
                                                    c25486 = c2548;
                                                    i78 = i98222;
                                                    i76 = i22;
                                                    iM35143 = i12;
                                                    i77 = i21;
                                                    i73 = iM3523;
                                                    iArr12 = iArr7;
                                                    c0680Arr = c0680Arr2;
                                                    i64 = i15;
                                                    iM3521 = i13;
                                                    c14505 = c1450;
                                                    c0644 = c06442;
                                                    break;
                                                case 19:
                                                case 20:
                                                    iArr6 = iArr5;
                                                    i12 = iM35143;
                                                    c1450 = c14505;
                                                    c2548 = c25486;
                                                    i13 = iM3521;
                                                    i14 = i72;
                                                    i15 = i64;
                                                    c0680Arr2 = c0680Arr;
                                                    c13992.m2818(c17672.m3517(cArr, c17672.m3514(i97 + 1)));
                                                    i16 = i97 + 3;
                                                    i17 = i76;
                                                    iM3523 = i73;
                                                    i18 = i10;
                                                    while (iArr15 != null) {
                                                    }
                                                    int i982222 = i16;
                                                    int i992222 = i77;
                                                    int iM352342222 = i74;
                                                    while (iArr6 != null) {
                                                    }
                                                    i21 = i992222;
                                                    i22 = i17;
                                                    i23 = i18;
                                                    iArr7 = iArr6;
                                                    c17673 = c17672;
                                                    i75 = i23;
                                                    i4 = i80;
                                                    i59 = i9;
                                                    iM35144 = i8;
                                                    i72 = i14;
                                                    i2 = 3;
                                                    i71 = 0;
                                                    i74 = iM352342222;
                                                    iArr11 = iArr15;
                                                    c25486 = c2548;
                                                    i78 = i982222;
                                                    i76 = i22;
                                                    iM35143 = i12;
                                                    i77 = i21;
                                                    i73 = iM3523;
                                                    iArr12 = iArr7;
                                                    c0680Arr = c0680Arr2;
                                                    i64 = i15;
                                                    iM3521 = i13;
                                                    c14505 = c1450;
                                                    c0644 = c06442;
                                                    break;
                                                case 21:
                                                case 22:
                                                case 23:
                                                case 24:
                                                case 25:
                                                case 54:
                                                case 55:
                                                case 56:
                                                case 57:
                                                case 58:
                                                case 169:
                                                    iArr6 = iArr5;
                                                    i12 = iM35143;
                                                    c1450 = c14505;
                                                    c2548 = c25486;
                                                    i13 = iM3521;
                                                    i14 = i72;
                                                    i15 = i64;
                                                    c0680Arr2 = c0680Arr;
                                                    c13992.m2821(i11, bArr[i97 + 1] & 255);
                                                    i16 = i97 + 2;
                                                    i17 = i76;
                                                    iM3523 = i73;
                                                    i18 = i10;
                                                    while (iArr15 != null) {
                                                    }
                                                    int i9822222 = i16;
                                                    int i9922222 = i77;
                                                    int iM3523422222 = i74;
                                                    while (iArr6 != null) {
                                                    }
                                                    i21 = i9922222;
                                                    i22 = i17;
                                                    i23 = i18;
                                                    iArr7 = iArr6;
                                                    c17673 = c17672;
                                                    i75 = i23;
                                                    i4 = i80;
                                                    i59 = i9;
                                                    iM35144 = i8;
                                                    i72 = i14;
                                                    i2 = 3;
                                                    i71 = 0;
                                                    i74 = iM3523422222;
                                                    iArr11 = iArr15;
                                                    c25486 = c2548;
                                                    i78 = i9822222;
                                                    i76 = i22;
                                                    iM35143 = i12;
                                                    i77 = i21;
                                                    i73 = iM3523;
                                                    iArr12 = iArr7;
                                                    c0680Arr = c0680Arr2;
                                                    i64 = i15;
                                                    iM3521 = i13;
                                                    c14505 = c1450;
                                                    c0644 = c06442;
                                                    break;
                                                case 26:
                                                case 27:
                                                case 28:
                                                case 29:
                                                case 30:
                                                case 31:
                                                case 32:
                                                case 33:
                                                case 34:
                                                case 35:
                                                case 36:
                                                case 37:
                                                case 38:
                                                case 39:
                                                case 40:
                                                case 41:
                                                case 42:
                                                case 43:
                                                case 44:
                                                case 45:
                                                    iArr6 = iArr5;
                                                    i12 = iM35143;
                                                    c1450 = c14505;
                                                    c2548 = c25486;
                                                    i13 = iM3521;
                                                    i14 = i72;
                                                    i15 = i64;
                                                    c0680Arr2 = c0680Arr;
                                                    int i100 = i11 - 26;
                                                    c13992.m2821((i100 >> 2) + 21, i100 & 3);
                                                    i16 = i97 + 1;
                                                    i17 = i76;
                                                    iM3523 = i73;
                                                    i18 = i10;
                                                    while (iArr15 != null) {
                                                    }
                                                    int i98222222 = i16;
                                                    int i99222222 = i77;
                                                    int iM35234222222 = i74;
                                                    while (iArr6 != null) {
                                                    }
                                                    i21 = i99222222;
                                                    i22 = i17;
                                                    i23 = i18;
                                                    iArr7 = iArr6;
                                                    c17673 = c17672;
                                                    i75 = i23;
                                                    i4 = i80;
                                                    i59 = i9;
                                                    iM35144 = i8;
                                                    i72 = i14;
                                                    i2 = 3;
                                                    i71 = 0;
                                                    i74 = iM35234222222;
                                                    iArr11 = iArr15;
                                                    c25486 = c2548;
                                                    i78 = i98222222;
                                                    i76 = i22;
                                                    iM35143 = i12;
                                                    i77 = i21;
                                                    i73 = iM3523;
                                                    iArr12 = iArr7;
                                                    c0680Arr = c0680Arr2;
                                                    i64 = i15;
                                                    iM3521 = i13;
                                                    c14505 = c1450;
                                                    c0644 = c06442;
                                                    break;
                                                case 59:
                                                case 60:
                                                case 61:
                                                case 62:
                                                case 63:
                                                case 64:
                                                case 65:
                                                case 66:
                                                case 67:
                                                case 68:
                                                case 69:
                                                case 70:
                                                case 71:
                                                case 72:
                                                case 73:
                                                case 74:
                                                case 75:
                                                case 76:
                                                case 77:
                                                case 78:
                                                    iArr6 = iArr5;
                                                    i12 = iM35143;
                                                    c1450 = c14505;
                                                    c2548 = c25486;
                                                    i13 = iM3521;
                                                    i14 = i72;
                                                    i15 = i64;
                                                    c0680Arr2 = c0680Arr;
                                                    int i101 = i11 - 59;
                                                    c13992.m2821((i101 >> 2) + 54, i101 & 3);
                                                    i16 = i97 + 1;
                                                    i17 = i76;
                                                    iM3523 = i73;
                                                    i18 = i10;
                                                    while (iArr15 != null) {
                                                    }
                                                    int i982222222 = i16;
                                                    int i992222222 = i77;
                                                    int iM352342222222 = i74;
                                                    while (iArr6 != null) {
                                                    }
                                                    i21 = i992222222;
                                                    i22 = i17;
                                                    i23 = i18;
                                                    iArr7 = iArr6;
                                                    c17673 = c17672;
                                                    i75 = i23;
                                                    i4 = i80;
                                                    i59 = i9;
                                                    iM35144 = i8;
                                                    i72 = i14;
                                                    i2 = 3;
                                                    i71 = 0;
                                                    i74 = iM352342222222;
                                                    iArr11 = iArr15;
                                                    c25486 = c2548;
                                                    i78 = i982222222;
                                                    i76 = i22;
                                                    iM35143 = i12;
                                                    i77 = i21;
                                                    i73 = iM3523;
                                                    iArr12 = iArr7;
                                                    c0680Arr = c0680Arr2;
                                                    i64 = i15;
                                                    iM3521 = i13;
                                                    c14505 = c1450;
                                                    c0644 = c06442;
                                                    break;
                                                case 132:
                                                    iArr6 = iArr5;
                                                    i12 = iM35143;
                                                    c1450 = c14505;
                                                    c2548 = c25486;
                                                    i13 = iM3521;
                                                    i14 = i72;
                                                    i15 = i64;
                                                    c0680Arr2 = c0680Arr;
                                                    c13992.m2814(bArr[i97 + 1] & 255, bArr[i97 + 2]);
                                                    i16 = i97 + 3;
                                                    i17 = i76;
                                                    iM3523 = i73;
                                                    i18 = i10;
                                                    while (iArr15 != null) {
                                                    }
                                                    int i9822222222 = i16;
                                                    int i9922222222 = i77;
                                                    int iM3523422222222 = i74;
                                                    while (iArr6 != null) {
                                                    }
                                                    i21 = i9922222222;
                                                    i22 = i17;
                                                    i23 = i18;
                                                    iArr7 = iArr6;
                                                    c17673 = c17672;
                                                    i75 = i23;
                                                    i4 = i80;
                                                    i59 = i9;
                                                    iM35144 = i8;
                                                    i72 = i14;
                                                    i2 = 3;
                                                    i71 = 0;
                                                    i74 = iM3523422222222;
                                                    iArr11 = iArr15;
                                                    c25486 = c2548;
                                                    i78 = i9822222222;
                                                    i76 = i22;
                                                    iM35143 = i12;
                                                    i77 = i21;
                                                    i73 = iM3523;
                                                    iArr12 = iArr7;
                                                    c0680Arr = c0680Arr2;
                                                    i64 = i15;
                                                    iM3521 = i13;
                                                    c14505 = c1450;
                                                    c0644 = c06442;
                                                    break;
                                                case 153:
                                                case 154:
                                                case 155:
                                                case 156:
                                                case 157:
                                                case 158:
                                                case 159:
                                                case 160:
                                                case 161:
                                                case 162:
                                                case 163:
                                                case 164:
                                                case 165:
                                                case 166:
                                                case 167:
                                                case 168:
                                                case 198:
                                                case 199:
                                                    iArr6 = iArr5;
                                                    i12 = iM35143;
                                                    c1450 = c14505;
                                                    c2548 = c25486;
                                                    i13 = iM3521;
                                                    i14 = i72;
                                                    i15 = i64;
                                                    c0680Arr2 = c0680Arr;
                                                    c13992.m2813(i11, c0680Arr2[c17672.m3509(i97 + 1) + i79]);
                                                    i16 = i97 + 3;
                                                    i17 = i76;
                                                    iM3523 = i73;
                                                    i18 = i10;
                                                    while (iArr15 != null) {
                                                    }
                                                    int i98222222222 = i16;
                                                    int i99222222222 = i77;
                                                    int iM35234222222222 = i74;
                                                    while (iArr6 != null) {
                                                    }
                                                    i21 = i99222222222;
                                                    i22 = i17;
                                                    i23 = i18;
                                                    iArr7 = iArr6;
                                                    c17673 = c17672;
                                                    i75 = i23;
                                                    i4 = i80;
                                                    i59 = i9;
                                                    iM35144 = i8;
                                                    i72 = i14;
                                                    i2 = 3;
                                                    i71 = 0;
                                                    i74 = iM35234222222222;
                                                    iArr11 = iArr15;
                                                    c25486 = c2548;
                                                    i78 = i98222222222;
                                                    i76 = i22;
                                                    iM35143 = i12;
                                                    i77 = i21;
                                                    i73 = iM3523;
                                                    iArr12 = iArr7;
                                                    c0680Arr = c0680Arr2;
                                                    i64 = i15;
                                                    iM3521 = i13;
                                                    c14505 = c1450;
                                                    c0644 = c06442;
                                                    break;
                                                case 170:
                                                    iArr6 = iArr5;
                                                    i12 = iM35143;
                                                    c1450 = c14505;
                                                    c2548 = c25486;
                                                    i13 = iM3521;
                                                    i14 = i72;
                                                    i15 = i64;
                                                    c0680Arr2 = c0680Arr;
                                                    int i102 = (4 - (i79 & 3)) + i97;
                                                    C0680 c06802 = c0680Arr2[c17672.m3521(i102) + i79];
                                                    int iM35214 = c17672.m3521(i102 + 4);
                                                    int iM35215 = c17672.m3521(i102 + 8);
                                                    int i103 = i102 + 12;
                                                    int i104 = (iM35215 - iM35214) + 1;
                                                    C0680[] c0680Arr5 = new C0680[i104];
                                                    for (int i105 = 0; i105 < i104; i105++) {
                                                        c0680Arr5[i105] = c0680Arr2[c17672.m3521(i103) + i79];
                                                        i103 += 4;
                                                    }
                                                    c13992.m2825(iM35214, iM35215, c06802, c0680Arr5);
                                                    i16 = i103;
                                                    i17 = i76;
                                                    iM3523 = i73;
                                                    i18 = i10;
                                                    while (iArr15 != null) {
                                                    }
                                                    int i982222222222 = i16;
                                                    int i992222222222 = i77;
                                                    int iM352342222222222 = i74;
                                                    while (iArr6 != null) {
                                                    }
                                                    i21 = i992222222222;
                                                    i22 = i17;
                                                    i23 = i18;
                                                    iArr7 = iArr6;
                                                    c17673 = c17672;
                                                    i75 = i23;
                                                    i4 = i80;
                                                    i59 = i9;
                                                    iM35144 = i8;
                                                    i72 = i14;
                                                    i2 = 3;
                                                    i71 = 0;
                                                    i74 = iM352342222222222;
                                                    iArr11 = iArr15;
                                                    c25486 = c2548;
                                                    i78 = i982222222222;
                                                    i76 = i22;
                                                    iM35143 = i12;
                                                    i77 = i21;
                                                    i73 = iM3523;
                                                    iArr12 = iArr7;
                                                    c0680Arr = c0680Arr2;
                                                    i64 = i15;
                                                    iM3521 = i13;
                                                    c14505 = c1450;
                                                    c0644 = c06442;
                                                    break;
                                                case 171:
                                                    iArr6 = iArr5;
                                                    i12 = iM35143;
                                                    c1450 = c14505;
                                                    c2548 = c25486;
                                                    i13 = iM3521;
                                                    i14 = i72;
                                                    i15 = i64;
                                                    c0680Arr2 = c0680Arr;
                                                    int i106 = (4 - (i79 & 3)) + i97;
                                                    C0680 c06803 = c0680Arr2[c17672.m3521(i106) + i79];
                                                    int iM35216 = c17672.m3521(i106 + 4);
                                                    int i107 = i106 + 8;
                                                    int[] iArr16 = new int[iM35216];
                                                    C0680[] c0680Arr6 = new C0680[iM35216];
                                                    for (int i108 = 0; i108 < iM35216; i108++) {
                                                        iArr16[i108] = c17672.m3521(i107);
                                                        c0680Arr6[i108] = c0680Arr2[c17672.m3521(i107 + 4) + i79];
                                                        i107 += 8;
                                                    }
                                                    c13992.f6551 = c2548.f12556;
                                                    c2548.m4589(171);
                                                    int i109 = i107;
                                                    c2548.m4584(null, 0, (4 - (c2548.f12556 % 4)) % 4);
                                                    boolean z6 = true;
                                                    c06803.m1587(c2548, c13992.f6551, true);
                                                    c2548.m4585(iM35216);
                                                    int i110 = 0;
                                                    while (i110 < iM35216) {
                                                        c2548.m4585(iArr16[i110]);
                                                        c0680Arr6[i110].m1587(c2548, c13992.f6551, z6);
                                                        i110++;
                                                        z6 = true;
                                                    }
                                                    c13992.m2817(c06803, c0680Arr6);
                                                    i17 = i76;
                                                    iM3523 = i73;
                                                    i16 = i109;
                                                    i18 = i10;
                                                    while (iArr15 != null) {
                                                    }
                                                    int i9822222222222 = i16;
                                                    int i9922222222222 = i77;
                                                    int iM3523422222222222 = i74;
                                                    while (iArr6 != null) {
                                                    }
                                                    i21 = i9922222222222;
                                                    i22 = i17;
                                                    i23 = i18;
                                                    iArr7 = iArr6;
                                                    c17673 = c17672;
                                                    i75 = i23;
                                                    i4 = i80;
                                                    i59 = i9;
                                                    iM35144 = i8;
                                                    i72 = i14;
                                                    i2 = 3;
                                                    i71 = 0;
                                                    i74 = iM3523422222222222;
                                                    iArr11 = iArr15;
                                                    c25486 = c2548;
                                                    i78 = i9822222222222;
                                                    i76 = i22;
                                                    iM35143 = i12;
                                                    i77 = i21;
                                                    i73 = iM3523;
                                                    iArr12 = iArr7;
                                                    c0680Arr = c0680Arr2;
                                                    i64 = i15;
                                                    iM3521 = i13;
                                                    c14505 = c1450;
                                                    c0644 = c06442;
                                                    break;
                                                case 178:
                                                case 179:
                                                case 180:
                                                case 181:
                                                case 182:
                                                case 183:
                                                case 184:
                                                case 185:
                                                    iArr6 = iArr5;
                                                    i12 = iM35143;
                                                    C1450 c14506 = c14505;
                                                    C2548 c25487 = c25486;
                                                    i13 = iM3521;
                                                    i14 = i72;
                                                    i15 = i64;
                                                    c0680Arr2 = c0680Arr;
                                                    int i111 = iArr10[c17672.m3514(i97 + 1)];
                                                    int i112 = iArr10[c17672.m3514(i111 + 2)];
                                                    String strM3507 = c17672.m3507(cArr, i111);
                                                    c2548 = c25487;
                                                    String strM35163 = c17672.m3516(cArr, i112);
                                                    String strM35164 = c17672.m3516(cArr, i112 + 2);
                                                    if (i11 < 182) {
                                                        c13992.m2815(i11, strM3507, strM35163, strM35164);
                                                        c1450 = c14506;
                                                    } else {
                                                        if (bArr[i111 - 1] == 11) {
                                                            C1399 c13994 = c13992;
                                                            i19 = i11;
                                                            c13993 = c13994;
                                                            c1450 = c14506;
                                                            str = strM35164;
                                                            z = true;
                                                        } else {
                                                            C1399 c13995 = c13992;
                                                            i19 = i11;
                                                            c13993 = c13995;
                                                            c1450 = c14506;
                                                            str = strM35164;
                                                            z = false;
                                                        }
                                                        c13993.m2829(i19, strM3507, strM35163, str, z);
                                                        int i113 = i19;
                                                        c13992 = c13993;
                                                        i11 = i113;
                                                    }
                                                    i16 = i11 == 185 ? i97 + 5 : i97 + 3;
                                                    i17 = i76;
                                                    iM3523 = i73;
                                                    i18 = i10;
                                                    while (iArr15 != null) {
                                                    }
                                                    int i98222222222222 = i16;
                                                    int i99222222222222 = i77;
                                                    int iM35234222222222222 = i74;
                                                    while (iArr6 != null) {
                                                    }
                                                    i21 = i99222222222222;
                                                    i22 = i17;
                                                    i23 = i18;
                                                    iArr7 = iArr6;
                                                    c17673 = c17672;
                                                    i75 = i23;
                                                    i4 = i80;
                                                    i59 = i9;
                                                    iM35144 = i8;
                                                    i72 = i14;
                                                    i2 = 3;
                                                    i71 = 0;
                                                    i74 = iM35234222222222222;
                                                    iArr11 = iArr15;
                                                    c25486 = c2548;
                                                    i78 = i98222222222222;
                                                    i76 = i22;
                                                    iM35143 = i12;
                                                    i77 = i21;
                                                    i73 = iM3523;
                                                    iArr12 = iArr7;
                                                    c0680Arr = c0680Arr2;
                                                    i64 = i15;
                                                    iM3521 = i13;
                                                    c14505 = c1450;
                                                    c0644 = c06442;
                                                    break;
                                                case 186:
                                                    C1450 c14507 = c14505;
                                                    C2548 c25488 = c25486;
                                                    i13 = iM3521;
                                                    i15 = i64;
                                                    c0680Arr2 = c0680Arr;
                                                    int i114 = iArr10[c17672.m3514(i97 + 1)];
                                                    int i115 = iArr10[c17672.m3514(i114 + 2)];
                                                    String strM35165 = c17672.m3516(cArr, i115);
                                                    String strM35166 = c17672.m3516(cArr, i115 + 2);
                                                    int i116 = c17672.f8868[c17672.m3514(i114)];
                                                    C2767 c2767 = (C2767) c17672.m3517(cArr, c17672.m3514(i116));
                                                    int iM35149 = c17672.m3514(i116 + 2);
                                                    i14 = i72;
                                                    Object[] objArr2 = new Object[iM35149];
                                                    iArr6 = iArr5;
                                                    int i117 = i116 + 4;
                                                    i12 = iM35143;
                                                    int i118 = 0;
                                                    while (i118 < iM35149) {
                                                        objArr2[i118] = c17672.m3517(cArr, c17672.m3514(i117));
                                                        i117 += 2;
                                                        i118++;
                                                        iM35149 = iM35149;
                                                    }
                                                    c13992.f6551 = c25488.f12556;
                                                    C0029 c0029M2961 = c14507.m2961(18, c14507.m2954(c2767, objArr2).f11716, strM35165, strM35166);
                                                    c25488.m4586(186, c0029M2961.f11716);
                                                    c25488.m4590(0);
                                                    C0680 c06804 = c13992.f6538;
                                                    if (c06804 != null) {
                                                        if (i15 == 4 || i15 == 3) {
                                                            c06804.f3239.mo726(186, 0, c0029M2961, c14507);
                                                        } else {
                                                            int iM2595 = c0029M2961.f11718;
                                                            if (iM2595 == 0) {
                                                                iM2595 = C1308.m2595(c0029M2961.f11715);
                                                                c0029M2961.f11718 = iM2595;
                                                            }
                                                            int i119 = c13992.f6557 + ((iM2595 & 3) - (iM2595 >> 2)) + 1;
                                                            if (i119 > c13992.f6537) {
                                                                c13992.f6537 = i119;
                                                            }
                                                            c13992.f6557 = i119;
                                                        }
                                                    }
                                                    i16 = i97 + 5;
                                                    c2548 = c25488;
                                                    c1450 = c14507;
                                                    i17 = i76;
                                                    iM3523 = i73;
                                                    i18 = i10;
                                                    while (iArr15 != null) {
                                                    }
                                                    int i982222222222222 = i16;
                                                    int i992222222222222 = i77;
                                                    int iM352342222222222222 = i74;
                                                    while (iArr6 != null) {
                                                    }
                                                    i21 = i992222222222222;
                                                    i22 = i17;
                                                    i23 = i18;
                                                    iArr7 = iArr6;
                                                    c17673 = c17672;
                                                    i75 = i23;
                                                    i4 = i80;
                                                    i59 = i9;
                                                    iM35144 = i8;
                                                    i72 = i14;
                                                    i2 = 3;
                                                    i71 = 0;
                                                    i74 = iM352342222222222222;
                                                    iArr11 = iArr15;
                                                    c25486 = c2548;
                                                    i78 = i982222222222222;
                                                    i76 = i22;
                                                    iM35143 = i12;
                                                    i77 = i21;
                                                    i73 = iM3523;
                                                    iArr12 = iArr7;
                                                    c0680Arr = c0680Arr2;
                                                    i64 = i15;
                                                    iM3521 = i13;
                                                    c14505 = c1450;
                                                    c0644 = c06442;
                                                    break;
                                                case 187:
                                                case 189:
                                                case 192:
                                                case 193:
                                                    c14502 = c14505;
                                                    c25482 = c25486;
                                                    i13 = iM3521;
                                                    i15 = i64;
                                                    c0680Arr2 = c0680Arr;
                                                    c13992.m2824(i11, c17672.m3507(cArr, i97 + 1));
                                                    i16 = i97 + 3;
                                                    iArr6 = iArr5;
                                                    i12 = iM35143;
                                                    i14 = i72;
                                                    iM3523 = i73;
                                                    c2548 = c25482;
                                                    c1450 = c14502;
                                                    i17 = i76;
                                                    i18 = i10;
                                                    while (iArr15 != null) {
                                                    }
                                                    int i9822222222222222 = i16;
                                                    int i9922222222222222 = i77;
                                                    int iM3523422222222222222 = i74;
                                                    while (iArr6 != null) {
                                                    }
                                                    i21 = i9922222222222222;
                                                    i22 = i17;
                                                    i23 = i18;
                                                    iArr7 = iArr6;
                                                    c17673 = c17672;
                                                    i75 = i23;
                                                    i4 = i80;
                                                    i59 = i9;
                                                    iM35144 = i8;
                                                    i72 = i14;
                                                    i2 = 3;
                                                    i71 = 0;
                                                    i74 = iM3523422222222222222;
                                                    iArr11 = iArr15;
                                                    c25486 = c2548;
                                                    i78 = i9822222222222222;
                                                    i76 = i22;
                                                    iM35143 = i12;
                                                    i77 = i21;
                                                    i73 = iM3523;
                                                    iArr12 = iArr7;
                                                    c0680Arr = c0680Arr2;
                                                    i64 = i15;
                                                    iM3521 = i13;
                                                    c14505 = c1450;
                                                    c0644 = c06442;
                                                    break;
                                                case 196:
                                                    c14502 = c14505;
                                                    c25482 = c25486;
                                                    i13 = iM3521;
                                                    i15 = i64;
                                                    c0680Arr2 = c0680Arr;
                                                    int i120 = bArr[i97 + 1] & 255;
                                                    if (i120 == 132) {
                                                        c13992.m2814(c17672.m3514(i97 + 2), c17672.m3509(i97 + 4));
                                                        i16 = i97 + 6;
                                                        iArr6 = iArr5;
                                                        i12 = iM35143;
                                                        i14 = i72;
                                                        iM3523 = i73;
                                                        c2548 = c25482;
                                                        c1450 = c14502;
                                                        i17 = i76;
                                                        i18 = i10;
                                                        while (iArr15 != null) {
                                                        }
                                                        int i98222222222222222 = i16;
                                                        int i99222222222222222 = i77;
                                                        int iM35234222222222222222 = i74;
                                                        while (iArr6 != null) {
                                                        }
                                                        i21 = i99222222222222222;
                                                        i22 = i17;
                                                        i23 = i18;
                                                        iArr7 = iArr6;
                                                        c17673 = c17672;
                                                        i75 = i23;
                                                        i4 = i80;
                                                        i59 = i9;
                                                        iM35144 = i8;
                                                        i72 = i14;
                                                        i2 = 3;
                                                        i71 = 0;
                                                        i74 = iM35234222222222222222;
                                                        iArr11 = iArr15;
                                                        c25486 = c2548;
                                                        i78 = i98222222222222222;
                                                        i76 = i22;
                                                        iM35143 = i12;
                                                        i77 = i21;
                                                        i73 = iM3523;
                                                        iArr12 = iArr7;
                                                        c0680Arr = c0680Arr2;
                                                        i64 = i15;
                                                        iM3521 = i13;
                                                        c14505 = c1450;
                                                        c0644 = c06442;
                                                    } else {
                                                        c13992.m2821(i120, c17672.m3514(i97 + 2));
                                                        i16 = i97 + 4;
                                                        iArr6 = iArr5;
                                                        i12 = iM35143;
                                                        i14 = i72;
                                                        iM3523 = i73;
                                                        c2548 = c25482;
                                                        c1450 = c14502;
                                                        i17 = i76;
                                                        i18 = i10;
                                                        while (iArr15 != null) {
                                                        }
                                                        int i982222222222222222 = i16;
                                                        int i992222222222222222 = i77;
                                                        int iM352342222222222222222 = i74;
                                                        while (iArr6 != null) {
                                                        }
                                                        i21 = i992222222222222222;
                                                        i22 = i17;
                                                        i23 = i18;
                                                        iArr7 = iArr6;
                                                        c17673 = c17672;
                                                        i75 = i23;
                                                        i4 = i80;
                                                        i59 = i9;
                                                        iM35144 = i8;
                                                        i72 = i14;
                                                        i2 = 3;
                                                        i71 = 0;
                                                        i74 = iM352342222222222222222;
                                                        iArr11 = iArr15;
                                                        c25486 = c2548;
                                                        i78 = i982222222222222222;
                                                        i76 = i22;
                                                        iM35143 = i12;
                                                        i77 = i21;
                                                        i73 = iM3523;
                                                        iArr12 = iArr7;
                                                        c0680Arr = c0680Arr2;
                                                        i64 = i15;
                                                        iM3521 = i13;
                                                        c14505 = c1450;
                                                        c0644 = c06442;
                                                    }
                                                    break;
                                                case 197:
                                                    String strM35072 = c17672.m3507(cArr, i97 + 1);
                                                    int i121 = bArr[i97 + 3] & 255;
                                                    c25482 = c25486;
                                                    c13992.f6551 = c25482.f12556;
                                                    c14502 = c14505;
                                                    C0029 c0029M2960 = c14502.m2960(7, strM35072);
                                                    i13 = iM3521;
                                                    c25482.m4586(197, c0029M2960.f11716);
                                                    c25482.m4589(i121);
                                                    C0680 c06805 = c13992.f6538;
                                                    if (c06805 != null) {
                                                        i15 = i64;
                                                        c0680Arr2 = c0680Arr;
                                                        if (i15 == 4 || i15 == 3) {
                                                            c06805.f3239.mo726(197, i121, c0029M2960, c14502);
                                                        } else {
                                                            c13992.f6557 = (1 - i121) + c13992.f6557;
                                                        }
                                                    } else {
                                                        i15 = i64;
                                                        c0680Arr2 = c0680Arr;
                                                    }
                                                    i16 = i97 + 4;
                                                    iArr6 = iArr5;
                                                    i12 = iM35143;
                                                    i14 = i72;
                                                    iM3523 = i73;
                                                    c2548 = c25482;
                                                    c1450 = c14502;
                                                    i17 = i76;
                                                    i18 = i10;
                                                    while (iArr15 != null) {
                                                    }
                                                    int i9822222222222222222 = i16;
                                                    int i9922222222222222222 = i77;
                                                    int iM3523422222222222222222 = i74;
                                                    while (iArr6 != null) {
                                                    }
                                                    i21 = i9922222222222222222;
                                                    i22 = i17;
                                                    i23 = i18;
                                                    iArr7 = iArr6;
                                                    c17673 = c17672;
                                                    i75 = i23;
                                                    i4 = i80;
                                                    i59 = i9;
                                                    iM35144 = i8;
                                                    i72 = i14;
                                                    i2 = 3;
                                                    i71 = 0;
                                                    i74 = iM3523422222222222222222;
                                                    iArr11 = iArr15;
                                                    c25486 = c2548;
                                                    i78 = i9822222222222222222;
                                                    i76 = i22;
                                                    iM35143 = i12;
                                                    i77 = i21;
                                                    i73 = iM3523;
                                                    iArr12 = iArr7;
                                                    c0680Arr = c0680Arr2;
                                                    i64 = i15;
                                                    iM3521 = i13;
                                                    c14505 = c1450;
                                                    c0644 = c06442;
                                                    break;
                                                case 200:
                                                case 201:
                                                    c13992.m2813(i11 - i72, c0680Arr[c17672.m3521(i97 + 1) + i79]);
                                                    i16 = i97 + 5;
                                                    iArr6 = iArr5;
                                                    i12 = iM35143;
                                                    i17 = i76;
                                                    iM3523 = i73;
                                                    i18 = i10;
                                                    c1450 = c14505;
                                                    c2548 = c25486;
                                                    i13 = iM3521;
                                                    i14 = i72;
                                                    i15 = i64;
                                                    c0680Arr2 = c0680Arr;
                                                    while (iArr15 != null) {
                                                    }
                                                    int i98222222222222222222 = i16;
                                                    int i99222222222222222222 = i77;
                                                    int iM35234222222222222222222 = i74;
                                                    while (iArr6 != null) {
                                                    }
                                                    i21 = i99222222222222222222;
                                                    i22 = i17;
                                                    i23 = i18;
                                                    iArr7 = iArr6;
                                                    c17673 = c17672;
                                                    i75 = i23;
                                                    i4 = i80;
                                                    i59 = i9;
                                                    iM35144 = i8;
                                                    i72 = i14;
                                                    i2 = 3;
                                                    i71 = 0;
                                                    i74 = iM35234222222222222222222;
                                                    iArr11 = iArr15;
                                                    c25486 = c2548;
                                                    i78 = i98222222222222222222;
                                                    i76 = i22;
                                                    iM35143 = i12;
                                                    i77 = i21;
                                                    i73 = iM3523;
                                                    iArr12 = iArr7;
                                                    c0680Arr = c0680Arr2;
                                                    i64 = i15;
                                                    iM3521 = i13;
                                                    c14505 = c1450;
                                                    c0644 = c06442;
                                                    break;
                                                case 202:
                                                case 203:
                                                case 204:
                                                case 205:
                                                case 206:
                                                case 207:
                                                case 208:
                                                case 209:
                                                case 210:
                                                case 211:
                                                case 212:
                                                case 213:
                                                case 214:
                                                case 215:
                                                case 216:
                                                case 217:
                                                case 218:
                                                case 219:
                                                    int i122 = i11 < 218 ? i11 - 49 : i11 - 20;
                                                    C0680 c06806 = c0680Arr[c17672.m3514(i97 + 1) + i79];
                                                    if (i122 == 167 || i122 == 168) {
                                                        c13992.m2813(i122 + 33, c06806);
                                                        i20 = i10;
                                                    } else {
                                                        c13992.m2813(i122 < 167 ? ((i122 + 1) ^ 1) - 1 : i122 ^ 1, m3506(i79 + 3, c0680Arr));
                                                        c13992.m2813(200, c06806);
                                                        i20 = 1;
                                                    }
                                                    i16 = i97 + 3;
                                                    i18 = i20;
                                                    iArr6 = iArr5;
                                                    i12 = iM35143;
                                                    i17 = i76;
                                                    iM3523 = i73;
                                                    c1450 = c14505;
                                                    c2548 = c25486;
                                                    i13 = iM3521;
                                                    i14 = i72;
                                                    i15 = i64;
                                                    c0680Arr2 = c0680Arr;
                                                    while (iArr15 != null) {
                                                    }
                                                    int i982222222222222222222 = i16;
                                                    int i992222222222222222222 = i77;
                                                    int iM352342222222222222222222 = i74;
                                                    while (iArr6 != null) {
                                                    }
                                                    i21 = i992222222222222222222;
                                                    i22 = i17;
                                                    i23 = i18;
                                                    iArr7 = iArr6;
                                                    c17673 = c17672;
                                                    i75 = i23;
                                                    i4 = i80;
                                                    i59 = i9;
                                                    iM35144 = i8;
                                                    i72 = i14;
                                                    i2 = 3;
                                                    i71 = 0;
                                                    i74 = iM352342222222222222222222;
                                                    iArr11 = iArr15;
                                                    c25486 = c2548;
                                                    i78 = i982222222222222222222;
                                                    i76 = i22;
                                                    iM35143 = i12;
                                                    i77 = i21;
                                                    i73 = iM3523;
                                                    iArr12 = iArr7;
                                                    c0680Arr = c0680Arr2;
                                                    i64 = i15;
                                                    iM3521 = i13;
                                                    c14505 = c1450;
                                                    c0644 = c06442;
                                                    break;
                                                case 220:
                                                    c13992.m2813(200, c0680Arr[c17672.m3521(i97 + 1) + i79]);
                                                    i16 = i97 + 5;
                                                    iArr6 = iArr5;
                                                    i12 = iM35143;
                                                    i17 = i76;
                                                    iM3523 = i73;
                                                    c1450 = c14505;
                                                    c2548 = c25486;
                                                    i18 = 1;
                                                    i13 = iM3521;
                                                    i14 = i72;
                                                    i15 = i64;
                                                    c0680Arr2 = c0680Arr;
                                                    while (iArr15 != null) {
                                                    }
                                                    int i9822222222222222222222 = i16;
                                                    int i9922222222222222222222 = i77;
                                                    int iM3523422222222222222222222 = i74;
                                                    while (iArr6 != null) {
                                                    }
                                                    i21 = i9922222222222222222222;
                                                    i22 = i17;
                                                    i23 = i18;
                                                    iArr7 = iArr6;
                                                    c17673 = c17672;
                                                    i75 = i23;
                                                    i4 = i80;
                                                    i59 = i9;
                                                    iM35144 = i8;
                                                    i72 = i14;
                                                    i2 = 3;
                                                    i71 = 0;
                                                    i74 = iM3523422222222222222222222;
                                                    iArr11 = iArr15;
                                                    c25486 = c2548;
                                                    i78 = i9822222222222222222222;
                                                    i76 = i22;
                                                    iM35143 = i12;
                                                    i77 = i21;
                                                    i73 = iM3523;
                                                    iArr12 = iArr7;
                                                    c0680Arr = c0680Arr2;
                                                    i64 = i15;
                                                    iM3521 = i13;
                                                    c14505 = c1450;
                                                    c0644 = c06442;
                                                    break;
                                                default:
                                                    throw new AssertionError();
                                            }
                                        }
                                    }
                                    int[] iArr142 = iArr12;
                                    int i972 = i78;
                                    int[] iArr152 = iArr4;
                                    if (i75 == 0) {
                                    }
                                    i11 = bArr[i972] & 255;
                                    switch (i11) {
                                    }
                                }
                                C1767 c17675 = c17673;
                                int[] iArr17 = iArr11;
                                int i123 = iM35144;
                                C0644 c06444 = c0644;
                                int i124 = iM35143;
                                C1450 c14508 = c14505;
                                int i125 = iM3521;
                                int i126 = i64;
                                C0680[] c0680Arr7 = c0680Arr;
                                int[] iArr18 = iArr12;
                                C0680 c06807 = c0680Arr7[i125];
                                if (c06807 != null) {
                                    c13992.m2811(c06807);
                                }
                                int i127 = i61;
                                if (i127 != 0 && (c1060.f4839 & 2) == 0) {
                                    int i128 = i62;
                                    if (i128 != 0) {
                                        int iM351410 = c17675.m3514(i128) * 3;
                                        int[] iArr19 = new int[iM351410];
                                        int i129 = i128 + 2;
                                        while (iM351410 > 0) {
                                            iArr19[iM351410 - 1] = i129 + 6;
                                            iArr19[iM351410 - 2] = c17675.m3514(i129 + 8);
                                            iM351410 -= 3;
                                            iArr19[iM351410] = c17675.m3514(i129);
                                            i129 += 10;
                                        }
                                        iArr2 = iArr19;
                                    } else {
                                        iArr2 = null;
                                    }
                                    int iM351411 = c17675.m3514(i127);
                                    int i130 = i127 + 2;
                                    while (true) {
                                        int i131 = iM351411 - 1;
                                        if (iM351411 > 0) {
                                            int iM351412 = c17675.m3514(i130);
                                            int iM351413 = c17675.m3514(i130 + 2);
                                            String strM35167 = c17675.m3516(cArr, i130 + 4);
                                            String strM35168 = c17675.m3516(cArr, i130 + 6);
                                            int iM351414 = c17675.m3514(i130 + 8);
                                            int i132 = i130 + 10;
                                            if (iArr2 != null) {
                                                for (int i133 = 0; i133 < iArr2.length; i133 += 3) {
                                                    if (iArr2[i133] == iM351412 && iArr2[i133 + 1] == iM351414) {
                                                        strM3516 = c17675.m3516(cArr, iArr2[i133 + 2]);
                                                    }
                                                }
                                                strM3516 = null;
                                            } else {
                                                strM3516 = null;
                                            }
                                            C0680 c06808 = c0680Arr7[iM351412];
                                            C0680 c06809 = c0680Arr7[iM351412 + iM351413];
                                            if (strM3516 != null) {
                                                C2548 c25489 = c13992.f6544;
                                                if (c25489 == null) {
                                                    c25489 = new C2548();
                                                    c13992.f6544 = c25489;
                                                }
                                                iArr3 = iArr2;
                                                c13992.f6549++;
                                                c25489.m4590(c06808.f3242);
                                                c25489.m4590(c06809.f3242 - c06808.f3242);
                                                c25489.m4590(c14508.m2952(strM35167));
                                                c25489.m4590(c14508.m2952(strM3516));
                                                c25489.m4590(iM351414);
                                            } else {
                                                iArr3 = iArr2;
                                            }
                                            C2548 c254810 = c13992.f6571;
                                            if (c254810 == null) {
                                                c254810 = new C2548();
                                                c13992.f6571 = c254810;
                                            }
                                            c13992.f6542++;
                                            c254810.m4590(c06808.f3242);
                                            c254810.m4590(c06809.f3242 - c06808.f3242);
                                            c254810.m4590(c14508.m2952(strM35167));
                                            c254810.m4590(c14508.m2952(strM35168));
                                            c254810.m4590(iM351414);
                                            if (i126 != 0) {
                                                char cCharAt2 = strM35168.charAt(0);
                                                int i134 = iM351414 + ((cCharAt2 == 'J' || cCharAt2 == 'D') ? 2 : 1);
                                                if (i134 > c13992.f6534) {
                                                    c13992.f6534 = i134;
                                                }
                                            }
                                            i130 = i132;
                                            iM351411 = i131;
                                            iArr2 = iArr3;
                                        }
                                    }
                                }
                                int i135 = 65;
                                if (iArr17 != null) {
                                    int length = iArr17.length;
                                    int i136 = 0;
                                    while (i136 < length) {
                                        int i137 = iArr17[i136];
                                        int iM3511 = c17675.m3511(i137);
                                        if (iM3511 == 64 || iM3511 == 65) {
                                            int iM35133 = c17675.m3513(c1060, i137);
                                            iArr = iArr17;
                                            c1767 = this;
                                            i7 = i123;
                                            c1767.m3510(c1399.m2822(c1060.f4832, c1060.f4834, c1060.f4844, c1060.f4842, c1060.f4843, c17675.m3516(cArr, iM35133), true), iM35133 + 2, true, cArr);
                                        } else {
                                            iArr = iArr17;
                                            c1767 = c17675;
                                            i7 = i123;
                                        }
                                        i136++;
                                        c17675 = c1767;
                                        iArr17 = iArr;
                                        i123 = i7;
                                    }
                                }
                                C1767 c17676 = c17675;
                                int i138 = i123;
                                if (iArr18 != null) {
                                    int length2 = iArr18.length;
                                    int i139 = 0;
                                    while (i139 < length2) {
                                        int i140 = iArr18[i139];
                                        int iM35112 = c17676.m3511(i140);
                                        if (iM35112 == 64 || iM35112 == i135) {
                                            int iM35134 = c17676.m3513(c1060, i140);
                                            c17676.m3510(c1399.m2822(c1060.f4832, c1060.f4834, c1060.f4844, c1060.f4842, c1060.f4843, c17676.m3516(cArr, iM35134), false), iM35134 + 2, true, cArr);
                                        }
                                        i139++;
                                        i135 = 65;
                                    }
                                }
                                C0644 c06445 = c06444;
                                while (c06445 != null) {
                                    C0644 c06446 = (C0644) c06445.f3101;
                                    c06445.f3101 = c1399.f6528;
                                    c1399.f6528 = c06445;
                                    c06445 = c06446;
                                }
                                c1399.m2819(i124, i138);
                                return;
                            }
                            String strM35169 = c17673.m3516(cArr, i58);
                            int i141 = 0;
                            int iM35217 = c17673.m3521(i58 + 2);
                            int i142 = i58;
                            int i143 = i142 + 6;
                            int i144 = i43;
                            if ("LocalVariableTable".equals(strM35169)) {
                                if ((c1060.f4839 & 2) == 0) {
                                    int iM351415 = c17673.m3514(i143);
                                    int i145 = i142 + 8;
                                    while (true) {
                                        int i146 = iM351415 - 1;
                                        if (iM351415 > 0) {
                                            int iM351416 = c17673.m3514(i145);
                                            C0680 c068010 = c0680Arr3[iM351416];
                                            if (c068010 == null) {
                                                if (c068010 == null) {
                                                    c0680Arr3[iM351416] = new C0680();
                                                }
                                                i39 = iM351416;
                                                C0680 c068011 = c0680Arr3[i39];
                                                i40 = i145;
                                                c068011.f3234 = (short) (c068011.f3234 | 1);
                                            } else {
                                                i39 = iM351416;
                                                i40 = i145;
                                            }
                                            int iM351417 = c17673.m3514(i40 + 2) + i39;
                                            C0680 c068012 = c0680Arr3[iM351417];
                                            if (c068012 == null) {
                                                if (c068012 == null) {
                                                    c0680Arr3[iM351417] = new C0680();
                                                }
                                                C0680 c068013 = c0680Arr3[iM351417];
                                                c068013.f3234 = (short) (c068013.f3234 | 1);
                                            }
                                            i145 = i40 + 10;
                                            iM351415 = i146;
                                        } else {
                                            i61 = i143;
                                        }
                                    }
                                }
                            } else if ("LocalVariableTypeTable".equals(strM35169)) {
                                i62 = i143;
                            } else if (!"LineNumberTable".equals(strM35169)) {
                                i35 = i42;
                                c25483 = c25485;
                                c14503 = c14504;
                                if ("RuntimeVisibleTypeAnnotations".equals(strM35169)) {
                                    iArrM3524 = c17673.m3524(c1399, c1060, i143, z2);
                                } else if ("RuntimeInvisibleTypeAnnotations".equals(strM35169)) {
                                    iArrM35242 = c17673.m3524(c1399, c1060, i143, false);
                                } else if ("StackMapTable".equals(strM35169)) {
                                    if ((c1060.f4839 & 4) == 0) {
                                        i59 = i142 + 8;
                                        i60 = i143 + iM35217;
                                    }
                                } else if (!"StackMap".equals(strM35169)) {
                                    C0644 c0644M3526 = c17673.m3526(c1060.f4836, strM35169, i143, iM35217);
                                    c0644M3526.f3101 = c06443;
                                    c06443 = c0644M3526;
                                } else if ((c1060.f4839 & 4) == 0) {
                                    i59 = i142 + 8;
                                    i60 = i143 + iM35217;
                                    z3 = false;
                                }
                                i58 = i143 + iM35217;
                                iM35146 = i63;
                                i43 = i144;
                                c14504 = c14503;
                                i42 = i35;
                                c25485 = c25483;
                                z2 = true;
                                i52 = 4;
                            } else if ((c1060.f4839 & 2) == 0) {
                                int iM351418 = c17673.m3514(i143);
                                int i147 = i142 + 8;
                                while (true) {
                                    int i148 = iM351418 - 1;
                                    if (iM351418 > 0) {
                                        int iM351419 = c17673.m3514(i147);
                                        int iM351420 = c17673.m3514(i147 + 2);
                                        int i149 = i147 + 4;
                                        C0680 c068014 = c0680Arr3[iM351419];
                                        if (c068014 == null) {
                                            if (c068014 == null) {
                                                c0680Arr3[iM351419] = new C0680();
                                            }
                                            i37 = i149;
                                            C0680 c068015 = c0680Arr3[iM351419];
                                            i36 = i42;
                                            c068015.f3234 = (short) (c068015.f3234 | 1);
                                        } else {
                                            i36 = i42;
                                            i37 = i149;
                                        }
                                        C0680 c068016 = c0680Arr3[iM351419];
                                        short s = c068016.f3234;
                                        C1450 c14509 = c14504;
                                        if ((s & 128) == 0) {
                                            c068016.f3234 = (short) (s | 128);
                                            c068016.f3235 = (short) iM351420;
                                            c25484 = c25485;
                                        } else {
                                            int[] iArr20 = c068016.f3240;
                                            int i150 = i52;
                                            if (iArr20 == null) {
                                                iArr20 = new int[i150];
                                                c068016.f3240 = iArr20;
                                            }
                                            int i151 = iArr20[i141] + 1;
                                            iArr20[i141] = i151;
                                            if (i151 >= iArr20.length) {
                                                int[] iArr21 = new int[iArr20.length + 4];
                                                i38 = i151;
                                                c25484 = c25485;
                                                int i152 = i141;
                                                System.arraycopy(iArr20, i152, iArr21, i152, iArr20.length);
                                                c068016.f3240 = iArr21;
                                                iArr20 = iArr21;
                                            } else {
                                                c25484 = c25485;
                                                i38 = i151;
                                            }
                                            iArr20[i38] = iM351420;
                                        }
                                        iM351418 = i148;
                                        c14504 = c14509;
                                        i147 = i37;
                                        i42 = i36;
                                        c25485 = c25484;
                                        i52 = 4;
                                        i141 = 0;
                                    }
                                }
                            }
                            i35 = i42;
                            c25483 = c25485;
                            c14503 = c14504;
                            i58 = i143 + iM35217;
                            iM35146 = i63;
                            i43 = i144;
                            c14504 = c14503;
                            i42 = i35;
                            c25485 = c25483;
                            z2 = true;
                            i52 = 4;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C0644 m3526(C0644[] c0644Arr, String str, int i, int i2) {
        int length = c0644Arr.length;
        int i3 = 0;
        while (true) {
            byte[] bArr = this.f8865;
            if (i3 >= length) {
                C0644 c0644 = new C0644(str);
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, i, bArr2, 0, i2);
                C2548 c2548 = new C2548(false);
                c2548.f12555 = bArr2;
                c2548.f12556 = i2;
                c0644.f3102 = c2548;
                return c0644;
            }
            C0644 c06442 = c0644Arr[i3];
            if (((String) c06442.f3099).equals(str)) {
                C0644 c06443 = new C0644((String) c06442.f3099);
                byte[] bArr3 = new byte[i2];
                System.arraycopy(bArr, i, bArr3, 0, i2);
                C2548 c25482 = new C2548(false);
                c25482.f12555 = bArr3;
                c25482.f12556 = i2;
                c06443.f3102 = c25482;
                return c06443;
            }
            i3++;
        }
    }
}
