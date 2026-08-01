package okhttp3;

import kotlin.Metadata;
import okhttp3.CompressionInterceptor;
import okhttp3.internal.url._UrlKt;
import p376zd.C10025x;
import p376zd.InterfaceC10024w0;
import p376zd.InterfaceC9999k;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m16758d2 = {"Lokhttp3/Gzip;", "Lokhttp3/CompressionInterceptor$DecompressionAlgorithm;", "<init>", "()V", "Lzd/k;", "compressedSource", "Lzd/w0;", "decompress", "(Lzd/k;)Lzd/w0;", _UrlKt.FRAGMENT_ENCODE_SET, "getEncoding", "()Ljava/lang/String;", "encoding", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class Gzip implements CompressionInterceptor.DecompressionAlgorithm {
    public static final Gzip INSTANCE = new Gzip();

    private Gzip() {
    }

    @Override // okhttp3.CompressionInterceptor.DecompressionAlgorithm
    public InterfaceC10024w0 decompress(InterfaceC9999k compressedSource) {
        compressedSource.getClass();
        return new C10025x(compressedSource);
    }

    @Override // okhttp3.CompressionInterceptor.DecompressionAlgorithm
    public String getEncoding() {
        return "gzip";
    }
}
