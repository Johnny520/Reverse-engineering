package com.bumptech.glide.load.engine;

import java.security.MessageDigest;
import p302.InterfaceC9222;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3826 implements InterfaceC9222 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC9222 f9818;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC9222 f9819;

    public C3826(InterfaceC9222 interfaceC9222, InterfaceC9222 interfaceC92222) {
        this.f9819 = interfaceC9222;
        this.f9818 = interfaceC92222;
    }

    @Override // p302.InterfaceC9222
    public final boolean equals(Object obj) {
        if (obj instanceof C3826) {
            C3826 c3826 = (C3826) obj;
            if (this.f9819.equals(c3826.f9819) && this.f9818.equals(c3826.f9818)) {
                return true;
            }
        }
        return false;
    }

    @Override // p302.InterfaceC9222
    public final int hashCode() {
        return this.f9818.hashCode() + (this.f9819.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f9819 + ", signature=" + this.f9818 + '}';
    }

    @Override // p302.InterfaceC9222
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7028(MessageDigest messageDigest) {
        this.f9819.mo7028(messageDigest);
        this.f9818.mo7028(messageDigest);
    }
}
