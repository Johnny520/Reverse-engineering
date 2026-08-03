package ka;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.util.List f7551f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ia.t f7552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.content.Context f7553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ka.g f7554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ka.a f7555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f7556e;

    static {
            java.lang.String r4 = ".ogg"
            java.lang.String r5 = ".wav"
            java.lang.String r0 = ".mp3"
            java.lang.String r1 = ".m4a"
            java.lang.String r2 = ".mp4"
            java.lang.String r3 = ".flac"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5}
            java.util.List r0 = a.a.y0(r0)
            ka.f.f7551f = r0
            return
    }

    public f(android.content.Context r1, ia.t r2) {
            r0 = this;
            r0.<init>()
            r0.f7552a = r2
            android.content.Context r2 = r1.getApplicationContext()
            if (r2 == 0) goto Lc
            goto Ld
        Lc:
            r2 = r1
        Ld:
            r0.f7553b = r2
            ka.g r2 = new ka.g
            r2.<init>(r1)
            r0.f7554c = r2
            ka.a r1 = new ka.a
            r1.<init>()
            r0.f7555d = r1
            c9.q r1 = new c9.q
            r2 = 19
            r1.<init>(r2)
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newSingleThreadExecutor(r1)
            r0.f7556e = r1
            return
    }

    public static void a(java.io.File r1) {
            boolean r0 = r1.exists()
            if (r0 == 0) goto Lf
            boolean r0 = r1.delete()
            if (r0 != 0) goto Lf
            r1.deleteOnExit()
        Lf:
            return
    }

    public static void e(long r3, java.lang.String r5, java.lang.String r6) {
            k8.g r0 = p.a.q()
            if (r0 == 0) goto L16
            r1 = 0
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 <= 0) goto L13
            boolean r3 = r0.u(r3, r5, r6)
            if (r3 == 0) goto L13
            goto L16
        L13:
            r0.x(r5, r6)
        L16:
            return
    }

    public final boolean b(java.io.File r17, java.io.File r18, java.lang.String r19) {
            r16 = this;
            boolean r0 = og.m.t0(r19)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            r2 = 0
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> L131
            r3 = r19
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L131
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> L131
            r0.getClass()     // Catch: java.lang.Throwable -> L131
            r3 = r0
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Throwable -> L131
            r0 = 15000(0x3a98, float:2.102E-41)
            r3.setConnectTimeout(r0)     // Catch: java.lang.Throwable -> L4b
            r0 = 30000(0x7530, float:4.2039E-41)
            r3.setReadTimeout(r0)     // Catch: java.lang.Throwable -> L4b
            r0 = 1
            r3.setInstanceFollowRedirects(r0)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r2 = "User-Agent"
            java.lang.String r4 = "MicroMessenger Client"
            r3.setRequestProperty(r2, r4)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r2 = "Referer"
            java.lang.String r4 = "https://y.qq.com/"
            r3.setRequestProperty(r2, r4)     // Catch: java.lang.Throwable -> L4b
            int r2 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L4b
            r4 = 200(0xc8, float:2.8E-43)
            if (r4 > r2) goto L12c
            r4 = 300(0x12c, float:4.2E-43)
            if (r2 >= r4) goto L12c
            java.lang.String r2 = r3.getContentType()     // Catch: java.lang.Throwable -> L4b
            if (r2 != 0) goto L4f
            java.lang.String r2 = ""
            goto L4f
        L4b:
            r0 = move-exception
            r2 = r3
            goto L132
        L4f:
            r4 = 59
            java.lang.String r2 = og.m.M0(r2, r4)     // Catch: java.lang.Throwable -> L4b
            java.util.Locale r4 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L4b
            java.lang.String r2 = r2.toLowerCase(r4)     // Catch: java.lang.Throwable -> L4b
            r2.getClass()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r4 = "text/"
            boolean r4 = og.t.d0(r2, r4, r1)     // Catch: java.lang.Throwable -> L4b
            if (r4 != 0) goto L12c
            java.lang.String r4 = "json"
            boolean r4 = og.m.h0(r2, r4, r1)     // Catch: java.lang.Throwable -> L4b
            if (r4 != 0) goto L12c
            java.lang.String r4 = "xml"
            boolean r2 = og.m.h0(r2, r4, r1)     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto L78
            goto L12c
        L78:
            long r4 = r3.getContentLengthLong()     // Catch: java.lang.Throwable -> L4b
            r6 = 134217728(0x8000000, double:6.63123685E-316)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L85
            goto L12c
        L85:
            java.io.InputStream r2 = r3.getInputStream()     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto L12c
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L115
            r5 = r17
            r4.<init>(r5, r1)     // Catch: java.lang.Throwable -> L115
            r8 = 8192(0x2000, float:1.148E-41)
            byte[] r8 = new byte[r8]     // Catch: java.lang.Throwable -> L118
            r9 = 0
            r11 = r9
        L99:
            int r13 = r2.read(r8)     // Catch: java.lang.Throwable -> L118
            if (r13 >= 0) goto La1
            r6 = r1
            goto La8
        La1:
            long r14 = (long) r13     // Catch: java.lang.Throwable -> L118
            long r11 = r11 + r14
            int r14 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r14 <= 0) goto L11b
            r6 = r0
        La8:
            r4.flush()     // Catch: java.lang.Throwable -> L118
            r4.close()     // Catch: java.lang.Throwable -> L115
            r2.close()     // Catch: java.lang.Throwable -> L4b
            if (r6 != 0) goto L12c
            boolean r2 = r5.isFile()     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto L12c
            long r6 = r5.length()     // Catch: java.lang.Throwable -> L4b
            int r2 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r2 > 0) goto Lc3
            goto L12c
        Lc3:
            boolean r2 = r18.exists()     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto Ld0
            boolean r2 = r18.delete()     // Catch: java.lang.Throwable -> L4b
            if (r2 != 0) goto Ld0
            goto L12c
        Ld0:
            boolean r2 = r17.renameTo(r18)     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto L12c
            boolean r2 = r18.isFile()     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto L12c
            long r4 = r18.length()     // Catch: java.lang.Throwable -> L4b
            int r2 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r2 <= 0) goto L12c
            android.media.MediaMetadataRetriever r2 = new android.media.MediaMetadataRetriever     // Catch: java.lang.Throwable -> L4b
            r2.<init>()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r4 = r18.getAbsolutePath()     // Catch: java.lang.Throwable -> L10d
            r2.setDataSource(r4)     // Catch: java.lang.Throwable -> L10d
            r4 = 9
            java.lang.String r4 = r2.extractMetadata(r4)     // Catch: java.lang.Throwable -> L10d
            if (r4 == 0) goto L108
            java.lang.Long r4 = og.t.g0(r4)     // Catch: java.lang.Throwable -> L10d
            if (r4 == 0) goto L108
            long r4 = r4.longValue()     // Catch: java.lang.Throwable -> L10d
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 <= 0) goto L108
            r4 = r0
            goto L109
        L108:
            r4 = r1
        L109:
            r2.release()     // Catch: java.lang.Throwable -> L111
            goto L111
        L10d:
            r2.release()     // Catch: java.lang.Throwable -> L110
        L110:
            r4 = r1
        L111:
            if (r4 == 0) goto L12c
            r1 = r0
            goto L12c
        L115:
            r0 = move-exception
            r1 = r0
            goto L126
        L118:
            r0 = move-exception
            r1 = r0
            goto L120
        L11b:
            r4.write(r8, r1, r13)     // Catch: java.lang.Throwable -> L118
            goto L99
        L120:
            throw r1     // Catch: java.lang.Throwable -> L121
        L121:
            r0 = move-exception
            ig.a.i(r4, r1)     // Catch: java.lang.Throwable -> L115
            throw r0     // Catch: java.lang.Throwable -> L115
        L126:
            throw r1     // Catch: java.lang.Throwable -> L127
        L127:
            r0 = move-exception
            ig.a.i(r2, r1)     // Catch: java.lang.Throwable -> L4b
            throw r0     // Catch: java.lang.Throwable -> L4b
        L12c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L4b
            goto L139
        L131:
            r0 = move-exception
        L132:
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
            r3 = r2
        L139:
            java.lang.Throwable r1 = sf.g.b(r0)
            r2 = r16
            if (r1 == 0) goto L148
            ia.t r4 = r2.f7552a
            java.lang.String r5 = "QQ点歌歌曲音频下载失败"
            r4.invoke(r5, r1)
        L148:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r4 = r0 instanceof sf.f
            if (r4 == 0) goto L14f
            r0 = r1
        L14f:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r3 == 0) goto L156
            r3.disconnect()
        L156:
            boolean r0 = r0.booleanValue()
            return r0
    }

    public final ka.d c(java.lang.String r8) {
            r7 = this;
            java.lang.CharSequence r8 = og.m.R0(r8)
            java.lang.String r8 = r8.toString()
            ka.g r0 = r7.f7554c
            java.lang.String r1 = "qq_music_order_triggers"
            java.lang.String r2 = "点歌"
            java.lang.String r1 = r0.d(r1, r2)
            r3 = 3
            char[] r3 = new char[r3]
            r3 = {x00e6: FILL_ARRAY_DATA , data: [44, -244, 10} // fill-array
            r4 = 6
            java.util.List r1 = og.m.F0(r1, r3, r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = tf.n.e1(r1)
            r3.<init>(r5)
            java.util.Iterator r1 = r1.iterator()
        L2a:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L3a
            java.lang.Object r5 = r1.next()
            java.lang.String r5 = (java.lang.String) r5
            j8.b.r(r5, r3)
            goto L2a
        L3a:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r3 = r3.iterator()
        L43:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L5a
            java.lang.Object r5 = r3.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            int r6 = r6.length()
            if (r6 <= 0) goto L43
            r1.add(r5)
            goto L43
        L5a:
            java.util.Set r1 = tf.m.T1(r1)
            java.util.List r1 = tf.m.P1(r1)
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L6c
            java.util.List r1 = a.a.x0(r2)
        L6c:
            java.util.Iterator r1 = r1.iterator()
        L70:
            boolean r2 = r1.hasNext()
            r3 = 0
            r5 = 0
            if (r2 == 0) goto L86
            java.lang.Object r2 = r1.next()
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = og.t.d0(r8, r6, r3)
            if (r6 == 0) goto L70
            goto L87
        L86:
            r2 = r5
        L87:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto Le4
            java.lang.String r8 = og.m.A0(r8, r2)
            java.lang.CharSequence r8 = og.m.R0(r8)
            java.lang.String r8 = r8.toString()
            java.lang.String r1 = "qq_music_order_custom_singer"
            boolean r0 = r0.b(r1, r3)
            r1 = 1
            if (r0 == 0) goto Ld0
            r0 = 38
            int r0 = og.m.q0(r8, r0, r3, r4)
            if (r0 < 0) goto Ld0
            int r2 = r0 + 1
            java.lang.String r2 = r8.substring(r2)
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            int r4 = r2.length()
            if (r4 <= 0) goto Lbe
            r4 = r1
            goto Lbf
        Lbe:
            r4 = r3
        Lbf:
            if (r4 == 0) goto Lc2
            goto Lc3
        Lc2:
            r2 = r5
        Lc3:
            java.lang.String r8 = r8.substring(r3, r0)
            java.lang.CharSequence r8 = og.m.R0(r8)
            java.lang.String r8 = r8.toString()
            goto Ld1
        Ld0:
            r2 = r5
        Ld1:
            int r0 = r8.length()
            if (r0 <= 0) goto Ld8
            r3 = r1
        Ld8:
            if (r3 == 0) goto Ldb
            goto Ldc
        Ldb:
            r8 = r5
        Ldc:
            if (r8 == 0) goto Le4
            ka.d r0 = new ka.d
            r0.<init>(r8, r2)
            return r0
        Le4:
            return r5
    }

    public final void d(java.lang.String r34, long r35, java.lang.String r37, ka.d r38) {
            r33 = this;
            r1 = r33
            r4 = r38
            java.lang.String r5 = r4.f7548a
            ka.a r6 = r1.f7555d
            r6.getClass()
            java.lang.String r7 = "https://c.y.qq.com/lyric/fcgi-bin/fcg_query_lyric_new.fcg?format=json&nobase64=1&songmid="
            java.lang.String r8 = "param"
            java.lang.String r9 = "module"
            java.lang.String r10 = "method"
            java.lang.String r11 = "req"
            java.lang.String r14 = "1882"
            java.lang.String r15 = "cv"
            java.lang.String r2 = "19"
            java.lang.String r4 = "ct"
            java.lang.String r3 = "comm"
            java.lang.String r12 = "https://u.y.qq.com/cgi-bin/musicu.fcg?data="
            sf.e r0 = new sf.e
            java.lang.String r13 = "User-Agent"
            java.lang.String r1 = "Mozilla/5.0 (Linux; Android 13) AppleWebKit/537.36 (KHTML, like Gecko) Mobile Safari/537.36"
            r0.<init>(r13, r1)
            sf.e r1 = new sf.e
            r16 = r13
            java.lang.String r13 = "Referer"
            r17 = r7
            java.lang.String r7 = "https://y.qq.com/"
            r1.<init>(r13, r7)
            r18 = r7
            sf.e r7 = new sf.e
            r19 = r13
            java.lang.String r13 = "Origin"
            r20 = r6
            java.lang.String r6 = "https://y.qq.com"
            r7.<init>(r13, r6)
            sf.e r6 = new sf.e
            java.lang.String r13 = "Accept"
            r21 = r12
            java.lang.String r12 = "application/json, text/plain, */*"
            r6.<init>(r13, r12)
            sf.e[] r0 = new sf.e[]{r0, r1, r7, r6}
            java.util.Map r1 = tf.y.b0(r0)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lcd
            r0.<init>()     // Catch: java.lang.Throwable -> Lcd
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lcd
            r6.<init>()     // Catch: java.lang.Throwable -> Lcd
            org.json.JSONObject r6 = r6.put(r4, r2)     // Catch: java.lang.Throwable -> Lcd
            org.json.JSONObject r6 = r6.put(r15, r14)     // Catch: java.lang.Throwable -> Lcd
            r0.put(r3, r6)     // Catch: java.lang.Throwable -> Lcd
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lcd
            r6.<init>()     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r7 = "DoSearchForQQMusicDesktop"
            r6.put(r10, r7)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r7 = "music.search.SearchCgiService"
            r6.put(r9, r7)     // Catch: java.lang.Throwable -> Lcd
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lcd
            r7.<init>()     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r13 = "num_per_page"
            r12 = 10
            r7.put(r13, r12)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r12 = "page_num"
            r13 = 1
            r7.put(r12, r13)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r12 = "query"
            r7.put(r12, r5)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r12 = "search_type"
            r13 = 0
            r7.put(r12, r13)     // Catch: java.lang.Throwable -> Lcd
            r6.put(r8, r7)     // Catch: java.lang.Throwable -> Lcd
            r0.put(r11, r6)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lcd
            java.nio.charset.Charset r6 = og.a.f9804a     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r6)     // Catch: java.lang.Throwable -> Lcd
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcd
            r7 = r21
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lc9
            r6.append(r0)     // Catch: java.lang.Throwable -> Lc9
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> Lc9
            r6 = r20
            java.lang.String r0 = r6.b(r0, r1)     // Catch: java.lang.Throwable -> Lc7
            org.json.JSONObject r0 = ka.a.d(r0)     // Catch: java.lang.Throwable -> Lc7
            goto Ld8
        Lc7:
            r0 = move-exception
            goto Ld2
        Lc9:
            r0 = move-exception
            r6 = r20
            goto Ld2
        Lcd:
            r0 = move-exception
            r6 = r20
            r7 = r21
        Ld2:
            sf.f r12 = new sf.f
            r12.<init>(r0)
            r0 = r12
        Ld8:
            boolean r12 = r0 instanceof sf.f
            if (r12 == 0) goto Lde
            r0 = 0
        Lde:
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            java.lang.String r12 = "mid"
            java.lang.String r13 = "data"
            r21 = r7
            java.lang.String r7 = ""
            if (r0 == 0) goto Lf0
            r24 = r5
            r23 = r7
            goto L1ce
        Lf0:
            java.lang.String r0 = "https://c.y.qq.com/splcloud/fcgi-bin/smartbox_new.fcg?format=json&inCharset=utf8&outCharset=utf-8&key="
            java.nio.charset.Charset r22 = og.a.f9804a     // Catch: java.lang.Throwable -> L1bb
            r23 = r7
            java.lang.String r7 = r22.name()     // Catch: java.lang.Throwable -> L1b7
            java.lang.String r7 = java.net.URLEncoder.encode(r5, r7)     // Catch: java.lang.Throwable -> L1b7
            r24 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L139
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L139
            r5.append(r7)     // Catch: java.lang.Throwable -> L139
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L139
            java.lang.String r0 = r6.b(r0, r1)     // Catch: java.lang.Throwable -> L139
            if (r0 == 0) goto L1b5
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L139
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L139
            org.json.JSONObject r0 = r5.optJSONObject(r13)     // Catch: java.lang.Throwable -> L139
            if (r0 == 0) goto L13c
            java.lang.String r5 = "song"
            org.json.JSONObject r0 = r0.optJSONObject(r5)     // Catch: java.lang.Throwable -> L139
            if (r0 == 0) goto L13c
            java.lang.String r5 = "itemlist"
            org.json.JSONArray r0 = r0.optJSONArray(r5)     // Catch: java.lang.Throwable -> L139
            if (r0 == 0) goto L13c
            r5 = 0
            org.json.JSONObject r0 = r0.optJSONObject(r5)     // Catch: java.lang.Throwable -> L139
            if (r0 == 0) goto L13c
            java.lang.String r0 = r0.optString(r12)     // Catch: java.lang.Throwable -> L139
            goto L13d
        L139:
            r0 = move-exception
            goto L1c0
        L13c:
            r0 = 0
        L13d:
            if (r0 != 0) goto L141
            r0 = r23
        L141:
            boolean r5 = og.m.t0(r0)     // Catch: java.lang.Throwable -> L139
            if (r5 == 0) goto L148
            goto L1b5
        L148:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L139
            r5.<init>()     // Catch: java.lang.Throwable -> L139
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L139
            r7.<init>()     // Catch: java.lang.Throwable -> L139
            org.json.JSONObject r2 = r7.put(r4, r2)     // Catch: java.lang.Throwable -> L139
            org.json.JSONObject r2 = r2.put(r15, r14)     // Catch: java.lang.Throwable -> L139
            r5.put(r3, r2)     // Catch: java.lang.Throwable -> L139
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L139
            r2.<init>()     // Catch: java.lang.Throwable -> L139
            java.lang.String r4 = "music.pf_song_detail_svr"
            r2.put(r9, r4)     // Catch: java.lang.Throwable -> L139
            java.lang.String r4 = "get_song_detail"
            r2.put(r10, r4)     // Catch: java.lang.Throwable -> L139
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L139
            r4.<init>()     // Catch: java.lang.Throwable -> L139
            java.lang.String r7 = "song_mid"
            org.json.JSONObject r0 = r4.put(r7, r0)     // Catch: java.lang.Throwable -> L139
            r2.put(r8, r0)     // Catch: java.lang.Throwable -> L139
            r5.put(r11, r2)     // Catch: java.lang.Throwable -> L139
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L139
            java.lang.String r2 = r22.name()     // Catch: java.lang.Throwable -> L139
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r2)     // Catch: java.lang.Throwable -> L139
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L139
            r7 = r21
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L139
            r2.append(r0)     // Catch: java.lang.Throwable -> L139
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L139
            java.lang.String r0 = r6.b(r0, r1)     // Catch: java.lang.Throwable -> L139
            if (r0 == 0) goto L1b5
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L139
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L139
            org.json.JSONObject r0 = r1.optJSONObject(r11)     // Catch: java.lang.Throwable -> L139
            if (r0 == 0) goto L1b5
            org.json.JSONObject r0 = r0.optJSONObject(r13)     // Catch: java.lang.Throwable -> L139
            if (r0 == 0) goto L1b5
            java.lang.String r1 = "track_info"
            org.json.JSONObject r0 = r0.optJSONObject(r1)     // Catch: java.lang.Throwable -> L139
            goto L1c6
        L1b5:
            r0 = 0
            goto L1c6
        L1b7:
            r0 = move-exception
            r24 = r5
            goto L1c0
        L1bb:
            r0 = move-exception
            r24 = r5
            r23 = r7
        L1c0:
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L1c6:
            boolean r1 = r0 instanceof sf.f
            if (r1 == 0) goto L1cc
            r0 = 0
        L1cc:
            org.json.JSONObject r0 = (org.json.JSONObject) r0
        L1ce:
            ka.j r1 = ka.j.f7560a
            ka.h r2 = ka.h.f7558a
            if (r0 == 0) goto L209
            java.lang.String r4 = "album"
            org.json.JSONObject r4 = r0.optJSONObject(r4)
            if (r4 == 0) goto L1e3
            java.lang.String r5 = "pmid"
            java.lang.String r4 = r4.optString(r5)
            goto L1e4
        L1e3:
            r4 = 0
        L1e4:
            if (r4 != 0) goto L1e8
            r4 = r23
        L1e8:
            java.lang.String r5 = "file"
            org.json.JSONObject r5 = r0.optJSONObject(r5)
            if (r5 == 0) goto L1f7
            java.lang.String r7 = "media_mid"
            java.lang.String r5 = r5.optString(r7)
            goto L1f8
        L1f7:
            r5 = 0
        L1f8:
            if (r5 != 0) goto L1fc
            r5 = r23
        L1fc:
            java.lang.String r7 = r0.optString(r12)
            r7.getClass()
            boolean r11 = og.m.t0(r7)
            if (r11 == 0) goto L213
        L209:
            r18 = r2
            r19 = r16
            r16 = r1
            r1 = r18
            goto L4e7
        L213:
            java.lang.String r11 = "name"
            java.lang.String r12 = r0.optString(r11)
            boolean r14 = og.m.t0(r12)
            if (r14 == 0) goto L222
            r26 = r24
            goto L224
        L222:
            r26 = r12
        L224:
            java.lang.String r12 = "singer"
            org.json.JSONArray r12 = r0.optJSONArray(r12)
            if (r12 == 0) goto L238
            r14 = 0
            org.json.JSONObject r12 = r12.optJSONObject(r14)
            if (r12 == 0) goto L238
            java.lang.String r11 = r12.optString(r11)
            goto L239
        L238:
            r11 = 0
        L239:
            if (r11 != 0) goto L23e
            r27 = r23
            goto L240
        L23e:
            r27 = r11
        L240:
            java.lang.String r11 = "id"
            r14 = 0
            long r11 = r0.optLong(r11, r14)
            r24 = r14
            r14 = r17
            java.lang.String r0 = r14.concat(r7)     // Catch: java.lang.Throwable -> L29a
            java.lang.String r14 = "Mozilla/5.0"
            sf.e r15 = new sf.e     // Catch: java.lang.Throwable -> L292
            r17 = r4
            r4 = r16
            r15.<init>(r4, r14)     // Catch: java.lang.Throwable -> L28c
            sf.e r14 = new sf.e     // Catch: java.lang.Throwable -> L28c
            r16 = r18
            r18 = r2
            r2 = r16
            r16 = r1
            r1 = r19
            r14.<init>(r1, r2)     // Catch: java.lang.Throwable -> L284
            sf.e[] r1 = new sf.e[]{r15, r14}     // Catch: java.lang.Throwable -> L284
            java.util.Map r1 = tf.y.b0(r1)     // Catch: java.lang.Throwable -> L284
            java.lang.String r0 = r6.b(r0, r1)     // Catch: java.lang.Throwable -> L284
            if (r0 == 0) goto L286
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L284
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L284
            java.lang.String r0 = "lyric"
            java.lang.String r0 = r1.optString(r0)     // Catch: java.lang.Throwable -> L284
            goto L287
        L284:
            r0 = move-exception
            goto L2a3
        L286:
            r0 = 0
        L287:
            if (r0 != 0) goto L2a9
            r0 = r23
            goto L2a9
        L28c:
            r0 = move-exception
            r16 = r1
            r18 = r2
            goto L2a3
        L292:
            r0 = move-exception
            r17 = r4
            r4 = r16
            r18 = r2
            goto L2a1
        L29a:
            r0 = move-exception
            r18 = r2
            r17 = r4
            r4 = r16
        L2a1:
            r16 = r1
        L2a3:
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L2a9:
            boolean r1 = r0 instanceof sf.f
            if (r1 == 0) goto L2b0
            r0 = r23
        L2b0:
            r30 = r0
            java.lang.String r30 = (java.lang.String) r30
            int r0 = (r11 > r24 ? 1 : (r11 == r24 ? 0 : -1))
            java.lang.String r1 = "guid"
            java.lang.String r2 = "music.vkey.GetVkey"
            java.lang.String r14 = "Yun"
            java.lang.String r15 = "request"
            if (r0 <= 0) goto L3e3
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r19 = r4
            org.json.JSONObject r4 = ka.a.c()
            r0.put(r3, r4)
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            r21 = r5
            java.lang.String r5 = "music.qqmusiclite.MtLimitFreeSvr"
            r4.put(r9, r5)
            java.lang.String r5 = "Obtain"
            r4.put(r10, r5)
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r22 = r3
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            org.json.JSONArray r3 = r3.put(r11)
            java.lang.String r11 = "songid"
            org.json.JSONObject r3 = r5.put(r11, r3)
            java.lang.String r5 = "need_ppurl"
            r11 = 1
            org.json.JSONObject r3 = r3.put(r5, r11)
            r4.put(r8, r3)
            r0.put(r15, r4)
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L33e
            r0.getClass()     // Catch: java.lang.Throwable -> L33e
            java.lang.String r0 = r6.e(r0)     // Catch: java.lang.Throwable -> L33e
            if (r0 == 0) goto L340
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L33e
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L33e
            org.json.JSONObject r0 = r3.optJSONObject(r15)     // Catch: java.lang.Throwable -> L33e
            if (r0 == 0) goto L340
            org.json.JSONObject r0 = r0.optJSONObject(r13)     // Catch: java.lang.Throwable -> L33e
            if (r0 == 0) goto L340
            java.lang.String r3 = "tracks"
            org.json.JSONArray r0 = r0.optJSONArray(r3)     // Catch: java.lang.Throwable -> L33e
            if (r0 == 0) goto L340
            r5 = 0
            org.json.JSONObject r0 = r0.optJSONObject(r5)     // Catch: java.lang.Throwable -> L33e
            if (r0 == 0) goto L340
            java.lang.String r3 = "control"
            org.json.JSONObject r0 = r0.optJSONObject(r3)     // Catch: java.lang.Throwable -> L33e
            if (r0 == 0) goto L340
            java.lang.String r3 = "ppurl"
            java.lang.String r0 = r0.optString(r3)     // Catch: java.lang.Throwable -> L33e
            goto L341
        L33e:
            r0 = move-exception
            goto L346
        L340:
            r0 = 0
        L341:
            if (r0 != 0) goto L34c
            r0 = r23
            goto L34c
        L346:
            sf.f r3 = new sf.f
            r3.<init>(r0)
            r0 = r3
        L34c:
            boolean r3 = r0 instanceof sf.f
            if (r3 == 0) goto L353
            r0 = r23
        L353:
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = og.m.t0(r0)
            if (r3 != 0) goto L3e0
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "CgiGetTempVkey"
            org.json.JSONObject r4 = wb.en.l(r9, r2, r10, r4)
            org.json.JSONObject r5 = wb.en.k(r1, r14)
            org.json.JSONArray r11 = new org.json.JSONArray
            r11.<init>()
            java.lang.String r12 = "mediamid"
            r24 = r1
            java.lang.String r1 = "tempVkey"
            org.json.JSONObject r0 = wb.en.l(r12, r14, r1, r0)
            java.lang.String r1 = "songMID"
            r0.put(r1, r7)
            org.json.JSONArray r0 = r11.put(r0)
            java.lang.String r1 = "songlist"
            r5.put(r1, r0)
            r4.put(r8, r5)
            org.json.JSONObject r0 = r3.put(r15, r4)
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3bf
            r0.getClass()     // Catch: java.lang.Throwable -> L3bf
            java.lang.String r0 = r6.e(r0)     // Catch: java.lang.Throwable -> L3bf
            if (r0 == 0) goto L3c1
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L3bf
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L3bf
            org.json.JSONObject r0 = r1.optJSONObject(r15)     // Catch: java.lang.Throwable -> L3bf
            if (r0 == 0) goto L3c1
            org.json.JSONObject r0 = r0.optJSONObject(r13)     // Catch: java.lang.Throwable -> L3bf
            if (r0 == 0) goto L3c1
            org.json.JSONObject r0 = r0.optJSONObject(r13)     // Catch: java.lang.Throwable -> L3bf
            if (r0 == 0) goto L3c1
            org.json.JSONObject r0 = r0.optJSONObject(r14)     // Catch: java.lang.Throwable -> L3bf
            if (r0 == 0) goto L3c1
            java.lang.String r1 = "purl"
            java.lang.String r0 = r0.optString(r1)     // Catch: java.lang.Throwable -> L3bf
            goto L3c2
        L3bf:
            r0 = move-exception
            goto L3c7
        L3c1:
            r0 = 0
        L3c2:
            if (r0 != 0) goto L3cd
            r0 = r23
            goto L3cd
        L3c7:
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L3cd:
            boolean r1 = r0 instanceof sf.f
            if (r1 == 0) goto L3d4
            r0 = r23
        L3d4:
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = og.m.t0(r0)
            if (r1 != 0) goto L3eb
        L3dc:
            r29 = r0
            goto L4b1
        L3e0:
            r24 = r1
            goto L3eb
        L3e3:
            r24 = r1
            r22 = r3
            r19 = r4
            r21 = r5
        L3eb:
            boolean r0 = og.m.t0(r21)
            if (r0 == 0) goto L3f5
            r29 = 0
            goto L4b1
        L3f5:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r1 = ka.a.c()
            r3 = r22
            r0.put(r3, r1)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r1.put(r9, r2)
            java.lang.String r2 = "UrlGetVkey"
            r1.put(r10, r2)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            r3 = r24
            r2.put(r3, r14)
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            org.json.JSONArray r3 = r3.put(r7)
            java.lang.String r4 = "songmid"
            r2.put(r4, r3)
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "M500"
            r4.<init>(r5)
            r5 = r21
            r4.append(r5)
            java.lang.String r5 = ".mp3"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            org.json.JSONArray r3 = r3.put(r4)
            java.lang.String r4 = "filename"
            r2.put(r4, r3)
            r1.put(r8, r2)
            r0.put(r15, r1)
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L485
            r0.getClass()     // Catch: java.lang.Throwable -> L485
            java.lang.String r0 = r6.e(r0)     // Catch: java.lang.Throwable -> L485
            if (r0 == 0) goto L487
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L485
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L485
            org.json.JSONObject r0 = r1.optJSONObject(r15)     // Catch: java.lang.Throwable -> L485
            if (r0 == 0) goto L487
            org.json.JSONObject r0 = r0.optJSONObject(r13)     // Catch: java.lang.Throwable -> L485
            if (r0 == 0) goto L487
            java.lang.String r1 = "midurlinfo"
            org.json.JSONArray r0 = r0.optJSONArray(r1)     // Catch: java.lang.Throwable -> L485
            if (r0 == 0) goto L487
            r5 = 0
            org.json.JSONObject r0 = r0.optJSONObject(r5)     // Catch: java.lang.Throwable -> L485
            if (r0 == 0) goto L487
            java.lang.String r1 = "flowurl"
            java.lang.String r0 = r0.optString(r1)     // Catch: java.lang.Throwable -> L485
            goto L488
        L485:
            r0 = move-exception
            goto L48d
        L487:
            r0 = 0
        L488:
            if (r0 != 0) goto L493
            r0 = r23
            goto L493
        L48d:
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L493:
            boolean r1 = r0 instanceof sf.f
            if (r1 == 0) goto L49a
            r0 = r23
        L49a:
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = og.m.t0(r0)
            if (r1 != 0) goto L4a3
            goto L4a4
        L4a3:
            r0 = 0
        L4a4:
            if (r0 == 0) goto L4ae
            java.lang.String r1 = "https://sjy.stream.qqmusic.qq.com/"
            java.lang.String r0 = r1.concat(r0)
            goto L3dc
        L4ae:
            r0 = 0
            goto L3dc
        L4b1:
            if (r29 == 0) goto L4e5
            boolean r0 = og.m.t0(r17)
            if (r0 != 0) goto L4bc
            r4 = r17
            goto L4bd
        L4bc:
            r4 = 0
        L4bd:
            if (r4 == 0) goto L4c8
            java.lang.String r0 = "https://y.gtimg.cn/music/photo_new/T002R500x500M000"
            java.lang.String r1 = ".jpg"
            java.lang.String r0 = eh.a.n(r0, r4, r1)
            goto L4c9
        L4c8:
            r0 = 0
        L4c9:
            if (r0 != 0) goto L4ce
            r31 = r23
            goto L4d0
        L4ce:
            r31 = r0
        L4d0:
            java.lang.String r0 = "https://y.qq.com/n/ryqq/songDetail/"
            java.lang.String r32 = r0.concat(r7)
            ka.k r25 = new ka.k
            r28 = r7
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)
            r0 = r25
            ka.i r1 = new ka.i
            r1.<init>(r0)
            goto L4e7
        L4e5:
            r1 = r16
        L4e7:
            boolean r0 = r1 instanceof ka.i
            if (r0 == 0) goto L828
            ka.i r1 = (ka.i) r1
            ka.k r1 = r1.f7559a
            java.lang.String r7 = r1.f7564d
            java.lang.String r0 = "qq_music_order_send_as_card"
            r12 = r33
            ka.g r2 = r12.f7554c
            r11 = 1
            boolean r0 = r2.b(r0, r11)
            java.lang.String r3 = "qq_music_order_send_as_voice"
            r5 = 0
            boolean r13 = r2.b(r3, r5)
            if (r0 != 0) goto L511
            if (r13 != 0) goto L511
            java.lang.String r0 = "请至少开启音乐卡片或歌曲语音发送"
            r3 = r34
            r14 = r35
            e(r14, r3, r0)
            return
        L511:
            r3 = r34
            r14 = r35
            if (r0 == 0) goto L710
            r4 = r38
            java.lang.String r0 = r4.f7549b
            java.lang.String r4 = r1.f7562b
            java.lang.String r5 = r1.f7566f
            if (r0 == 0) goto L52f
            boolean r6 = og.m.t0(r0)
            if (r6 == 0) goto L528
            goto L52f
        L528:
            r9 = r37
            r4 = r0
            r6 = r23
            goto L5ea
        L52f:
            java.lang.String r0 = "qq_music_order_custom_singer"
            r6 = 0
            boolean r0 = r2.b(r0, r6)
            if (r0 == 0) goto L55f
            java.lang.String r0 = "qq_music_order_default_singer"
            r6 = r23
            java.lang.String r8 = r2.d(r0, r6)
            java.lang.CharSequence r8 = og.m.R0(r8)
            java.lang.String r8 = r8.toString()
            boolean r8 = og.m.t0(r8)
            if (r8 != 0) goto L561
            java.lang.String r0 = r2.d(r0, r6)
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            r9 = r37
        L55c:
            r4 = r0
            goto L5ea
        L55f:
            r6 = r23
        L561:
            java.lang.String r0 = "qq_music_order_replace_singer_with_nickname"
            r8 = 0
            boolean r0 = r2.b(r0, r8)
            if (r0 == 0) goto L5e8
            boolean r0 = og.m.t0(r37)
            if (r0 != 0) goto L5e8
            g8.i r0 = wb.en.c()
            r9 = r37
            if (r0 == 0) goto L57d
            h.Hchat.hooks.api.model.WeChatContact r10 = r0.n(r9)
            goto L57e
        L57d:
            r10 = 0
        L57e:
            java.lang.String r11 = "@chatroom"
            boolean r11 = og.t.W(r3, r11, r8)
            if (r11 != 0) goto L591
            java.lang.String r11 = "@im.chatroom"
            boolean r11 = og.t.W(r3, r11, r8)
            if (r11 == 0) goto L58f
            goto L591
        L58f:
            r8 = r6
            goto L5b8
        L591:
            g8.d r8 = j8.b.f()
            if (r8 == 0) goto L5a2
            g8.i r8 = r8.f4349b
            if (r8 != 0) goto L59d
            r8 = r9
            goto L5a3
        L59d:
            java.lang.String r8 = r8.v(r3, r9)
            goto L5a3
        L5a2:
            r8 = 0
        L5a3:
            if (r8 != 0) goto L5a6
            r8 = r6
        L5a6:
            boolean r11 = og.m.t0(r8)
            if (r11 == 0) goto L5b8
            if (r0 == 0) goto L5b3
            java.lang.String r0 = r0.t(r3, r9)
            goto L5b4
        L5b3:
            r0 = 0
        L5b4:
            if (r0 != 0) goto L5b7
            goto L58f
        L5b7:
            r8 = r0
        L5b8:
            boolean r0 = og.m.t0(r8)
            if (r0 == 0) goto L5c9
            if (r10 == 0) goto L5c3
            java.lang.String r0 = r10.remarkName
            goto L5c4
        L5c3:
            r0 = 0
        L5c4:
            if (r0 != 0) goto L5c8
            r8 = r6
            goto L5c9
        L5c8:
            r8 = r0
        L5c9:
            boolean r0 = og.m.t0(r8)
            if (r0 == 0) goto L5d9
            if (r10 == 0) goto L5d4
            java.lang.String r0 = r10.nickname
            goto L5d5
        L5d4:
            r0 = 0
        L5d5:
            if (r0 != 0) goto L5da
            r0 = r6
            goto L5da
        L5d9:
            r0 = r8
        L5da:
            boolean r8 = og.m.t0(r0)
            if (r8 != 0) goto L5ea
            boolean r8 = r0.equals(r9)
            if (r8 != 0) goto L5ea
            goto L55c
        L5e8:
            r9 = r37
        L5ea:
            java.lang.String r0 = "qq_music_order_replace_cover_with_avatar"
            r8 = 0
            boolean r0 = r2.b(r0, r8)
            if (r0 == 0) goto L60b
            g8.i r0 = wb.en.c()
            if (r0 == 0) goto L5ff
            r11 = 1
            java.lang.String r0 = r0.m(r9, r11)
            goto L600
        L5ff:
            r0 = 0
        L600:
            if (r0 != 0) goto L603
            r0 = r6
        L603:
            boolean r8 = og.m.t0(r0)
            if (r8 == 0) goto L60a
            goto L60b
        L60a:
            r5 = r0
        L60b:
            r9 = r5
            java.lang.String r0 = "R500x500"
            java.lang.String r5 = "R300x300"
            r8 = 0
            java.lang.String r0 = og.t.a0(r9, r0, r5, r8)
            boolean r5 = og.m.t0(r0)
            if (r5 == 0) goto L620
            r38 = r4
            r10 = 0
            goto L6be
        L620:
            java.net.URL r5 = new java.net.URL     // Catch: java.lang.Throwable -> L69a
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L69a
            java.net.URLConnection r0 = r5.openConnection()     // Catch: java.lang.Throwable -> L69a
            r0.getClass()     // Catch: java.lang.Throwable -> L69a
            r5 = r0
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch: java.lang.Throwable -> L69a
            r0 = 10000(0x2710, float:1.4013E-41)
            r5.setConnectTimeout(r0)     // Catch: java.lang.Throwable -> L696
            r5.setReadTimeout(r0)     // Catch: java.lang.Throwable -> L696
            r11 = 1
            r5.setInstanceFollowRedirects(r11)     // Catch: java.lang.Throwable -> L696
            java.lang.String r0 = "MicroMessenger Client"
            r8 = r19
            r5.setRequestProperty(r8, r0)     // Catch: java.lang.Throwable -> L696
            int r0 = r5.getResponseCode()     // Catch: java.lang.Throwable -> L696
            r8 = 200(0xc8, float:2.8E-43)
            if (r8 > r0) goto L692
            r8 = 300(0x12c, float:4.2E-43)
            if (r0 >= r8) goto L692
            java.io.InputStream r8 = r5.getInputStream()     // Catch: java.lang.Throwable -> L696
            if (r8 == 0) goto L692
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L688
            r0.<init>()     // Catch: java.lang.Throwable -> L688
            r10 = 8192(0x2000, float:1.148E-41)
            byte[] r10 = new byte[r10]     // Catch: java.lang.Throwable -> L688
            r11 = 0
        L65e:
            int r3 = r8.read(r10)     // Catch: java.lang.Throwable -> L688
            if (r3 >= 0) goto L670
            byte[] r0 = r0.toByteArray()     // Catch: java.lang.Throwable -> L66b
            r38 = r4
            goto L678
        L66b:
            r0 = move-exception
            r3 = r0
            r38 = r4
            goto L68c
        L670:
            int r11 = r11 + r3
            r38 = r4
            r4 = 131072(0x20000, float:1.83671E-40)
            if (r11 <= r4) goto L67e
            r0 = 0
        L678:
            r8.close()     // Catch: java.lang.Throwable -> L67c
            goto L6a4
        L67c:
            r0 = move-exception
            goto L69e
        L67e:
            r4 = 0
            r0.write(r10, r4, r3)     // Catch: java.lang.Throwable -> L685
            r4 = r38
            goto L65e
        L685:
            r0 = move-exception
        L686:
            r3 = r0
            goto L68c
        L688:
            r0 = move-exception
            r38 = r4
            goto L686
        L68c:
            throw r3     // Catch: java.lang.Throwable -> L68d
        L68d:
            r0 = move-exception
            ig.a.i(r8, r3)     // Catch: java.lang.Throwable -> L67c
            throw r0     // Catch: java.lang.Throwable -> L67c
        L692:
            r38 = r4
            r0 = 0
            goto L6a4
        L696:
            r0 = move-exception
            r38 = r4
            goto L69e
        L69a:
            r0 = move-exception
            r38 = r4
            r5 = 0
        L69e:
            sf.f r3 = new sf.f
            r3.<init>(r0)
            r0 = r3
        L6a4:
            java.lang.Throwable r3 = sf.g.b(r0)
            if (r3 == 0) goto L6b1
            ia.t r4 = r12.f7552a
            java.lang.String r8 = "QQ点歌封面下载失败"
            r4.invoke(r8, r3)
        L6b1:
            boolean r3 = r0 instanceof sf.f
            if (r3 == 0) goto L6b6
            r0 = 0
        L6b6:
            byte[] r0 = (byte[]) r0
            if (r5 == 0) goto L6bd
            r5.disconnect()
        L6bd:
            r10 = r0
        L6be:
            i8.b r0 = h.Hchat.hooks.api.core.WeChatApis.interaction()
            r0.getClass()
            j8.p r0 = h.Hchat.hooks.api.core.WeChatApis.i()
            if (r0 == 0) goto L704
            java.lang.String r4 = r1.f7561a
            r23 = r6
            java.lang.String r6 = r1.f7567g
            java.lang.String r1 = r1.f7565e
            boolean r3 = og.m.t0(r1)
            if (r3 == 0) goto L6db
            java.lang.String r1 = "[99:99.99]暂无歌词"
        L6db:
            r8 = r1
            java.lang.String r1 = "qq_music_order_app_id"
            java.lang.String r3 = "wx485a97c844086dc9"
            java.lang.String r1 = r2.d(r1, r3)
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            boolean r2 = og.m.t0(r1)
            if (r2 == 0) goto L6f4
            r11 = r3
            goto L6f5
        L6f4:
            r11 = r1
        L6f5:
            androidx.lifecycle.x r2 = r0.f6819e
            r3 = r34
            r5 = r38
            boolean r0 = r2.Z(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r11 = 1
            if (r0 != r11) goto L709
            r0 = r11
            goto L70a
        L704:
            r3 = r34
            r23 = r6
            r11 = 1
        L709:
            r0 = 0
        L70a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1 = r0
            goto L712
        L710:
            r11 = 1
            r1 = 0
        L712:
            if (r13 == 0) goto L7ee
            j8.p r0 = h.Hchat.hooks.api.core.WeChatApis.media()
            if (r0 == 0) goto L71e
            j8.y r0 = r0.f6816b
            r2 = r0
            goto L71f
        L71e:
            r2 = 0
        L71f:
            if (r2 == 0) goto L727
            boolean r0 = r2.b()
            if (r0 != 0) goto L72a
        L727:
            r6 = 0
            goto L7e0
        L72a:
            java.io.File r4 = new java.io.File
            android.content.Context r0 = r12.f7553b
            java.io.File r0 = r0.getCacheDir()
            java.lang.String r5 = "Hchat_qq_music_order_voice"
            r4.<init>(r0, r5)
            boolean r0 = r4.isDirectory()
            if (r0 != 0) goto L743
            boolean r0 = r4.mkdirs()
            if (r0 == 0) goto L749
        L743:
            boolean r0 = r4.canWrite()
            if (r0 != 0) goto L74c
        L749:
            r13 = 0
            goto L7e9
        L74c:
            java.io.File r5 = new java.io.File
            long r8 = java.lang.System.currentTimeMillis()
            long r11 = java.lang.System.nanoTime()
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> L76c
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L76c
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Throwable -> L76c
            r0.getClass()     // Catch: java.lang.Throwable -> L76c
            java.util.Locale r6 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L76c
            java.lang.String r0 = r0.toLowerCase(r6)     // Catch: java.lang.Throwable -> L76c
            r0.getClass()     // Catch: java.lang.Throwable -> L76c
            goto L773
        L76c:
            r0 = move-exception
            sf.f r6 = new sf.f
            r6.<init>(r0)
            r0 = r6
        L773:
            boolean r6 = r0 instanceof sf.f
            if (r6 == 0) goto L77a
            r0 = r23
        L77a:
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r6 = ka.f.f7551f
            java.util.Iterator r6 = r6.iterator()
        L782:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L79d
            java.lang.Object r10 = r6.next()
            r13 = r10
            java.lang.String r13 = (java.lang.String) r13
            r37 = r6
            r6 = 0
            boolean r13 = og.t.W(r0, r13, r6)
            if (r13 == 0) goto L79a
            r13 = r10
            goto L79f
        L79a:
            r6 = r37
            goto L782
        L79d:
            r6 = 0
            r13 = 0
        L79f:
            java.lang.String r13 = (java.lang.String) r13
            if (r13 == 0) goto L7a4
            goto L7a6
        L7a4:
            java.lang.String r13 = ".audio"
        L7a6:
            java.lang.String r0 = "qq_music_"
            java.lang.String r10 = "_"
            java.lang.StringBuilder r0 = p.a.o(r8, r0, r10)
            java.lang.String r0 = eh.a.p(r0, r11, r13)
            r5.<init>(r4, r0)
            java.io.File r4 = new java.io.File
            java.lang.String r0 = r5.getAbsolutePath()
            java.lang.String r8 = ".part"
            java.lang.String r0 = bc.e.i(r0, r8)
            r4.<init>(r0)
            r12 = r33
            boolean r0 = r12.b(r4, r5, r7)     // Catch: java.lang.Throwable -> L7d8
            if (r0 == 0) goto L7da
            java.lang.String r0 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L7d8
            boolean r0 = r2.t(r3, r0)     // Catch: java.lang.Throwable -> L7d8
            if (r0 == 0) goto L7da
            r6 = 1
            goto L7da
        L7d8:
            r0 = move-exception
            goto L7e2
        L7da:
            a(r4)
            a(r5)
        L7e0:
            r13 = r6
            goto L7e9
        L7e2:
            a(r4)
            a(r5)
            throw r0
        L7e9:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            goto L7ef
        L7ee:
            r13 = 0
        L7ef:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r2 = gg.l.a(r1, r0)
            if (r2 != 0) goto L7fe
            boolean r2 = gg.l.a(r13, r0)
            if (r2 != 0) goto L7fe
            goto L827
        L7fe:
            boolean r2 = gg.l.a(r1, r0)
            if (r2 == 0) goto L810
            boolean r2 = gg.l.a(r13, r0)
            if (r2 == 0) goto L810
            java.lang.String r0 = "音乐卡片和歌曲语音发送失败"
            e(r14, r3, r0)
            goto L827
        L810:
            boolean r1 = gg.l.a(r1, r0)
            if (r1 == 0) goto L81c
            java.lang.String r0 = "音乐卡片发送失败"
            e(r14, r3, r0)
            goto L827
        L81c:
            boolean r0 = gg.l.a(r13, r0)
            if (r0 == 0) goto L827
            java.lang.String r0 = "歌曲语音发送失败"
            e(r14, r3, r0)
        L827:
            return
        L828:
            r12 = r33
            r3 = r34
            r14 = r35
            r2 = r18
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto L83c
            java.lang.String r0 = "未搜到"
            e(r14, r3, r0)
            return
        L83c:
            r2 = r16
            boolean r0 = r1.equals(r2)
            if (r0 == 0) goto L84a
            java.lang.String r0 = "获取失败，可能是版权限制或数字专辑"
            e(r14, r3, r0)
            return
        L84a:
            okio.a.k()
            return
    }

    public final void f(java.lang.String r7, boolean r8) {
            r6 = this;
            ka.g r0 = r6.f7554c
            java.util.Set r1 = r0.a()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Set r1 = tf.m.T1(r1)
            if (r8 == 0) goto L12
            r1.add(r7)
            goto L15
        L12:
            r1.remove(r7)
        L15:
            r0.c(r1)
            if (r8 == 0) goto L1e
            java.lang.String r8 = "该聊天点歌开关已开启，其他人可以点歌了"
        L1c:
            r2 = r8
            goto L21
        L1e:
            java.lang.String r8 = "该聊天点歌开关已关闭，只有你能点歌了"
            goto L1c
        L21:
            i8.c r8 = h.Hchat.hooks.api.core.WeChatApis.message()
            r8.getClass()
            k8.e r0 = h.Hchat.hooks.api.core.WeChatApis.h()
            if (r0 == 0) goto L37
            long r3 = java.lang.System.currentTimeMillis()
            r5 = 1
            r1 = r7
            r0.e(r1, r2, r3, r5)
        L37:
            return
    }
}
