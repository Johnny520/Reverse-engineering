package p000;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: x0 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0525x0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m1127a(String str) {
        if (str == null) {
            return false;
        }
        int iIndexOf = str.indexOf(63);
        if (iIndexOf >= 0) {
            str = str.substring(0, iIndexOf);
        }
        int iMax = Math.max(str.lastIndexOf(47), str.lastIndexOf(92));
        if (iMax >= 0) {
            str = str.substring(iMax + 1);
        }
        String lowerCase = str.trim().toLowerCase(Locale.ROOT);
        return lowerCase.endsWith(".apk.1") || lowerCase.contains(".apk.1?");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m1128b(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.replace('\\', '/').toLowerCase(Locale.ROOT);
        return lowerCase.contains("/tencent/qqfile_recv/") || lowerCase.contains("/qqfile_recv/") || lowerCase.contains("/tencent/qqfile_recv") || lowerCase.contains("/qqfile_recv") || lowerCase.contains("/groupfile/") || lowerCase.contains("/group_file/") || lowerCase.contains("/troopfile/") || lowerCase.contains("/troop_file/") || lowerCase.contains("/file_recv/") || lowerCase.contains("/file_recv");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m1129c(String str) {
        if (str == null || !m1127a(str)) {
            return false;
        }
        String lowerCase = str.replace('\\', '/').toLowerCase(Locale.ROOT);
        return lowerCase.contains("/storage/emulated/0/download/") || lowerCase.contains("/sdcard/download/") || lowerCase.contains("/download/");
    }
}
