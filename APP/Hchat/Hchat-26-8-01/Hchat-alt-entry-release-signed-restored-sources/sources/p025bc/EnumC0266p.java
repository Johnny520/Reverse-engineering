package p025bc;

import java.util.HashMap;
import java.util.Locale;
import p012ah.C0086a;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: bc.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0266p {
    /* JADX INFO: Fake field, exist only in values array */
    CODE(".dex", ".jar", ".class"),
    XML(".xml"),
    ARSC(".arsc"),
    /* JADX INFO: Fake field, exist only in values array */
    APK(".apk", ".apkm", ".apks"),
    /* JADX INFO: Fake field, exist only in values array */
    FONT(".ttf", ".ttc", ".otf"),
    /* JADX INFO: Fake field, exist only in values array */
    IMG(".png", ".gif", ".jpg", ".jpeg", ".webp", ".bmp", ".tiff"),
    /* JADX INFO: Fake field, exist only in values array */
    ARCHIVE(".zip", ".rar", ".7zip", ".7z", ".arj", ".tar", ".gzip", ".bzip", ".bzip2", ".cab", ".cpio", ".ar", ".gz", ".tgz", ".bz2"),
    /* JADX INFO: Fake field, exist only in values array */
    VIDEOS(".mp4", ".mkv", ".webm", ".avi", ".flv", ".3gp"),
    /* JADX INFO: Fake field, exist only in values array */
    SOUNDS(".aac", ".ogg", ".opus", ".mp3", ".wav", ".wma", ".mid", ".midi"),
    /* JADX INFO: Fake field, exist only in values array */
    JSON(".json"),
    /* JADX INFO: Fake field, exist only in values array */
    TEXT(".txt", ".ini", ".conf", ".yaml", ".properties", ".js", ".java", ".kt", ".md"),
    /* JADX INFO: Fake field, exist only in values array */
    HTML(".html", ".htm"),
    /* JADX INFO: Fake field, exist only in values array */
    LIB(".so"),
    MANIFEST(new String[0]),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_BIN(".bin"),
    UNKNOWN(new String[0]);


    /* JADX INFO: renamed from: l */
    public static final HashMap f790l = new HashMap();

    /* JADX INFO: renamed from: g */
    public final String[] f792g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        for (EnumC0266p enumC0266p : values()) {
            for (String str : enumC0266p.f792g) {
                if (((EnumC0266p) f790l.put(str, enumC0266p)) != null) {
                    C0086a.m452k(AbstractC4855en.m9263g("Duplicate extension in ResourceType: ", str));
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    EnumC0266p(String... strArr) {
        this.f792g = strArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static EnumC0266p m1046a(String str) {
        if (str.endsWith("/resources.pb")) {
            return ARSC;
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            EnumC0266p enumC0266p = (EnumC0266p) f790l.get(str.substring(iLastIndexOf).toLowerCase(Locale.ROOT));
            if (enumC0266p != null) {
                return (enumC0266p == XML && str.equals("AndroidManifest.xml")) ? MANIFEST : enumC0266p;
            }
        }
        return UNKNOWN;
    }
}
