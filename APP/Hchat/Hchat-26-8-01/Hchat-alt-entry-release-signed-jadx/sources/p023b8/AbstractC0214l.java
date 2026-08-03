package p023b8;

/* JADX INFO: renamed from: b8.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0214l {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f522a = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        System.getProperty("com.reandroid.xml.KeepCharsetEncoding");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m892a(String str) {
        if (str == null) {
            return null;
        }
        int iLastIndexOf = str.lastIndexOf(58);
        if (iLastIndexOf >= 0) {
            str = str.substring(iLastIndexOf + 1);
        }
        String strTrim = str.trim();
        if (strTrim.length() == 0) {
            return null;
        }
        return strTrim;
    }
}
