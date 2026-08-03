package p000;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: renamed from: Uk */
/* JADX INFO: loaded from: classes.dex */
public final class C0886Uk implements InterfaceC2541tc {

    /* JADX INFO: renamed from: a */
    public final C1057Yj f2768a;

    /* JADX INFO: renamed from: b */
    public final int f2769b;

    /* JADX INFO: renamed from: c */
    public HttpURLConnection f2770c;

    /* JADX INFO: renamed from: d */
    public InputStream f2771d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f2772e;

    public C0886Uk(C1057Yj c1057Yj, int i) {
        this.f2768a = c1057Yj;
        this.f2769b = i;
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: a */
    public final Class mo912a() {
        return InputStream.class;
    }

    /* JADX INFO: renamed from: b */
    public final InputStream m1732b(URL url, int i, URL url2, Map map) throws C2273na {
        int responseCode;
        int responseCode2 = -1;
        if (i >= 5) {
            throw new C2273na("Too many (> 5) redirects!", -1, (IOException) null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new C2273na("In re-direct loop", -1, (IOException) null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        int i2 = this.f2769b;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setConnectTimeout(i2);
            httpURLConnection.setReadTimeout(i2);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f2770c = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f2771d = this.f2770c.getInputStream();
                if (this.f2772e) {
                    return null;
                }
                try {
                    responseCode = this.f2770c.getResponseCode();
                } catch (IOException unused2) {
                    responseCode = -1;
                }
                int i3 = responseCode / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f2770c;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f2771d = new C0018Ab(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                httpURLConnection2.getContentEncoding();
                            }
                            this.f2771d = httpURLConnection2.getInputStream();
                        }
                        return this.f2771d;
                    } catch (IOException e) {
                        try {
                            responseCode2 = httpURLConnection2.getResponseCode();
                        } catch (IOException unused3) {
                        }
                        throw new C2273na("Failed to obtain InputStream", responseCode2, e);
                    }
                }
                if (i3 != 3) {
                    if (responseCode == -1) {
                        throw new C2273na("Http request failed", responseCode, (IOException) null);
                    }
                    try {
                        throw new C2273na(this.f2770c.getResponseMessage(), responseCode, (IOException) null);
                    } catch (IOException e2) {
                        throw new C2273na("Failed to get a response message", responseCode, e2);
                    }
                }
                String headerField = this.f2770c.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new C2273na("Received empty or null redirect url", responseCode, (IOException) null);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    mo914c();
                    return m1732b(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new C2273na(AbstractC0213Ey.m420r("Bad redirect url: ", headerField), responseCode, e3);
                }
            } catch (IOException e4) {
                try {
                    responseCode2 = this.f2770c.getResponseCode();
                } catch (IOException unused4) {
                }
                throw new C2273na("Failed to connect or obtain data", responseCode2, e4);
            }
        } catch (IOException e5) {
            throw new C2273na("URL.openConnection threw", 0, e5);
        }
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: c */
    public final void mo914c() {
        InputStream inputStream = this.f2771d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f2770c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f2770c = null;
    }

    @Override // p000.InterfaceC2541tc
    public final void cancel() {
        this.f2772e = true;
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: d */
    public final void mo915d(EnumC2688wu enumC2688wu, InterfaceC2498sc interfaceC2498sc) {
        C1057Yj c1057Yj = this.f2768a;
        int i = AbstractC1510hp.f5351a;
        SystemClock.elapsedRealtimeNanos();
        try {
            try {
                interfaceC2498sc.mo638e(m1732b(c1057Yj.m2001d(), 0, null, c1057Yj.f3359b.mo573a()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    SystemClock.elapsedRealtimeNanos();
                }
            } catch (IOException e) {
                interfaceC2498sc.mo635b(e);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    SystemClock.elapsedRealtimeNanos();
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
            throw th;
        }
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: f */
    public final int mo916f() {
        return 2;
    }
}
