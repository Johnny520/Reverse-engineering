package yyds;

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

/* JADX INFO: renamed from: yyds.ᲈᲀᛷᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2745 implements HostnameVerifier {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C2745 f13458 = new C2745();

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static List m4869(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && AbstractC1544.m3188(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            }
        } catch (CertificateParsingException unused) {
        }
        return C1860.f9345;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static boolean m4870(String str) {
        long j;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            C1693.m3439("endIndex < beginIndex: ", length2, " < 0");
            return false;
        }
        if (length2 > str.length()) {
            C0188.m790("endIndex > string.length: ", length2, " > ", str.length());
            return false;
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

    /* JADX WARN: Removed duplicated region for block: B:59:0x00e1  */
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m4871(String str, X509Certificate x509Certificate) {
        boolean zEquals;
        int length;
        if (AbstractC0425.f2171.f548.matcher(str).matches()) {
            String strM1185 = AbstractC0425.m1185(str);
            List listM4869 = m4869(x509Certificate, 7);
            if (!listM4869.isEmpty()) {
                Iterator it = listM4869.iterator();
                while (it.hasNext()) {
                    if (AbstractC1544.m3188(strM1185, AbstractC0425.m1185((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (m4870(str)) {
            str = str.toLowerCase(Locale.US);
        }
        List<String> listM48692 = m4869(x509Certificate, 2);
        if (!listM48692.isEmpty()) {
            for (String lowerCase : listM48692) {
                if (str.length() != 0 && !str.startsWith(".") && !AbstractC0692.m1600(str, "..", false) && lowerCase != null && lowerCase.length() != 0 && !lowerCase.startsWith(".") && !AbstractC0692.m1600(lowerCase, "..", false)) {
                    String strConcat = !AbstractC0692.m1600(str, ".", false) ? str.concat(".") : str;
                    if (!AbstractC0692.m1600(lowerCase, ".", false)) {
                        lowerCase = lowerCase.concat(".");
                    }
                    if (m4870(lowerCase)) {
                        lowerCase = lowerCase.toLowerCase(Locale.US);
                    }
                    if (!AbstractC0473.m1301(lowerCase, "*", false)) {
                        zEquals = strConcat.equals(lowerCase);
                    } else if (!lowerCase.startsWith("*.") || AbstractC0473.m1290(lowerCase, '*', 1, 4) != -1 || strConcat.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                        zEquals = false;
                    } else {
                        String strSubstring = lowerCase.substring(1);
                        if (AbstractC0692.m1600(strConcat, strSubstring, false) && ((length = strConcat.length() - strSubstring.length()) <= 0 || AbstractC0473.m1307(strConcat, '.', length - 1, 4) == -1)) {
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
        if (m4870(str)) {
            try {
                return m4871(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
