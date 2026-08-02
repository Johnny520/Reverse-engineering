package defpackage;

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
    public final cq0 h;
    public final int i;
    public HttpURLConnection j;
    public InputStream k;
    public volatile boolean l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zw0(cq0 cq0Var, int i) {
        this.h = cq0Var;
        this.i = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int d(HttpURLConnection httpURLConnection) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f40
    public final Class a() {
        return InputStream.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f40
    public final void b() {
        InputStream inputStream = this.k;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.j;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.j = null;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[INVOKE]}, finally: {[INVOKE, CONSTRUCTOR, INVOKE, INVOKE, INVOKE, INVOKE, IF] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f40
    public final void c(i32 i32Var, e40 e40Var) {
        cq0 cq0Var = this.h;
        int i = tc1.b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                e40Var.h(f(cq0Var.d(), 0, null, cq0Var.b.a()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + tc1.a(jElapsedRealtimeNanos));
                }
            } catch (IOException e) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e);
                }
                e40Var.d(e);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + tc1.a(jElapsedRealtimeNanos));
                }
            }
        } catch (Throwable th) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + tc1.a(jElapsedRealtimeNanos));
            }
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f40
    public final void cancel() {
        this.l = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f40
    public final int e() {
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InputStream f(URL url, int i, URL url2, Map map) throws qw0 {
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
        int i2 = this.i;
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
            this.j = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.k = this.j.getInputStream();
                if (this.l) {
                    return null;
                }
                int iD = d(this.j);
                int i3 = iD / 100;
                if (i3 == 2) {
                    HttpURLConnection httpURLConnection2 = this.j;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.k = new h00(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection2.getContentEncoding());
                            }
                            this.k = httpURLConnection2.getInputStream();
                        }
                        return this.k;
                    } catch (IOException e) {
                        throw new qw0("Failed to obtain InputStream", d(httpURLConnection2), e);
                    }
                }
                if (i3 != 3) {
                    if (iD == -1) {
                        throw new qw0("Http request failed", iD, null);
                    }
                    try {
                        throw new qw0(this.j.getResponseMessage(), iD, null);
                    } catch (IOException e2) {
                        throw new qw0("Failed to get a response message", iD, e2);
                    }
                }
                String headerField = this.j.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new qw0("Received empty or null redirect url", iD, null);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    b();
                    return f(url3, i + 1, url, map);
                } catch (MalformedURLException e3) {
                    throw new qw0(vi0.i("Bad redirect url: ", headerField), iD, e3);
                }
            } catch (IOException e4) {
                throw new qw0("Failed to connect or obtain data", d(this.j), e4);
            }
        } catch (IOException e5) {
            throw new qw0("URL.openConnection threw", 0, e5);
        }
    }
}
