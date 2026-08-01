package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.io.File;
import java.util.Locale;

/* JADX INFO: renamed from: v2 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0495v2 extends XC_MethodHook {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016a  */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        String str;
        int i;
        String strM29v;
        File file;
        File absoluteFile;
        String strM10c;
        String strM10c2;
        String strReplace;
        File file2;
        if (HookEntry.runtimeBool(Prefs.KEY_DOWNLOAD_DIRECT_WRITE)) {
            Object[] objArr = methodHookParam.args;
            boolean zStartsWith = false;
            String strM10c3 = "";
            if (objArr == null || objArr.length <= 0) {
                str = "";
            } else {
                Object obj = objArr[0];
                if (obj instanceof String) {
                    str = (String) obj;
                }
            }
            Object result = methodHookParam.getResult();
            if (result instanceof String) {
                String strM17j = AbstractC0004a3.m17j((String) result);
                String strM22o = AbstractC0004a3.m22o(AbstractC0004a3.m17j(str));
                if (strM22o.length() == 0) {
                    strM22o = AbstractC0004a3.m22o(strM17j);
                }
                if (strM22o.length() != 0) {
                    try {
                        file2 = new File(strM17j);
                    } catch (Throwable unused) {
                    }
                    if (!file2.exists() || !file2.isFile()) {
                        File fileM11d = AbstractC0004a3.m11d();
                        if (fileM11d != null) {
                            while (true) {
                                i = 1;
                                if (!strM22o.startsWith("/")) {
                                    break;
                                } else {
                                    strM22o = strM22o.substring(1);
                                }
                            }
                            String strReplace2 = strM22o.replace('\\', '/');
                            String strTrim = strReplace2 == null ? "" : strReplace2.replace('\\', '/').trim();
                            while (strTrim.startsWith("/")) {
                                strTrim = strTrim.substring(1);
                            }
                            if (strTrim.length() == 0) {
                                strM29v = "";
                                if (strM29v.length() != 0 && !strM29v.contains("../") && !strM29v.startsWith("../")) {
                                    file = new File(fileM11d, strM29v);
                                    try {
                                        absoluteFile = file.getCanonicalFile();
                                    } catch (Throwable unused2) {
                                        absoluteFile = file.getAbsoluteFile();
                                    }
                                    strM10c = AbstractC0004a3.m10c(fileM11d);
                                    strM10c2 = AbstractC0004a3.m10c(absoluteFile);
                                    if (strM10c2 != null && strM10c != null) {
                                        String strReplace3 = strM10c2.replace('\\', '/');
                                        String strReplace4 = strM10c.replace('\\', '/');
                                        strReplace = strReplace4 != null ? "" : strReplace4.replace('\\', '/');
                                        if (!strReplace.endsWith("/")) {
                                            strReplace = strReplace.concat("/");
                                        }
                                        zStartsWith = strReplace3.startsWith(strReplace);
                                    }
                                    if (zStartsWith) {
                                        File parentFile = absoluteFile.getParentFile();
                                        if (parentFile != null && !parentFile.exists()) {
                                            parentFile.mkdirs();
                                        }
                                        if (absoluteFile.exists()) {
                                            File parentFile2 = absoluteFile.getParentFile();
                                            String name = absoluteFile.getName();
                                            File file3 = null;
                                            if (parentFile2 != null && name.length() != 0) {
                                                while (true) {
                                                    if (i > 9999) {
                                                        break;
                                                    }
                                                    File fileM18k = AbstractC0004a3.m18k(parentFile2, name, i);
                                                    if (!fileM18k.exists()) {
                                                        file3 = fileM18k;
                                                        break;
                                                    }
                                                    i++;
                                                }
                                            }
                                            if (file3 != null) {
                                                strM10c3 = AbstractC0004a3.m10c(file3);
                                            }
                                        } else {
                                            strM10c3 = strM10c2;
                                        }
                                        HookEntry.logAlways("legacy download redirect selected write=" + strM10c3 + " relative=" + strM29v + " old=" + strM17j);
                                    }
                                }
                            } else {
                                String lowerCase = strTrim.toLowerCase(Locale.ROOT);
                                if (!lowerCase.startsWith(".troopthumb/") && !lowerCase.startsWith("troopthumb/") && !lowerCase.contains("/.troopthumb/") && !lowerCase.contains("/troopthumb/")) {
                                    strM29v = AbstractC0004a3.m29v(AbstractC0004a3.m29v(AbstractC0004a3.m29v(strTrim, "QQfile_recv"), "MobileQQ"), "QQ");
                                    if (strM29v.startsWith(".") || strM29v.contains("/../") || strM29v.contains("../")) {
                                    }
                                    if (strM29v.length() != 0) {
                                        file = new File(fileM11d, strM29v);
                                        absoluteFile = file.getCanonicalFile();
                                        strM10c = AbstractC0004a3.m10c(fileM11d);
                                        strM10c2 = AbstractC0004a3.m10c(absoluteFile);
                                        if (strM10c2 != null) {
                                            String strReplace32 = strM10c2.replace('\\', '/');
                                            String strReplace42 = strM10c.replace('\\', '/');
                                            if (strReplace42 != null) {
                                            }
                                            if (!strReplace.endsWith("/")) {
                                            }
                                            zStartsWith = strReplace32.startsWith(strReplace);
                                        }
                                        if (zStartsWith) {
                                        }
                                    }
                                }
                            }
                        }
                    } else if (strM17j != null) {
                        String lowerCase2 = AbstractC0004a3.m17j(strM17j).toLowerCase(Locale.ROOT);
                        if (!lowerCase2.contains("/data/data/com.tencent.mobileqq/qqfile_recv/") && !lowerCase2.contains("/data/user/0/com.tencent.mobileqq/qqfile_recv/")) {
                            if (lowerCase2.contains("/android/data/com.tencent.mobileqq/")) {
                                if (lowerCase2.contains("/tencent/qqfile_recv/")) {
                                }
                            }
                        }
                    }
                }
                if (strM10c3.length() > 0) {
                    methodHookParam.setResult(strM10c3);
                }
            }
        }
    }
}
