package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.resource.bitmap.C3047;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2969 implements InterfaceC2961 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f9387;

    public /* synthetic */ C2969(int i) {
        this.f9387 = i;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC2960 mo6428(Object obj) {
        switch (this.f9387) {
            case 0:
                return new C2968(obj);
            case 1:
                return new C2968((ParcelFileDescriptor) obj);
            default:
                return new C3047((ByteBuffer) obj, 3);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Class mo6429() {
        switch (this.f9387) {
            case 0:
                throw new UnsupportedOperationException("Not implemented");
            case 1:
                return ParcelFileDescriptor.class;
            default:
                return ByteBuffer.class;
        }
    }
}
