package okhttp3.internal.publicsuffix;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p376zd.C10003m;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\fÀ\u0006\u0003"}, m16758d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixList;", _UrlKt.FRAGMENT_ENCODE_SET, "Ll8/i0;", "ensureLoaded", "()V", "Lzd/m;", "getBytes", "()Lzd/m;", "bytes", "getExceptionBytes", "exceptionBytes", "Companion", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public interface PublicSuffixList {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m16758d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixList$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void ensureLoaded();

    C10003m getBytes();

    C10003m getExceptionBytes();
}
