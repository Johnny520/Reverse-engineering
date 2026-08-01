package okhttp3;

import java.util.ArrayList;
import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.url._UrlKt;
import p185m8.AbstractC5081g0;
import p299ub.AbstractC8611a0;
import p376zd.AbstractC9988e0;
import p376zd.InterfaceC10024w0;
import p376zd.InterfaceC9999k;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0018B\u001b\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0014J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\u0017R\u001b\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m16758d2 = {"Lokhttp3/CompressionInterceptor;", "Lokhttp3/Interceptor;", "algorithms", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/CompressionInterceptor$DecompressionAlgorithm;", "<init>", "([Lokhttp3/CompressionInterceptor$DecompressionAlgorithm;)V", "getAlgorithms", "()[Lokhttp3/CompressionInterceptor$DecompressionAlgorithm;", "[Lokhttp3/CompressionInterceptor$DecompressionAlgorithm;", "acceptEncoding", _UrlKt.FRAGMENT_ENCODE_SET, "getAcceptEncoding$okhttp", "()Ljava/lang/String;", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "decompress", "response", "decompress$okhttp", "lookupDecompressor", "encoding", "lookupDecompressor$okhttp", "DecompressionAlgorithm", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public class CompressionInterceptor implements Interceptor {
    private final String acceptEncoding;
    private final DecompressionAlgorithm[] algorithms;

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000bÀ\u0006\u0003"}, m16758d2 = {"Lokhttp3/CompressionInterceptor$DecompressionAlgorithm;", _UrlKt.FRAGMENT_ENCODE_SET, "Lzd/k;", "compressedSource", "Lzd/w0;", "decompress", "(Lzd/k;)Lzd/w0;", _UrlKt.FRAGMENT_ENCODE_SET, "getEncoding", "()Ljava/lang/String;", "encoding", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    public interface DecompressionAlgorithm {
        InterfaceC10024w0 decompress(InterfaceC9999k compressedSource);

        String getEncoding();
    }

    public CompressionInterceptor(DecompressionAlgorithm... decompressionAlgorithmArr) {
        decompressionAlgorithmArr.getClass();
        this.algorithms = decompressionAlgorithmArr;
        ArrayList arrayList = new ArrayList(decompressionAlgorithmArr.length);
        for (DecompressionAlgorithm decompressionAlgorithm : decompressionAlgorithmArr) {
            arrayList.add(decompressionAlgorithm.getEncoding());
        }
        this.acceptEncoding = AbstractC5081g0.m20585s0(arrayList, ", ", null, null, 0, null, null, 62, null);
    }

    public final Response decompress$okhttp(Response response) {
        DecompressionAlgorithm decompressionAlgorithmLookupDecompressor$okhttp;
        response.getClass();
        if (!HttpHeaders.promisesBody(response)) {
            return response;
        }
        ResponseBody responseBodyBody = response.body();
        String strHeader$default = Response.header$default(response, "Content-Encoding", null, 2, null);
        return (strHeader$default == null || (decompressionAlgorithmLookupDecompressor$okhttp = lookupDecompressor$okhttp(strHeader$default)) == null) ? response : response.newBuilder().removeHeader("Content-Encoding").removeHeader("Content-Length").body(ResponseBody.INSTANCE.create(AbstractC9988e0.m38648c(decompressionAlgorithmLookupDecompressor$okhttp.decompress(responseBodyBody.source())), responseBodyBody.contentType(), -1L)).build();
    }

    /* JADX INFO: renamed from: getAcceptEncoding$okhttp, reason: from getter */
    public final String getAcceptEncoding() {
        return this.acceptEncoding;
    }

    public final DecompressionAlgorithm[] getAlgorithms() {
        return this.algorithms;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        chain.getClass();
        return ((this.algorithms.length == 0) || chain.request().header("Accept-Encoding") != null) ? chain.proceed(chain.request()) : decompress$okhttp(chain.proceed(chain.request().newBuilder().header("Accept-Encoding", this.acceptEncoding).build()));
    }

    public final DecompressionAlgorithm lookupDecompressor$okhttp(String encoding) {
        encoding.getClass();
        for (DecompressionAlgorithm decompressionAlgorithm : this.algorithms) {
            if (AbstractC8611a0.m33061F(decompressionAlgorithm.getEncoding(), encoding, true)) {
                return decompressionAlgorithm;
            }
        }
        return null;
    }
}
