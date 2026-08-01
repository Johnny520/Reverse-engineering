package com.bumptech.glide.load.engine;

import java.security.MessageDigest;
import p286.InterfaceC8392;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2993 implements InterfaceC8392 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC8392 f9471;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8392 f9472;

    public C2993(InterfaceC8392 interfaceC8392, InterfaceC8392 interfaceC83922) {
        this.f9472 = interfaceC8392;
        this.f9471 = interfaceC83922;
    }

    @Override // p286.InterfaceC8392
    public final boolean equals(Object obj) {
        if (obj instanceof C2993) {
            C2993 c2993 = (C2993) obj;
            if (this.f9472.equals(c2993.f9472) && this.f9471.equals(c2993.f9471)) {
                return true;
            }
        }
        return false;
    }

    @Override // p286.InterfaceC8392
    public final int hashCode() {
        return this.f9471.hashCode() + (this.f9472.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f9472 + ", signature=" + this.f9471 + '}';
    }

    @Override // p286.InterfaceC8392
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6410(MessageDigest messageDigest) {
        this.f9472.mo6410(messageDigest);
        this.f9471.mo6410(messageDigest);
    }
}
