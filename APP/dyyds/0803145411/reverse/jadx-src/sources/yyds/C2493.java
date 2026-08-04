package yyds;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: yyds.ᲇᛸᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2493 implements InterfaceC0849 {
    @Override // yyds.InterfaceC0849
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final int mo1925(InputStream inputStream, C2267 c2267) throws Throwable {
        int iM2399;
        C2367 c2367 = new C2367(inputStream);
        C1207 c1207M4407 = c2367.m4407("Orientation");
        if (c1207M4407 == null) {
            iM2399 = 1;
        } else {
            try {
                iM2399 = c1207M4407.m2399(c2367.f11668);
            } catch (NumberFormatException unused) {
                iM2399 = 1;
            }
        }
        if (iM2399 == 0) {
            return -1;
        }
        return iM2399;
    }

    @Override // yyds.InterfaceC0849
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final ImageHeaderParser$ImageType mo1926(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // yyds.InterfaceC0849
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final boolean mo1927(ByteBuffer byteBuffer, C2267 c2267) {
        return false;
    }

    @Override // yyds.InterfaceC0849
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final boolean mo1928(InputStream inputStream, C2267 c2267) {
        return false;
    }

    @Override // yyds.InterfaceC0849
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final ImageHeaderParser$ImageType mo1929(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // yyds.InterfaceC0849
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final int mo1930(ByteBuffer byteBuffer, C2267 c2267) {
        AtomicReference atomicReference = AbstractC0282.f1527;
        return mo1925(new C0345(byteBuffer), c2267);
    }
}
