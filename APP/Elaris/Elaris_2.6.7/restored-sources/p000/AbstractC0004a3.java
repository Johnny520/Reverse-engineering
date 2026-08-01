package p000;

import android.os.Environment;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: a3 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0004a3 {

    /* JADX INFO: renamed from: e */
    public static volatile boolean f15e;

    /* JADX INFO: renamed from: g */
    public static volatile File f17g;

    /* JADX INFO: renamed from: a */
    public static final Object f11a = new Object();

    /* JADX INFO: renamed from: b */
    public static final HashMap f12b = new HashMap();

    /* JADX INFO: renamed from: c */
    public static final HashMap f13c = new HashMap();

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f14d = new ThreadLocal();

    /* JADX INFO: renamed from: f */
    public static volatile String f16f = "";

    /* JADX INFO: renamed from: h */
    public static volatile String f18h = "";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C0543y2 m8a(Object obj, String str, String str2, boolean z) {
        String str3;
        boolean z2;
        C0543y2 c0543y2 = new C0543y2();
        c0543y2.f1084a = "";
        if (obj instanceof ArrayList) {
            ArrayList arrayList = (ArrayList) obj;
            if (!arrayList.isEmpty() && str != null && str.length() != 0) {
                int iMin = z ? Math.min(arrayList.size(), 3) : 1;
                int i = 0;
                while (i < iMin) {
                    Object obj2 = arrayList.get(i);
                    if (obj2 == null) {
                        str3 = str;
                        z2 = z;
                    } else {
                        str3 = str;
                        z2 = z;
                        m19l(obj2, str3, str2 == null ? "" : str2, z2, 0, Collections.newSetFromMap(new IdentityHashMap()), c0543y2);
                    }
                    i++;
                    str = str3;
                    z = z2;
                }
            }
        }
        return c0543y2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C0527x2 m9b(File file, String str, long j) {
        long j2;
        if (str.length() == 0 || ((!file.exists() && !file.mkdirs()) || !file.isDirectory())) {
            return null;
        }
        synchronized (f11a) {
            try {
                m21n(System.currentTimeMillis());
                int i = 0;
                while (i <= 9999) {
                    File fileM18k = m18k(file, str, i);
                    if (str.toLowerCase(Locale.ROOT).endsWith(".apk.1")) {
                        if (m24q(fileM18k, true)) {
                            File fileM28u = m28u(file, fileM18k);
                            if (m24q(fileM28u, true)) {
                                f13c.put(m30w(fileM28u), new C0559z2(fileM28u, fileM18k, j, System.currentTimeMillis()));
                                return new C0527x2(fileM28u);
                            }
                            f12b.remove(m30w(fileM18k));
                        }
                        j2 = j;
                    } else {
                        j2 = j;
                        if (m24q(fileM18k, false)) {
                            return new C0527x2(fileM18k);
                        }
                    }
                    i++;
                    j = j2;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static String m10c(File file) {
        File absoluteFile;
        try {
            absoluteFile = file.getCanonicalFile();
        } catch (Throwable unused) {
            absoluteFile = file.getAbsoluteFile();
        }
        return absoluteFile.getAbsolutePath();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static File m11d() {
        synchronized (f11a) {
            try {
                File file = f17g;
                if (file != null && Prefs.DEFAULT_DOWNLOAD_DIRECT_WRITE_DIR.equals(f16f)) {
                    try {
                        m12e(file);
                        f18h = "";
                        return file;
                    } catch (Throwable unused) {
                        f17g = null;
                        File fileM26s = m26s();
                        m12e(fileM26s);
                        f16f = Prefs.DEFAULT_DOWNLOAD_DIRECT_WRITE_DIR;
                        f17g = fileM26s;
                        f18h = "";
                        return fileM26s;
                    }
                }
                try {
                    File fileM26s2 = m26s();
                    m12e(fileM26s2);
                    f16f = Prefs.DEFAULT_DOWNLOAD_DIRECT_WRITE_DIR;
                    f17g = fileM26s2;
                    f18h = "";
                    return fileM26s2;
                } catch (Throwable th) {
                    String str = th.getClass().getSimpleName() + ": " + String.valueOf(th.getMessage());
                    if (!str.equals(f18h)) {
                        f18h = str;
                        HookEntry.logAlways("download direct write target unavailable: ".concat(str));
                    }
                    f16f = Prefs.DEFAULT_DOWNLOAD_DIRECT_WRITE_DIR;
                    f17g = null;
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, IF, INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: e */
    public static void m12e(File file) {
        if (file == null) {
            throw new IllegalArgumentException("目录为空");
        }
        if (Environment.getExternalStorageState() != null && !"mounted".equals(Environment.getExternalStorageState())) {
            C0479u2.m1037b("共享存储未挂载");
            return;
        }
        if (file.exists() && !file.isDirectory()) {
            throw new IllegalArgumentException("目标不是目录");
        }
        if (!file.exists() && !file.mkdirs()) {
            C0479u2.m1037b("无法创建目录");
            return;
        }
        File file2 = new File(file, ".elaris_direct_write_test_" + System.nanoTime());
        try {
            if (!file2.createNewFile()) {
                throw new IllegalStateException("目录不可写");
            }
        } catch (Throwable th) {
            try {
                throw new IllegalStateException("目录不可写", th);
            } finally {
                try {
                    if (file2.exists()) {
                        file2.delete();
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static void m13f(C0559z2 c0559z2) {
        synchronized (f11a) {
            f13c.remove(m30w(c0559z2.f1125a));
            HashMap map = f12b;
            map.remove(m30w(c0559z2.f1125a));
            map.remove(m30w(c0559z2.f1126b));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static int m14g(ClassLoader classLoader, String str, String str2) {
        Class clsM1091j = AbstractC0497v4.m1091j(classLoader, str);
        if (clsM1091j == null) {
            HookEntry.log("download direct write class missing route=".concat(str2));
            return 0;
        }
        int i = 0;
        for (Method method : clsM1091j.getDeclaredMethods()) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if ("downloadFileForFileInfo".equals(method.getName()) && method.getReturnType() == Void.TYPE && parameterTypes.length == 2 && parameterTypes[0] == ArrayList.class && parameterTypes[1] == String.class) {
                try {
                    method.setAccessible(true);
                    XposedBridge.hookMethod(method, new C0511w2(str2));
                    i++;
                } catch (Throwable th) {
                    HookEntry.log("download direct write hook failed route=" + str2 + ": " + th);
                }
            }
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static int m15h(ClassLoader classLoader) {
        Class clsM1091j = AbstractC0497v4.m1091j(classLoader, "com.tencent.mobileqq.vfs.VFSAssistantUtils");
        if (clsM1091j == null) {
            HookEntry.log("legacy download redirect class missing");
            return 0;
        }
        int i = 0;
        for (Method method : clsM1091j.getDeclaredMethods()) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if ("getSDKPrivatePath".equals(method.getName()) && method.getReturnType() == String.class && parameterTypes.length == 1 && parameterTypes[0] == String.class) {
                try {
                    method.setAccessible(true);
                    XposedBridge.hookMethod(method, new C0495v2(35));
                    i++;
                    HookEntry.logAlways("legacy download redirect hook installed: " + AbstractC0497v4.m1078E(method));
                } catch (Throwable th) {
                    HookEntry.log("legacy download redirect hook failed: " + th);
                }
            }
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static synchronized void m16i(ClassLoader classLoader) {
        if (!f15e && classLoader != null) {
            int iM14g = m14g(classLoader, "com.tencent.qqnt.msg.api.impl.RichMediaServiceImpl", "rich_media_file") + m14g(classLoader, "com.tencent.qqnt.kernel.api.impl.mw", "kernel_api") + m14g(classLoader, "com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService$CppProxy", "kernel_cpp_proxy") + m15h(classLoader);
            if (iM14g > 0) {
                f15e = true;
                HookEntry.logAlways("download direct write hook installed count=" + iM14g);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static String m17j(String str) {
        return str == null ? "" : str.replace('\\', '/').trim();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static File m18k(File file, String str, int i) {
        if (i <= 0) {
            return new File(file, str);
        }
        if (str.toLowerCase(Locale.ROOT).endsWith(".apk.1")) {
            return new File(file, str.substring(0, str.length() - 6) + " (" + i + ")" + str.substring(str.length() - 6));
        }
        int iLastIndexOf = str.lastIndexOf(46);
        String strSubstring = (iLastIndexOf <= 0 || str.length() - iLastIndexOf > 24) ? "" : str.substring(iLastIndexOf);
        if (strSubstring.length() != 0) {
            str = str.substring(0, iLastIndexOf);
        }
        return new File(file, str + " (" + i + ")" + strSubstring);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d9  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m19l(Object obj, String str, String str2, boolean z, int i, Set set, C0543y2 c0543y2) {
        Set set2 = set;
        C0543y2 c0543y22 = c0543y2;
        if (c0543y22.f1086c < 96 && !set2.contains(obj)) {
            set2.add(obj);
            c0543y22.f1086c++;
            Class<?> superclass = obj.getClass();
            while (superclass != null && superclass != Object.class) {
                try {
                    Field[] declaredFields = superclass.getDeclaredFields();
                    int length = declaredFields.length;
                    int i2 = 0;
                    while (i2 < length) {
                        Field field = declaredFields[i2];
                        if (!Modifier.isStatic(field.getModifiers())) {
                            String name = field.getName();
                            String lowerCase = name == null ? "" : name.toLowerCase(Locale.ROOT);
                            String str3 = ("filepath".equals(lowerCase) || "localpath".equals(lowerCase) || "downloadpath".equals(lowerCase) || "savepath".equals(lowerCase) || "realpath".equals(lowerCase) || "targetpath".equals(lowerCase) || lowerCase.endsWith("filepath") || lowerCase.endsWith("localpath") || lowerCase.endsWith("downloadpath") || lowerCase.endsWith("savepath") || lowerCase.endsWith("realpath") || lowerCase.endsWith("targetpath") || lowerCase.contains("file_path") || lowerCase.contains("local_path") || lowerCase.contains("download_path") || lowerCase.contains("save_path") || lowerCase.contains("real_path") || lowerCase.contains("target_path")) ? str : (z && ("dir".equals(lowerCase) || "folder".equals(lowerCase) || "directory".equals(lowerCase) || "savedir".equals(lowerCase) || "savefolder".equals(lowerCase) || "downloadfolder".equals(lowerCase) || "downloadfolderpath".equals(lowerCase) || "downloadfoldername".equals(lowerCase) || lowerCase.endsWith("savedir") || lowerCase.endsWith("savefolder") || lowerCase.endsWith("downloadfolder") || lowerCase.endsWith("downloadfolderpath") || lowerCase.endsWith("dirpath") || lowerCase.endsWith("folderpath") || lowerCase.contains("save_dir") || lowerCase.contains("save_folder") || lowerCase.contains("download_folder") || lowerCase.contains("dir_path") || lowerCase.contains("folder_path"))) ? str2 : "";
                            if (str3.length() > 0) {
                                if (field.getType() == String.class) {
                                    field.setAccessible(true);
                                    if (!str3.equals(field.get(obj))) {
                                        field.set(obj, str3);
                                        String name2 = field.getName();
                                        c0543y22.f1085b++;
                                        if (name2 != null && name2.length() != 0) {
                                            if (((String) c0543y22.f1084a).length() == 0) {
                                                c0543y22.f1084a = name2;
                                            } else if (c0543y22.f1085b <= 8) {
                                                c0543y22.f1084a = ((String) c0543y22.f1084a) + "," + name2;
                                            }
                                        }
                                    }
                                }
                                if (!z && i < 2 && field.getType() != String.class) {
                                    try {
                                        field.setAccessible(true);
                                        Object obj2 = field.get(obj);
                                        if (obj2 != null && obj2.getClass().getName().startsWith("com.tencent.")) {
                                            m19l(obj2, str, str2, true, i + 1, set2, c0543y22);
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                            } else if (!z) {
                            }
                        }
                        i2++;
                        set2 = set;
                        c0543y22 = c0543y2;
                    }
                    superclass = superclass.getSuperclass();
                } catch (Throwable unused2) {
                    superclass = superclass.getSuperclass();
                }
                set2 = set;
                c0543y22 = c0543y2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static C0559z2 m20m(File file) {
        C0559z2 c0559z2;
        synchronized (f11a) {
            m21n(System.currentTimeMillis());
            c0559z2 = (C0559z2) f13c.get(m30w(file));
        }
        return c0559z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static void m21n(long j) {
        HashMap map;
        Iterator it = f13c.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = f12b;
            if (!zHasNext) {
                break;
            }
            C0559z2 c0559z2 = (C0559z2) ((Map.Entry) it.next()).getValue();
            if (c0559z2 == null || j - c0559z2.f1128d >= 1800000) {
                if (c0559z2 != null) {
                    map.remove(m30w(c0559z2.f1125a));
                    map.remove(m30w(c0559z2.f1126b));
                }
                it.remove();
            }
        }
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Long l = (Long) ((Map.Entry) it2.next()).getValue();
            if (l == null || (l.longValue() != Long.MAX_VALUE && j - l.longValue() >= 1800)) {
                it2.remove();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static String m22o(String str) {
        int iIndexOf;
        if (str == null) {
            return "";
        }
        String strM17j = m17j(str);
        if (strM17j.length() == 0) {
            return "";
        }
        String lowerCase = strM17j.toLowerCase(Locale.ROOT);
        if (lowerCase.startsWith("qqfile_recv/")) {
            iIndexOf = 0;
        } else {
            iIndexOf = lowerCase.indexOf("/qqfile_recv/");
            if (iIndexOf >= 0) {
                iIndexOf++;
            }
        }
        return iIndexOf < 0 ? "" : strM17j.substring(iIndexOf + 12).trim();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static void m23p(File file) {
        synchronized (f11a) {
            f12b.remove(m30w(file));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static boolean m24q(File file, boolean z) {
        if (file.exists()) {
            return false;
        }
        String strM30w = m30w(file);
        HashMap map = f12b;
        if (map.containsKey(strM30w)) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z) {
            jCurrentTimeMillis = Long.MAX_VALUE;
        }
        map.put(strM30w, Long.valueOf(jCurrentTimeMillis));
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static File m25r(File file) {
        int iLastIndexOf;
        int i;
        int i2;
        File parentFile = file.getParentFile();
        String name = file.getName();
        if (parentFile == null || name.length() == 0) {
            return null;
        }
        if (name.toLowerCase(Locale.ROOT).endsWith(".apk.1")) {
            String strSubstring = name.substring(0, name.length() - 6);
            if (strSubstring.endsWith(")") && (iLastIndexOf = strSubstring.lastIndexOf(" (")) >= 0 && (i = iLastIndexOf + 2) < strSubstring.length() - 1) {
                try {
                    i2 = Integer.parseInt(strSubstring.substring(i, strSubstring.length() - 1));
                    if (i2 <= 0 || i2 > 9999) {
                    }
                } catch (NumberFormatException unused) {
                }
            }
        } else {
            i2 = 0;
        }
        if (i2 > 0) {
            String strSubstring2 = name.substring(name.length() - 6);
            String strSubstring3 = name.substring(0, name.length() - 6);
            int iLastIndexOf2 = strSubstring3.lastIndexOf(" (");
            if (iLastIndexOf2 >= 0) {
                name = strSubstring3.substring(0, iLastIndexOf2).concat(strSubstring2);
            }
        }
        synchronized (f11a) {
            try {
                m21n(System.currentTimeMillis());
                for (int i3 = i2 + 1; i3 <= 9999; i3++) {
                    File fileM18k = m18k(parentFile, name, i3);
                    if (m24q(fileM18k, true)) {
                        return fileM18k;
                    }
                }
                return null;
            } finally {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static File m26s() {
        File absoluteFile;
        File absoluteFile2;
        boolean zStartsWith;
        String strSubstring = Prefs.DEFAULT_DOWNLOAD_DIRECT_WRITE_DIR;
        if (Prefs.DEFAULT_DOWNLOAD_DIRECT_WRITE_DIR.startsWith("content://")) {
            throw new IllegalArgumentException("不支持 SAF/content 目录");
        }
        if (Prefs.DEFAULT_DOWNLOAD_DIRECT_WRITE_DIR.startsWith("file://")) {
            strSubstring = Prefs.DEFAULT_DOWNLOAD_DIRECT_WRITE_DIR.substring(7);
        }
        String strTrim = strSubstring.replace('\\', '/').trim();
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            C0479u2.m1037b("共享存储不可用");
            return null;
        }
        File file = strTrim.startsWith("/") ? (strTrim.equalsIgnoreCase("/Download") || strTrim.toLowerCase(Locale.ROOT).startsWith("/download/")) ? new File(externalStorageDirectory, strTrim.substring(1)) : new File(strTrim) : new File(externalStorageDirectory, strTrim);
        try {
            absoluteFile = externalStorageDirectory.getCanonicalFile();
        } catch (Throwable unused) {
            absoluteFile = externalStorageDirectory.getAbsoluteFile();
        }
        try {
            absoluteFile2 = file.getCanonicalFile();
        } catch (Throwable unused2) {
            absoluteFile2 = file.getAbsoluteFile();
        }
        String strM10c = m10c(absoluteFile);
        String strM10c2 = m10c(absoluteFile2);
        if (strM10c2 == null || strM10c == null) {
            zStartsWith = false;
        } else {
            String strReplace = strM10c2.replace('\\', '/');
            String strReplace2 = strM10c.replace('\\', '/');
            String strReplace3 = strReplace2 == null ? "" : strReplace2.replace('\\', '/');
            if (!strReplace3.endsWith("/")) {
                strReplace3 = strReplace3.concat("/");
            }
            zStartsWith = strReplace.startsWith(strReplace3);
        }
        if (!zStartsWith) {
            throw new IllegalArgumentException("目录必须位于共享存储内");
        }
        String strReplace4 = strM10c != null ? strM10c.replace('\\', '/') : "";
        if (!strReplace4.endsWith("/")) {
            strReplace4 = strReplace4.concat("/");
        }
        String lowerCase = strM10c2.substring(strReplace4.length()).replace('\\', '/').toLowerCase(Locale.ROOT);
        if (lowerCase.equals("android") || lowerCase.startsWith("android/data") || lowerCase.startsWith("android/obb")) {
            throw new IllegalArgumentException("不允许使用 Android/data 或 Android/obb");
        }
        return absoluteFile2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static String m27t(String str) {
        String strTrim = (str == null ? "" : new File(str).getName()).replace('\r', ' ').replace('\n', ' ').replace('\t', ' ').trim().replaceAll("[\\\\/:*?\"<>|\\p{Cntrl}]+", "_").trim();
        while (strTrim.endsWith(".")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1).trim();
        }
        if (strTrim.length() <= 180) {
            return strTrim;
        }
        String strSubstring = strTrim.toLowerCase(Locale.ROOT).endsWith(".apk.1") ? strTrim.substring(strTrim.length() - 6) : "";
        int iLastIndexOf = strTrim.lastIndexOf(46);
        if (strSubstring.length() == 0 && iLastIndexOf > 0 && strTrim.length() - iLastIndexOf <= 24) {
            strSubstring = strTrim.substring(iLastIndexOf);
        }
        if (strSubstring.length() != 0) {
            strTrim = strTrim.substring(0, strTrim.length() - strSubstring.length());
        }
        return strTrim.substring(0, Math.min(strTrim.length(), 180 - strSubstring.length())).concat(strSubstring);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static File m28u(File file, File file2) {
        String name = file2.getName();
        if (name.toLowerCase(Locale.ROOT).endsWith(".apk.1")) {
            name = name.substring(0, name.length() - 6);
        }
        return new File(file, m27t(name + ".elaris-" + Long.toHexString(System.nanoTime()) + ".apk"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static String m29v(String str, String str2) {
        if (str2.length() == 0) {
            return str;
        }
        String strConcat = str2.concat("/");
        String strSubstring = str;
        while (true) {
            if (!strSubstring.equalsIgnoreCase(str2) && !strSubstring.regionMatches(true, 0, strConcat, 0, strConcat.length())) {
                return strSubstring;
            }
            if (strSubstring.equalsIgnoreCase(str2)) {
                return "";
            }
            strSubstring = strSubstring.substring(strConcat.length());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static String m30w(File file) {
        return m10c(file).toLowerCase(Locale.ROOT);
    }
}
