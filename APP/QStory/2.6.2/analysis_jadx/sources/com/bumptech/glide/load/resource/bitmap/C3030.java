package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.engine.bitmap_recycle.C2973;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import p158.C7627;
import p158.C7631;
import p222.AbstractC7983;
import p222.C7984;
import p286.InterfaceC8393;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3030 implements InterfaceC8393 {
    @Override // p286.InterfaceC8393
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int mo6478(InputStream inputStream, C2973 c2973) throws Throwable {
        int iM12834;
        C7631 c7631 = new C7631(inputStream);
        C7627 c7627M12846 = c7631.m12846("Orientation");
        if (c7627M12846 == null) {
            iM12834 = 1;
        } else {
            try {
                iM12834 = c7627M12846.m12834(c7631.f20722);
            } catch (NumberFormatException unused) {
                iM12834 = 1;
            }
        }
        if (iM12834 == 0) {
            return -1;
        }
        return iM12834;
    }

    @Override // p286.InterfaceC8393
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ImageHeaderParser$ImageType mo6479(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // p286.InterfaceC8393
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean mo6480(InputStream inputStream, C2973 c2973) {
        return false;
    }

    @Override // p286.InterfaceC8393
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean mo6481(ByteBuffer byteBuffer, C2973 c2973) {
        return false;
    }

    @Override // p286.InterfaceC8393
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int mo6482(ByteBuffer byteBuffer, C2973 c2973) {
        AtomicReference atomicReference = AbstractC7983.f22064;
        return mo6478(new C7984(byteBuffer), c2973);
    }

    @Override // p286.InterfaceC8393
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ImageHeaderParser$ImageType mo6483(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
