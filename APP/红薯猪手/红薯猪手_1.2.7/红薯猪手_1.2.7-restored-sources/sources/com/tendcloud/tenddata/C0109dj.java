package com.tendcloud.tenddata;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* JADX INFO: renamed from: com.tendcloud.tenddata.dj */
/* JADX INFO: loaded from: classes.dex */
class C0109dj {

    /* JADX INFO: renamed from: com.tendcloud.tenddata.dj$a */
    public static class a {
        public static String encode(byte[] bArr) {
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            StringBuilder sb = new StringBuilder(bArr.length * 2);
            for (int i = 0; i < bArr.length; i++) {
                sb.append(cArr[(bArr[i] & 240) >> 4]);
                sb.append(cArr[bArr[i] & 15]);
            }
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m500a(Context context) {
        String packageName = context.getPackageName();
        return m501a(context, packageName) + packageName;
    }

    /* JADX INFO: renamed from: a */
    public static String m501a(Context context, String str) {
        String strM502a;
        try {
            strM502a = m502a((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(context.getPackageManager().getPackageInfo(str, 64).signatures[0].toByteArray())));
        } catch (PackageManager.NameNotFoundException | CertificateException unused) {
            strM502a = "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < strM502a.length(); i++) {
            stringBuffer.append(strM502a.charAt(i));
            if (i > 0 && i % 2 == 1 && i < strM502a.length() - 1) {
                stringBuffer.append(":");
            }
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    public static String m502a(X509Certificate x509Certificate) {
        try {
            return a.encode(m503a(x509Certificate.getEncoded()));
        } catch (CertificateEncodingException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m503a(byte[] bArr) {
        byte[] bArr2 = new byte[0];
        try {
            return MessageDigest.getInstance("SHA1").digest(bArr);
        } catch (NoSuchAlgorithmException unused) {
            return bArr2;
        }
    }
}
