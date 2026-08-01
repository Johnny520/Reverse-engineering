package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.view.View;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: renamed from: y4 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0545y4 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f1088a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static volatile long f1089b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m1160a(Context context, File file, String str) {
        PackageManager packageManager;
        PackageInfo packageArchiveInfo;
        ApplicationInfo applicationInfo;
        String strConcat;
        String strM1083b = str == null ? "app.apk" : AbstractC0497v4.m1083b(str);
        if (strM1083b.toLowerCase(Locale.ROOT).endsWith(".apk.1")) {
            strM1083b = strM1083b.substring(0, strM1083b.length() - 2);
        }
        String strM1167h = m1167h(strM1083b);
        if (HookEntry.runtimeBool(Prefs.KEY_RENAME_APK_FILE) && context != null) {
            try {
                if (file.isFile() && ((AbstractC0497v4.m1077D(file.getName()) || AbstractC0497v4.m1077D(str)) && (packageManager = context.getPackageManager()) != null && (packageArchiveInfo = packageManager.getPackageArchiveInfo(file.getAbsolutePath(), 0)) != null && (applicationInfo = packageArchiveInfo.applicationInfo) != null)) {
                    applicationInfo.sourceDir = file.getAbsolutePath();
                    applicationInfo.publicSourceDir = file.getAbsolutePath();
                    CharSequence applicationLabel = packageManager.getApplicationLabel(applicationInfo);
                    String strTrim = "";
                    String strTrim2 = applicationLabel == null ? "" : applicationLabel.toString().trim();
                    if (strTrim2.length() == 0) {
                        String str2 = packageArchiveInfo.packageName;
                        strTrim2 = str2 == null ? "" : str2.trim();
                    }
                    if (strTrim2.length() != 0) {
                        String str3 = packageArchiveInfo.versionName;
                        if (str3 != null) {
                            strTrim = str3.trim();
                        }
                        if (strTrim.length() > 0) {
                            strConcat = strTrim2 + "-" + strTrim + ".apk";
                        } else {
                            strConcat = strTrim2.concat(".apk");
                        }
                        String strM1167h2 = m1167h(strConcat);
                        HookEntry.log("filename apk metadata name=" + m1166g(strM1167h) + " fixed=" + m1166g(strM1167h2) + " package=" + m1166g(packageArchiveInfo.packageName) + " version=" + m1166g(strTrim));
                        return strM1167h2;
                    }
                }
            } catch (Throwable th) {
                AbstractC0000a.m3d(th, new StringBuilder("filename apk metadata failed reason="), ": ");
            }
        }
        return strM1167h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static File m1161b(String str) {
        try {
            if (str.length() != 0 && !str.regionMatches(true, 0, "content://", 0, 10)) {
                String strSubstring = str.startsWith("file://") ? str.substring(7) : str;
                if (strSubstring.indexOf(47) < 0 && strSubstring.indexOf(92) < 0) {
                    return null;
                }
                File file = new File(strSubstring);
                if (file.isFile()) {
                    return file;
                }
                return null;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m1162c(String str) {
        if (str.contains("path") || str.contains("url") || str.contains("uri") || str.contains("md5") || str.contains("sha") || str.contains("uin") || str.contains("uid")) {
            return false;
        }
        return str.contains("filename") || str.contains("file_name") || str.equals("name") || str.endsWith("name") || str.contains("display") || str.contains("title");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m1163d(String str) {
        return str.contains("path") || str.contains("local") || str.equals("file") || str.endsWith("file") || str.contains("uri");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static boolean m1164e(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        String lowerCase = str.replace('\\', '/').toLowerCase(Locale.ROOT);
        if (!lowerCase.contains("/mobileqq/photo/") && !lowerCase.contains("/nt_data/pic/") && !lowerCase.contains("/richmedia/") && !lowerCase.contains("/shortvideo/") && !lowerCase.contains("/qq_images/") && !lowerCase.contains("/image/") && !lowerCase.contains("/thumb/") && !lowerCase.contains("/video/") && !lowerCase.contains("/ptt/") && !lowerCase.contains("/voice/")) {
            String strM1083b = AbstractC0497v4.m1083b(lowerCase);
            if (!strM1083b.endsWith(".jpg") && !strM1083b.endsWith(".jpeg") && !strM1083b.endsWith(".png") && !strM1083b.endsWith(".gif") && !strM1083b.endsWith(".webp") && !strM1083b.endsWith(".heic") && !strM1083b.endsWith(".mp4") && !strM1083b.endsWith(".mov") && !strM1083b.endsWith(".m4a") && !strM1083b.endsWith(".amr") && !strM1083b.endsWith(".silk")) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static File m1165f(File file, String str, long j) {
        if (AbstractC0497v4.m1077D(str)) {
            return new File(file, str);
        }
        File file2 = new File(file, str);
        if (!file2.exists() || file2.length() == j) {
            return file2;
        }
        int iLastIndexOf = str.lastIndexOf(46);
        String strSubstring = iLastIndexOf > 0 ? str.substring(0, iLastIndexOf) : str;
        String strSubstring2 = iLastIndexOf > 0 ? str.substring(iLastIndexOf) : "";
        for (int i = 2; i <= 99; i++) {
            File file3 = new File(file, strSubstring + "_" + i + strSubstring2);
            if (!file3.exists() || file3.length() == j) {
                return file3;
            }
        }
        return new File(file, strSubstring + "_" + System.currentTimeMillis() + strSubstring2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static String m1166g(String str) {
        String strReplace = str == null ? "" : str.replace('\r', ' ').replace('\n', ' ').replace('\t', ' ');
        return strReplace.length() > 220 ? strReplace.substring(0, 220).concat("...") : strReplace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m1167h(String str) {
        String strSubstring = "";
        String strTrim = (str == null ? "" : AbstractC0497v4.m1083b(str)).replace('\r', ' ').replace('\n', ' ').replace('\t', ' ').trim();
        if (strTrim == null) {
            strTrim = "";
        } else if (strTrim.toLowerCase(Locale.ROOT).endsWith(".apk.1")) {
            strTrim = strTrim.substring(0, strTrim.length() - 2);
        }
        String strTrim2 = strTrim.replaceAll("[\\\\/:*?\"<>|\\p{Cntrl}]+", "_").trim();
        while (strTrim2.endsWith(".")) {
            strTrim2 = strTrim2.substring(0, strTrim2.length() - 1).trim();
        }
        if (strTrim2.length() == 0) {
            strTrim2 = "unnamed_file";
        }
        if (strTrim2.length() <= 120) {
            return strTrim2;
        }
        int iLastIndexOf = strTrim2.lastIndexOf(46);
        if (iLastIndexOf > 0 && strTrim2.length() - iLastIndexOf <= 24) {
            strSubstring = strTrim2.substring(iLastIndexOf);
        }
        if (strSubstring.length() > 0) {
            strTrim2 = strTrim2.substring(0, iLastIndexOf);
        }
        int iMax = Math.max(1, 120 - strSubstring.length());
        if (strTrim2.length() > iMax) {
            strTrim2 = strTrim2.substring(0, iMax);
        }
        return strTrim2.concat(strSubstring);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't wrap try/catch for region: R(13:213|(2:468|217)|(7:472|218|466|219|220|462|221)|(7:222|(3:224|474|225)(1:541)|446|(2:478|239)|(2:482|241)|242|(1:193)(2:495|245))|226|227|(1:229)(1:230)|454|231|458|232|233|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02f6 A[PHI: r18
  0x02f6: PHI (r18v6 java.lang.String) = (r18v4 java.lang.String), (r18v9 java.lang.String), (r18v17 java.lang.String) binds: [B:248:0x03d9, B:243:0x03cc, B:192:0x02f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0552 A[Catch: all -> 0x05ce, TryCatch #17 {all -> 0x05ce, blocks: (B:329:0x04fc, B:349:0x054c, B:351:0x0552, B:353:0x0568, B:354:0x056b, B:333:0x050b, B:336:0x0513, B:340:0x0520, B:342:0x0526, B:343:0x052b, B:345:0x0539, B:346:0x0540, B:357:0x0575, B:359:0x0579, B:361:0x057f, B:363:0x0585, B:365:0x058d, B:367:0x0593, B:369:0x059b, B:371:0x05a3, B:375:0x05b1), top: B:486:0x04fc }] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x026e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:495:0x03d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:529:0x05e0 A[SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m1168i(Object obj, int i, HashSet hashSet) {
        boolean z;
        int i2;
        String str;
        String name;
        File fileM1165f;
        Class<?> superclass;
        int i3;
        int i4;
        Class<?> cls;
        Field[] declaredFields;
        String str2;
        int i5;
        String str3;
        File file;
        String str4;
        int i6;
        String lowerCase;
        boolean zEquals;
        char c;
        String strSubstring;
        String str5;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        boolean z2;
        byte[] bArr;
        Field[] declaredFields2;
        Field[] declaredFields3;
        if (obj == null || i > 3 || hashSet.contains(obj) || (obj instanceof String) || (obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof Context) || (obj instanceof View)) {
            return 0;
        }
        hashSet.add(obj);
        String name2 = obj.getClass().getName();
        if (!name2.startsWith("com.tencent.") && !name2.startsWith("java.util.")) {
            return 0;
        }
        Class<?> superclass2 = obj.getClass();
        String str6 = "";
        String absolutePath = "";
        String strM1083b = absolutePath;
        File file2 = null;
        while (true) {
            boolean z3 = true;
            if (superclass2 == null || superclass2 == Object.class) {
                break;
            }
            try {
                declaredFields3 = superclass2.getDeclaredFields();
            } catch (Throwable unused) {
                declaredFields3 = null;
            }
            if (declaredFields3 != null) {
                int length = declaredFields3.length;
                int i7 = 0;
                while (i7 < length) {
                    Field field = declaredFields3[i7];
                    try {
                        if (!Modifier.isStatic(field.getModifiers())) {
                            field.setAccessible(z3);
                            Object obj2 = field.get(obj);
                            String name3 = field.getName();
                            String lowerCase2 = name3 == null ? "" : name3.toLowerCase(Locale.ROOT);
                            if (obj2 instanceof String) {
                                String str7 = (String) obj2;
                                if (str7.length() != 0) {
                                    File fileM1161b = m1161b(str7);
                                    if (fileM1161b != null && file2 == null) {
                                        file2 = fileM1161b;
                                    }
                                    if (absolutePath.length() == 0 && m1163d(lowerCase2)) {
                                        absolutePath = str7;
                                    }
                                    if (strM1083b.length() == 0 && m1162c(lowerCase2)) {
                                        strM1083b = AbstractC0497v4.m1083b(str7);
                                    }
                                    if (absolutePath.length() == 0 && fileM1161b != null) {
                                        absolutePath = str7;
                                    }
                                }
                            } else if (obj2 instanceof File) {
                                File file3 = (File) obj2;
                                if (file3.isFile() && file2 == null) {
                                    file2 = file3;
                                }
                                if (absolutePath.length() == 0 && m1163d(lowerCase2)) {
                                    absolutePath = file3.getAbsolutePath();
                                }
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                    i7++;
                    z3 = true;
                }
            }
            superclass2 = superclass2.getSuperclass();
        }
        if (file2 != null || absolutePath.length() > 0 || (strM1083b.length() > 0 && (!m1167h(strM1083b).equals(strM1083b) || AbstractC0525x0.m1127a(strM1083b)))) {
            String strM1083b2 = strM1083b.length() > 0 ? AbstractC0497v4.m1083b(strM1083b) : file2 != null ? file2.getName() : absolutePath.length() > 0 ? AbstractC0497v4.m1083b(absolutePath) : "unnamed_file";
            String absolutePath2 = absolutePath.length() > 0 ? absolutePath : file2 == null ? "" : file2.getAbsolutePath();
            String lowerCase3 = name2.toLowerCase(Locale.ROOT);
            if (lowerCase3.contains("picelement") || lowerCase3.contains("videoelement") || lowerCase3.contains("pttelement") || lowerCase3.contains("audioelement") || lowerCase3.contains("faceelement") || lowerCase3.contains("marketelement") || m1164e(absolutePath) || m1164e(strM1083b) || (file2 != null && m1164e(file2.getAbsolutePath()))) {
                String str8 = strM1083b2;
                String str9 = absolutePath2;
                if (!HookEntry.runtimeBool(Prefs.KEY_DEBUG_LOG)) {
                    return 0;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - f1089b < 5000) {
                    return 0;
                }
                f1089b = jCurrentTimeMillis;
                HookEntry.log("filename metadata skipped media path originalName=" + m1166g(str8) + " originalPath=" + m1166g(str9) + " class=" + name2);
                return 0;
            }
            if (file2 == null && absolutePath.length() <= 0) {
                if (strM1083b.length() <= 0) {
                    return 0;
                }
                if (m1167h(strM1083b).equals(strM1083b) && !AbstractC0525x0.m1127a(strM1083b)) {
                    return 0;
                }
            }
            if (AbstractC0525x0.m1128b(absolutePath) || AbstractC0525x0.m1129c(absolutePath)) {
                z = true;
                if (z) {
                }
                HookEntry.log("filename outgoing detected originalName=" + m1166g(strM1083b2) + " originalPath=" + m1166g(absolutePath2) + " class=" + name2);
                String strM1167h = m1167h(strM1083b2);
                if (HookEntry.runtimeBool(Prefs.KEY_RENAME_APK_FILE)) {
                }
                str = strM1167h;
                if (!str.equals(strM1083b2)) {
                }
                if (z) {
                }
            } else {
                if (file2 != null) {
                    if (!AbstractC0525x0.m1128b(file2.getAbsolutePath())) {
                        if (AbstractC0525x0.m1129c(file2.getAbsolutePath())) {
                        }
                        if (z) {
                            i2 = 0;
                        } else {
                            i2 = 0;
                            if (!Boolean.TRUE.equals(f1088a.get())) {
                                HookEntry.log("filename metadata skipped hot download path originalName=" + m1166g(strM1083b2) + " originalPath=" + m1166g(absolutePath2) + " class=" + name2);
                                return 0;
                            }
                            HookEntry.log("filename metadata hot path display-only originalName=" + m1166g(strM1083b2) + " originalPath=" + m1166g(absolutePath2) + " class=" + name2);
                        }
                        HookEntry.log("filename outgoing detected originalName=" + m1166g(strM1083b2) + " originalPath=" + m1166g(absolutePath2) + " class=" + name2);
                        String strM1167h2 = m1167h(strM1083b2);
                        if (HookEntry.runtimeBool(Prefs.KEY_RENAME_APK_FILE)) {
                            try {
                                String absolutePath3 = absolutePath.length() > 0 ? absolutePath : file2 == null ? "" : file2.getAbsolutePath();
                                File fileM1161b2 = (file2 != null || absolutePath3.length() <= 0) ? file2 : m1161b(absolutePath3);
                                if (fileM1161b2 != null && fileM1161b2.isFile() && (AbstractC0497v4.m1077D(fileM1161b2.getName()) || AbstractC0497v4.m1077D(strM1083b2) || AbstractC0525x0.m1127a(strM1083b2))) {
                                    strM1167h2 = m1160a(HookEntry.hostContext(), fileM1161b2, strM1083b2);
                                }
                            } catch (Throwable unused3) {
                            }
                        }
                        str = strM1167h2;
                        if (!str.equals(strM1083b2)) {
                            HookEntry.log("filename sanitize original=" + m1166g(strM1083b2) + " fixed=" + m1166g(str));
                        }
                        if (!z || file2 == null || str.equals(file2.getName())) {
                            name = str;
                            fileM1165f = null;
                        } else {
                            try {
                            } catch (Throwable th) {
                                th = th;
                                str5 = str;
                            }
                            if (file2.isFile()) {
                                if (AbstractC0525x0.m1128b(file2.getAbsolutePath())) {
                                    HookEntry.log("filename safe copy skipped hot download path=".concat(m1166g(file2.getAbsolutePath())));
                                } else if (AbstractC0525x0.m1129c(file2.getAbsolutePath())) {
                                    HookEntry.log("filename safe copy skipped public download apk marker path=".concat(m1166g(file2.getAbsolutePath())));
                                } else {
                                    Context contextHostContext = HookEntry.hostContext();
                                    if (contextHostContext != null) {
                                        File file4 = new File(contextHostContext.getCacheDir(), "elaris_send_file");
                                        if (!file4.exists()) {
                                            file4.mkdirs();
                                        }
                                        fileM1165f = m1165f(file4, str, file2.length());
                                        if (fileM1165f.isFile() && fileM1165f.length() == file2.length()) {
                                            str5 = str;
                                        } else {
                                            if (fileM1165f.isFile() && AbstractC0497v4.m1077D(str)) {
                                                try {
                                                    fileM1165f.delete();
                                                } catch (Throwable unused4) {
                                                }
                                            }
                                            try {
                                                fileInputStream = new FileInputStream(file2);
                                                try {
                                                    fileOutputStream = new FileOutputStream(fileM1165f);
                                                    try {
                                                        bArr = new byte[65536];
                                                    } catch (Throwable unused5) {
                                                        str5 = str;
                                                    }
                                                } catch (Throwable unused6) {
                                                    str5 = str;
                                                    fileOutputStream = null;
                                                }
                                            } catch (Throwable unused7) {
                                                str5 = str;
                                                fileInputStream = null;
                                            }
                                            while (true) {
                                                int i8 = fileInputStream.read(bArr);
                                                if (i8 <= 0) {
                                                    break;
                                                }
                                                str5 = str;
                                                try {
                                                    fileOutputStream.write(bArr, i2, i8);
                                                    str = str5;
                                                    i2 = 0;
                                                } catch (Throwable unused8) {
                                                }
                                                if (fileInputStream != null) {
                                                    try {
                                                        fileInputStream.close();
                                                    } catch (Throwable unused9) {
                                                    }
                                                }
                                                if (fileOutputStream != null) {
                                                    try {
                                                        fileOutputStream.close();
                                                    } catch (Throwable unused10) {
                                                    }
                                                }
                                                z2 = false;
                                                if (z2) {
                                                    fileM1165f = null;
                                                } else {
                                                    try {
                                                        fileM1165f.setLastModified(file2.lastModified());
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        AbstractC0000a.m3d(th, new StringBuilder("filename metadata patched failed reason="), ": ");
                                                        fileM1165f = null;
                                                    }
                                                }
                                            }
                                            str5 = str;
                                            fileOutputStream.flush();
                                            boolean z4 = fileM1165f.length() == file2.length();
                                            fileInputStream.close();
                                            fileOutputStream.close();
                                            z2 = z4;
                                            if (z2) {
                                            }
                                        }
                                        name = fileM1165f != null ? fileM1165f.getName() : str5;
                                    }
                                }
                                str5 = str;
                                fileM1165f = null;
                                if (fileM1165f != null) {
                                }
                            } else {
                                str5 = str;
                                fileM1165f = null;
                                if (fileM1165f != null) {
                                }
                            }
                        }
                        String absolutePath4 = fileM1165f != null ? "" : fileM1165f.getAbsolutePath();
                        long length2 = fileM1165f != null ? -1L : fileM1165f.length();
                        String str10 = strM1083b2;
                        superclass = obj.getClass();
                        i3 = 0;
                        while (superclass != null && superclass != Object.class) {
                            try {
                                cls = superclass;
                                declaredFields = superclass.getDeclaredFields();
                            } catch (Throwable unused11) {
                                cls = superclass;
                                declaredFields = null;
                            }
                            String str11 = str6;
                            if (declaredFields == null) {
                                int length3 = declaredFields.length;
                                int iM1169j = i3;
                                int i9 = 0;
                                while (i9 < length3) {
                                    Field[] fieldArr = declaredFields;
                                    Field field2 = fieldArr[i9];
                                    if (Modifier.isStatic(field2.getModifiers())) {
                                        str2 = name;
                                        i5 = length3;
                                    } else {
                                        i5 = length3;
                                        try {
                                            field2.setAccessible(true);
                                            String name4 = field2.getName();
                                            if (name4 == null) {
                                                str3 = absolutePath2;
                                                lowerCase = str11;
                                            } else {
                                                str3 = absolutePath2;
                                                try {
                                                    lowerCase = name4.toLowerCase(Locale.ROOT);
                                                } catch (Throwable unused12) {
                                                    str2 = name;
                                                    file = file2;
                                                }
                                            }
                                            Object obj3 = field2.get(obj);
                                            file = file2;
                                            try {
                                                i6 = i9;
                                                if (field2.getType() == String.class) {
                                                    if (obj3 instanceof String) {
                                                        String str12 = (String) obj3;
                                                        if (!m1162c(lowerCase) || name == null || name.length() == 0) {
                                                            if (fileM1165f == null || !m1163d(lowerCase) || str12.length() == 0) {
                                                                str2 = name;
                                                            } else {
                                                                if (absolutePath.length() > 0) {
                                                                    str2 = name;
                                                                    try {
                                                                        String strReplace = (str12.startsWith("file://") ? str12.substring(7) : str12).replace('\\', '/');
                                                                        if (absolutePath.startsWith("file://")) {
                                                                            str4 = absolutePath;
                                                                            strSubstring = absolutePath.substring(7);
                                                                            c = '/';
                                                                        } else {
                                                                            str4 = absolutePath;
                                                                            c = '/';
                                                                            strSubstring = str4;
                                                                        }
                                                                        try {
                                                                            if (strReplace.equals(strSubstring.replace('\\', c))) {
                                                                            }
                                                                            field2.set(obj, str12.startsWith("file://") ? absolutePath4 : "file://" + absolutePath4.replace('\\', '/'));
                                                                            iM1169j++;
                                                                        } catch (Throwable unused13) {
                                                                        }
                                                                    } catch (Throwable unused14) {
                                                                        str4 = absolutePath;
                                                                    }
                                                                } else {
                                                                    str2 = name;
                                                                    str4 = absolutePath;
                                                                }
                                                                File fileM1161b3 = m1161b(str12);
                                                                if (fileM1161b3 != null && file != null) {
                                                                    String absolutePath5 = fileM1161b3.getAbsolutePath();
                                                                    String absolutePath6 = file.getAbsolutePath();
                                                                    if (absolutePath5 == null || absolutePath6 == null) {
                                                                        zEquals = false;
                                                                    } else {
                                                                        if (absolutePath5.startsWith("file://")) {
                                                                            absolutePath5 = absolutePath5.substring(7);
                                                                        }
                                                                        char c2 = '/';
                                                                        String strReplace2 = absolutePath5.replace('\\', '/');
                                                                        if (absolutePath6.startsWith("file://")) {
                                                                            absolutePath6 = absolutePath6.substring(7);
                                                                            c2 = '/';
                                                                        }
                                                                        zEquals = strReplace2.equals(absolutePath6.replace('\\', c2));
                                                                    }
                                                                    if (!zEquals) {
                                                                    }
                                                                    if (str12.startsWith("file://")) {
                                                                    }
                                                                    field2.set(obj, str12.startsWith("file://") ? absolutePath4 : "file://" + absolutePath4.replace('\\', '/'));
                                                                    iM1169j++;
                                                                }
                                                            }
                                                            str4 = absolutePath;
                                                        } else {
                                                            if (str12.length() != 0) {
                                                                String strM1083b3 = AbstractC0497v4.m1083b(str12);
                                                                if (!strM1083b3.equals(strM1083b)) {
                                                                    if (strM1083b3.equals(file == null ? str11 : file.getName()) || !m1167h(strM1083b3).equals(strM1083b3) || AbstractC0525x0.m1127a(strM1083b3)) {
                                                                    }
                                                                    str2 = name;
                                                                    str4 = absolutePath;
                                                                }
                                                            }
                                                            field2.set(obj, name);
                                                            iM1169j++;
                                                            str2 = name;
                                                            str4 = absolutePath;
                                                        }
                                                    } else {
                                                        str2 = name;
                                                        str4 = absolutePath;
                                                        if (fileM1165f != null && (obj3 instanceof File) && m1163d(lowerCase)) {
                                                            field2.set(obj, fileM1165f);
                                                            iM1169j++;
                                                        } else if (fileM1165f != null && ((lowerCase.equals("size") || lowerCase.endsWith("size") || lowerCase.contains("filesize") || lowerCase.contains("filelen") || lowerCase.contains("length")) && length2 >= 0)) {
                                                            iM1169j += m1169j(field2, obj, length2);
                                                        }
                                                    }
                                                }
                                            } catch (Throwable unused15) {
                                                str2 = name;
                                                str4 = absolutePath;
                                                i6 = i9;
                                            }
                                        } catch (Throwable unused16) {
                                            str2 = name;
                                            str3 = absolutePath2;
                                        }
                                        i9 = i6 + 1;
                                        declaredFields = fieldArr;
                                        length3 = i5;
                                        absolutePath2 = str3;
                                        file2 = file;
                                        name = str2;
                                        absolutePath = str4;
                                    }
                                    str3 = absolutePath2;
                                    file = file2;
                                    str4 = absolutePath;
                                    i6 = i9;
                                    i9 = i6 + 1;
                                    declaredFields = fieldArr;
                                    length3 = i5;
                                    absolutePath2 = str3;
                                    file2 = file;
                                    name = str2;
                                    absolutePath = str4;
                                }
                                i3 = iM1169j;
                            }
                            superclass = cls.getSuperclass();
                            str6 = str11;
                            absolutePath2 = absolutePath2;
                            file2 = file2;
                            name = name;
                            absolutePath = absolutePath;
                        }
                        String str13 = name;
                        String str14 = str6;
                        String str15 = absolutePath2;
                        if (i3 > 0) {
                            StringBuilder sb = new StringBuilder("filename metadata patched originalName=");
                            sb.append(m1166g(str10));
                            sb.append(" fixedName=");
                            sb.append(m1166g(str13));
                            sb.append(" originalPath=");
                            sb.append(m1166g(str15));
                            sb.append(" safePath=");
                            sb.append(m1166g(fileM1165f == null ? str14 : fileM1165f.getAbsolutePath()));
                            HookEntry.log(sb.toString());
                        }
                        i4 = i3;
                    }
                    z = true;
                    if (z) {
                    }
                    HookEntry.log("filename outgoing detected originalName=" + m1166g(strM1083b2) + " originalPath=" + m1166g(absolutePath2) + " class=" + name2);
                    String strM1167h22 = m1167h(strM1083b2);
                    if (HookEntry.runtimeBool(Prefs.KEY_RENAME_APK_FILE)) {
                    }
                    str = strM1167h22;
                    if (!str.equals(strM1083b2)) {
                    }
                    if (z) {
                        name = str;
                        fileM1165f = null;
                        if (fileM1165f != null) {
                        }
                        if (fileM1165f != null) {
                        }
                        String str102 = strM1083b2;
                        superclass = obj.getClass();
                        i3 = 0;
                        while (superclass != null) {
                            cls = superclass;
                            declaredFields = superclass.getDeclaredFields();
                            String str112 = str6;
                            if (declaredFields == null) {
                            }
                            superclass = cls.getSuperclass();
                            str6 = str112;
                            absolutePath2 = absolutePath2;
                            file2 = file2;
                            name = name;
                            absolutePath = absolutePath;
                        }
                        String str132 = name;
                        String str142 = str6;
                        String str152 = absolutePath2;
                        if (i3 > 0) {
                        }
                        i4 = i3;
                    }
                }
                z = false;
                if (z) {
                }
                HookEntry.log("filename outgoing detected originalName=" + m1166g(strM1083b2) + " originalPath=" + m1166g(absolutePath2) + " class=" + name2);
                String strM1167h222 = m1167h(strM1083b2);
                if (HookEntry.runtimeBool(Prefs.KEY_RENAME_APK_FILE)) {
                }
                str = strM1167h222;
                if (!str.equals(strM1083b2)) {
                }
                if (z) {
                }
            }
        } else {
            i4 = 0;
        }
        for (Class<?> superclass3 = obj.getClass(); superclass3 != null && superclass3 != Object.class; superclass3 = superclass3.getSuperclass()) {
            try {
                declaredFields2 = superclass3.getDeclaredFields();
            } catch (Throwable unused17) {
                declaredFields2 = null;
            }
            if (declaredFields2 != null) {
                int iM1168i = i4;
                for (Field field3 : declaredFields2) {
                    if (!Modifier.isStatic(field3.getModifiers()) && !field3.getType().isPrimitive()) {
                        try {
                            field3.setAccessible(true);
                            Object obj4 = field3.get(obj);
                            if (obj4 != null && !(obj4 instanceof String) && !(obj4 instanceof Number) && !(obj4 instanceof Boolean)) {
                                try {
                                    iM1168i += m1168i(obj4, i + 1, hashSet);
                                } catch (Throwable unused18) {
                                }
                            }
                        } catch (Throwable unused19) {
                        }
                    }
                }
                i4 = iM1168i;
            }
        }
        return i4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static int m1169j(Field field, Object obj, long j) throws IllegalAccessException {
        Class<?> type = field.getType();
        if (type == Long.TYPE || type == Long.class) {
            field.set(obj, Long.valueOf(j));
            return 1;
        }
        if (type == Integer.TYPE || type == Integer.class) {
            field.set(obj, Integer.valueOf((int) Math.min(2147483647L, j)));
            return 1;
        }
        if (type != Short.TYPE && type != Short.class) {
            return 0;
        }
        field.set(obj, Short.valueOf((short) Math.min(32767L, j)));
        return 1;
    }
}
