package Yue;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥۣۡۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6589 {

    /* JADX INFO: renamed from: Yue.ۥۣۡۥۡ$ۥ */
    @InterfaceC7113(28)
    public static class C1018 {
        @InterfaceC4482
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ */
        public static Signature[] m3047(@InterfaceC6391 SigningInfo signingInfo) {
            return signingInfo.getApkContentsSigners();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static long m3048(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }

        @InterfaceC4482
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static Signature[] m20917(@InterfaceC6391 SigningInfo signingInfo) {
            return signingInfo.getSigningCertificateHistory();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static boolean m20918(@InterfaceC6391 SigningInfo signingInfo) {
            return signingInfo.hasMultipleSigners();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static boolean m20919(@InterfaceC6391 PackageManager packageManager, @InterfaceC6391 String str, @InterfaceC6391 byte[] bArr, int i) {
            return packageManager.hasSigningCertificate(str, bArr, i);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static boolean m3045(@InterfaceC6391 byte[][] bArr, @InterfaceC6391 byte[] bArr2) {
        for (byte[] bArr3 : bArr) {
            if (Arrays.equals(bArr2, bArr3)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static byte[] m3046(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA256").digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Device doesn't support SHA256 cert checking", e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static long m20914(@InterfaceC6391 PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? C1018.m3048(packageInfo) : packageInfo.versionCode;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static List<Signature> m20915(@InterfaceC6391 PackageManager packageManager, @InterfaceC6391 String str) throws PackageManager.NameNotFoundException {
        Signature[] signatureArrM3047;
        if (Build.VERSION.SDK_INT >= 28) {
            SigningInfo signingInfo = packageManager.getPackageInfo(str, 134217728).signingInfo;
            signatureArrM3047 = C1018.m20918(signingInfo) ? C1018.m3047(signingInfo) : C1018.m20917(signingInfo);
        } else {
            signatureArrM3047 = packageManager.getPackageInfo(str, 64).signatures;
        }
        return signatureArrM3047 == null ? Collections.emptyList() : Arrays.asList(signatureArrM3047);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static boolean m20916(@InterfaceC6391 PackageManager packageManager, @InterfaceC6391 String str, @InterfaceC6391 @InterfaceC7473(min = 1) Map<byte[], Integer> map, boolean z) throws PackageManager.NameNotFoundException {
        byte[][] bArr;
        if (map.isEmpty()) {
            return false;
        }
        Set<byte[]> setKeySet = map.keySet();
        for (byte[] bArr2 : setKeySet) {
            if (bArr2 == null) {
                throw new IllegalArgumentException("Cert byte array cannot be null when verifying " + str);
            }
            Integer num = map.get(bArr2);
            if (num == null) {
                throw new IllegalArgumentException("Type must be specified for cert when verifying " + str);
            }
            int iIntValue = num.intValue();
            if (iIntValue != 0 && iIntValue != 1) {
                throw new IllegalArgumentException("Unsupported certificate type " + num + " when verifying " + str);
            }
        }
        List<Signature> listM20915 = m20915(packageManager, str);
        if (!z && Build.VERSION.SDK_INT >= 28) {
            for (byte[] bArr3 : setKeySet) {
                if (!C1018.m20919(packageManager, str, bArr3, map.get(bArr3).intValue())) {
                    return false;
                }
            }
            return true;
        }
        if (listM20915.size() != 0 && map.size() <= listM20915.size() && (!z || map.size() == listM20915.size())) {
            if (map.containsValue(1)) {
                bArr = new byte[listM20915.size()][];
                for (int i = 0; i < listM20915.size(); i++) {
                    bArr[i] = m3046(listM20915.get(i).toByteArray());
                }
            } else {
                bArr = null;
            }
            Iterator<byte[]> it = setKeySet.iterator();
            if (it.hasNext()) {
                byte[] next = it.next();
                Integer num2 = map.get(next);
                int iIntValue2 = num2.intValue();
                if (iIntValue2 != 0) {
                    if (iIntValue2 != 1) {
                        throw new IllegalArgumentException("Unsupported certificate type " + num2);
                    }
                    if (!m3045(bArr, next)) {
                        return false;
                    }
                } else if (!listM20915.contains(new Signature(next))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
