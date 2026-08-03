package ka;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final okhttp3.MediaType f7541b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final okhttp3.OkHttpClient f7542a;

    static {
            okhttp3.MediaType$Companion r0 = okhttp3.MediaType.Companion
            java.lang.String r1 = "application/json; charset=utf-8"
            okhttp3.MediaType r0 = r0.get(r1)
            ka.a.f7541b = r0
            return
    }

    public a() {
            r4 = this;
            r4.<init>()
            okhttp3.OkHttpClient$Builder r0 = new okhttp3.OkHttpClient$Builder
            r0.<init>()
            r1 = 30
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            okhttp3.OkHttpClient$Builder r0 = r0.connectTimeout(r1, r3)
            okhttp3.OkHttpClient$Builder r0 = r0.callTimeout(r1, r3)
            okhttp3.OkHttpClient$Builder r0 = r0.readTimeout(r1, r3)
            okhttp3.OkHttpClient r0 = r0.build()
            r4.f7542a = r0
            return
    }

    public static org.json.JSONObject c() {
            java.lang.String r0 = "cv"
            java.lang.String r1 = "22060004"
            java.lang.String r2 = "ct"
            java.lang.String r3 = "11"
            org.json.JSONObject r0 = wb.en.l(r2, r3, r0, r1)
            java.lang.String r1 = "tmeAppID"
            java.lang.String r2 = "ztelite"
            r0.put(r1, r2)
            java.lang.String r1 = "OpenUDID"
            java.lang.String r2 = "nouid"
            r0.put(r1, r2)
            java.lang.String r1 = "uid"
            java.lang.String r2 = "3449496653"
            r0.put(r1, r2)
            return r0
    }

    public static org.json.JSONObject d(java.lang.String r1) {
            if (r1 == 0) goto L45
            boolean r0 = og.m.t0(r1)
            if (r0 == 0) goto L9
            goto L45
        L9:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r1)
            java.lang.String r1 = "req"
            org.json.JSONObject r1 = r0.optJSONObject(r1)
            if (r1 == 0) goto L17
            goto L1f
        L17:
            java.lang.String r1 = "searchMusic"
            org.json.JSONObject r1 = r0.optJSONObject(r1)
            if (r1 == 0) goto L45
        L1f:
            java.lang.String r0 = "data"
            org.json.JSONObject r1 = r1.optJSONObject(r0)
            if (r1 == 0) goto L45
            java.lang.String r0 = "body"
            org.json.JSONObject r1 = r1.optJSONObject(r0)
            if (r1 == 0) goto L45
            java.lang.String r0 = "song"
            org.json.JSONObject r1 = r1.optJSONObject(r0)
            if (r1 == 0) goto L45
            java.lang.String r0 = "list"
            org.json.JSONArray r1 = r1.optJSONArray(r0)
            if (r1 == 0) goto L45
            r0 = 0
            org.json.JSONObject r1 = r1.optJSONObject(r0)
            return r1
        L45:
            r1 = 0
            return r1
    }

    public final java.lang.String a(okhttp3.Request r3) {
            r2 = this;
            okhttp3.OkHttpClient r0 = r2.f7542a
            okhttp3.Call r3 = r0.newCall(r3)
            okhttp3.Response r3 = r3.execute()
            boolean r0 = r3.isSuccessful()     // Catch: java.lang.Throwable -> L20
            r1 = 0
            if (r0 != 0) goto L15
            ig.a.i(r3, r1)
            return r1
        L15:
            okhttp3.ResponseBody r0 = r3.body()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L22
            java.lang.String r0 = r0.string()     // Catch: java.lang.Throwable -> L20
            goto L23
        L20:
            r0 = move-exception
            goto L27
        L22:
            r0 = r1
        L23:
            ig.a.i(r3, r1)
            return r0
        L27:
            throw r0     // Catch: java.lang.Throwable -> L28
        L28:
            r1 = move-exception
            ig.a.i(r3, r0)
            throw r1
    }

    public final java.lang.String b(java.lang.String r3, java.util.Map r4) {
            r2 = this;
            okhttp3.Request$Builder r0 = new okhttp3.Request$Builder
            r0.<init>()
            okhttp3.Request$Builder r3 = r0.url(r3)
            okhttp3.Request$Builder r3 = r3.get()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L15:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L31
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r3.addHeader(r1, r0)
            goto L15
        L31:
            okhttp3.Request r3 = r3.build()
            java.lang.String r3 = r2.a(r3)
            return r3
    }

    public final java.lang.String e(java.lang.String r4) {
            r3 = this;
            okhttp3.Request$Builder r0 = new okhttp3.Request$Builder
            r0.<init>()
            java.lang.String r1 = "https://u.y.qq.com/cgi-bin/musicu.fcg"
            okhttp3.Request$Builder r0 = r0.url(r1)
            okhttp3.RequestBody$Companion r1 = okhttp3.RequestBody.Companion
            okhttp3.MediaType r2 = ka.a.f7541b
            okhttp3.RequestBody r4 = r1.create(r4, r2)
            okhttp3.Request$Builder r4 = r0.post(r4)
            okhttp3.Request r4 = r4.build()
            java.lang.String r4 = r3.a(r4)
            return r4
    }
}
