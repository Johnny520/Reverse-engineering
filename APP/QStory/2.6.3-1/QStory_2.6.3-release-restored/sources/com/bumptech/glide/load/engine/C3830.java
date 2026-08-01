package com.bumptech.glide.load.engine;

import java.security.MessageDigest;
import java.util.Map;
import p238.AbstractC8818;
import p302.C9226;
import p302.InterfaceC9222;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3830 implements InterfaceC9222 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Class f9833;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Class f9834;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f9835;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f9836;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f9837;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Map f9838;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC9222 f9839;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C9226 f9840;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f9841;

    public C3830(Object obj, InterfaceC9222 interfaceC9222, int i, int i2, Map map, Class cls, Class cls2, C9226 c9226) {
        AbstractC8818.m14028(obj, "Argument must not be null");
        this.f9837 = obj;
        AbstractC8818.m14028(interfaceC9222, "Signature must not be null");
        this.f9839 = interfaceC9222;
        this.f9836 = i;
        this.f9835 = i2;
        AbstractC8818.m14028(map, "Argument must not be null");
        this.f9838 = map;
        AbstractC8818.m14028(cls, "Resource class must not be null");
        this.f9834 = cls;
        AbstractC8818.m14028(cls2, "Transcode class must not be null");
        this.f9833 = cls2;
        AbstractC8818.m14028(c9226, "Argument must not be null");
        this.f9840 = c9226;
    }

    @Override // p302.InterfaceC9222
    public final boolean equals(Object obj) {
        if (obj instanceof C3830) {
            C3830 c3830 = (C3830) obj;
            if (this.f9837.equals(c3830.f9837) && this.f9839.equals(c3830.f9839) && this.f9835 == c3830.f9835 && this.f9836 == c3830.f9836 && this.f9838.equals(c3830.f9838) && this.f9834.equals(c3830.f9834) && this.f9833.equals(c3830.f9833) && this.f9840.equals(c3830.f9840)) {
                return true;
            }
        }
        return false;
    }

    @Override // p302.InterfaceC9222
    public final int hashCode() {
        if (this.f9841 == 0) {
            int iHashCode = this.f9837.hashCode();
            this.f9841 = iHashCode;
            int iHashCode2 = ((((this.f9839.hashCode() + (iHashCode * 31)) * 31) + this.f9836) * 31) + this.f9835;
            this.f9841 = iHashCode2;
            int iHashCode3 = this.f9838.hashCode() + (iHashCode2 * 31);
            this.f9841 = iHashCode3;
            int iHashCode4 = this.f9834.hashCode() + (iHashCode3 * 31);
            this.f9841 = iHashCode4;
            int iHashCode5 = this.f9833.hashCode() + (iHashCode4 * 31);
            this.f9841 = iHashCode5;
            this.f9841 = this.f9840.f23617.hashCode() + (iHashCode5 * 31);
        }
        return this.f9841;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f9837 + ", width=" + this.f9836 + ", height=" + this.f9835 + ", resourceClass=" + this.f9834 + ", transcodeClass=" + this.f9833 + ", signature=" + this.f9839 + ", hashCode=" + this.f9841 + ", transformations=" + this.f9838 + ", options=" + this.f9840 + '}';
    }

    @Override // p302.InterfaceC9222
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7028(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
