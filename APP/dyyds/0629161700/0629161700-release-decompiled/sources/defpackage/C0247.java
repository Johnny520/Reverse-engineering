package defpackage;

/* JADX INFO: renamed from: ᛲᛲᛳᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0247 implements defpackage.InterfaceC0204 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public java.net.HttpURLConnection f1453;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int f1454;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C2302 f1455;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public java.io.InputStream f1456;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public volatile boolean f1457;

    static {
            return
    }

    public C0247(defpackage.C2302 r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f1455 = r1
            r0.f1454 = r2
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static int m872(java.net.HttpURLConnection r2) {
            int r2 = r2.getResponseCode()     // Catch: java.io.IOException -> L5
            return r2
        L5:
            r2 = move-exception
            r0 = 3
            java.lang.String r1 = "HttpUrlFetcher"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L14
            java.lang.String r0 = "Failed to get a response code"
            android.util.Log.d(r1, r0, r2)
        L14:
            r2 = -1
            return r2
    }

    @Override // defpackage.InterfaceC0204
    public final void cancel() {
            r1 = this;
            r0 = 1
            r1.f1457 = r0
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.io.InputStream m873(java.net.URL r8, int r9, java.net.URL r10, java.util.Map r11) {
            r7 = this;
            r0 = 5
            r1 = -1
            r2 = 0
            if (r9 >= r0) goto L13a
            if (r10 == 0) goto L1e
            java.net.URI r0 = r8.toURI()     // Catch: java.net.URISyntaxException -> L1e
            java.net.URI r10 = r10.toURI()     // Catch: java.net.URISyntaxException -> L1e
            boolean r10 = r0.equals(r10)     // Catch: java.net.URISyntaxException -> L1e
            if (r10 != 0) goto L16
            goto L1e
        L16:
            ᛳᛳᛵᛶ r10 = new ᛳᛳᛵᛶ     // Catch: java.net.URISyntaxException -> L1e
            java.lang.String r0 = "In re-direct loop"
            r10.<init>(r0, r1, r2)     // Catch: java.net.URISyntaxException -> L1e
            throw r10     // Catch: java.net.URISyntaxException -> L1e
        L1e:
            int r10 = r7.f1454
            r0 = 0
            java.net.URLConnection r3 = r8.openConnection()     // Catch: java.io.IOException -> L131
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.io.IOException -> L131
            java.util.Set r4 = r11.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L2f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4b
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            r3.addRequestProperty(r6, r5)
            goto L2f
        L4b:
            r3.setConnectTimeout(r10)
            r3.setReadTimeout(r10)
            r3.setUseCaches(r0)
            r10 = 1
            r3.setDoInput(r10)
            r3.setInstanceFollowRedirects(r0)
            r7.f1453 = r3
            r3.connect()     // Catch: java.io.IOException -> L122
            java.net.HttpURLConnection r0 = r7.f1453     // Catch: java.io.IOException -> L122
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.io.IOException -> L122
            r7.f1456 = r0     // Catch: java.io.IOException -> L122
            boolean r0 = r7.f1457
            if (r0 == 0) goto L6d
            return r2
        L6d:
            java.net.HttpURLConnection r0 = r7.f1453
            int r0 = m872(r0)
            int r3 = r0 / 100
            r4 = 2
            r5 = 3
            if (r3 != r4) goto Lc8
            java.net.HttpURLConnection r8 = r7.f1453
            java.lang.String r9 = "HttpUrlFetcher"
            java.lang.String r10 = "Got non empty content encoding: "
            java.lang.String r11 = r8.getContentEncoding()     // Catch: java.io.IOException -> L9a
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch: java.io.IOException -> L9a
            if (r11 == 0) goto L9c
            int r9 = r8.getContentLength()     // Catch: java.io.IOException -> L9a
            java.io.InputStream r10 = r8.getInputStream()     // Catch: java.io.IOException -> L9a
            long r0 = (long) r9     // Catch: java.io.IOException -> L9a
            ᛶᲇᛳᛱ r9 = new ᛶᲇᛳᛱ     // Catch: java.io.IOException -> L9a
            r9.<init>(r10, r0)     // Catch: java.io.IOException -> L9a
            r7.f1456 = r9     // Catch: java.io.IOException -> L9a
            goto Lbb
        L9a:
            r7 = move-exception
            goto Lbc
        L9c:
            boolean r11 = android.util.Log.isLoggable(r9, r5)     // Catch: java.io.IOException -> L9a
            if (r11 == 0) goto Lb5
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L9a
            r11.<init>(r10)     // Catch: java.io.IOException -> L9a
            java.lang.String r10 = r8.getContentEncoding()     // Catch: java.io.IOException -> L9a
            r11.append(r10)     // Catch: java.io.IOException -> L9a
            java.lang.String r10 = r11.toString()     // Catch: java.io.IOException -> L9a
            android.util.Log.d(r9, r10)     // Catch: java.io.IOException -> L9a
        Lb5:
            java.io.InputStream r9 = r8.getInputStream()     // Catch: java.io.IOException -> L9a
            r7.f1456 = r9     // Catch: java.io.IOException -> L9a
        Lbb:
            return r9
        Lbc:
            ᛳᛳᛵᛶ r9 = new ᛳᛳᛵᛶ
            java.lang.String r10 = "Failed to obtain InputStream"
            int r8 = m872(r8)
            r9.<init>(r10, r8, r7)
            throw r9
        Lc8:
            if (r3 != r5) goto L103
            java.net.HttpURLConnection r1 = r7.f1453
            java.lang.String r3 = "Location"
            java.lang.String r1 = r1.getHeaderField(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto Lfb
            java.net.URL r2 = new java.net.URL     // Catch: java.net.MalformedURLException -> Le6
            r2.<init>(r8, r1)     // Catch: java.net.MalformedURLException -> Le6
            r7.mo754()
            int r9 = r9 + r10
            java.io.InputStream r7 = r7.m873(r2, r9, r8, r11)
            return r7
        Le6:
            r7 = move-exception
            ᛳᛳᛵᛶ r8 = new ᛳᛳᛵᛶ
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Bad redirect url: "
            r9.<init>(r10)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9, r0, r7)
            throw r8
        Lfb:
            ᛳᛳᛵᛶ r7 = new ᛳᛳᛵᛶ
            java.lang.String r8 = "Received empty or null redirect url"
            r7.<init>(r8, r0, r2)
            throw r7
        L103:
            if (r0 != r1) goto L10d
            ᛳᛳᛵᛶ r7 = new ᛳᛳᛵᛶ
            java.lang.String r8 = "Http request failed"
            r7.<init>(r8, r0, r2)
            throw r7
        L10d:
            ᛳᛳᛵᛶ r8 = new ᛳᛳᛵᛶ     // Catch: java.io.IOException -> L119
            java.net.HttpURLConnection r7 = r7.f1453     // Catch: java.io.IOException -> L119
            java.lang.String r7 = r7.getResponseMessage()     // Catch: java.io.IOException -> L119
            r8.<init>(r7, r0, r2)     // Catch: java.io.IOException -> L119
            throw r8     // Catch: java.io.IOException -> L119
        L119:
            r7 = move-exception
            ᛳᛳᛵᛶ r8 = new ᛳᛳᛵᛶ
            java.lang.String r9 = "Failed to get a response message"
            r8.<init>(r9, r0, r7)
            throw r8
        L122:
            r8 = move-exception
            ᛳᛳᛵᛶ r9 = new ᛳᛳᛵᛶ
            java.net.HttpURLConnection r7 = r7.f1453
            int r7 = m872(r7)
            java.lang.String r10 = "Failed to connect or obtain data"
            r9.<init>(r10, r7, r8)
            throw r9
        L131:
            r7 = move-exception
            ᛳᛳᛵᛶ r8 = new ᛳᛳᛵᛶ
            java.lang.String r9 = "URL.openConnection threw"
            r8.<init>(r9, r0, r7)
            throw r8
        L13a:
            ᛳᛳᛵᛶ r7 = new ᛳᛳᛵᛶ
            java.lang.String r8 = "Too many (> 5) redirects!"
            r7.<init>(r8, r1, r2)
            throw r7
    }

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final void mo753(defpackage.EnumC1307 r9, defpackage.InterfaceC0784 r10) {
            r8 = this;
            ᲈᛸᛳᛲ r9 = r8.f1455
            java.lang.String r0 = "Finished http url fetcher fetch in "
            java.lang.String r1 = "HttpUrlFetcher"
            int r2 = defpackage.AbstractC1856.f8102
            long r2 = android.os.SystemClock.elapsedRealtimeNanos()
            r4 = 2
            java.net.URL r5 = r9.m3743()     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            ᛱᛵᲈᲀ r9 = r9.f9739     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            java.util.Map r9 = r9.mo596()     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            r6 = 0
            r7 = 0
            java.io.InputStream r8 = r8.m873(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            r10.mo1362(r8)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3c
            boolean r8 = android.util.Log.isLoggable(r1, r4)
            if (r8 == 0) goto L65
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r0)
            double r9 = defpackage.AbstractC1856.m3272(r2)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.v(r1, r8)
            return
        L3a:
            r8 = move-exception
            goto L66
        L3c:
            r8 = move-exception
            r9 = 3
            boolean r9 = android.util.Log.isLoggable(r1, r9)     // Catch: java.lang.Throwable -> L3a
            if (r9 == 0) goto L49
            java.lang.String r9 = "Failed to load data for url"
            android.util.Log.d(r1, r9, r8)     // Catch: java.lang.Throwable -> L3a
        L49:
            r10.mo1360(r8)     // Catch: java.lang.Throwable -> L3a
            boolean r8 = android.util.Log.isLoggable(r1, r4)
            if (r8 == 0) goto L65
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r0)
            double r9 = defpackage.AbstractC1856.m3272(r2)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.v(r1, r8)
        L65:
            return
        L66:
            boolean r9 = android.util.Log.isLoggable(r1, r4)
            if (r9 == 0) goto L7f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r0)
            double r2 = defpackage.AbstractC1856.m3272(r2)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            android.util.Log.v(r1, r9)
        L7f:
            throw r8
    }

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo754() {
            r1 = this;
            java.io.InputStream r0 = r1.f1456
            if (r0 == 0) goto L7
            r0.close()     // Catch: java.io.IOException -> L7
        L7:
            java.net.HttpURLConnection r0 = r1.f1453
            if (r0 == 0) goto Le
            r0.disconnect()
        Le:
            r0 = 0
            r1.f1453 = r0
            return
    }

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final java.lang.Class mo646() {
            r0 = this;
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            return r0
    }

    @Override // defpackage.InterfaceC0204
    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public final int mo755() {
            r0 = this;
            r0 = 2
            return r0
    }
}
