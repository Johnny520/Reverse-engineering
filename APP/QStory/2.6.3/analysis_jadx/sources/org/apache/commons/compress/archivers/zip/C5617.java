package org.apache.commons.compress.archivers.zip;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5617 implements Cloneable {

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
        if (!(obj instanceof C5617)) {
            return false;
        }
        C5617 c5617 = (C5617) obj;
        return c5617.f15480 == this.f15480 && c5617.f15477 == this.f15477 && c5617.f15481 == this.f15481 && c5617.f15479 == this.f15479;
    }

    public final int hashCode() {
        return (((((((this.f15480 ? 1 : 0) * 17) + (this.f15477 ? 1 : 0)) * 13) + (this.f15481 ? 1 : 0)) * 7) + (this.f15479 ? 1 : 0)) * 3;
    }
}
