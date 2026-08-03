package Yue;

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
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥۡۢۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nOkHostnameVerifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHostnameVerifier.kt\nokhttp3/internal/tls/OkHostnameVerifier\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,208:1\n1747#2,3:209\n1747#2,3:212\n*S KotlinDebug\n*F\n+ 1 OkHostnameVerifier.kt\nokhttp3/internal/tls/OkHostnameVerifier\n*L\n63#1:209,3\n71#1:212,3\n*E\n"})
public final class C6502 implements HostnameVerifier {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C6502 f2116 = new C6502();

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f2117 = 2;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f16675 = 7;

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(@InterfaceC6399 String str, @InterfaceC6399 SSLSession sSLSession) {
        C5499.m17103(str, C5368.f13117);
        C5499.m17103(sSLSession, "session");
        if (!m20596(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            C5499.m17101(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return m20597(str, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public final List<String> m2997(@InterfaceC6399 X509Certificate x509Certificate) {
        C5499.m17103(x509Certificate, "certificate");
        return C3888.m10993(m20595(x509Certificate, 7), m20595(x509Certificate, 2));
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final String m2998(String str) {
        if (!m20596(str)) {
            return str;
        }
        Locale locale = Locale.US;
        C5499.m17102(locale, "US");
        String lowerCase = str.toLowerCase(locale);
        C5499.m17102(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final List<String> m20595(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return C3880.m10735();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && C5499.m17094(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return C3880.m10735();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final boolean m20596(String str) {
        return str.length() == ((int) C8149.m26818(str, 0, 0, 3, null));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final boolean m20597(@InterfaceC6399 String str, @InterfaceC6399 X509Certificate x509Certificate) {
        C5499.m17103(str, C5368.f13117);
        C5499.m17103(x509Certificate, "certificate");
        return C8158.m26840(str) ? m20600(str, x509Certificate) : m20599(str, x509Certificate);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final boolean m20598(String str, String str2) {
        if (str != null && str.length() != 0 && !C7627.m24008(str, ".", false, 2, null) && !C7627.m23973(str, "..", false, 2, null) && str2 != null && str2.length() != 0 && !C7627.m24008(str2, ".", false, 2, null) && !C7627.m23973(str2, "..", false, 2, null)) {
            if (!C7627.m23973(str, ".", false, 2, null)) {
                str = str + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
            }
            String str3 = str;
            if (!C7627.m23973(str2, ".", false, 2, null)) {
                str2 = str2 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
            }
            String strM2998 = m2998(str2);
            if (!C7628.m24035(strM2998, InterfaceC5949.f14892, false, 2, null)) {
                return C5499.m17094(str3, strM2998);
            }
            if (!C7627.m24008(strM2998, "*.", false, 2, null) || C7628.m24056(strM2998, TypePool.Default.LazyTypeDescription.GenericTypeToken.WILDCARD_TYPE_PATH, 1, false, 4, null) != -1 || str3.length() < strM2998.length() || C5499.m17094("*.", strM2998)) {
                return false;
            }
            String strSubstring = strM2998.substring(1);
            C5499.m17102(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (!C7627.m23973(str3, strSubstring, false, 2, null)) {
                return false;
            }
            int length = str3.length() - strSubstring.length();
            return length <= 0 || C7628.m24070(str3, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, length + (-1), false, 4, null) == -1;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final boolean m20599(String str, X509Certificate x509Certificate) {
        String strM2998 = m2998(str);
        List<String> listM20595 = m20595(x509Certificate, 2);
        if ((listM20595 instanceof Collection) && listM20595.isEmpty()) {
            return false;
        }
        Iterator<T> it = listM20595.iterator();
        while (it.hasNext()) {
            if (f2116.m20598(strM2998, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m20600(String str, X509Certificate x509Certificate) {
        String strM16319 = C5317.m16319(str);
        List<String> listM20595 = m20595(x509Certificate, 7);
        if ((listM20595 instanceof Collection) && listM20595.isEmpty()) {
            return false;
        }
        Iterator<T> it = listM20595.iterator();
        while (it.hasNext()) {
            if (C5499.m17094(strM16319, C5317.m16319((String) it.next()))) {
                return true;
            }
        }
        return false;
    }
}
