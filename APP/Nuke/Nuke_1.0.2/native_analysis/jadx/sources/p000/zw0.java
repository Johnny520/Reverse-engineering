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

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zw0 implements f40 {

    /* JADX INFO: renamed from: h */
    public final cq0 f14117h;

    /* JADX INFO: renamed from: i */
    public final int f14118i;

    /* JADX INFO: renamed from: j */
    public HttpURLConnection f14119j;

    /* JADX INFO: renamed from: k */
    public InputStream f14120k;

    /* JADX INFO: renamed from: l */
    public volatile boolean f14121l;

    public zw0(cq0 cq0Var, int i) {
        this.f14117h = cq0Var;
        this.f14118i = i;
    }

    /* JADX INFO: renamed from: d */
    public static int m6511d(HttpURLConnection httpURLConnection) {
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

    @Override // p000.f40
    /* JADX INFO: renamed from: a */
    public final Class mo1371a() {
        return InputStream.class;
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: b */
    public final void mo1372b() {
        InputStream inputStream = this.f14120k;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f14119j;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f14119j = null;
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: c */
    public final void mo1373c(i32 i32Var, e40 e40Var) {
        cq0 cq0Var = this.f14117h;
        int i = tc1.f10678b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                e40Var.mo636h(m6512f(cq0Var.m883d(), 0, null, cq0Var.f1668b.mo2970a()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + tc1.m5161a(jElapsedRealtimeNanos));
                }
            } catch (IOException e) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e);
                }
                e40Var.mo635d(e);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + tc1.m5161a(jElapsedRealtimeNanos));
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + tc1.m5161a(jElapsedRealtimeNanos));
            }
            throw th;
        }
    }

    @Override // p000.f40
    public final void cancel() {
        this.f14121l = true;
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: e */
    public final int mo1374e() {
        return 2;
    }

    /* JADX INFO: renamed from: f */
    public final InputStream m6512f(URL url, int i, URL url2, Map map) throws qw0 {
        if (i >= 5) {
            throw new qw0("Too many (> 5) redirects!", -1, null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new qw0("In re-direct loop", -1, null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        int i2 = this.f14118i;
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
            this.f14119j = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f14120k = this.f14119j.getInputStream();
                if (this.f14121l) {
                    return null;
                }
                int iM6511d = m6511d(this.f14119j);
                int i3 = iM6511d / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f14119j;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f14120k = new h00(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.f14120k = httpURLConnection2.getInputStream();
                        }
                        return this.f14120k;
                    } catch (IOException e) {
                        throw new qw0("Failed to obtain InputStream", m6511d(httpURLConnection2), e);
                    }
                }
                if (i3 != 3) {
                    if (iM6511d == -1) {
                        throw new qw0("Http request failed", iM6511d, null);
                    }
                    try {
                        throw new qw0(this.f14119j.getResponseMessage(), iM6511d, null);
                    } catch (IOException e2) {
                        throw new qw0("Failed to get a response message", iM6511d, e2);
                    }
                }
                String headerField = this.f14119j.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new qw0("Received empty or null redirect url", iM6511d, null);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    mo1372b();
                    return m6512f(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new qw0(vi0.m5690i("Bad redirect url: ", headerField), iM6511d, e3);
                }
            } catch (IOException e4) {
                throw new qw0("Failed to connect or obtain data", m6511d(this.f14119j), e4);
            }
        } catch (IOException e5) {
            throw new qw0("URL.openConnection threw", 0, e5);
        }
    }
}
