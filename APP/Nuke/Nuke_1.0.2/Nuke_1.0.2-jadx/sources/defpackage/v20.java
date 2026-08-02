package defpackage;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class v20 {
    public static final Set c = mg.u0(new Integer[]{16, 24, 32});
    public final bf2 a;
    public final SecureRandom b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public v20(bf2 bf2Var) {
        SecureRandom secureRandom = new SecureRandom();
        bf2Var.getClass();
        this.a = bf2Var;
        this.b = secureRandom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String b(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        switch (upperCase.hashCode()) {
            case -1523887726:
                if (upperCase.equals("SHA-256")) {
                    return "SHA-256";
                }
                break;
            case -1523886674:
                if (upperCase.equals("SHA-384")) {
                    return "SHA-384";
                }
                break;
            case -1523884971:
                if (upperCase.equals("SHA-512")) {
                    return "SHA-512";
                }
                break;
            case 76158:
                if (upperCase.equals("MD5")) {
                    return "MD5";
                }
                break;
            case 78861104:
                if (upperCase.equals("SHA-1")) {
                    return "SHA-1";
                }
                break;
        }
        c80.p("INVALID_ARGUMENT", "Unsupported digest algorithm.", 0, null, null, 28);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String e(String str) {
        String strB = b(str);
        switch (strB.hashCode()) {
            case -1523887726:
                if (strB.equals("SHA-256")) {
                    return "HmacSHA256";
                }
                break;
            case -1523886674:
                if (strB.equals("SHA-384")) {
                    return "HmacSHA384";
                }
                break;
            case -1523884971:
                if (strB.equals("SHA-512")) {
                    return "HmacSHA512";
                }
                break;
            case 76158:
                if (strB.equals("MD5")) {
                    return "HmacMD5";
                }
                break;
            case 78861104:
                if (strB.equals("SHA-1")) {
                    return "HmacSHA1";
                }
                break;
        }
        s.l("Unreachable digest algorithm.");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String i(String str) {
        Locale locale = Locale.ROOT;
        String upperCase = str.toUpperCase(locale);
        upperCase.getClass();
        int iHashCode = upperCase.hashCode();
        if (iHashCode == -1523887726 ? !upperCase.equals("SHA-256") : iHashCode == -1523886674 ? !upperCase.equals("SHA-384") : !(iHashCode == -1523884971 && upperCase.equals("SHA-512"))) {
            c80.p("INVALID_ARGUMENT", "Unsupported KDF hash algorithm.", 0, null, null, 28);
            return null;
        }
        String upperCase2 = str.toUpperCase(locale);
        upperCase2.getClass();
        return upperCase2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final byte[] a(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (!c.contains(Integer.valueOf(bArr.length))) {
            c80.p("INVALID_ARGUMENT", "AES key must be 16, 24, or 32 bytes.", 0, null, null, 28);
            return null;
        }
        if (bArr2.length != 12) {
            c80.p("INVALID_ARGUMENT", "AES-GCM IV must be 12 bytes.", 0, null, null, 28);
            return null;
        }
        h(((long) bArr.length) + ((long) bArr2.length) + ((long) bArr3.length) + ((long) (bArr4 != null ? bArr4.length : 0)));
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(i, new SecretKeySpec(bArr, "AES"), new GCMParameterSpec(128, bArr2));
        if (bArr4 != null) {
            cipher.updateAAD(bArr4);
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr3);
        bArrDoFinal.getClass();
        return bArrDoFinal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, String str) throws NoSuchAlgorithmException, InvalidKeyException {
        byte[] bArr4 = bArr2;
        if (1 <= i) {
            this.a.getClass();
            if (i <= 16777216) {
                h(((long) bArr.length) + ((long) (bArr4 != null ? bArr4.length : 0)) + ((long) (bArr3 != null ? bArr3.length : 0)));
                String strE = e(i(str));
                Mac mac = Mac.getInstance(strE);
                if (bArr4 == null) {
                    bArr4 = new byte[mac.getMacLength()];
                }
                mac.init(new SecretKeySpec(bArr4, strE));
                byte[] bArrDoFinal = mac.doFinal(bArr);
                if (i > bArrDoFinal.length * 255) {
                    c80.p("INVALID_ARGUMENT", "HKDF output is too long.", 0, null, null, 28);
                    return null;
                }
                Mac mac2 = Mac.getInstance(strE);
                mac2.init(new SecretKeySpec(bArrDoFinal, strE));
                byte[] bArr5 = new byte[i];
                byte[] bArr6 = new byte[0];
                int i2 = 1;
                int i3 = 0;
                while (i3 < i) {
                    mac2.reset();
                    mac2.update(bArr6);
                    if (bArr3 != null) {
                        mac2.update(bArr3);
                    }
                    mac2.update((byte) i2);
                    byte[] bArrDoFinal2 = mac2.doFinal();
                    bArrDoFinal2.getClass();
                    int iMin = Math.min(bArrDoFinal2.length, i - i3);
                    mg.d0(bArrDoFinal2, bArr5, i3, 0, iMin, 4);
                    i3 += iMin;
                    i2++;
                    bArr6 = bArrDoFinal2;
                }
                return bArr5;
            }
        }
        c80.p("INVALID_ARGUMENT", "Derived output length is invalid.", 0, null, null, 28);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final byte[] d(String str, byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException, InvalidKeyException {
        if (bArr.length == 0) {
            c80.p("INVALID_ARGUMENT", "HMAC key must not be empty.", 0, null, null, 28);
            return null;
        }
        h(((long) bArr.length) + ((long) bArr2.length));
        String strE = e(str);
        Mac mac = Mac.getInstance(strE);
        mac.init(new SecretKeySpec(bArr, strE));
        byte[] bArrDoFinal = mac.doFinal(bArr2);
        bArrDoFinal.getClass();
        return bArrDoFinal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final byte[] f(byte[] bArr, byte[] bArr2, int i, int i2, String str) throws NoSuchAlgorithmException, InvalidKeyException {
        if (1 > i || i >= 10000001) {
            c80.p("INVALID_ARGUMENT", "PBKDF2 iterations must be between 1 and 10000000.", 0, null, null, 28);
            return null;
        }
        if (1 <= i2) {
            this.a.getClass();
            if (i2 <= 16777216) {
                h(((long) bArr.length) + ((long) bArr2.length));
                String strE = e(i(str));
                Mac mac = Mac.getInstance(strE);
                mac.init(new SecretKeySpec(bArr, strE));
                int macLength = mac.getMacLength();
                int iCeil = (int) Math.ceil(((double) i2) / ((double) macLength));
                byte[] bArr3 = new byte[macLength * iCeil];
                if (1 <= iCeil) {
                    int i3 = 0;
                    int length = 0;
                    int i4 = 1;
                    while (true) {
                        mac.reset();
                        mac.update(bArr2);
                        byte[] bArr4 = new byte[4];
                        bArr4[i3] = (byte) (i4 >>> 24);
                        bArr4[1] = (byte) (i4 >>> 16);
                        bArr4[2] = (byte) (i4 >>> 8);
                        bArr4[3] = (byte) i4;
                        byte[] bArrDoFinal = mac.doFinal(bArr4);
                        bArrDoFinal.getClass();
                        byte[] bArrCopyOf = Arrays.copyOf(bArrDoFinal, bArrDoFinal.length);
                        int i5 = i - 1;
                        int i6 = i3;
                        while (i6 < i5) {
                            bArrDoFinal = mac.doFinal(bArrDoFinal);
                            int length2 = bArrCopyOf.length;
                            for (int i7 = i3; i7 < length2; i7++) {
                                bArrCopyOf[i7] = (byte) (bArrCopyOf[i7] ^ bArrDoFinal[i7]);
                            }
                            i6++;
                            i3 = 0;
                        }
                        mg.d0(bArrCopyOf, bArr3, length, 0, 0, 12);
                        length += bArrCopyOf.length;
                        if (i4 == iCeil) {
                            break;
                        }
                        i4++;
                        i3 = 0;
                    }
                }
                return Arrays.copyOf(bArr3, i2);
            }
        }
        c80.p("INVALID_ARGUMENT", "Derived output length is invalid.", 0, null, null, 28);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final byte[] g(int i) {
        bf2 bf2Var = this.a;
        if (i >= 0) {
            bf2Var.getClass();
            if (i <= 1048576) {
                byte[] bArr = new byte[i];
                this.b.nextBytes(bArr);
                return bArr;
            }
        }
        bf2Var.getClass();
        c80.p("INVALID_ARGUMENT", "Random byte length must be between 0 and 1048576.", 0, null, null, 28);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(long j) {
        this.a.getClass();
        if (j <= 16777216) {
            return;
        }
        c80.p("QUOTA_EXCEEDED", "Crypto input exceeds 16777216 bytes.", 0, null, null, 28);
    }
}
