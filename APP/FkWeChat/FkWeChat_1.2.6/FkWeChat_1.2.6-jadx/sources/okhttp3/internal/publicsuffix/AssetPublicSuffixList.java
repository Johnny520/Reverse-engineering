package okhttp3.internal.publicsuffix;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import okhttp3.internal.platform.PlatformRegistry;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p376zd.AbstractC9988e0;
import p376zd.C10023w;
import p376zd.InterfaceC10024w0;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m16758d2 = {"Lokhttp3/internal/publicsuffix/AssetPublicSuffixList;", "Lokhttp3/internal/publicsuffix/BasePublicSuffixList;", _UrlKt.FRAGMENT_ENCODE_SET, "path", "<init>", "(Ljava/lang/String;)V", "Lzd/w0;", "listSource", "()Lzd/w0;", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "Companion", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class AssetPublicSuffixList extends BasePublicSuffixList {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String PUBLIC_SUFFIX_RESOURCE = "PublicSuffixDatabase.list";
    private final String path;

    public /* synthetic */ AssetPublicSuffixList(String str, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? PUBLIC_SUFFIX_RESOURCE : str);
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    public InterfaceC10024w0 listSource() throws IOException {
        Context applicationContext = PlatformRegistry.INSTANCE.getApplicationContext();
        AssetManager assets = applicationContext != null ? applicationContext.getAssets() : null;
        if (assets != null) {
            InputStream inputStreamOpen = assets.open(getPath());
            inputStreamOpen.getClass();
            return AbstractC9988e0.m38654i(inputStreamOpen);
        }
        if (Build.FINGERPRINT == null) {
            C10023w.m38841a("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            return null;
        }
        C10023w.m38841a("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        return null;
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m16758d2 = {"Lokhttp3/internal/publicsuffix/AssetPublicSuffixList$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "PUBLIC_SUFFIX_RESOURCE", _UrlKt.FRAGMENT_ENCODE_SET, "getPUBLIC_SUFFIX_RESOURCE", "()Ljava/lang/String;", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        public final String getPUBLIC_SUFFIX_RESOURCE() {
            return AssetPublicSuffixList.PUBLIC_SUFFIX_RESOURCE;
        }

        private Companion() {
        }
    }

    @Override // okhttp3.internal.publicsuffix.BasePublicSuffixList
    public String getPath() {
        return this.path;
    }

    public AssetPublicSuffixList(String str) {
        str.getClass();
        this.path = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AssetPublicSuffixList() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
