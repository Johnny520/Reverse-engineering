package yyds;

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

/* JADX INFO: renamed from: yyds.ᛸᲀᛳᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1857 implements InterfaceC0724 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public HttpURLConnection f9338;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public volatile boolean f9339;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C0714 f9340;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public InputStream f9341;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int f9342;

    public C1857(C0714 c0714, int i) {
        this.f9340 = c0714;
        this.f9342 = i;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static int m3638(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e);
            return -1;
        }
    }

    @Override // yyds.InterfaceC0724
    public final void cancel() {
        this.f9339 = true;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final InputStream m3639(URL url, int i, URL url2, Map map) throws C1951 {
        if (i >= 5) {
            throw new C1951("Too many (> 5) redirects!", -1, (IOException) null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new C1951("In re-direct loop", -1, (IOException) null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        int i2 = this.f9342;
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
            this.f9338 = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f9341 = this.f9338.getInputStream();
                if (this.f9339) {
                    return null;
                }
                int iM3638 = m3638(this.f9338);
                int i3 = iM3638 / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f9338;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            C0028 c0028 = new C0028(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                            this.f9341 = c0028;
                            return c0028;
                        }
                        if (Log.isLoggable("HttpUrlFetcher", 3)) {
                            Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                        }
                        InputStream inputStream = httpURLConnection2.getInputStream();
                        this.f9341 = inputStream;
                        return inputStream;
                    } catch (IOException e) {
                        throw new C1951("Failed to obtain InputStream", m3638(httpURLConnection2), e);
                    }
                }
                if (i3 != 3) {
                    if (iM3638 == -1) {
                        throw new C1951("Http request failed", iM3638, (IOException) null);
                    }
                    try {
                        throw new C1951(this.f9338.getResponseMessage(), iM3638, (IOException) null);
                    } catch (IOException e2) {
                        throw new C1951("Failed to get a response message", iM3638, e2);
                    }
                }
                String headerField = this.f9338.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new C1951("Received empty or null redirect url", iM3638, (IOException) null);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    mo512();
                    return m3639(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new C1951("Bad redirect url: " + headerField, iM3638, e3);
                }
            } catch (IOException e4) {
                throw new C1951("Failed to connect or obtain data", m3638(this.f9338), e4);
            }
        } catch (IOException e5) {
            throw new C1951("URL.openConnection threw", 0, e5);
        }
    }

    @Override // yyds.InterfaceC0724
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final Class mo417() {
        return InputStream.class;
    }

    @Override // yyds.InterfaceC0724
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo512() {
        InputStream inputStream = this.f9341;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f9338;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f9338 = null;
    }

    @Override // yyds.InterfaceC0724
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final int mo513() {
        return 2;
    }

    @Override // yyds.InterfaceC0724
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo514(EnumC0296 enumC0296, InterfaceC0306 interfaceC0306) {
        C0714 c0714 = this.f9340;
        int i = AbstractC1382.f6429;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                interfaceC0306.mo546(m3639(c0714.m1634(), 0, null, c0714.f3360.mo4187()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + AbstractC1382.m2794(jElapsedRealtimeNanos));
                }
            } catch (IOException e) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e);
                }
                interfaceC0306.mo567(e);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + AbstractC1382.m2794(jElapsedRealtimeNanos));
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + AbstractC1382.m2794(jElapsedRealtimeNanos));
            }
            throw th;
        }
    }
}
