package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.resource.bitmap.C3046;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2968 implements InterfaceC2960 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f9385;

    public /* synthetic */ C2968(int i) {
        this.f9385 = i;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2960
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC2959 mo6370(Object obj) {
        switch (this.f9385) {
            case 0:
                return new C2967(obj);
            case 1:
                return new C2967((ParcelFileDescriptor) obj);
            default:
                return new C3046((ByteBuffer) obj, 3);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2960
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Class mo6371() {
        switch (this.f9385) {
            case 0:
                throw new UnsupportedOperationException("Not implemented");
            case 1:
                return ParcelFileDescriptor.class;
            default:
                return ByteBuffer.class;
        }
    }
}
