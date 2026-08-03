package com.tendcloud.tenddata;

import com.tendcloud.tenddata.C0121n;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;

/* JADX INFO: renamed from: com.tendcloud.tenddata.au */
/* JADX INFO: loaded from: classes.dex */
final class C0039au {

    /* JADX INFO: renamed from: a */
    private static final int f210a = 128;

    /* JADX INFO: renamed from: b */
    private static final int f211b = 10000;

    /* JADX INFO: renamed from: c */
    private static final String f212c = "iv";

    /* JADX INFO: renamed from: d */
    private static final String f213d = "salt";

    /* JADX INFO: renamed from: e */
    private static final int f214e = 16;

    /* JADX INFO: renamed from: f */
    private static final int f215f = 32;

    /* JADX INFO: renamed from: g */
    private static final String f216g = "AES/CBC/PKCS5Padding";

    /* JADX INFO: renamed from: h */
    private static final String f217h = "PBKDF2WithHmacSHA1";

    /* JADX INFO: renamed from: i */
    private static final String f218i = "AES";

    /* JADX INFO: renamed from: a */
    public static SecretKey m222a(char[] cArr, byte[] bArr) {
        return SecretKeyFactory.getInstance(f217h).generateSecret(new PBEKeySpec(cArr, bArr, f211b, f210a));
    }

    /* JADX INFO: renamed from: a */
    public static IvParameterSpec m223a() {
        try {
            C0121n.b bVar = C0121n.b.AES_IV_LOCK;
            C0121n.getFileLock(bVar.toString());
            byte[] bArrM233a = C0040av.m233a(f212c, 16);
            if (bArrM233a == null) {
                bArrM233a = m224a(16);
                C0040av.m231a(f212c, bArrM233a);
            }
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrM233a);
            C0121n.releaseFileLock(bVar.toString());
            return ivParameterSpec;
        } catch (Throwable unused) {
            C0121n.releaseFileLock(C0121n.b.AES_IV_LOCK.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m224a(int i) {
        byte[] bArr = new byte[i];
        C0131y.m762b().nextBytes(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m225a(byte[] bArr, SecretKey secretKey, IvParameterSpec ivParameterSpec) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance(C0131y.m764b(19) ? f218i : f216g);
        cipher.init(1, secretKey, ivParameterSpec);
        return cipher.doFinal(bArr);
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m226b() {
        String string;
        byte[] bArrM233a = null;
        try {
            C0121n.b bVar = C0121n.b.AES_SALT_LOCK;
            C0121n.getFileLock(bVar.toString());
            bArrM233a = C0040av.m233a(f213d, f215f);
            if (bArrM233a == null || bArrM233a.length == 0) {
                bArrM233a = m224a(f215f);
                C0040av.m231a(f213d, bArrM233a);
            }
            string = bVar.toString();
        } catch (Throwable unused) {
            string = C0121n.b.AES_SALT_LOCK.toString();
        }
        C0121n.releaseFileLock(string);
        return bArrM233a;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m227b(byte[] bArr, SecretKey secretKey, IvParameterSpec ivParameterSpec) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance(C0131y.m764b(19) ? f218i : f216g);
        cipher.init(2, secretKey, ivParameterSpec);
        return cipher.doFinal(bArr);
    }
}
