package p001;

import android.content.Context;
import android.net.Uri;
import android.net.http.HttpResponseCache;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p001.InterfaceC0449x1;

/* JADX INFO: renamed from: ۟.xb */
/* JADX INFO: loaded from: classes.dex */
public final class C0459xb implements InterfaceC0449x1 {

    /* JADX INFO: renamed from: ۥ۟ */
    public static volatile HttpResponseCache f1196;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final Object f1868 = new Object();

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final a f1869 = new a();

    /* JADX INFO: renamed from: ۥ */
    public final Context f1197;

    /* JADX INFO: renamed from: ۟.xb$a */
    public static class a extends ThreadLocal<StringBuilder> {
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.lang.ThreadLocal
        public final StringBuilder initialValue() {
            return new StringBuilder();
        }
    }

    public C0459xb(Context context) {
        this.f1197 = context.getApplicationContext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dc  */
    @Override // p001.InterfaceC0449x1
    /* JADX INFO: renamed from: ۥ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC0449x1.a mo960(Uri uri, int i) throws IOException {
        String string;
        Context context = this.f1197;
        if (f1196 == null) {
            try {
                synchronized (f1868) {
                    if (f1196 == null) {
                        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        HttpResponseCache installed = HttpResponseCache.getInstalled();
                        if (installed == null) {
                            installed = HttpResponseCache.install(file, C0259ic.m872(file));
                        }
                        f1196 = installed;
                    }
                }
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(20000);
        boolean z = true;
        httpURLConnection.setUseCaches(true);
        if (i != 0) {
            if (C0167c4.m834(i)) {
                string = "only-if-cached,max-age=2147483647";
            } else {
                StringBuilder sb = f1869.get();
                sb.setLength(0);
                if (!C0167c4.m835(i)) {
                    sb.append("no-cache");
                }
                if (!C0167c4.m1034(i)) {
                    if (sb.length() > 0) {
                        sb.append(',');
                    }
                    sb.append("no-store");
                }
                string = sb.toString();
            }
            httpURLConnection.setRequestProperty("Cache-Control", string);
        }
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode >= 300) {
            httpURLConnection.disconnect();
            throw new InterfaceC0449x1.b(responseCode + " " + httpURLConnection.getResponseMessage(), i, responseCode);
        }
        long headerFieldInt = httpURLConnection.getHeaderFieldInt("Content-Length", -1);
        String headerField = httpURLConnection.getHeaderField("X-Android-Response-Source");
        if (headerField == null) {
            z = false;
        } else {
            String[] strArrSplit = headerField.split(" ", 2);
            if (!"CACHE".equals(strArrSplit[0])) {
                if (strArrSplit.length != 1) {
                    try {
                        if ("CONDITIONAL_CACHE".equals(strArrSplit[0])) {
                            if (Integer.parseInt(strArrSplit[1]) != 304) {
                            }
                        }
                    } catch (NumberFormatException unused2) {
                    }
                }
            }
        }
        return new InterfaceC0449x1.a(httpURLConnection.getInputStream(), z, headerFieldInt);
    }
}
