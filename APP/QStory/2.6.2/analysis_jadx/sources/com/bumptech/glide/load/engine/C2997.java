package com.bumptech.glide.load.engine;

import java.security.MessageDigest;
import java.util.Map;
import p222.AbstractC7988;
import p286.C8396;
import p286.InterfaceC8392;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2997 implements InterfaceC8392 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Class f9486;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Class f9487;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f9488;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f9489;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f9490;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Map f9491;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC8392 f9492;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C8396 f9493;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f9494;

    public C2997(Object obj, InterfaceC8392 interfaceC8392, int i, int i2, Map map, Class cls, Class cls2, C8396 c8396) {
        AbstractC7988.m13441(obj, "Argument must not be null");
        this.f9490 = obj;
        AbstractC7988.m13441(interfaceC8392, "Signature must not be null");
        this.f9492 = interfaceC8392;
        this.f9489 = i;
        this.f9488 = i2;
        AbstractC7988.m13441(map, "Argument must not be null");
        this.f9491 = map;
        AbstractC7988.m13441(cls, "Resource class must not be null");
        this.f9487 = cls;
        AbstractC7988.m13441(cls2, "Transcode class must not be null");
        this.f9486 = cls2;
        AbstractC7988.m13441(c8396, "Argument must not be null");
        this.f9493 = c8396;
    }

    @Override // p286.InterfaceC8392
    public final boolean equals(Object obj) {
        if (obj instanceof C2997) {
            C2997 c2997 = (C2997) obj;
            if (this.f9490.equals(c2997.f9490) && this.f9492.equals(c2997.f9492) && this.f9488 == c2997.f9488 && this.f9489 == c2997.f9489 && this.f9491.equals(c2997.f9491) && this.f9487.equals(c2997.f9487) && this.f9486.equals(c2997.f9486) && this.f9493.equals(c2997.f9493)) {
                return true;
            }
        }
        return false;
    }

    @Override // p286.InterfaceC8392
    public final int hashCode() {
        if (this.f9494 == 0) {
            int iHashCode = this.f9490.hashCode();
            this.f9494 = iHashCode;
            int iHashCode2 = ((((this.f9492.hashCode() + (iHashCode * 31)) * 31) + this.f9489) * 31) + this.f9488;
            this.f9494 = iHashCode2;
            int iHashCode3 = this.f9491.hashCode() + (iHashCode2 * 31);
            this.f9494 = iHashCode3;
            int iHashCode4 = this.f9487.hashCode() + (iHashCode3 * 31);
            this.f9494 = iHashCode4;
            int iHashCode5 = this.f9486.hashCode() + (iHashCode4 * 31);
            this.f9494 = iHashCode5;
            this.f9494 = this.f9493.f23273.hashCode() + (iHashCode5 * 31);
        }
        return this.f9494;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f9490 + ", width=" + this.f9489 + ", height=" + this.f9488 + ", resourceClass=" + this.f9487 + ", transcodeClass=" + this.f9486 + ", signature=" + this.f9492 + ", hashCode=" + this.f9494 + ", transformations=" + this.f9491 + ", options=" + this.f9493 + '}';
    }

    @Override // p286.InterfaceC8392
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6410(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
