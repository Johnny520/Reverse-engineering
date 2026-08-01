package com.bumptech.glide.load.engine;

import java.security.MessageDigest;
import java.util.Map;
import p222.AbstractC7989;
import p286.C8397;
import p286.InterfaceC8393;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2998 implements InterfaceC8393 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Class f9488;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Class f9489;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f9490;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f9491;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f9492;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Map f9493;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC8393 f9494;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C8397 f9495;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f9496;

    public C2998(Object obj, InterfaceC8393 interfaceC8393, int i, int i2, Map map, Class cls, Class cls2, C8397 c8397) {
        AbstractC7989.m13469(obj, "Argument must not be null");
        this.f9492 = obj;
        AbstractC7989.m13469(interfaceC8393, "Signature must not be null");
        this.f9494 = interfaceC8393;
        this.f9491 = i;
        this.f9490 = i2;
        AbstractC7989.m13469(map, "Argument must not be null");
        this.f9493 = map;
        AbstractC7989.m13469(cls, "Resource class must not be null");
        this.f9489 = cls;
        AbstractC7989.m13469(cls2, "Transcode class must not be null");
        this.f9488 = cls2;
        AbstractC7989.m13469(c8397, "Argument must not be null");
        this.f9495 = c8397;
    }

    @Override // p286.InterfaceC8393
    public final boolean equals(Object obj) {
        if (obj instanceof C2998) {
            C2998 c2998 = (C2998) obj;
            if (this.f9492.equals(c2998.f9492) && this.f9494.equals(c2998.f9494) && this.f9490 == c2998.f9490 && this.f9491 == c2998.f9491 && this.f9493.equals(c2998.f9493) && this.f9489.equals(c2998.f9489) && this.f9488.equals(c2998.f9488) && this.f9495.equals(c2998.f9495)) {
                return true;
            }
        }
        return false;
    }

    @Override // p286.InterfaceC8393
    public final int hashCode() {
        if (this.f9496 == 0) {
            int iHashCode = this.f9492.hashCode();
            this.f9496 = iHashCode;
            int iHashCode2 = ((((this.f9494.hashCode() + (iHashCode * 31)) * 31) + this.f9491) * 31) + this.f9490;
            this.f9496 = iHashCode2;
            int iHashCode3 = this.f9493.hashCode() + (iHashCode2 * 31);
            this.f9496 = iHashCode3;
            int iHashCode4 = this.f9489.hashCode() + (iHashCode3 * 31);
            this.f9496 = iHashCode4;
            int iHashCode5 = this.f9488.hashCode() + (iHashCode4 * 31);
            this.f9496 = iHashCode5;
            this.f9496 = this.f9495.f23272.hashCode() + (iHashCode5 * 31);
        }
        return this.f9496;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f9492 + ", width=" + this.f9491 + ", height=" + this.f9490 + ", resourceClass=" + this.f9489 + ", transcodeClass=" + this.f9488 + ", signature=" + this.f9494 + ", hashCode=" + this.f9496 + ", transformations=" + this.f9493 + ", options=" + this.f9495 + '}';
    }

    @Override // p286.InterfaceC8393
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6468(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
