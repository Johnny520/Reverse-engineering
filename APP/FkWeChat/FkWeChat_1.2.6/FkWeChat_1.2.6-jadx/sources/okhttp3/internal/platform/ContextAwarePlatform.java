package okhttp3.internal.platform;

import android.content.Context;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, m16758d2 = {"Lokhttp3/internal/platform/ContextAwarePlatform;", _UrlKt.FRAGMENT_ENCODE_SET, "applicationContext", "Landroid/content/Context;", "getApplicationContext", "()Landroid/content/Context;", "setApplicationContext", "(Landroid/content/Context;)V", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public interface ContextAwarePlatform {
    Context getApplicationContext();

    void setApplicationContext(Context context);
}
