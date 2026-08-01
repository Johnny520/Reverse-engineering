package p086;

import androidx.activity.AbstractC0900;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: 飘花落叶言世楪哲兰子苏.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7734 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7734 f18762 = new C7734(256, 256, 256);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f18763;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f18764;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f18765;

    public C7734(int i, int i2, int i3) {
        this.f18765 = i;
        this.f18764 = i2;
        this.f18763 = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7734)) {
            return false;
        }
        C7734 c7734 = (C7734) obj;
        return this.f18765 == c7734.f18765 && this.f18764 == c7734.f18764 && this.f18763 == c7734.f18763;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18763) + AbstractC0900.m704(this.f18764, Integer.hashCode(this.f18765) * 31, 31);
    }

    public final String toString() {
        int i = this.f18764;
        int i2 = this.f18763;
        int i3 = this.f18765;
        if (i2 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(i3);
            sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            sb.append(i);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i3);
        sb2.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb2.append(i);
        sb2.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb2.append(i2);
        return sb2.toString();
    }
}
