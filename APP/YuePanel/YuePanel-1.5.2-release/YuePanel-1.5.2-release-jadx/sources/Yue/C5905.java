package Yue;

import android.net.Uri;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5905 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static final String f1771 = "mailto:";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String f14737 = "mailto";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final String f14738 = "to";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final String f14739 = "body";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final String f14740 = "cc";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final String f14741 = "bcc";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final String f14742 = "subject";

    /* JADX INFO: renamed from: ۥ */
    public HashMap<String, String> f1772 = new HashMap<>();

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static boolean m18470(@InterfaceC6490 Uri uri) {
        return uri != null && f14737.equals(uri.getScheme());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static boolean m18471(@InterfaceC6490 String str) {
        return str != null && str.startsWith(f1771);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static C5905 m18472(@InterfaceC6391 Uri uri) throws C6615 {
        return m18473(uri.toString());
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static C5905 m18473(@InterfaceC6391 String str) throws C6615 {
        String strDecode;
        String strSubstring;
        C6740.m21415(str);
        if (!m18471(str)) {
            throw new C6615("Not a mailto scheme");
        }
        int iIndexOf = str.indexOf(35);
        if (iIndexOf != -1) {
            str = str.substring(0, iIndexOf);
        }
        int iIndexOf2 = str.indexOf(63);
        if (iIndexOf2 == -1) {
            strDecode = Uri.decode(str.substring(7));
            strSubstring = null;
        } else {
            strDecode = Uri.decode(str.substring(7, iIndexOf2));
            strSubstring = str.substring(iIndexOf2 + 1);
        }
        C5905 c5905 = new C5905();
        if (strSubstring != null) {
            for (String str2 : strSubstring.split("&")) {
                String[] strArrSplit = str2.split("=", 2);
                if (strArrSplit.length != 0) {
                    c5905.f1772.put(Uri.decode(strArrSplit[0]).toLowerCase(Locale.ROOT), strArrSplit.length > 1 ? Uri.decode(strArrSplit[1]) : null);
                }
            }
        }
        String strM18477 = c5905.m18477();
        if (strM18477 != null) {
            strDecode = strDecode + ", " + strM18477;
        }
        c5905.f1772.put(f14738, strDecode);
        return c5905;
    }

    @InterfaceC6391
    public String toString() {
        StringBuilder sb = new StringBuilder(f1771);
        sb.append('?');
        for (Map.Entry<String, String> entry : this.f1772.entrySet()) {
            sb.append(Uri.encode(entry.getKey()));
            sb.append(SignatureVisitor.INSTANCEOF);
            sb.append(Uri.encode(entry.getValue()));
            sb.append(C8039.f23874);
        }
        return sb.toString();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ */
    public String m2579() {
        return this.f1772.get(f14741);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟ */
    public String m2580() {
        return this.f1772.get(f14739);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public String m18474() {
        return this.f1772.get(f14740);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Map<String, String> m18475() {
        return this.f1772;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public String m18476() {
        return this.f1772.get(f14742);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public String m18477() {
        return this.f1772.get(f14738);
    }
}
