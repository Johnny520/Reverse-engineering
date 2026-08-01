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
import p222.AbstractC7985;
import p222.C7981;
import p228.C8036;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2969 implements InterfaceC2961 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public volatile boolean f9386;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public InputStream f9387;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f9388;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public HttpURLConnection f9389;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8036 f9390;

    public C2969(C8036 c8036, int i) {
        this.f9390 = c8036;
        this.f9388 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m6383(HttpURLConnection httpURLConnection) {
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

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    public final void cancel() {
        this.f9386 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InputStream m6384(URL url, int i, URL url2, Map map) throws HttpException {
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
        int i2 = this.f9388;
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
            this.f9389 = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f9387 = this.f9389.getInputStream();
                if (this.f9386) {
                    return null;
                }
                int iM6383 = m6383(this.f9389);
                int i3 = iM6383 / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f9389;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f9387 = new C7981(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.f9387 = httpURLConnection2.getInputStream();
                        }
                        return this.f9387;
                    } catch (IOException e) {
                        throw new HttpException("Failed to obtain InputStream", m6383(httpURLConnection2), e);
                    }
                }
                if (i3 != 3) {
                    if (iM6383 == -1) {
                        throw new HttpException(iM6383);
                    }
                    try {
                        throw new HttpException(this.f9389.getResponseMessage(), iM6383);
                    } catch (IOException e2) {
                        throw new HttpException("Failed to get a response message", iM6383, e2);
                    }
                }
                String headerField = this.f9389.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new HttpException("Received empty or null redirect url", iM6383);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    mo6374();
                    return m6384(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new HttpException(AbstractC0053.m152("Bad redirect url: ", headerField), iM6383, e3);
                }
            } catch (IOException e4) {
                throw new HttpException("Failed to connect or obtain data", m6383(this.f9389), e4);
            }
        } catch (IOException e5) {
            throw new HttpException("URL.openConnection threw", 0, e5);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo6372(Priority priority, InterfaceC2962 interfaceC2962) {
        C8036 c8036 = this.f9390;
        int i = AbstractC7985.f22067;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                interfaceC2962.mo6376(m6384(c8036.m13492(), 0, null, c8036.f22196.mo13499()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + AbstractC7985.m13439(jElapsedRealtimeNanos));
                }
            } catch (IOException e) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e);
                }
                interfaceC2962.mo6377(e);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + AbstractC7985.m13439(jElapsedRealtimeNanos));
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + AbstractC7985.m13439(jElapsedRealtimeNanos));
            }
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final DataSource mo6373() {
        return DataSource.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6374() {
        InputStream inputStream = this.f9387;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f9389;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f9389 = null;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Class mo6375() {
        return InputStream.class;
    }
}
