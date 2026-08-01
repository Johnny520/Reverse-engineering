package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.engine.bitmap_recycle.C2974;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import p158.C7628;
import p158.C7632;
import p222.AbstractC7984;
import p222.C7985;
import p286.InterfaceC8394;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3031 implements InterfaceC8394 {
    @Override // p286.InterfaceC8394
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int mo6538(InputStream inputStream, C2974 c2974) throws Throwable {
        int iM12863;
        C7632 c7632 = new C7632(inputStream);
        C7628 c7628M12875 = c7632.m12875("Orientation");
        if (c7628M12875 == null) {
            iM12863 = 1;
        } else {
            try {
                iM12863 = c7628M12875.m12863(c7632.f20717);
            } catch (NumberFormatException unused) {
                iM12863 = 1;
            }
        }
        if (iM12863 == 0) {
            return -1;
        }
        return iM12863;
    }

    @Override // p286.InterfaceC8394
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ImageHeaderParser$ImageType mo6539(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // p286.InterfaceC8394
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean mo6540(InputStream inputStream, C2974 c2974) {
        return false;
    }

    @Override // p286.InterfaceC8394
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean mo6541(ByteBuffer byteBuffer, C2974 c2974) {
        return false;
    }

    @Override // p286.InterfaceC8394
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int mo6542(ByteBuffer byteBuffer, C2974 c2974) {
        AtomicReference atomicReference = AbstractC7984.f22061;
        return mo6538(new C7985(byteBuffer), c2974);
    }

    @Override // p286.InterfaceC8394
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ImageHeaderParser$ImageType mo6543(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
