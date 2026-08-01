package p084fd;

import java.io.File;
import java.io.FilenameFilter;
import java.security.MessageDigest;
import java.util.Map;
import me.yun.fkwechat.core.config.AppConfig;
import p053dd.C1951c;

/* JADX INFO: renamed from: fd.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2426f {
    /* JADX INFO: renamed from: b */
    public static String m8752b(String str) {
        if (str == null) {
            return null;
        }
        if (str.contains("://")) {
            str = str.substring(str.indexOf("://") + 3);
        }
        return str.startsWith("th_") ? str.substring(3) : str;
    }

    /* JADX INFO: renamed from: c */
    public static String m8753c(String str) {
        File[] fileArrListFiles;
        String strM8752b = m8752b(str);
        if (strM8752b == null) {
            return null;
        }
        String strM8761k = m8761k(strM8752b);
        String str2 = m8758h() + "avatar/";
        String strM8762l = m8762l(strM8761k);
        String str3 = str2 + strM8762l + "user_" + strM8761k + ".png";
        if (new File(str3).exists()) {
            return str3;
        }
        String str4 = str2 + strM8762l + "small_" + strM8761k;
        if (new File(str4).exists()) {
            return str4;
        }
        File file = new File(str2 + strM8762l + strM8761k + "/");
        FilenameFilter filenameFilter = new FilenameFilter() { // from class: fd.e
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str5) {
                return str5.startsWith("small_");
            }
        };
        if (!file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles(filenameFilter)) == null || fileArrListFiles.length <= 0) {
            return null;
        }
        return fileArrListFiles[0].getAbsolutePath();
    }

    /* JADX INFO: renamed from: d */
    public static String m8754d(String str) {
        String strM8752b = m8752b(str);
        if (strM8752b == null) {
            return null;
        }
        return m8758h() + "image2/" + m8762l(strM8752b) + strM8752b + ".jpg";
    }

    /* JADX INFO: renamed from: e */
    public static String m8755e(int i10, String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        if (i10 == 3) {
            return m8754d(str);
        }
        if (i10 == 34) {
            return m8760j(str);
        }
        if (i10 != 43) {
            return null;
        }
        return m8759i(str);
    }

    /* JADX INFO: renamed from: f */
    public static String m8756f(C1951c c1951c) {
        if (c1951c == null) {
            return null;
        }
        if (c1951c.isVideo()) {
            return m8759i(c1951c.imgPath);
        }
        if (c1951c.isVoice()) {
            return m8760j(c1951c.imgPath);
        }
        if (c1951c.isImage()) {
            return m8754d(c1951c.imgPath);
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static String m8757g() {
        Map mapM8719c = AbstractC2422b.m8719c();
        if (mapM8719c != null) {
            return (String) mapM8719c.get("last_login_uin");
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static String m8758h() {
        String strM8757g = m8757g();
        if (strM8757g == null) {
            return null;
        }
        return AppConfig.hostDataPath + "/MicroMsg/" + m8761k("mm".concat(strM8757g)) + "/";
    }

    /* JADX INFO: renamed from: i */
    public static String m8759i(String str) {
        String strM8752b = m8752b(str);
        if (strM8752b == null) {
            return null;
        }
        if (!strM8752b.endsWith(".mp4")) {
            strM8752b = strM8752b.concat(".mp4");
        }
        return m8758h() + "video/" + strM8752b;
    }

    /* JADX INFO: renamed from: j */
    public static String m8760j(String str) {
        String strM8752b = m8752b(str);
        if (strM8752b == null) {
            return null;
        }
        return m8758h() + "voice2/" + m8762l(strM8752b) + "msg_" + strM8752b + ".amr";
    }

    /* JADX INFO: renamed from: k */
    public static String m8761k(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : bArrDigest) {
                String hexString = Integer.toHexString(b10 & 255);
                if (hexString.length() == 1) {
                    sb2.append('0');
                }
                sb2.append(hexString);
            }
            return sb2.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m8762l(String str) {
        if (str.length() < 4) {
            return null;
        }
        return str.substring(0, 2) + "/" + str.substring(2, 4) + "/";
    }
}
