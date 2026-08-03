package com.tendcloud.tenddata;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: com.tendcloud.tenddata.u */
/* JADX INFO: loaded from: classes.dex */
public class C0127u {

    /* JADX INFO: renamed from: a */
    private static final String f616a = "RC4/ECB/NoPadding";

    /* JADX INFO: renamed from: b */
    private static final String f617b = "ARCFOUR";

    /* JADX INFO: renamed from: c */
    private static final String f618c = "r5czusfu0wjcaz4pp01v2k7qte55xc25fngq4ylby2civ230vdy6uy6goz9w4kgfqjk31l8khfzfvbxj7emcprjyy8nngf0r9dvxzwbhm2uw7ljre52jt95lg0knyp8e5c4go44s3z5ciy58h0tuosmwhupa62rdnkeicgdba6w6f0kenp0xac7so8j1vdbjpqwyprx2ouenv22isustwnpltt9ui5plnijd4bq4013o3mzdkllozn26zwds9x38";

    /* JADX INFO: renamed from: d */
    private static final byte[] f619d = f618c.getBytes();

    /* JADX INFO: renamed from: a */
    public static byte[] m734a(byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance(f616a);
        cipher.init(1, new SecretKeySpec(f619d, f617b));
        return cipher.doFinal(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m735a(byte[] bArr, String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance(f616a);
        cipher.init(1, new SecretKeySpec(str.getBytes(), f617b));
        return cipher.doFinal(bArr);
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m736b(byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance(f616a);
        cipher.init(2, new SecretKeySpec(f619d, f617b));
        return cipher.doFinal(bArr);
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m737b(byte[] bArr, String str) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Cipher cipher = Cipher.getInstance(f616a);
        cipher.init(2, new SecretKeySpec(str.getBytes(), f617b));
        return cipher.doFinal(bArr);
    }
}
