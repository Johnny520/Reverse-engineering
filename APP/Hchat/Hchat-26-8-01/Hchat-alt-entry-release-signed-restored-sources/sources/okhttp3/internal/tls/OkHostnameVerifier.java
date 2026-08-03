package okhttp3.internal.tls;

import gg.AbstractC1416l;
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
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okio.Utf8;
import p136j8.AbstractC2091b;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private OkHostnameVerifier() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final String asciiToLowercase(String str) {
        if (!isAscii(str)) {
            return str;
        }
        Locale locale = Locale.US;
        return AbstractC2091b.m5165l(locale, str, locale);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final List<String> getSubjectAltNames(X509Certificate x509Certificate, int i9) {
        Object obj;
        C4173t c4173t = C4173t.f13710g;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return c4173t;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && AbstractC1416l.m3825a(list.get(0), Integer.valueOf(i9)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return c4173t;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean isAscii(String str) {
        return str.length() == ((int) Utf8.size$default(str, 0, 0, 3, null));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean verifyHostname(String str, String str2) {
        int length;
        if (str != null && str.length() != 0 && !AbstractC3156t.m6740d0(str, ".", false) && !AbstractC3156t.m6733W(str, "..", false) && str2 != null && str2.length() != 0 && !AbstractC3156t.m6740d0(str2, ".", false) && !AbstractC3156t.m6733W(str2, "..", false)) {
            if (!AbstractC3156t.m6733W(str, ".", false)) {
                str = str.concat(".");
            }
            if (!AbstractC3156t.m6733W(str2, ".", false)) {
                str2 = str2.concat(".");
            }
            String strAsciiToLowercase = asciiToLowercase(str2);
            if (!AbstractC3149m.m6709h0(strAsciiToLowercase, "*", false)) {
                return str.equals(strAsciiToLowercase);
            }
            if (AbstractC3156t.m6740d0(strAsciiToLowercase, "*.", false) && AbstractC3149m.m6718q0(strAsciiToLowercase, '*', 1, 4) == -1 && str.length() >= strAsciiToLowercase.length() && !"*.".equals(strAsciiToLowercase)) {
                String strSubstring = strAsciiToLowercase.substring(1);
                if (AbstractC3156t.m6733W(str, strSubstring, false) && ((length = str.length() - strSubstring.length()) <= 0 || AbstractC3149m.m6724w0(str, '.', length - 1, 4) == -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean verifyIpAddress(String str, X509Certificate x509Certificate) {
        String canonicalHost = HostnamesKt.toCanonicalHost(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        if (subjectAltNames != null && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (AbstractC1416l.m3825a(canonicalHost, HostnamesKt.toCanonicalHost((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List<String> allSubjectAltNames(X509Certificate x509Certificate) {
        x509Certificate.getClass();
        return AbstractC4166m.m8397F1(getSubjectAltNames(x509Certificate, 7), getSubjectAltNames(x509Certificate, 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        str.getClass();
        sSLSession.getClass();
        if (!isAscii(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            certificate.getClass();
            return verify(str, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }

    public final boolean verify(String str, X509Certificate x509Certificate) {
        str.getClass();
        x509Certificate.getClass();
        return Util.canParseAsIpAddress(str) ? verifyIpAddress(str, x509Certificate) : verifyHostname(str, x509Certificate);
    }

    private final boolean verifyHostname(String str, X509Certificate x509Certificate) {
        String strAsciiToLowercase = asciiToLowercase(str);
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 2);
        if (subjectAltNames != null && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (INSTANCE.verifyHostname(strAsciiToLowercase, (String) it.next())) {
                return true;
            }
        }
        return false;
    }
}
