package p070;

import androidx.activity.AbstractC0053;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: 飘花落叶言世楪哲兰子苏.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6904 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C6904 f18422 = new C6904(256, 256, 256);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f18423;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f18424;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f18425;

    public C6904(int i, int i2, int i3) {
        this.f18425 = i;
        this.f18424 = i2;
        this.f18423 = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6904)) {
            return false;
        }
        C6904 c6904 = (C6904) obj;
        return this.f18425 == c6904.f18425 && this.f18424 == c6904.f18424 && this.f18423 == c6904.f18423;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18423) + AbstractC0053.m143(this.f18424, Integer.hashCode(this.f18425) * 31, 31);
    }

    public final String toString() {
        int i = this.f18424;
        int i2 = this.f18423;
        int i3 = this.f18425;
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
