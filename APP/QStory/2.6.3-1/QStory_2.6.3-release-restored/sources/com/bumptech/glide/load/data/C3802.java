package com.bumptech.glide.load.data;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.activity.AbstractC0900;
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
import p238.AbstractC8815;
import p238.C8811;
import p244.C8866;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3802 implements InterfaceC3794 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public volatile boolean f9733;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public InputStream f9734;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f9735;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public HttpURLConnection f9736;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8866 f9737;

    public C3802(C8866 c8866, int i) {
        this.f9737 = c8866;
        this.f9735 = i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static int m7001(HttpURLConnection httpURLConnection) {
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

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    public final void cancel() {
        this.f9733 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final InputStream m7002(URL url, int i, URL url2, Map map) throws HttpException {
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
        int i2 = this.f9735;
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
            this.f9736 = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f9734 = this.f9736.getInputStream();
                if (this.f9733) {
                    return null;
                }
                int iM7001 = m7001(this.f9736);
                int i3 = iM7001 / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f9736;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f9734 = new C8811(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.f9734 = httpURLConnection2.getInputStream();
                        }
                        return this.f9734;
                    } catch (IOException e) {
                        throw new HttpException("Failed to obtain InputStream", m7001(httpURLConnection2), e);
                    }
                }
                if (i3 != 3) {
                    if (iM7001 == -1) {
                        throw new HttpException(iM7001);
                    }
                    try {
                        throw new HttpException(this.f9736.getResponseMessage(), iM7001);
                    } catch (IOException e2) {
                        throw new HttpException("Failed to get a response message", iM7001, e2);
                    }
                }
                String headerField = this.f9736.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new HttpException("Received empty or null redirect url", iM7001);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    mo6992();
                    return m7002(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new HttpException(AbstractC0900.m717("Bad redirect url: ", headerField), iM7001, e3);
                }
            } catch (IOException e4) {
                throw new HttpException("Failed to connect or obtain data", m7001(this.f9736), e4);
            }
        } catch (IOException e5) {
            throw new HttpException("URL.openConnection threw", 0, e5);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo6990(Priority priority, InterfaceC3795 interfaceC3795) {
        C8866 c8866 = this.f9737;
        int i = AbstractC8815.f22409;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                interfaceC3795.mo6994(m7002(c8866.m14079(), 0, null, c8866.f22538.mo14086()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + AbstractC8815.m14026(jElapsedRealtimeNanos));
                }
            } catch (IOException e) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e);
                }
                interfaceC3795.mo6995(e);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + AbstractC8815.m14026(jElapsedRealtimeNanos));
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + AbstractC8815.m14026(jElapsedRealtimeNanos));
            }
            throw th;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final DataSource mo6991() {
        return DataSource.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6992() {
        InputStream inputStream = this.f9734;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f9736;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f9736 = null;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Class mo6993() {
        return InputStream.class;
    }
}
