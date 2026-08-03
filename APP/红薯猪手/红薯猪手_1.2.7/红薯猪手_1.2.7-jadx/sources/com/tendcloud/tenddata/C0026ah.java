package com.tendcloud.tenddata;

import java.io.ByteArrayInputStream;
import java.net.URLConnection;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: com.tendcloud.tenddata.ah */
/* JADX INFO: loaded from: classes.dex */
public final class C0026ah {

    /* JADX INFO: renamed from: a */
    public static volatile HashMap<Long, String> f161a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    private static final Pattern f162b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* JADX INFO: renamed from: c */
    private static final int f163c = 2;

    /* JADX INFO: renamed from: d */
    private static final int f164d = 7;

    /* JADX INFO: renamed from: com.tendcloud.tenddata.ah$a */
    public static class a implements X509TrustManager {
        public X509Certificate cert;

        public a(X509Certificate x509Certificate) {
            this.cert = x509Certificate;
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
            int iIndexOf;
            int length = x509CertificateArr.length;
            x509CertificateArr[0].getIssuerDN().equals(this.cert.getSubjectDN());
            try {
                String name = x509CertificateArr[0].getSubjectDN().getName();
                int iIndexOf2 = name.indexOf("CN=");
                if (iIndexOf2 >= 0 && (iIndexOf = (name = name.substring(iIndexOf2 + 3)).indexOf(",")) >= 0) {
                    name = name.substring(0, iIndexOf);
                }
                String[] strArrSplit = name.split("\\.");
                if (strArrSplit.length >= 2) {
                    name = strArrSplit[strArrSplit.length - 2] + "." + strArrSplit[strArrSplit.length - 1];
                }
                if (!C0026ah.f161a.containsKey(Long.valueOf(Thread.currentThread().getId()))) {
                    throw new CertificateException("No valid host provided!");
                }
                if (!C0026ah.f161a.get(Long.valueOf(Thread.currentThread().getId())).endsWith(name)) {
                    throw new CertificateException("Server certificate has incorrect host name!");
                }
                x509CertificateArr[0].verify(this.cert.getPublicKey());
                x509CertificateArr[0].checkValidity();
            } catch (Throwable th) {
                boolean z = th instanceof CertificateException;
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static X509Certificate m100a(String str) {
        if (C0131y.m767b(str)) {
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes());
        try {
            try {
                X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(byteArrayInputStream);
                try {
                    byteArrayInputStream.close();
                } catch (Throwable unused) {
                }
                return x509Certificate;
            } catch (Throwable unused2) {
                byteArrayInputStream.close();
                return null;
            }
        } catch (Throwable unused3) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static List<String> m101a(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return Collections.emptyList();
        }
    }

    /* JADX INFO: renamed from: a */
    public static SSLSocketFactory m102a(X509Certificate x509Certificate) {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            if (x509Certificate != null) {
                sSLContext.init(null, new TrustManager[]{new a(x509Certificate)}, null);
            } else {
                sSLContext.init(null, null, null);
            }
            return sSLContext.getSocketFactory();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m103a(URLConnection uRLConnection, String str) {
        try {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
            SSLContext sSLContext = SSLContext.getInstance(C0131y.m754a(16) ? "TLSv1.2" : "TLSv1");
            sSLContext.init(null, new TrustManager[]{new a(m100a(str))}, null);
            httpsURLConnection.getHostnameVerifier();
            httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
            m104a(httpsURLConnection);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m104a(HttpsURLConnection httpsURLConnection) {
    }

    /* JADX INFO: renamed from: a */
    private static boolean m105a(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str + '.';
            }
            if (!str2.endsWith(".")) {
                str2 = str2 + '.';
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String strSubstring = lowerCase.substring(1);
            if (!str.endsWith(strSubstring)) {
                return false;
            }
            int length = str.length() - strSubstring.length();
            return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m106a(String str, X509Certificate x509Certificate) {
        return m108b(str) ? m109b(str, x509Certificate) : m111c(str, x509Certificate);
    }

    /* JADX INFO: renamed from: b */
    private static boolean m108b(String str) {
        return f162b.matcher(str).matches();
    }

    /* JADX INFO: renamed from: b */
    private static boolean m109b(String str, X509Certificate x509Certificate) {
        List<String> listM101a = m101a(x509Certificate, 7);
        int size = listM101a.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase(listM101a.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static boolean m110b(String str, SSLSession sSLSession) {
        try {
            return m106a(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    private static boolean m111c(String str, X509Certificate x509Certificate) {
        String lowerCase = str.toLowerCase(Locale.US);
        List<String> listM101a = m101a(x509Certificate, 2);
        int size = listM101a.size();
        for (int i = 0; i < size; i++) {
            if (m105a(lowerCase, listM101a.get(i))) {
                return true;
            }
        }
        return false;
    }

    public static void setHostNameVerifyAllowAll(URLConnection uRLConnection) {
        final HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnection;
        httpsURLConnection.setHostnameVerifier(new HostnameVerifier() { // from class: com.tendcloud.tenddata.ah.1
            @Override // javax.net.ssl.HostnameVerifier
            public boolean verify(String str, SSLSession sSLSession) {
                try {
                    if (C0026ah.m110b(str, sSLSession)) {
                        return true;
                    }
                    return str.equals(httpsURLConnection.getURL().getHost());
                } catch (Throwable unused) {
                    return false;
                }
            }
        });
    }
}
