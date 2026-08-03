package io.sentry.transport;

import io.sentry.C2001s2;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.EnumC1929n;
import io.sentry.ILogger;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.util.AbstractC2038j;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import p000.AbstractC2374ph;

/* JADX INFO: renamed from: io.sentry.transport.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2010e {

    /* JADX INFO: renamed from: e */
    public static final Charset f7189e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final Proxy f7190a;

    /* JADX INFO: renamed from: b */
    public final C1901c f7191b;

    /* JADX INFO: renamed from: c */
    public final C2046v2 f7192c;

    /* JADX INFO: renamed from: d */
    public final C2021p f7193d;

    public C2010e(C2046v2 c2046v2, C1901c c1901c, C2021p c2021p) {
        Proxy proxy;
        this.f7191b = c1901c;
        this.f7192c = c2046v2;
        this.f7193d = c2021p;
        C2001s2 proxy2 = c2046v2.getProxy();
        if (proxy2 != null) {
            String str = proxy2.f7169b;
            try {
                proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxy2.f7168a, Integer.parseInt(str)));
            } catch (NumberFormatException e) {
                this.f7192c.getLogger().mo3682n(EnumC1657a2.ERROR, e, AbstractC2374ph.m4814k("Failed to parse Sentry Proxy port: ", str, ". Proxy is ignored"), new Object[0]);
                proxy = null;
            }
        } else {
            proxy = null;
        }
        this.f7190a = proxy;
        if (proxy == null || c2046v2.getProxy() == null) {
            return;
        }
        String str2 = c2046v2.getProxy().f7170c;
        String str3 = c2046v2.getProxy().f7171d;
        if (str2 == null || str3 == null) {
            return;
        }
        Authenticator.setDefault(new C2017l(str2, str3));
    }

    /* JADX INFO: renamed from: a */
    public static void m4164a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m4165b(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader;
        StringBuilder sb;
        boolean z;
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f7189e));
                try {
                    sb = new StringBuilder();
                    z = true;
                } finally {
                }
            } finally {
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                if (!z) {
                    sb.append("\n");
                }
                sb.append(line);
                z = false;
            }
            String string = sb.toString();
            bufferedReader.close();
            if (errorStream != null) {
                errorStream.close();
            }
            return string;
        } catch (IOException unused) {
            return "Failed to obtain error message while analyzing send failure.";
        }
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC1856a m4166c(HttpURLConnection httpURLConnection) {
        C2046v2 c2046v2 = this.f7192c;
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                m4168e(httpURLConnection, responseCode);
                if (responseCode == 200) {
                    c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Envelope sent successfully.", new Object[0]);
                    return C2024s.f7212a;
                }
                ILogger logger = c2046v2.getLogger();
                EnumC1657a2 enumC1657a2 = EnumC1657a2.ERROR;
                logger.mo3680e(enumC1657a2, "Request failed, API returned %s", Integer.valueOf(responseCode));
                if (c2046v2.isDebug()) {
                    c2046v2.getLogger().mo3680e(enumC1657a2, "%s", m4165b(httpURLConnection));
                }
                return new C2023r(responseCode);
            } catch (IOException e) {
                c2046v2.getLogger().mo3682n(EnumC1657a2.ERROR, e, "Error reading and logging the response stream", new Object[0]);
                m4164a(httpURLConnection);
                return new C2023r(-1);
            }
        } finally {
            m4164a(httpURLConnection);
        }
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC1856a m4167d(C1901c c1901c) {
        C2046v2 c2046v2 = this.f7192c;
        c2046v2.getSocketTagger().mo3746b();
        C1901c c1901c2 = this.f7191b;
        URL url = (URL) c1901c2.f6781b;
        Proxy proxy = this.f7190a;
        HttpURLConnection httpURLConnection = (HttpURLConnection) (proxy == null ? url.openConnection() : url.openConnection(proxy));
        for (Map.Entry entry : ((HashMap) c1901c2.f6782c).entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Connection", "close");
        httpURLConnection.setConnectTimeout(c2046v2.getConnectionTimeoutMillis());
        httpURLConnection.setReadTimeout(c2046v2.getReadTimeoutMillis());
        SSLSocketFactory sslSocketFactory = c2046v2.getSslSocketFactory();
        if ((httpURLConnection instanceof HttpsURLConnection) && sslSocketFactory != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sslSocketFactory);
        }
        httpURLConnection.connect();
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    c2046v2.getSerializer().mo3611e(c1901c, gZIPOutputStream);
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } finally {
                }
            } finally {
            }
        } finally {
            try {
            } finally {
            }
        }
        return m4166c(httpURLConnection);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea A[PHI: r1
  0x00ea: PHI (r1v7 java.lang.String[]) = (r1v5 java.lang.String[]), (r1v8 java.lang.String[]) binds: [B:14:0x0050, B:73:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4168e(HttpURLConnection httpURLConnection, int i) {
        long j;
        String[] strArr;
        double d;
        long j2;
        String[] strArr2;
        String string;
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        String headerField2 = httpURLConnection.getHeaderField("X-Sentry-Rate-Limits");
        C2021p c2021p = this.f7193d;
        C2046v2 c2046v2 = c2021p.f7205b;
        C2009d c2009d = c2021p.f7204a;
        double d2 = 1000.0d;
        if (headerField2 == null) {
            if (i == 429) {
                if (headerField != null) {
                    try {
                        j = (long) (Double.parseDouble(headerField) * 1000.0d);
                    } catch (NumberFormatException unused) {
                        j = 60000;
                    }
                } else {
                    j = 60000;
                }
                c2009d.getClass();
                c2021p.m4169d(EnumC1929n.All, new Date(System.currentTimeMillis() + j));
                return;
            }
            return;
        }
        int i2 = -1;
        String[] strArrSplit = headerField2.split(",", -1);
        int length = strArrSplit.length;
        int i3 = 0;
        int i4 = 0;
        while (i4 < length) {
            String[] strArrSplit2 = strArrSplit[i4].replace(" ", "").split(":", i2);
            if (strArrSplit2.length > 0) {
                String str = strArrSplit2[i3];
                if (str != null) {
                    try {
                        j2 = (long) (Double.parseDouble(str) * d2);
                        d = d2;
                    } catch (NumberFormatException unused2) {
                        d = d2;
                        j2 = 60000;
                    }
                    if (strArrSplit2.length <= 1) {
                        String str2 = strArrSplit2[1];
                        c2009d.getClass();
                        Date date = new Date(System.currentTimeMillis() + j2);
                        if (str2 == null || str2.isEmpty()) {
                            strArr = strArrSplit;
                            c2021p.m4169d(EnumC1929n.All, date);
                        } else {
                            String[] strArrSplit3 = str2.split(";", i2);
                            int length2 = strArrSplit3.length;
                            int i5 = i3;
                            while (i5 < length2) {
                                String str3 = strArrSplit3[i5];
                                EnumC1929n enumC1929nValueOf = EnumC1929n.Unknown;
                                try {
                                    Charset charset = AbstractC2038j.f7226a;
                                    if (str3 == null || str3.isEmpty()) {
                                        string = str3;
                                    } else {
                                        String[] strArrSplit4 = AbstractC2038j.f7227b.split(str3, i2);
                                        StringBuilder sb = new StringBuilder();
                                        for (String str4 : strArrSplit4) {
                                            sb.append(AbstractC2038j.m4182a(str4));
                                        }
                                        string = sb.toString();
                                    }
                                    if (string != null) {
                                        enumC1929nValueOf = EnumC1929n.valueOf(string);
                                        strArr2 = strArrSplit;
                                    } else {
                                        strArr2 = strArrSplit;
                                        try {
                                            c2046v2.getLogger().mo3680e(EnumC1657a2.ERROR, "Couldn't capitalize: %s", str3);
                                        } catch (IllegalArgumentException e) {
                                            e = e;
                                            c2046v2.getLogger().mo3682n(EnumC1657a2.INFO, e, "Unknown category: %s", str3);
                                        }
                                    }
                                } catch (IllegalArgumentException e2) {
                                    e = e2;
                                    strArr2 = strArrSplit;
                                }
                                if (!EnumC1929n.Unknown.equals(enumC1929nValueOf)) {
                                    c2021p.m4169d(enumC1929nValueOf, date);
                                }
                                i5++;
                                strArrSplit = strArr2;
                                i2 = -1;
                            }
                            strArr = strArrSplit;
                        }
                    } else {
                        strArr = strArrSplit;
                    }
                } else {
                    d = d2;
                    j2 = 60000;
                    if (strArrSplit2.length <= 1) {
                    }
                }
            } else {
                strArr = strArrSplit;
                d = d2;
            }
            i4++;
            d2 = d;
            strArrSplit = strArr;
            i2 = -1;
            i3 = 0;
        }
    }
}
