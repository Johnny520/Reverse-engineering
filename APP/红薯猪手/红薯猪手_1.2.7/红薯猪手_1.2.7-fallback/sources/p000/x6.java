package p000;

/* JADX INFO: loaded from: classes.dex */
public final class x6 implements p000.x1 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final com.squareup.okhttp.OkHttpClient f1169;

    public x6(java.io.File r3, long r4) {
            r2 = this;
            com.squareup.okhttp.OkHttpClient r0 = m461()
            r2.<init>()
            r2.f1169 = r0
            com.squareup.okhttp.Cache r1 = new com.squareup.okhttp.Cache     // Catch: java.io.IOException -> L11
            r1.<init>(r3, r4)     // Catch: java.io.IOException -> L11
            r0.setCache(r1)     // Catch: java.io.IOException -> L11
        L11:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static com.squareup.okhttp.OkHttpClient m461() {
            com.squareup.okhttp.OkHttpClient r0 = new com.squareup.okhttp.OkHttpClient
            r0.<init>()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2 = 15000(0x3a98, double:7.411E-320)
            r0.setConnectTimeout(r2, r1)
            r2 = 20000(0x4e20, double:9.8813E-320)
            r0.setReadTimeout(r2, r1)
            r0.setWriteTimeout(r2, r1)
            return r0
    }

    @Override // p000.x1
    /* JADX INFO: renamed from: ۥ */
    public final ۟.x1.a mo458(android.net.Uri r5, int r6) {
            r4 = this;
            if (r6 == 0) goto L27
            boolean r0 = p000.c4.m101(r6)
            if (r0 == 0) goto Lb
            com.squareup.okhttp.CacheControl r0 = com.squareup.okhttp.CacheControl.FORCE_CACHE
            goto L28
        Lb:
            com.squareup.okhttp.CacheControl$Builder r0 = new com.squareup.okhttp.CacheControl$Builder
            r0.<init>()
            boolean r1 = p000.c4.m102(r6)
            if (r1 != 0) goto L19
            r0.noCache()
        L19:
            boolean r1 = p000.c4.m103(r6)
            if (r1 != 0) goto L22
            r0.noStore()
        L22:
            com.squareup.okhttp.CacheControl r0 = r0.build()
            goto L28
        L27:
            r0 = 0
        L28:
            com.squareup.okhttp.Request$Builder r1 = new com.squareup.okhttp.Request$Builder
            r1.<init>()
            java.lang.String r5 = r5.toString()
            com.squareup.okhttp.Request$Builder r5 = r1.url(r5)
            if (r0 == 0) goto L3a
            r5.cacheControl(r0)
        L3a:
            com.squareup.okhttp.OkHttpClient r0 = r4.f1169
            com.squareup.okhttp.Request r5 = r5.build()
            com.squareup.okhttp.Call r5 = r0.newCall(r5)
            com.squareup.okhttp.Response r5 = r5.execute()
            int r0 = r5.code()
            r1 = 300(0x12c, float:4.2E-43)
            if (r0 >= r1) goto L6b
            com.squareup.okhttp.Response r6 = r5.cacheResponse()
            if (r6 == 0) goto L58
            r6 = 1
            goto L59
        L58:
            r6 = 0
        L59:
            com.squareup.okhttp.ResponseBody r5 = r5.body()
            ۟.x1$a r0 = new ۟.x1$a
            java.io.InputStream r1 = r5.byteStream()
            long r2 = r5.contentLength()
            r0.<init>(r1, r6, r2)
            return r0
        L6b:
            com.squareup.okhttp.ResponseBody r1 = r5.body()
            r1.close()
            ۟.x1$b r1 = new ۟.x1$b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r3 = " "
            r2.append(r3)
            java.lang.String r5 = r5.message()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.<init>(r5, r6, r0)
            throw r1
    }
}
