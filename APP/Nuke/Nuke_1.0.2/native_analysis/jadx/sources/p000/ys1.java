package p000;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ys1 implements HostnameVerifier {

    /* JADX INFO: renamed from: a */
    public static final ys1 f13610a = new ys1();

    /* JADX INFO: renamed from: a */
    public static List m6322a(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && t11.m5086l(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            }
        } catch (CertificateParsingException unused) {
        }
        return be0.f819h;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m6323b(String str) {
        long j;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            C0676s.m4645c(hk1.m2208g(length2, "endIndex < beginIndex: ", " < 0"));
            return false;
        }
        if (length2 > str.length()) {
            StringBuilder sbM5695n = vi0.m5695n(length2, "endIndex > string.length: ", " > ");
            sbM5695n.append(str.length());
            throw new IllegalArgumentException(sbM5695n.toString().toString());
        }
        long j2 = 0;
        int i = 0;
        while (i < length2) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                j2++;
            } else {
                if (cCharAt < 2048) {
                    j = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    j = 3;
                } else {
                    int i2 = i + 1;
                    char cCharAt2 = i2 < length2 ? str.charAt(i2) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j2++;
                        i = i2;
                    } else {
                        j2 += 4;
                        i += 2;
                    }
                }
                j2 += j;
            }
            i++;
        }
        return length == ((int) j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00eb  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m6324c(String str, X509Certificate x509Certificate) {
        boolean zEquals;
        int length;
        str.getClass();
        if (sg3.f10139a.m3539b(str)) {
            String strM4866b = sg3.m4866b(str);
            List listM6322a = m6322a(x509Certificate, 7);
            if (!listM6322a.isEmpty()) {
                Iterator it = listM6322a.iterator();
                while (it.hasNext()) {
                    if (t11.m5086l(strM4866b, sg3.m4866b((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (m6323b(str)) {
            Locale locale = Locale.US;
            locale.getClass();
            str = str.toLowerCase(locale);
            str.getClass();
        }
        List<String> listM6322a2 = m6322a(x509Certificate, 2);
        if (!listM6322a2.isEmpty()) {
            for (String lowerCase : listM6322a2) {
                if (str.length() != 0 && !wv2.m6012d0(str, ".", false) && !wv2.m6005W(str, "..", false) && lowerCase != null && lowerCase.length() != 0 && !wv2.m6012d0(lowerCase, ".", false) && !wv2.m6005W(lowerCase, "..", false)) {
                    String strConcat = !wv2.m6005W(str, ".", false) ? str.concat(".") : str;
                    if (!wv2.m6005W(lowerCase, ".", false)) {
                        lowerCase = lowerCase.concat(".");
                    }
                    if (m6323b(lowerCase)) {
                        Locale locale2 = Locale.US;
                        locale2.getClass();
                        lowerCase = lowerCase.toLowerCase(locale2);
                        lowerCase.getClass();
                    }
                    if (!pv2.m3995h0(lowerCase, "*", false)) {
                        zEquals = strConcat.equals(lowerCase);
                    } else if (!wv2.m6012d0(lowerCase, "*.", false) || pv2.m4003p0(lowerCase, '*', 1, 4) != -1 || strConcat.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                        zEquals = false;
                    } else {
                        String strSubstring = lowerCase.substring(1);
                        if (wv2.m6005W(strConcat, strSubstring, false) && ((length = strConcat.length() - strSubstring.length()) <= 0 || pv2.m4008u0(strConcat, '.', length - 1, 4) == -1)) {
                            zEquals = true;
                        }
                    }
                    if (zEquals) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        str.getClass();
        sSLSession.getClass();
        if (m6323b(str)) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                certificate.getClass();
                return m6324c(str, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
