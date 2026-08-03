package Yue;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۥۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C4782 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String f10708 = "";

    /* JADX INFO: renamed from: ۥ */
    public Map<String, String> f1107 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۥ۟ */
    public String f1108;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static C4782 m14454(String str) {
        String strTrim;
        C4782 c4782 = new C4782();
        String[] strArrSplit = str.split(";");
        c4782.f1108 = strArrSplit[0].trim();
        for (int i = 1; i < strArrSplit.length; i++) {
            String[] strArrSplit2 = strArrSplit[i].split("=");
            if (strArrSplit2.length > 1) {
                strTrim = strArrSplit2[1].trim();
                if ((strTrim.startsWith("\"") && strTrim.endsWith("\"")) || (strTrim.startsWith("'") && strTrim.endsWith("'") && strTrim.length() > 2)) {
                    strTrim = strTrim.substring(1, strTrim.length() - 1);
                }
            } else {
                strTrim = "";
            }
            c4782.f1107.put(strArrSplit2[0].trim(), strTrim);
        }
        return c4782;
    }

    /* JADX INFO: renamed from: ۥ */
    public String m1686() {
        return this.f1108;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public Map<String, String> m1687() {
        return this.f1107;
    }
}
