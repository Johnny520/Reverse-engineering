package okhttp3.internal.platform;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p185m8.AbstractC5114x;
import p224p4.InterfaceC5950b;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m16758d2 = {"Lokhttp3/internal/platform/PlatformInitializer;", "Lp4/b;", "Lokhttp3/internal/platform/Platform;", "<init>", "()V", "Landroid/content/Context;", "context", "create", "(Landroid/content/Context;)Lokhttp3/internal/platform/Platform;", _UrlKt.FRAGMENT_ENCODE_SET, "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class PlatformInitializer implements InterfaceC5950b {
    @Override // p224p4.InterfaceC5950b
    public Platform create(Context context) {
        context.getClass();
        PlatformRegistry.INSTANCE.setApplicationContext(context);
        return Platform.INSTANCE.get();
    }

    @Override // p224p4.InterfaceC5950b
    public List<Class<InterfaceC5950b>> dependencies() {
        return AbstractC5114x.m20800o();
    }
}
