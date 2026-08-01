package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.activity.AbstractC0053;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import p222.AbstractC7986;
import p222.C7982;
import p228.C8037;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2970 implements InterfaceC2962 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public volatile boolean f9388;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public InputStream f9389;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f9390;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public HttpURLConnection f9391;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8037 f9392;

    public C2970(C8037 c8037, int i) {
        this.f9392 = c8037;
        this.f9390 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m6441(HttpURLConnection httpURLConnection) {
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

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    public final void cancel() {
        this.f9388 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InputStream m6442(URL url, int i, URL url2, Map map) throws HttpException {
        if (i >= 5) {
            throw new HttpException("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        int i2 = this.f9390;
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
            this.f9391 = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f9389 = this.f9391.getInputStream();
                if (this.f9388) {
                    return null;
                }
                int iM6441 = m6441(this.f9391);
                int i3 = iM6441 / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f9391;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f9389 = new C7982(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.f9389 = httpURLConnection2.getInputStream();
                        }
                        return this.f9389;
                    } catch (IOException e) {
                        throw new HttpException("Failed to obtain InputStream", m6441(httpURLConnection2), e);
                    }
                }
                if (i3 != 3) {
                    if (iM6441 == -1) {
                        throw new HttpException(iM6441);
                    }
                    try {
                        throw new HttpException(this.f9391.getResponseMessage(), iM6441);
                    } catch (IOException e2) {
                        throw new HttpException("Failed to get a response message", iM6441, e2);
                    }
                }
                String headerField = this.f9391.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new HttpException("Received empty or null redirect url", iM6441);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    mo6432();
                    return m6442(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new HttpException(AbstractC0053.m157("Bad redirect url: ", headerField), iM6441, e3);
                }
            } catch (IOException e4) {
                throw new HttpException("Failed to connect or obtain data", m6441(this.f9391), e4);
            }
        } catch (IOException e5) {
            throw new HttpException("URL.openConnection threw", 0, e5);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo6430(Priority priority, InterfaceC2963 interfaceC2963) {
        C8037 c8037 = this.f9392;
        int i = AbstractC7986.f22064;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                interfaceC2963.mo6434(m6442(c8037.m13520(), 0, null, c8037.f22193.mo13527()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + AbstractC7986.m13467(jElapsedRealtimeNanos));
                }
            } catch (IOException e) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e);
                }
                interfaceC2963.mo6435(e);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + AbstractC7986.m13467(jElapsedRealtimeNanos));
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + AbstractC7986.m13467(jElapsedRealtimeNanos));
            }
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final DataSource mo6431() {
        return DataSource.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6432() {
        InputStream inputStream = this.f9389;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f9391;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f9391 = null;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Class mo6433() {
        return InputStream.class;
    }
}
