package com.bumptech.glide.load.engine;

import java.security.MessageDigest;
import p286.InterfaceC8393;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2994 implements InterfaceC8393 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC8393 f9473;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8393 f9474;

    public C2994(InterfaceC8393 interfaceC8393, InterfaceC8393 interfaceC83932) {
        this.f9474 = interfaceC8393;
        this.f9473 = interfaceC83932;
    }

    @Override // p286.InterfaceC8393
    public final boolean equals(Object obj) {
        if (obj instanceof C2994) {
            C2994 c2994 = (C2994) obj;
            if (this.f9474.equals(c2994.f9474) && this.f9473.equals(c2994.f9473)) {
                return true;
            }
        }
        return false;
    }

    @Override // p286.InterfaceC8393
    public final int hashCode() {
        return this.f9473.hashCode() + (this.f9474.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f9474 + ", signature=" + this.f9473 + '}';
    }

    @Override // p286.InterfaceC8393
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6468(MessageDigest messageDigest) {
        this.f9474.mo6468(messageDigest);
        this.f9473.mo6468(messageDigest);
    }
}
