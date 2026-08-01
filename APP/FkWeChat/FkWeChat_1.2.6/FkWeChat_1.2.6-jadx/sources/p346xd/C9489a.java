package p346xd;

import android.util.Base64;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.internal.url._UrlKt;
import p299ub.AbstractC8621f0;
import p299ub.C8614c;
import p315vd.AbstractC8924d;

/* JADX INFO: renamed from: xd.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9489a {

    /* JADX INFO: renamed from: a */
    public static final C9489a f32220a = new C9489a();

    /* JADX INFO: renamed from: b */
    public static final String m36979b(String str) {
        str.getClass();
        String string = AbstractC8621f0.m33161r1(str).toString();
        if (string.length() == 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        C9489a c9489a = f32220a;
        c9489a.m36981a(7);
        try {
            byte[] bArrDecode = Base64.decode(string, 0);
            byte[] bArrM36982d = c9489a.m36982d();
            byte[] bArr = new byte[bArrDecode.length];
            int length = bArrDecode.length;
            for (int i10 = 0; i10 < length; i10++) {
                byte b10 = bArrDecode[i10];
                byte b11 = bArrM36982d[i10 % bArrM36982d.length];
                bArr[i10] = (byte) ((b10 | b11) - (b10 & b11));
            }
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            return new String(bArr, charset);
        } catch (Exception unused) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final String m36980c(String str, String str2) {
        str.getClass();
        str2.getClass();
        try {
            List listM33112S0 = AbstractC8621f0.m33112S0(str, new String[]{":"}, false, 0, 6, null);
            if (listM33112S0.size() != 3) {
                AbstractC8924d.m34263c("CipherUtils", "Invalid GCM ciphertext format");
                return _UrlKt.FRAGMENT_ENCODE_SET;
            }
            byte[] bArrDecode = Base64.decode((String) listM33112S0.get(0), 2);
            byte[] bArrDecode2 = Base64.decode((String) listM33112S0.get(1), 2);
            byte[] bArrDecode3 = Base64.decode((String) listM33112S0.get(2), 2);
            byte[] bArr = new byte[bArrDecode3.length + bArrDecode2.length];
            System.arraycopy(bArrDecode3, 0, bArr, 0, bArrDecode3.length);
            System.arraycopy(bArrDecode2, 0, bArr, bArrDecode3.length, bArrDecode2.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(Base64.decode(str2, 2), "AES");
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArrDecode);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKeySpec, gCMParameterSpec);
            byte[] bArrDoFinal = cipher.doFinal(bArr);
            bArrDoFinal.getClass();
            return new String(bArrDoFinal, C8614c.f28652b);
        } catch (Exception e10) {
            AbstractC8924d.m34264d("CipherUtils", "Failed to decrypt GCM ciphertext", e10);
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m36981a(int i10) {
        try {
            if (i10 % 2 == 0) {
                return m36981a(i10 - 1) + 1;
            }
            throw new RuntimeException("com.tencent.mm.setting.key.2026.auth");
        } catch (Exception unused) {
            return (i10 * 3) >>> 1;
        }
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m36982d() {
        byte[] bArr = new byte[12];
        int i10 = 1;
        while (i10 != 0) {
            int i11 = ((i10 * 31) + 17) >>> 2;
            switch (i10) {
                case 1:
                    bArr[0] = (byte) ((i10 << 6) + 6);
                    i10 = 5;
                    break;
                case 2:
                    bArr[4] = (byte) ((i10 << 5) + 3);
                    i10 = 9;
                    break;
                case 3:
                    bArr[11] = (byte) ((i10 << 4) + 4);
                    i10 = 8;
                    break;
                case 4:
                case 6:
                case 10:
                default:
                    i10 = (i11 ^ 255) & 15;
                    break;
                case 5:
                    bArr[3] = (byte) ((i10 << 4) + 21);
                    i10 = 12;
                    break;
                case 7:
                    bArr[5] = (byte) ((i10 << 4) - 8);
                    i10 = 11;
                    break;
                case 8:
                    bArr[1] = (byte) ((i10 << 3) + 43);
                    i10 = 15;
                    break;
                case 9:
                    bArr[10] = (byte) ((i10 << 2) + 14);
                    i10 = 14;
                    break;
                case Opcodes.FCONST_0 /* 11 */:
                    bArr[8] = (byte) ((i10 << 2) + 6);
                    i10 = 13;
                    break;
                case Opcodes.FCONST_1 /* 12 */:
                    bArr[7] = (byte) ((i10 << 3) + 20);
                    i10 = 3;
                    break;
                case Opcodes.FCONST_2 /* 13 */:
                    bArr[9] = (byte) ((i10 << 2) - 4);
                    i10 = 0;
                    break;
                case Opcodes.DCONST_0 /* 14 */:
                    bArr[2] = (byte) ((i10 << 2) + 31);
                    i10 = 7;
                    break;
                case 15:
                    bArr[6] = (byte) ((i10 << 2) + 37);
                    i10 = 2;
                    break;
            }
        }
        return bArr;
    }
}
