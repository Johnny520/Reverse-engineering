package com.bumptech.glide.load.data;

import com.bumptech.glide.load.engine.bitmap_recycle.C2973;
import java.io.InputStream;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2970 implements InterfaceC2960 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2973 f9391;

    public C2970(C2973 c2973) {
        this.f9391 = c2973;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2960
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC2959 mo6370(Object obj) {
        return new C2967((InputStream) obj, this.f9391);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2960
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Class mo6371() {
        return InputStream.class;
    }
}
