package org.apache.commons.compress.archivers.zip;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5616 implements Cloneable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f15476;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f15477;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f15478;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f15479;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f15480;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f15481;

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new UnsupportedOperationException("GeneralPurposeBit is not Cloneable?", e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5616)) {
            return false;
        }
        C5616 c5616 = (C5616) obj;
        return c5616.f15480 == this.f15480 && c5616.f15477 == this.f15477 && c5616.f15481 == this.f15481 && c5616.f15479 == this.f15479;
    }

    public final int hashCode() {
        return (((((((this.f15480 ? 1 : 0) * 17) + (this.f15477 ? 1 : 0)) * 13) + (this.f15481 ? 1 : 0)) * 7) + (this.f15479 ? 1 : 0)) * 3;
    }
}
