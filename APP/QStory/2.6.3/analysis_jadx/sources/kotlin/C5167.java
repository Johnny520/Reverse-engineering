package kotlin;

import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: kotlin.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5167 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f14728;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f14729;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f14730;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f14731;

    static {
        new C5167(2, 3, 21);
    }

    public C5167(int i, int i2, int i3) {
        this.f14731 = i;
        this.f14729 = i2;
        this.f14730 = i3;
        if (i >= 0 && i < 256 && i2 >= 0 && i2 < 256 && i3 >= 0 && i3 < 256) {
            this.f14728 = (i << 16) + (i2 << 8) + i3;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + i2 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + i3).toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C5167 c5167 = (C5167) obj;
        c5167.getClass();
        return this.f14728 - c5167.f14728;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C5167 c5167 = obj instanceof C5167 ? (C5167) obj : null;
        return c5167 != null && this.f14728 == c5167.f14728;
    }

    public final int hashCode() {
        return this.f14728;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14731);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb.append(this.f14729);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb.append(this.f14730);
        return sb.toString();
    }
}
