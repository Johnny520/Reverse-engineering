package Yue;

import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC4765
@InterfaceC7470(version = "1.8")
public class C3509 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f5889 = 8;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f5890 = 6;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f5891 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f5892 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final byte f5893 = 61;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f5894 = 76;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f5895 = 19;

    /* JADX INFO: renamed from: ۥ */
    public final boolean f345;

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean f346;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0164 f5888 = new C0164(null);

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public static final byte[] f5896 = {13, 10};

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C3509 f5897 = new C3509(true, false);

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C3509 f5898 = new C3509(false, true);

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۥ$ۥ */
    public static final class C0164 extends C3509 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۟ۢۥ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0164(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public final C3509 m9388() {
            return C3509.f5898;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public final byte[] m9389() {
            return C3509.f5896;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public final C3509 m9390() {
            return C3509.f5897;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX WARN: Illegal instructions before constructor call */
        public C0164() {
            boolean z = false;
            super(z, z, null);
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 boolean), (r2v0 boolean) A[MD:(boolean, boolean):void (m)] (LINE:1) call: Yue.ۥ۟ۢۥ.<init>(boolean, boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3509(boolean z, boolean z2, C4335 c4335) {
        this(z, z2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static /* synthetic */ byte[] m9359(C3509 c3509, CharSequence charSequence, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = charSequence.length();
        }
        return c3509.m9371(charSequence, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static /* synthetic */ byte[] m9360(C3509 c3509, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return c3509.m9372(bArr, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ int m9361(C3509 c3509, CharSequence charSequence, byte[] bArr, int i, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        int i5 = (i4 & 4) != 0 ? 0 : i;
        int i6 = (i4 & 8) != 0 ? 0 : i2;
        if ((i4 & 16) != 0) {
            i3 = charSequence.length();
        }
        return c3509.m9374(charSequence, bArr, i5, i6, i3);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static /* synthetic */ int m9362(C3509 c3509, byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        int i5 = (i4 & 4) != 0 ? 0 : i;
        int i6 = (i4 & 8) != 0 ? 0 : i2;
        if ((i4 & 16) != 0) {
            i3 = bArr.length;
        }
        return c3509.m9375(bArr, bArr2, i5, i6, i3);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static /* synthetic */ String m9363(C3509 c3509, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return c3509.m9377(bArr, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static /* synthetic */ int m9364(C3509 c3509, byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeIntoByteArray");
        }
        int i5 = (i4 & 4) != 0 ? 0 : i;
        int i6 = (i4 & 8) != 0 ? 0 : i2;
        if ((i4 & 16) != 0) {
            i3 = bArr.length;
        }
        return c3509.m9378(bArr, bArr2, i5, i6, i3);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static /* synthetic */ Appendable m9365(C3509 c3509, byte[] bArr, Appendable appendable, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToAppendable");
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = bArr.length;
        }
        return c3509.m9381(bArr, appendable, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static /* synthetic */ byte[] m9366(C3509 c3509, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToByteArray");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return c3509.m9382(bArr, i, i2);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final String m9367(@InterfaceC6399 byte[] bArr) {
        C5499.m17103(bArr, "source");
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b : bArr) {
            sb.append((char) b);
        }
        String string = sb.toString();
        C5499.m17102(string, "stringBuilder.toString()");
        return string;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final byte[] m9368(@InterfaceC6399 CharSequence charSequence, int i, int i2) {
        C5499.m17103(charSequence, "source");
        m9370(charSequence.length(), i, i2);
        byte[] bArr = new byte[i2 - i];
        int i3 = 0;
        while (i < i2) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt <= 255) {
                bArr[i3] = (byte) cCharAt;
                i3++;
            } else {
                bArr[i3] = C8149.f3255;
                i3++;
            }
            i++;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m9369(int i, int i2, int i3) {
        if (i2 < 0 || i2 > i) {
            throw new IndexOutOfBoundsException("destination offset: " + i2 + ", destination size: " + i);
        }
        int i4 = i2 + i3;
        if (i4 < 0 || i4 > i) {
            throw new IndexOutOfBoundsException("The destination array does not have enough capacity, destination offset: " + i2 + ", destination size: " + i + ", capacity needed: " + i3);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m9370(int i, int i2, int i3) {
        AbstractC2986.f4328.m51(i2, i3, i);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final byte[] m9371(@InterfaceC6399 CharSequence charSequence, int i, int i2) {
        byte[] bArrM9368;
        C5499.m17103(charSequence, "source");
        if (charSequence instanceof String) {
            m9370(charSequence.length(), i, i2);
            String strSubstring = ((String) charSequence).substring(i, i2);
            C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = C3794.f6998;
            C5499.m17101(strSubstring, "null cannot be cast to non-null type java.lang.String");
            bArrM9368 = strSubstring.getBytes(charset);
            C5499.m17102(bArrM9368, "this as java.lang.String).getBytes(charset)");
        } else {
            bArrM9368 = m9368(charSequence, i, i2);
        }
        return m9360(this, bArrM9368, 0, 0, 6, null);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final byte[] m9372(@InterfaceC6399 byte[] bArr, int i, int i2) {
        C5499.m17103(bArr, "source");
        m9370(bArr.length, i, i2);
        int iM9376 = m9376(bArr, i, i2);
        byte[] bArr2 = new byte[iM9376];
        if (m9373(bArr, bArr2, 0, i, i2) == iM9376) {
            return bArr2;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥ۟ۢۥۡ.ۥ۟۟():int[] */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cf, code lost:
    
        if (r7 == (-2)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d1, code lost:
    
        r3 = m9387(r19, r5, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d5, code lost:
    
        if (r3 < r23) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d9, code lost:
    
        return r8 - r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00da, code lost:
    
        r1 = r19[r3] & 255;
        r4 = new java.lang.StringBuilder();
        r4.append("Symbol '");
        r4.append((char) r1);
        r4.append("'(");
        r1 = java.lang.Integer.toString(r1, Yue.C3791.m836(8));
        Yue.C5499.m17102(r1, "toString(this, checkRadix(radix))");
        r4.append(r1);
        r4.append(") at index ");
        r4.append(r3 - 1);
        r4.append(" is prohibited after the pad character");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0115, code lost:
    
        throw new java.lang.IllegalArgumentException(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011d, code lost:
    
        throw new java.lang.IllegalArgumentException("The last unit of input does not have enough bits");
     */
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m9373(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        int[] iArr = this.f345 ? C3512.f5926 : C3512.f350;
        int i4 = -8;
        int i5 = i;
        int i6 = -8;
        int i7 = 0;
        int iM9384 = i2;
        while (true) {
            if (iM9384 >= i3) {
                break;
            }
            if (i6 == i4 && iM9384 + 3 < i3) {
                int i8 = iM9384 + 4;
                int i9 = (iArr[bArr[iM9384] & 255] << 18) | (iArr[bArr[iM9384 + 1] & 255] << 12) | (iArr[bArr[iM9384 + 2] & 255] << 6) | iArr[bArr[iM9384 + 3] & 255];
                if (i9 >= 0) {
                    bArr2[i5] = (byte) (i9 >> 16);
                    int i10 = i5 + 2;
                    bArr2[i5 + 1] = (byte) (i9 >> 8);
                    i5 += 3;
                    bArr2[i10] = (byte) i9;
                    iM9384 = i8;
                }
                i4 = -8;
            }
            int i11 = bArr[iM9384] & 255;
            int i12 = iArr[i11];
            if (i12 >= 0) {
                iM9384++;
                i7 = (i7 << 6) | i12;
                int i13 = i6 + 6;
                if (i13 >= 0) {
                    bArr2[i5] = (byte) (i7 >>> i13);
                    i7 &= (1 << i13) - 1;
                    i6 -= 2;
                    i5++;
                } else {
                    i6 = i13;
                }
            } else {
                if (i12 == -2) {
                    iM9384 = m9384(bArr, iM9384, i3, i6);
                    break;
                }
                if (!this.f346) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid symbol '");
                    sb.append((char) i11);
                    sb.append("'(");
                    String string = Integer.toString(i11, C3791.m836(8));
                    C5499.m17102(string, "toString(this, checkRadix(radix))");
                    sb.append(string);
                    sb.append(") at index ");
                    sb.append(iM9384);
                    throw new IllegalArgumentException(sb.toString());
                }
                iM9384++;
            }
            i4 = -8;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final int m9374(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 byte[] bArr, int i, int i2, int i3) {
        byte[] bArrM9368;
        C5499.m17103(charSequence, "source");
        C5499.m17103(bArr, "destination");
        if (charSequence instanceof String) {
            m9370(charSequence.length(), i2, i3);
            String strSubstring = ((String) charSequence).substring(i2, i3);
            C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = C3794.f6998;
            C5499.m17101(strSubstring, "null cannot be cast to non-null type java.lang.String");
            bArrM9368 = strSubstring.getBytes(charset);
            C5499.m17102(bArrM9368, "this as java.lang.String).getBytes(charset)");
        } else {
            bArrM9368 = m9368(charSequence, i2, i3);
        }
        return m9362(this, bArrM9368, bArr, i, 0, 0, 24, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final int m9375(@InterfaceC6399 byte[] bArr, @InterfaceC6399 byte[] bArr2, int i, int i2, int i3) {
        C5499.m17103(bArr, "source");
        C5499.m17103(bArr2, "destination");
        m9370(bArr.length, i2, i3);
        m9369(bArr2.length, i, m9376(bArr, i2, i3));
        return m9373(bArr, bArr2, i, i2, i3);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final int m9376(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        if (i3 == 0) {
            return 0;
        }
        if (i3 == 1) {
            throw new IllegalArgumentException("Input should have at list 2 symbols for Base64 decoding, startIndex: " + i + ", endIndex: " + i2);
        }
        if (this.f346) {
            while (true) {
                if (i >= i2) {
                    break;
                }
                int i4 = C3512.f350[bArr[i] & 255];
                if (i4 < 0) {
                    if (i4 == -2) {
                        i3 -= i2 - i;
                        break;
                    }
                    i3--;
                }
                i++;
            }
        } else if (bArr[i2 - 1] == 61) {
            i3 = bArr[i2 + (-2)] == 61 ? i3 - 2 : i3 - 1;
        }
        return (int) ((((long) i3) * ((long) 6)) / ((long) 8));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final String m9377(@InterfaceC6399 byte[] bArr, int i, int i2) {
        C5499.m17103(bArr, "source");
        return new String(m9383(bArr, i, i2), C3794.f6998);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final int m9378(@InterfaceC6399 byte[] bArr, @InterfaceC6399 byte[] bArr2, int i, int i2, int i3) {
        C5499.m17103(bArr, "source");
        C5499.m17103(bArr2, "destination");
        return m9379(bArr, bArr2, i, i2, i3);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int m9379(@InterfaceC6399 byte[] bArr, @InterfaceC6399 byte[] bArr2, int i, int i2, int i3) {
        int i4 = i2;
        C5499.m17103(bArr, "source");
        C5499.m17103(bArr2, "destination");
        m9370(bArr.length, i4, i3);
        m9369(bArr2.length, i, m9380(i3 - i4));
        byte[] bArr3 = this.f345 ? C3512.f5925 : C3512.f349;
        int i5 = this.f346 ? 19 : Integer.MAX_VALUE;
        int i6 = i;
        while (i4 + 2 < i3) {
            int iMin = Math.min((i3 - i4) / 3, i5);
            for (int i7 = 0; i7 < iMin; i7++) {
                int i8 = bArr[i4] & 255;
                int i9 = i4 + 2;
                int i10 = bArr[i4 + 1] & 255;
                i4 += 3;
                int i11 = (i10 << 8) | (i8 << 16) | (bArr[i9] & 255);
                bArr2[i6] = bArr3[i11 >>> 18];
                bArr2[i6 + 1] = bArr3[(i11 >>> 12) & 63];
                int i12 = i6 + 3;
                bArr2[i6 + 2] = bArr3[(i11 >>> 6) & 63];
                i6 += 4;
                bArr2[i12] = bArr3[i11 & 63];
            }
            if (iMin == i5 && i4 != i3) {
                int i13 = i6 + 1;
                byte[] bArr4 = f5896;
                bArr2[i6] = bArr4[0];
                i6 += 2;
                bArr2[i13] = bArr4[1];
            }
        }
        int i14 = i3 - i4;
        if (i14 == 1) {
            int i15 = (bArr[i4] & 255) << 4;
            bArr2[i6] = bArr3[i15 >>> 6];
            bArr2[i6 + 1] = bArr3[i15 & 63];
            int i16 = i6 + 3;
            bArr2[i6 + 2] = 61;
            i6 += 4;
            bArr2[i16] = 61;
            i4++;
        } else if (i14 == 2) {
            int i17 = i4 + 1;
            int i18 = bArr[i4] & 255;
            i4 += 2;
            int i19 = ((bArr[i17] & 255) << 2) | (i18 << 10);
            bArr2[i6] = bArr3[i19 >>> 12];
            bArr2[i6 + 1] = bArr3[(i19 >>> 6) & 63];
            int i20 = i6 + 3;
            bArr2[i6 + 2] = bArr3[i19 & 63];
            i6 += 4;
            bArr2[i20] = 61;
        }
        if (i4 == i3) {
            return i6 - i;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final int m9380(int i) {
        int i2 = (i + 2) / 3;
        int i3 = (i2 * 4) + ((this.f346 ? (i2 - 1) / 19 : 0) * 2);
        if (i3 >= 0) {
            return i3;
        }
        throw new IllegalArgumentException("Input is too big");
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final <A extends Appendable> A m9381(@InterfaceC6399 byte[] bArr, @InterfaceC6399 A a, int i, int i2) throws IOException {
        C5499.m17103(bArr, "source");
        C5499.m17103(a, "destination");
        a.append(new String(m9383(bArr, i, i2), C3794.f6998));
        return a;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final byte[] m9382(@InterfaceC6399 byte[] bArr, int i, int i2) {
        C5499.m17103(bArr, "source");
        return m9383(bArr, i, i2);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final byte[] m9383(@InterfaceC6399 byte[] bArr, int i, int i2) {
        C5499.m17103(bArr, "source");
        m9370(bArr.length, i, i2);
        byte[] bArr2 = new byte[m9380(i2 - i)];
        m9379(bArr, bArr2, 0, i, i2);
        return bArr2;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final int m9384(byte[] bArr, int i, int i2, int i3) {
        if (i3 == -8) {
            throw new IllegalArgumentException("Redundant pad character at index " + i);
        }
        if (i3 != -6) {
            if (i3 == -4) {
                i = m9387(bArr, i + 1, i2);
                if (i == i2 || bArr[i] != 61) {
                    throw new IllegalArgumentException("Missing one pad character at index " + i);
                }
            } else if (i3 != -2) {
                throw new IllegalStateException("Unreachable".toString());
            }
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final boolean m9385() {
        return this.f346;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final boolean m9386() {
        return this.f345;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final int m9387(byte[] bArr, int i, int i2) {
        if (!this.f346) {
            return i;
        }
        while (i < i2) {
            if (C3512.f350[bArr[i] & 255] != -1) {
                return i;
            }
            i++;
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C3509(boolean z, boolean z2) {
        this.f345 = z;
        this.f346 = z2;
        if (z && z2) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
}
