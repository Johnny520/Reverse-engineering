package kotlin;

import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: kotlin.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5999 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f15073;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f15074;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f15075;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f15076;

    static {
        new C5999(2, 3, 21);
    }

    public C5999(int i, int i2, int i3) {
        this.f15076 = i;
        this.f15074 = i2;
        this.f15075 = i3;
        if (i >= 0 && i < 256 && i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256) {
            this.f15073 = (i << 16) + (i2 << 8) + i3;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + i2 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + i3).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C5999 c5999 = (C5999) obj;
        c5999.getClass();
        return this.f15073 - c5999.f15073;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C5999 c5999 = obj instanceof C5999 ? (C5999) obj : null;
        return c5999 != null && this.f15073 == c5999.f15073;
    }

    public final int hashCode() {
        return this.f15073;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15076);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb.append(this.f15074);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb.append(this.f15075);
        return sb.toString();
    }
}
