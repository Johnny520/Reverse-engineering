package com.bumptech.glide.load.data;

import com.bumptech.glide.load.engine.bitmap_recycle.C3806;
import java.io.InputStream;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3803 implements InterfaceC3793 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3806 f9738;

    public C3803(C3806 c3806) {
        this.f9738 = c3806;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3793
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC3792 mo6988(Object obj) {
        return new C3800((InputStream) obj, this.f9738);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3793
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Class mo6989() {
        return InputStream.class;
    }
}
