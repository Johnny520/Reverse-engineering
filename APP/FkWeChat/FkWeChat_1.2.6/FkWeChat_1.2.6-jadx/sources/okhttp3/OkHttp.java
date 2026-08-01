package okhttp3;

import android.content.Context;
import kotlin.Metadata;
import okhttp3.internal._InternalVersionKt;
import okhttp3.internal.platform.PlatformRegistry;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087D¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m16758d2 = {"Lokhttp3/OkHttp;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "Landroid/content/Context;", "applicationContext", "Ll8/i0;", "initialize", "(Landroid/content/Context;)V", _UrlKt.FRAGMENT_ENCODE_SET, "VERSION", "Ljava/lang/String;", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class OkHttp {
    public static final OkHttp INSTANCE = new OkHttp();
    public static final String VERSION = _InternalVersionKt.CONST_VERSION;

    private OkHttp() {
    }

    public final void initialize(Context applicationContext) {
        applicationContext.getClass();
        PlatformRegistry platformRegistry = PlatformRegistry.INSTANCE;
        if (platformRegistry.getApplicationContext() == null) {
            platformRegistry.setApplicationContext(applicationContext.getApplicationContext());
        }
    }
}
