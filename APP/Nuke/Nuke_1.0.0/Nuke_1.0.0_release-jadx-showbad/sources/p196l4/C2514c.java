package p196l4;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import p011B4.AbstractC0231b;
import p061L2.C0981u;
import p117X2.AbstractC1665j;
import p117X2.C1675t;
import p123Y3.AbstractC1773d;
import p149d3.AbstractC1976d;
import p149d3.AbstractC1983k;

/* JADX INFO: renamed from: l4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2514c implements HostnameVerifier {

    /* JADX INFO: renamed from: a */
    public static final C2514c f8034a = new C2514c();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static List m4462a(X509Certificate x509Certificate, int i5) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && AbstractC1665j.m2981a(list.get(0), Integer.valueOf(i5)) && (obj = list.get(1)) != null) {
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            }
        } catch (CertificateParsingException unused) {
        }
        return C0981u.f3047d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m4463b(String str) {
        int i5;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(AbstractC0231b.m397h(length2, "endIndex < beginIndex: ", " < 0").toString());
        }
        if (length2 > str.length()) {
            StringBuilder sbM404o = AbstractC0231b.m404o(length2, "endIndex > string.length: ", " > ");
            sbM404o.append(str.length());
            throw new IllegalArgumentException(sbM404o.toString().toString());
        }
        long j5 = 0;
        int i6 = 0;
        while (i6 < length2) {
            char cCharAt = str.charAt(i6);
            if (cCharAt < 128) {
                j5++;
            } else {
                if (cCharAt < 2048) {
                    i5 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i5 = 3;
                } else {
                    int i7 = i6 + 1;
                    char cCharAt2 = i7 < length2 ? str.charAt(i7) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j5++;
                        i6 = i7;
                    } else {
                        j5 += (long) 4;
                        i6 += 2;
                    }
                }
                j5 += (long) i5;
            }
            i6++;
        }
        return length == ((int) j5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fe  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m4464c(String str, X509Certificate x509Certificate) {
        boolean zM2981a;
        int length;
        AbstractC1665j.m2985e(str, "host");
        C1675t c1675t = AbstractC1773d.f6071a;
        C1675t c1675t2 = AbstractC1773d.f6071a;
        c1675t2.getClass();
        if (((Pattern) c1675t2.f5710e).matcher(str).matches()) {
            String strM3159b = AbstractC1773d.m3159b(str);
            List listM4462a = m4462a(x509Certificate, 7);
            if (!listM4462a.isEmpty()) {
                Iterator it = listM4462a.iterator();
                while (it.hasNext()) {
                    if (AbstractC1665j.m2981a(strM3159b, AbstractC1773d.m3159b((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (m4463b(str)) {
            Locale locale = Locale.US;
            AbstractC1665j.m2984d(locale, "US");
            str = str.toLowerCase(locale);
            AbstractC1665j.m2984d(str, "toLowerCase(...)");
        }
        List<String> listM4462a2 = m4462a(x509Certificate, 2);
        if (!listM4462a2.isEmpty()) {
            for (String lowerCase : listM4462a2) {
                if (str.length() != 0 && !AbstractC1983k.m3656S(str, ".", false) && !str.endsWith("..") && lowerCase != null && lowerCase.length() != 0 && !AbstractC1983k.m3656S(lowerCase, ".", false) && !lowerCase.endsWith("..")) {
                    String strConcat = !str.endsWith(".") ? str.concat(".") : str;
                    if (!lowerCase.endsWith(".")) {
                        lowerCase = lowerCase.concat(".");
                    }
                    if (m4463b(lowerCase)) {
                        Locale locale2 = Locale.US;
                        AbstractC1665j.m2984d(locale2, "US");
                        lowerCase = lowerCase.toLowerCase(locale2);
                        AbstractC1665j.m2984d(lowerCase, "toLowerCase(...)");
                    }
                    if (!AbstractC1976d.m3629W(lowerCase, "*")) {
                        zM2981a = AbstractC1665j.m2981a(strConcat, lowerCase);
                    } else if (!AbstractC1983k.m3656S(lowerCase, "*.", false) || AbstractC1976d.m3634b0(lowerCase, '*', 1, 4) != -1 || strConcat.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                        zM2981a = false;
                    } else {
                        String strSubstring = lowerCase.substring(1);
                        AbstractC1665j.m2984d(strSubstring, "substring(...)");
                        if (strConcat.endsWith(strSubstring) && ((length = strConcat.length() - strSubstring.length()) <= 0 || AbstractC1976d.m3639g0(strConcat, '.', length - 1, 4) == -1)) {
                            zM2981a = true;
                        }
                    }
                    if (zM2981a) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        AbstractC1665j.m2985e(str, "host");
        AbstractC1665j.m2985e(sSLSession, "session");
        if (m4463b(str)) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                AbstractC1665j.m2983c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return m4464c(str, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
