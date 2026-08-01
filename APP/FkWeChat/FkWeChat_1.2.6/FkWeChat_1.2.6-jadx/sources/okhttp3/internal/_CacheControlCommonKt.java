package okhttp3.internal;

import kotlin.Metadata;
import okhttp3.CacheControl;
import okhttp3.internal.url._UrlKt;
import p299ub.AbstractC8621f0;
import p314vb.AbstractC8899f;
import p314vb.C8895b;
import p314vb.EnumC8900g;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0002*\u00020\u0007H\u0000\u001a\f\u0010\b\u001a\u00020\u0002*\u00020\u0007H\u0000\u001a\f\u0010\t\u001a\u00020\u0002*\u00020\nH\u0000\u001a\f\u0010\u000b\u001a\u00020\n*\u00020\nH\u0000\u001a\f\u0010\f\u001a\u00020\n*\u00020\nH\u0000\u001a\f\u0010\r\u001a\u00020\n*\u00020\nH\u0000\u001a\f\u0010\u000e\u001a\u00020\n*\u00020\nH\u0000\u001a\f\u0010\u000f\u001a\u00020\n*\u00020\nH\u0000\u001a\u0014\u0010\u0010\u001a\u00020\u0002*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0000\u001a\u001e\u0010\u0013\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0015\u001a\u00020\u0004H\u0002¨\u0006\u0016"}, m16758d2 = {"commonToString", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/CacheControl;", "commonClampToInt", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "commonForceNetwork", "Lokhttp3/CacheControl$Companion;", "commonForceCache", "commonBuild", "Lokhttp3/CacheControl$Builder;", "commonNoCache", "commonNoStore", "commonOnlyIfCached", "commonNoTransform", "commonImmutable", "commonParse", "headers", "Lokhttp3/Headers;", "indexOfElement", "characters", "startIndex", "okhttp"}, m16759k = 2, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class _CacheControlCommonKt {
    public static final CacheControl commonBuild(CacheControl.Builder builder) {
        builder.getClass();
        return new CacheControl(builder.getNoCache(), builder.getNoStore(), builder.getMaxAgeSeconds(), -1, false, false, false, builder.getMaxStaleSeconds(), builder.getMinFreshSeconds(), builder.getOnlyIfCached(), builder.getNoTransform(), builder.getImmutable(), null);
    }

    public static final int commonClampToInt(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j10;
    }

    public static final CacheControl commonForceCache(CacheControl.Companion companion) {
        companion.getClass();
        CacheControl.Builder builderOnlyIfCached = new CacheControl.Builder().onlyIfCached();
        C8895b.a aVar = C8895b.f29484r;
        return builderOnlyIfCached.m38894maxStaleLRDsOJo(AbstractC8899f.m34137B(Integer.MAX_VALUE, EnumC8900g.f29496u)).build();
    }

    public static final CacheControl commonForceNetwork(CacheControl.Companion companion) {
        companion.getClass();
        return new CacheControl.Builder().noCache().build();
    }

    public static final CacheControl.Builder commonImmutable(CacheControl.Builder builder) {
        builder.getClass();
        builder.setImmutable$okhttp(true);
        return builder;
    }

    public static final CacheControl.Builder commonNoCache(CacheControl.Builder builder) {
        builder.getClass();
        builder.setNoCache$okhttp(true);
        return builder;
    }

    public static final CacheControl.Builder commonNoStore(CacheControl.Builder builder) {
        builder.getClass();
        builder.setNoStore$okhttp(true);
        return builder;
    }

    public static final CacheControl.Builder commonNoTransform(CacheControl.Builder builder) {
        builder.getClass();
        builder.setNoTransform$okhttp(true);
        return builder;
    }

    public static final CacheControl.Builder commonOnlyIfCached(CacheControl.Builder builder) {
        builder.getClass();
        builder.setOnlyIfCached$okhttp(true);
        return builder;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final okhttp3.CacheControl commonParse(okhttp3.CacheControl.Companion r29, okhttp3.Headers r30) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal._CacheControlCommonKt.commonParse(okhttp3.CacheControl$Companion, okhttp3.Headers):okhttp3.CacheControl");
    }

    public static final String commonToString(CacheControl cacheControl) {
        cacheControl.getClass();
        String headerValue = cacheControl.getHeaderValue();
        if (headerValue != null) {
            return headerValue;
        }
        StringBuilder sb2 = new StringBuilder();
        if (cacheControl.noCache()) {
            sb2.append("no-cache, ");
        }
        if (cacheControl.noStore()) {
            sb2.append("no-store, ");
        }
        if (cacheControl.maxAgeSeconds() != -1) {
            sb2.append("max-age=");
            sb2.append(cacheControl.maxAgeSeconds());
            sb2.append(", ");
        }
        if (cacheControl.sMaxAgeSeconds() != -1) {
            sb2.append("s-maxage=");
            sb2.append(cacheControl.sMaxAgeSeconds());
            sb2.append(", ");
        }
        if (cacheControl.getIsPrivate()) {
            sb2.append("private, ");
        }
        if (cacheControl.getIsPublic()) {
            sb2.append("public, ");
        }
        if (cacheControl.mustRevalidate()) {
            sb2.append("must-revalidate, ");
        }
        if (cacheControl.maxStaleSeconds() != -1) {
            sb2.append("max-stale=");
            sb2.append(cacheControl.maxStaleSeconds());
            sb2.append(", ");
        }
        if (cacheControl.minFreshSeconds() != -1) {
            sb2.append("min-fresh=");
            sb2.append(cacheControl.minFreshSeconds());
            sb2.append(", ");
        }
        if (cacheControl.onlyIfCached()) {
            sb2.append("only-if-cached, ");
        }
        if (cacheControl.noTransform()) {
            sb2.append("no-transform, ");
        }
        if (cacheControl.immutable()) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        sb2.delete(sb2.length() - 2, sb2.length()).getClass();
        String string = sb2.toString();
        cacheControl.setHeaderValue$okhttp(string);
        return string;
    }

    private static final int indexOfElement(String str, String str2, int i10) {
        int length = str.length();
        while (i10 < length) {
            if (AbstractC8621f0.m33124Z(str2, str.charAt(i10), false, 2, null)) {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfElement$default(String str, String str2, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return indexOfElement(str, str2, i10);
    }
}
