package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.resource.bitmap.C3879;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3801 implements InterfaceC3793 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f9732;

    public /* synthetic */ C3801(int i) {
        this.f9732 = i;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3793
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC3792 mo6988(Object obj) {
        switch (this.f9732) {
            case 0:
                return new C3800(obj);
            case 1:
                return new C3800((ParcelFileDescriptor) obj);
            default:
                return new C3879((ByteBuffer) obj, 3);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3793
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Class mo6989() {
        switch (this.f9732) {
            case 0:
                throw new UnsupportedOperationException("Not implemented");
            case 1:
                return ParcelFileDescriptor.class;
            default:
                return ByteBuffer.class;
        }
    }
}
