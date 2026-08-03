package p000;

/* JADX INFO: loaded from: classes.dex */
public final class xb implements p000.x1 {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static volatile android.net.http.HttpResponseCache f1178;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.Object f1179 = null;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final ۟.xb.a f1180 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.content.Context f1181;

    public static class a extends java.lang.ThreadLocal<java.lang.StringBuilder> {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.lang.ThreadLocal
        public final java.lang.StringBuilder initialValue() {
                r1 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                return r0
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000.xb.f1179 = r0
            ۟.xb$a r0 = new ۟.xb$a
            r0.<init>()
            p000.xb.f1180 = r0
            return
    }

    public xb(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.f1181 = r1
            return
    }

    @Override // p000.x1
    /* JADX INFO: renamed from: ۥ */
    public final ۟.x1.a mo458(android.net.Uri r7, int r8) {
            r6 = this;
            android.content.Context r0 = r6.f1181
            android.net.http.HttpResponseCache r1 = p000.xb.f1178
            if (r1 != 0) goto L3a
            java.lang.Object r1 = p000.xb.f1179     // Catch: java.io.IOException -> L3a
            monitor-enter(r1)     // Catch: java.io.IOException -> L3a
            android.net.http.HttpResponseCache r2 = p000.xb.f1178     // Catch: java.lang.Throwable -> L37
            if (r2 != 0) goto L35
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L37
            android.content.Context r0 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L37
            java.io.File r0 = r0.getCacheDir()     // Catch: java.lang.Throwable -> L37
            java.lang.String r3 = "picasso-cache"
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L37
            boolean r0 = r2.exists()     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto L25
            r2.mkdirs()     // Catch: java.lang.Throwable -> L37
        L25:
            android.net.http.HttpResponseCache r0 = android.net.http.HttpResponseCache.getInstalled()     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto L33
            long r3 = p000.ic.m200(r2)     // Catch: java.lang.Throwable -> L37
            android.net.http.HttpResponseCache r0 = android.net.http.HttpResponseCache.install(r2, r3)     // Catch: java.lang.Throwable -> L37
        L33:
            p000.xb.f1178 = r0     // Catch: java.lang.Throwable -> L37
        L35:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L37
            goto L3a
        L37:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L37
            throw r0     // Catch: java.io.IOException -> L3a
        L3a:
            java.net.URL r0 = new java.net.URL
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            java.net.URLConnection r7 = r0.openConnection()
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7
            r0 = 15000(0x3a98, float:2.102E-41)
            r7.setConnectTimeout(r0)
            r0 = 20000(0x4e20, float:2.8026E-41)
            r7.setReadTimeout(r0)
            r0 = 1
            r7.setUseCaches(r0)
            r1 = 0
            if (r8 == 0) goto L98
            boolean r2 = p000.c4.m101(r8)
            if (r2 == 0) goto L63
            java.lang.String r2 = "only-if-cached,max-age=2147483647"
            goto L93
        L63:
            ۟.xb$a r2 = p000.xb.f1180
            java.lang.Object r2 = r2.get()
            java.lang.StringBuilder r2 = (java.lang.StringBuilder) r2
            r2.setLength(r1)
            boolean r3 = p000.c4.m102(r8)
            if (r3 != 0) goto L79
            java.lang.String r3 = "no-cache"
            r2.append(r3)
        L79:
            boolean r3 = p000.c4.m103(r8)
            if (r3 != 0) goto L8f
            int r3 = r2.length()
            if (r3 <= 0) goto L8a
            r3 = 44
            r2.append(r3)
        L8a:
            java.lang.String r3 = "no-store"
            r2.append(r3)
        L8f:
            java.lang.String r2 = r2.toString()
        L93:
            java.lang.String r3 = "Cache-Control"
            r7.setRequestProperty(r3, r2)
        L98:
            int r2 = r7.getResponseCode()
            r3 = 300(0x12c, float:4.2E-43)
            if (r2 >= r3) goto Le7
            java.lang.String r8 = "Content-Length"
            r2 = -1
            int r8 = r7.getHeaderFieldInt(r8, r2)
            long r2 = (long) r8
            java.lang.String r8 = "X-Android-Response-Source"
            java.lang.String r8 = r7.getHeaderField(r8)
            if (r8 != 0) goto Lb1
            goto Ldc
        Lb1:
            r4 = 2
            java.lang.String r5 = " "
            java.lang.String[] r8 = r8.split(r5, r4)
            r4 = r8[r1]
            java.lang.String r5 = "CACHE"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto Lc3
            goto Ldd
        Lc3:
            int r4 = r8.length
            if (r4 != r0) goto Lc7
            goto Ldc
        Lc7:
            java.lang.String r4 = "CONDITIONAL_CACHE"
            r5 = r8[r1]     // Catch: java.lang.NumberFormatException -> Ldc
            boolean r4 = r4.equals(r5)     // Catch: java.lang.NumberFormatException -> Ldc
            if (r4 == 0) goto Ldc
            r8 = r8[r0]     // Catch: java.lang.NumberFormatException -> Ldc
            int r8 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.NumberFormatException -> Ldc
            r4 = 304(0x130, float:4.26E-43)
            if (r8 != r4) goto Ldc
            goto Ldd
        Ldc:
            r0 = r1
        Ldd:
            ۟.x1$a r8 = new ۟.x1$a
            java.io.InputStream r7 = r7.getInputStream()
            r8.<init>(r7, r0, r2)
            return r8
        Le7:
            r7.disconnect()
            ۟.x1$b r0 = new ۟.x1$b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r3 = " "
            r1.append(r3)
            java.lang.String r7 = r7.getResponseMessage()
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7, r8, r2)
            throw r0
    }
}
