package ob;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final okhttp3.MediaType f9716b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final okhttp3.OkHttpClient f9717a;

    static {
            okhttp3.MediaType$Companion r0 = okhttp3.MediaType.Companion
            java.lang.String r1 = "application/json; charset=utf-8"
            okhttp3.MediaType r0 = r0.get(r1)
            ob.d.f9716b = r0
            return
    }

    public d() {
            r6 = this;
            r6.<init>()
            okhttp3.OkHttpClient$Builder r0 = new okhttp3.OkHttpClient$Builder
            r0.<init>()
            r1 = 20
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            okhttp3.OkHttpClient$Builder r0 = r0.connectTimeout(r1, r3)
            r4 = 45
            okhttp3.OkHttpClient$Builder r0 = r0.readTimeout(r4, r3)
            okhttp3.OkHttpClient$Builder r0 = r0.writeTimeout(r1, r3)
            r1 = 60
            okhttp3.OkHttpClient$Builder r0 = r0.callTimeout(r1, r3)
            okhttp3.OkHttpClient r0 = r0.build()
            r6.f9717a = r0
            return
    }
}
