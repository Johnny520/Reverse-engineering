package com.tendcloud.tenddata;

import android.os.SystemClock;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import p001.C0167c4;

/* JADX INFO: renamed from: com.tendcloud.tenddata.am */
/* JADX INFO: loaded from: classes.dex */
final class C0031am {

    /* JADX INFO: renamed from: a */
    private static final int f182a = 15000;

    /* JADX INFO: renamed from: b */
    private static final int f183b = 15000;

    /* JADX INFO: renamed from: c */
    private URL f184c;

    /* JADX INFO: renamed from: d */
    private EnumC0035aq f185d;

    /* JADX INFO: renamed from: e */
    private C0034ap f186e;

    /* JADX INFO: renamed from: f */
    private C0032an f187f;

    /* JADX INFO: renamed from: g */
    private String f188g;

    /* JADX INFO: renamed from: h */
    private String f189h;

    /* JADX INFO: renamed from: i */
    private String f190i;

    /* JADX INFO: renamed from: j */
    private int f191j;

    /* JADX INFO: renamed from: k */
    private int f192k;

    /* JADX INFO: renamed from: com.tendcloud.tenddata.am$a */
    public static final class a {
        private C0032an body;
        private String cert;
        private C0034ap headers;
        private String host;

        /* JADX INFO: renamed from: ip */
        private String f193ip;
        private EnumC0035aq method;
        private URL url;
        private int connectionTimeout = 15000;
        private int readTimeout = 15000;

        public a body(C0032an c0032an) {
            this.body = c0032an;
            return this;
        }

        public C0031am build() {
            return new C0031am(this.url, this.method, this.headers, this.body, this.connectionTimeout, this.readTimeout, this.cert, this.host, this.f193ip);
        }

        public a cert(String str) {
            this.cert = str;
            return this;
        }

        public a connectionTimeout(int i) {
            this.connectionTimeout = i;
            return this;
        }

        public a header(C0034ap c0034ap) {
            this.headers = c0034ap;
            return this;
        }

        public a host(String str) {
            this.host = str;
            return this;
        }

        /* JADX INFO: renamed from: ip */
        public a m137ip(String str) {
            this.f193ip = str;
            return this;
        }

        public a method(EnumC0035aq enumC0035aq) {
            this.method = enumC0035aq;
            return this;
        }

        public a readTimeout(int i) {
            this.readTimeout = i;
            return this;
        }

        public a url(String str) {
            try {
                this.url = new URL(str);
                return this;
            } catch (MalformedURLException e) {
                throw new IllegalArgumentException(e);
            }
        }
    }

    private C0031am(URL url, EnumC0035aq enumC0035aq, C0034ap c0034ap, C0032an c0032an, int i, int i2, String str, String str2, String str3) {
        this.f184c = url;
        this.f185d = enumC0035aq;
        this.f186e = c0034ap;
        this.f187f = c0032an;
        this.f191j = i;
        this.f192k = i2;
        this.f188g = str;
        this.f189h = str2;
        this.f190i = str3;
    }

    /* JADX INFO: renamed from: a */
    public EnumC0035aq m133a() {
        return this.f185d;
    }

    /* JADX INFO: renamed from: a */
    public C0036ar m134a(AbstractC0018a abstractC0018a) {
        C0036ar c0036arM208a = C0036ar.m208a("");
        try {
            c0036arM208a = m135a(false);
            URL url = this.f184c;
            String str = this.f189h;
            if (abstractC0018a.name().equals("SDK") && c0036arM208a.m212b() == C0036ar.m206a()) {
                C0027ai.m114a(str);
                int i = 0;
                while (true) {
                    if (i > C0027ai.f165a.size()) {
                        break;
                    }
                    String strM112a = C0027ai.m112a();
                    this.f189h = strM112a;
                    URL urlM113a = C0027ai.m113a(url, strM112a);
                    this.f184c = urlM113a;
                    if (url.equals(urlM113a) && str.equals(this.f189h)) {
                        break;
                    }
                    c0036arM208a = m135a(false);
                    C0027ai.m114a(this.f189h);
                    if (c0036arM208a.m212b() != C0036ar.m206a()) {
                        C0125s.m726a(C0020ab.f132g, C0020ab.f148w, C0020ab.f93C, this.f184c.toString());
                        C0125s.m726a(C0020ab.f132g, C0020ab.f148w, C0020ab.f94D, this.f189h);
                        break;
                    }
                    i++;
                }
            }
            C0029ak.m128b(this.f189h, this.f190i);
        } catch (Throwable unused) {
        }
        if (c0036arM208a.m212b() != C0036ar.m206a()) {
            String str2 = this.f189h;
            C0029ak.m126a(str2, C0029ak.m127b(str2), 2);
            C0029ak.m124a(this.f189h);
            return c0036arM208a;
        }
        if (C0029ak.m122a(this.f189h, 2) != null) {
            this.f184c = C0029ak.m123a(this.f184c, C0029ak.m122a(this.f189h, 2));
            c0036arM208a = m135a(true);
            if (c0036arM208a.m212b() == C0036ar.m206a()) {
                C0029ak.m126a(this.f189h, null, 2);
            }
        } else {
            if (C0029ak.m122a(this.f189h, 1) != null) {
                this.f184c = C0029ak.m123a(this.f184c, C0029ak.m122a(this.f189h, 1));
                c0036arM208a = m135a(true);
                if (c0036arM208a.m212b() != C0036ar.m206a()) {
                    String str3 = this.f189h;
                    C0029ak.m126a(str3, C0029ak.m122a(str3, 1), 2);
                    C0029ak.m124a(this.f189h);
                }
            }
            if (c0036arM208a.m212b() == C0036ar.m206a() && C0029ak.m122a(this.f189h, 3) != null) {
                this.f184c = C0029ak.m123a(this.f184c, C0029ak.m122a(this.f189h, 3));
                c0036arM208a = m135a(true);
                if (c0036arM208a.m212b() != C0036ar.m206a()) {
                    String str4 = this.f189h;
                    C0029ak.m126a(str4, C0029ak.m122a(str4, 3), 2);
                }
            }
            if (c0036arM208a.m212b() == C0036ar.m206a() && C0029ak.m122a(this.f189h, 4) != null) {
                this.f184c = C0029ak.m123a(this.f184c, C0029ak.m122a(this.f189h, 4));
                c0036arM208a = m135a(true);
                if (c0036arM208a.m212b() != C0036ar.m206a()) {
                    String str5 = this.f189h;
                    C0029ak.m126a(str5, C0029ak.m122a(str5, 4), 2);
                }
            }
            if (c0036arM208a.m212b() == C0036ar.m206a() && C0028aj.m116b(this.f189h) == 3 && !C0028aj.m117c(this.f189h)) {
                String strM115a = C0028aj.m115a(this.f189h);
                if (!C0131y.m767b(strM115a)) {
                    this.f184c = C0029ak.m123a(this.f184c, strM115a);
                    C0028aj.updateTimeStamp(this.f189h);
                    c0036arM208a = m135a(true);
                    if (c0036arM208a.m212b() != C0036ar.m206a()) {
                        C0029ak.m125a(this.f189h, strM115a);
                    }
                }
            }
        }
        if (c0036arM208a.m212b() == C0036ar.m206a() && C0028aj.m116b(this.f189h) < 3) {
            C0028aj.updateFailureCountWithHost(this.f189h);
        }
        return c0036arM208a;
    }

