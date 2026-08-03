package fb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f3543a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fb.w f3544b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final sf.i f3545c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fb.w f3546d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final sf.i f3547e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final og.k f3548f = null;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            fb.h2.f3543a = r0
            fb.w r0 = new fb.w
            r1 = 3
            r0.<init>(r1)
            fb.h2.f3544b = r0
            bi.c r0 = new bi.c
            r1 = 21
            r0.<init>(r1)
            sf.i r1 = new sf.i
            r1.<init>(r0)
            fb.h2.f3545c = r1
            fb.w r0 = new fb.w
            r1 = 4
            r0.<init>(r1)
            fb.h2.f3546d = r0
            bi.c r0 = new bi.c
            r1 = 22
            r0.<init>(r1)
            sf.i r1 = new sf.i
            r1.<init>(r0)
            fb.h2.f3547e = r1
            og.k r0 = new og.k
            java.lang.String r1 = "(?:\\d{1,3}\\.){3}\\d{1,3}"
            r0.<init>(r1)
            fb.h2.f3548f = r0
            return
    }

    public static java.lang.String a(java.lang.String r1) {
            r0 = 600(0x258, float:8.41E-43)
            java.lang.String r1 = og.m.P0(r0, r1)
            java.lang.String r0 = "[联网搜索错误] "
            java.lang.String r1 = r0.concat(r1)
            return r1
    }

    public static java.lang.String b(java.lang.String r2) {
            java.lang.String r0 = "(?i)https?://[^\\s<>\"']+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            java.util.regex.Matcher r0 = r0.matcher(r2)
            r0.getClass()
            r1 = 0
            og.i r2 = a7.a.b(r0, r1, r2)
            if (r2 == 0) goto L2f
            java.lang.String r2 = r2.c()
            r0 = 12
            char[] r0 = new char[r0]
            r0 = {x0032: FILL_ARRAY_DATA , data: [46, 44, 59, 58, -244, 12290, -229, -230, 41, -247, 93, 12305} // fill-array
            java.lang.String r2 = og.m.U0(r2, r0)
            if (r2 == 0) goto L2f
            okhttp3.HttpUrl r0 = r(r2)
            if (r0 == 0) goto L2f
            return r2
        L2f:
            r2 = 0
            return r2
    }

    public static fb.c2 c(java.lang.String r16, fb.b r17, java.util.Map r18, int r19, int r20) {
            r1 = r17
            java.util.Set r2 = r1.f3401b
            r0 = r20 & 4
            if (r0 == 0) goto Lb
            tf.u r0 = tf.u.f13168g
            goto Ld
        Lb:
            r0 = r18
        Ld:
            java.lang.String r3 = ""
            okhttp3.HttpUrl r4 = r(r16)
            if (r4 == 0) goto L274
            java.lang.String r5 = r4.host()
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r5 = j8.b.l(r6, r5, r6)
            java.lang.String r6 = "localhost"
            boolean r6 = r5.equals(r6)
            r7 = 0
            if (r6 != 0) goto L44
            java.lang.String r6 = ".localhost"
            r8 = 0
            boolean r6 = og.t.W(r5, r6, r8)
            if (r6 != 0) goto L44
            java.lang.String r6 = ".local"
            boolean r6 = og.t.W(r5, r6, r8)
            if (r6 != 0) goto L44
            java.lang.String r6 = ".internal"
            boolean r5 = og.t.W(r5, r6, r8)
            if (r5 == 0) goto L42
            goto L44
        L42:
            r14 = r7
            goto L47
        L44:
            java.lang.String r5 = "拒绝访问本地网络地址"
            r14 = r5
        L47:
            if (r14 == 0) goto L56
            fb.c2 r8 = new fb.c2
            r13 = 0
            r15 = 31
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return r8
        L56:
            okhttp3.Request$Builder r5 = new okhttp3.Request$Builder
            r5.<init>()
            okhttp3.Request$Builder r4 = r5.url(r4)
            java.lang.String r5 = "User-Agent"
            java.lang.String r6 = "Mozilla/5.0 (Linux; Android 14) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Mobile Safari/537.36 Hchat-Plugin-Agent/1.1"
            okhttp3.Request$Builder r4 = r4.header(r5, r6)
            java.lang.String r5 = "Accept"
            java.lang.String r6 = "text/html,application/xhtml+xml,application/json,application/xml;q=0.9,text/plain;q=0.8,*/*;q=0.5"
            okhttp3.Request$Builder r4 = r4.header(r5, r6)
            java.lang.String r5 = "Accept-Language"
            java.lang.String r6 = "zh-CN,zh;q=0.9,en;q=0.6"
            okhttp3.Request$Builder r4 = r4.header(r5, r6)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L7f:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L9b
            java.lang.Object r5 = r0.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            r4.header(r6, r5)
            goto L7f
        L9b:
            okhttp3.Request$Builder r0 = r4.get()
            okhttp3.Request r0 = r0.build()
            sf.i r4 = fb.h2.f3547e
            java.lang.Object r4 = r4.getValue()
            okhttp3.OkHttpClient r4 = (okhttp3.OkHttpClient) r4
            okhttp3.Call r4 = r4.newCall(r0)
            r1.a(r4)
            okhttp3.Response r5 = r4.execute()     // Catch: java.lang.Throwable -> L217
            r1.d()     // Catch: java.lang.Throwable -> Lda
            boolean r0 = r5.isSuccessful()     // Catch: java.lang.Throwable -> Lda
            r6 = 2
            if (r0 != 0) goto L154
            java.lang.String r0 = "Retry-After"
            java.lang.String r0 = okhttp3.Response.header$default(r5, r0, r7, r6, r7)     // Catch: java.lang.Throwable -> Lda
            if (r0 == 0) goto Lde
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lda
            r8.<init>()     // Catch: java.lang.Throwable -> Lda
            java.lang.String r9 = ", Retry-After="
            r8.append(r9)     // Catch: java.lang.Throwable -> Lda
            r8.append(r0)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Throwable -> Lda
            goto Ldf
        Lda:
            r0 = move-exception
            r6 = r0
            goto L219
        Lde:
            r0 = r7
        Ldf:
            if (r0 != 0) goto Le2
            r0 = r3
        Le2:
            java.lang.String r8 = "X-RateLimit-Remaining"
            java.lang.String r8 = okhttp3.Response.header$default(r5, r8, r7, r6, r7)     // Catch: java.lang.Throwable -> Lda
            if (r8 == 0) goto L11a
            java.lang.String r9 = "X-RateLimit-Reset"
            java.lang.String r6 = okhttp3.Response.header$default(r5, r9, r7, r6, r7)     // Catch: java.lang.Throwable -> Lda
            if (r6 == 0) goto L103
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lda
            r7.<init>()     // Catch: java.lang.Throwable -> Lda
            java.lang.String r9 = ", reset="
            r7.append(r9)     // Catch: java.lang.Throwable -> Lda
            r7.append(r6)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Lda
        L103:
            if (r7 != 0) goto L106
            r7 = r3
        L106:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lda
            r6.<init>()     // Catch: java.lang.Throwable -> Lda
            java.lang.String r9 = ", rateLimitRemaining="
            r6.append(r9)     // Catch: java.lang.Throwable -> Lda
            r6.append(r8)     // Catch: java.lang.Throwable -> Lda
            r6.append(r7)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r7 = r6.toString()     // Catch: java.lang.Throwable -> Lda
        L11a:
            if (r7 != 0) goto L11d
            r7 = r3
        L11d:
            fb.c2 r8 = new fb.c2     // Catch: java.lang.Throwable -> Lda
            int r9 = r5.code()     // Catch: java.lang.Throwable -> Lda
            okhttp3.Request r6 = r5.request()     // Catch: java.lang.Throwable -> Lda
            okhttp3.HttpUrl r6 = r6.url()     // Catch: java.lang.Throwable -> Lda
            java.lang.String r10 = r6.toString()     // Catch: java.lang.Throwable -> Lda
            int r6 = r5.code()     // Catch: java.lang.Throwable -> Lda
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lda
            r11.<init>()     // Catch: java.lang.Throwable -> Lda
            java.lang.String r12 = "HTTP "
            r11.append(r12)     // Catch: java.lang.Throwable -> Lda
            r11.append(r6)     // Catch: java.lang.Throwable -> Lda
            r11.append(r0)     // Catch: java.lang.Throwable -> Lda
            r11.append(r7)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r14 = r11.toString()     // Catch: java.lang.Throwable -> Lda
            r15 = 28
            r11 = 0
            r12 = 0
            r13 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> Lda
            goto L210
        L154:
            java.lang.String r0 = "Content-Type"
            java.lang.String r0 = okhttp3.Response.header$default(r5, r0, r7, r6, r7)     // Catch: java.lang.Throwable -> Lda
            if (r0 != 0) goto L15e
            r9 = r3
            goto L15f
        L15e:
            r9 = r0
        L15f:
            boolean r0 = og.m.t0(r9)     // Catch: java.lang.Throwable -> Lda
            if (r0 != 0) goto L1cb
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Throwable -> Lda
            java.lang.String r0 = j8.b.l(r0, r9, r0)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r6 = "text/"
            r7 = 0
            boolean r6 = og.t.d0(r0, r6, r7)     // Catch: java.lang.Throwable -> Lda
            if (r6 != 0) goto L19c
            java.lang.String r6 = "json"
            boolean r6 = og.m.h0(r0, r6, r7)     // Catch: java.lang.Throwable -> Lda
            if (r6 != 0) goto L19c
            java.lang.String r6 = "xml"
            boolean r6 = og.m.h0(r0, r6, r7)     // Catch: java.lang.Throwable -> Lda
            if (r6 != 0) goto L19c
            java.lang.String r6 = "javascript"
            boolean r6 = og.m.h0(r0, r6, r7)     // Catch: java.lang.Throwable -> Lda
            if (r6 != 0) goto L19c
            java.lang.String r6 = "markdown"
            boolean r6 = og.m.h0(r0, r6, r7)     // Catch: java.lang.Throwable -> Lda
            if (r6 != 0) goto L19c
            java.lang.String r6 = "github.raw"
            boolean r0 = og.m.h0(r0, r6, r7)     // Catch: java.lang.Throwable -> Lda
            if (r0 == 0) goto L19d
        L19c:
            r7 = 1
        L19d:
            if (r7 != 0) goto L1cb
            fb.c2 r6 = new fb.c2     // Catch: java.lang.Throwable -> Lda
            int r7 = r5.code()     // Catch: java.lang.Throwable -> Lda
            okhttp3.Request r0 = r5.request()     // Catch: java.lang.Throwable -> Lda
            okhttp3.HttpUrl r0 = r0.url()     // Catch: java.lang.Throwable -> Lda
            java.lang.String r8 = r0.toString()     // Catch: java.lang.Throwable -> Lda
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lda
            r0.<init>()     // Catch: java.lang.Throwable -> Lda
            java.lang.String r10 = "响应类型不可读取: "
            r0.append(r10)     // Catch: java.lang.Throwable -> Lda
            r0.append(r9)     // Catch: java.lang.Throwable -> Lda
            java.lang.String r12 = r0.toString()     // Catch: java.lang.Throwable -> Lda
            r13 = 24
            r10 = 0
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> Lda
        L1c9:
            r8 = r6
            goto L210
        L1cb:
            okhttp3.ResponseBody r0 = r5.body()     // Catch: java.lang.Throwable -> Lda
            if (r0 == 0) goto L1f4
            r6 = r19
            fb.e2 r0 = n(r0, r6)     // Catch: java.lang.Throwable -> Lda
            fb.c2 r6 = new fb.c2     // Catch: java.lang.Throwable -> Lda
            int r7 = r5.code()     // Catch: java.lang.Throwable -> Lda
            okhttp3.Request r8 = r5.request()     // Catch: java.lang.Throwable -> Lda
            okhttp3.HttpUrl r8 = r8.url()     // Catch: java.lang.Throwable -> Lda
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Lda
            java.lang.String r10 = r0.f3514a     // Catch: java.lang.Throwable -> Lda
            boolean r11 = r0.f3515b     // Catch: java.lang.Throwable -> Lda
            r12 = 0
            r13 = 32
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> Lda
            goto L1c9
        L1f4:
            fb.c2 r6 = new fb.c2     // Catch: java.lang.Throwable -> Lda
            int r7 = r5.code()     // Catch: java.lang.Throwable -> Lda
            okhttp3.Request r0 = r5.request()     // Catch: java.lang.Throwable -> Lda
            okhttp3.HttpUrl r0 = r0.url()     // Catch: java.lang.Throwable -> Lda
            java.lang.String r8 = r0.toString()     // Catch: java.lang.Throwable -> Lda
            java.lang.String r12 = "响应为空"
            r13 = 24
            r10 = 0
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> Lda
            goto L1c9
        L210:
            r5.close()     // Catch: java.lang.Throwable -> L217
            r2.remove(r4)
            return r8
        L217:
            r0 = move-exception
            goto L21f
        L219:
            throw r6     // Catch: java.lang.Throwable -> L21a
        L21a:
            r0 = move-exception
            ig.a.i(r5, r6)     // Catch: java.lang.Throwable -> L217
            throw r0     // Catch: java.lang.Throwable -> L217
        L21f:
            boolean r1 = r1.b(r0)     // Catch: java.lang.Throwable -> L263
            r5 = 1
            if (r1 == r5) goto L265
            fb.c2 r6 = new fb.c2     // Catch: java.lang.Throwable -> L263
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.Throwable -> L263
            java.lang.String r1 = r1.getSimpleName()     // Catch: java.lang.Throwable -> L263
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L263
            if (r0 != 0) goto L237
            goto L238
        L237:
            r3 = r0
        L238:
            r0 = 240(0xf0, float:3.36E-43)
            java.lang.String r0 = og.m.P0(r0, r3)     // Catch: java.lang.Throwable -> L263
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L263
            r3.<init>()     // Catch: java.lang.Throwable -> L263
            r3.append(r1)     // Catch: java.lang.Throwable -> L263
            java.lang.String r1 = ": "
            r3.append(r1)     // Catch: java.lang.Throwable -> L263
            r3.append(r0)     // Catch: java.lang.Throwable -> L263
            java.lang.String r12 = r3.toString()     // Catch: java.lang.Throwable -> L263
            r13 = 31
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L263
            r4.getClass()
            r2.remove(r4)
            return r6
        L263:
            r0 = move-exception
            goto L26d
        L265:
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L263
            java.lang.String r1 = "Agent 已中断"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L263
            throw r0     // Catch: java.lang.Throwable -> L263
        L26d:
            r4.getClass()
            r2.remove(r4)
            throw r0
        L274:
            fb.c2 r5 = new fb.c2
            java.lang.String r11 = "URL 无效"
            r12 = 31
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r5
    }

    public static java.lang.String d(fb.d2 r8, java.lang.String r9, java.util.List r10, java.lang.String r11, java.lang.String r12, boolean r13) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[GitHub 文件]\n"
            r0.<init>(r1)
            java.lang.String r1 = r8.f3499a
            java.lang.String r8 = r8.f3500b
            r6 = 0
            r7 = 62
            java.lang.String r3 = "/"
            r4 = 0
            r5 = 0
            r2 = r10
            java.lang.String r10 = tf.m.A1(r2, r3, r4, r5, r6, r7)
            java.lang.String r2 = "路径: "
            java.lang.String r3 = "/"
            java.lang.StringBuilder r8 = bc.e.p(r2, r1, r3, r8, r3)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            r0.append(r8)
            r8 = 10
            r0.append(r8)
            java.lang.String r10 = "分支: "
            java.lang.String r9 = r10.concat(r9)
            r0.append(r9)
            r0.append(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "来源: "
            r8.<init>(r9)
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            r0.append(r8)
            java.lang.String r8 = "\n\n"
            r0.append(r8)
            r0.append(r12)
            if (r13 == 0) goto L5a
            java.lang.String r8 = "\n[文件内容已截断]\n"
            r0.append(r8)
        L5a:
            java.lang.String r8 = r0.toString()
            return r8
    }

    public static okhttp3.HttpUrl e(java.lang.String... r4) {
            java.lang.String r0 = "https://api.github.com"
            okhttp3.HttpUrl r0 = r(r0)
            r0.getClass()
            okhttp3.HttpUrl$Builder r0 = r0.newBuilder()
            int r1 = r4.length
            r2 = 0
        Lf:
            if (r2 >= r1) goto L19
            r3 = r4[r2]
            r0.addPathSegment(r3)
            int r2 = r2 + 1
            goto Lf
        L19:
            okhttp3.HttpUrl r4 = r0.build()
            return r4
    }

    public static java.lang.String f(fb.d2 r2, java.lang.String r3, java.util.List r4) {
            java.lang.String r0 = "https://raw.githubusercontent.com"
            okhttp3.HttpUrl r0 = r(r0)
            r0.getClass()
            okhttp3.HttpUrl$Builder r0 = r0.newBuilder()
            java.lang.String r1 = r2.f3499a
            okhttp3.HttpUrl$Builder r0 = r0.addPathSegment(r1)
            java.lang.String r2 = r2.f3500b
            okhttp3.HttpUrl$Builder r2 = r0.addPathSegment(r2)
            okhttp3.HttpUrl$Builder r2 = r2.addPathSegment(r3)
            java.util.Iterator r3 = r4.iterator()
        L21:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L31
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r2.addPathSegment(r4)
            goto L21
        L31:
            okhttp3.HttpUrl r2 = r2.build()
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static boolean g(java.lang.String r2) {
            boolean r0 = h(r2)
            r1 = 0
            if (r0 == 0) goto L11
            java.lang.String r0 = "[网页搜索结果]"
            boolean r2 = og.m.h0(r2, r0, r1)
            if (r2 == 0) goto L11
            r2 = 1
            return r2
        L11:
            return r1
    }

    public static boolean h(java.lang.String r2) {
            r2.getClass()
            java.lang.CharSequence r2 = og.m.V0(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "[联网搜索错误]"
            r1 = 0
            boolean r2 = og.t.d0(r2, r0, r1)
            return r2
    }

    public static boolean i(java.net.InetAddress r5) {
            boolean r0 = r5.isAnyLocalAddress()
            r1 = 1
            if (r0 != 0) goto Lf4
            boolean r0 = r5.isLoopbackAddress()
            if (r0 != 0) goto Lf4
            boolean r0 = r5.isLinkLocalAddress()
            if (r0 != 0) goto Lf4
            boolean r0 = r5.isSiteLocalAddress()
            if (r0 != 0) goto Lf4
            boolean r0 = r5.isMulticastAddress()
            if (r0 == 0) goto L21
            goto Lf4
        L21:
            java.lang.String r5 = r5.getHostAddress()
            if (r5 != 0) goto L29
            java.lang.String r5 = ""
        L29:
            r0 = 37
            java.lang.String r5 = og.m.M0(r5, r0)
            char[] r0 = new char[r1]
            r2 = 46
            r3 = 0
            r0[r3] = r2
            r2 = 6
            java.util.List r0 = og.m.F0(r5, r0, r2)
            int r2 = r0.size()
            r4 = 4
            if (r2 != r4) goto Ld4
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L49
            goto L66
        L49:
            java.util.Iterator r2 = r0.iterator()
        L4d:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L66
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Integer r4 = og.t.f0(r4)
            if (r4 == 0) goto L61
            r4 = r1
            goto L62
        L61:
            r4 = r3
        L62:
            if (r4 != 0) goto L4d
            goto Ld4
        L66:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r2 = tf.n.e1(r0)
            r5.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L73:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L8b
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            int r2 = java.lang.Integer.parseInt(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.add(r2)
            goto L73
        L8b:
            java.lang.Object r0 = r5.get(r3)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Object r5 = r5.get(r1)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            if (r0 == 0) goto Lf4
            r2 = 10
            if (r0 == r2) goto Lf4
            r2 = 127(0x7f, float:1.78E-43)
            if (r0 == r2) goto Lf4
            r2 = 100
            if (r0 != r2) goto Lb6
            r2 = 64
            if (r2 > r5) goto Lb6
            r2 = 128(0x80, float:1.8E-43)
            if (r5 >= r2) goto Lb6
            goto Lf4
        Lb6:
            r2 = 169(0xa9, float:2.37E-43)
            if (r0 != r2) goto Lbe
            r2 = 254(0xfe, float:3.56E-43)
            if (r5 == r2) goto Lf4
        Lbe:
            r2 = 172(0xac, float:2.41E-43)
            if (r0 != r2) goto Lcb
            r2 = 16
            if (r2 > r5) goto Lcb
            r2 = 32
            if (r5 >= r2) goto Lcb
            goto Lf4
        Lcb:
            r2 = 192(0xc0, float:2.69E-43)
            if (r0 != r2) goto Lf3
            r0 = 168(0xa8, float:2.35E-43)
            if (r5 != r0) goto Lf3
            goto Lf4
        Ld4:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r5 = j8.b.l(r0, r5, r0)
            java.lang.String r0 = "::1"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto Lf4
            java.lang.String r0 = "fc"
            boolean r0 = og.t.d0(r5, r0, r3)
            if (r0 != 0) goto Lf4
            java.lang.String r0 = "fd"
            boolean r5 = og.t.d0(r5, r0, r3)
            if (r5 == 0) goto Lf3
            goto Lf4
        Lf3:
            return r3
        Lf4:
            return r1
    }

    public static java.lang.String j(java.lang.String r2) {
            r0 = 160(0xa0, float:2.24E-43)
            r1 = 32
            java.lang.String r2 = og.t.b0(r2, r0, r1)
            java.lang.String r0 = "[ \\t]+"
            java.lang.String r1 = " "
            java.lang.String r2 = j8.b.h(r0, r2, r1)
            java.lang.String r0 = "\n{3,}"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            java.lang.String r1 = "\n\n"
            java.util.regex.Matcher r2 = r0.matcher(r2)
            java.lang.String r2 = r2.replaceAll(r1)
            r2.getClass()
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static java.net.InetAddress k(java.lang.String r6) {
            r0 = 1
            char[] r1 = new char[r0]
            r2 = 46
            r3 = 0
            r1[r3] = r2
            r2 = 6
            java.util.List r6 = og.m.F0(r6, r1, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = tf.n.e1(r6)
            r1.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L1a:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r6.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Integer r2 = og.t.f0(r2)
            if (r2 == 0) goto L77
            r1.add(r2)
            goto L1a
        L30:
            int r6 = r1.size()
            r2 = 4
            if (r6 != r2) goto L77
            boolean r6 = r1.isEmpty()
            if (r6 == 0) goto L3e
            goto L5e
        L3e:
            java.util.Iterator r6 = r1.iterator()
        L42:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L5e
            java.lang.Object r4 = r6.next()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r4 < 0) goto L5a
            r5 = 256(0x100, float:3.59E-43)
            if (r4 >= r5) goto L5a
            r4 = r0
            goto L5b
        L5a:
            r4 = r3
        L5b:
            if (r4 != 0) goto L42
            goto L77
        L5e:
            byte[] r6 = new byte[r2]
        L60:
            if (r3 >= r2) goto L72
            java.lang.Object r0 = r1.get(r3)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            byte r0 = (byte) r0
            r6[r3] = r0
            int r3 = r3 + 1
            goto L60
        L72:
            java.net.InetAddress r6 = java.net.InetAddress.getByAddress(r6)
            return r6
        L77:
            r6 = 0
            return r6
    }

    public static java.lang.String l(java.lang.String r14, fb.b r15) {
            r0 = 0
            r1 = 524288(0x80000, float:7.34684E-40)
            r2 = 20
            fb.c2 r1 = c(r14, r15, r0, r1, r2)
            java.lang.String r3 = r1.f3460d
            java.lang.String r4 = r1.f3458b
            java.lang.String r5 = r1.f3462f
            java.lang.String r6 = "\n\n"
            java.lang.String r7 = ""
            r8 = 1
            java.lang.String r9 = "来源: "
            r10 = 0
            if (r5 == 0) goto L7b
            java.lang.String r0 = "SSLHandshakeException"
            boolean r0 = og.m.h0(r5, r0, r10)
            if (r0 != 0) goto L31
            java.lang.String r0 = "UnknownHostException"
            boolean r0 = og.m.h0(r5, r0, r10)
            if (r0 != 0) goto L31
            java.lang.String r0 = "connection closed"
            boolean r0 = og.m.h0(r5, r0, r8)
            if (r0 == 0) goto L35
        L31:
            java.lang.String r7 = q(r14, r15)
        L35:
            boolean r15 = og.m.t0(r7)
            java.lang.String r0 = "读取页面失败: "
            if (r15 != 0) goto L72
            boolean r15 = h(r7)
            if (r15 != 0) goto L72
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = r0.concat(r5)
            java.lang.String r0 = a(r0)
            r15.append(r0)
            java.lang.String r0 = "\n已附上搜索候选，不能将其当作网页正文。\n"
            r15.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r9)
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            r15.append(r14)
            r15.append(r6)
            r15.append(r7)
            java.lang.String r14 = r15.toString()
            return r14
        L72:
            java.lang.String r14 = r0.concat(r5)
            java.lang.String r14 = a(r14)
            return r14
        L7b:
            java.lang.String r14 = r1.f3459c
            java.util.Locale r15 = java.util.Locale.US
            java.lang.String r14 = j8.b.l(r15, r14, r15)
            java.lang.String r15 = "json"
            boolean r15 = og.m.h0(r14, r15, r10)
            java.lang.String r1 = "[网页内容]\n"
            if (r15 != 0) goto L22e
            java.lang.String r15 = "xml"
            boolean r15 = og.m.h0(r14, r15, r10)
            if (r15 != 0) goto L22e
            java.lang.String r15 = "text/plain"
            boolean r15 = og.t.d0(r14, r15, r10)
            if (r15 == 0) goto L9f
            goto L22e
        L9f:
            boolean r15 = og.m.t0(r14)
            if (r15 != 0) goto Lc0
            java.lang.String r15 = "html"
            boolean r15 = og.m.h0(r14, r15, r10)
            if (r15 != 0) goto Lc0
            java.lang.String r15 = "text/"
            boolean r15 = og.t.d0(r14, r15, r10)
            if (r15 != 0) goto Lc0
            java.lang.String r15 = "页面不是可读取的文本内容: "
            java.lang.String r14 = r15.concat(r14)
            java.lang.String r14 = a(r14)
            return r14
        Lc0:
            java.lang.String r14 = "(?is)<(script|style|noscript|svg)[^>]*>.*?</\\1>"
            java.util.regex.Pattern r14 = java.util.regex.Pattern.compile(r14)
            r14.getClass()
            java.lang.String r15 = " "
            java.util.regex.Matcher r14 = r14.matcher(r3)
            java.lang.String r14 = r14.replaceAll(r15)
            r14.getClass()
            android.text.Spanned r14 = android.text.Html.fromHtml(r14, r10)
            r14.getClass()
            java.lang.String r15 = "(?is)<title[^>]*>(.*?)</title>"
            java.util.regex.Pattern r15 = java.util.regex.Pattern.compile(r15)
            r15.getClass()
            java.util.regex.Matcher r15 = r15.matcher(r3)
            r15.getClass()
            og.i r15 = a7.a.b(r15, r10, r3)
            if (r15 == 0) goto L10e
            java.util.List r15 = r15.a()
            java.lang.Object r15 = tf.m.w1(r8, r15)
            java.lang.String r15 = (java.lang.String) r15
            if (r15 == 0) goto L10e
            android.text.Spanned r15 = android.text.Html.fromHtml(r15, r10)
            r15.getClass()
            java.lang.String r15 = r15.toString()
            java.lang.String r0 = j(r15)
        L10e:
            if (r0 != 0) goto L111
            goto L112
        L111:
            r7 = r0
        L112:
            java.lang.String r15 = r14.toString()
            java.lang.String r15 = j(r15)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            int r3 = r14.length()
            java.lang.Class<android.text.style.URLSpan> r5 = android.text.style.URLSpan.class
            java.lang.Object[] r3 = r14.getSpans(r10, r3, r5)
            r3.getClass()
            int r5 = r3.length
            r6 = r10
        L12e:
            if (r6 >= r5) goto L188
            r8 = r3[r6]
            android.text.style.URLSpan r8 = (android.text.style.URLSpan) r8
            java.lang.String r11 = r8.getURL()
            r11.getClass()
            okhttp3.HttpUrl r11 = r(r11)
            if (r11 == 0) goto L185
            java.lang.String r11 = r11.toString()
            if (r11 == 0) goto L185
            java.lang.String r12 = "http://"
            boolean r12 = og.t.d0(r11, r12, r10)
            if (r12 != 0) goto L158
            java.lang.String r12 = "https://"
            boolean r12 = og.t.d0(r11, r12, r10)
            if (r12 != 0) goto L158
            goto L185
        L158:
            int r12 = r14.getSpanStart(r8)
            if (r12 >= 0) goto L15f
            r12 = r10
        L15f:
            int r8 = r14.getSpanEnd(r8)
            int r13 = r14.length()
            if (r8 <= r13) goto L16a
            r8 = r13
        L16a:
            java.lang.CharSequence r8 = r14.subSequence(r12, r8)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = j(r8)
            r12 = 180(0xb4, float:2.52E-43)
            java.lang.String r8 = og.m.P0(r12, r8)
            boolean r12 = og.m.t0(r8)
            if (r12 != 0) goto L185
            r0.putIfAbsent(r11, r8)
        L185:
            int r6 = r6 + 1
            goto L12e
        L188:
            java.util.ArrayList r14 = new java.util.ArrayList
            int r3 = r0.size()
            r14.<init>(r3)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L199:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1ba
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r5 = r3.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            fb.f2 r6 = new fb.f2
            r6.<init>(r3, r5)
            r14.add(r6)
            goto L199
        L1ba:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            boolean r1 = og.m.t0(r7)
            r3 = 10
            if (r1 != 0) goto L1d9
            r1 = 400(0x190, float:5.6E-43)
            java.lang.String r1 = og.m.P0(r1, r7)
            java.lang.String r5 = "标题: "
            java.lang.String r1 = r5.concat(r1)
            r0.append(r1)
            r0.append(r3)
        L1d9:
            java.lang.String r1 = r9.concat(r4)
            r0.append(r1)
            r0.append(r3)
            boolean r1 = r14.isEmpty()
            if (r1 != 0) goto L223
            java.lang.String r1 = "链接:\n"
            r0.append(r1)
            java.util.List r14 = tf.m.L1(r2, r14)
            java.util.Iterator r14 = r14.iterator()
        L1f6:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L223
            java.lang.Object r1 = r14.next()
            fb.f2 r1 = (fb.f2) r1
            java.lang.String r2 = r1.f3520a
            java.lang.String r1 = r1.f3521b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "- "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = ": "
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.append(r1)
            r0.append(r3)
            goto L1f6
        L223:
            r0.append(r3)
            r0.append(r15)
            java.lang.String r14 = r0.toString()
            return r14
        L22e:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r1)
            java.lang.String r15 = r9.concat(r4)
            r14.append(r15)
            r14.append(r6)
            java.lang.String r15 = j(r3)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            return r14
    }

    public static java.lang.String m(fb.d2 r22, java.lang.String r23, fb.b r24) {
            r1 = r22
            r2 = r23
            r3 = r24
            java.lang.String r4 = r1.f3499a
            java.lang.String r7 = r1.f3500b
            java.lang.String r5 = "repos"
            java.lang.String[] r0 = new java.lang.String[]{r5, r4, r7}
            okhttp3.HttpUrl r0 = e(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r11 = "Accept"
            java.lang.String r12 = "application/vnd.github+json"
            java.util.Map r6 = java.util.Collections.singletonMap(r11, r12)
            r6.getClass()
            r8 = 98304(0x18000, float:1.37753E-40)
            r13 = 16
            fb.c2 r0 = c(r0, r3, r6, r8, r13)
            java.lang.String r6 = r0.f3462f
            java.lang.String r14 = "地址: "
            java.lang.String r15 = "/"
            java.lang.String r10 = "仓库: "
            java.lang.String r13 = "[GitHub 仓库]\n"
            java.lang.String r16 = "README.md"
            java.lang.String r8 = "main"
            if (r6 == 0) goto L127
            java.lang.String r0 = "master"
            java.lang.String[] r0 = new java.lang.String[]{r8, r0}
            java.util.List r0 = a.a.y0(r0)
            java.util.Iterator r0 = r0.iterator()
        L4a:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L85
            java.lang.Object r5 = r0.next()
            java.lang.String r5 = (java.lang.String) r5
            java.util.List r8 = a.a.x0(r16)
            java.lang.String r8 = f(r1, r5, r8)
            r9 = 0
            r11 = 20
            r12 = 163840(0x28000, float:2.29589E-40)
            fb.c2 r8 = c(r8, r3, r9, r12, r11)
            java.lang.String r9 = r8.f3462f
            if (r9 != 0) goto L76
            java.lang.String r9 = r8.f3460d
            boolean r9 = og.m.t0(r9)
            if (r9 != 0) goto L76
            r9 = r8
            goto L77
        L76:
            r9 = 0
        L77:
            if (r9 == 0) goto L81
            java.lang.String r8 = r9.f3460d
            sf.e r9 = new sf.e
            r9.<init>(r5, r8)
            goto L82
        L81:
            r9 = 0
        L82:
            if (r9 == 0) goto L4a
            goto L86
        L85:
            r9 = 0
        L86:
            if (r9 == 0) goto Led
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r13)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r10)
            r1.append(r4)
            r1.append(r15)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            r1 = 10
            r0.append(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r14)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.append(r2)
            r0.append(r1)
            java.lang.Object r2 = r9.f12418g
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "默认分支候选: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = "GitHub API: "
            java.lang.String r1 = r1.concat(r6)
            r0.append(r1)
            java.lang.String r1 = "\n\n[README]\n"
            r0.append(r1)
            java.lang.Object r1 = r9.f12419h
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = j(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        Led:
            java.lang.String r0 = l(r23, r24)
            boolean r1 = h(r0)
            if (r1 == 0) goto L120
            java.lang.String r1 = "[联网搜索错误]"
            java.lang.String r0 = og.m.A0(r0, r1)
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "读取 GitHub 仓库失败: "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r2 = "；"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r0 = a(r0)
            return r0
        L120:
            java.lang.String r1 = "\n\nGitHub API: "
            java.lang.String r0 = wb.en.h(r0, r1, r6)
            return r0
        L127:
            r19 = 10
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L132
            java.lang.String r0 = r0.f3460d     // Catch: java.lang.Throwable -> L132
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L132
        L130:
            r9 = r6
            goto L139
        L132:
            r0 = move-exception
            sf.f r6 = new sf.f
            r6.<init>(r0)
            goto L130
        L139:
            boolean r0 = r9 instanceof sf.f
            if (r0 == 0) goto L13e
            r9 = 0
        L13e:
            r0 = r9
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            if (r0 == 0) goto L396
            java.lang.String r6 = "default_branch"
            java.lang.String r6 = r0.optString(r6, r8)
            boolean r9 = og.m.t0(r6)
            if (r9 == 0) goto L150
            goto L151
        L150:
            r8 = r6
        L151:
            java.lang.String r6 = "readme"
            java.lang.String[] r5 = new java.lang.String[]{r5, r4, r7, r6}
            okhttp3.HttpUrl r5 = e(r5)
            java.lang.String r5 = r5.toString()
            sf.e r6 = new sf.e
            java.lang.String r9 = "application/vnd.github.raw"
            r6.<init>(r11, r9)
            sf.e r9 = new sf.e
            r20 = r7
            java.lang.String r7 = "X-GitHub-Api-Version"
            r21 = r10
            java.lang.String r10 = "2022-11-28"
            r9.<init>(r7, r10)
            sf.e[] r6 = new sf.e[]{r6, r9}
            java.util.Map r6 = tf.y.b0(r6)
            r7 = 163840(0x28000, float:2.29589E-40)
            r9 = 16
            fb.c2 r5 = c(r5, r3, r6, r7, r9)
            java.lang.String r6 = r5.f3462f
            if (r6 != 0) goto L18a
            r9 = 0
            goto L1aa
        L18a:
            java.util.List r6 = a.a.x0(r16)
            java.lang.String r6 = f(r1, r8, r6)
            r9 = 0
            r10 = 20
            fb.c2 r6 = c(r6, r3, r9, r7, r10)
            java.lang.String r7 = r6.f3462f
            if (r7 != 0) goto L1a6
            java.lang.String r7 = r6.f3460d
            boolean r7 = og.m.t0(r7)
            if (r7 != 0) goto L1a6
            goto L1a7
        L1a6:
            r6 = r9
        L1a7:
            if (r6 == 0) goto L1aa
            r5 = r6
        L1aa:
            java.lang.String r6 = r5.f3460d
            java.lang.String r5 = r5.f3462f
            java.lang.String r1 = r1.f3499a
            r10 = r8
            java.lang.String r8 = "git"
            r18 = r9
            java.lang.String r9 = "trees"
            r7 = r5
            java.lang.String r5 = "repos"
            r22 = r6
            r16 = r7
            r17 = r14
            r14 = r19
            r7 = r20
            r6 = r1
            r1 = r21
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r8, r9, r10}
            okhttp3.HttpUrl r5 = e(r5)
            okhttp3.HttpUrl$Builder r5 = r5.newBuilder()
            java.lang.String r6 = "recursive"
            java.lang.String r8 = "1"
            okhttp3.HttpUrl$Builder r5 = r5.addQueryParameter(r6, r8)
            okhttp3.HttpUrl r5 = r5.build()
            java.lang.String r5 = r5.toString()
            java.util.Map r6 = java.util.Collections.singletonMap(r11, r12)
            r6.getClass()
            r8 = 393216(0x60000, float:5.51013E-40)
            r9 = 16
            fb.c2 r3 = c(r5, r3, r6, r8, r9)
            java.lang.String r5 = r3.f3460d
            java.lang.String r3 = r3.f3462f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r13)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r4)
            r8.append(r15)
            r8.append(r7)
            java.lang.String r4 = r8.toString()
            java.lang.String r7 = "full_name"
            java.lang.String r4 = r0.optString(r7, r4)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r1)
            r7.append(r4)
            java.lang.String r1 = r7.toString()
            r6.append(r1)
            r6.append(r14)
            java.lang.String r1 = "html_url"
            java.lang.String r1 = r0.optString(r1, r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r7 = r17
            r4.<init>(r7)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r6.append(r1)
            r6.append(r14)
            java.lang.String r1 = "description"
            java.lang.String r4 = ""
            java.lang.String r9 = bc.e.l(r1, r4, r0)
            boolean r1 = og.m.t0(r9)
            if (r1 != 0) goto L24e
            goto L250
        L24e:
            r9 = r18
        L250:
            if (r9 == 0) goto L264
            r1 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r1 = og.m.P0(r1, r9)
            java.lang.String r7 = "简介: "
            java.lang.String r1 = r7.concat(r1)
            r6.append(r1)
            r6.append(r14)
        L264:
            java.lang.String r1 = "默认分支: "
            java.lang.String r1 = r1.concat(r10)
            r6.append(r1)
            r6.append(r14)
            java.lang.String r1 = "language"
            java.lang.String r9 = r0.optString(r1, r4)
            r9.getClass()
            boolean r1 = og.m.t0(r9)
            if (r1 != 0) goto L280
            goto L282
        L280:
            r9 = r18
        L282:
            if (r9 == 0) goto L290
            java.lang.String r1 = "主要语言: "
            java.lang.String r1 = r1.concat(r9)
            r6.append(r1)
            r6.append(r14)
        L290:
            java.lang.String r1 = "stargazers_count"
            r7 = 0
            int r1 = r0.optInt(r1, r7)
            java.lang.String r8 = "forks_count"
            int r0 = r0.optInt(r8, r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Stars: "
            r8.<init>(r9)
            r8.append(r1)
            java.lang.String r1 = "，Forks: "
            r8.append(r1)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            r6.append(r0)
            r6.append(r14)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "来源: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r6.append(r0)
            r6.append(r14)
            if (r16 != 0) goto L2e4
            boolean r0 = og.m.t0(r22)
            if (r0 != 0) goto L2e4
            java.lang.String r0 = "\n[README]\n"
            r6.append(r0)
            java.lang.String r0 = j(r22)
            r6.append(r0)
            r6.append(r14)
        L2e4:
            if (r3 != 0) goto L373
            boolean r0 = og.m.t0(r5)
            if (r0 != 0) goto L373
            java.lang.String r0 = "\n[文件树]\n"
            r6.append(r0)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2f8
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L2f8
            r9 = r0
            goto L2ff
        L2f8:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r9 = r1
        L2ff:
            boolean r0 = r9 instanceof sf.f
            if (r0 == 0) goto L305
            r9 = r18
        L305:
            org.json.JSONObject r9 = (org.json.JSONObject) r9
            if (r9 == 0) goto L36b
            java.lang.String r0 = "tree"
            org.json.JSONArray r0 = r9.optJSONArray(r0)
            if (r0 == 0) goto L368
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r0.length()
            r5 = 800(0x320, float:1.121E-42)
            int r2 = java.lang.Math.min(r2, r5)
            r8 = r7
        L321:
            if (r8 < r2) goto L343
            int r0 = r0.length()
            if (r0 > r5) goto L331
            java.lang.String r0 = "truncated"
            boolean r0 = r9.optBoolean(r0, r7)
            if (r0 == 0) goto L336
        L331:
            java.lang.String r0 = "... 文件树过长，以上为前 800 项\n"
            r1.append(r0)
        L336:
            java.lang.String r0 = r1.toString()
            java.lang.CharSequence r0 = og.m.T0(r0)
            java.lang.String r0 = r0.toString()
            goto L36d
        L343:
            org.json.JSONObject r10 = r0.optJSONObject(r8)
            if (r10 == 0) goto L365
            java.lang.String r11 = "type"
            java.lang.String r12 = "blob"
            java.lang.String r11 = r10.optString(r11, r12)
            r1.append(r11)
            java.lang.String r11 = " "
            r1.append(r11)
            java.lang.String r11 = "path"
            java.lang.String r10 = r10.optString(r11, r4)
            r1.append(r10)
            r1.append(r14)
        L365:
            int r8 = r8 + 1
            goto L321
        L368:
            java.lang.String r0 = "文件树为空"
            goto L36d
        L36b:
            java.lang.String r0 = "文件树 JSON 无法解析"
        L36d:
            r6.append(r0)
            r6.append(r14)
        L373:
            if (r16 == 0) goto L383
            java.lang.String r0 = "README: "
            r7 = r16
            java.lang.String r0 = r0.concat(r7)
            r6.append(r0)
            r6.append(r14)
        L383:
            if (r3 == 0) goto L391
            java.lang.String r0 = "文件树: "
            java.lang.String r0 = r0.concat(r3)
            r6.append(r0)
            r6.append(r14)
        L391:
            java.lang.String r0 = r6.toString()
            return r0
        L396:
            java.lang.String r0 = "GitHub 仓库返回的 JSON 无法解析"
            java.lang.String r0 = a(r0)
            return r0
    }

    public static fb.e2 n(okhttp3.ResponseBody r7, int r8) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = 65536(0x10000, float:9.1835E-41)
            int r1 = java.lang.Math.min(r8, r1)
            r0.<init>(r1)
            java.io.InputStream r1 = r7.byteStream()
            r2 = 8192(0x2000, float:1.148E-41)
            byte[] r3 = new byte[r2]     // Catch: java.lang.Throwable -> L29
            r4 = 0
            r5 = r4
        L15:
            if (r5 >= r8) goto L2b
            int r6 = r8 - r5
            int r6 = java.lang.Math.min(r2, r6)     // Catch: java.lang.Throwable -> L29
            int r6 = r1.read(r3, r4, r6)     // Catch: java.lang.Throwable -> L29
            if (r6 > 0) goto L24
            goto L2b
        L24:
            r0.write(r3, r4, r6)     // Catch: java.lang.Throwable -> L29
            int r5 = r5 + r6
            goto L15
        L29:
            r7 = move-exception
            goto L5f
        L2b:
            if (r5 < r8) goto L35
            int r8 = r1.read()     // Catch: java.lang.Throwable -> L29
            r2 = -1
            if (r8 == r2) goto L35
            r4 = 1
        L35:
            r8 = 0
            ig.a.i(r1, r8)
            okhttp3.MediaType r7 = r7.contentType()
            if (r7 == 0) goto L48
            java.nio.charset.Charset r8 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.charset.Charset r7 = r7.charset(r8)
            if (r7 == 0) goto L48
            goto L4a
        L48:
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8
        L4a:
            fb.e2 r8 = new fb.e2
            byte[] r0 = r0.toByteArray()
            r0.getClass()
            r7.getClass()
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0, r7)
            r8.<init>(r1, r4)
            return r8
        L5f:
            throw r7     // Catch: java.lang.Throwable -> L60
        L60:
            r8 = move-exception
            ig.a.i(r1, r7)
            throw r8
    }

    public static java.lang.String o(java.lang.String r23, fb.b r24) {
            r0 = r24
            okhttp3.HttpUrl r1 = r(r23)
            if (r1 == 0) goto L2e3
            java.lang.String r2 = r1.host()
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r2 = j8.b.l(r3, r2, r3)
            java.lang.String r3 = "github.com"
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L22
            java.lang.String r3 = "www.github.com"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L2c9
        L22:
            java.util.List r3 = r1.pathSegments()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L2f:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L46
            java.lang.Object r5 = r3.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = og.m.t0(r6)
            if (r6 != 0) goto L2f
            r4.add(r5)
            goto L2f
        L46:
            int r3 = r4.size()
            r5 = 2
            if (r3 < r5) goto L2c9
            fb.d2 r6 = new fb.d2
            r3 = 0
            java.lang.Object r7 = r4.get(r3)
            java.lang.String r7 = (java.lang.String) r7
            r8 = 1
            java.lang.Object r8 = r4.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = ".git"
            java.lang.String r8 = og.m.B0(r8, r9)
            r6.<init>(r7, r8)
            java.lang.Object r5 = tf.m.w1(r5, r4)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L75
            java.util.Locale r10 = java.util.Locale.US
            java.lang.String r5 = j8.b.l(r10, r5, r10)
            goto L76
        L75:
            r5 = 0
        L76:
            java.lang.String r10 = "blob"
            boolean r10 = gg.l.a(r5, r10)
            java.lang.String r12 = "Accept"
            java.lang.String r13 = "ref"
            java.lang.String r14 = "contents"
            java.lang.String r15 = "repos"
            r3 = 4
            r11 = 3
            java.lang.String r9 = ""
            if (r10 == 0) goto L195
            java.lang.Object r5 = tf.m.w1(r11, r4)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L93
            r5 = r9
        L93:
            java.util.List r3 = tf.m.q1(r3, r4)
            boolean r4 = og.m.t0(r5)
            if (r4 != 0) goto L2c9
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L2c9
            r10 = r9
            java.lang.String r9 = r1.toString()
            java.lang.String[] r1 = new java.lang.String[]{r15, r7, r8, r14}
            okhttp3.HttpUrl r1 = e(r1)
            okhttp3.HttpUrl$Builder r1 = r1.newBuilder()
            java.util.Iterator r2 = r3.iterator()
        Lb8:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto Lc8
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            r1.addPathSegment(r4)
            goto Lb8
        Lc8:
            okhttp3.HttpUrl$Builder r1 = r1.addQueryParameter(r13, r5)
            okhttp3.HttpUrl r1 = r1.build()
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = f(r6, r5, r3)
            r4 = 20
            r7 = 524288(0x80000, float:7.34684E-40)
            r8 = 0
            fb.c2 r2 = c(r2, r0, r8, r7, r4)
            r4 = r10
            java.lang.String r10 = r2.f3460d
            java.lang.String r11 = r2.f3462f
            if (r11 != 0) goto Lf7
            boolean r13 = og.m.t0(r10)
            if (r13 != 0) goto Lf7
            boolean r11 = r2.f3461e
            r8 = r3
            r7 = r5
            java.lang.String r0 = d(r6, r7, r8, r9, r10, r11)
            return r0
        Lf7:
            r16 = r8
            r8 = r3
            java.lang.String r2 = "application/vnd.github.raw"
            java.util.Map r2 = java.util.Collections.singletonMap(r12, r2)
            r2.getClass()
            r3 = 16
            fb.c2 r1 = c(r1, r0, r2, r7, r3)
            java.lang.String r0 = r1.f3462f
            if (r0 == 0) goto L12d
            if (r11 == 0) goto L110
            goto L112
        L110:
            java.lang.String r11 = "raw 文件为空"
        L112:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "读取 GitHub 文件失败: "
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r2 = "；"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r0 = a(r0)
            return r0
        L12d:
            java.lang.String r2 = r1.f3460d
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L135
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L135
            goto L13c
        L135:
            r0 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r0)
            r0 = r3
        L13c:
            boolean r3 = r0 instanceof sf.f
            if (r3 == 0) goto L143
            r0 = r16
        L143:
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            if (r0 == 0) goto L18c
            java.lang.String r3 = "content"
            java.lang.String r0 = r0.optString(r3, r4)
            r0.getClass()
            java.lang.String r3 = "\\s+"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            r3.getClass()
            java.util.regex.Matcher r0 = r3.matcher(r0)
            java.lang.String r0 = r0.replaceAll(r4)
            r0.getClass()
            boolean r3 = og.m.t0(r0)
            if (r3 == 0) goto L16b
            goto L18c
        L16b:
            r10 = 0
            byte[] r0 = android.util.Base64.decode(r0, r10)     // Catch: java.lang.Throwable -> L17e
            r0.getClass()     // Catch: java.lang.Throwable -> L17e
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L17e
            r3.getClass()     // Catch: java.lang.Throwable -> L17e
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L17e
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L17e
            goto L184
        L17e:
            r0 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r0)
        L184:
            boolean r0 = r4 instanceof sf.f
            if (r0 == 0) goto L189
            goto L18a
        L189:
            r2 = r4
        L18a:
            java.lang.String r2 = (java.lang.String) r2
        L18c:
            r10 = r2
            boolean r11 = r1.f3461e
            r7 = r5
            java.lang.String r0 = d(r6, r7, r8, r9, r10, r11)
            return r0
        L195:
            r16 = r9
            r9 = r6
            r6 = r16
            r16 = 0
            java.lang.String r10 = "tree"
            boolean r10 = gg.l.a(r5, r10)
            if (r10 == 0) goto L2be
            java.lang.Object r5 = tf.m.w1(r11, r4)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L1ad
            r5 = r6
        L1ad:
            boolean r10 = og.m.t0(r5)
            if (r10 != 0) goto L2c9
            java.util.List r17 = tf.m.q1(r3, r4)
            java.lang.String r1 = r1.toString()
            java.lang.String[] r2 = new java.lang.String[]{r15, r7, r8, r14}
            okhttp3.HttpUrl r2 = e(r2)
            okhttp3.HttpUrl$Builder r2 = r2.newBuilder()
            java.util.Iterator r3 = r17.iterator()
        L1cb:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L1db
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r2.addPathSegment(r4)
            goto L1cb
        L1db:
            okhttp3.HttpUrl$Builder r2 = r2.addQueryParameter(r13, r5)
            okhttp3.HttpUrl r2 = r2.build()
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "application/vnd.github+json"
            java.util.Map r3 = java.util.Collections.singletonMap(r12, r3)
            r3.getClass()
            r4 = 393216(0x60000, float:5.51013E-40)
            r7 = 16
            fb.c2 r2 = c(r2, r0, r3, r4, r7)
            java.lang.String r3 = r2.f3462f
            if (r3 == 0) goto L218
            java.lang.String r0 = l(r1, r0)
            boolean r1 = h(r0)
            if (r1 == 0) goto L211
            java.lang.String r0 = "读取 GitHub 目录失败: "
            java.lang.String r0 = r0.concat(r3)
            java.lang.String r0 = a(r0)
            return r0
        L211:
            java.lang.String r1 = "\n\nGitHub 目录 API: "
            java.lang.String r0 = wb.en.h(r0, r1, r3)
            return r0
        L218:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L220
            java.lang.String r2 = r2.f3460d     // Catch: java.lang.Throwable -> L220
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L220
            goto L227
        L220:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L227:
            boolean r2 = r0 instanceof sf.f
            if (r2 == 0) goto L22e
            r0 = r16
        L22e:
            org.json.JSONArray r0 = (org.json.JSONArray) r0
            if (r0 == 0) goto L2b7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[GitHub 目录]\n"
            r2.<init>(r3)
            r21 = 0
            r22 = 62
            java.lang.String r18 = "/"
            r19 = 0
            r20 = 0
            java.lang.String r3 = tf.m.A1(r17, r18, r19, r20, r21, r22)
            java.lang.String r4 = "路径: "
            java.lang.String r7 = r9.f3499a
            java.lang.String r9 = "/"
            java.lang.StringBuilder r4 = bc.e.p(r4, r7, r9, r8, r9)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.append(r3)
            r3 = 10
            r2.append(r3)
            java.lang.String r4 = "分支: "
            java.lang.String r4 = r4.concat(r5)
            r2.append(r4)
            r2.append(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "来源: "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r2.append(r1)
            r2.append(r3)
            int r1 = r0.length()
            r4 = 800(0x320, float:1.121E-42)
            int r1 = java.lang.Math.min(r1, r4)
            r4 = 0
        L28b:
            if (r4 < r1) goto L292
            java.lang.String r0 = r2.toString()
            goto L2bd
        L292:
            org.json.JSONObject r5 = r0.optJSONObject(r4)
            if (r5 == 0) goto L2b4
            java.lang.String r7 = "type"
            java.lang.String r8 = "file"
            java.lang.String r7 = r5.optString(r7, r8)
            r2.append(r7)
            java.lang.String r7 = " "
            r2.append(r7)
            java.lang.String r7 = "path"
            java.lang.String r5 = r5.optString(r7, r6)
            r2.append(r5)
            r2.append(r3)
        L2b4:
            int r4 = r4 + 1
            goto L28b
        L2b7:
            java.lang.String r0 = "GitHub 目录返回的 JSON 无法解析"
            java.lang.String r0 = a(r0)
        L2bd:
            return r0
        L2be:
            if (r5 != 0) goto L2c9
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = m(r9, r1, r0)
            return r0
        L2c9:
            java.lang.String r3 = "raw.githubusercontent.com"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L2da
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = l(r1, r0)
            return r0
        L2da:
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = l(r1, r0)
            return r0
        L2e3:
            java.lang.String r0 = "URL 无效: "
            r1 = r23
            java.lang.String r0 = r0.concat(r1)
            java.lang.String r0 = a(r0)
            return r0
    }

    public static java.lang.String p(java.lang.String r11, fb.b r12) {
            r11.getClass()
            java.lang.CharSequence r11 = og.m.R0(r11)
            java.lang.String r11 = r11.toString()
            r0 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r11 = og.m.P0(r0, r11)
            boolean r0 = og.m.t0(r11)
            if (r0 == 0) goto L1e
            java.lang.String r11 = "模型没有提供搜索关键词"
            java.lang.String r11 = a(r11)
            return r11
        L1e:
            r12.d()
            java.lang.String r0 = b(r11)
            if (r0 == 0) goto L2c
            java.lang.String r11 = o(r0, r12)
            return r11
        L2c:
            java.lang.String r0 = "(?i)(?:www\\.)?github\\.com/[^\\s<>\"']+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            java.util.regex.Matcher r0 = r0.matcher(r11)
            r0.getClass()
            r1 = 0
            og.i r0 = a7.a.b(r0, r1, r11)
            r2 = 0
            if (r0 == 0) goto L60
            java.lang.String r0 = r0.c()
            r3 = 12
            char[] r3 = new char[r3]
            r3 = {x02e0: FILL_ARRAY_DATA , data: [46, 44, 59, 58, -244, 12290, -229, -230, 41, -247, 93, 12305} // fill-array
            java.lang.String r0 = og.m.U0(r0, r3)
            java.lang.String r3 = "https://"
            java.lang.String r0 = wb.en.g(r3, r0)
            okhttp3.HttpUrl r3 = r(r0)
            if (r3 == 0) goto L60
            goto L61
        L60:
            r0 = r2
        L61:
            if (r0 == 0) goto L68
            java.lang.String r11 = o(r0, r12)
            return r11
        L68:
            java.lang.String r0 = "(?i)(?:github\\.com/)([^/\\s?#]+)/([^/\\s?#]+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            java.util.regex.Matcher r0 = r0.matcher(r11)
            r0.getClass()
            og.i r0 = a7.a.b(r0, r1, r11)
            java.lang.String r3 = "github"
            r4 = 1
            if (r0 == 0) goto L82
            goto Lbf
        L82:
            java.lang.String r0 = "^\\s*([A-Za-z0-9_.-]{1,64})/([A-Za-z0-9_.-]{1,100})\\s*$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            java.util.regex.Matcher r0 = r0.matcher(r11)
            r0.getClass()
            boolean r5 = r0.matches()
            if (r5 != 0) goto L9a
            r0 = r2
            goto La0
        L9a:
            og.i r5 = new og.i
            r5.<init>(r0, r11)
            r0 = r5
        La0:
            if (r0 == 0) goto La3
            goto Lbf
        La3:
            boolean r0 = og.m.h0(r11, r3, r4)
            if (r0 == 0) goto Lbe
            java.lang.String r0 = "(?<![A-Za-z0-9_.-])([A-Za-z0-9_.-]{1,64})/([A-Za-z0-9_.-]{1,100})(?![A-Za-z0-9_.-])"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            java.util.regex.Matcher r0 = r0.matcher(r11)
            r0.getClass()
            og.i r0 = a7.a.b(r0, r1, r11)
            goto Lbf
        Lbe:
            r0 = r2
        Lbf:
            if (r0 != 0) goto Lc3
        Lc1:
            r6 = r2
            goto L116
        Lc3:
            java.util.List r5 = r0.a()
            og.g r5 = (og.g) r5
            java.lang.Object r5 = r5.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.CharSequence r5 = og.m.R0(r5)
            java.lang.String r5 = r5.toString()
            java.util.List r0 = r0.a()
            og.g r0 = (og.g) r0
            r6 = 2
            java.lang.Object r0 = r0.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            r6 = 4
            char[] r6 = new char[r6]
            r6 = {x02f0: FILL_ARRAY_DATA , data: [46, 44, -244, 12290} // fill-array
            java.lang.String r0 = og.m.U0(r0, r6)
            java.lang.String r6 = ".git"
            java.lang.String r0 = og.m.B0(r0, r6)
            boolean r6 = og.m.t0(r5)
            if (r6 != 0) goto Lc1
            boolean r6 = og.m.t0(r0)
            if (r6 != 0) goto Lc1
            java.lang.String r6 = "v1"
            boolean r6 = r5.equalsIgnoreCase(r6)
            if (r6 == 0) goto L111
            goto Lc1
        L111:
            fb.d2 r6 = new fb.d2
            r6.<init>(r5, r0)
        L116:
            if (r6 == 0) goto L129
            java.lang.String r11 = r6.f3499a
            java.lang.String r0 = r6.f3500b
            java.lang.String r1 = "https://github.com/"
            java.lang.String r2 = "/"
            java.lang.String r11 = bc.e.j(r1, r11, r2, r0)
            java.lang.String r11 = m(r6, r11, r12)
            return r11
        L129:
            boolean r0 = og.m.h0(r11, r3, r4)
            if (r0 == 0) goto L2db
            java.lang.String r0 = "(?i)github(?:\\.com)?"
            java.lang.String r3 = " "
            java.lang.String r0 = j8.b.h(r0, r11, r3)
            java.lang.String r4 = "\\s+"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)
            r4.getClass()
            java.util.regex.Matcher r0 = r4.matcher(r0)
            java.lang.String r0 = r0.replaceAll(r3)
            r0.getClass()
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            boolean r3 = og.m.t0(r0)
            if (r3 == 0) goto L15a
            goto L15b
        L15a:
            r11 = r0
        L15b:
            java.lang.String r0 = "search"
            java.lang.String r3 = "repositories"
            java.lang.String[] r0 = new java.lang.String[]{r0, r3}
            okhttp3.HttpUrl r0 = e(r0)
            okhttp3.HttpUrl$Builder r0 = r0.newBuilder()
            java.lang.String r3 = "q"
            okhttp3.HttpUrl$Builder r0 = r0.addQueryParameter(r3, r11)
            java.lang.String r3 = "per_page"
            java.lang.String r4 = "8"
            okhttp3.HttpUrl$Builder r0 = r0.addQueryParameter(r3, r4)
            okhttp3.HttpUrl r0 = r0.build()
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "Accept"
            java.lang.String r4 = "application/vnd.github+json"
            java.util.Map r3 = java.util.Collections.singletonMap(r3, r4)
            r3.getClass()
            r4 = 262144(0x40000, float:3.67342E-40)
            r5 = 16
            fb.c2 r3 = c(r0, r12, r3, r4, r5)
            java.lang.String r4 = r3.f3462f
            java.lang.String r5 = "[GitHub 仓库搜索]\n"
            r6 = 10
            if (r4 == 0) goto L1d0
            java.lang.String r0 = "site:github.com "
            java.lang.String r11 = r0.concat(r11)
            java.lang.String r11 = q(r11, r12)
            boolean r12 = h(r11)
            if (r12 != 0) goto L1c5
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r5)
            java.lang.String r0 = "GitHub API: "
            java.lang.String r0 = r0.concat(r4)
            r12.append(r0)
            r12.append(r6)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            return r11
        L1c5:
            java.lang.String r11 = "GitHub 仓库搜索失败: "
            java.lang.String r11 = r11.concat(r4)
            java.lang.String r11 = a(r11)
            return r11
        L1d0:
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L1d8
            java.lang.String r3 = r3.f3460d     // Catch: java.lang.Throwable -> L1d8
            r12.<init>(r3)     // Catch: java.lang.Throwable -> L1d8
            goto L1df
        L1d8:
            r12 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r12)
            r12 = r3
        L1df:
            boolean r3 = r12 instanceof sf.f
            if (r3 == 0) goto L1e5
            r12 = r2
        L1e5:
            org.json.JSONObject r12 = (org.json.JSONObject) r12
            if (r12 == 0) goto L2d4
            java.lang.String r3 = "items"
            org.json.JSONArray r12 = r12.optJSONArray(r3)
            if (r12 == 0) goto L2cd
            int r3 = r12.length()
            if (r3 != 0) goto L1f9
            goto L2cd
        L1f9:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r5)
            java.lang.String r4 = "查询: "
            java.lang.String r11 = r4.concat(r11)
            r3.append(r11)
            r3.append(r6)
            int r11 = r12.length()
            r4 = 8
            int r11 = java.lang.Math.min(r11, r4)
            r4 = r1
        L215:
            if (r4 < r11) goto L234
            r3.append(r6)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "来源: "
            r11.<init>(r12)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r3.append(r11)
            r3.append(r6)
            java.lang.String r11 = r3.toString()
            goto L2da
        L234:
            org.json.JSONObject r5 = r12.optJSONObject(r4)
            if (r5 == 0) goto L2c9
            r3.append(r6)
            int r7 = r4 + 1
            java.lang.String r8 = "full_name"
            java.lang.String r9 = "未命名仓库"
            java.lang.String r8 = r5.optString(r8, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            java.lang.String r7 = ". "
            r9.append(r7)
            r9.append(r8)
            java.lang.String r7 = r9.toString()
            r3.append(r7)
            r3.append(r6)
            java.lang.String r7 = "html_url"
            java.lang.String r8 = ""
            java.lang.String r7 = r5.optString(r7, r8)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "地址: "
            r9.<init>(r10)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r3.append(r7)
            r3.append(r6)
            java.lang.String r7 = "description"
            java.lang.String r7 = bc.e.l(r7, r8, r5)
            boolean r8 = og.m.t0(r7)
            if (r8 != 0) goto L28a
            goto L28b
        L28a:
            r7 = r2
        L28b:
            if (r7 == 0) goto L29f
            r8 = 700(0x2bc, float:9.81E-43)
            java.lang.String r7 = og.m.P0(r8, r7)
            java.lang.String r8 = "简介: "
            java.lang.String r7 = r8.concat(r7)
            r3.append(r7)
            r3.append(r6)
        L29f:
            java.lang.String r7 = "language"
            java.lang.String r8 = "未知"
            java.lang.String r7 = r5.optString(r7, r8)
            java.lang.String r8 = "stargazers_count"
            int r5 = r5.optInt(r8, r1)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "语言: "
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r7 = "，Stars: "
            r8.append(r7)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r3.append(r5)
            r3.append(r6)
        L2c9:
            int r4 = r4 + 1
            goto L215
        L2cd:
            java.lang.String r11 = "GitHub 没有找到匹配的公开仓库"
            java.lang.String r11 = a(r11)
            goto L2da
        L2d4:
            java.lang.String r11 = "GitHub 搜索返回的 JSON 无法解析"
            java.lang.String r11 = a(r11)
        L2da:
            return r11
        L2db:
            java.lang.String r11 = q(r11, r12)
            return r11
    }

    public static java.lang.String q(java.lang.String r17, fb.b r18) {
            r0 = r17
            java.lang.String r1 = "https://html.duckduckgo.com/html/"
            okhttp3.HttpUrl r1 = r(r1)
            if (r1 == 0) goto L260
            okhttp3.HttpUrl$Builder r1 = r1.newBuilder()
            if (r1 == 0) goto L260
            java.lang.String r2 = "q"
            okhttp3.HttpUrl$Builder r1 = r1.addQueryParameter(r2, r0)
            if (r1 == 0) goto L260
            java.lang.String r2 = "kl"
            java.lang.String r3 = "wt-wt"
            okhttp3.HttpUrl$Builder r1 = r1.addQueryParameter(r2, r3)
            if (r1 == 0) goto L260
            okhttp3.HttpUrl r1 = r1.build()
            if (r1 == 0) goto L260
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L260
            java.lang.String r2 = "Accept"
            java.lang.String r3 = "text/html,application/xhtml+xml"
            java.util.Map r2 = java.util.Collections.singletonMap(r2, r3)
            r2.getClass()
            r3 = 393216(0x60000, float:5.51013E-40)
            r4 = 16
            r5 = r18
            fb.c2 r2 = c(r1, r5, r2, r3, r4)
            java.lang.String r3 = r2.f3462f
            if (r3 == 0) goto L52
            java.lang.String r0 = "网页搜索失败: "
            java.lang.String r0 = r0.concat(r3)
            java.lang.String r0 = a(r0)
            return r0
        L52:
            java.lang.String r2 = r2.f3460d
            r3 = 0
            android.text.Spanned r2 = android.text.Html.fromHtml(r2, r3)
            r2.getClass()
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            int r5 = r2.length()
            java.lang.Class<android.text.style.URLSpan> r6 = android.text.style.URLSpan.class
            java.lang.Object[] r5 = r2.getSpans(r3, r5, r6)
            r5.getClass()
            c9.a0 r6 = new c9.a0
            r7 = 15
            r6.<init>(r2, r7)
            java.util.List r5 = tf.l.H0(r5, r6)
            java.util.Iterator r5 = r5.iterator()
        L7d:
            boolean r6 = r5.hasNext()
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L121
            java.lang.Object r6 = r5.next()
            android.text.style.URLSpan r6 = (android.text.style.URLSpan) r6
            java.lang.String r9 = r6.getURL()
            r9.getClass()
            java.lang.String r10 = "//"
            boolean r10 = og.t.d0(r9, r10, r3)
            if (r10 == 0) goto La0
            java.lang.String r10 = "https:"
            java.lang.String r9 = r10.concat(r9)
        La0:
            okhttp3.HttpUrl r9 = r(r9)
            if (r9 == 0) goto Lc6
            java.lang.String r10 = r9.host()
            java.lang.String r11 = "duckduckgo.com"
            boolean r8 = og.t.W(r10, r11, r8)
            if (r8 == 0) goto Lc2
            java.lang.String r8 = "uddg"
            java.lang.String r8 = r9.queryParameter(r8)
            if (r8 == 0) goto Lc6
            okhttp3.HttpUrl r9 = r(r8)
            if (r9 == 0) goto Lc6
            r7 = r8
            goto Lc6
        Lc2:
            java.lang.String r7 = r9.toString()
        Lc6:
            if (r7 == 0) goto L7d
            int r8 = r2.getSpanStart(r6)
            if (r8 >= 0) goto Lcf
            r8 = r3
        Lcf:
            int r6 = r2.getSpanEnd(r6)
            int r9 = r2.length()
            if (r6 <= r9) goto Lda
            r6 = r9
        Lda:
            java.lang.CharSequence r6 = r2.subSequence(r8, r6)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = j(r6)
            boolean r8 = og.m.t0(r6)
            if (r8 == 0) goto Led
            goto L7d
        Led:
            java.lang.Object r8 = r4.get(r7)
            if (r8 != 0) goto Lfb
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r4.put(r7, r8)
        Lfb:
            java.util.List r8 = (java.util.List) r8
            boolean r7 = r8.isEmpty()
            if (r7 == 0) goto L104
            goto L11c
        L104:
            java.util.Iterator r7 = r8.iterator()
        L108:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L11c
            java.lang.Object r9 = r7.next()
            java.lang.String r9 = (java.lang.String) r9
            boolean r9 = og.t.X(r9, r6)
            if (r9 == 0) goto L108
            goto L7d
        L11c:
            r8.add(r6)
            goto L7d
        L121:
            java.util.Set r2 = r4.entrySet()
            r2.getClass()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = tf.n.e1(r2)
            r4.<init>(r5)
            java.util.Iterator r2 = r2.iterator()
        L137:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L1b7
            java.lang.Object r5 = r2.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            r5.getClass()
            java.lang.Object r6 = r5.getKey()
            r6.getClass()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r5.getValue()
            r5.getClass()
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r9 = r5.iterator()
        L15c:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L172
            java.lang.Object r10 = r9.next()
            r11 = r10
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = "http"
            boolean r11 = og.t.d0(r11, r12, r8)
            if (r11 != 0) goto L15c
            goto L173
        L172:
            r10 = r7
        L173:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L178
            goto L17f
        L178:
            java.lang.Object r9 = tf.m.t1(r5)
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
        L17f:
            java.util.List r5 = tf.m.q1(r8, r5)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r5 = r5.iterator()
        L18c:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L1a3
            java.lang.Object r9 = r5.next()
            r12 = r9
            java.lang.String r12 = (java.lang.String) r12
            boolean r12 = gg.l.a(r12, r6)
            if (r12 != 0) goto L18c
            r11.add(r9)
            goto L18c
        L1a3:
            r15 = 0
            r16 = 62
            java.lang.String r12 = " "
            r13 = 0
            r14 = 0
            java.lang.String r5 = tf.m.A1(r11, r12, r13, r14, r15, r16)
            fb.g2 r9 = new fb.g2
            r9.<init>(r10, r6, r5)
            r4.add(r9)
            goto L137
        L1b7:
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L1c4
            java.lang.String r0 = "网页搜索没有找到可读取的结果"
            java.lang.String r0 = a(r0)
            return r0
        L1c4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "[网页搜索结果]\n"
            r2.<init>(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "查询: "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r2.append(r0)
            r0 = 10
            r2.append(r0)
            r5 = 8
            java.util.List r4 = tf.m.L1(r5, r4)
            java.util.Iterator r4 = r4.iterator()
        L1eb:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L24c
            java.lang.Object r5 = r4.next()
            int r6 = r3 + 1
            if (r3 < 0) goto L248
            fb.g2 r5 = (fb.g2) r5
            r2.append(r0)
            java.lang.String r3 = r5.f3532a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r6)
            java.lang.String r9 = ". "
            r8.append(r9)
            r8.append(r3)
            java.lang.String r3 = r8.toString()
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = r5.f3533b
            java.lang.String r8 = "来源: "
            java.lang.String r3 = r8.concat(r3)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = r5.f3534c
            boolean r5 = og.m.t0(r3)
            if (r5 != 0) goto L231
            goto L232
        L231:
            r3 = r7
        L232:
            if (r3 == 0) goto L246
            r5 = 900(0x384, float:1.261E-42)
            java.lang.String r3 = og.m.P0(r5, r3)
            java.lang.String r5 = "摘要: "
            java.lang.String r3 = r5.concat(r3)
            r2.append(r3)
            r2.append(r0)
        L246:
            r3 = r6
            goto L1eb
        L248:
            a.a.Q0()
            throw r7
        L24c:
            r2.append(r0)
            java.lang.String r3 = "搜索来源: "
            java.lang.String r1 = r3.concat(r1)
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        L260:
            java.lang.String r0 = "无法生成网页搜索地址"
            java.lang.String r0 = a(r0)
            return r0
    }

    public static okhttp3.HttpUrl r(java.lang.String r3) {
            okhttp3.HttpUrl$Companion r0 = okhttp3.HttpUrl.Companion     // Catch: java.lang.Throwable -> L7
            okhttp3.HttpUrl r3 = r0.parse(r3)     // Catch: java.lang.Throwable -> L7
            goto Le
        L7:
            r3 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r3)
            r3 = r0
        Le:
            boolean r0 = r3 instanceof sf.f
            r1 = 0
            if (r0 == 0) goto L15
            r3 = r1
        L15:
            okhttp3.HttpUrl r3 = (okhttp3.HttpUrl) r3
            if (r3 == 0) goto L38
            java.lang.String r0 = r3.scheme()
            java.lang.String r2 = "http"
            boolean r0 = gg.l.a(r0, r2)
            if (r0 != 0) goto L34
            java.lang.String r0 = r3.scheme()
            java.lang.String r2 = "https"
            boolean r0 = gg.l.a(r0, r2)
            if (r0 == 0) goto L32
            goto L34
        L32:
            r0 = 0
            goto L35
        L34:
            r0 = 1
        L35:
            if (r0 == 0) goto L38
            r1 = r3
        L38:
            return r1
    }
}
