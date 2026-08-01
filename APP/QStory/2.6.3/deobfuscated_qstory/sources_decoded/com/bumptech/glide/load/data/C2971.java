package com.bumptech.glide.load.data;

import com.bumptech.glide.load.engine.bitmap_recycle.C2974;
import java.io.InputStream;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2971 implements InterfaceC2961 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2974 f9393;

    public C2971(C2974 c2974) {
        this.f9393 = c2974;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC2960 mo6428(Object obj) {
        return new C2968((InputStream) obj, this.f9393);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Class mo6429() {
        return InputStream.class;
    }
}
