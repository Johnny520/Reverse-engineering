package p213ob;

import java.util.concurrent.TimeUnit;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;

/* JADX INFO: renamed from: ob.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3111d {

    /* JADX INFO: renamed from: b */
    public static final MediaType f10089b = MediaType.Companion.get("application/json; charset=utf-8");

    /* JADX INFO: renamed from: a */
    public final OkHttpClient f10090a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3111d() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f10090a = builder.connectTimeout(20L, timeUnit).readTimeout(45L, timeUnit).writeTimeout(20L, timeUnit).callTimeout(60L, timeUnit).build();
    }
}