    /* JADX INFO: renamed from: a */
    public C0036ar m135a(boolean z) {
        C0036ar c0036arM208a;
        HttpURLConnection httpURLConnection = null;
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) this.f184c.openConnection();
            try {
                httpURLConnection2.setConnectTimeout(15000);
                httpURLConnection2.setReadTimeout(15000);
                URL url = this.f184c;
                if (url != null && url.toString().startsWith("https://")) {
                    C0026ah.f161a.put(Long.valueOf(Thread.currentThread().getId()), this.f189h);
                    if (z) {
                        C0026ah.setHostNameVerifyAllowAll(httpURLConnection2);
                    }
                }
                if (!C0131y.m767b(this.f188g)) {
                    C0026ah.m103a(httpURLConnection2, this.f188g);
                }
                if (!C0131y.m767b(this.f189h)) {
                    httpURLConnection2.setRequestProperty("Host", C0131y.m767b(this.f184c.getHost()) ? this.f189h : this.f184c.getHost());
                    httpURLConnection2.setRequestProperty("Host", this.f189h);
                }
                EnumC0035aq enumC0035aq = this.f185d;
                if (enumC0035aq != null) {
                    enumC0035aq.m205a(httpURLConnection2);
                }
                C0034ap c0034ap = this.f186e;
                if (c0034ap != null) {
                    c0034ap.m204a(httpURLConnection2);
                }
                C0032an c0032an = this.f187f;
                if (c0032an != null) {
                    c0032an.m138a(httpURLConnection2);
                }
                httpURLConnection2.connect();
                c0036arM208a = C0036ar.m209a(this.f189h, httpURLConnection2, jElapsedRealtime, this.f187f);
                httpURLConnection2.disconnect();
            } catch (Throwable th) {
                th = th;
                httpURLConnection = httpURLConnection2;
                try {
                    c0036arM208a = C0036ar.m208a(th.getMessage());
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
        return c0036arM208a;
    }

    /* JADX INFO: renamed from: b */
    public C0036ar m136b() {
        C0036ar c0036arM208a = C0036ar.m208a("");
        try {
            C0036ar c0036arM135a = m135a(false);
            if (c0036arM135a.m212b() != C0036ar.m206a()) {
                return c0036arM135a;
            }
            String strM115a = C0028aj.m115a(this.f189h);
            if (C0131y.m767b(strM115a)) {
                return c0036arM135a;
            }
            this.f184c = C0029ak.m123a(this.f184c, strM115a);
            return m135a(true);
        } catch (Throwable unused) {
            return c0036arM208a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        StringBuilder sbM1039 = C0167c4.m1039("\n url: ");
        sbM1039.append(this.f184c);
        sbM1039.append("\n method: ");
        sbM1039.append(this.f185d);
        sbM1039.append("\n headers: ");
        sbM1039.append(this.f186e);
        sbM1039.append("\n content length: ");
        C0032an c0032an = this.f187f;
        sbM1039.append(c0032an != null ? Integer.valueOf(c0032an.m139a().length) : "");
        sbM1039.append("\n content Type: ");
        C0032an c0032an2 = this.f187f;
        sbM1039.append(c0032an2 != null ? c0032an2.m140b() : "");
        sbM1039.append("\n host: ");
        sbM1039.append(this.f189h);
        sbM1039.append("\n ip: ");
        sbM1039.append(this.f190i);
        sbM1039.append("\n connectionTimeout: ");
        sbM1039.append(this.f191j);
        sbM1039.append("\n readTimeout: ");
        sbM1039.append(this.f192k);
        sbM1039.append("\n cert:  ");
        sbM1039.append(this.f188g);
        sbM1039.append("\n");
        return sbM1039.toString();
    }
}
