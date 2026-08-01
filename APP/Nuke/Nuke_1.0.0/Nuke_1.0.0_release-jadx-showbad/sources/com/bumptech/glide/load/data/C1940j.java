package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.EnumC1928j;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import p078P1.C1141c;
import p107V1.C1508g;
import p195l2.AbstractC2505i;
import p195l2.C2500d;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1940j implements InterfaceC1934d {

    /* JADX INFO: renamed from: d */
    public final C1508g f6580d;

    /* JADX INFO: renamed from: e */
    public final int f6581e;

    /* JADX INFO: renamed from: f */
    public HttpURLConnection f6582f;

    /* JADX INFO: renamed from: g */
    public InputStream f6583g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f6584h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1940j(C1508g c1508g, int i5) {
        this.f6580d = c1508g;
        this.f6581e = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static int m3601e(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e5) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e5);
            return -1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: a */
    public final Class mo2222a() {
        return InputStream.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: b */
    public final void mo2223b() {
        InputStream inputStream = this.f6583g;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f6582f;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f6582f = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: c */
    public final int mo2224c() {
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    public final void cancel() {
        this.f6584h = true;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[INVOKE]}, finally: {[INVOKE, CONSTRUCTOR, INVOKE, INVOKE, INVOKE, INVOKE, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: d */
    public final void mo2225d(EnumC1928j enumC1928j, InterfaceC1933c interfaceC1933c) {
        C1508g c1508g = this.f6580d;
        int i5 = AbstractC2505i.f8018b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                interfaceC1933c.mo43l(m3602f(c1508g.m2780d(), 0, null, c1508g.f5249b.mo2781a()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + AbstractC2505i.m4446a(jElapsedRealtimeNanos));
                }
            } catch (IOException e5) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e5);
                }
                interfaceC1933c.mo36e(e5);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + AbstractC2505i.m4446a(jElapsedRealtimeNanos));
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + AbstractC2505i.m4446a(jElapsedRealtimeNanos));
            }
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final InputStream m3602f(URL url, int i5, URL url2, Map map) throws C1141c {
        if (i5 >= 5) {
            throw new C1141c("Too many (> 5) redirects!", -1, null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new C1141c("In re-direct loop", -1, null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        int i6 = this.f6581e;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setConnectTimeout(i6);
            httpURLConnection.setReadTimeout(i6);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f6582f = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f6583g = this.f6582f.getInputStream();
                if (this.f6584h) {
                    return null;
                }
                int iM3601e = m3601e(this.f6582f);
                int i7 = iM3601e / 100;
                if (i7 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f6582f;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f6583g = new C2500d(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.f6583g = httpURLConnection2.getInputStream();
                        }
                        return this.f6583g;
                    } catch (IOException e5) {
                        throw new C1141c("Failed to obtain InputStream", m3601e(httpURLConnection2), e5);
                    }
                }
                if (i7 != 3) {
                    if (iM3601e == -1) {
                        throw new C1141c("Http request failed", iM3601e, null);
                    }
                    try {
                        throw new C1141c(this.f6582f.getResponseMessage(), iM3601e, null);
                    } catch (IOException e6) {
                        throw new C1141c("Failed to get a response message", iM3601e, e6);
                    }
                }
                String headerField = this.f6582f.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new C1141c("Received empty or null redirect url", iM3601e, null);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    mo2223b();
                    return m3602f(url3, i5 + 1, url, map);
                } catch (MalformedURLException e7) {
                    throw new C1141c("Bad redirect url: " + headerField, iM3601e, e7);
                }
            } catch (IOException e8) {
                throw new C1141c("Failed to connect or obtain data", m3601e(this.f6582f), e8);
            }
        } catch (IOException e9) {
            throw new C1141c("URL.openConnection threw", 0, e9);
        }
    }
}
