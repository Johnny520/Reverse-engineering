package okhttp3.internal;

import java.io.EOFException;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p376zd.InterfaceC9999k;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m16758d2 = {"Lzd/k;", _UrlKt.FRAGMENT_ENCODE_SET, "codePointLimit", _UrlKt.FRAGMENT_ENCODE_SET, "isProbablyUtf8", "(Lzd/k;J)Z", "okhttp"}, m16759k = 2, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class IsProbablyUtf8Kt {
    public static final boolean isProbablyUtf8(InterfaceC9999k interfaceC9999k, long j10) {
        interfaceC9999k.getClass();
        try {
            InterfaceC9999k interfaceC9999kPeek = interfaceC9999k.peek();
            for (long j11 = 0; j11 < j10; j11++) {
                if (interfaceC9999kPeek.mo38707g()) {
                    return true;
                }
                int iMo38709h0 = interfaceC9999kPeek.mo38709h0();
                if (Character.isISOControl(iMo38709h0) && !Character.isWhitespace(iMo38709h0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean isProbablyUtf8$default(InterfaceC9999k interfaceC9999k, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = Long.MAX_VALUE;
        }
        return isProbablyUtf8(interfaceC9999k, j10);
    }
}
