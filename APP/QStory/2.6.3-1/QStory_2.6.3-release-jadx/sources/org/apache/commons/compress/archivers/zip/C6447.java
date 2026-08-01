package org.apache.commons.compress.archivers.zip;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6447 implements Cloneable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int f15821;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public boolean f15822;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f15823;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f15824;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f15825;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public boolean f15826;

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new UnsupportedOperationException("GeneralPurposeBit is not Cloneable?", e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6447)) {
            return false;
        }
        C6447 c6447 = (C6447) obj;
        return c6447.f15825 == this.f15825 && c6447.f15822 == this.f15822 && c6447.f15826 == this.f15826 && c6447.f15824 == this.f15824;
    }

    public final int hashCode() {
        return (((((((this.f15825 ? 1 : 0) * 17) + (this.f15822 ? 1 : 0)) * 13) + (this.f15826 ? 1 : 0)) * 7) + (this.f15824 ? 1 : 0)) * 3;
    }
}
