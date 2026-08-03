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
import java.util.Iterator;
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

    static {
    }

    public C0886Uk(C1057Yj r1, int r2) {
        this.f2768a = r1;
        this.f2769b = r2;
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: a */
    public final Class mo912a() {
        return InputStream.class;
    }

    /* JADX INFO: renamed from: b */
    public final InputStream m1732b(URL r8, int r9, URL r10, Map r11) {
        int r2 = -1;
        if (r9 >= 5) goto L71;
        if (r10 != null) goto L86;
    L10:
        int r102 = this.f2769b;
        HttpURLConnection r3 = (HttpURLConnection) r8.openConnection();     // Catch: IOException -> L67
        Iterator r4 = r11.entrySet().iterator();
    L14:
        if (r4.hasNext() == false) goto L16;
        Map.Entry r5 = (Map.Entry) r4.next();
        r3.addRequestProperty((String) r5.getKey(), (String) r5.getValue());
        goto L14
    L16:
        r3.setConnectTimeout(r102);
        r3.setReadTimeout(r102);
        r3.setUseCaches(false);
        r3.setDoInput(true);
        r3.setInstanceFollowRedirects(false);
        this.f2770c = r3;
        r3.connect();     // Catch: IOException -> L62
        this.f2771d = this.f2770c.getInputStream();     // Catch: IOException -> L62
        if (this.f2772e == false) goto L84;
        return null;
    L84:
        int r0 = this.f2770c.getResponseCode();     // Catch: IOException -> L24
    L25:
        int r32 = r0 / 100;
        if (r32 != 2) goto L43;
        HttpURLConnection r82 = this.f2770c;
    L31:
        e = move-exception;
        r2 = r82.getResponseCode();     // Catch: IOException -> L73
    L42:
        throw new C2273na("Failed to obtain InputStream", r2, e);
    L29:
        if (TextUtils.isEmpty(r82.getContentEncoding()) == false) goto L34;
        this.f2771d = new C0018Ab(r82.getInputStream(), r82.getContentLength());     // Catch: IOException -> L31
    L38:
        return this.f2771d;
    L34:
        if (Log.isLoggable("HttpUrlFetcher", 3) == false) goto L36;
        r82.getContentEncoding();     // Catch: IOException -> L31
    L36:
        this.f2771d = r82.getInputStream();     // Catch: IOException -> L31
        goto L38
    L43:
        if (r32 != 3) goto L54;
        String r22 = this.f2770c.getHeaderField("Location");
        if (TextUtils.isEmpty(r22) == true) goto L53;
        URL r1 = new URL(r8, r22);     // Catch: MalformedURLException -> L49
        mo914c();
        return m1732b(r1, r9 + 1, r8, r11);
    L49:
        e = move-exception;
        throw new C2273na(AbstractC0213Ey.m420r("Bad redirect url: ", r22), r0, e);
    L53:
        throw new C2273na("Received empty or null redirect url", r0, null);
    L54:
        if (r0 == (-1)) goto L56;
    L59:
        e = move-exception;
        throw new C2273na("Failed to get a response message", r0, e);
    L58:
        throw new C2273na(this.f2770c.getResponseMessage(), r0, null);     // Catch: IOException -> L59
    L56:
        throw new C2273na("Http request failed", r0, null);
    L24:
        r0 = -1;
    L62:
        e = move-exception;
        r2 = this.f2770c.getResponseCode();     // Catch: IOException -> L74
    L66:
        throw new C2273na("Failed to connect or obtain data", r2, e);
    L67:
        e = move-exception;
        throw new C2273na("URL.openConnection threw", 0, e);
    L86:
        if (r8.toURI().equals(r10.toURI()) == false) goto L10;
        throw new C2273na("In re-direct loop", -1, null);     // Catch: URISyntaxException -> L72
    L71:
        throw new C2273na("Too many (> 5) redirects!", -1, null);
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: c */
    public final void mo914c() {
        InputStream r0 = this.f2771d;
        if (r0 != null) goto L11;
    L5:
        HttpURLConnection r02 = this.f2770c;
        if (r02 == null) goto L8;
        r02.disconnect();
    L8:
        this.f2770c = null;
        return;
    L11:
        r0.close();     // Catch: IOException -> L10
        goto L5
    }

    @Override // p000.InterfaceC2541tc
    public final void cancel() {
        this.f2772e = true;
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: d */
    public final void mo915d(EnumC2688wu r6, InterfaceC2498sc r7) {
        C1057Yj r62 = this.f2768a;
        int r1 = AbstractC1510hp.f5351a;
        SystemClock.elapsedRealtimeNanos();
        r7.mo638e(m1732b(r62.m2001d(), 0, null, r62.f3359b.mo573a()));     // Catch: Throwable -> L8 IOException -> L10
    L5:
        if (Log.isLoggable("HttpUrlFetcher", 2) == false) goto L23;
        SystemClock.elapsedRealtimeNanos();
        return;
    L23:
        return;
    L10:
        e = move-exception;
        r7.mo635b(e);     // Catch: Throwable -> L8
        if (Log.isLoggable("HttpUrlFetcher", 2) == false) goto L24;
        SystemClock.elapsedRealtimeNanos();
        return;
    L24:
        return;
    L8:
        th = move-exception;
        if (Log.isLoggable("HttpUrlFetcher", 2) == false) goto L19;
        SystemClock.elapsedRealtimeNanos();
    L19:
        throw th;
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: f */
    public final int mo916f() {
        return 2;
    }
}
