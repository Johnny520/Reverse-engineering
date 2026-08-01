package p196l4;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import p011B4.AbstractC0231b;
import p061L2.C0981u;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: l4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2514c implements HostnameVerifier {

    /* JADX INFO: renamed from: a */
    public static final C2514c f8034a = new C2514c();

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

    /* JADX WARN: Removed duplicated region for block: B:59:0x00fe  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m4464c(java.lang.String r11, java.security.cert.X509Certificate r12) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p196l4.C2514c.m4464c(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

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
