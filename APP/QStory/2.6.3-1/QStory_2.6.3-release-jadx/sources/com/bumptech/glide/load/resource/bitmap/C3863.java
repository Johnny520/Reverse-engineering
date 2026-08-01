package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.engine.bitmap_recycle.C3806;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import p174.C8457;
import p174.C8461;
import p238.AbstractC8813;
import p238.C8814;
import p302.InterfaceC9223;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3863 implements InterfaceC9223 {
    @Override // p302.InterfaceC9223
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int mo7098(InputStream inputStream, C3806 c3806) throws Throwable {
        int iM13422;
        C8461 c8461 = new C8461(inputStream);
        C8457 c8457M13434 = c8461.m13434("Orientation");
        if (c8457M13434 == null) {
            iM13422 = 1;
        } else {
            try {
                iM13422 = c8457M13434.m13422(c8461.f21062);
            } catch (NumberFormatException unused) {
                iM13422 = 1;
            }
        }
        if (iM13422 == 0) {
            return -1;
        }
        return iM13422;
    }

    @Override // p302.InterfaceC9223
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ImageHeaderParser$ImageType mo7099(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // p302.InterfaceC9223
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean mo7100(InputStream inputStream, C3806 c3806) {
        return false;
    }

    @Override // p302.InterfaceC9223
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean mo7101(ByteBuffer byteBuffer, C3806 c3806) {
        return false;
    }

    @Override // p302.InterfaceC9223
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int mo7102(ByteBuffer byteBuffer, C3806 c3806) {
        AtomicReference atomicReference = AbstractC8813.f22406;
        return mo7098(new C8814(byteBuffer), c3806);
    }

    @Override // p302.InterfaceC9223
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ImageHeaderParser$ImageType mo7103(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
